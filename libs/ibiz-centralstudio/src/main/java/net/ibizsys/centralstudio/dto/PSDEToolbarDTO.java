package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETOOLBAR</B>实体工具栏 模型传输对象
 * <P>
 * 工具栏部件模型，包含支持层级的工具栏项。工具栏部件模型是通用的命令栏模型，还可应用在菜单（普通及上下文菜单）等场合
 */
public class PSDEToolbarDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEToolbarDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定工具栏的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEToolbarDTO codename(String codeName){
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
    public PSDEToolbarDTO createdate(Timestamp createDate){
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
    public PSDEToolbarDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ICONALIGN</B>&nbsp;默认图标位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ButtonIconAlign} 
     */
    public final static String FIELD_ICONALIGN = "iconalign";

    /**
     * 设置 默认图标位置
     * 
     * @param iconAlign
     * 
     */
    @JsonProperty(FIELD_ICONALIGN)
    public void setIconAlign(String iconAlign){
        this.set(FIELD_ICONALIGN, iconAlign);
    }
    
    /**
     * 获取 默认图标位置  
     * @return
     */
    @JsonIgnore
    public String getIconAlign(){
        Object objValue = this.get(FIELD_ICONALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认图标位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconAlignDirty(){
        if(this.contains(FIELD_ICONALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认图标位置
     */
    @JsonIgnore
    public void resetIconAlign(){
        this.reset(FIELD_ICONALIGN);
    }

    /**
     * 设置 默认图标位置
     * <P>
     * 等同 {@link #setIconAlign}
     * @param iconAlign
     */
    @JsonIgnore
    public PSDEToolbarDTO iconalign(String iconAlign){
        this.setIconAlign(iconAlign);
        return this;
    }

     /**
     * 设置 默认图标位置
     * <P>
     * 等同 {@link #setIconAlign}
     * @param iconAlign
     */
    @JsonIgnore
    public PSDEToolbarDTO iconalign(net.ibizsys.model.PSModelEnums.ButtonIconAlign iconAlign){
        if(iconAlign == null){
            this.setIconAlign(null);
        }
        else{
            this.setIconAlign(iconAlign.value);
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
    public PSDEToolbarDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端工具栏，指定工具栏部件是否为移动端专用部件，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端工具栏，详细说明：{@link #FIELD_MOBFLAG}
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端工具栏  
     * @return
     */
    @JsonIgnore
    public Integer getMobFlag(){
        Object objValue = this.get(FIELD_MOBFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFlagDirty(){
        if(this.contains(FIELD_MOBFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端工具栏
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端工具栏，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSDEToolbarDTO mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
        return this;
    }

     /**
     * 设置 移动端工具栏，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSDEToolbarDTO mobflag(Boolean mobFlag){
        if(mobFlag == null){
            this.setMobFlag(null);
        }
        else{
            this.setMobFlag(mobFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPID</B>&nbsp;实体界面行为组2，指定工具栏界面行为组占位2绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * 
     * @param no2PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPID)
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId){
        this.set(FIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO2PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组2
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupId(){
        this.reset(FIELD_NO2PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param no2PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO no2psdeuagroupid(String no2PSDEUAGroupId){
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo2PSDEUAGroupId(null);
            this.setNo2PSDEUAGroupName(null);
        }
        else{
            this.setNo2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPNAME</B>&nbsp;实体界面行为组2，指定工具栏界面行为组占位2绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEUAGROUPID}
     */
    public final static String FIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * 
     * @param no2PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPNAME)
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName){
        this.set(FIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO2PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组2
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupName(){
        this.reset(FIELD_NO2PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupName}
     * @param no2PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO no2psdeuagroupname(String no2PSDEUAGroupName){
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO3PSDEUAGROUPID</B>&nbsp;实体界面行为组3，指定工具栏界面行为组占位3绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO3PSDEUAGROUPID = "no3psdeuagroupid";

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPID}
     * 
     * @param no3PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO3PSDEUAGROUPID)
    public void setNo3PSDEUAGroupId(String no3PSDEUAGroupId){
        this.set(FIELD_NO3PSDEUAGROUPID, no3PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO3PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO3PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组3
     */
    @JsonIgnore
    public void resetNo3PSDEUAGroupId(){
        this.reset(FIELD_NO3PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo3PSDEUAGroupId}
     * @param no3PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO no3psdeuagroupid(String no3PSDEUAGroupId){
        this.setNo3PSDEUAGroupId(no3PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo3PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO no3psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo3PSDEUAGroupId(null);
            this.setNo3PSDEUAGroupName(null);
        }
        else{
            this.setNo3PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo3PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO3PSDEUAGROUPNAME</B>&nbsp;实体界面行为组3，指定工具栏界面行为组占位3绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3PSDEUAGROUPID}
     */
    public final static String FIELD_NO3PSDEUAGROUPNAME = "no3psdeuagroupname";

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPNAME}
     * 
     * @param no3PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO3PSDEUAGROUPNAME)
    public void setNo3PSDEUAGroupName(String no3PSDEUAGroupName){
        this.set(FIELD_NO3PSDEUAGROUPNAME, no3PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO3PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO3PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组3
     */
    @JsonIgnore
    public void resetNo3PSDEUAGroupName(){
        this.reset(FIELD_NO3PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo3PSDEUAGroupName}
     * @param no3PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO no3psdeuagroupname(String no3PSDEUAGroupName){
        this.setNo3PSDEUAGroupName(no3PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO4PSDEUAGROUPID</B>&nbsp;实体界面行为组4，指定工具栏界面行为组占位4绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO4PSDEUAGROUPID = "no4psdeuagroupid";

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPID}
     * 
     * @param no4PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO4PSDEUAGROUPID)
    public void setNo4PSDEUAGroupId(String no4PSDEUAGroupId){
        this.set(FIELD_NO4PSDEUAGROUPID, no4PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO4PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO4PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组4
     */
    @JsonIgnore
    public void resetNo4PSDEUAGroupId(){
        this.reset(FIELD_NO4PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo4PSDEUAGroupId}
     * @param no4PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO no4psdeuagroupid(String no4PSDEUAGroupId){
        this.setNo4PSDEUAGroupId(no4PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo4PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO no4psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo4PSDEUAGroupId(null);
            this.setNo4PSDEUAGroupName(null);
        }
        else{
            this.setNo4PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo4PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO4PSDEUAGROUPNAME</B>&nbsp;实体界面行为组4，指定工具栏界面行为组占位4绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO4PSDEUAGROUPID}
     */
    public final static String FIELD_NO4PSDEUAGROUPNAME = "no4psdeuagroupname";

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPNAME}
     * 
     * @param no4PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO4PSDEUAGROUPNAME)
    public void setNo4PSDEUAGroupName(String no4PSDEUAGroupName){
        this.set(FIELD_NO4PSDEUAGROUPNAME, no4PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO4PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO4PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组4
     */
    @JsonIgnore
    public void resetNo4PSDEUAGroupName(){
        this.reset(FIELD_NO4PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo4PSDEUAGroupName}
     * @param no4PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO no4psdeuagroupname(String no4PSDEUAGroupName){
        this.setNo4PSDEUAGroupName(no4PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO5PSDEUAGROUPID</B>&nbsp;实体界面行为组5，指定工具栏界面行为组占位5绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO5PSDEUAGROUPID = "no5psdeuagroupid";

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPID}
     * 
     * @param no5PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO5PSDEUAGROUPID)
    public void setNo5PSDEUAGroupId(String no5PSDEUAGroupId){
        this.set(FIELD_NO5PSDEUAGROUPID, no5PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组5  
     * @return
     */
    @JsonIgnore
    public String getNo5PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO5PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo5PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO5PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组5
     */
    @JsonIgnore
    public void resetNo5PSDEUAGroupId(){
        this.reset(FIELD_NO5PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo5PSDEUAGroupId}
     * @param no5PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO no5psdeuagroupid(String no5PSDEUAGroupId){
        this.setNo5PSDEUAGroupId(no5PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组5，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo5PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO no5psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo5PSDEUAGroupId(null);
            this.setNo5PSDEUAGroupName(null);
        }
        else{
            this.setNo5PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo5PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO5PSDEUAGROUPNAME</B>&nbsp;实体界面行为组5，指定工具栏界面行为组占位5绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO5PSDEUAGROUPID}
     */
    public final static String FIELD_NO5PSDEUAGROUPNAME = "no5psdeuagroupname";

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPNAME}
     * 
     * @param no5PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO5PSDEUAGROUPNAME)
    public void setNo5PSDEUAGroupName(String no5PSDEUAGroupName){
        this.set(FIELD_NO5PSDEUAGROUPNAME, no5PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组5  
     * @return
     */
    @JsonIgnore
    public String getNo5PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO5PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo5PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO5PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组5
     */
    @JsonIgnore
    public void resetNo5PSDEUAGroupName(){
        this.reset(FIELD_NO5PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo5PSDEUAGroupName}
     * @param no5PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO no5psdeuagroupname(String no5PSDEUAGroupName){
        this.setNo5PSDEUAGroupName(no5PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO6PSDEUAGROUPID</B>&nbsp;实体界面行为组6，指定工具栏界面行为组占位6绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO6PSDEUAGROUPID = "no6psdeuagroupid";

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPID}
     * 
     * @param no6PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO6PSDEUAGROUPID)
    public void setNo6PSDEUAGroupId(String no6PSDEUAGroupId){
        this.set(FIELD_NO6PSDEUAGROUPID, no6PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组6  
     * @return
     */
    @JsonIgnore
    public String getNo6PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO6PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo6PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO6PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组6
     */
    @JsonIgnore
    public void resetNo6PSDEUAGroupId(){
        this.reset(FIELD_NO6PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNo6PSDEUAGroupId}
     * @param no6PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO no6psdeuagroupid(String no6PSDEUAGroupId){
        this.setNo6PSDEUAGroupId(no6PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组6，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo6PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO no6psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNo6PSDEUAGroupId(null);
            this.setNo6PSDEUAGroupName(null);
        }
        else{
            this.setNo6PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNo6PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO6PSDEUAGROUPNAME</B>&nbsp;实体界面行为组6，指定工具栏界面行为组占位6绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO6PSDEUAGROUPID}
     */
    public final static String FIELD_NO6PSDEUAGROUPNAME = "no6psdeuagroupname";

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPNAME}
     * 
     * @param no6PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO6PSDEUAGROUPNAME)
    public void setNo6PSDEUAGroupName(String no6PSDEUAGroupName){
        this.set(FIELD_NO6PSDEUAGROUPNAME, no6PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组6  
     * @return
     */
    @JsonIgnore
    public String getNo6PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO6PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo6PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO6PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组6
     */
    @JsonIgnore
    public void resetNo6PSDEUAGroupName(){
        this.reset(FIELD_NO6PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNo6PSDEUAGroupName}
     * @param no6PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO no6psdeuagroupname(String no6PSDEUAGroupName){
        this.setNo6PSDEUAGroupName(no6PSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定工具栏导部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定工具栏导部件默认附加的部件逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定工具栏所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
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
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEToolbarDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO psdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定工具栏所在的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
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
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEToolbarDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;实体工具栏标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETOOLBARID = "psdetoolbarid";

    /**
     * 设置 实体工具栏标识
     * 
     * @param pSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARID)
    public void setPSDEToolbarId(String pSDEToolbarId){
        this.set(FIELD_PSDETOOLBARID, pSDEToolbarId);
    }
    
    /**
     * 获取 实体工具栏标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarId(){
        Object objValue = this.get(FIELD_PSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工具栏标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarIdDirty(){
        if(this.contains(FIELD_PSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工具栏标识
     */
    @JsonIgnore
    public void resetPSDEToolbarId(){
        this.reset(FIELD_PSDETOOLBARID);
    }

    /**
     * 设置 实体工具栏标识
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbarId
     */
    @JsonIgnore
    public PSDEToolbarDTO psdetoolbarid(String pSDEToolbarId){
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    /**
     * <B>PSDETOOLBARNAME</B>&nbsp;工具栏名称，指定工具栏的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDETOOLBARNAME = "psdetoolbarname";

    /**
     * 设置 工具栏名称，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * 
     * @param pSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARNAME)
    public void setPSDEToolbarName(String pSDEToolbarName){
        this.set(FIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }
    
    /**
     * 获取 工具栏名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEToolbarName(){
        Object objValue = this.get(FIELD_PSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具栏名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEToolbarNameDirty(){
        if(this.contains(FIELD_PSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具栏名称
     */
    @JsonIgnore
    public void resetPSDEToolbarName(){
        this.reset(FIELD_PSDETOOLBARNAME);
    }

    /**
     * 设置 工具栏名称，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setPSDEToolbarName}
     * @param pSDEToolbarName
     */
    @JsonIgnore
    public PSDEToolbarDTO psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEToolbarName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEToolbarName(strName);
    }

    @JsonIgnore
    public PSDEToolbarDTO name(String strName){
        this.setPSDEToolbarName(strName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组，指定工具栏界面行为组占位绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEToolbarDTO psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组，指定工具栏界面行为组占位绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEToolbarDTO psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定实体工具栏所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSDEToolbarDTO psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO psmoduleid(PSModuleDTO pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定实体工具栏所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSDEToolbarDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSDEToolbarDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 默认样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEToolbarDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 默认样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO pssyscssid(PSSysCssDTO pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 默认样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEToolbarDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体工具栏使用的前端模板扩展插件，使用插件类型【工具栏绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEToolbarDTO pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEToolbarDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体工具栏使用的前端模板扩展插件，使用插件类型【工具栏绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEToolbarDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSTOOLBARID</B>&nbsp;平台预置工具栏，指定平台预置工具栏
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTOOLBARID = "pssystoolbarid";

    /**
     * 设置 平台预置工具栏，详细说明：{@link #FIELD_PSSYSTOOLBARID}
     * 
     * @param pSSysToolbarId
     * 
     */
    @JsonProperty(FIELD_PSSYSTOOLBARID)
    public void setPSSysToolbarId(String pSSysToolbarId){
        this.set(FIELD_PSSYSTOOLBARID, pSSysToolbarId);
    }
    
    /**
     * 获取 平台预置工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysToolbarId(){
        Object objValue = this.get(FIELD_PSSYSTOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysToolbarIdDirty(){
        if(this.contains(FIELD_PSSYSTOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置工具栏
     */
    @JsonIgnore
    public void resetPSSysToolbarId(){
        this.reset(FIELD_PSSYSTOOLBARID);
    }

    /**
     * 设置 平台预置工具栏，详细说明：{@link #FIELD_PSSYSTOOLBARID}
     * <P>
     * 等同 {@link #setPSSysToolbarId}
     * @param pSSysToolbarId
     */
    @JsonIgnore
    public PSDEToolbarDTO pssystoolbarid(String pSSysToolbarId){
        this.setPSSysToolbarId(pSSysToolbarId);
        return this;
    }

    /**
     * <B>PSSYSTOOLBARNAME</B>&nbsp;平台预置工具栏，指定平台预置工具栏
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTOOLBARID}
     */
    public final static String FIELD_PSSYSTOOLBARNAME = "pssystoolbarname";

    /**
     * 设置 平台预置工具栏，详细说明：{@link #FIELD_PSSYSTOOLBARNAME}
     * 
     * @param pSSysToolbarName
     * 
     */
    @JsonProperty(FIELD_PSSYSTOOLBARNAME)
    public void setPSSysToolbarName(String pSSysToolbarName){
        this.set(FIELD_PSSYSTOOLBARNAME, pSSysToolbarName);
    }
    
    /**
     * 获取 平台预置工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysToolbarName(){
        Object objValue = this.get(FIELD_PSSYSTOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysToolbarNameDirty(){
        if(this.contains(FIELD_PSSYSTOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置工具栏
     */
    @JsonIgnore
    public void resetPSSysToolbarName(){
        this.reset(FIELD_PSSYSTOOLBARNAME);
    }

    /**
     * 设置 平台预置工具栏，详细说明：{@link #FIELD_PSSYSTOOLBARNAME}
     * <P>
     * 等同 {@link #setPSSysToolbarName}
     * @param pSSysToolbarName
     */
    @JsonIgnore
    public PSDEToolbarDTO pssystoolbarname(String pSSysToolbarName){
        this.setPSSysToolbarName(pSSysToolbarName);
        return this;
    }

    /**
     * <B>TOOLBARSN</B>&nbsp;工具栏编号，指定工具栏的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TOOLBARSN = "toolbarsn";

    /**
     * 设置 工具栏编号，详细说明：{@link #FIELD_TOOLBARSN}
     * 
     * @param toolbarSN
     * 
     */
    @JsonProperty(FIELD_TOOLBARSN)
    public void setToolbarSN(String toolbarSN){
        this.set(FIELD_TOOLBARSN, toolbarSN);
    }
    
    /**
     * 获取 工具栏编号  
     * @return
     */
    @JsonIgnore
    public String getToolbarSN(){
        Object objValue = this.get(FIELD_TOOLBARSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具栏编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isToolbarSNDirty(){
        if(this.contains(FIELD_TOOLBARSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具栏编号
     */
    @JsonIgnore
    public void resetToolbarSN(){
        this.reset(FIELD_TOOLBARSN);
    }

    /**
     * 设置 工具栏编号，详细说明：{@link #FIELD_TOOLBARSN}
     * <P>
     * 等同 {@link #setToolbarSN}
     * @param toolbarSN
     */
    @JsonIgnore
    public PSDEToolbarDTO toolbarsn(String toolbarSN){
        this.setToolbarSN(toolbarSN);
        return this;
    }

    /**
     * <B>TOOLBARSTYLE</B>&nbsp;工具栏样式，指定工具栏的内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ToolbarStyle} 
     */
    public final static String FIELD_TOOLBARSTYLE = "toolbarstyle";

    /**
     * 设置 工具栏样式，详细说明：{@link #FIELD_TOOLBARSTYLE}
     * 
     * @param toolbarStyle
     * 
     */
    @JsonProperty(FIELD_TOOLBARSTYLE)
    public void setToolbarStyle(String toolbarStyle){
        this.set(FIELD_TOOLBARSTYLE, toolbarStyle);
    }
    
    /**
     * 获取 工具栏样式  
     * @return
     */
    @JsonIgnore
    public String getToolbarStyle(){
        Object objValue = this.get(FIELD_TOOLBARSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具栏样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isToolbarStyleDirty(){
        if(this.contains(FIELD_TOOLBARSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具栏样式
     */
    @JsonIgnore
    public void resetToolbarStyle(){
        this.reset(FIELD_TOOLBARSTYLE);
    }

    /**
     * 设置 工具栏样式，详细说明：{@link #FIELD_TOOLBARSTYLE}
     * <P>
     * 等同 {@link #setToolbarStyle}
     * @param toolbarStyle
     */
    @JsonIgnore
    public PSDEToolbarDTO toolbarstyle(String toolbarStyle){
        this.setToolbarStyle(toolbarStyle);
        return this;
    }

     /**
     * 设置 工具栏样式，详细说明：{@link #FIELD_TOOLBARSTYLE}
     * <P>
     * 等同 {@link #setToolbarStyle}
     * @param toolbarStyle
     */
    @JsonIgnore
    public PSDEToolbarDTO toolbarstyle(net.ibizsys.model.PSModelEnums.ToolbarStyle toolbarStyle){
        if(toolbarStyle == null){
            this.setToolbarStyle(null);
        }
        else{
            this.setToolbarStyle(toolbarStyle.value);
        }
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
    public PSDEToolbarDTO updatedate(Timestamp updateDate){
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
    public PSDEToolbarDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDEToolbarDTO userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEToolbarId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEToolbarId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEToolbarId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEToolbarId(strValue);
    }

    @JsonIgnore
    public PSDEToolbarDTO id(String strValue){
        this.setPSDEToolbarId(strValue);
        return this;
    }


    /**
     *  实体工具栏项 成员集合
     */
    public final static String FIELD_PSDETBITEMS = "psdetbitems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDETBItemDTO> psdetbitems;

    /**
     * 获取 实体工具栏项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETBITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETBItemDTO> getPSDETBItems(){
        return this.psdetbitems;
    }

    /**
     * 设置 实体工具栏项 成员集合  
     * @param psdetbitems
     */
    @JsonProperty(FIELD_PSDETBITEMS)
    public void setPSDETBItems(java.util.List<net.ibizsys.centralstudio.dto.PSDETBItemDTO> psdetbitems){
        this.psdetbitems = psdetbitems;
    }

    /**
     * 获取 实体工具栏项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETBItemDTO> getPSDETBItemsIf(){
        if(this.psdetbitems == null){
            this.psdetbitems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDETBItemDTO>();          
        }
        return this.psdetbitems;
    }


    /**
     *  工具栏逻辑 成员集合
     */
    public final static String FIELD_PSDETOOLBARLOGICS = "psdetoolbarlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO> psdetoolbarlogics;

    /**
     * 获取 工具栏逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETOOLBARLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO> getPSDEToolbarLogics(){
        return this.psdetoolbarlogics;
    }

    /**
     * 设置 工具栏逻辑 成员集合  
     * @param psdetoolbarlogics
     */
    @JsonProperty(FIELD_PSDETOOLBARLOGICS)
    public void setPSDEToolbarLogics(java.util.List<net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO> psdetoolbarlogics){
        this.psdetoolbarlogics = psdetoolbarlogics;
    }

    /**
     * 获取 工具栏逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO> getPSDEToolbarLogicsIf(){
        if(this.psdetoolbarlogics == null){
            this.psdetoolbarlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEToolbarLogicDTO>();          
        }
        return this.psdetoolbarlogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEToolbarDTO){
            PSDEToolbarDTO dto = (PSDEToolbarDTO)iEntity;
            dto.setPSDETBItems(this.getPSDETBItems());
            dto.setPSDEToolbarLogics(this.getPSDEToolbarLogics());
        }
        super.copyTo(iEntity);
    }
}
