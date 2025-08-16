package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPSBITEM</B>应用故事板项目 模型传输对象
 * <P>
 * 应用故事板项目模型，定义应用故事板的项成员
 */
public class PSAppSBItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppSBItem(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用故事板项目的代码标识，需在所属应用故事板中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSAppSBItem codename(String codeName){
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
    public PSAppSBItem createdate(String createDate){
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
    public PSAppSBItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ITEMTAG</B>&nbsp;项标记，指定应用故事板项目的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG = "itemtag";

    /**
     * 设置 项标记，详细说明：{@link #FIELD_ITEMTAG}
     * 
     * @param itemTag
     * 
     */
    @JsonProperty(FIELD_ITEMTAG)
    public void setItemTag(String itemTag){
        this.set(FIELD_ITEMTAG, itemTag);
    }
    
    /**
     * 获取 项标记  
     * @return
     */
    @JsonIgnore
    public String getItemTag(){
        Object objValue = this.get(FIELD_ITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTagDirty(){
        if(this.contains(FIELD_ITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记
     */
    @JsonIgnore
    public void resetItemTag(){
        this.reset(FIELD_ITEMTAG);
    }

    /**
     * 设置 项标记，详细说明：{@link #FIELD_ITEMTAG}
     * <P>
     * 等同 {@link #setItemTag}
     * @param itemTag
     */
    @JsonIgnore
    public PSAppSBItem itemtag(String itemTag){
        this.setItemTag(itemTag);
        return this;
    }

    /**
     * <B>ITEMTAG2</B>&nbsp;项标记2，指定应用故事板项目的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG2 = "itemtag2";

    /**
     * 设置 项标记2，详细说明：{@link #FIELD_ITEMTAG2}
     * 
     * @param itemTag2
     * 
     */
    @JsonProperty(FIELD_ITEMTAG2)
    public void setItemTag2(String itemTag2){
        this.set(FIELD_ITEMTAG2, itemTag2);
    }
    
    /**
     * 获取 项标记2  
     * @return
     */
    @JsonIgnore
    public String getItemTag2(){
        Object objValue = this.get(FIELD_ITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag2Dirty(){
        if(this.contains(FIELD_ITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记2
     */
    @JsonIgnore
    public void resetItemTag2(){
        this.reset(FIELD_ITEMTAG2);
    }

    /**
     * 设置 项标记2，详细说明：{@link #FIELD_ITEMTAG2}
     * <P>
     * 等同 {@link #setItemTag2}
     * @param itemTag2
     */
    @JsonIgnore
    public PSAppSBItem itemtag2(String itemTag2){
        this.setItemTag2(itemTag2);
        return this;
    }

    /**
     * <B>ITEMTAG3</B>&nbsp;项标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG3 = "itemtag3";

    /**
     * 设置 项标记3
     * 
     * @param itemTag3
     * 
     */
    @JsonProperty(FIELD_ITEMTAG3)
    public void setItemTag3(String itemTag3){
        this.set(FIELD_ITEMTAG3, itemTag3);
    }
    
    /**
     * 获取 项标记3  
     * @return
     */
    @JsonIgnore
    public String getItemTag3(){
        Object objValue = this.get(FIELD_ITEMTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag3Dirty(){
        if(this.contains(FIELD_ITEMTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记3
     */
    @JsonIgnore
    public void resetItemTag3(){
        this.reset(FIELD_ITEMTAG3);
    }

    /**
     * 设置 项标记3
     * <P>
     * 等同 {@link #setItemTag3}
     * @param itemTag3
     */
    @JsonIgnore
    public PSAppSBItem itemtag3(String itemTag3){
        this.setItemTag3(itemTag3);
        return this;
    }

    /**
     * <B>ITEMTAG4</B>&nbsp;项标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG4 = "itemtag4";

    /**
     * 设置 项标记4
     * 
     * @param itemTag4
     * 
     */
    @JsonProperty(FIELD_ITEMTAG4)
    public void setItemTag4(String itemTag4){
        this.set(FIELD_ITEMTAG4, itemTag4);
    }
    
    /**
     * 获取 项标记4  
     * @return
     */
    @JsonIgnore
    public String getItemTag4(){
        Object objValue = this.get(FIELD_ITEMTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag4Dirty(){
        if(this.contains(FIELD_ITEMTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记4
     */
    @JsonIgnore
    public void resetItemTag4(){
        this.reset(FIELD_ITEMTAG4);
    }

    /**
     * 设置 项标记4
     * <P>
     * 等同 {@link #setItemTag4}
     * @param itemTag4
     */
    @JsonIgnore
    public PSAppSBItem itemtag4(String itemTag4){
        this.setItemTag4(itemTag4);
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;项类型，指定应用故事板项目的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppStoryBoardItemType} 
     */
    public final static String FIELD_ITEMTYPE = "itemtype";

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * 
     * @param itemType
     * 
     */
    @JsonProperty(FIELD_ITEMTYPE)
    public void setItemType(String itemType){
        this.set(FIELD_ITEMTYPE, itemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getItemType(){
        Object objValue = this.get(FIELD_ITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTypeDirty(){
        if(this.contains(FIELD_ITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetItemType(){
        this.reset(FIELD_ITEMTYPE);
    }

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSAppSBItem itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

     /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSAppSBItem itemtype(net.ibizsys.psmodel.core.util.PSModelEnums.AppStoryBoardItemType itemType){
        if(itemType == null){
            this.setItemType(null);
        }
        else{
            this.setItemType(itemType.value);
        }
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左坐标，指定应用故事项在设计界面的图元的左上角X值，未定义时为【0】
     */
    public final static String FIELD_LEFTPOS = "leftpos";

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * 
     * @param leftPos
     * 
     */
    @JsonProperty(FIELD_LEFTPOS)
    public void setLeftPos(Integer leftPos){
        this.set(FIELD_LEFTPOS, leftPos);
    }
    
    /**
     * 获取 左坐标  
     * @return
     */
    @JsonIgnore
    public Integer getLeftPos(){
        Object objValue = this.get(FIELD_LEFTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 左坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeftPosDirty(){
        if(this.contains(FIELD_LEFTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左坐标
     */
    @JsonIgnore
    public void resetLeftPos(){
        this.reset(FIELD_LEFTPOS);
    }

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * <P>
     * 等同 {@link #setLeftPos}
     * @param leftPos
     */
    @JsonIgnore
    public PSAppSBItem leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
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
    public PSAppSBItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPSBITEMID</B>&nbsp;应用故事板项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPSBITEMID = "psappsbitemid";

    /**
     * 设置 应用故事板项标识
     * 
     * @param pSAppSBItemId
     * 
     */
    @JsonProperty(FIELD_PSAPPSBITEMID)
    public void setPSAppSBItemId(String pSAppSBItemId){
        this.set(FIELD_PSAPPSBITEMID, pSAppSBItemId);
    }
    
    /**
     * 获取 应用故事板项标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppSBItemId(){
        Object objValue = this.get(FIELD_PSAPPSBITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用故事板项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppSBItemIdDirty(){
        if(this.contains(FIELD_PSAPPSBITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用故事板项标识
     */
    @JsonIgnore
    public void resetPSAppSBItemId(){
        this.reset(FIELD_PSAPPSBITEMID);
    }

    /**
     * 设置 应用故事板项标识
     * <P>
     * 等同 {@link #setPSAppSBItemId}
     * @param pSAppSBItemId
     */
    @JsonIgnore
    public PSAppSBItem psappsbitemid(String pSAppSBItemId){
        this.setPSAppSBItemId(pSAppSBItemId);
        return this;
    }

    /**
     * <B>PSAPPSBITEMNAME</B>&nbsp;项名称，指定应用故事板项目的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPSBITEMNAME = "psappsbitemname";

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSAPPSBITEMNAME}
     * 
     * @param pSAppSBItemName
     * 
     */
    @JsonProperty(FIELD_PSAPPSBITEMNAME)
    public void setPSAppSBItemName(String pSAppSBItemName){
        this.set(FIELD_PSAPPSBITEMNAME, pSAppSBItemName);
    }
    
    /**
     * 获取 项名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppSBItemName(){
        Object objValue = this.get(FIELD_PSAPPSBITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppSBItemNameDirty(){
        if(this.contains(FIELD_PSAPPSBITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项名称
     */
    @JsonIgnore
    public void resetPSAppSBItemName(){
        this.reset(FIELD_PSAPPSBITEMNAME);
    }

    /**
     * 设置 项名称，详细说明：{@link #FIELD_PSAPPSBITEMNAME}
     * <P>
     * 等同 {@link #setPSAppSBItemName}
     * @param pSAppSBItemName
     */
    @JsonIgnore
    public PSAppSBItem psappsbitemname(String pSAppSBItemName){
        this.setPSAppSBItemName(pSAppSBItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppSBItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppSBItemName(strName);
    }

    @JsonIgnore
    public PSAppSBItem name(String strName){
        this.setPSAppSBItemName(strName);
        return this;
    }

    /**
     * <B>PSAPPSTORYBOARDID</B>&nbsp;应用故事板，指定应用故事板项目所属的应用故事板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppStoryBoard} 
     */
    public final static String FIELD_PSAPPSTORYBOARDID = "psappstoryboardid";

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDID}
     * 
     * @param pSAppStoryBoardId
     * 
     */
    @JsonProperty(FIELD_PSAPPSTORYBOARDID)
    public void setPSAppStoryBoardId(String pSAppStoryBoardId){
        this.set(FIELD_PSAPPSTORYBOARDID, pSAppStoryBoardId);
    }
    
    /**
     * 获取 应用故事板  
     * @return
     */
    @JsonIgnore
    public String getPSAppStoryBoardId(){
        Object objValue = this.get(FIELD_PSAPPSTORYBOARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用故事板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppStoryBoardIdDirty(){
        if(this.contains(FIELD_PSAPPSTORYBOARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用故事板
     */
    @JsonIgnore
    public void resetPSAppStoryBoardId(){
        this.reset(FIELD_PSAPPSTORYBOARDID);
    }

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDID}
     * <P>
     * 等同 {@link #setPSAppStoryBoardId}
     * @param pSAppStoryBoardId
     */
    @JsonIgnore
    public PSAppSBItem psappstoryboardid(String pSAppStoryBoardId){
        this.setPSAppStoryBoardId(pSAppStoryBoardId);
        return this;
    }

    /**
     * 设置 应用故事板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppStoryBoardId}
     * @param pSAppStoryBoard 引用对象
     */
    @JsonIgnore
    public PSAppSBItem psappstoryboardid(PSAppStoryBoard pSAppStoryBoard){
        if(pSAppStoryBoard == null){
            this.setPSAppStoryBoardId(null);
            this.setPSAppStoryBoardName(null);
            this.setPSSysAppId(null);
        }
        else{
            this.setPSAppStoryBoardId(pSAppStoryBoard.getPSAppStoryBoardId());
            this.setPSAppStoryBoardName(pSAppStoryBoard.getPSAppStoryBoardName());
            this.setPSSysAppId(pSAppStoryBoard.getPSSysAppId());
        }
        return this;
    }

    /**
     * <B>PSAPPSTORYBOARDNAME</B>&nbsp;应用故事板，指定应用故事板项目所属的应用故事板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPSTORYBOARDID}
     */
    public final static String FIELD_PSAPPSTORYBOARDNAME = "psappstoryboardname";

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDNAME}
     * 
     * @param pSAppStoryBoardName
     * 
     */
    @JsonProperty(FIELD_PSAPPSTORYBOARDNAME)
    public void setPSAppStoryBoardName(String pSAppStoryBoardName){
        this.set(FIELD_PSAPPSTORYBOARDNAME, pSAppStoryBoardName);
    }
    
    /**
     * 获取 应用故事板  
     * @return
     */
    @JsonIgnore
    public String getPSAppStoryBoardName(){
        Object objValue = this.get(FIELD_PSAPPSTORYBOARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用故事板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppStoryBoardNameDirty(){
        if(this.contains(FIELD_PSAPPSTORYBOARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用故事板
     */
    @JsonIgnore
    public void resetPSAppStoryBoardName(){
        this.reset(FIELD_PSAPPSTORYBOARDNAME);
    }

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDNAME}
     * <P>
     * 等同 {@link #setPSAppStoryBoardName}
     * @param pSAppStoryBoardName
     */
    @JsonIgnore
    public PSAppSBItem psappstoryboardname(String pSAppStoryBoardName){
        this.setPSAppStoryBoardName(pSAppStoryBoardName);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图，应用故事板项目类型为【应用视图】时指定关联的应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSAppSBItem psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppSBItem psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图，应用故事板项目类型为【应用视图】时指定关联的应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSAppSBItem psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSDYNAINSTID</B>&nbsp;动态实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNAINSTID = "psdynainstid";

    /**
     * 设置 动态实例标识
     * 
     * @param pSDynaInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTID)
    public void setPSDynaInstId(String pSDynaInstId){
        this.set(FIELD_PSDYNAINSTID, pSDynaInstId);
    }
    
    /**
     * 获取 动态实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstId(){
        Object objValue = this.get(FIELD_PSDYNAINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstIdDirty(){
        if(this.contains(FIELD_PSDYNAINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标识
     */
    @JsonIgnore
    public void resetPSDynaInstId(){
        this.reset(FIELD_PSDYNAINSTID);
    }

    /**
     * 设置 动态实例标识
     * <P>
     * 等同 {@link #setPSDynaInstId}
     * @param pSDynaInstId
     */
    @JsonIgnore
    public PSAppSBItem psdynainstid(String pSDynaInstId){
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;应用标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPSTORYBOARDID}
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 应用标识
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 应用标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标识
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 应用标识
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppSBItem pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统需求项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统需求项  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSAppSBItem pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统需求项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSAppSBItem pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统需求项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统需求项  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSAppSBItem pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUSECASEID</B>&nbsp;系统用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUseCase} 
     */
    public final static String FIELD_PSSYSUSECASEID = "pssysusecaseid";

    /**
     * 设置 系统用例
     * 
     * @param pSSysUseCaseId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASEID)
    public void setPSSysUseCaseId(String pSSysUseCaseId){
        this.set(FIELD_PSSYSUSECASEID, pSSysUseCaseId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercaseid", pSSysUseCaseId);
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseId(){
        Object objValue = this.get(FIELD_PSSYSUSECASEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercaseid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty(){
        if(this.contains(FIELD_PSSYSUSECASEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercaseid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercaseid");
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSAppSBItem pssysusecaseid(String pSSysUseCaseId){
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    /**
     * 设置 系统用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCase 引用对象
     */
    @JsonIgnore
    public PSAppSBItem pssysusecaseid(PSSysUseCase pSSysUseCase){
        if(pSSysUseCase == null){
            this.setPSSysUseCaseId(null);
            this.setPSSysUseCaseName(null);
        }
        else{
            this.setPSSysUseCaseId(pSSysUseCase.getPSSysUseCaseId());
            this.setPSSysUseCaseName(pSSysUseCase.getPSSysUseCaseName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseId(){
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseId(String pSSysUserCaseId){
        this.setPSSysUseCaseId(pSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseIdDirty(){
        return this.isPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseId(){
        this.resetPSSysUseCaseId();
    }

    /**
     * <B>PSSYSUSECASENAME</B>&nbsp;系统用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSECASEID}
     */
    public final static String FIELD_PSSYSUSECASENAME = "pssysusecasename";

    /**
     * 设置 系统用例
     * 
     * @param pSSysUseCaseName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASENAME)
    public void setPSSysUseCaseName(String pSSysUseCaseName){
        this.set(FIELD_PSSYSUSECASENAME, pSSysUseCaseName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercasename", pSSysUseCaseName);
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseName(){
        Object objValue = this.get(FIELD_PSSYSUSECASENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercasename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty(){
        if(this.contains(FIELD_PSSYSUSECASENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercasename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasename");
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSAppSBItem pssysusecasename(String pSSysUseCaseName){
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseName(){
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseName(String pSSysUserCaseName){
        this.setPSSysUseCaseName(pSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseNameDirty(){
        return this.isPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseName(){
        this.resetPSSysUseCaseName();
    }

    /**
     * <B>ROOTITEM</B>&nbsp;根项目，指定应用故事板项目是否为所属故事板的跟项目，应用故事板从根项目开始演进，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ROOTITEM = "rootitem";

    /**
     * 设置 根项目，详细说明：{@link #FIELD_ROOTITEM}
     * 
     * @param rootItem
     * 
     */
    @JsonProperty(FIELD_ROOTITEM)
    public void setRootItem(Integer rootItem){
        this.set(FIELD_ROOTITEM, rootItem);
    }
    
    /**
     * 获取 根项目  
     * @return
     */
    @JsonIgnore
    public Integer getRootItem(){
        Object objValue = this.get(FIELD_ROOTITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 根项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRootItemDirty(){
        if(this.contains(FIELD_ROOTITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 根项目
     */
    @JsonIgnore
    public void resetRootItem(){
        this.reset(FIELD_ROOTITEM);
    }

    /**
     * 设置 根项目，详细说明：{@link #FIELD_ROOTITEM}
     * <P>
     * 等同 {@link #setRootItem}
     * @param rootItem
     */
    @JsonIgnore
    public PSAppSBItem rootitem(Integer rootItem){
        this.setRootItem(rootItem);
        return this;
    }

     /**
     * 设置 根项目，详细说明：{@link #FIELD_ROOTITEM}
     * <P>
     * 等同 {@link #setRootItem}
     * @param rootItem
     */
    @JsonIgnore
    public PSAppSBItem rootitem(Boolean rootItem){
        if(rootItem == null){
            this.setRootItem(null);
        }
        else{
            this.setRootItem(rootItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TOPPOS</B>&nbsp;上坐标，指定应用故事项在设计界面的图元的左上角Y值，未定义时为【0】
     */
    public final static String FIELD_TOPPOS = "toppos";

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * 
     * @param topPos
     * 
     */
    @JsonProperty(FIELD_TOPPOS)
    public void setTopPos(Integer topPos){
        this.set(FIELD_TOPPOS, topPos);
    }
    
    /**
     * 获取 上坐标  
     * @return
     */
    @JsonIgnore
    public Integer getTopPos(){
        Object objValue = this.get(FIELD_TOPPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 上坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopPosDirty(){
        if(this.contains(FIELD_TOPPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上坐标
     */
    @JsonIgnore
    public void resetTopPos(){
        this.reset(FIELD_TOPPOS);
    }

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * <P>
     * 等同 {@link #setTopPos}
     * @param topPos
     */
    @JsonIgnore
    public PSAppSBItem toppos(Integer topPos){
        this.setTopPos(topPos);
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
    public PSAppSBItem updatedate(String updateDate){
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
    public PSAppSBItem updateman(String updateMan){
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
    public PSAppSBItem usercat(String userCat){
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
    public PSAppSBItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERFLAG</B>&nbsp;用户定义项，指定应用故事板项目是否为用户自定义添加，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERFLAG = "userflag";

    /**
     * 设置 用户定义项，详细说明：{@link #FIELD_USERFLAG}
     * 
     * @param userFlag
     * 
     */
    @JsonProperty(FIELD_USERFLAG)
    public void setUserFlag(Integer userFlag){
        this.set(FIELD_USERFLAG, userFlag);
    }
    
    /**
     * 获取 用户定义项  
     * @return
     */
    @JsonIgnore
    public Integer getUserFlag(){
        Object objValue = this.get(FIELD_USERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户定义项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserFlagDirty(){
        if(this.contains(FIELD_USERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户定义项
     */
    @JsonIgnore
    public void resetUserFlag(){
        this.reset(FIELD_USERFLAG);
    }

    /**
     * 设置 用户定义项，详细说明：{@link #FIELD_USERFLAG}
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSAppSBItem userflag(Integer userFlag){
        this.setUserFlag(userFlag);
        return this;
    }

     /**
     * 设置 用户定义项，详细说明：{@link #FIELD_USERFLAG}
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSAppSBItem userflag(Boolean userFlag){
        if(userFlag == null){
            this.setUserFlag(null);
        }
        else{
            this.setUserFlag(userFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSAppSBItem usertag(String userTag){
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
    public PSAppSBItem usertag2(String userTag2){
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
    public PSAppSBItem usertag3(String userTag3){
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
    public PSAppSBItem usertag4(String userTag4){
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
    public PSAppSBItem validflag(Integer validFlag){
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
    public PSAppSBItem validflag(Boolean validFlag){
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
        return this.getPSAppSBItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppSBItemId(strValue);
    }

    @JsonIgnore
    public PSAppSBItem id(String strValue){
        this.setPSAppSBItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppSBItem){
            PSAppSBItem model = (PSAppSBItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
