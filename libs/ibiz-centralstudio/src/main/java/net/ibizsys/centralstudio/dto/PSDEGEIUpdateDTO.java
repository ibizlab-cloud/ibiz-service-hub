package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEGEIUPDATE</B>表格编辑项更新模式 模型传输对象
 * <P>
 * 实体数据表格编辑项更新模型，定义了局部更新数据表格的模式，包括了调用的行为及更新的明细内容
 */
public class PSDEGEIUpdateDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEGEIUpdateDTO(){
    }      

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示，指定表格编辑项更新操作在发送请求到接受反馈这段时间是否显示【处理中】等加载信息，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示，详细说明：{@link #FIELD_BUSYINDICATOR}
     * 
     * @param busyIndicator
     * 
     */
    @JsonProperty(FIELD_BUSYINDICATOR)
    public void setBusyIndicator(Integer busyIndicator){
        this.set(FIELD_BUSYINDICATOR, busyIndicator);
    }
    
    /**
     * 获取 显示处理提示  
     * @return
     */
    @JsonIgnore
    public Integer getBusyIndicator(){
        Object objValue = this.get(FIELD_BUSYINDICATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示处理提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBusyIndicatorDirty(){
        if(this.contains(FIELD_BUSYINDICATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示处理提示
     */
    @JsonIgnore
    public void resetBusyIndicator(){
        this.reset(FIELD_BUSYINDICATOR);
    }

    /**
     * 设置 显示处理提示，详细说明：{@link #FIELD_BUSYINDICATOR}
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示，详细说明：{@link #FIELD_BUSYINDICATOR}
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据表格编辑项更新的代码标识，必须在所在表格中具备唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEGEIUpdateDTO codename(String codeName){
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
    public PSDEGEIUpdateDTO createdate(Timestamp createDate){
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
    public PSDEGEIUpdateDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 脚本代码  
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
     * 判断 脚本代码 是否指定值，包括空值
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
     * 重置 脚本代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 脚本代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEGEIUpdateDTO custommode(Integer customMode){
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
    public PSDEGEIUpdateDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEGEIUpdateDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;后台处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 后台处理对象
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 后台处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 后台处理对象
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 后台处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psachandlerid(PSACHandlerDTO pSACHandler){
        if(pSACHandler == null){
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        }
        else{
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;后台处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 后台处理对象
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 后台处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 后台处理对象
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定数据表格编辑项更新调用的实体行为，来自所在表格的实体的行为
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
    public PSDEGEIUpdateDTO psdeactionid(String pSDEActionId){
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
    public PSDEGEIUpdateDTO psdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定数据表格编辑项更新调用的实体行为，来自所在表格的实体的行为
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
    public PSDEGEIUpdateDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEGEIUPDATEID</B>&nbsp;实体表格编辑项更新模式标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEGEIUPDATEID = "psdegeiupdateid";

    /**
     * 设置 实体表格编辑项更新模式标识
     * 
     * @param pSDEGEIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUPDATEID)
    public void setPSDEGEIUpdateId(String pSDEGEIUpdateId){
        this.set(FIELD_PSDEGEIUPDATEID, pSDEGEIUpdateId);
    }
    
    /**
     * 获取 实体表格编辑项更新模式标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUpdateId(){
        Object objValue = this.get(FIELD_PSDEGEIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格编辑项更新模式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUpdateIdDirty(){
        if(this.contains(FIELD_PSDEGEIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格编辑项更新模式标识
     */
    @JsonIgnore
    public void resetPSDEGEIUpdateId(){
        this.reset(FIELD_PSDEGEIUPDATEID);
    }

    /**
     * 设置 实体表格编辑项更新模式标识
     * <P>
     * 等同 {@link #setPSDEGEIUpdateId}
     * @param pSDEGEIUpdateId
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psdegeiupdateid(String pSDEGEIUpdateId){
        this.setPSDEGEIUpdateId(pSDEGEIUpdateId);
        return this;
    }

    /**
     * <B>PSDEGEIUPDATENAME</B>&nbsp;表格更新名称，指定表格编辑项更新的名称，必须在所在表格中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEGEIUPDATENAME = "psdegeiupdatename";

    /**
     * 设置 表格更新名称，详细说明：{@link #FIELD_PSDEGEIUPDATENAME}
     * 
     * @param pSDEGEIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUPDATENAME)
    public void setPSDEGEIUpdateName(String pSDEGEIUpdateName){
        this.set(FIELD_PSDEGEIUPDATENAME, pSDEGEIUpdateName);
    }
    
    /**
     * 获取 表格更新名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUpdateName(){
        Object objValue = this.get(FIELD_PSDEGEIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格更新名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUpdateNameDirty(){
        if(this.contains(FIELD_PSDEGEIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格更新名称
     */
    @JsonIgnore
    public void resetPSDEGEIUpdateName(){
        this.reset(FIELD_PSDEGEIUPDATENAME);
    }

    /**
     * 设置 表格更新名称，详细说明：{@link #FIELD_PSDEGEIUPDATENAME}
     * <P>
     * 等同 {@link #setPSDEGEIUpdateName}
     * @param pSDEGEIUpdateName
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psdegeiupdatename(String pSDEGEIUpdateName){
        this.setPSDEGEIUpdateName(pSDEGEIUpdateName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEGEIUpdateName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEGEIUpdateName(strName);
    }

    @JsonIgnore
    public PSDEGEIUpdateDTO name(String strName){
        this.setPSDEGEIUpdateName(strName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体表格，指定表格编辑项更新所在的表格对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEGridDTO} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 实体表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridId(){
        Object objValue = this.get(FIELD_PSDEGRIDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridIdDirty(){
        if(this.contains(FIELD_PSDEGRIDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * 设置 实体表格，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psdegridid(PSDEGridDTO pSDEGrid){
        if(pSDEGrid == null){
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        }
        else{
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    /**
     * <B>PSDEGRIDNAME</B>&nbsp;实体表格，指定表格编辑项更新所在的表格对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDID}
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * 
     * @param pSDEGridName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDNAME)
    public void setPSDEGridName(String pSDEGridName){
        this.set(FIELD_PSDEGRIDNAME, pSDEGridName);
    }
    
    /**
     * 获取 实体表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridName(){
        Object objValue = this.get(FIELD_PSDEGRIDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridNameDirty(){
        if(this.contains(FIELD_PSDEGRIDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格
     */
    @JsonIgnore
    public void resetPSDEGridName(){
        this.reset(FIELD_PSDEGRIDNAME);
    }

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDEGEIUpdateDTO psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
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
    public PSDEGEIUpdateDTO updatedate(Timestamp updateDate){
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
    public PSDEGEIUpdateDTO updateman(String updateMan){
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
    public PSDEGEIUpdateDTO usertag(String userTag){
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
    public PSDEGEIUpdateDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEGEIUpdateId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEGEIUpdateId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEGEIUpdateId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEGEIUpdateId(strValue);
    }

    @JsonIgnore
    public PSDEGEIUpdateDTO id(String strValue){
        this.setPSDEGEIUpdateId(strValue);
        return this;
    }


    /**
     *  表格编辑项更新成员 成员集合
     */
    public final static String FIELD_PSDEGEIDETAILS = "psdegeiudetails";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO> psdegeiudetails;

    /**
     * 获取 表格编辑项更新成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEGEIDETAILS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO> getPSDEGEIDetails(){
        return this.psdegeiudetails;
    }

    /**
     * 设置 表格编辑项更新成员 成员集合  
     * @param psdegeiudetails
     */
    @JsonProperty(FIELD_PSDEGEIDETAILS)
    public void setPSDEGEIDetails(java.util.List<net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO> psdegeiudetails){
        this.psdegeiudetails = psdegeiudetails;
    }

    /**
     * 获取 表格编辑项更新成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO> getPSDEGEIDetailsIf(){
        if(this.psdegeiudetails == null){
            this.psdegeiudetails = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEGEIUDetailDTO>();          
        }
        return this.psdegeiudetails;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEGEIUpdateDTO){
            PSDEGEIUpdateDTO dto = (PSDEGEIUpdateDTO)iEntity;
            dto.setPSDEGEIDetails(this.getPSDEGEIDetails());
        }
        super.copyTo(iEntity);
    }
}
