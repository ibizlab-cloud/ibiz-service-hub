package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWFLINK</B>流程处理连接 模型传输对象
 * <P>
 * 流程处理连接模型，支持定义不同类型的流程处理节点连接
 */
public class PSWFLink extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWFLink(){
    }      

    /**
     * <B>ACTIONFIELD</B>&nbsp;实际操作字段，指定流程交互处理连接的操作值存储属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_ACTIONFIELD = "actionfield";

    /**
     * 设置 实际操作字段，详细说明：{@link #FIELD_ACTIONFIELD}
     * 
     * @param actionField
     * 
     */
    @JsonProperty(FIELD_ACTIONFIELD)
    public void setActionField(String actionField){
        this.set(FIELD_ACTIONFIELD, actionField);
    }
    
    /**
     * 获取 实际操作字段  
     * @return
     */
    @JsonIgnore
    public String getActionField(){
        Object objValue = this.get(FIELD_ACTIONFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实际操作字段 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionFieldDirty(){
        if(this.contains(FIELD_ACTIONFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实际操作字段
     */
    @JsonIgnore
    public void resetActionField(){
        this.reset(FIELD_ACTIONFIELD);
    }

    /**
     * 设置 实际操作字段，详细说明：{@link #FIELD_ACTIONFIELD}
     * <P>
     * 等同 {@link #setActionField}
     * @param actionField
     */
    @JsonIgnore
    public PSWFLink actionfield(String actionField){
        this.setActionField(actionField);
        return this;
    }

    /**
     * <B>ACTIONPSCODELISTID</B>&nbsp;操作代码表，指定流程交互处理连接的操作代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_ACTIONPSCODELISTID = "actionpscodelistid";

    /**
     * 设置 操作代码表，详细说明：{@link #FIELD_ACTIONPSCODELISTID}
     * 
     * @param actionPSCodeListId
     * 
     */
    @JsonProperty(FIELD_ACTIONPSCODELISTID)
    public void setActionPSCodeListId(String actionPSCodeListId){
        this.set(FIELD_ACTIONPSCODELISTID, actionPSCodeListId);
    }
    
    /**
     * 获取 操作代码表  
     * @return
     */
    @JsonIgnore
    public String getActionPSCodeListId(){
        Object objValue = this.get(FIELD_ACTIONPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionPSCodeListIdDirty(){
        if(this.contains(FIELD_ACTIONPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作代码表
     */
    @JsonIgnore
    public void resetActionPSCodeListId(){
        this.reset(FIELD_ACTIONPSCODELISTID);
    }

    /**
     * 设置 操作代码表，详细说明：{@link #FIELD_ACTIONPSCODELISTID}
     * <P>
     * 等同 {@link #setActionPSCodeListId}
     * @param actionPSCodeListId
     */
    @JsonIgnore
    public PSWFLink actionpscodelistid(String actionPSCodeListId){
        this.setActionPSCodeListId(actionPSCodeListId);
        return this;
    }

    /**
     * 设置 操作代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setActionPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSWFLink actionpscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setActionPSCodeListId(null);
            this.setActionPSCodeListName(null);
        }
        else{
            this.setActionPSCodeListId(pSCodeList.getPSCodeListId());
            this.setActionPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>ACTIONPSCODELISTNAME</B>&nbsp;操作代码表，指定流程交互处理连接的操作代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ACTIONPSCODELISTID}
     */
    public final static String FIELD_ACTIONPSCODELISTNAME = "actionpscodelistname";

    /**
     * 设置 操作代码表，详细说明：{@link #FIELD_ACTIONPSCODELISTNAME}
     * 
     * @param actionPSCodeListName
     * 
     */
    @JsonProperty(FIELD_ACTIONPSCODELISTNAME)
    public void setActionPSCodeListName(String actionPSCodeListName){
        this.set(FIELD_ACTIONPSCODELISTNAME, actionPSCodeListName);
    }
    
    /**
     * 获取 操作代码表  
     * @return
     */
    @JsonIgnore
    public String getActionPSCodeListName(){
        Object objValue = this.get(FIELD_ACTIONPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionPSCodeListNameDirty(){
        if(this.contains(FIELD_ACTIONPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作代码表
     */
    @JsonIgnore
    public void resetActionPSCodeListName(){
        this.reset(FIELD_ACTIONPSCODELISTNAME);
    }

    /**
     * 设置 操作代码表，详细说明：{@link #FIELD_ACTIONPSCODELISTNAME}
     * <P>
     * 等同 {@link #setActionPSCodeListName}
     * @param actionPSCodeListName
     */
    @JsonIgnore
    public PSWFLink actionpscodelistname(String actionPSCodeListName){
        this.setActionPSCodeListName(actionPSCodeListName);
        return this;
    }

    /**
     * <B>ACTORFIELDS</B>&nbsp;附加用户属性
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_ACTORFIELDS = "actorfields";

    /**
     * 设置 附加用户属性
     * 
     * @param actorFields
     * 
     */
    @JsonProperty(FIELD_ACTORFIELDS)
    public void setActorFields(String actorFields){
        this.set(FIELD_ACTORFIELDS, actorFields);
    }
    
    /**
     * 获取 附加用户属性  
     * @return
     */
    @JsonIgnore
    public String getActorFields(){
        Object objValue = this.get(FIELD_ACTORFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加用户属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActorFieldsDirty(){
        if(this.contains(FIELD_ACTORFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加用户属性
     */
    @JsonIgnore
    public void resetActorFields(){
        this.reset(FIELD_ACTORFIELDS);
    }

    /**
     * 设置 附加用户属性
     * <P>
     * 等同 {@link #setActorFields}
     * @param actorFields
     */
    @JsonIgnore
    public PSWFLink actorfields(String actorFields){
        this.setActorFields(actorFields);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定流程处理连接的代码标识，需在起始处理节点中具备唯一性
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
    public PSWFLink codename(String codeName){
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
    public PSWFLink createdate(String createDate){
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
    public PSWFLink createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件，指定流程处理连接的自定义条件，需设置启用自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件，详细说明：{@link #FIELD_CUSTOMCOND}
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件，详细说明：{@link #FIELD_CUSTOMCOND}
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSWFLink customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMCONDFLAG</B>&nbsp;启用自定义条件，指定流程处理连接是否启用自定义条件，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMCONDFLAG = "customcondflag";

    /**
     * 设置 启用自定义条件，详细说明：{@link #FIELD_CUSTOMCONDFLAG}
     * 
     * @param customCondFlag
     * 
     */
    @JsonProperty(FIELD_CUSTOMCONDFLAG)
    public void setCustomCondFlag(Integer customCondFlag){
        this.set(FIELD_CUSTOMCONDFLAG, customCondFlag);
    }
    
    /**
     * 获取 启用自定义条件  
     * @return
     */
    @JsonIgnore
    public Integer getCustomCondFlag(){
        Object objValue = this.get(FIELD_CUSTOMCONDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondFlagDirty(){
        if(this.contains(FIELD_CUSTOMCONDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用自定义条件
     */
    @JsonIgnore
    public void resetCustomCondFlag(){
        this.reset(FIELD_CUSTOMCONDFLAG);
    }

    /**
     * 设置 启用自定义条件，详细说明：{@link #FIELD_CUSTOMCONDFLAG}
     * <P>
     * 等同 {@link #setCustomCondFlag}
     * @param customCondFlag
     */
    @JsonIgnore
    public PSWFLink customcondflag(Integer customCondFlag){
        this.setCustomCondFlag(customCondFlag);
        return this;
    }

     /**
     * 设置 启用自定义条件，详细说明：{@link #FIELD_CUSTOMCONDFLAG}
     * <P>
     * 等同 {@link #setCustomCondFlag}
     * @param customCondFlag
     */
    @JsonIgnore
    public PSWFLink customcondflag(Boolean customCondFlag){
        if(customCondFlag == null){
            this.setCustomCondFlag(null);
        }
        else{
            this.setCustomCondFlag(customCondFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFAULTLINK</B>&nbsp;默认连接，指定流程处理连接是否为默认连接，默认连接在其它连接无法满足条件时使用，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTLINK = "defaultlink";

    /**
     * 设置 默认连接，详细说明：{@link #FIELD_DEFAULTLINK}
     * 
     * @param defaultLink
     * 
     */
    @JsonProperty(FIELD_DEFAULTLINK)
    public void setDefaultLink(Integer defaultLink){
        this.set(FIELD_DEFAULTLINK, defaultLink);
    }
    
    /**
     * 获取 默认连接  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultLink(){
        Object objValue = this.get(FIELD_DEFAULTLINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认连接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultLinkDirty(){
        if(this.contains(FIELD_DEFAULTLINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认连接
     */
    @JsonIgnore
    public void resetDefaultLink(){
        this.reset(FIELD_DEFAULTLINK);
    }

    /**
     * 设置 默认连接，详细说明：{@link #FIELD_DEFAULTLINK}
     * <P>
     * 等同 {@link #setDefaultLink}
     * @param defaultLink
     */
    @JsonIgnore
    public PSWFLink defaultlink(Integer defaultLink){
        this.setDefaultLink(defaultLink);
        return this;
    }

     /**
     * 设置 默认连接，详细说明：{@link #FIELD_DEFAULTLINK}
     * <P>
     * 等同 {@link #setDefaultLink}
     * @param defaultLink
     */
    @JsonIgnore
    public PSWFLink defaultlink(Boolean defaultLink){
        if(defaultLink == null){
            this.setDefaultLink(null);
        }
        else{
            this.setDefaultLink(defaultLink?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DSTENDPOINT</B>&nbsp;目标端点
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTENDPOINT = "dstendpoint";

    /**
     * 设置 目标端点
     * 
     * @param dstEndPoint
     * 
     */
    @JsonProperty(FIELD_DSTENDPOINT)
    public void setDstEndPoint(String dstEndPoint){
        this.set(FIELD_DSTENDPOINT, dstEndPoint);
    }
    
    /**
     * 获取 目标端点  
     * @return
     */
    @JsonIgnore
    public String getDstEndPoint(){
        Object objValue = this.get(FIELD_DSTENDPOINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标端点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstEndPointDirty(){
        if(this.contains(FIELD_DSTENDPOINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标端点
     */
    @JsonIgnore
    public void resetDstEndPoint(){
        this.reset(FIELD_DSTENDPOINT);
    }

    /**
     * 设置 目标端点
     * <P>
     * 等同 {@link #setDstEndPoint}
     * @param dstEndPoint
     */
    @JsonIgnore
    public PSWFLink dstendpoint(String dstEndPoint){
        this.setDstEndPoint(dstEndPoint);
        return this;
    }

    /**
     * <B>ENABLEMOBILE</B>&nbsp;支持移动端操作，指定流程交互处理连接是否支持在移动端进行操作，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMOBILE = "enablemobile";

    /**
     * 设置 支持移动端操作，详细说明：{@link #FIELD_ENABLEMOBILE}
     * 
     * @param enableMobile
     * 
     */
    @JsonProperty(FIELD_ENABLEMOBILE)
    public void setEnableMobile(Integer enableMobile){
        this.set(FIELD_ENABLEMOBILE, enableMobile);
    }
    
    /**
     * 获取 支持移动端操作  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMobile(){
        Object objValue = this.get(FIELD_ENABLEMOBILE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持移动端操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMobileDirty(){
        if(this.contains(FIELD_ENABLEMOBILE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持移动端操作
     */
    @JsonIgnore
    public void resetEnableMobile(){
        this.reset(FIELD_ENABLEMOBILE);
    }

    /**
     * 设置 支持移动端操作，详细说明：{@link #FIELD_ENABLEMOBILE}
     * <P>
     * 等同 {@link #setEnableMobile}
     * @param enableMobile
     */
    @JsonIgnore
    public PSWFLink enablemobile(Integer enableMobile){
        this.setEnableMobile(enableMobile);
        return this;
    }

     /**
     * 设置 支持移动端操作，详细说明：{@link #FIELD_ENABLEMOBILE}
     * <P>
     * 等同 {@link #setEnableMobile}
     * @param enableMobile
     */
    @JsonIgnore
    public PSWFLink enablemobile(Boolean enableMobile){
        if(enableMobile == null){
            this.setEnableMobile(null);
        }
        else{
            this.setEnableMobile(enableMobile?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FORMCODENAME</B>&nbsp;表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_FORMCODENAME = "formcodename";

    /**
     * 设置 表单标记
     * 
     * @param formCodeName
     * 
     */
    @JsonProperty(FIELD_FORMCODENAME)
    public void setFormCodeName(String formCodeName){
        this.set(FIELD_FORMCODENAME, formCodeName);
    }
    
    /**
     * 获取 表单标记  
     * @return
     */
    @JsonIgnore
    public String getFormCodeName(){
        Object objValue = this.get(FIELD_FORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormCodeNameDirty(){
        if(this.contains(FIELD_FORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标记
     */
    @JsonIgnore
    public void resetFormCodeName(){
        this.reset(FIELD_FORMCODENAME);
    }

    /**
     * 设置 表单标记
     * <P>
     * 等同 {@link #setFormCodeName}
     * @param formCodeName
     */
    @JsonIgnore
    public PSWFLink formcodename(String formCodeName){
        this.setFormCodeName(formCodeName);
        return this;
    }

    /**
     * <B>FROMPSWFPROCID</B>&nbsp;起始处理，指定流程处理连接的起始处理节点
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFProcess} 
     */
    public final static String FIELD_FROMPSWFPROCID = "frompswfprocid";

    /**
     * 设置 起始处理，详细说明：{@link #FIELD_FROMPSWFPROCID}
     * 
     * @param fromPSWFProcId
     * 
     */
    @JsonProperty(FIELD_FROMPSWFPROCID)
    public void setFromPSWFProcId(String fromPSWFProcId){
        this.set(FIELD_FROMPSWFPROCID, fromPSWFProcId);
    }
    
    /**
     * 获取 起始处理  
     * @return
     */
    @JsonIgnore
    public String getFromPSWFProcId(){
        Object objValue = this.get(FIELD_FROMPSWFPROCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 起始处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFromPSWFProcIdDirty(){
        if(this.contains(FIELD_FROMPSWFPROCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 起始处理
     */
    @JsonIgnore
    public void resetFromPSWFProcId(){
        this.reset(FIELD_FROMPSWFPROCID);
    }

    /**
     * 设置 起始处理，详细说明：{@link #FIELD_FROMPSWFPROCID}
     * <P>
     * 等同 {@link #setFromPSWFProcId}
     * @param fromPSWFProcId
     */
    @JsonIgnore
    public PSWFLink frompswfprocid(String fromPSWFProcId){
        this.setFromPSWFProcId(fromPSWFProcId);
        return this;
    }

    /**
     * 设置 起始处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFromPSWFProcId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSWFLink frompswfprocid(PSWFProcess pSWFProcess){
        if(pSWFProcess == null){
            this.setFromPSWFProcId(null);
            this.setFromPSWFProcName(null);
            this.setPSDEId(null);
            this.setPSWFDEId(null);
        }
        else{
            this.setFromPSWFProcId(pSWFProcess.getPSWFProcessId());
            this.setFromPSWFProcName(pSWFProcess.getPSWFProcessName());
            this.setPSDEId(pSWFProcess.getPSDEId());
            this.setPSWFDEId(pSWFProcess.getPSWFDEId());
        }
        return this;
    }

    /**
     * <B>FROMPSWFPROCNAME</B>&nbsp;起始处理，指定流程处理连接的起始处理节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FROMPSWFPROCID}
     */
    public final static String FIELD_FROMPSWFPROCNAME = "frompswfprocname";

    /**
     * 设置 起始处理，详细说明：{@link #FIELD_FROMPSWFPROCNAME}
     * 
     * @param fromPSWFProcName
     * 
     */
    @JsonProperty(FIELD_FROMPSWFPROCNAME)
    public void setFromPSWFProcName(String fromPSWFProcName){
        this.set(FIELD_FROMPSWFPROCNAME, fromPSWFProcName);
    }
    
    /**
     * 获取 起始处理  
     * @return
     */
    @JsonIgnore
    public String getFromPSWFProcName(){
        Object objValue = this.get(FIELD_FROMPSWFPROCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 起始处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFromPSWFProcNameDirty(){
        if(this.contains(FIELD_FROMPSWFPROCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 起始处理
     */
    @JsonIgnore
    public void resetFromPSWFProcName(){
        this.reset(FIELD_FROMPSWFPROCNAME);
    }

    /**
     * 设置 起始处理，详细说明：{@link #FIELD_FROMPSWFPROCNAME}
     * <P>
     * 等同 {@link #setFromPSWFProcName}
     * @param fromPSWFProcName
     */
    @JsonIgnore
    public PSWFLink frompswfprocname(String fromPSWFProcName){
        this.setFromPSWFProcName(fromPSWFProcName);
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;逻辑名称语言资源，指定流程处理连接的逻辑名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * 
     * @param lNPSLanResId
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESID)
    public void setLNPSLanResId(String lNPSLanResId){
        this.set(FIELD_LNPSLANRESID, lNPSLanResId);
    }
    
    /**
     * 获取 逻辑名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResId(){
        Object objValue = this.get(FIELD_LNPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResIdDirty(){
        if(this.contains(FIELD_LNPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResId(){
        this.reset(FIELD_LNPSLANRESID);
    }

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSWFLink lnpslanresid(String lNPSLanResId){
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    /**
     * 设置 逻辑名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSWFLink lnpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        }
        else{
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>LNPSLANRESNAME</B>&nbsp;逻辑名称语言资源，指定流程处理连接的逻辑名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * 
     * @param lNPSLanResName
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESNAME)
    public void setLNPSLanResName(String lNPSLanResName){
        this.set(FIELD_LNPSLANRESNAME, lNPSLanResName);
    }
    
    /**
     * 获取 逻辑名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResName(){
        Object objValue = this.get(FIELD_LNPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResNameDirty(){
        if(this.contains(FIELD_LNPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResName(){
        this.reset(FIELD_LNPSLANRESNAME);
    }

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSWFLink lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定流程处理连接的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSWFLink logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSWFLink memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MEMOFIELD</B>&nbsp;处理意见字段，指定流程交互处理连接的处理意见存储属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_MEMOFIELD = "memofield";

    /**
     * 设置 处理意见字段，详细说明：{@link #FIELD_MEMOFIELD}
     * 
     * @param memoField
     * 
     */
    @JsonProperty(FIELD_MEMOFIELD)
    public void setMemoField(String memoField){
        this.set(FIELD_MEMOFIELD, memoField);
    }
    
    /**
     * 获取 处理意见字段  
     * @return
     */
    @JsonIgnore
    public String getMemoField(){
        Object objValue = this.get(FIELD_MEMOFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理意见字段 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMemoFieldDirty(){
        if(this.contains(FIELD_MEMOFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理意见字段
     */
    @JsonIgnore
    public void resetMemoField(){
        this.reset(FIELD_MEMOFIELD);
    }

    /**
     * 设置 处理意见字段，详细说明：{@link #FIELD_MEMOFIELD}
     * <P>
     * 等同 {@link #setMemoField}
     * @param memoField
     */
    @JsonIgnore
    public PSWFLink memofield(String memoField){
        this.setMemoField(memoField);
        return this;
    }

    /**
     * <B>MOBFORMCODENAME</B>&nbsp;移动端表单标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBFORMCODENAME = "mobformcodename";

    /**
     * 设置 移动端表单标记
     * 
     * @param mobFormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBFORMCODENAME)
    public void setMobFormCodeName(String mobFormCodeName){
        this.set(FIELD_MOBFORMCODENAME, mobFormCodeName);
    }
    
    /**
     * 获取 移动端表单标记  
     * @return
     */
    @JsonIgnore
    public String getMobFormCodeName(){
        Object objValue = this.get(FIELD_MOBFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端表单标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFormCodeNameDirty(){
        if(this.contains(FIELD_MOBFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端表单标记
     */
    @JsonIgnore
    public void resetMobFormCodeName(){
        this.reset(FIELD_MOBFORMCODENAME);
    }

    /**
     * 设置 移动端表单标记
     * <P>
     * 等同 {@link #setMobFormCodeName}
     * @param mobFormCodeName
     */
    @JsonIgnore
    public PSWFLink mobformcodename(String mobFormCodeName){
        this.setMobFormCodeName(mobFormCodeName);
        return this;
    }

    /**
     * <B>MOBPSDEFORMID</B>&nbsp;移动端操作表单，指定流程交互处理连接的移动端操作表单，在工作流动态处理视图使用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBPSDEFORMID = "mobpsdeformid";

    /**
     * 设置 移动端操作表单，详细说明：{@link #FIELD_MOBPSDEFORMID}
     * 
     * @param mobPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMID)
    public void setMobPSDEFormId(String mobPSDEFormId){
        this.set(FIELD_MOBPSDEFORMID, mobPSDEFormId);
    }
    
    /**
     * 获取 移动端操作表单  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEFormId(){
        Object objValue = this.get(FIELD_MOBPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEFormIdDirty(){
        if(this.contains(FIELD_MOBPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作表单
     */
    @JsonIgnore
    public void resetMobPSDEFormId(){
        this.reset(FIELD_MOBPSDEFORMID);
    }

    /**
     * 设置 移动端操作表单，详细说明：{@link #FIELD_MOBPSDEFORMID}
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param mobPSDEFormId
     */
    @JsonIgnore
    public PSWFLink mobpsdeformid(String mobPSDEFormId){
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端操作表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFLink mobpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobFormCodeName(null);
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        }
        else{
            this.setMobFormCodeName(pSDEForm.getCodeName());
            this.setMobPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEFORMNAME</B>&nbsp;移动端操作表单，指定流程交互处理连接的移动端操作表单，在工作流动态处理视图使用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBPSDEFORMNAME = "mobpsdeformname";

    /**
     * 设置 移动端操作表单，详细说明：{@link #FIELD_MOBPSDEFORMNAME}
     * 
     * @param mobPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMNAME)
    public void setMobPSDEFormName(String mobPSDEFormName){
        this.set(FIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }
    
    /**
     * 获取 移动端操作表单  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEFormName(){
        Object objValue = this.get(FIELD_MOBPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEFormNameDirty(){
        if(this.contains(FIELD_MOBPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作表单
     */
    @JsonIgnore
    public void resetMobPSDEFormName(){
        this.reset(FIELD_MOBPSDEFORMNAME);
    }

    /**
     * 设置 移动端操作表单，详细说明：{@link #FIELD_MOBPSDEFORMNAME}
     * <P>
     * 等同 {@link #setMobPSDEFormName}
     * @param mobPSDEFormName
     */
    @JsonIgnore
    public PSWFLink mobpsdeformname(String mobPSDEFormName){
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    /**
     * <B>MOBPSDEVIEWID</B>&nbsp;移动端操作视图，指定流程交互处理连接的移动端操作视图，在工作流动态处理视图使用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MOBPSDEVIEWID = "mobpsdeviewid";

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWID}
     * 
     * @param mobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWID)
    public void setMobPSDEViewId(String mobPSDEViewId){
        this.set(FIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }
    
    /**
     * 获取 移动端操作视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewId(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作视图
     */
    @JsonIgnore
    public void resetMobPSDEViewId(){
        this.reset(FIELD_MOBPSDEVIEWID);
    }

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWID}
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param mobPSDEViewId
     */
    @JsonIgnore
    public PSWFLink mobpsdeviewid(String mobPSDEViewId){
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFLink mobpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
            this.setMobViewCodeName(null);
        }
        else{
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
            this.setMobViewCodeName(pSDEViewBase.getCodeName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEVIEWNAME</B>&nbsp;移动端操作视图，指定流程交互处理连接的移动端操作视图，在工作流动态处理视图使用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWNAME}
     * 
     * @param mobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWNAME)
    public void setMobPSDEViewName(String mobPSDEViewName){
        this.set(FIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }
    
    /**
     * 获取 移动端操作视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewName(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作视图
     */
    @JsonIgnore
    public void resetMobPSDEViewName(){
        this.reset(FIELD_MOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_MOBPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobPSDEViewName}
     * @param mobPSDEViewName
     */
    @JsonIgnore
    public PSWFLink mobpsdeviewname(String mobPSDEViewName){
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    /**
     * <B>MOBVIEWCODENAME</B>&nbsp;移动端操作视图标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBVIEWCODENAME = "mobviewcodename";

    /**
     * 设置 移动端操作视图标记
     * 
     * @param mobViewCodeName
     * 
     */
    @JsonProperty(FIELD_MOBVIEWCODENAME)
    public void setMobViewCodeName(String mobViewCodeName){
        this.set(FIELD_MOBVIEWCODENAME, mobViewCodeName);
    }
    
    /**
     * 获取 移动端操作视图标记  
     * @return
     */
    @JsonIgnore
    public String getMobViewCodeName(){
        Object objValue = this.get(FIELD_MOBVIEWCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端操作视图标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobViewCodeNameDirty(){
        if(this.contains(FIELD_MOBVIEWCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端操作视图标记
     */
    @JsonIgnore
    public void resetMobViewCodeName(){
        this.reset(FIELD_MOBVIEWCODENAME);
    }

    /**
     * 设置 移动端操作视图标记
     * <P>
     * 等同 {@link #setMobViewCodeName}
     * @param mobViewCodeName
     */
    @JsonIgnore
    public PSWFLink mobviewcodename(String mobViewCodeName){
        this.setMobViewCodeName(mobViewCodeName);
        return this;
    }

    /**
     * <B>MODELID</B>&nbsp;模型标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODELID = "modelid";

    /**
     * 设置 模型标识
     * 
     * @param modelId
     * 
     */
    @JsonProperty(FIELD_MODELID)
    public void setModelId(String modelId){
        this.set(FIELD_MODELID, modelId);
    }
    
    /**
     * 获取 模型标识  
     * @return
     */
    @JsonIgnore
    public String getModelId(){
        Object objValue = this.get(FIELD_MODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelIdDirty(){
        if(this.contains(FIELD_MODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标识
     */
    @JsonIgnore
    public void resetModelId(){
        this.reset(FIELD_MODELID);
    }

    /**
     * 设置 模型标识
     * <P>
     * 等同 {@link #setModelId}
     * @param modelId
     */
    @JsonIgnore
    public PSWFLink modelid(String modelId){
        this.setModelId(modelId);
        return this;
    }

    /**
     * <B>NEXTCOND</B>&nbsp;下一步条件，指定流程交互处理连接的下一步简单条件，如ALL、ANY，由工作流引擎约定
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_NEXTCOND = "nextcond";

    /**
     * 设置 下一步条件，详细说明：{@link #FIELD_NEXTCOND}
     * 
     * @param nextCond
     * 
     */
    @JsonProperty(FIELD_NEXTCOND)
    public void setNextCond(String nextCond){
        this.set(FIELD_NEXTCOND, nextCond);
    }
    
    /**
     * 获取 下一步条件  
     * @return
     */
    @JsonIgnore
    public String getNextCond(){
        Object objValue = this.get(FIELD_NEXTCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextCondDirty(){
        if(this.contains(FIELD_NEXTCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步条件
     */
    @JsonIgnore
    public void resetNextCond(){
        this.reset(FIELD_NEXTCOND);
    }

    /**
     * 设置 下一步条件，详细说明：{@link #FIELD_NEXTCOND}
     * <P>
     * 等同 {@link #setNextCond}
     * @param nextCond
     */
    @JsonIgnore
    public PSWFLink nextcond(String nextCond){
        this.setNextCond(nextCond);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定流程处理连接的次序，按照此次序进行显示及处理
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSWFLink ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;操作表单，指定流程交互处理连接的桌面端操作表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 操作表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 操作表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormId(){
        Object objValue = this.get(FIELD_PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormIdDirty(){
        if(this.contains(FIELD_PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 操作表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSWFLink psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 操作表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSWFLink psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setFormCodeName(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        }
        else{
            this.setFormCodeName(pSDEForm.getCodeName());
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;操作表单，指定流程交互处理连接的桌面端操作表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 操作表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 操作表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormName(){
        Object objValue = this.get(FIELD_PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormNameDirty(){
        if(this.contains(FIELD_PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 操作表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSWFLink psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FROMPSWFPROCID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSWFLink psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;操作视图，指定流程交互处理连接的桌面端操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 操作视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSWFLink psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFLink psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
            this.setViewCodeName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
            this.setViewCodeName(pSDEViewBase.getCodeName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;操作视图，指定流程交互处理连接的桌面端操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 操作视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSWFLink psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;PSWFDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FROMPSWFPROCID}
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 PSWFDEID
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 PSWFDEID  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEId(){
        Object objValue = this.get(FIELD_PSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSWFDEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDEIdDirty(){
        if(this.contains(FIELD_PSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSWFDEID
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 PSWFDEID
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSWFLink pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * <B>PSWFLINKID</B>&nbsp;流程处理连接标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFLINKID = "pswflinkid";

    /**
     * 设置 流程处理连接标识
     * 
     * @param pSWFLinkId
     * 
     */
    @JsonProperty(FIELD_PSWFLINKID)
    public void setPSWFLinkId(String pSWFLinkId){
        this.set(FIELD_PSWFLINKID, pSWFLinkId);
    }
    
    /**
     * 获取 流程处理连接标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkId(){
        Object objValue = this.get(FIELD_PSWFLINKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理连接标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkIdDirty(){
        if(this.contains(FIELD_PSWFLINKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理连接标识
     */
    @JsonIgnore
    public void resetPSWFLinkId(){
        this.reset(FIELD_PSWFLINKID);
    }

    /**
     * 设置 流程处理连接标识
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLinkId
     */
    @JsonIgnore
    public PSWFLink pswflinkid(String pSWFLinkId){
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    /**
     * <B>PSWFLINKNAME</B>&nbsp;连接名称，指定流程处理连接的名称，需在起始处理节点中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFLINKNAME = "pswflinkname";

    /**
     * 设置 连接名称，详细说明：{@link #FIELD_PSWFLINKNAME}
     * 
     * @param pSWFLinkName
     * 
     */
    @JsonProperty(FIELD_PSWFLINKNAME)
    public void setPSWFLinkName(String pSWFLinkName){
        this.set(FIELD_PSWFLINKNAME, pSWFLinkName);
    }
    
    /**
     * 获取 连接名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkName(){
        Object objValue = this.get(FIELD_PSWFLINKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkNameDirty(){
        if(this.contains(FIELD_PSWFLINKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接名称
     */
    @JsonIgnore
    public void resetPSWFLinkName(){
        this.reset(FIELD_PSWFLINKNAME);
    }

    /**
     * 设置 连接名称，详细说明：{@link #FIELD_PSWFLINKNAME}
     * <P>
     * 等同 {@link #setPSWFLinkName}
     * @param pSWFLinkName
     */
    @JsonIgnore
    public PSWFLink pswflinkname(String pSWFLinkName){
        this.setPSWFLinkName(pSWFLinkName);
        return this;
    }

    /**
     * <B>PSWFROLEID</B>&nbsp;附加工作流角色，指定流程交互处理连接自定义的操作角色
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFRole} 
     */
    public final static String FIELD_PSWFROLEID = "pswfroleid";

    /**
     * 设置 附加工作流角色，详细说明：{@link #FIELD_PSWFROLEID}
     * 
     * @param pSWFRoleId
     * 
     */
    @JsonProperty(FIELD_PSWFROLEID)
    public void setPSWFRoleId(String pSWFRoleId){
        this.set(FIELD_PSWFROLEID, pSWFRoleId);
    }
    
    /**
     * 获取 附加工作流角色  
     * @return
     */
    @JsonIgnore
    public String getPSWFRoleId(){
        Object objValue = this.get(FIELD_PSWFROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加工作流角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFRoleIdDirty(){
        if(this.contains(FIELD_PSWFROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加工作流角色
     */
    @JsonIgnore
    public void resetPSWFRoleId(){
        this.reset(FIELD_PSWFROLEID);
    }

    /**
     * 设置 附加工作流角色，详细说明：{@link #FIELD_PSWFROLEID}
     * <P>
     * 等同 {@link #setPSWFRoleId}
     * @param pSWFRoleId
     */
    @JsonIgnore
    public PSWFLink pswfroleid(String pSWFRoleId){
        this.setPSWFRoleId(pSWFRoleId);
        return this;
    }

    /**
     * 设置 附加工作流角色，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFRoleId}
     * @param pSWFRole 引用对象
     */
    @JsonIgnore
    public PSWFLink pswfroleid(PSWFRole pSWFRole){
        if(pSWFRole == null){
            this.setPSWFRoleId(null);
            this.setPSWFRoleName(null);
        }
        else{
            this.setPSWFRoleId(pSWFRole.getPSWFRoleId());
            this.setPSWFRoleName(pSWFRole.getPSWFRoleName());
        }
        return this;
    }

    /**
     * <B>PSWFROLENAME</B>&nbsp;附加工作流角色，指定流程交互处理连接自定义的操作角色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFROLEID}
     */
    public final static String FIELD_PSWFROLENAME = "pswfrolename";

    /**
     * 设置 附加工作流角色，详细说明：{@link #FIELD_PSWFROLENAME}
     * 
     * @param pSWFRoleName
     * 
     */
    @JsonProperty(FIELD_PSWFROLENAME)
    public void setPSWFRoleName(String pSWFRoleName){
        this.set(FIELD_PSWFROLENAME, pSWFRoleName);
    }
    
    /**
     * 获取 附加工作流角色  
     * @return
     */
    @JsonIgnore
    public String getPSWFRoleName(){
        Object objValue = this.get(FIELD_PSWFROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加工作流角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFRoleNameDirty(){
        if(this.contains(FIELD_PSWFROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加工作流角色
     */
    @JsonIgnore
    public void resetPSWFRoleName(){
        this.reset(FIELD_PSWFROLENAME);
    }

    /**
     * 设置 附加工作流角色，详细说明：{@link #FIELD_PSWFROLENAME}
     * <P>
     * 等同 {@link #setPSWFRoleName}
     * @param pSWFRoleName
     */
    @JsonIgnore
    public PSWFLink pswfrolename(String pSWFRoleName){
        this.setPSWFRoleName(pSWFRoleName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本，指定流程处理连接所在的工作流版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFVersion} 
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSWFLink pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * 设置 工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSWFLink pswfversionid(PSWFVersion pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
            this.setWFEngineType(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
            this.setWFEngineType(pSWFVersion.getWFEngineType());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本，指定流程处理连接所在的工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionName(){
        Object objValue = this.get(FIELD_PSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionNameDirty(){
        if(this.contains(FIELD_PSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSWFLink pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>SHAPEPARAMS</B>&nbsp;形状参数
     */
    public final static String FIELD_SHAPEPARAMS = "shapeparams";

    /**
     * 设置 形状参数
     * 
     * @param shapeParams
     * 
     */
    @JsonProperty(FIELD_SHAPEPARAMS)
    public void setShapeParams(String shapeParams){
        this.set(FIELD_SHAPEPARAMS, shapeParams);
    }
    
    /**
     * 获取 形状参数  
     * @return
     */
    @JsonIgnore
    public String getShapeParams(){
        Object objValue = this.get(FIELD_SHAPEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 形状参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeParamsDirty(){
        if(this.contains(FIELD_SHAPEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 形状参数
     */
    @JsonIgnore
    public void resetShapeParams(){
        this.reset(FIELD_SHAPEPARAMS);
    }

    /**
     * 设置 形状参数
     * <P>
     * 等同 {@link #setShapeParams}
     * @param shapeParams
     */
    @JsonIgnore
    public PSWFLink shapeparams(String shapeParams){
        this.setShapeParams(shapeParams);
        return this;
    }

    /**
     * <B>SOMEROLEFLAG</B>&nbsp;指定角色，指定流程交互处理连接是否自定义操作角色（忽略流程处理定义的），未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SOMEROLEFLAG = "someroleflag";

    /**
     * 设置 指定角色，详细说明：{@link #FIELD_SOMEROLEFLAG}
     * 
     * @param someRoleFlag
     * 
     */
    @JsonProperty(FIELD_SOMEROLEFLAG)
    public void setSomeRoleFlag(Integer someRoleFlag){
        this.set(FIELD_SOMEROLEFLAG, someRoleFlag);
    }
    
    /**
     * 获取 指定角色  
     * @return
     */
    @JsonIgnore
    public Integer getSomeRoleFlag(){
        Object objValue = this.get(FIELD_SOMEROLEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 指定角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSomeRoleFlagDirty(){
        if(this.contains(FIELD_SOMEROLEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 指定角色
     */
    @JsonIgnore
    public void resetSomeRoleFlag(){
        this.reset(FIELD_SOMEROLEFLAG);
    }

    /**
     * 设置 指定角色，详细说明：{@link #FIELD_SOMEROLEFLAG}
     * <P>
     * 等同 {@link #setSomeRoleFlag}
     * @param someRoleFlag
     */
    @JsonIgnore
    public PSWFLink someroleflag(Integer someRoleFlag){
        this.setSomeRoleFlag(someRoleFlag);
        return this;
    }

     /**
     * 设置 指定角色，详细说明：{@link #FIELD_SOMEROLEFLAG}
     * <P>
     * 等同 {@link #setSomeRoleFlag}
     * @param someRoleFlag
     */
    @JsonIgnore
    public PSWFLink someroleflag(Boolean someRoleFlag){
        if(someRoleFlag == null){
            this.setSomeRoleFlag(null);
        }
        else{
            this.setSomeRoleFlag(someRoleFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SRCENDPOINT</B>&nbsp;源端点
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SRCENDPOINT = "srcendpoint";

    /**
     * 设置 源端点
     * 
     * @param srcEndPoint
     * 
     */
    @JsonProperty(FIELD_SRCENDPOINT)
    public void setSrcEndPoint(String srcEndPoint){
        this.set(FIELD_SRCENDPOINT, srcEndPoint);
    }
    
    /**
     * 获取 源端点  
     * @return
     */
    @JsonIgnore
    public String getSrcEndPoint(){
        Object objValue = this.get(FIELD_SRCENDPOINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源端点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcEndPointDirty(){
        if(this.contains(FIELD_SRCENDPOINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源端点
     */
    @JsonIgnore
    public void resetSrcEndPoint(){
        this.reset(FIELD_SRCENDPOINT);
    }

    /**
     * 设置 源端点
     * <P>
     * 等同 {@link #setSrcEndPoint}
     * @param srcEndPoint
     */
    @JsonIgnore
    public PSWFLink srcendpoint(String srcEndPoint){
        this.setSrcEndPoint(srcEndPoint);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源，指定流程处理连接的提示信息的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResId(){
        Object objValue = this.get(FIELD_TIPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResIdDirty(){
        if(this.contains(FIELD_TIPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESID}
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSWFLink tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSWFLink tippslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        }
        else{
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源，指定流程处理连接的提示信息的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * 
     * @param tipPSLanResName
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESNAME)
    public void setTipPSLanResName(String tipPSLanResName){
        this.set(FIELD_TIPPSLANRESNAME, tipPSLanResName);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResName(){
        Object objValue = this.get(FIELD_TIPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResNameDirty(){
        if(this.contains(FIELD_TIPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResName(){
        this.reset(FIELD_TIPPSLANRESNAME);
    }

    /**
     * 设置 提示语言资源，详细说明：{@link #FIELD_TIPPSLANRESNAME}
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSWFLink tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOPSWFPROCID</B>&nbsp;结束处理，指定流程处理连接的目标处理节点
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFProcess} 
     */
    public final static String FIELD_TOPSWFPROCID = "topswfprocid";

    /**
     * 设置 结束处理，详细说明：{@link #FIELD_TOPSWFPROCID}
     * 
     * @param toPSWFProcId
     * 
     */
    @JsonProperty(FIELD_TOPSWFPROCID)
    public void setToPSWFProcId(String toPSWFProcId){
        this.set(FIELD_TOPSWFPROCID, toPSWFProcId);
    }
    
    /**
     * 获取 结束处理  
     * @return
     */
    @JsonIgnore
    public String getToPSWFProcId(){
        Object objValue = this.get(FIELD_TOPSWFPROCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isToPSWFProcIdDirty(){
        if(this.contains(FIELD_TOPSWFPROCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束处理
     */
    @JsonIgnore
    public void resetToPSWFProcId(){
        this.reset(FIELD_TOPSWFPROCID);
    }

    /**
     * 设置 结束处理，详细说明：{@link #FIELD_TOPSWFPROCID}
     * <P>
     * 等同 {@link #setToPSWFProcId}
     * @param toPSWFProcId
     */
    @JsonIgnore
    public PSWFLink topswfprocid(String toPSWFProcId){
        this.setToPSWFProcId(toPSWFProcId);
        return this;
    }

    /**
     * 设置 结束处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setToPSWFProcId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSWFLink topswfprocid(PSWFProcess pSWFProcess){
        if(pSWFProcess == null){
            this.setToPSWFProcId(null);
            this.setToPSWFProcName(null);
        }
        else{
            this.setToPSWFProcId(pSWFProcess.getPSWFProcessId());
            this.setToPSWFProcName(pSWFProcess.getPSWFProcessName());
        }
        return this;
    }

    /**
     * <B>TOPSWFPROCNAME</B>&nbsp;结束处理，指定流程处理连接的目标处理节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TOPSWFPROCID}
     */
    public final static String FIELD_TOPSWFPROCNAME = "topswfprocname";

    /**
     * 设置 结束处理，详细说明：{@link #FIELD_TOPSWFPROCNAME}
     * 
     * @param toPSWFProcName
     * 
     */
    @JsonProperty(FIELD_TOPSWFPROCNAME)
    public void setToPSWFProcName(String toPSWFProcName){
        this.set(FIELD_TOPSWFPROCNAME, toPSWFProcName);
    }
    
    /**
     * 获取 结束处理  
     * @return
     */
    @JsonIgnore
    public String getToPSWFProcName(){
        Object objValue = this.get(FIELD_TOPSWFPROCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isToPSWFProcNameDirty(){
        if(this.contains(FIELD_TOPSWFPROCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束处理
     */
    @JsonIgnore
    public void resetToPSWFProcName(){
        this.reset(FIELD_TOPSWFPROCNAME);
    }

    /**
     * 设置 结束处理，详细说明：{@link #FIELD_TOPSWFPROCNAME}
     * <P>
     * 等同 {@link #setToPSWFProcName}
     * @param toPSWFProcName
     */
    @JsonIgnore
    public PSWFLink topswfprocname(String toPSWFProcName){
        this.setToPSWFProcName(toPSWFProcName);
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
    public PSWFLink updatedate(String updateDate){
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
    public PSWFLink updateman(String updateMan){
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
    public PSWFLink usercat(String userCat){
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
    public PSWFLink usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;连接数据，指定流程处理连接的数据
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 连接数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 连接数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 连接数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSWFLink userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;连接数据2，指定流程处理连接的数据2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 连接数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 连接数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 连接数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSWFLink userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSWFLink usertag(String userTag){
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
    public PSWFLink usertag2(String userTag2){
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
    public PSWFLink usertag3(String userTag3){
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
    public PSWFLink usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWCODENAME</B>&nbsp;操作视图标记
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_VIEWCODENAME = "viewcodename";

    /**
     * 设置 操作视图标记
     * 
     * @param viewCodeName
     * 
     */
    @JsonProperty(FIELD_VIEWCODENAME)
    public void setViewCodeName(String viewCodeName){
        this.set(FIELD_VIEWCODENAME, viewCodeName);
    }
    
    /**
     * 获取 操作视图标记  
     * @return
     */
    @JsonIgnore
    public String getViewCodeName(){
        Object objValue = this.get(FIELD_VIEWCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作视图标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewCodeNameDirty(){
        if(this.contains(FIELD_VIEWCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作视图标记
     */
    @JsonIgnore
    public void resetViewCodeName(){
        this.reset(FIELD_VIEWCODENAME);
    }

    /**
     * 设置 操作视图标记
     * <P>
     * 等同 {@link #setViewCodeName}
     * @param viewCodeName
     */
    @JsonIgnore
    public PSWFLink viewcodename(String viewCodeName){
        this.setViewCodeName(viewCodeName);
        return this;
    }

    /**
     * <B>WFENGINETYPE</B>&nbsp;引擎类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFEngineType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_WFENGINETYPE = "wfenginetype";

    /**
     * 设置 引擎类型
     * 
     * @param wFEngineType
     * 
     */
    @JsonProperty(FIELD_WFENGINETYPE)
    public void setWFEngineType(String wFEngineType){
        this.set(FIELD_WFENGINETYPE, wFEngineType);
    }
    
    /**
     * 获取 引擎类型  
     * @return
     */
    @JsonIgnore
    public String getWFEngineType(){
        Object objValue = this.get(FIELD_WFENGINETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFEngineTypeDirty(){
        if(this.contains(FIELD_WFENGINETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎类型
     */
    @JsonIgnore
    public void resetWFEngineType(){
        this.reset(FIELD_WFENGINETYPE);
    }

    /**
     * 设置 引擎类型
     * <P>
     * 等同 {@link #setWFEngineType}
     * @param wFEngineType
     */
    @JsonIgnore
    public PSWFLink wfenginetype(String wFEngineType){
        this.setWFEngineType(wFEngineType);
        return this;
    }

    /**
     * <B>WFLINKTYPE</B>&nbsp;连接类型，指定流程处理连接的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WFLinkType} 
     */
    public final static String FIELD_WFLINKTYPE = "wflinktype";

    /**
     * 设置 连接类型，详细说明：{@link #FIELD_WFLINKTYPE}
     * 
     * @param wFLinkType
     * 
     */
    @JsonProperty(FIELD_WFLINKTYPE)
    public void setWFLinkType(String wFLinkType){
        this.set(FIELD_WFLINKTYPE, wFLinkType);
    }
    
    /**
     * 获取 连接类型  
     * @return
     */
    @JsonIgnore
    public String getWFLinkType(){
        Object objValue = this.get(FIELD_WFLINKTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFLinkTypeDirty(){
        if(this.contains(FIELD_WFLINKTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接类型
     */
    @JsonIgnore
    public void resetWFLinkType(){
        this.reset(FIELD_WFLINKTYPE);
    }

    /**
     * 设置 连接类型，详细说明：{@link #FIELD_WFLINKTYPE}
     * <P>
     * 等同 {@link #setWFLinkType}
     * @param wFLinkType
     */
    @JsonIgnore
    public PSWFLink wflinktype(String wFLinkType){
        this.setWFLinkType(wFLinkType);
        return this;
    }

     /**
     * 设置 连接类型，详细说明：{@link #FIELD_WFLINKTYPE}
     * <P>
     * 等同 {@link #setWFLinkType}
     * @param wFLinkType
     */
    @JsonIgnore
    public PSWFLink wflinktype(net.ibizsys.psmodel.core.util.PSModelEnums.WFLinkType wFLinkType){
        if(wFLinkType == null){
            this.setWFLinkType(null);
        }
        else{
            this.setWFLinkType(wFLinkType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFLinkId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFLinkId(strValue);
    }

    @JsonIgnore
    public PSWFLink id(String strValue){
        this.setPSWFLinkId(strValue);
        return this;
    }


    /**
     *  流程处理连接角色 成员集合
     */
    public final static String FIELD_PSWFLINKROLES = "pswflinkroles";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkRole> pswflinkroles;

    /**
     * 获取 流程处理连接角色 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFLINKROLES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkRole> getPSWFLinkRoles(){
        return this.pswflinkroles;
    }

    /**
     * 设置 流程处理连接角色 成员集合  
     * @param pswflinkroles
     */
    @JsonProperty(FIELD_PSWFLINKROLES)
    public void setPSWFLinkRoles(java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkRole> pswflinkroles){
        this.pswflinkroles = pswflinkroles;
    }

    /**
     * 获取 流程处理连接角色 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkRole> getPSWFLinkRolesIf(){
        if(this.pswflinkroles == null){
            this.pswflinkroles = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFLinkRole>();          
        }
        return this.pswflinkroles;
    }


    /**
     *  流程处理连接条件 成员集合
     */
    public final static String FIELD_PSWFLINKCONDS = "pswflinkconds";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkCond> pswflinkconds;

    /**
     * 获取 流程处理连接条件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSWFLINKCONDS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkCond> getPSWFLinkConds(){
        return this.pswflinkconds;
    }

    /**
     * 设置 流程处理连接条件 成员集合  
     * @param pswflinkconds
     */
    @JsonProperty(FIELD_PSWFLINKCONDS)
    public void setPSWFLinkConds(java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkCond> pswflinkconds){
        this.pswflinkconds = pswflinkconds;
    }

    /**
     * 获取 流程处理连接条件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSWFLinkCond> getPSWFLinkCondsIf(){
        if(this.pswflinkconds == null){
            this.pswflinkconds = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSWFLinkCond>();          
        }
        return this.pswflinkconds;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWFLink){
            PSWFLink model = (PSWFLink)iPSModel;
            model.setPSWFLinkRoles(this.getPSWFLinkRoles());
            model.setPSWFLinkConds(this.getPSWFLinkConds());
        }
        super.copyTo(iPSModel);
    }
}
