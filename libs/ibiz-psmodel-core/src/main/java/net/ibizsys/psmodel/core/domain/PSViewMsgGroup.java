package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSVIEWMSGGROUP</B>视图消息组 模型传输对象
 * <P>
 * 系统视图消息组模型，包括一组静态或动态视图消息成员
 */
public class PSViewMsgGroup extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSViewMsgGroup(){
    }      

    /**
     * <B>BODYMSGPSSYSCSSID</B>&nbsp;内容消息区样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_BODYMSGPSSYSCSSID = "bodymsgpssyscssid";

    /**
     * 设置 内容消息区样式
     * 
     * @param bodyMsgPSSysCssId
     * 
     */
    @JsonProperty(FIELD_BODYMSGPSSYSCSSID)
    public void setBodyMsgPSSysCssId(String bodyMsgPSSysCssId){
        this.set(FIELD_BODYMSGPSSYSCSSID, bodyMsgPSSysCssId);
    }
    
    /**
     * 获取 内容消息区样式  
     * @return
     */
    @JsonIgnore
    public String getBodyMsgPSSysCssId(){
        Object objValue = this.get(FIELD_BODYMSGPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容消息区样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBodyMsgPSSysCssIdDirty(){
        if(this.contains(FIELD_BODYMSGPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容消息区样式
     */
    @JsonIgnore
    public void resetBodyMsgPSSysCssId(){
        this.reset(FIELD_BODYMSGPSSYSCSSID);
    }

    /**
     * 设置 内容消息区样式
     * <P>
     * 等同 {@link #setBodyMsgPSSysCssId}
     * @param bodyMsgPSSysCssId
     */
    @JsonIgnore
    public PSViewMsgGroup bodymsgpssyscssid(String bodyMsgPSSysCssId){
        this.setBodyMsgPSSysCssId(bodyMsgPSSysCssId);
        return this;
    }

    /**
     * 设置 内容消息区样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBodyMsgPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSViewMsgGroup bodymsgpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setBodyMsgPSSysCssId(null);
            this.setBodyMsgPSSysCssName(null);
        }
        else{
            this.setBodyMsgPSSysCssId(pSSysCss.getPSSysCssId());
            this.setBodyMsgPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>BODYMSGPSSYSCSSNAME</B>&nbsp;内容消息区样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BODYMSGPSSYSCSSID}
     */
    public final static String FIELD_BODYMSGPSSYSCSSNAME = "bodymsgpssyscssname";

    /**
     * 设置 内容消息区样式表
     * 
     * @param bodyMsgPSSysCssName
     * 
     */
    @JsonProperty(FIELD_BODYMSGPSSYSCSSNAME)
    public void setBodyMsgPSSysCssName(String bodyMsgPSSysCssName){
        this.set(FIELD_BODYMSGPSSYSCSSNAME, bodyMsgPSSysCssName);
    }
    
    /**
     * 获取 内容消息区样式表  
     * @return
     */
    @JsonIgnore
    public String getBodyMsgPSSysCssName(){
        Object objValue = this.get(FIELD_BODYMSGPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容消息区样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBodyMsgPSSysCssNameDirty(){
        if(this.contains(FIELD_BODYMSGPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容消息区样式表
     */
    @JsonIgnore
    public void resetBodyMsgPSSysCssName(){
        this.reset(FIELD_BODYMSGPSSYSCSSNAME);
    }

    /**
     * 设置 内容消息区样式表
     * <P>
     * 等同 {@link #setBodyMsgPSSysCssName}
     * @param bodyMsgPSSysCssName
     */
    @JsonIgnore
    public PSViewMsgGroup bodymsgpssyscssname(String bodyMsgPSSysCssName){
        this.setBodyMsgPSSysCssName(bodyMsgPSSysCssName);
        return this;
    }

    /**
     * <B>BODYMSGSTYLE</B>&nbsp;内容区消息区样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgShowMode} 
     */
    public final static String FIELD_BODYMSGSTYLE = "bodymsgstyle";

    /**
     * 设置 内容区消息区样式
     * 
     * @param bodyMsgStyle
     * 
     */
    @JsonProperty(FIELD_BODYMSGSTYLE)
    public void setBodyMsgStyle(String bodyMsgStyle){
        this.set(FIELD_BODYMSGSTYLE, bodyMsgStyle);
    }
    
    /**
     * 获取 内容区消息区样式  
     * @return
     */
    @JsonIgnore
    public String getBodyMsgStyle(){
        Object objValue = this.get(FIELD_BODYMSGSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容区消息区样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBodyMsgStyleDirty(){
        if(this.contains(FIELD_BODYMSGSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容区消息区样式
     */
    @JsonIgnore
    public void resetBodyMsgStyle(){
        this.reset(FIELD_BODYMSGSTYLE);
    }

    /**
     * 设置 内容区消息区样式
     * <P>
     * 等同 {@link #setBodyMsgStyle}
     * @param bodyMsgStyle
     */
    @JsonIgnore
    public PSViewMsgGroup bodymsgstyle(String bodyMsgStyle){
        this.setBodyMsgStyle(bodyMsgStyle);
        return this;
    }

     /**
     * 设置 内容区消息区样式
     * <P>
     * 等同 {@link #setBodyMsgStyle}
     * @param bodyMsgStyle
     */
    @JsonIgnore
    public PSViewMsgGroup bodymsgstyle(net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgShowMode bodyMsgStyle){
        if(bodyMsgStyle == null){
            this.setBodyMsgStyle(null);
        }
        else{
            this.setBodyMsgStyle(bodyMsgStyle.value);
        }
        return this;
    }

    /**
     * <B>BOTTOMMSGPSSYSCSSID</B>&nbsp;尾部消息区样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_BOTTOMMSGPSSYSCSSID = "bottommsgpssyscssid";

    /**
     * 设置 尾部消息区样式
     * 
     * @param bottomMsgPSSysCssId
     * 
     */
    @JsonProperty(FIELD_BOTTOMMSGPSSYSCSSID)
    public void setBottomMsgPSSysCssId(String bottomMsgPSSysCssId){
        this.set(FIELD_BOTTOMMSGPSSYSCSSID, bottomMsgPSSysCssId);
    }
    
    /**
     * 获取 尾部消息区样式  
     * @return
     */
    @JsonIgnore
    public String getBottomMsgPSSysCssId(){
        Object objValue = this.get(FIELD_BOTTOMMSGPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 尾部消息区样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomMsgPSSysCssIdDirty(){
        if(this.contains(FIELD_BOTTOMMSGPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 尾部消息区样式
     */
    @JsonIgnore
    public void resetBottomMsgPSSysCssId(){
        this.reset(FIELD_BOTTOMMSGPSSYSCSSID);
    }

    /**
     * 设置 尾部消息区样式
     * <P>
     * 等同 {@link #setBottomMsgPSSysCssId}
     * @param bottomMsgPSSysCssId
     */
    @JsonIgnore
    public PSViewMsgGroup bottommsgpssyscssid(String bottomMsgPSSysCssId){
        this.setBottomMsgPSSysCssId(bottomMsgPSSysCssId);
        return this;
    }

    /**
     * 设置 尾部消息区样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBottomMsgPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSViewMsgGroup bottommsgpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setBottomMsgPSSysCssId(null);
            this.setBottomMsgPSSysCssName(null);
        }
        else{
            this.setBottomMsgPSSysCssId(pSSysCss.getPSSysCssId());
            this.setBottomMsgPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>BOTTOMMSGPSSYSCSSNAME</B>&nbsp;尾部消息区样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BOTTOMMSGPSSYSCSSID}
     */
    public final static String FIELD_BOTTOMMSGPSSYSCSSNAME = "bottommsgpssyscssname";

    /**
     * 设置 尾部消息区样式表
     * 
     * @param bottomMsgPSSysCssName
     * 
     */
    @JsonProperty(FIELD_BOTTOMMSGPSSYSCSSNAME)
    public void setBottomMsgPSSysCssName(String bottomMsgPSSysCssName){
        this.set(FIELD_BOTTOMMSGPSSYSCSSNAME, bottomMsgPSSysCssName);
    }
    
    /**
     * 获取 尾部消息区样式表  
     * @return
     */
    @JsonIgnore
    public String getBottomMsgPSSysCssName(){
        Object objValue = this.get(FIELD_BOTTOMMSGPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 尾部消息区样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomMsgPSSysCssNameDirty(){
        if(this.contains(FIELD_BOTTOMMSGPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 尾部消息区样式表
     */
    @JsonIgnore
    public void resetBottomMsgPSSysCssName(){
        this.reset(FIELD_BOTTOMMSGPSSYSCSSNAME);
    }

    /**
     * 设置 尾部消息区样式表
     * <P>
     * 等同 {@link #setBottomMsgPSSysCssName}
     * @param bottomMsgPSSysCssName
     */
    @JsonIgnore
    public PSViewMsgGroup bottommsgpssyscssname(String bottomMsgPSSysCssName){
        this.setBottomMsgPSSysCssName(bottomMsgPSSysCssName);
        return this;
    }

    /**
     * <B>BOTTOMMSGSTYLE</B>&nbsp;尾部消息区样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgShowMode} 
     */
    public final static String FIELD_BOTTOMMSGSTYLE = "bottommsgstyle";

    /**
     * 设置 尾部消息区样式
     * 
     * @param bottomMsgStyle
     * 
     */
    @JsonProperty(FIELD_BOTTOMMSGSTYLE)
    public void setBottomMsgStyle(String bottomMsgStyle){
        this.set(FIELD_BOTTOMMSGSTYLE, bottomMsgStyle);
    }
    
    /**
     * 获取 尾部消息区样式  
     * @return
     */
    @JsonIgnore
    public String getBottomMsgStyle(){
        Object objValue = this.get(FIELD_BOTTOMMSGSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 尾部消息区样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomMsgStyleDirty(){
        if(this.contains(FIELD_BOTTOMMSGSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 尾部消息区样式
     */
    @JsonIgnore
    public void resetBottomMsgStyle(){
        this.reset(FIELD_BOTTOMMSGSTYLE);
    }

    /**
     * 设置 尾部消息区样式
     * <P>
     * 等同 {@link #setBottomMsgStyle}
     * @param bottomMsgStyle
     */
    @JsonIgnore
    public PSViewMsgGroup bottommsgstyle(String bottomMsgStyle){
        this.setBottomMsgStyle(bottomMsgStyle);
        return this;
    }

     /**
     * 设置 尾部消息区样式
     * <P>
     * 等同 {@link #setBottomMsgStyle}
     * @param bottomMsgStyle
     */
    @JsonIgnore
    public PSViewMsgGroup bottommsgstyle(net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgShowMode bottomMsgStyle){
        if(bottomMsgStyle == null){
            this.setBottomMsgStyle(null);
        }
        else{
            this.setBottomMsgStyle(bottomMsgStyle.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定视图消息组的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSViewMsgGroup codename(String codeName){
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
    public PSViewMsgGroup createdate(String createDate){
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
    public PSViewMsgGroup createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DYNAMICMODE</B>&nbsp;动态模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DYNAMICMODE = "dynamicmode";

    /**
     * 设置 动态模式
     * 
     * @param dynamicMode
     * 
     */
    @JsonProperty(FIELD_DYNAMICMODE)
    public void setDynamicMode(Integer dynamicMode){
        this.set(FIELD_DYNAMICMODE, dynamicMode);
    }
    
    /**
     * 获取 动态模式  
     * @return
     */
    @JsonIgnore
    public Integer getDynamicMode(){
        Object objValue = this.get(FIELD_DYNAMICMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 动态模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynamicModeDirty(){
        if(this.contains(FIELD_DYNAMICMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态模式
     */
    @JsonIgnore
    public void resetDynamicMode(){
        this.reset(FIELD_DYNAMICMODE);
    }

    /**
     * 设置 动态模式
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSViewMsgGroup dynamicmode(Integer dynamicMode){
        this.setDynamicMode(dynamicMode);
        return this;
    }

     /**
     * 设置 动态模式
     * <P>
     * 等同 {@link #setDynamicMode}
     * @param dynamicMode
     */
    @JsonIgnore
    public PSViewMsgGroup dynamicmode(Boolean dynamicMode){
        if(dynamicMode == null){
            this.setDynamicMode(null);
        }
        else{
            this.setDynamicMode(dynamicMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSViewMsgGroup memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;相关实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 相关实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 相关实体  
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
     * 判断 相关实体 是否指定值，包括空值
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
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSViewMsgGroup psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 相关实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSViewMsgGroup psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;相关实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 相关实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 相关实体  
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
     * 判断 相关实体 是否指定值，包括空值
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
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSViewMsgGroup psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定视图消息组所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
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
    public PSViewMsgGroup psmoduleid(String pSModuleId){
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
    public PSViewMsgGroup psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定视图消息组所在的系统模块
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
    public PSViewMsgGroup psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSViewMsgGroup pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSViewMsgGroup pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSViewMsgGroup pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组标识
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组标识  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组标识
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组标识
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSViewMsgGroup psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组名称
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组名称  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组名称
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组名称
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSViewMsgGroup psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSViewMsgGroupName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSViewMsgGroupName(strName);
    }

    @JsonIgnore
    public PSViewMsgGroup name(String strName){
        this.setPSViewMsgGroupName(strName);
        return this;
    }

    /**
     * <B>TOPMSGPSSYSCSSID</B>&nbsp;头部消息区样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_TOPMSGPSSYSCSSID = "topmsgpssyscssid";

    /**
     * 设置 头部消息区样式
     * 
     * @param topMsgPSSysCssId
     * 
     */
    @JsonProperty(FIELD_TOPMSGPSSYSCSSID)
    public void setTopMsgPSSysCssId(String topMsgPSSysCssId){
        this.set(FIELD_TOPMSGPSSYSCSSID, topMsgPSSysCssId);
    }
    
    /**
     * 获取 头部消息区样式  
     * @return
     */
    @JsonIgnore
    public String getTopMsgPSSysCssId(){
        Object objValue = this.get(FIELD_TOPMSGPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部消息区样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopMsgPSSysCssIdDirty(){
        if(this.contains(FIELD_TOPMSGPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部消息区样式
     */
    @JsonIgnore
    public void resetTopMsgPSSysCssId(){
        this.reset(FIELD_TOPMSGPSSYSCSSID);
    }

    /**
     * 设置 头部消息区样式
     * <P>
     * 等同 {@link #setTopMsgPSSysCssId}
     * @param topMsgPSSysCssId
     */
    @JsonIgnore
    public PSViewMsgGroup topmsgpssyscssid(String topMsgPSSysCssId){
        this.setTopMsgPSSysCssId(topMsgPSSysCssId);
        return this;
    }

    /**
     * 设置 头部消息区样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTopMsgPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSViewMsgGroup topmsgpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setTopMsgPSSysCssId(null);
            this.setTopMsgPSSysCssName(null);
        }
        else{
            this.setTopMsgPSSysCssId(pSSysCss.getPSSysCssId());
            this.setTopMsgPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>TOPMSGPSSYSCSSNAME</B>&nbsp;头部消息区样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TOPMSGPSSYSCSSID}
     */
    public final static String FIELD_TOPMSGPSSYSCSSNAME = "topmsgpssyscssname";

    /**
     * 设置 头部消息区样式表
     * 
     * @param topMsgPSSysCssName
     * 
     */
    @JsonProperty(FIELD_TOPMSGPSSYSCSSNAME)
    public void setTopMsgPSSysCssName(String topMsgPSSysCssName){
        this.set(FIELD_TOPMSGPSSYSCSSNAME, topMsgPSSysCssName);
    }
    
    /**
     * 获取 头部消息区样式表  
     * @return
     */
    @JsonIgnore
    public String getTopMsgPSSysCssName(){
        Object objValue = this.get(FIELD_TOPMSGPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部消息区样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopMsgPSSysCssNameDirty(){
        if(this.contains(FIELD_TOPMSGPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部消息区样式表
     */
    @JsonIgnore
    public void resetTopMsgPSSysCssName(){
        this.reset(FIELD_TOPMSGPSSYSCSSNAME);
    }

    /**
     * 设置 头部消息区样式表
     * <P>
     * 等同 {@link #setTopMsgPSSysCssName}
     * @param topMsgPSSysCssName
     */
    @JsonIgnore
    public PSViewMsgGroup topmsgpssyscssname(String topMsgPSSysCssName){
        this.setTopMsgPSSysCssName(topMsgPSSysCssName);
        return this;
    }

    /**
     * <B>TOPMSGSTYLE</B>&nbsp;头部消息区样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgShowMode} 
     */
    public final static String FIELD_TOPMSGSTYLE = "topmsgstyle";

    /**
     * 设置 头部消息区样式
     * 
     * @param topMsgStyle
     * 
     */
    @JsonProperty(FIELD_TOPMSGSTYLE)
    public void setTopMsgStyle(String topMsgStyle){
        this.set(FIELD_TOPMSGSTYLE, topMsgStyle);
    }
    
    /**
     * 获取 头部消息区样式  
     * @return
     */
    @JsonIgnore
    public String getTopMsgStyle(){
        Object objValue = this.get(FIELD_TOPMSGSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部消息区样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopMsgStyleDirty(){
        if(this.contains(FIELD_TOPMSGSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部消息区样式
     */
    @JsonIgnore
    public void resetTopMsgStyle(){
        this.reset(FIELD_TOPMSGSTYLE);
    }

    /**
     * 设置 头部消息区样式
     * <P>
     * 等同 {@link #setTopMsgStyle}
     * @param topMsgStyle
     */
    @JsonIgnore
    public PSViewMsgGroup topmsgstyle(String topMsgStyle){
        this.setTopMsgStyle(topMsgStyle);
        return this;
    }

     /**
     * 设置 头部消息区样式
     * <P>
     * 等同 {@link #setTopMsgStyle}
     * @param topMsgStyle
     */
    @JsonIgnore
    public PSViewMsgGroup topmsgstyle(net.ibizsys.psmodel.core.util.PSModelEnums.ViewMsgShowMode topMsgStyle){
        if(topMsgStyle == null){
            this.setTopMsgStyle(null);
        }
        else{
            this.setTopMsgStyle(topMsgStyle.value);
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
    public PSViewMsgGroup updatedate(String updateDate){
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
    public PSViewMsgGroup updateman(String updateMan){
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
    public PSViewMsgGroup usercat(String userCat){
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
    public PSViewMsgGroup usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
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
    public PSViewMsgGroup userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSViewMsgGroup usertag(String userTag){
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
    public PSViewMsgGroup usertag2(String userTag2){
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
    public PSViewMsgGroup usertag3(String userTag3){
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
    public PSViewMsgGroup usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSViewMsgGroupId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSViewMsgGroupId(strValue);
    }

    @JsonIgnore
    public PSViewMsgGroup id(String strValue){
        this.setPSViewMsgGroupId(strValue);
        return this;
    }


    /**
     *  视图消息组成员 成员集合
     */
    public final static String FIELD_PSVIEWMSGGRPDETAILS = "psviewmsggrpdetails";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSViewMsgGrpDetail> psviewmsggrpdetails;

    /**
     * 获取 视图消息组成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSVIEWMSGGRPDETAILS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSViewMsgGrpDetail> getPSViewMsgGrpDetails(){
        return this.psviewmsggrpdetails;
    }

    /**
     * 设置 视图消息组成员 成员集合  
     * @param psviewmsggrpdetails
     */
    @JsonProperty(FIELD_PSVIEWMSGGRPDETAILS)
    public void setPSViewMsgGrpDetails(java.util.List<net.ibizsys.psmodel.core.domain.PSViewMsgGrpDetail> psviewmsggrpdetails){
        this.psviewmsggrpdetails = psviewmsggrpdetails;
    }

    /**
     * 获取 视图消息组成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSViewMsgGrpDetail> getPSViewMsgGrpDetailsIf(){
        if(this.psviewmsggrpdetails == null){
            this.psviewmsggrpdetails = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSViewMsgGrpDetail>();          
        }
        return this.psviewmsggrpdetails;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSViewMsgGroup){
            PSViewMsgGroup model = (PSViewMsgGroup)iPSModel;
            model.setPSViewMsgGrpDetails(this.getPSViewMsgGrpDetails());
        }
        super.copyTo(iPSModel);
    }
}
