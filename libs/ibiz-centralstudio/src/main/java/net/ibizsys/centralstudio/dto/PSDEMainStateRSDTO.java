package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEMAINSTATERS</B>实体主状态关系 模型传输对象
 * <P>
 * 实体主状态关系模型，定义主状态之间的迁移关系
 */
public class PSDEMainStateRSDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEMainStateRSDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体主状态关系的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 50
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
    public PSDEMainStateRSDTO codename(String codeName){
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
    public PSDEMainStateRSDTO createdate(Timestamp createDate){
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
    public PSDEMainStateRSDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENTERPSDEACTIONID</B>&nbsp;进入状态实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_ENTERPSDEACTIONID = "enterpsdeactionid";

    /**
     * 设置 进入状态实体行为
     * 
     * @param enterPSDEActionId
     * 
     */
    @JsonProperty(FIELD_ENTERPSDEACTIONID)
    public void setEnterPSDEActionId(String enterPSDEActionId){
        this.set(FIELD_ENTERPSDEACTIONID, enterPSDEActionId);
    }
    
    /**
     * 获取 进入状态实体行为  
     * @return
     */
    @JsonIgnore
    public String getEnterPSDEActionId(){
        Object objValue = this.get(FIELD_ENTERPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 进入状态实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnterPSDEActionIdDirty(){
        if(this.contains(FIELD_ENTERPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 进入状态实体行为
     */
    @JsonIgnore
    public void resetEnterPSDEActionId(){
        this.reset(FIELD_ENTERPSDEACTIONID);
    }

    /**
     * 设置 进入状态实体行为
     * <P>
     * 等同 {@link #setEnterPSDEActionId}
     * @param enterPSDEActionId
     */
    @JsonIgnore
    public PSDEMainStateRSDTO enterpsdeactionid(String enterPSDEActionId){
        this.setEnterPSDEActionId(enterPSDEActionId);
        return this;
    }

    /**
     * 设置 进入状态实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEnterPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEMainStateRSDTO enterpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setEnterPSDEActionId(null);
            this.setEnterPSDEActionName(null);
        }
        else{
            this.setEnterPSDEActionId(pSDEAction.getPSDEActionId());
            this.setEnterPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>ENTERPSDEACTIONNAME</B>&nbsp;进入状态实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ENTERPSDEACTIONID}
     */
    public final static String FIELD_ENTERPSDEACTIONNAME = "enterpsdeactionname";

    /**
     * 设置 进入状态实体行为
     * 
     * @param enterPSDEActionName
     * 
     */
    @JsonProperty(FIELD_ENTERPSDEACTIONNAME)
    public void setEnterPSDEActionName(String enterPSDEActionName){
        this.set(FIELD_ENTERPSDEACTIONNAME, enterPSDEActionName);
    }
    
    /**
     * 获取 进入状态实体行为  
     * @return
     */
    @JsonIgnore
    public String getEnterPSDEActionName(){
        Object objValue = this.get(FIELD_ENTERPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 进入状态实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnterPSDEActionNameDirty(){
        if(this.contains(FIELD_ENTERPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 进入状态实体行为
     */
    @JsonIgnore
    public void resetEnterPSDEActionName(){
        this.reset(FIELD_ENTERPSDEACTIONNAME);
    }

    /**
     * 设置 进入状态实体行为
     * <P>
     * 等同 {@link #setEnterPSDEActionName}
     * @param enterPSDEActionName
     */
    @JsonIgnore
    public PSDEMainStateRSDTO enterpsdeactionname(String enterPSDEActionName){
        this.setEnterPSDEActionName(enterPSDEActionName);
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
    public PSDEMainStateRSDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NEXTPSDEMSID</B>&nbsp;进入状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_NEXTPSDEMSID = "nextpsdemsid";

    /**
     * 设置 进入状态
     * 
     * @param nextPSDEMSId
     * 
     */
    @JsonProperty(FIELD_NEXTPSDEMSID)
    public void setNextPSDEMSId(String nextPSDEMSId){
        this.set(FIELD_NEXTPSDEMSID, nextPSDEMSId);
    }
    
    /**
     * 获取 进入状态  
     * @return
     */
    @JsonIgnore
    public String getNextPSDEMSId(){
        Object objValue = this.get(FIELD_NEXTPSDEMSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 进入状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSDEMSIdDirty(){
        if(this.contains(FIELD_NEXTPSDEMSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 进入状态
     */
    @JsonIgnore
    public void resetNextPSDEMSId(){
        this.reset(FIELD_NEXTPSDEMSID);
    }

    /**
     * 设置 进入状态
     * <P>
     * 等同 {@link #setNextPSDEMSId}
     * @param nextPSDEMSId
     */
    @JsonIgnore
    public PSDEMainStateRSDTO nextpsdemsid(String nextPSDEMSId){
        this.setNextPSDEMSId(nextPSDEMSId);
        return this;
    }

    /**
     * 设置 进入状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNextPSDEMSId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEMainStateRSDTO nextpsdemsid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setNextPSDEMSId(null);
            this.setNextPSDEMSName(null);
        }
        else{
            this.setNextPSDEMSId(pSDEMainState.getPSDEMainStateId());
            this.setNextPSDEMSName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>NEXTPSDEMSNAME</B>&nbsp;进入状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NEXTPSDEMSID}
     */
    public final static String FIELD_NEXTPSDEMSNAME = "nextpsdemsname";

    /**
     * 设置 进入状态
     * 
     * @param nextPSDEMSName
     * 
     */
    @JsonProperty(FIELD_NEXTPSDEMSNAME)
    public void setNextPSDEMSName(String nextPSDEMSName){
        this.set(FIELD_NEXTPSDEMSNAME, nextPSDEMSName);
    }
    
    /**
     * 获取 进入状态  
     * @return
     */
    @JsonIgnore
    public String getNextPSDEMSName(){
        Object objValue = this.get(FIELD_NEXTPSDEMSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 进入状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSDEMSNameDirty(){
        if(this.contains(FIELD_NEXTPSDEMSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 进入状态
     */
    @JsonIgnore
    public void resetNextPSDEMSName(){
        this.reset(FIELD_NEXTPSDEMSNAME);
    }

    /**
     * 设置 进入状态
     * <P>
     * 等同 {@link #setNextPSDEMSName}
     * @param nextPSDEMSName
     */
    @JsonIgnore
    public PSDEMainStateRSDTO nextpsdemsname(String nextPSDEMSName){
        this.setNextPSDEMSName(nextPSDEMSName);
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
    public PSDEMainStateRSDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PREVPSDEMSID</B>&nbsp;前序状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_PREVPSDEMSID = "prevpsdemsid";

    /**
     * 设置 前序状态
     * 
     * @param prevPSDEMSId
     * 
     */
    @JsonProperty(FIELD_PREVPSDEMSID)
    public void setPrevPSDEMSId(String prevPSDEMSId){
        this.set(FIELD_PREVPSDEMSID, prevPSDEMSId);
    }
    
    /**
     * 获取 前序状态  
     * @return
     */
    @JsonIgnore
    public String getPrevPSDEMSId(){
        Object objValue = this.get(FIELD_PREVPSDEMSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前序状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevPSDEMSIdDirty(){
        if(this.contains(FIELD_PREVPSDEMSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前序状态
     */
    @JsonIgnore
    public void resetPrevPSDEMSId(){
        this.reset(FIELD_PREVPSDEMSID);
    }

    /**
     * 设置 前序状态
     * <P>
     * 等同 {@link #setPrevPSDEMSId}
     * @param prevPSDEMSId
     */
    @JsonIgnore
    public PSDEMainStateRSDTO prevpsdemsid(String prevPSDEMSId){
        this.setPrevPSDEMSId(prevPSDEMSId);
        return this;
    }

    /**
     * 设置 前序状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPrevPSDEMSId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEMainStateRSDTO prevpsdemsid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setPrevPSDEMSId(null);
            this.setPrevPSDEMSName(null);
        }
        else{
            this.setPrevPSDEMSId(pSDEMainState.getPSDEMainStateId());
            this.setPrevPSDEMSName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PREVPSDEMSNAME</B>&nbsp;前序状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PREVPSDEMSID}
     */
    public final static String FIELD_PREVPSDEMSNAME = "prevpsdemsname";

    /**
     * 设置 前序状态
     * 
     * @param prevPSDEMSName
     * 
     */
    @JsonProperty(FIELD_PREVPSDEMSNAME)
    public void setPrevPSDEMSName(String prevPSDEMSName){
        this.set(FIELD_PREVPSDEMSNAME, prevPSDEMSName);
    }
    
    /**
     * 获取 前序状态  
     * @return
     */
    @JsonIgnore
    public String getPrevPSDEMSName(){
        Object objValue = this.get(FIELD_PREVPSDEMSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前序状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevPSDEMSNameDirty(){
        if(this.contains(FIELD_PREVPSDEMSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前序状态
     */
    @JsonIgnore
    public void resetPrevPSDEMSName(){
        this.reset(FIELD_PREVPSDEMSNAME);
    }

    /**
     * 设置 前序状态
     * <P>
     * 等同 {@link #setPrevPSDEMSName}
     * @param prevPSDEMSName
     */
    @JsonIgnore
    public PSDEMainStateRSDTO prevpsdemsname(String prevPSDEMSName){
        this.setPrevPSDEMSName(prevPSDEMSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSDEMainStateRSDTO psdeid(String pSDEId){
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
    public PSDEMainStateRSDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDEMAINSTATERSID</B>&nbsp;实体主状态关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMAINSTATERSID = "psdemainstatersid";

    /**
     * 设置 实体主状态关系标识
     * 
     * @param pSDEMainStateRSId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATERSID)
    public void setPSDEMainStateRSId(String pSDEMainStateRSId){
        this.set(FIELD_PSDEMAINSTATERSID, pSDEMainStateRSId);
    }
    
    /**
     * 获取 实体主状态关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateRSId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATERSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateRSIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATERSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态关系标识
     */
    @JsonIgnore
    public void resetPSDEMainStateRSId(){
        this.reset(FIELD_PSDEMAINSTATERSID);
    }

    /**
     * 设置 实体主状态关系标识
     * <P>
     * 等同 {@link #setPSDEMainStateRSId}
     * @param pSDEMainStateRSId
     */
    @JsonIgnore
    public PSDEMainStateRSDTO psdemainstatersid(String pSDEMainStateRSId){
        this.setPSDEMainStateRSId(pSDEMainStateRSId);
        return this;
    }

    /**
     * <B>PSDEMAINSTATERSNAME</B>&nbsp;主状态关系名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMAINSTATERSNAME = "psdemainstatersname";

    /**
     * 设置 主状态关系名称
     * 
     * @param pSDEMainStateRSName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATERSNAME)
    public void setPSDEMainStateRSName(String pSDEMainStateRSName){
        this.set(FIELD_PSDEMAINSTATERSNAME, pSDEMainStateRSName);
    }
    
    /**
     * 获取 主状态关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateRSName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATERSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateRSNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATERSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态关系名称
     */
    @JsonIgnore
    public void resetPSDEMainStateRSName(){
        this.reset(FIELD_PSDEMAINSTATERSNAME);
    }

    /**
     * 设置 主状态关系名称
     * <P>
     * 等同 {@link #setPSDEMainStateRSName}
     * @param pSDEMainStateRSName
     */
    @JsonIgnore
    public PSDEMainStateRSDTO psdemainstatersname(String pSDEMainStateRSName){
        this.setPSDEMainStateRSName(pSDEMainStateRSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEMainStateRSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEMainStateRSName(strName);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO name(String strName){
        this.setPSDEMainStateRSName(strName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEMainStateRSDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
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
    public PSDEMainStateRSDTO updatedate(Timestamp updateDate){
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
    public PSDEMainStateRSDTO updateman(String updateMan){
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
    public PSDEMainStateRSDTO usercat(String userCat){
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
    public PSDEMainStateRSDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMainStateRSDTO usertag(String userTag){
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
    public PSDEMainStateRSDTO usertag2(String userTag2){
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
    public PSDEMainStateRSDTO usertag3(String userTag3){
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
    public PSDEMainStateRSDTO usertag4(String userTag4){
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
    public PSDEMainStateRSDTO validflag(Integer validFlag){
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
    public PSDEMainStateRSDTO validflag(Boolean validFlag){
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
        return this.getPSDEMainStateRSId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEMainStateRSId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEMainStateRSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMainStateRSId(strValue);
    }

    @JsonIgnore
    public PSDEMainStateRSDTO id(String strValue){
        this.setPSDEMainStateRSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEMainStateRSDTO){
            PSDEMainStateRSDTO dto = (PSDEMainStateRSDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
