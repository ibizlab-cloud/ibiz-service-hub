package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMSGTARGET</B>系统消息目标 模型传输对象
 * <P>
 * 系统消息目标模型，定义系统对外发送消息的目标，包括系统本地实体数据集或运行环境（Cloud）定义的目标对象
 */
public class PSSysMsgTarget extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysMsgTarget(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称，指定系统消息目标对象的代码标识，需在所在模型域（系统或模块）具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysMsgTarget codename(String codeName){
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
    public PSSysMsgTarget createdate(String createDate){
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
    public PSSysMsgTarget createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSysMsgTarget customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysMsgTarget custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysMsgTarget custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
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
    public PSSysMsgTarget memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MSGTARGETPARAMS</B>&nbsp;消息目标参数
     */
    public final static String FIELD_MSGTARGETPARAMS = "msgtargetparams";

    /**
     * 设置 消息目标参数
     * 
     * @param msgTargetParams
     * 
     */
    @JsonProperty(FIELD_MSGTARGETPARAMS)
    public void setMsgTargetParams(String msgTargetParams){
        this.set(FIELD_MSGTARGETPARAMS, msgTargetParams);
    }
    
    /**
     * 获取 消息目标参数  
     * @return
     */
    @JsonIgnore
    public String getMsgTargetParams(){
        Object objValue = this.get(FIELD_MSGTARGETPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息目标参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTargetParamsDirty(){
        if(this.contains(FIELD_MSGTARGETPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息目标参数
     */
    @JsonIgnore
    public void resetMsgTargetParams(){
        this.reset(FIELD_MSGTARGETPARAMS);
    }

    /**
     * 设置 消息目标参数
     * <P>
     * 等同 {@link #setMsgTargetParams}
     * @param msgTargetParams
     */
    @JsonIgnore
    public PSSysMsgTarget msgtargetparams(String msgTargetParams){
        this.setMsgTargetParams(msgTargetParams);
        return this;
    }

    /**
     * <B>MSGTARGETTAG</B>&nbsp;消息目标标记，指定系统消息目标对象的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MSGTARGETTAG = "msgtargettag";

    /**
     * 设置 消息目标标记，详细说明：{@link #FIELD_MSGTARGETTAG}
     * 
     * @param msgTargetTag
     * 
     */
    @JsonProperty(FIELD_MSGTARGETTAG)
    public void setMsgTargetTag(String msgTargetTag){
        this.set(FIELD_MSGTARGETTAG, msgTargetTag);
    }
    
    /**
     * 获取 消息目标标记  
     * @return
     */
    @JsonIgnore
    public String getMsgTargetTag(){
        Object objValue = this.get(FIELD_MSGTARGETTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息目标标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTargetTagDirty(){
        if(this.contains(FIELD_MSGTARGETTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息目标标记
     */
    @JsonIgnore
    public void resetMsgTargetTag(){
        this.reset(FIELD_MSGTARGETTAG);
    }

    /**
     * 设置 消息目标标记，详细说明：{@link #FIELD_MSGTARGETTAG}
     * <P>
     * 等同 {@link #setMsgTargetTag}
     * @param msgTargetTag
     */
    @JsonIgnore
    public PSSysMsgTarget msgtargettag(String msgTargetTag){
        this.setMsgTargetTag(msgTargetTag);
        return this;
    }

    /**
     * <B>MSGTARGETTAG2</B>&nbsp;消息目标标记2，指定系统消息目标对象的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MSGTARGETTAG2 = "msgtargettag2";

    /**
     * 设置 消息目标标记2，详细说明：{@link #FIELD_MSGTARGETTAG2}
     * 
     * @param msgTargetTag2
     * 
     */
    @JsonProperty(FIELD_MSGTARGETTAG2)
    public void setMsgTargetTag2(String msgTargetTag2){
        this.set(FIELD_MSGTARGETTAG2, msgTargetTag2);
    }
    
    /**
     * 获取 消息目标标记2  
     * @return
     */
    @JsonIgnore
    public String getMsgTargetTag2(){
        Object objValue = this.get(FIELD_MSGTARGETTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息目标标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTargetTag2Dirty(){
        if(this.contains(FIELD_MSGTARGETTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息目标标记2
     */
    @JsonIgnore
    public void resetMsgTargetTag2(){
        this.reset(FIELD_MSGTARGETTAG2);
    }

    /**
     * 设置 消息目标标记2，详细说明：{@link #FIELD_MSGTARGETTAG2}
     * <P>
     * 等同 {@link #setMsgTargetTag2}
     * @param msgTargetTag2
     */
    @JsonIgnore
    public PSSysMsgTarget msgtargettag2(String msgTargetTag2){
        this.setMsgTargetTag2(msgTargetTag2);
        return this;
    }

    /**
     * <B>MSGTARGETTYPE</B>&nbsp;消息目标类型，指定系统消息目标对象的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MsgTargetType} 
     */
    public final static String FIELD_MSGTARGETTYPE = "msgtargettype";

    /**
     * 设置 消息目标类型，详细说明：{@link #FIELD_MSGTARGETTYPE}
     * 
     * @param msgTargetType
     * 
     */
    @JsonProperty(FIELD_MSGTARGETTYPE)
    public void setMsgTargetType(String msgTargetType){
        this.set(FIELD_MSGTARGETTYPE, msgTargetType);
    }
    
    /**
     * 获取 消息目标类型  
     * @return
     */
    @JsonIgnore
    public String getMsgTargetType(){
        Object objValue = this.get(FIELD_MSGTARGETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息目标类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTargetTypeDirty(){
        if(this.contains(FIELD_MSGTARGETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息目标类型
     */
    @JsonIgnore
    public void resetMsgTargetType(){
        this.reset(FIELD_MSGTARGETTYPE);
    }

    /**
     * 设置 消息目标类型，详细说明：{@link #FIELD_MSGTARGETTYPE}
     * <P>
     * 等同 {@link #setMsgTargetType}
     * @param msgTargetType
     */
    @JsonIgnore
    public PSSysMsgTarget msgtargettype(String msgTargetType){
        this.setMsgTargetType(msgTargetType);
        return this;
    }

     /**
     * 设置 消息目标类型，详细说明：{@link #FIELD_MSGTARGETTYPE}
     * <P>
     * 等同 {@link #setMsgTargetType}
     * @param msgTargetType
     */
    @JsonIgnore
    public PSSysMsgTarget msgtargettype(net.ibizsys.psmodel.core.util.PSModelEnums.MsgTargetType msgTargetType){
        if(msgTargetType == null){
            this.setMsgTargetType(null);
        }
        else{
            this.setMsgTargetType(msgTargetType.value);
        }
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;数据源数据集，系统消息目标对象类型为【实体数据集】时指定使用的实体数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 数据源数据集，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 数据源数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 数据源数据集，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSSysMsgTarget psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 数据源数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体数据集，系统消息目标对象类型为【实体数据集】时指定使用的实体数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSSysMsgTarget psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;数据源实体，系统消息目标对象类型为【实体数据集】时指定相应的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 数据源实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 数据源实体  
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
     * 判断 数据源实体 是否指定值，包括空值
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
     * 重置 数据源实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 数据源实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysMsgTarget psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 数据源实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;数据源实体，系统消息目标对象类型为【实体数据集】时指定相应的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 数据源实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 数据源实体  
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
     * 判断 数据源实体 是否指定值，包括空值
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
     * 重置 数据源实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 数据源实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysMsgTarget psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysMsgTarget psmoduleid(String pSModuleId){
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
    public PSSysMsgTarget psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysMsgTarget psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysMsgTarget pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysMsgTarget pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSMSGTARGETID</B>&nbsp;系统消息目标标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMSGTARGETID = "pssysmsgtargetid";

    /**
     * 设置 系统消息目标标识
     * 
     * @param pSSysMsgTargetId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTARGETID)
    public void setPSSysMsgTargetId(String pSSysMsgTargetId){
        this.set(FIELD_PSSYSMSGTARGETID, pSSysMsgTargetId);
    }
    
    /**
     * 获取 系统消息目标标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTargetId(){
        Object objValue = this.get(FIELD_PSSYSMSGTARGETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息目标标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTargetIdDirty(){
        if(this.contains(FIELD_PSSYSMSGTARGETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息目标标识
     */
    @JsonIgnore
    public void resetPSSysMsgTargetId(){
        this.reset(FIELD_PSSYSMSGTARGETID);
    }

    /**
     * 设置 系统消息目标标识
     * <P>
     * 等同 {@link #setPSSysMsgTargetId}
     * @param pSSysMsgTargetId
     */
    @JsonIgnore
    public PSSysMsgTarget pssysmsgtargetid(String pSSysMsgTargetId){
        this.setPSSysMsgTargetId(pSSysMsgTargetId);
        return this;
    }

    /**
     * <B>PSSYSMSGTARGETNAME</B>&nbsp;消息目标名称，指定系统消息目标对象的名称，需在所在模型域（系统或模块）具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSMSGTARGETNAME = "pssysmsgtargetname";

    /**
     * 设置 消息目标名称，详细说明：{@link #FIELD_PSSYSMSGTARGETNAME}
     * 
     * @param pSSysMsgTargetName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTARGETNAME)
    public void setPSSysMsgTargetName(String pSSysMsgTargetName){
        this.set(FIELD_PSSYSMSGTARGETNAME, pSSysMsgTargetName);
    }
    
    /**
     * 获取 消息目标名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTargetName(){
        Object objValue = this.get(FIELD_PSSYSMSGTARGETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息目标名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTargetNameDirty(){
        if(this.contains(FIELD_PSSYSMSGTARGETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息目标名称
     */
    @JsonIgnore
    public void resetPSSysMsgTargetName(){
        this.reset(FIELD_PSSYSMSGTARGETNAME);
    }

    /**
     * 设置 消息目标名称，详细说明：{@link #FIELD_PSSYSMSGTARGETNAME}
     * <P>
     * 等同 {@link #setPSSysMsgTargetName}
     * @param pSSysMsgTargetName
     */
    @JsonIgnore
    public PSSysMsgTarget pssysmsgtargetname(String pSSysMsgTargetName){
        this.setPSSysMsgTargetName(pSSysMsgTargetName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysMsgTargetName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysMsgTargetName(strName);
    }

    @JsonIgnore
    public PSSysMsgTarget name(String strName){
        this.setPSSysMsgTargetName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysMsgTarget pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysMsgTarget pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUTILDEID</B>&nbsp;系统功能组件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUtil} 
     */
    public final static String FIELD_PSSYSUTILDEID = "pssysutildeid";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDEID)
    public void setPSSysUtilDEId(String pSSysUtilDEId){
        this.set(FIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEId(){
        Object objValue = this.get(FIELD_PSSYSUTILDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty(){
        if(this.contains(FIELD_PSSYSUTILDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEId(){
        this.reset(FIELD_PSSYSUTILDEID);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtilDEId
     */
    @JsonIgnore
    public PSSysMsgTarget pssysutildeid(String pSSysUtilDEId){
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    /**
     * 设置 系统功能组件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtil 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget pssysutildeid(PSSysUtil pSSysUtil){
        if(pSSysUtil == null){
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        }
        else{
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    /**
     * <B>PSSYSUTILDENAME</B>&nbsp;系统功能组件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUTILDEID}
     */
    public final static String FIELD_PSSYSUTILDENAME = "pssysutildename";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDENAME)
    public void setPSSysUtilDEName(String pSSysUtilDEName){
        this.set(FIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEName(){
        Object objValue = this.get(FIELD_PSSYSUTILDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDENameDirty(){
        if(this.contains(FIELD_PSSYSUTILDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEName(){
        this.reset(FIELD_PSSYSUTILDENAME);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEName}
     * @param pSSysUtilDEName
     */
    @JsonIgnore
    public PSSysMsgTarget pssysutildename(String pSSysUtilDEName){
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    /**
     * <B>TARGETPSDEFID</B>&nbsp;目标标识属性，系统消息目标对象类型为【实体数据集】时指定存储消息目标标识的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TARGETPSDEFID = "targetpsdefid";

    /**
     * 设置 目标标识属性，详细说明：{@link #FIELD_TARGETPSDEFID}
     * 
     * @param targetPSDEFId
     * 
     */
    @JsonProperty(FIELD_TARGETPSDEFID)
    public void setTargetPSDEFId(String targetPSDEFId){
        this.set(FIELD_TARGETPSDEFID, targetPSDEFId);
    }
    
    /**
     * 获取 目标标识属性  
     * @return
     */
    @JsonIgnore
    public String getTargetPSDEFId(){
        Object objValue = this.get(FIELD_TARGETPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetPSDEFIdDirty(){
        if(this.contains(FIELD_TARGETPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识属性
     */
    @JsonIgnore
    public void resetTargetPSDEFId(){
        this.reset(FIELD_TARGETPSDEFID);
    }

    /**
     * 设置 目标标识属性，详细说明：{@link #FIELD_TARGETPSDEFID}
     * <P>
     * 等同 {@link #setTargetPSDEFId}
     * @param targetPSDEFId
     */
    @JsonIgnore
    public PSSysMsgTarget targetpsdefid(String targetPSDEFId){
        this.setTargetPSDEFId(targetPSDEFId);
        return this;
    }

    /**
     * 设置 目标标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTargetPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget targetpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTargetPSDEFId(null);
            this.setTargetPSDEFName(null);
        }
        else{
            this.setTargetPSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TARGETPSDEFNAME</B>&nbsp;目标标识属性，系统消息目标对象类型为【实体数据集】时指定存储消息目标标识的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TARGETPSDEFID}
     */
    public final static String FIELD_TARGETPSDEFNAME = "targetpsdefname";

    /**
     * 设置 目标标识属性，详细说明：{@link #FIELD_TARGETPSDEFNAME}
     * 
     * @param targetPSDEFName
     * 
     */
    @JsonProperty(FIELD_TARGETPSDEFNAME)
    public void setTargetPSDEFName(String targetPSDEFName){
        this.set(FIELD_TARGETPSDEFNAME, targetPSDEFName);
    }
    
    /**
     * 获取 目标标识属性  
     * @return
     */
    @JsonIgnore
    public String getTargetPSDEFName(){
        Object objValue = this.get(FIELD_TARGETPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetPSDEFNameDirty(){
        if(this.contains(FIELD_TARGETPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识属性
     */
    @JsonIgnore
    public void resetTargetPSDEFName(){
        this.reset(FIELD_TARGETPSDEFNAME);
    }

    /**
     * 设置 目标标识属性，详细说明：{@link #FIELD_TARGETPSDEFNAME}
     * <P>
     * 等同 {@link #setTargetPSDEFName}
     * @param targetPSDEFName
     */
    @JsonIgnore
    public PSSysMsgTarget targetpsdefname(String targetPSDEFName){
        this.setTargetPSDEFName(targetPSDEFName);
        return this;
    }

    /**
     * <B>TARGETTYPEPSDEFID</B>&nbsp;目标类型属性，系统消息目标对象类型为【实体数据集】时指定存储消息目标类型的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TARGETTYPEPSDEFID = "targettypepsdefid";

    /**
     * 设置 目标类型属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFID}
     * 
     * @param targetTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_TARGETTYPEPSDEFID)
    public void setTargetTypePSDEFId(String targetTypePSDEFId){
        this.set(FIELD_TARGETTYPEPSDEFID, targetTypePSDEFId);
    }
    
    /**
     * 获取 目标类型属性  
     * @return
     */
    @JsonIgnore
    public String getTargetTypePSDEFId(){
        Object objValue = this.get(FIELD_TARGETTYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypePSDEFIdDirty(){
        if(this.contains(FIELD_TARGETTYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型属性
     */
    @JsonIgnore
    public void resetTargetTypePSDEFId(){
        this.reset(FIELD_TARGETTYPEPSDEFID);
    }

    /**
     * 设置 目标类型属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFID}
     * <P>
     * 等同 {@link #setTargetTypePSDEFId}
     * @param targetTypePSDEFId
     */
    @JsonIgnore
    public PSSysMsgTarget targettypepsdefid(String targetTypePSDEFId){
        this.setTargetTypePSDEFId(targetTypePSDEFId);
        return this;
    }

    /**
     * 设置 目标类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTargetTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget targettypepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTargetTypePSDEFId(null);
            this.setTargetTypePSDEFName(null);
        }
        else{
            this.setTargetTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TARGETTYPEPSDEFNAME</B>&nbsp;目标类型属性，系统消息目标对象类型为【实体数据集】时指定存储消息目标类型的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TARGETTYPEPSDEFID}
     */
    public final static String FIELD_TARGETTYPEPSDEFNAME = "targettypepsdefname";

    /**
     * 设置 目标类型属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFNAME}
     * 
     * @param targetTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_TARGETTYPEPSDEFNAME)
    public void setTargetTypePSDEFName(String targetTypePSDEFName){
        this.set(FIELD_TARGETTYPEPSDEFNAME, targetTypePSDEFName);
    }
    
    /**
     * 获取 目标类型属性  
     * @return
     */
    @JsonIgnore
    public String getTargetTypePSDEFName(){
        Object objValue = this.get(FIELD_TARGETTYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypePSDEFNameDirty(){
        if(this.contains(FIELD_TARGETTYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型属性
     */
    @JsonIgnore
    public void resetTargetTypePSDEFName(){
        this.reset(FIELD_TARGETTYPEPSDEFNAME);
    }

    /**
     * 设置 目标类型属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFNAME}
     * <P>
     * 等同 {@link #setTargetTypePSDEFName}
     * @param targetTypePSDEFName
     */
    @JsonIgnore
    public PSSysMsgTarget targettypepsdefname(String targetTypePSDEFName){
        this.setTargetTypePSDEFName(targetTypePSDEFName);
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
    public PSSysMsgTarget updatedate(String updateDate){
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
    public PSSysMsgTarget updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USER2PSDEFID</B>&nbsp;用户自定义属性2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USER2PSDEFID = "user2psdefid";

    /**
     * 设置 用户自定义属性2
     * 
     * @param user2PSDEFId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEFID)
    public void setUser2PSDEFId(String user2PSDEFId){
        this.set(FIELD_USER2PSDEFID, user2PSDEFId);
    }
    
    /**
     * 获取 用户自定义属性2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEFId(){
        Object objValue = this.get(FIELD_USER2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEFIdDirty(){
        if(this.contains(FIELD_USER2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性2
     */
    @JsonIgnore
    public void resetUser2PSDEFId(){
        this.reset(FIELD_USER2PSDEFID);
    }

    /**
     * 设置 用户自定义属性2
     * <P>
     * 等同 {@link #setUser2PSDEFId}
     * @param user2PSDEFId
     */
    @JsonIgnore
    public PSSysMsgTarget user2psdefid(String user2PSDEFId){
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    /**
     * 设置 用户自定义属性2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget user2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUser2PSDEFId(null);
            this.setUser2PSDEFName(null);
        }
        else{
            this.setUser2PSDEFId(pSDEField.getPSDEFieldId());
            this.setUser2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEFNAME</B>&nbsp;用户自定义属性2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEFID}
     */
    public final static String FIELD_USER2PSDEFNAME = "user2psdefname";

    /**
     * 设置 用户自定义属性2
     * 
     * @param user2PSDEFName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEFNAME)
    public void setUser2PSDEFName(String user2PSDEFName){
        this.set(FIELD_USER2PSDEFNAME, user2PSDEFName);
    }
    
    /**
     * 获取 用户自定义属性2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEFName(){
        Object objValue = this.get(FIELD_USER2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEFNameDirty(){
        if(this.contains(FIELD_USER2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性2
     */
    @JsonIgnore
    public void resetUser2PSDEFName(){
        this.reset(FIELD_USER2PSDEFNAME);
    }

    /**
     * 设置 用户自定义属性2
     * <P>
     * 等同 {@link #setUser2PSDEFName}
     * @param user2PSDEFName
     */
    @JsonIgnore
    public PSSysMsgTarget user2psdefname(String user2PSDEFName){
        this.setUser2PSDEFName(user2PSDEFName);
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
    public PSSysMsgTarget usercat(String userCat){
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
    public PSSysMsgTarget usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPSDEFID</B>&nbsp;用户自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USERPSDEFID = "userpsdefid";

    /**
     * 设置 用户自定义属性
     * 
     * @param userPSDEFId
     * 
     */
    @JsonProperty(FIELD_USERPSDEFID)
    public void setUserPSDEFId(String userPSDEFId){
        this.set(FIELD_USERPSDEFID, userPSDEFId);
    }
    
    /**
     * 获取 用户自定义属性  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEFId(){
        Object objValue = this.get(FIELD_USERPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEFIdDirty(){
        if(this.contains(FIELD_USERPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性
     */
    @JsonIgnore
    public void resetUserPSDEFId(){
        this.reset(FIELD_USERPSDEFID);
    }

    /**
     * 设置 用户自定义属性
     * <P>
     * 等同 {@link #setUserPSDEFId}
     * @param userPSDEFId
     */
    @JsonIgnore
    public PSSysMsgTarget userpsdefid(String userPSDEFId){
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    /**
     * 设置 用户自定义属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgTarget userpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUserPSDEFId(null);
            this.setUserPSDEFName(null);
        }
        else{
            this.setUserPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USERPSDEFNAME</B>&nbsp;用户自定义属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEFID}
     */
    public final static String FIELD_USERPSDEFNAME = "userpsdefname";

    /**
     * 设置 用户自定义属性
     * 
     * @param userPSDEFName
     * 
     */
    @JsonProperty(FIELD_USERPSDEFNAME)
    public void setUserPSDEFName(String userPSDEFName){
        this.set(FIELD_USERPSDEFNAME, userPSDEFName);
    }
    
    /**
     * 获取 用户自定义属性  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEFName(){
        Object objValue = this.get(FIELD_USERPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEFNameDirty(){
        if(this.contains(FIELD_USERPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性
     */
    @JsonIgnore
    public void resetUserPSDEFName(){
        this.reset(FIELD_USERPSDEFNAME);
    }

    /**
     * 设置 用户自定义属性
     * <P>
     * 等同 {@link #setUserPSDEFName}
     * @param userPSDEFName
     */
    @JsonIgnore
    public PSSysMsgTarget userpsdefname(String userPSDEFName){
        this.setUserPSDEFName(userPSDEFName);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysMsgTarget usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysMsgTarget usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysMsgTarget usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysMsgTarget usertag4(String userTag4){
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
    public PSSysMsgTarget validflag(Integer validFlag){
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
    public PSSysMsgTarget validflag(Boolean validFlag){
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
        return this.getPSSysMsgTargetId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysMsgTargetId(strValue);
    }

    @JsonIgnore
    public PSSysMsgTarget id(String strValue){
        this.setPSSysMsgTargetId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysMsgTarget){
            PSSysMsgTarget model = (PSSysMsgTarget)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
