package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEMAINSTATE</B>实体主状态 模型传输对象
 * <P>
 * 实体主状态控制模型，定义由一个或多个实体属性值组成的主状态标记、相应的行为及数据操作标识控制逻辑。主状态控制逻辑是实体的基础控制逻辑，超越权限控制，如指定状态数据拒绝删除则不管是否具备权限都将无法对数据进行删除操作
 */
public class PSDEMainState extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEMainState(){
    }      

    /**
     * <B>ALLOWMODE</B>&nbsp;行为控制模式，指定主状态行为的控制模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionMode} 
     */
    public final static String FIELD_ALLOWMODE = "allowmode";

    /**
     * 设置 行为控制模式，详细说明：{@link #FIELD_ALLOWMODE}
     * 
     * @param allowMode
     * 
     */
    @JsonProperty(FIELD_ALLOWMODE)
    public void setAllowMode(String allowMode){
        this.set(FIELD_ALLOWMODE, allowMode);
    }
    
    /**
     * 获取 行为控制模式  
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
     * 判断 行为控制模式 是否指定值，包括空值
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
     * 重置 行为控制模式
     */
    @JsonIgnore
    public void resetAllowMode(){
        this.reset(FIELD_ALLOWMODE);
    }

    /**
     * 设置 行为控制模式，详细说明：{@link #FIELD_ALLOWMODE}
     * <P>
     * 等同 {@link #setAllowMode}
     * @param allowMode
     */
    @JsonIgnore
    public PSDEMainState allowmode(String allowMode){
        this.setAllowMode(allowMode);
        return this;
    }

     /**
     * 设置 行为控制模式，详细说明：{@link #FIELD_ALLOWMODE}
     * <P>
     * 等同 {@link #setAllowMode}
     * @param allowMode
     */
    @JsonIgnore
    public PSDEMainState allowmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionMode allowMode){
        if(allowMode == null){
            this.setAllowMode(null);
        }
        else{
            this.setAllowMode(allowMode.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体主状态的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEMainState codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 颜色
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 颜色
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSDEMainState color(String color){
        this.setColor(color);
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
    public PSDEMainState createdate(String createDate){
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
    public PSDEMainState createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEACTIONDENYMSG</B>&nbsp;行为拒绝信息，指定实体行为拒绝的提示信息
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_DEACTIONDENYMSG = "deactiondenymsg";

    /**
     * 设置 行为拒绝信息，详细说明：{@link #FIELD_DEACTIONDENYMSG}
     * 
     * @param dEActionDenyMsg
     * 
     */
    @JsonProperty(FIELD_DEACTIONDENYMSG)
    public void setDEActionDenyMsg(String dEActionDenyMsg){
        this.set(FIELD_DEACTIONDENYMSG, dEActionDenyMsg);
    }
    
    /**
     * 获取 行为拒绝信息  
     * @return
     */
    @JsonIgnore
    public String getDEActionDenyMsg(){
        Object objValue = this.get(FIELD_DEACTIONDENYMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为拒绝信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEActionDenyMsgDirty(){
        if(this.contains(FIELD_DEACTIONDENYMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为拒绝信息
     */
    @JsonIgnore
    public void resetDEActionDenyMsg(){
        this.reset(FIELD_DEACTIONDENYMSG);
    }

    /**
     * 设置 行为拒绝信息，详细说明：{@link #FIELD_DEACTIONDENYMSG}
     * <P>
     * 等同 {@link #setDEActionDenyMsg}
     * @param dEActionDenyMsg
     */
    @JsonIgnore
    public PSDEMainState deactiondenymsg(String dEActionDenyMsg){
        this.setDEActionDenyMsg(dEActionDenyMsg);
        return this;
    }

    /**
     * <B>DEACTIONDMPSLANRESID</B>&nbsp;行为拒绝消息语言资源，指定实体行为拒绝提示信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_DEACTIONDMPSLANRESID = "deactiondmpslanresid";

    /**
     * 设置 行为拒绝消息语言资源，详细说明：{@link #FIELD_DEACTIONDMPSLANRESID}
     * 
     * @param dEActionDMPSLanResId
     * 
     */
    @JsonProperty(FIELD_DEACTIONDMPSLANRESID)
    public void setDEActionDMPSLanResId(String dEActionDMPSLanResId){
        this.set(FIELD_DEACTIONDMPSLANRESID, dEActionDMPSLanResId);
    }
    
    /**
     * 获取 行为拒绝消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getDEActionDMPSLanResId(){
        Object objValue = this.get(FIELD_DEACTIONDMPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为拒绝消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEActionDMPSLanResIdDirty(){
        if(this.contains(FIELD_DEACTIONDMPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为拒绝消息语言资源
     */
    @JsonIgnore
    public void resetDEActionDMPSLanResId(){
        this.reset(FIELD_DEACTIONDMPSLANRESID);
    }

    /**
     * 设置 行为拒绝消息语言资源，详细说明：{@link #FIELD_DEACTIONDMPSLANRESID}
     * <P>
     * 等同 {@link #setDEActionDMPSLanResId}
     * @param dEActionDMPSLanResId
     */
    @JsonIgnore
    public PSDEMainState deactiondmpslanresid(String dEActionDMPSLanResId){
        this.setDEActionDMPSLanResId(dEActionDMPSLanResId);
        return this;
    }

    /**
     * 设置 行为拒绝消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDEActionDMPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEMainState deactiondmpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setDEActionDMPSLanResId(null);
            this.setDEActionDMPSLanResName(null);
        }
        else{
            this.setDEActionDMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setDEActionDMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>DEACTIONDMPSLANRESNAME</B>&nbsp;行为拒绝消息语言资源，指定实体行为拒绝提示信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DEACTIONDMPSLANRESID}
     */
    public final static String FIELD_DEACTIONDMPSLANRESNAME = "deactiondmpslanresname";

    /**
     * 设置 行为拒绝消息语言资源，详细说明：{@link #FIELD_DEACTIONDMPSLANRESNAME}
     * 
     * @param dEActionDMPSLanResName
     * 
     */
    @JsonProperty(FIELD_DEACTIONDMPSLANRESNAME)
    public void setDEActionDMPSLanResName(String dEActionDMPSLanResName){
        this.set(FIELD_DEACTIONDMPSLANRESNAME, dEActionDMPSLanResName);
    }
    
    /**
     * 获取 行为拒绝消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getDEActionDMPSLanResName(){
        Object objValue = this.get(FIELD_DEACTIONDMPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为拒绝消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEActionDMPSLanResNameDirty(){
        if(this.contains(FIELD_DEACTIONDMPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为拒绝消息语言资源
     */
    @JsonIgnore
    public void resetDEActionDMPSLanResName(){
        this.reset(FIELD_DEACTIONDMPSLANRESNAME);
    }

    /**
     * 设置 行为拒绝消息语言资源，详细说明：{@link #FIELD_DEACTIONDMPSLANRESNAME}
     * <P>
     * 等同 {@link #setDEActionDMPSLanResName}
     * @param dEActionDMPSLanResName
     */
    @JsonIgnore
    public PSDEMainState deactiondmpslanresname(String dEActionDMPSLanResName){
        this.setDEActionDMPSLanResName(dEActionDMPSLanResName);
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认状态，指定实体主状态是否为所在实体的默认主状态，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认状态，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认状态  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultMode(){
        Object objValue = this.get(FIELD_DEFAULTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultModeDirty(){
        if(this.contains(FIELD_DEFAULTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认状态
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认状态，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEMainState defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认状态，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEMainState defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEOPPRIVDENYMSG</B>&nbsp;操作标识拒绝信息，指定实体操作标识拒绝的提示信息
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_DEOPPRIVDENYMSG = "deopprivdenymsg";

    /**
     * 设置 操作标识拒绝信息，详细说明：{@link #FIELD_DEOPPRIVDENYMSG}
     * 
     * @param dEOPPrivDenyMsg
     * 
     */
    @JsonProperty(FIELD_DEOPPRIVDENYMSG)
    public void setDEOPPrivDenyMsg(String dEOPPrivDenyMsg){
        this.set(FIELD_DEOPPRIVDENYMSG, dEOPPrivDenyMsg);
    }
    
    /**
     * 获取 操作标识拒绝信息  
     * @return
     */
    @JsonIgnore
    public String getDEOPPrivDenyMsg(){
        Object objValue = this.get(FIELD_DEOPPRIVDENYMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作标识拒绝信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEOPPrivDenyMsgDirty(){
        if(this.contains(FIELD_DEOPPRIVDENYMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作标识拒绝信息
     */
    @JsonIgnore
    public void resetDEOPPrivDenyMsg(){
        this.reset(FIELD_DEOPPRIVDENYMSG);
    }

    /**
     * 设置 操作标识拒绝信息，详细说明：{@link #FIELD_DEOPPRIVDENYMSG}
     * <P>
     * 等同 {@link #setDEOPPrivDenyMsg}
     * @param dEOPPrivDenyMsg
     */
    @JsonIgnore
    public PSDEMainState deopprivdenymsg(String dEOPPrivDenyMsg){
        this.setDEOPPrivDenyMsg(dEOPPrivDenyMsg);
        return this;
    }

    /**
     * <B>DEOPPRIVDMPSLANRESID</B>&nbsp;操作标识拒绝消息语言资源，指定实体操作标识拒绝提示信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_DEOPPRIVDMPSLANRESID = "deopprivdmpslanresid";

    /**
     * 设置 操作标识拒绝消息语言资源，详细说明：{@link #FIELD_DEOPPRIVDMPSLANRESID}
     * 
     * @param dEOPPrivDMPSLanResId
     * 
     */
    @JsonProperty(FIELD_DEOPPRIVDMPSLANRESID)
    public void setDEOPPrivDMPSLanResId(String dEOPPrivDMPSLanResId){
        this.set(FIELD_DEOPPRIVDMPSLANRESID, dEOPPrivDMPSLanResId);
    }
    
    /**
     * 获取 操作标识拒绝消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getDEOPPrivDMPSLanResId(){
        Object objValue = this.get(FIELD_DEOPPRIVDMPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作标识拒绝消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEOPPrivDMPSLanResIdDirty(){
        if(this.contains(FIELD_DEOPPRIVDMPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作标识拒绝消息语言资源
     */
    @JsonIgnore
    public void resetDEOPPrivDMPSLanResId(){
        this.reset(FIELD_DEOPPRIVDMPSLANRESID);
    }

    /**
     * 设置 操作标识拒绝消息语言资源，详细说明：{@link #FIELD_DEOPPRIVDMPSLANRESID}
     * <P>
     * 等同 {@link #setDEOPPrivDMPSLanResId}
     * @param dEOPPrivDMPSLanResId
     */
    @JsonIgnore
    public PSDEMainState deopprivdmpslanresid(String dEOPPrivDMPSLanResId){
        this.setDEOPPrivDMPSLanResId(dEOPPrivDMPSLanResId);
        return this;
    }

    /**
     * 设置 操作标识拒绝消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDEOPPrivDMPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEMainState deopprivdmpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setDEOPPrivDMPSLanResId(null);
            this.setDEOPPrivDMPSLanResName(null);
        }
        else{
            this.setDEOPPrivDMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setDEOPPrivDMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>DEOPPRIVDMPSLANRESNAME</B>&nbsp;操作标识拒绝消息语言资源，指定实体操作标识拒绝提示信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DEOPPRIVDMPSLANRESID}
     */
    public final static String FIELD_DEOPPRIVDMPSLANRESNAME = "deopprivdmpslanresname";

    /**
     * 设置 操作标识拒绝消息语言资源，详细说明：{@link #FIELD_DEOPPRIVDMPSLANRESNAME}
     * 
     * @param dEOPPrivDMPSLanResName
     * 
     */
    @JsonProperty(FIELD_DEOPPRIVDMPSLANRESNAME)
    public void setDEOPPrivDMPSLanResName(String dEOPPrivDMPSLanResName){
        this.set(FIELD_DEOPPRIVDMPSLANRESNAME, dEOPPrivDMPSLanResName);
    }
    
    /**
     * 获取 操作标识拒绝消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getDEOPPrivDMPSLanResName(){
        Object objValue = this.get(FIELD_DEOPPRIVDMPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作标识拒绝消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEOPPrivDMPSLanResNameDirty(){
        if(this.contains(FIELD_DEOPPRIVDMPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作标识拒绝消息语言资源
     */
    @JsonIgnore
    public void resetDEOPPrivDMPSLanResName(){
        this.reset(FIELD_DEOPPRIVDMPSLANRESNAME);
    }

    /**
     * 设置 操作标识拒绝消息语言资源，详细说明：{@link #FIELD_DEOPPRIVDMPSLANRESNAME}
     * <P>
     * 等同 {@link #setDEOPPrivDMPSLanResName}
     * @param dEOPPrivDMPSLanResName
     */
    @JsonIgnore
    public PSDEMainState deopprivdmpslanresname(String dEOPPrivDMPSLanResName){
        this.setDEOPPrivDMPSLanResName(dEOPPrivDMPSLanResName);
        return this;
    }

    /**
     * <B>EDITVIEWTYPE</B>&nbsp;编辑视图类型，指定实体主状态默认初始化编辑视图使用的视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEEditViewType} 
     */
    public final static String FIELD_EDITVIEWTYPE = "editviewtype";

    /**
     * 设置 编辑视图类型，详细说明：{@link #FIELD_EDITVIEWTYPE}
     * 
     * @param editViewType
     * 
     */
    @JsonProperty(FIELD_EDITVIEWTYPE)
    public void setEditViewType(String editViewType){
        this.set(FIELD_EDITVIEWTYPE, editViewType);
    }
    
    /**
     * 获取 编辑视图类型  
     * @return
     */
    @JsonIgnore
    public String getEditViewType(){
        Object objValue = this.get(FIELD_EDITVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditViewTypeDirty(){
        if(this.contains(FIELD_EDITVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑视图类型
     */
    @JsonIgnore
    public void resetEditViewType(){
        this.reset(FIELD_EDITVIEWTYPE);
    }

    /**
     * 设置 编辑视图类型，详细说明：{@link #FIELD_EDITVIEWTYPE}
     * <P>
     * 等同 {@link #setEditViewType}
     * @param editViewType
     */
    @JsonIgnore
    public PSDEMainState editviewtype(String editViewType){
        this.setEditViewType(editViewType);
        return this;
    }

     /**
     * 设置 编辑视图类型，详细说明：{@link #FIELD_EDITVIEWTYPE}
     * <P>
     * 等同 {@link #setEditViewType}
     * @param editViewType
     */
    @JsonIgnore
    public PSDEMainState editviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEEditViewType editViewType){
        if(editViewType == null){
            this.setEditViewType(null);
        }
        else{
            this.setEditViewType(editViewType.value);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用视图操作控制，指定实体主状态视图是否启用视图操作控制，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用视图操作控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableViewActions(){
        Object objValue = this.get(FIELD_ENABLEVIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图操作控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableViewActionsDirty(){
        if(this.contains(FIELD_ENABLEVIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图操作控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEMainState enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEMainState enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENTERPSDEACTIONID</B>&nbsp;进入状态实体行为，指定进入状态的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_ENTERPSDEACTIONID = "enterpsdeactionid";

    /**
     * 设置 进入状态实体行为，详细说明：{@link #FIELD_ENTERPSDEACTIONID}
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
     * 设置 进入状态实体行为，详细说明：{@link #FIELD_ENTERPSDEACTIONID}
     * <P>
     * 等同 {@link #setEnterPSDEActionId}
     * @param enterPSDEActionId
     */
    @JsonIgnore
    public PSDEMainState enterpsdeactionid(String enterPSDEActionId){
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
    public PSDEMainState enterpsdeactionid(PSDEAction pSDEAction){
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
     * <B>ENTERPSDEACTIONNAME</B>&nbsp;进入状态实体行为，指定进入状态的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ENTERPSDEACTIONID}
     */
    public final static String FIELD_ENTERPSDEACTIONNAME = "enterpsdeactionname";

    /**
     * 设置 进入状态实体行为，详细说明：{@link #FIELD_ENTERPSDEACTIONNAME}
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
     * 设置 进入状态实体行为，详细说明：{@link #FIELD_ENTERPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setEnterPSDEActionName}
     * @param enterPSDEActionName
     */
    @JsonIgnore
    public PSDEMainState enterpsdeactionname(String enterPSDEActionName){
        this.setEnterPSDEActionName(enterPSDEActionName);
        return this;
    }

    /**
     * <B>FIELDALLOWMODE</B>&nbsp;属性允许模式，指定主状态属性的控制模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionMode} 
     */
    public final static String FIELD_FIELDALLOWMODE = "fieldallowmode";

    /**
     * 设置 属性允许模式，详细说明：{@link #FIELD_FIELDALLOWMODE}
     * 
     * @param fieldAllowMode
     * 
     */
    @JsonProperty(FIELD_FIELDALLOWMODE)
    public void setFieldAllowMode(String fieldAllowMode){
        this.set(FIELD_FIELDALLOWMODE, fieldAllowMode);
    }
    
    /**
     * 获取 属性允许模式  
     * @return
     */
    @JsonIgnore
    public String getFieldAllowMode(){
        Object objValue = this.get(FIELD_FIELDALLOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性允许模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldAllowModeDirty(){
        if(this.contains(FIELD_FIELDALLOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性允许模式
     */
    @JsonIgnore
    public void resetFieldAllowMode(){
        this.reset(FIELD_FIELDALLOWMODE);
    }

    /**
     * 设置 属性允许模式，详细说明：{@link #FIELD_FIELDALLOWMODE}
     * <P>
     * 等同 {@link #setFieldAllowMode}
     * @param fieldAllowMode
     */
    @JsonIgnore
    public PSDEMainState fieldallowmode(String fieldAllowMode){
        this.setFieldAllowMode(fieldAllowMode);
        return this;
    }

     /**
     * 设置 属性允许模式，详细说明：{@link #FIELD_FIELDALLOWMODE}
     * <P>
     * 等同 {@link #setFieldAllowMode}
     * @param fieldAllowMode
     */
    @JsonIgnore
    public PSDEMainState fieldallowmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionMode fieldAllowMode){
        if(fieldAllowMode == null){
            this.setFieldAllowMode(null);
        }
        else{
            this.setFieldAllowMode(fieldAllowMode.value);
        }
        return this;
    }

    /**
     * <B>FORMCODENAME</B>&nbsp;表单代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_FORMCODENAME = "formcodename";

    /**
     * 设置 表单代码标识
     * 
     * @param formCodeName
     * 
     */
    @JsonProperty(FIELD_FORMCODENAME)
    public void setFormCodeName(String formCodeName){
        this.set(FIELD_FORMCODENAME, formCodeName);
    }
    
    /**
     * 获取 表单代码标识  
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
     * 判断 表单代码标识 是否指定值，包括空值
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
     * 重置 表单代码标识
     */
    @JsonIgnore
    public void resetFormCodeName(){
        this.reset(FIELD_FORMCODENAME);
    }

    /**
     * 设置 表单代码标识
     * <P>
     * 等同 {@link #setFormCodeName}
     * @param formCodeName
     */
    @JsonIgnore
    public PSDEMainState formcodename(String formCodeName){
        this.setFormCodeName(formCodeName);
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
    public PSDEMainState memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBEDITVIEWTYPE</B>&nbsp;移动端编辑视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMobEditViewType} 
     */
    public final static String FIELD_MOBEDITVIEWTYPE = "mobeditviewtype";

    /**
     * 设置 移动端编辑视图类型
     * 
     * @param mobEditViewType
     * 
     */
    @JsonProperty(FIELD_MOBEDITVIEWTYPE)
    public void setMobEditViewType(String mobEditViewType){
        this.set(FIELD_MOBEDITVIEWTYPE, mobEditViewType);
    }
    
    /**
     * 获取 移动端编辑视图类型  
     * @return
     */
    @JsonIgnore
    public String getMobEditViewType(){
        Object objValue = this.get(FIELD_MOBEDITVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端编辑视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobEditViewTypeDirty(){
        if(this.contains(FIELD_MOBEDITVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端编辑视图类型
     */
    @JsonIgnore
    public void resetMobEditViewType(){
        this.reset(FIELD_MOBEDITVIEWTYPE);
    }

    /**
     * 设置 移动端编辑视图类型
     * <P>
     * 等同 {@link #setMobEditViewType}
     * @param mobEditViewType
     */
    @JsonIgnore
    public PSDEMainState mobeditviewtype(String mobEditViewType){
        this.setMobEditViewType(mobEditViewType);
        return this;
    }

     /**
     * 设置 移动端编辑视图类型
     * <P>
     * 等同 {@link #setMobEditViewType}
     * @param mobEditViewType
     */
    @JsonIgnore
    public PSDEMainState mobeditviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEMobEditViewType mobEditViewType){
        if(mobEditViewType == null){
            this.setMobEditViewType(null);
        }
        else{
            this.setMobEditViewType(mobEditViewType.value);
        }
        return this;
    }

    /**
     * <B>MOBFORMCODENAME</B>&nbsp;移动端表单代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBFORMCODENAME = "mobformcodename";

    /**
     * 设置 移动端表单代码标识
     * 
     * @param mobFormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBFORMCODENAME)
    public void setMobFormCodeName(String mobFormCodeName){
        this.set(FIELD_MOBFORMCODENAME, mobFormCodeName);
    }
    
    /**
     * 获取 移动端表单代码标识  
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
     * 判断 移动端表单代码标识 是否指定值，包括空值
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
     * 重置 移动端表单代码标识
     */
    @JsonIgnore
    public void resetMobFormCodeName(){
        this.reset(FIELD_MOBFORMCODENAME);
    }

    /**
     * 设置 移动端表单代码标识
     * <P>
     * 等同 {@link #setMobFormCodeName}
     * @param mobFormCodeName
     */
    @JsonIgnore
    public PSDEMainState mobformcodename(String mobFormCodeName){
        this.setMobFormCodeName(mobFormCodeName);
        return this;
    }

    /**
     * <B>MOBPSDEFORMID</B>&nbsp;移动端表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBPSDEFORMID = "mobpsdeformid";

    /**
     * 设置 移动端表单
     * 
     * @param mobPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMID)
    public void setMobPSDEFormId(String mobPSDEFormId){
        this.set(FIELD_MOBPSDEFORMID, mobPSDEFormId);
    }
    
    /**
     * 获取 移动端表单  
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
     * 判断 移动端表单 是否指定值，包括空值
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
     * 重置 移动端表单
     */
    @JsonIgnore
    public void resetMobPSDEFormId(){
        this.reset(FIELD_MOBPSDEFORMID);
    }

    /**
     * 设置 移动端表单
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param mobPSDEFormId
     */
    @JsonIgnore
    public PSDEMainState mobpsdeformid(String mobPSDEFormId){
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEMainState mobpsdeformid(PSDEForm pSDEForm){
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
     * <B>MOBPSDEFORMNAME</B>&nbsp;移动端表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBPSDEFORMNAME = "mobpsdeformname";

    /**
     * 设置 移动端表单
     * 
     * @param mobPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMNAME)
    public void setMobPSDEFormName(String mobPSDEFormName){
        this.set(FIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }
    
    /**
     * 获取 移动端表单  
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
     * 判断 移动端表单 是否指定值，包括空值
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
     * 重置 移动端表单
     */
    @JsonIgnore
    public void resetMobPSDEFormName(){
        this.reset(FIELD_MOBPSDEFORMNAME);
    }

    /**
     * 设置 移动端表单
     * <P>
     * 等同 {@link #setMobPSDEFormName}
     * @param mobPSDEFormName
     */
    @JsonIgnore
    public PSDEMainState mobpsdeformname(String mobPSDEFormName){
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    /**
     * <B>MOBQUICKFORMCODENAME</B>&nbsp;移动端快速表单代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBQUICKPSDEFORMID}
     */
    public final static String FIELD_MOBQUICKFORMCODENAME = "mobquickformcodename";

    /**
     * 设置 移动端快速表单代码标识
     * 
     * @param mobQuickFormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBQUICKFORMCODENAME)
    public void setMobQuickFormCodeName(String mobQuickFormCodeName){
        this.set(FIELD_MOBQUICKFORMCODENAME, mobQuickFormCodeName);
    }
    
    /**
     * 获取 移动端快速表单代码标识  
     * @return
     */
    @JsonIgnore
    public String getMobQuickFormCodeName(){
        Object objValue = this.get(FIELD_MOBQUICKFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端快速表单代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobQuickFormCodeNameDirty(){
        if(this.contains(FIELD_MOBQUICKFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端快速表单代码标识
     */
    @JsonIgnore
    public void resetMobQuickFormCodeName(){
        this.reset(FIELD_MOBQUICKFORMCODENAME);
    }

    /**
     * 设置 移动端快速表单代码标识
     * <P>
     * 等同 {@link #setMobQuickFormCodeName}
     * @param mobQuickFormCodeName
     */
    @JsonIgnore
    public PSDEMainState mobquickformcodename(String mobQuickFormCodeName){
        this.setMobQuickFormCodeName(mobQuickFormCodeName);
        return this;
    }

    /**
     * <B>MOBQUICKPSDEFORMID</B>&nbsp;移动端快速表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBQUICKPSDEFORMID = "mobquickpsdeformid";

    /**
     * 设置 移动端快速表单
     * 
     * @param mobQuickPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBQUICKPSDEFORMID)
    public void setMobQuickPSDEFormId(String mobQuickPSDEFormId){
        this.set(FIELD_MOBQUICKPSDEFORMID, mobQuickPSDEFormId);
    }
    
    /**
     * 获取 移动端快速表单  
     * @return
     */
    @JsonIgnore
    public String getMobQuickPSDEFormId(){
        Object objValue = this.get(FIELD_MOBQUICKPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端快速表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobQuickPSDEFormIdDirty(){
        if(this.contains(FIELD_MOBQUICKPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端快速表单
     */
    @JsonIgnore
    public void resetMobQuickPSDEFormId(){
        this.reset(FIELD_MOBQUICKPSDEFORMID);
    }

    /**
     * 设置 移动端快速表单
     * <P>
     * 等同 {@link #setMobQuickPSDEFormId}
     * @param mobQuickPSDEFormId
     */
    @JsonIgnore
    public PSDEMainState mobquickpsdeformid(String mobQuickPSDEFormId){
        this.setMobQuickPSDEFormId(mobQuickPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端快速表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobQuickPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEMainState mobquickpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobQuickFormCodeName(null);
            this.setMobQuickPSDEFormId(null);
            this.setMobQuickPSDEFormName(null);
        }
        else{
            this.setMobQuickFormCodeName(pSDEForm.getCodeName());
            this.setMobQuickPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobQuickPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBQUICKPSDEFORMNAME</B>&nbsp;移动端快速表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBQUICKPSDEFORMID}
     */
    public final static String FIELD_MOBQUICKPSDEFORMNAME = "mobquickpsdeformname";

    /**
     * 设置 移动端快速表单
     * 
     * @param mobQuickPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBQUICKPSDEFORMNAME)
    public void setMobQuickPSDEFormName(String mobQuickPSDEFormName){
        this.set(FIELD_MOBQUICKPSDEFORMNAME, mobQuickPSDEFormName);
    }
    
    /**
     * 获取 移动端快速表单  
     * @return
     */
    @JsonIgnore
    public String getMobQuickPSDEFormName(){
        Object objValue = this.get(FIELD_MOBQUICKPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端快速表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobQuickPSDEFormNameDirty(){
        if(this.contains(FIELD_MOBQUICKPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端快速表单
     */
    @JsonIgnore
    public void resetMobQuickPSDEFormName(){
        this.reset(FIELD_MOBQUICKPSDEFORMNAME);
    }

    /**
     * 设置 移动端快速表单
     * <P>
     * 等同 {@link #setMobQuickPSDEFormName}
     * @param mobQuickPSDEFormName
     */
    @JsonIgnore
    public PSDEMainState mobquickpsdeformname(String mobQuickPSDEFormName){
        this.setMobQuickPSDEFormName(mobQuickPSDEFormName);
        return this;
    }

    /**
     * <B>MOBUTILFORMCODENAME</B>&nbsp;移动端功能表单代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTILPSDEFORMID}
     */
    public final static String FIELD_MOBUTILFORMCODENAME = "mobutilformcodename";

    /**
     * 设置 移动端功能表单代码标识
     * 
     * @param mobUtilFormCodeName
     * 
     */
    @JsonProperty(FIELD_MOBUTILFORMCODENAME)
    public void setMobUtilFormCodeName(String mobUtilFormCodeName){
        this.set(FIELD_MOBUTILFORMCODENAME, mobUtilFormCodeName);
    }
    
    /**
     * 获取 移动端功能表单代码标识  
     * @return
     */
    @JsonIgnore
    public String getMobUtilFormCodeName(){
        Object objValue = this.get(FIELD_MOBUTILFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtilFormCodeNameDirty(){
        if(this.contains(FIELD_MOBUTILFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单代码标识
     */
    @JsonIgnore
    public void resetMobUtilFormCodeName(){
        this.reset(FIELD_MOBUTILFORMCODENAME);
    }

    /**
     * 设置 移动端功能表单代码标识
     * <P>
     * 等同 {@link #setMobUtilFormCodeName}
     * @param mobUtilFormCodeName
     */
    @JsonIgnore
    public PSDEMainState mobutilformcodename(String mobUtilFormCodeName){
        this.setMobUtilFormCodeName(mobUtilFormCodeName);
        return this;
    }

    /**
     * <B>MOBUTILPSDEFORMID</B>&nbsp;移动端功能表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MOBUTILPSDEFORMID = "mobutilpsdeformid";

    /**
     * 设置 移动端功能表单
     * 
     * @param mobUtilPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBUTILPSDEFORMID)
    public void setMobUtilPSDEFormId(String mobUtilPSDEFormId){
        this.set(FIELD_MOBUTILPSDEFORMID, mobUtilPSDEFormId);
    }
    
    /**
     * 获取 移动端功能表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtilPSDEFormId(){
        Object objValue = this.get(FIELD_MOBUTILPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtilPSDEFormIdDirty(){
        if(this.contains(FIELD_MOBUTILPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单
     */
    @JsonIgnore
    public void resetMobUtilPSDEFormId(){
        this.reset(FIELD_MOBUTILPSDEFORMID);
    }

    /**
     * 设置 移动端功能表单
     * <P>
     * 等同 {@link #setMobUtilPSDEFormId}
     * @param mobUtilPSDEFormId
     */
    @JsonIgnore
    public PSDEMainState mobutilpsdeformid(String mobUtilPSDEFormId){
        this.setMobUtilPSDEFormId(mobUtilPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端功能表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobUtilPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEMainState mobutilpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMobUtilFormCodeName(null);
            this.setMobUtilPSDEFormId(null);
            this.setMobUtilPSDEFormName(null);
        }
        else{
            this.setMobUtilFormCodeName(pSDEForm.getCodeName());
            this.setMobUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBUTILPSDEFORMNAME</B>&nbsp;移动端功能表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBUTILPSDEFORMID}
     */
    public final static String FIELD_MOBUTILPSDEFORMNAME = "mobutilpsdeformname";

    /**
     * 设置 移动端功能表单
     * 
     * @param mobUtilPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBUTILPSDEFORMNAME)
    public void setMobUtilPSDEFormName(String mobUtilPSDEFormName){
        this.set(FIELD_MOBUTILPSDEFORMNAME, mobUtilPSDEFormName);
    }
    
    /**
     * 获取 移动端功能表单  
     * @return
     */
    @JsonIgnore
    public String getMobUtilPSDEFormName(){
        Object objValue = this.get(FIELD_MOBUTILPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端功能表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobUtilPSDEFormNameDirty(){
        if(this.contains(FIELD_MOBUTILPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端功能表单
     */
    @JsonIgnore
    public void resetMobUtilPSDEFormName(){
        this.reset(FIELD_MOBUTILPSDEFORMNAME);
    }

    /**
     * 设置 移动端功能表单
     * <P>
     * 等同 {@link #setMobUtilPSDEFormName}
     * @param mobUtilPSDEFormName
     */
    @JsonIgnore
    public PSDEMainState mobutilpsdeformname(String mobUtilPSDEFormName){
        this.setMobUtilPSDEFormName(mobUtilPSDEFormName);
        return this;
    }

    /**
     * <B>MSTAG</B>&nbsp;主状态标记，指定实体主状态的标记，由指定的状态值合成
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MSTAG = "mstag";

    /**
     * 设置 主状态标记，详细说明：{@link #FIELD_MSTAG}
     * 
     * @param mSTag
     * 
     */
    @JsonProperty(FIELD_MSTAG)
    public void setMSTag(String mSTag){
        this.set(FIELD_MSTAG, mSTag);
    }
    
    /**
     * 获取 主状态标记  
     * @return
     */
    @JsonIgnore
    public String getMSTag(){
        Object objValue = this.get(FIELD_MSTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSTagDirty(){
        if(this.contains(FIELD_MSTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态标记
     */
    @JsonIgnore
    public void resetMSTag(){
        this.reset(FIELD_MSTAG);
    }

    /**
     * 设置 主状态标记，详细说明：{@link #FIELD_MSTAG}
     * <P>
     * 等同 {@link #setMSTag}
     * @param mSTag
     */
    @JsonIgnore
    public PSDEMainState mstag(String mSTag){
        this.setMSTag(mSTag);
        return this;
    }

    /**
     * <B>MSVALUE</B>&nbsp;状态值，指定实体主状态属性的值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MSVALUE = "msvalue";

    /**
     * 设置 状态值，详细说明：{@link #FIELD_MSVALUE}
     * 
     * @param mSValue
     * 
     */
    @JsonProperty(FIELD_MSVALUE)
    public void setMSValue(String mSValue){
        this.set(FIELD_MSVALUE, mSValue);
    }
    
    /**
     * 获取 状态值  
     * @return
     */
    @JsonIgnore
    public String getMSValue(){
        Object objValue = this.get(FIELD_MSVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSValueDirty(){
        if(this.contains(FIELD_MSVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态值
     */
    @JsonIgnore
    public void resetMSValue(){
        this.reset(FIELD_MSVALUE);
    }

    /**
     * 设置 状态值，详细说明：{@link #FIELD_MSVALUE}
     * <P>
     * 等同 {@link #setMSValue}
     * @param mSValue
     */
    @JsonIgnore
    public PSDEMainState msvalue(String mSValue){
        this.setMSValue(mSValue);
        return this;
    }

    /**
     * <B>MSVALUE2</B>&nbsp;状态值2，如实体定义主状态属性2，指定实体主状态属性2的值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MSVALUE2 = "msvalue2";

    /**
     * 设置 状态值2，详细说明：{@link #FIELD_MSVALUE2}
     * 
     * @param mSValue2
     * 
     */
    @JsonProperty(FIELD_MSVALUE2)
    public void setMSValue2(String mSValue2){
        this.set(FIELD_MSVALUE2, mSValue2);
    }
    
    /**
     * 获取 状态值2  
     * @return
     */
    @JsonIgnore
    public String getMSValue2(){
        Object objValue = this.get(FIELD_MSVALUE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态值2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSValue2Dirty(){
        if(this.contains(FIELD_MSVALUE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态值2
     */
    @JsonIgnore
    public void resetMSValue2(){
        this.reset(FIELD_MSVALUE2);
    }

    /**
     * 设置 状态值2，详细说明：{@link #FIELD_MSVALUE2}
     * <P>
     * 等同 {@link #setMSValue2}
     * @param mSValue2
     */
    @JsonIgnore
    public PSDEMainState msvalue2(String mSValue2){
        this.setMSValue2(mSValue2);
        return this;
    }

    /**
     * <B>MSVALUE3</B>&nbsp;状态值3，如实体定义主状态属性3，指定实体主状态属性3的值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MSVALUE3 = "msvalue3";

    /**
     * 设置 状态值3，详细说明：{@link #FIELD_MSVALUE3}
     * 
     * @param mSValue3
     * 
     */
    @JsonProperty(FIELD_MSVALUE3)
    public void setMSValue3(String mSValue3){
        this.set(FIELD_MSVALUE3, mSValue3);
    }
    
    /**
     * 获取 状态值3  
     * @return
     */
    @JsonIgnore
    public String getMSValue3(){
        Object objValue = this.get(FIELD_MSVALUE3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态值3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMSValue3Dirty(){
        if(this.contains(FIELD_MSVALUE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态值3
     */
    @JsonIgnore
    public void resetMSValue3(){
        this.reset(FIELD_MSVALUE3);
    }

    /**
     * 设置 状态值3，详细说明：{@link #FIELD_MSVALUE3}
     * <P>
     * 等同 {@link #setMSValue3}
     * @param mSValue3
     */
    @JsonIgnore
    public PSDEMainState msvalue3(String mSValue3){
        this.setMSValue3(mSValue3);
        return this;
    }

    /**
     * <B>OPPRIVALLOWMODE</B>&nbsp;操作标识允许模式，指定主状态操作标识的控制模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionMode} 
     */
    public final static String FIELD_OPPRIVALLOWMODE = "opprivallowmode";

    /**
     * 设置 操作标识允许模式，详细说明：{@link #FIELD_OPPRIVALLOWMODE}
     * 
     * @param oPPrivAllowMode
     * 
     */
    @JsonProperty(FIELD_OPPRIVALLOWMODE)
    public void setOPPrivAllowMode(String oPPrivAllowMode){
        this.set(FIELD_OPPRIVALLOWMODE, oPPrivAllowMode);
    }
    
    /**
     * 获取 操作标识允许模式  
     * @return
     */
    @JsonIgnore
    public String getOPPrivAllowMode(){
        Object objValue = this.get(FIELD_OPPRIVALLOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作标识允许模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOPPrivAllowModeDirty(){
        if(this.contains(FIELD_OPPRIVALLOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作标识允许模式
     */
    @JsonIgnore
    public void resetOPPrivAllowMode(){
        this.reset(FIELD_OPPRIVALLOWMODE);
    }

    /**
     * 设置 操作标识允许模式，详细说明：{@link #FIELD_OPPRIVALLOWMODE}
     * <P>
     * 等同 {@link #setOPPrivAllowMode}
     * @param oPPrivAllowMode
     */
    @JsonIgnore
    public PSDEMainState opprivallowmode(String oPPrivAllowMode){
        this.setOPPrivAllowMode(oPPrivAllowMode);
        return this;
    }

     /**
     * 设置 操作标识允许模式，详细说明：{@link #FIELD_OPPRIVALLOWMODE}
     * <P>
     * 等同 {@link #setOPPrivAllowMode}
     * @param oPPrivAllowMode
     */
    @JsonIgnore
    public PSDEMainState opprivallowmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEMSActionMode oPPrivAllowMode){
        if(oPPrivAllowMode == null){
            this.setOPPrivAllowMode(null);
        }
        else{
            this.setOPPrivAllowMode(oPPrivAllowMode.value);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定主状态的排序值
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
    public PSDEMainState ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;数据查询，指定主状态数据的数据查询对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataQuery} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * 
     * @param pSDEDQId
     * 
     */
    @JsonProperty(FIELD_PSDEDQID)
    public void setPSDEDQId(String pSDEDQId){
        this.set(FIELD_PSDEDQID, pSDEDQId);
    }
    
    /**
     * 获取 数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQId(){
        Object objValue = this.get(FIELD_PSDEDQID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQIdDirty(){
        if(this.contains(FIELD_PSDEDQID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询
     */
    @JsonIgnore
    public void resetPSDEDQId(){
        this.reset(FIELD_PSDEDQID);
    }

    /**
     * 设置 数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDEMainState psdedqid(String pSDEDQId){
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    /**
     * 设置 数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDEMainState psdedqid(PSDEDataQuery pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        }
        else{
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;数据查询，指定主状态数据的数据查询对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * 
     * @param pSDEDQName
     * 
     */
    @JsonProperty(FIELD_PSDEDQNAME)
    public void setPSDEDQName(String pSDEDQName){
        this.set(FIELD_PSDEDQNAME, pSDEDQName);
    }
    
    /**
     * 获取 数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQName(){
        Object objValue = this.get(FIELD_PSDEDQNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQNameDirty(){
        if(this.contains(FIELD_PSDEDQNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询
     */
    @JsonIgnore
    public void resetPSDEDQName(){
        this.reset(FIELD_PSDEDQNAME);
    }

    /**
     * 设置 数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDEMainState psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;主状态表单，指定主状态的编辑表单对象，自定义初始化编辑视图时将使用此表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 主状态表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 主状态表单  
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
     * 判断 主状态表单 是否指定值，包括空值
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
     * 重置 主状态表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 主状态表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEMainState psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 主状态表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEMainState psdeformid(PSDEForm pSDEForm){
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
     * <B>PSDEFORMNAME</B>&nbsp;主状态表单，指定主状态的编辑表单对象，自定义初始化编辑视图时将使用此表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 主状态表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 主状态表单  
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
     * 判断 主状态表单 是否指定值，包括空值
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
     * 重置 主状态表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 主状态表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEMainState psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定主状态所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSDEMainState psdeid(String pSDEId){
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
    public PSDEMainState psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDEMAINSTATEID</B>&nbsp;实体主状态标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMAINSTATEID = "psdemainstateid";

    /**
     * 设置 实体主状态标识
     * 
     * @param pSDEMainStateId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATEID)
    public void setPSDEMainStateId(String pSDEMainStateId){
        this.set(FIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }
    
    /**
     * 获取 实体主状态标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态标识
     */
    @JsonIgnore
    public void resetPSDEMainStateId(){
        this.reset(FIELD_PSDEMAINSTATEID);
    }

    /**
     * 设置 实体主状态标识
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainStateId
     */
    @JsonIgnore
    public PSDEMainState psdemainstateid(String pSDEMainStateId){
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    /**
     * <B>PSDEMAINSTATENAME</B>&nbsp;主状态名称，指定实体主状态的名称，需在所在实体对象具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEMAINSTATENAME = "psdemainstatename";

    /**
     * 设置 主状态名称，详细说明：{@link #FIELD_PSDEMAINSTATENAME}
     * 
     * @param pSDEMainStateName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATENAME)
    public void setPSDEMainStateName(String pSDEMainStateName){
        this.set(FIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }
    
    /**
     * 获取 主状态名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态名称
     */
    @JsonIgnore
    public void resetPSDEMainStateName(){
        this.reset(FIELD_PSDEMAINSTATENAME);
    }

    /**
     * 设置 主状态名称，详细说明：{@link #FIELD_PSDEMAINSTATENAME}
     * <P>
     * 等同 {@link #setPSDEMainStateName}
     * @param pSDEMainStateName
     */
    @JsonIgnore
    public PSDEMainState psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEMainStateName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEMainStateName(strName);
    }

    @JsonIgnore
    public PSDEMainState name(String strName){
        this.setPSDEMainStateName(strName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定主状态所在的实体对象
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
    public PSDEMainState psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 界面样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 界面样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEMainState pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 界面样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEMainState pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEMainState pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
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
    public PSDEMainState pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDEMainState pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDEMainState pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;主状态图标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 主状态图标
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 主状态图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 主状态图标
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEMainState pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 主状态图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEMainState pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;主状态图标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 主状态图标
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 主状态图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 主状态图标
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEMainState pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>QUICKFORMCODENAME</B>&nbsp;快速表单代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_QUICKPSDEFORMID}
     */
    public final static String FIELD_QUICKFORMCODENAME = "quickformcodename";

    /**
     * 设置 快速表单代码标识
     * 
     * @param quickFormCodeName
     * 
     */
    @JsonProperty(FIELD_QUICKFORMCODENAME)
    public void setQuickFormCodeName(String quickFormCodeName){
        this.set(FIELD_QUICKFORMCODENAME, quickFormCodeName);
    }
    
    /**
     * 获取 快速表单代码标识  
     * @return
     */
    @JsonIgnore
    public String getQuickFormCodeName(){
        Object objValue = this.get(FIELD_QUICKFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速表单代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickFormCodeNameDirty(){
        if(this.contains(FIELD_QUICKFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速表单代码标识
     */
    @JsonIgnore
    public void resetQuickFormCodeName(){
        this.reset(FIELD_QUICKFORMCODENAME);
    }

    /**
     * 设置 快速表单代码标识
     * <P>
     * 等同 {@link #setQuickFormCodeName}
     * @param quickFormCodeName
     */
    @JsonIgnore
    public PSDEMainState quickformcodename(String quickFormCodeName){
        this.setQuickFormCodeName(quickFormCodeName);
        return this;
    }

    /**
     * <B>QUICKPSDEFORMID</B>&nbsp;主状态快速表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_QUICKPSDEFORMID = "quickpsdeformid";

    /**
     * 设置 主状态快速表单
     * 
     * @param quickPSDEFormId
     * 
     */
    @JsonProperty(FIELD_QUICKPSDEFORMID)
    public void setQuickPSDEFormId(String quickPSDEFormId){
        this.set(FIELD_QUICKPSDEFORMID, quickPSDEFormId);
    }
    
    /**
     * 获取 主状态快速表单  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEFormId(){
        Object objValue = this.get(FIELD_QUICKPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态快速表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEFormIdDirty(){
        if(this.contains(FIELD_QUICKPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态快速表单
     */
    @JsonIgnore
    public void resetQuickPSDEFormId(){
        this.reset(FIELD_QUICKPSDEFORMID);
    }

    /**
     * 设置 主状态快速表单
     * <P>
     * 等同 {@link #setQuickPSDEFormId}
     * @param quickPSDEFormId
     */
    @JsonIgnore
    public PSDEMainState quickpsdeformid(String quickPSDEFormId){
        this.setQuickPSDEFormId(quickPSDEFormId);
        return this;
    }

    /**
     * 设置 主状态快速表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setQuickPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEMainState quickpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setQuickFormCodeName(null);
            this.setQuickPSDEFormId(null);
            this.setQuickPSDEFormName(null);
        }
        else{
            this.setQuickFormCodeName(pSDEForm.getCodeName());
            this.setQuickPSDEFormId(pSDEForm.getPSDEFormId());
            this.setQuickPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>QUICKPSDEFORMNAME</B>&nbsp;主状态快速表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_QUICKPSDEFORMID}
     */
    public final static String FIELD_QUICKPSDEFORMNAME = "quickpsdeformname";

    /**
     * 设置 主状态快速表单
     * 
     * @param quickPSDEFormName
     * 
     */
    @JsonProperty(FIELD_QUICKPSDEFORMNAME)
    public void setQuickPSDEFormName(String quickPSDEFormName){
        this.set(FIELD_QUICKPSDEFORMNAME, quickPSDEFormName);
    }
    
    /**
     * 获取 主状态快速表单  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEFormName(){
        Object objValue = this.get(FIELD_QUICKPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态快速表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEFormNameDirty(){
        if(this.contains(FIELD_QUICKPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态快速表单
     */
    @JsonIgnore
    public void resetQuickPSDEFormName(){
        this.reset(FIELD_QUICKPSDEFORMNAME);
    }

    /**
     * 设置 主状态快速表单
     * <P>
     * 等同 {@link #setQuickPSDEFormName}
     * @param quickPSDEFormName
     */
    @JsonIgnore
    public PSDEMainState quickpsdeformname(String quickPSDEFormName){
        this.setQuickPSDEFormName(quickPSDEFormName);
        return this;
    }

    /**
     * <B>TEXTPSLANRESID</B>&nbsp;标题语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TEXTPSLANRESID = "textpslanresid";

    /**
     * 设置 标题语言资源
     * 
     * @param textPSLanResId
     * 
     */
    @JsonProperty(FIELD_TEXTPSLANRESID)
    public void setTextPSLanResId(String textPSLanResId){
        this.set(FIELD_TEXTPSLANRESID, textPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTextPSLanResId(){
        Object objValue = this.get(FIELD_TEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSLanResIdDirty(){
        if(this.contains(FIELD_TEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTextPSLanResId(){
        this.reset(FIELD_TEXTPSLANRESID);
    }

    /**
     * 设置 标题语言资源
     * <P>
     * 等同 {@link #setTextPSLanResId}
     * @param textPSLanResId
     */
    @JsonIgnore
    public PSDEMainState textpslanresid(String textPSLanResId){
        this.setTextPSLanResId(textPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEMainState textpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTextPSLanResId(null);
            this.setTextPSLanResName(null);
        }
        else{
            this.setTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TEXTPSLANRESNAME</B>&nbsp;标题语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSLANRESID}
     */
    public final static String FIELD_TEXTPSLANRESNAME = "textpslanresname";

    /**
     * 设置 标题语言资源
     * 
     * @param textPSLanResName
     * 
     */
    @JsonProperty(FIELD_TEXTPSLANRESNAME)
    public void setTextPSLanResName(String textPSLanResName){
        this.set(FIELD_TEXTPSLANRESNAME, textPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTextPSLanResName(){
        Object objValue = this.get(FIELD_TEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSLanResNameDirty(){
        if(this.contains(FIELD_TEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTextPSLanResName(){
        this.reset(FIELD_TEXTPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源
     * <P>
     * 等同 {@link #setTextPSLanResName}
     * @param textPSLanResName
     */
    @JsonIgnore
    public PSDEMainState textpslanresname(String textPSLanResName){
        this.setTextPSLanResName(textPSLanResName);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 提示语言资源
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
     * 设置 提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSDEMainState tippslanresid(String tipPSLanResId){
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
    public PSDEMainState tippslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 提示语言资源
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
     * 设置 提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSDEMainState tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_TOOLTIPINFO = "tooltipinfo";

    /**
     * 设置 提示信息
     * 
     * @param tooltipInfo
     * 
     */
    @JsonProperty(FIELD_TOOLTIPINFO)
    public void setTooltipInfo(String tooltipInfo){
        this.set(FIELD_TOOLTIPINFO, tooltipInfo);
    }
    
    /**
     * 获取 提示信息  
     * @return
     */
    @JsonIgnore
    public String getTooltipInfo(){
        Object objValue = this.get(FIELD_TOOLTIPINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTooltipInfoDirty(){
        if(this.contains(FIELD_TOOLTIPINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示信息
     */
    @JsonIgnore
    public void resetTooltipInfo(){
        this.reset(FIELD_TOOLTIPINFO);
    }

    /**
     * 设置 提示信息
     * <P>
     * 等同 {@link #setTooltipInfo}
     * @param tooltipInfo
     */
    @JsonIgnore
    public PSDEMainState tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
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
    public PSDEMainState updatedate(String updateDate){
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
    public PSDEMainState updateman(String updateMan){
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
    public PSDEMainState usercat(String userCat){
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
    public PSDEMainState usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMainState usertag(String userTag){
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
    public PSDEMainState usertag2(String userTag2){
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
    public PSDEMainState usertag3(String userTag3){
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
    public PSDEMainState usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTILFORMCODENAME</B>&nbsp;功能表单代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDEFORMID}
     */
    public final static String FIELD_UTILFORMCODENAME = "utilformcodename";

    /**
     * 设置 功能表单代码标识
     * 
     * @param utilFormCodeName
     * 
     */
    @JsonProperty(FIELD_UTILFORMCODENAME)
    public void setUtilFormCodeName(String utilFormCodeName){
        this.set(FIELD_UTILFORMCODENAME, utilFormCodeName);
    }
    
    /**
     * 获取 功能表单代码标识  
     * @return
     */
    @JsonIgnore
    public String getUtilFormCodeName(){
        Object objValue = this.get(FIELD_UTILFORMCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilFormCodeNameDirty(){
        if(this.contains(FIELD_UTILFORMCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单代码标识
     */
    @JsonIgnore
    public void resetUtilFormCodeName(){
        this.reset(FIELD_UTILFORMCODENAME);
    }

    /**
     * 设置 功能表单代码标识
     * <P>
     * 等同 {@link #setUtilFormCodeName}
     * @param utilFormCodeName
     */
    @JsonIgnore
    public PSDEMainState utilformcodename(String utilFormCodeName){
        this.setUtilFormCodeName(utilFormCodeName);
        return this;
    }

    /**
     * <B>UTILPSDEFORMID</B>&nbsp;功能表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_UTILPSDEFORMID = "utilpsdeformid";

    /**
     * 设置 功能表单
     * 
     * @param utilPSDEFormId
     * 
     */
    @JsonProperty(FIELD_UTILPSDEFORMID)
    public void setUtilPSDEFormId(String utilPSDEFormId){
        this.set(FIELD_UTILPSDEFORMID, utilPSDEFormId);
    }
    
    /**
     * 获取 功能表单  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEFormId(){
        Object objValue = this.get(FIELD_UTILPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDEFormIdDirty(){
        if(this.contains(FIELD_UTILPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单
     */
    @JsonIgnore
    public void resetUtilPSDEFormId(){
        this.reset(FIELD_UTILPSDEFORMID);
    }

    /**
     * 设置 功能表单
     * <P>
     * 等同 {@link #setUtilPSDEFormId}
     * @param utilPSDEFormId
     */
    @JsonIgnore
    public PSDEMainState utilpsdeformid(String utilPSDEFormId){
        this.setUtilPSDEFormId(utilPSDEFormId);
        return this;
    }

    /**
     * 设置 功能表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEMainState utilpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setUtilFormCodeName(null);
            this.setUtilPSDEFormId(null);
            this.setUtilPSDEFormName(null);
        }
        else{
            this.setUtilFormCodeName(pSDEForm.getCodeName());
            this.setUtilPSDEFormId(pSDEForm.getPSDEFormId());
            this.setUtilPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>UTILPSDEFORMNAME</B>&nbsp;功能表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDEFORMID}
     */
    public final static String FIELD_UTILPSDEFORMNAME = "utilpsdeformname";

    /**
     * 设置 功能表单
     * 
     * @param utilPSDEFormName
     * 
     */
    @JsonProperty(FIELD_UTILPSDEFORMNAME)
    public void setUtilPSDEFormName(String utilPSDEFormName){
        this.set(FIELD_UTILPSDEFORMNAME, utilPSDEFormName);
    }
    
    /**
     * 获取 功能表单  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEFormName(){
        Object objValue = this.get(FIELD_UTILPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDEFormNameDirty(){
        if(this.contains(FIELD_UTILPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能表单
     */
    @JsonIgnore
    public void resetUtilPSDEFormName(){
        this.reset(FIELD_UTILPSDEFORMNAME);
    }

    /**
     * 设置 功能表单
     * <P>
     * 等同 {@link #setUtilPSDEFormName}
     * @param utilPSDEFormName
     */
    @JsonIgnore
    public PSDEMainState utilpsdeformname(String utilPSDEFormName){
        this.setUtilPSDEFormName(utilPSDEFormName);
        return this;
    }

    /**
     * <B>VIEWACTIONS</B>&nbsp;支持操作，主状态视图启用操作控制时，指定视图支持的操作集合
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEViewAction} 
     */
    public final static String FIELD_VIEWACTIONS = "viewactions";

    /**
     * 设置 支持操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * 
     * @param viewActions
     * 
     */
    @JsonProperty(FIELD_VIEWACTIONS)
    public void setViewActions(Integer viewActions){
        this.set(FIELD_VIEWACTIONS, viewActions);
    }
    
    /**
     * 获取 支持操作  
     * @return
     */
    @JsonIgnore
    public Integer getViewActions(){
        Object objValue = this.get(FIELD_VIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewActionsDirty(){
        if(this.contains(FIELD_VIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持操作
     */
    @JsonIgnore
    public void resetViewActions(){
        this.reset(FIELD_VIEWACTIONS);
    }

    /**
     * 设置 支持操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSDEMainState viewactions(Integer viewActions){
        this.setViewActions(viewActions);
        return this;
    }

     /**
     * 设置 支持操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSDEMainState viewactions(net.ibizsys.psmodel.core.util.PSModelEnums.DEViewAction[] viewActions){
        if(viewActions == null || viewActions.length == 0){
            this.setViewActions(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEViewAction _item : viewActions){
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    /**
     * <B>WFSTATEMODE</B>&nbsp;流程状态模式，指定主状态的流程状态模式，未定义是为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMSWFStateMode} 
     */
    public final static String FIELD_WFSTATEMODE = "wfstatemode";

    /**
     * 设置 流程状态模式，详细说明：{@link #FIELD_WFSTATEMODE}
     * 
     * @param wFStateMode
     * 
     */
    @JsonProperty(FIELD_WFSTATEMODE)
    public void setWFStateMode(Integer wFStateMode){
        this.set(FIELD_WFSTATEMODE, wFStateMode);
    }
    
    /**
     * 获取 流程状态模式  
     * @return
     */
    @JsonIgnore
    public Integer getWFStateMode(){
        Object objValue = this.get(FIELD_WFSTATEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 流程状态模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStateModeDirty(){
        if(this.contains(FIELD_WFSTATEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程状态模式
     */
    @JsonIgnore
    public void resetWFStateMode(){
        this.reset(FIELD_WFSTATEMODE);
    }

    /**
     * 设置 流程状态模式，详细说明：{@link #FIELD_WFSTATEMODE}
     * <P>
     * 等同 {@link #setWFStateMode}
     * @param wFStateMode
     */
    @JsonIgnore
    public PSDEMainState wfstatemode(Integer wFStateMode){
        this.setWFStateMode(wFStateMode);
        return this;
    }

     /**
     * 设置 流程状态模式，详细说明：{@link #FIELD_WFSTATEMODE}
     * <P>
     * 等同 {@link #setWFStateMode}
     * @param wFStateMode
     */
    @JsonIgnore
    public PSDEMainState wfstatemode(net.ibizsys.psmodel.core.util.PSModelEnums.DEMSWFStateMode wFStateMode){
        if(wFStateMode == null){
            this.setWFStateMode(null);
        }
        else{
            this.setWFStateMode(wFStateMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEMainStateId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMainStateId(strValue);
    }

    @JsonIgnore
    public PSDEMainState id(String strValue){
        this.setPSDEMainStateId(strValue);
        return this;
    }


    /**
     *  实体主状态属性 成员集合
     */
    public final static String FIELD_PSDEMSFIELDS = "psdemsfields";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSField> psdemsfields;

    /**
     * 获取 实体主状态属性 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMSFIELDS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSField> getPSDEMSFields(){
        return this.psdemsfields;
    }

    /**
     * 设置 实体主状态属性 成员集合  
     * @param psdemsfields
     */
    @JsonProperty(FIELD_PSDEMSFIELDS)
    public void setPSDEMSFields(java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSField> psdemsfields){
        this.psdemsfields = psdemsfields;
    }

    /**
     * 获取 实体主状态属性 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSField> getPSDEMSFieldsIf(){
        if(this.psdemsfields == null){
            this.psdemsfields = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEMSField>();          
        }
        return this.psdemsfields;
    }


    /**
     *  实体主状态操作标识 成员集合
     */
    public final static String FIELD_PSDEMSOPPRIVS = "psdemsopprivs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSOPPriv> psdemsopprivs;

    /**
     * 获取 实体主状态操作标识 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMSOPPRIVS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSOPPriv> getPSDEMSOPPrivs(){
        return this.psdemsopprivs;
    }

    /**
     * 设置 实体主状态操作标识 成员集合  
     * @param psdemsopprivs
     */
    @JsonProperty(FIELD_PSDEMSOPPRIVS)
    public void setPSDEMSOPPrivs(java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSOPPriv> psdemsopprivs){
        this.psdemsopprivs = psdemsopprivs;
    }

    /**
     * 获取 实体主状态操作标识 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSOPPriv> getPSDEMSOPPrivsIf(){
        if(this.psdemsopprivs == null){
            this.psdemsopprivs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEMSOPPriv>();          
        }
        return this.psdemsopprivs;
    }


    /**
     *  实体主状态操作 成员集合
     */
    public final static String FIELD_PSDEMSACTIONS = "psdemsactions";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSAction> psdemsactions;

    /**
     * 获取 实体主状态操作 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMSACTIONS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSAction> getPSDEMSActions(){
        return this.psdemsactions;
    }

    /**
     * 设置 实体主状态操作 成员集合  
     * @param psdemsactions
     */
    @JsonProperty(FIELD_PSDEMSACTIONS)
    public void setPSDEMSActions(java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSAction> psdemsactions){
        this.psdemsactions = psdemsactions;
    }

    /**
     * 获取 实体主状态操作 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMSAction> getPSDEMSActionsIf(){
        if(this.psdemsactions == null){
            this.psdemsactions = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEMSAction>();          
        }
        return this.psdemsactions;
    }


    /**
     *  实体主状态关系 成员集合
     */
    public final static String FIELD_PSDEMAINSTATERSS = "psdemainstaters";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEMainStateRS> psdemainstaters;

    /**
     * 获取 实体主状态关系 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEMAINSTATERSS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMainStateRS> getPSDEMainStateRSs(){
        return this.psdemainstaters;
    }

    /**
     * 设置 实体主状态关系 成员集合  
     * @param psdemainstaters
     */
    @JsonProperty(FIELD_PSDEMAINSTATERSS)
    public void setPSDEMainStateRSs(java.util.List<net.ibizsys.psmodel.core.domain.PSDEMainStateRS> psdemainstaters){
        this.psdemainstaters = psdemainstaters;
    }

    /**
     * 获取 实体主状态关系 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEMainStateRS> getPSDEMainStateRSsIf(){
        if(this.psdemainstaters == null){
            this.psdemainstaters = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEMainStateRS>();          
        }
        return this.psdemainstaters;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEMainState){
            PSDEMainState model = (PSDEMainState)iPSModel;
            model.setPSDEMSFields(this.getPSDEMSFields());
            model.setPSDEMSOPPrivs(this.getPSDEMSOPPrivs());
            model.setPSDEMSActions(this.getPSDEMSActions());
            model.setPSDEMainStateRSs(this.getPSDEMainStateRSs());
        }
        super.copyTo(iPSModel);
    }
}
