package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEMSACTION</B>实体主状态操作 模型传输对象
 * <P>
 * 主状态行为控制模型，定义主状态控制的实体行为
 */
public class PSDEMSActionDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEMSActionDTO(){
    }      

    /**
     * <B>ALLOWMODE</B>&nbsp;允许模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEMSActionMode} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMSID}
     */
    public final static String FIELD_ALLOWMODE = "allowmode";

    /**
     * 设置 允许模式
     * 
     * @param allowMode
     * 
     */
    @JsonProperty(FIELD_ALLOWMODE)
    public void setAllowMode(String allowMode){
        this.set(FIELD_ALLOWMODE, allowMode);
    }
    
    /**
     * 获取 允许模式  
     * @return
     */
    @JsonIgnore
    public String getAllowMode(){
        Object objValue = this.get(FIELD_ALLOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 允许模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowModeDirty(){
        if(this.contains(FIELD_ALLOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许模式
     */
    @JsonIgnore
    public void resetAllowMode(){
        this.reset(FIELD_ALLOWMODE);
    }

    /**
     * 设置 允许模式
     * <P>
     * 等同 {@link #setAllowMode}
     * @param allowMode
     */
    @JsonIgnore
    public PSDEMSActionDTO allowmode(String allowMode){
        this.setAllowMode(allowMode);
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
    public PSDEMSActionDTO createdate(Timestamp createDate){
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
    public PSDEMSActionDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDEMSActionDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定实体主状态行为的控制行为对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionId(){
        Object objValue = this.get(FIELD_PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionIdDirty(){
        if(this.contains(FIELD_PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSDEMSActionDTO psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEMSActionDTO psdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定实体主状态行为的控制行为对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionName(){
        Object objValue = this.get(FIELD_PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionNameDirty(){
        if(this.contains(FIELD_PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSDEMSActionDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEActionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEActionName(strName);
    }

    @JsonIgnore
    public PSDEMSActionDTO name(String strName){
        this.setPSDEActionName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMSID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEMSActionDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEMSACTIONID</B>&nbsp;实体主状态操作标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMSACTIONID = "psdemsactionid";

    /**
     * 设置 实体主状态操作标识
     * 
     * @param pSDEMSActionId
     * 
     */
    @JsonProperty(FIELD_PSDEMSACTIONID)
    public void setPSDEMSActionId(String pSDEMSActionId){
        this.set(FIELD_PSDEMSACTIONID, pSDEMSActionId);
    }
    
    /**
     * 获取 实体主状态操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSActionId(){
        Object objValue = this.get(FIELD_PSDEMSACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSActionIdDirty(){
        if(this.contains(FIELD_PSDEMSACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态操作标识
     */
    @JsonIgnore
    public void resetPSDEMSActionId(){
        this.reset(FIELD_PSDEMSACTIONID);
    }

    /**
     * 设置 实体主状态操作标识
     * <P>
     * 等同 {@link #setPSDEMSActionId}
     * @param pSDEMSActionId
     */
    @JsonIgnore
    public PSDEMSActionDTO psdemsactionid(String pSDEMSActionId){
        this.setPSDEMSActionId(pSDEMSActionId);
        return this;
    }

    /**
     * <B>PSDEMSACTIONNAME</B>&nbsp;主状态行为名称，指定实体主状态行为名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEMSACTIONNAME = "psdemsactionname";

    /**
     * 设置 主状态行为名称，详细说明：{@link #FIELD_PSDEMSACTIONNAME}
     * 
     * @param pSDEMSActionName
     * 
     */
    @JsonProperty(FIELD_PSDEMSACTIONNAME)
    public void setPSDEMSActionName(String pSDEMSActionName){
        this.set(FIELD_PSDEMSACTIONNAME, pSDEMSActionName);
    }
    
    /**
     * 获取 主状态行为名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSActionName(){
        Object objValue = this.get(FIELD_PSDEMSACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态行为名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSActionNameDirty(){
        if(this.contains(FIELD_PSDEMSACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态行为名称
     */
    @JsonIgnore
    public void resetPSDEMSActionName(){
        this.reset(FIELD_PSDEMSACTIONNAME);
    }

    /**
     * 设置 主状态行为名称，详细说明：{@link #FIELD_PSDEMSACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEMSActionName}
     * @param pSDEMSActionName
     */
    @JsonIgnore
    public PSDEMSActionDTO psdemsactionname(String pSDEMSActionName){
        this.setPSDEMSActionName(pSDEMSActionName);
        return this;
    }

    /**
     * <B>PSDEMSID</B>&nbsp;实体主状态，指定实体主状态行为所在的主状态对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_PSDEMSID = "psdemsid";

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMSID}
     * 
     * @param pSDEMSId
     * 
     */
    @JsonProperty(FIELD_PSDEMSID)
    public void setPSDEMSId(String pSDEMSId){
        this.set(FIELD_PSDEMSID, pSDEMSId);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSId(){
        Object objValue = this.get(FIELD_PSDEMSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSIdDirty(){
        if(this.contains(FIELD_PSDEMSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMSId(){
        this.reset(FIELD_PSDEMSID);
    }

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMSID}
     * <P>
     * 等同 {@link #setPSDEMSId}
     * @param pSDEMSId
     */
    @JsonIgnore
    public PSDEMSActionDTO psdemsid(String pSDEMSId){
        this.setPSDEMSId(pSDEMSId);
        return this;
    }

    /**
     * 设置 实体主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMSId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEMSActionDTO psdemsid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setAllowMode(null);
            this.setPSDEId(null);
            this.setPSDEMSId(null);
            this.setPSDEMSName(null);
        }
        else{
            this.setAllowMode(pSDEMainState.getAllowMode());
            this.setPSDEId(pSDEMainState.getPSDEId());
            this.setPSDEMSId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMSName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMSNAME</B>&nbsp;实体主状态，指定实体主状态行为所在的主状态对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMSID}
     */
    public final static String FIELD_PSDEMSNAME = "psdemsname";

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMSNAME}
     * 
     * @param pSDEMSName
     * 
     */
    @JsonProperty(FIELD_PSDEMSNAME)
    public void setPSDEMSName(String pSDEMSName){
        this.set(FIELD_PSDEMSNAME, pSDEMSName);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSName(){
        Object objValue = this.get(FIELD_PSDEMSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSNameDirty(){
        if(this.contains(FIELD_PSDEMSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMSName(){
        this.reset(FIELD_PSDEMSNAME);
    }

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMSNAME}
     * <P>
     * 等同 {@link #setPSDEMSName}
     * @param pSDEMSName
     */
    @JsonIgnore
    public PSDEMSActionDTO psdemsname(String pSDEMSName){
        this.setPSDEMSName(pSDEMSName);
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
    public PSDEMSActionDTO updatedate(Timestamp updateDate){
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
    public PSDEMSActionDTO updateman(String updateMan){
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
    public PSDEMSActionDTO usercat(String userCat){
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
    public PSDEMSActionDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMSActionDTO usertag(String userTag){
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
    public PSDEMSActionDTO usertag2(String userTag2){
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
    public PSDEMSActionDTO usertag3(String userTag3){
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
    public PSDEMSActionDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEMSActionDTO validflag(Integer validFlag){
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
    public PSDEMSActionDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEMSActionId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEMSActionId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEMSActionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMSActionId(strValue);
    }

    @JsonIgnore
    public PSDEMSActionDTO id(String strValue){
        this.setPSDEMSActionId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEMSActionDTO){
            PSDEMSActionDTO dto = (PSDEMSActionDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
