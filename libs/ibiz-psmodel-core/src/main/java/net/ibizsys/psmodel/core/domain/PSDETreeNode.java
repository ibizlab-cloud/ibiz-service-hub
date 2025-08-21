package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETREENODE</B>树节点 模型传输对象
 * <P>
 * 树视图节点模型，支持定义静态及动态树节点及相关的处理逻辑
 */
public class PSDETreeNode extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETreeNode(){
    }      

    /**
     * <B>APPENDCAPFLAG</B>&nbsp;附加标题，指定动态树节点输出标题时是否附加默认标题，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPENDCAPFLAG = "appendcapflag";

    /**
     * 设置 附加标题，详细说明：{@link #FIELD_APPENDCAPFLAG}
     * 
     * @param appendCapFlag
     * 
     */
    @JsonProperty(FIELD_APPENDCAPFLAG)
    public void setAppendCapFlag(Integer appendCapFlag){
        this.set(FIELD_APPENDCAPFLAG, appendCapFlag);
    }
    
    /**
     * 获取 附加标题  
     * @return
     */
    @JsonIgnore
    public Integer getAppendCapFlag(){
        Object objValue = this.get(FIELD_APPENDCAPFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppendCapFlagDirty(){
        if(this.contains(FIELD_APPENDCAPFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加标题
     */
    @JsonIgnore
    public void resetAppendCapFlag(){
        this.reset(FIELD_APPENDCAPFLAG);
    }

    /**
     * 设置 附加标题，详细说明：{@link #FIELD_APPENDCAPFLAG}
     * <P>
     * 等同 {@link #setAppendCapFlag}
     * @param appendCapFlag
     */
    @JsonIgnore
    public PSDETreeNode appendcapflag(Integer appendCapFlag){
        this.setAppendCapFlag(appendCapFlag);
        return this;
    }

     /**
     * 设置 附加标题，详细说明：{@link #FIELD_APPENDCAPFLAG}
     * <P>
     * 等同 {@link #setAppendCapFlag}
     * @param appendCapFlag
     */
    @JsonIgnore
    public PSDETreeNode appendcapflag(Boolean appendCapFlag){
        if(appendCapFlag == null){
            this.setAppendCapFlag(null);
        }
        else{
            this.setAppendCapFlag(appendCapFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>APPENDPNODEID</B>&nbsp;附加父标识，指定树节点输出节点标识是否附加上父节点的标识，附加父节点标识使分类节点具备业务数据能力，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPENDPNODEID = "appendpnodeid";

    /**
     * 设置 附加父标识，详细说明：{@link #FIELD_APPENDPNODEID}
     * 
     * @param appendPNodeId
     * 
     */
    @JsonProperty(FIELD_APPENDPNODEID)
    public void setAppendPNodeId(Integer appendPNodeId){
        this.set(FIELD_APPENDPNODEID, appendPNodeId);
    }
    
    /**
     * 获取 附加父标识  
     * @return
     */
    @JsonIgnore
    public Integer getAppendPNodeId(){
        Object objValue = this.get(FIELD_APPENDPNODEID);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加父标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppendPNodeIdDirty(){
        if(this.contains(FIELD_APPENDPNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加父标识
     */
    @JsonIgnore
    public void resetAppendPNodeId(){
        this.reset(FIELD_APPENDPNODEID);
    }

    /**
     * 设置 附加父标识，详细说明：{@link #FIELD_APPENDPNODEID}
     * <P>
     * 等同 {@link #setAppendPNodeId}
     * @param appendPNodeId
     */
    @JsonIgnore
    public PSDETreeNode appendpnodeid(Integer appendPNodeId){
        this.setAppendPNodeId(appendPNodeId);
        return this;
    }

     /**
     * 设置 附加父标识，详细说明：{@link #FIELD_APPENDPNODEID}
     * <P>
     * 等同 {@link #setAppendPNodeId}
     * @param appendPNodeId
     */
    @JsonIgnore
    public PSDETreeNode appendpnodeid(Boolean appendPNodeId){
        if(appendPNodeId == null){
            this.setAppendPNodeId(null);
        }
        else{
            this.setAppendPNodeId(appendPNodeId?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定树节点的默认标题
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
    public PSDETreeNode caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CHECKED</B>&nbsp;默认选中，指定树节点是否默认选中，为定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CHECKED = "checked";

    /**
     * 设置 默认选中，详细说明：{@link #FIELD_CHECKED}
     * 
     * @param checked
     * 
     */
    @JsonProperty(FIELD_CHECKED)
    public void setChecked(Integer checked){
        this.set(FIELD_CHECKED, checked);
    }
    
    /**
     * 获取 默认选中  
     * @return
     */
    @JsonIgnore
    public Integer getChecked(){
        Object objValue = this.get(FIELD_CHECKED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认选中 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCheckedDirty(){
        if(this.contains(FIELD_CHECKED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认选中
     */
    @JsonIgnore
    public void resetChecked(){
        this.reset(FIELD_CHECKED);
    }

    /**
     * 设置 默认选中，详细说明：{@link #FIELD_CHECKED}
     * <P>
     * 等同 {@link #setChecked}
     * @param checked
     */
    @JsonIgnore
    public PSDETreeNode checked(Integer checked){
        this.setChecked(checked);
        return this;
    }

     /**
     * 设置 默认选中，详细说明：{@link #FIELD_CHECKED}
     * <P>
     * 等同 {@link #setChecked}
     * @param checked
     */
    @JsonIgnore
    public PSDETreeNode checked(Boolean checked){
        if(checked == null){
            this.setChecked(null);
        }
        else{
            this.setChecked(checked?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CHILDCNTPSDEFID</B>&nbsp;子节点计数属性，指定动态树节点子节点计数的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CHILDCNTPSDEFID = "childcntpsdefid";

    /**
     * 设置 子节点计数属性，详细说明：{@link #FIELD_CHILDCNTPSDEFID}
     * 
     * @param childCntPSDEFId
     * 
     */
    @JsonProperty(FIELD_CHILDCNTPSDEFID)
    public void setChildCntPSDEFId(String childCntPSDEFId){
        this.set(FIELD_CHILDCNTPSDEFID, childCntPSDEFId);
    }
    
    /**
     * 获取 子节点计数属性  
     * @return
     */
    @JsonIgnore
    public String getChildCntPSDEFId(){
        Object objValue = this.get(FIELD_CHILDCNTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子节点计数属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChildCntPSDEFIdDirty(){
        if(this.contains(FIELD_CHILDCNTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子节点计数属性
     */
    @JsonIgnore
    public void resetChildCntPSDEFId(){
        this.reset(FIELD_CHILDCNTPSDEFID);
    }

    /**
     * 设置 子节点计数属性，详细说明：{@link #FIELD_CHILDCNTPSDEFID}
     * <P>
     * 等同 {@link #setChildCntPSDEFId}
     * @param childCntPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode childcntpsdefid(String childCntPSDEFId){
        this.setChildCntPSDEFId(childCntPSDEFId);
        return this;
    }

    /**
     * 设置 子节点计数属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setChildCntPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode childcntpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setChildCntPSDEFId(null);
            this.setChildCntPSDEFName(null);
        }
        else{
            this.setChildCntPSDEFId(pSDEField.getPSDEFieldId());
            this.setChildCntPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CHILDCNTPSDEFNAME</B>&nbsp;子节点计数属性，指定动态树节点子节点计数的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CHILDCNTPSDEFID}
     */
    public final static String FIELD_CHILDCNTPSDEFNAME = "childcntpsdefname";

    /**
     * 设置 子节点计数属性，详细说明：{@link #FIELD_CHILDCNTPSDEFNAME}
     * 
     * @param childCntPSDEFName
     * 
     */
    @JsonProperty(FIELD_CHILDCNTPSDEFNAME)
    public void setChildCntPSDEFName(String childCntPSDEFName){
        this.set(FIELD_CHILDCNTPSDEFNAME, childCntPSDEFName);
    }
    
    /**
     * 获取 子节点计数属性  
     * @return
     */
    @JsonIgnore
    public String getChildCntPSDEFName(){
        Object objValue = this.get(FIELD_CHILDCNTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子节点计数属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChildCntPSDEFNameDirty(){
        if(this.contains(FIELD_CHILDCNTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子节点计数属性
     */
    @JsonIgnore
    public void resetChildCntPSDEFName(){
        this.reset(FIELD_CHILDCNTPSDEFNAME);
    }

    /**
     * 设置 子节点计数属性，详细说明：{@link #FIELD_CHILDCNTPSDEFNAME}
     * <P>
     * 等同 {@link #setChildCntPSDEFName}
     * @param childCntPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode childcntpsdefname(String childCntPSDEFName){
        this.setChildCntPSDEFName(childCntPSDEFName);
        return this;
    }

    /**
     * <B>CLSPSDEFID</B>&nbsp;样式表属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CLSPSDEFID = "clspsdefid";

    /**
     * 设置 样式表属性
     * 
     * @param clsPSDEFId
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFID)
    public void setClsPSDEFId(String clsPSDEFId){
        this.set(FIELD_CLSPSDEFID, clsPSDEFId);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFId(){
        Object objValue = this.get(FIELD_CLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFIdDirty(){
        if(this.contains(FIELD_CLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFId(){
        this.reset(FIELD_CLSPSDEFID);
    }

    /**
     * 设置 样式表属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param clsPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode clspsdefid(String clsPSDEFId){
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    /**
     * 设置 样式表属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode clspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        }
        else{
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CLSPSDEFNAME</B>&nbsp;样式表属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CLSPSDEFID}
     */
    public final static String FIELD_CLSPSDEFNAME = "clspsdefname";

    /**
     * 设置 样式表属性
     * 
     * @param clsPSDEFName
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFNAME)
    public void setClsPSDEFName(String clsPSDEFName){
        this.set(FIELD_CLSPSDEFNAME, clsPSDEFName);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFName(){
        Object objValue = this.get(FIELD_CLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFNameDirty(){
        if(this.contains(FIELD_CLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFName(){
        this.reset(FIELD_CLSPSDEFNAME);
    }

    /**
     * 设置 样式表属性
     * <P>
     * 等同 {@link #setClsPSDEFName}
     * @param clsPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode clspsdefname(String clsPSDEFName){
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数项标识，指定树节点的计数标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_COUNTERID = "counterid";

    /**
     * 设置 计数项标识，详细说明：{@link #FIELD_COUNTERID}
     * 
     * @param counterId
     * 
     */
    @JsonProperty(FIELD_COUNTERID)
    public void setCounterId(String counterId){
        this.set(FIELD_COUNTERID, counterId);
    }
    
    /**
     * 获取 计数项标识  
     * @return
     */
    @JsonIgnore
    public String getCounterId(){
        Object objValue = this.get(FIELD_COUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计数项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterIdDirty(){
        if(this.contains(FIELD_COUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数项标识
     */
    @JsonIgnore
    public void resetCounterId(){
        this.reset(FIELD_COUNTERID);
    }

    /**
     * 设置 计数项标识，详细说明：{@link #FIELD_COUNTERID}
     * <P>
     * 等同 {@link #setCounterId}
     * @param counterId
     */
    @JsonIgnore
    public PSDETreeNode counterid(String counterId){
        this.setCounterId(counterId);
        return this;
    }

    /**
     * <B>COUNTERMODE</B>&nbsp;计数显示模式，树节点指定数据项标识启用计数能力，可进一步指定计数显示模式，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode} 
     */
    public final static String FIELD_COUNTERMODE = "countermode";

    /**
     * 设置 计数显示模式，详细说明：{@link #FIELD_COUNTERMODE}
     * 
     * @param counterMode
     * 
     */
    @JsonProperty(FIELD_COUNTERMODE)
    public void setCounterMode(Integer counterMode){
        this.set(FIELD_COUNTERMODE, counterMode);
    }
    
    /**
     * 获取 计数显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getCounterMode(){
        Object objValue = this.get(FIELD_COUNTERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 计数显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterModeDirty(){
        if(this.contains(FIELD_COUNTERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数显示模式
     */
    @JsonIgnore
    public void resetCounterMode(){
        this.reset(FIELD_COUNTERMODE);
    }

    /**
     * 设置 计数显示模式，详细说明：{@link #FIELD_COUNTERMODE}
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSDETreeNode countermode(Integer counterMode){
        this.setCounterMode(counterMode);
        return this;
    }

     /**
     * 设置 计数显示模式，详细说明：{@link #FIELD_COUNTERMODE}
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSDETreeNode countermode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode counterMode){
        if(counterMode == null){
            this.setCounterMode(null);
        }
        else{
            this.setCounterMode(counterMode.value);
        }
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
    public PSDETreeNode createdate(String createDate){
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
    public PSDETreeNode createman(String createMan){
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
    public PSDETreeNode customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
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
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDETreeNode customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CUSTOMTYPE = "customtype";

    /**
     * 设置 自定义类型
     * 
     * @param customType
     * 
     */
    @JsonProperty(FIELD_CUSTOMTYPE)
    public void setCustomType(String customType){
        this.set(FIELD_CUSTOMTYPE, customType);
    }
    
    /**
     * 获取 自定义类型  
     * @return
     */
    @JsonIgnore
    public String getCustomType(){
        Object objValue = this.get(FIELD_CUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomTypeDirty(){
        if(this.contains(FIELD_CUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义类型
     */
    @JsonIgnore
    public void resetCustomType(){
        this.reset(FIELD_CUSTOMTYPE);
    }

    /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSDETreeNode customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>DATA2PSDEFID</B>&nbsp;数据2属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DATA2PSDEFID = "data2psdefid";

    /**
     * 设置 数据2属性
     * 
     * @param data2PSDEFId
     * 
     */
    @JsonProperty(FIELD_DATA2PSDEFID)
    public void setData2PSDEFId(String data2PSDEFId){
        this.set(FIELD_DATA2PSDEFID, data2PSDEFId);
    }
    
    /**
     * 获取 数据2属性  
     * @return
     */
    @JsonIgnore
    public String getData2PSDEFId(){
        Object objValue = this.get(FIELD_DATA2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isData2PSDEFIdDirty(){
        if(this.contains(FIELD_DATA2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据2属性
     */
    @JsonIgnore
    public void resetData2PSDEFId(){
        this.reset(FIELD_DATA2PSDEFID);
    }

    /**
     * 设置 数据2属性
     * <P>
     * 等同 {@link #setData2PSDEFId}
     * @param data2PSDEFId
     */
    @JsonIgnore
    public PSDETreeNode data2psdefid(String data2PSDEFId){
        this.setData2PSDEFId(data2PSDEFId);
        return this;
    }

    /**
     * 设置 数据2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setData2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode data2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setData2PSDEFId(null);
            this.setData2PSDEFName(null);
        }
        else{
            this.setData2PSDEFId(pSDEField.getPSDEFieldId());
            this.setData2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DATA2PSDEFNAME</B>&nbsp;数据2属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DATA2PSDEFID}
     */
    public final static String FIELD_DATA2PSDEFNAME = "data2psdefname";

    /**
     * 设置 数据2属性
     * 
     * @param data2PSDEFName
     * 
     */
    @JsonProperty(FIELD_DATA2PSDEFNAME)
    public void setData2PSDEFName(String data2PSDEFName){
        this.set(FIELD_DATA2PSDEFNAME, data2PSDEFName);
    }
    
    /**
     * 获取 数据2属性  
     * @return
     */
    @JsonIgnore
    public String getData2PSDEFName(){
        Object objValue = this.get(FIELD_DATA2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isData2PSDEFNameDirty(){
        if(this.contains(FIELD_DATA2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据2属性
     */
    @JsonIgnore
    public void resetData2PSDEFName(){
        this.reset(FIELD_DATA2PSDEFNAME);
    }

    /**
     * 设置 数据2属性
     * <P>
     * 等同 {@link #setData2PSDEFName}
     * @param data2PSDEFName
     */
    @JsonIgnore
    public PSDETreeNode data2psdefname(String data2PSDEFName){
        this.setData2PSDEFName(data2PSDEFName);
        return this;
    }

    /**
     * <B>DATAPSDEFID</B>&nbsp;数据属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DATAPSDEFID = "datapsdefid";

    /**
     * 设置 数据属性
     * 
     * @param dataPSDEFId
     * 
     */
    @JsonProperty(FIELD_DATAPSDEFID)
    public void setDataPSDEFId(String dataPSDEFId){
        this.set(FIELD_DATAPSDEFID, dataPSDEFId);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataPSDEFId(){
        Object objValue = this.get(FIELD_DATAPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataPSDEFIdDirty(){
        if(this.contains(FIELD_DATAPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataPSDEFId(){
        this.reset(FIELD_DATAPSDEFID);
    }

    /**
     * 设置 数据属性
     * <P>
     * 等同 {@link #setDataPSDEFId}
     * @param dataPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode datapsdefid(String dataPSDEFId){
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    /**
     * 设置 数据属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDataPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode datapsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        }
        else{
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DATAPSDEFNAME</B>&nbsp;数据属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DATAPSDEFID}
     */
    public final static String FIELD_DATAPSDEFNAME = "datapsdefname";

    /**
     * 设置 数据属性
     * 
     * @param dataPSDEFName
     * 
     */
    @JsonProperty(FIELD_DATAPSDEFNAME)
    public void setDataPSDEFName(String dataPSDEFName){
        this.set(FIELD_DATAPSDEFNAME, dataPSDEFName);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataPSDEFName(){
        Object objValue = this.get(FIELD_DATAPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataPSDEFNameDirty(){
        if(this.contains(FIELD_DATAPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataPSDEFName(){
        this.reset(FIELD_DATAPSDEFNAME);
    }

    /**
     * 设置 数据属性
     * <P>
     * 等同 {@link #setDataPSDEFName}
     * @param dataPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode datapsdefname(String dataPSDEFName){
        this.setDataPSDEFName(dataPSDEFName);
        return this;
    }

    /**
     * <B>DATASOURCE</B>&nbsp;数据源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DETreeNodeSource} 
     */
    public final static String FIELD_DATASOURCE = "datasource";

    /**
     * 设置 数据源
     * 
     * @param dataSource
     * 
     */
    @JsonProperty(FIELD_DATASOURCE)
    public void setDataSource(String dataSource){
        this.set(FIELD_DATASOURCE, dataSource);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getDataSource(){
        Object objValue = this.get(FIELD_DATASOURCE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataSourceDirty(){
        if(this.contains(FIELD_DATASOURCE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetDataSource(){
        this.reset(FIELD_DATASOURCE);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setDataSource}
     * @param dataSource
     */
    @JsonIgnore
    public PSDETreeNode datasource(String dataSource){
        this.setDataSource(dataSource);
        return this;
    }

    /**
     * <B>DATATYPEPSDEFID</B>&nbsp;数据类别属性，指定动态树节点数据类别的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DATATYPEPSDEFID = "datatypepsdefid";

    /**
     * 设置 数据类别属性，详细说明：{@link #FIELD_DATATYPEPSDEFID}
     * 
     * @param dataTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_DATATYPEPSDEFID)
    public void setDataTypePSDEFId(String dataTypePSDEFId){
        this.set(FIELD_DATATYPEPSDEFID, dataTypePSDEFId);
    }
    
    /**
     * 获取 数据类别属性  
     * @return
     */
    @JsonIgnore
    public String getDataTypePSDEFId(){
        Object objValue = this.get(FIELD_DATATYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类别属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataTypePSDEFIdDirty(){
        if(this.contains(FIELD_DATATYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类别属性
     */
    @JsonIgnore
    public void resetDataTypePSDEFId(){
        this.reset(FIELD_DATATYPEPSDEFID);
    }

    /**
     * 设置 数据类别属性，详细说明：{@link #FIELD_DATATYPEPSDEFID}
     * <P>
     * 等同 {@link #setDataTypePSDEFId}
     * @param dataTypePSDEFId
     */
    @JsonIgnore
    public PSDETreeNode datatypepsdefid(String dataTypePSDEFId){
        this.setDataTypePSDEFId(dataTypePSDEFId);
        return this;
    }

    /**
     * 设置 数据类别属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDataTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode datatypepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDataTypePSDEFId(null);
            this.setDataTypePSDEFName(null);
        }
        else{
            this.setDataTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setDataTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DATATYPEPSDEFNAME</B>&nbsp;数据类别属性，指定动态树节点数据类别的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DATATYPEPSDEFID}
     */
    public final static String FIELD_DATATYPEPSDEFNAME = "datatypepsdefname";

    /**
     * 设置 数据类别属性，详细说明：{@link #FIELD_DATATYPEPSDEFNAME}
     * 
     * @param dataTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_DATATYPEPSDEFNAME)
    public void setDataTypePSDEFName(String dataTypePSDEFName){
        this.set(FIELD_DATATYPEPSDEFNAME, dataTypePSDEFName);
    }
    
    /**
     * 获取 数据类别属性  
     * @return
     */
    @JsonIgnore
    public String getDataTypePSDEFName(){
        Object objValue = this.get(FIELD_DATATYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类别属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataTypePSDEFNameDirty(){
        if(this.contains(FIELD_DATATYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类别属性
     */
    @JsonIgnore
    public void resetDataTypePSDEFName(){
        this.reset(FIELD_DATATYPEPSDEFNAME);
    }

    /**
     * 设置 数据类别属性，详细说明：{@link #FIELD_DATATYPEPSDEFNAME}
     * <P>
     * 等同 {@link #setDataTypePSDEFName}
     * @param dataTypePSDEFName
     */
    @JsonIgnore
    public PSDETreeNode datatypepsdefname(String dataTypePSDEFName){
        this.setDataTypePSDEFName(dataTypePSDEFName);
        return this;
    }

    /**
     * <B>DISABLESELECT</B>&nbsp;禁止选择，指定树节点是否禁止选择，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DISABLESELECT = "disableselect";

    /**
     * 设置 禁止选择，详细说明：{@link #FIELD_DISABLESELECT}
     * 
     * @param disableSelect
     * 
     */
    @JsonProperty(FIELD_DISABLESELECT)
    public void setDisableSelect(Integer disableSelect){
        this.set(FIELD_DISABLESELECT, disableSelect);
    }
    
    /**
     * 获取 禁止选择  
     * @return
     */
    @JsonIgnore
    public Integer getDisableSelect(){
        Object objValue = this.get(FIELD_DISABLESELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 禁止选择 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDisableSelectDirty(){
        if(this.contains(FIELD_DISABLESELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁止选择
     */
    @JsonIgnore
    public void resetDisableSelect(){
        this.reset(FIELD_DISABLESELECT);
    }

    /**
     * 设置 禁止选择，详细说明：{@link #FIELD_DISABLESELECT}
     * <P>
     * 等同 {@link #setDisableSelect}
     * @param disableSelect
     */
    @JsonIgnore
    public PSDETreeNode disableselect(Integer disableSelect){
        this.setDisableSelect(disableSelect);
        return this;
    }

     /**
     * 设置 禁止选择，详细说明：{@link #FIELD_DISABLESELECT}
     * <P>
     * 等同 {@link #setDisableSelect}
     * @param disableSelect
     */
    @JsonIgnore
    public PSDETreeNode disableselect(Boolean disableSelect){
        if(disableSelect == null){
            this.setDisableSelect(null);
        }
        else{
            this.setDisableSelect(disableSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DISTINCTMODE</B>&nbsp;排除重复值，指定动态数据节点是否排除重复值，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DISTINCTMODE = "distinctmode";

    /**
     * 设置 排除重复值，详细说明：{@link #FIELD_DISTINCTMODE}
     * 
     * @param distinctMode
     * 
     */
    @JsonProperty(FIELD_DISTINCTMODE)
    public void setDistinctMode(Integer distinctMode){
        this.set(FIELD_DISTINCTMODE, distinctMode);
    }
    
    /**
     * 获取 排除重复值  
     * @return
     */
    @JsonIgnore
    public Integer getDistinctMode(){
        Object objValue = this.get(FIELD_DISTINCTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 排除重复值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDistinctModeDirty(){
        if(this.contains(FIELD_DISTINCTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排除重复值
     */
    @JsonIgnore
    public void resetDistinctMode(){
        this.reset(FIELD_DISTINCTMODE);
    }

    /**
     * 设置 排除重复值，详细说明：{@link #FIELD_DISTINCTMODE}
     * <P>
     * 等同 {@link #setDistinctMode}
     * @param distinctMode
     */
    @JsonIgnore
    public PSDETreeNode distinctmode(Integer distinctMode){
        this.setDistinctMode(distinctMode);
        return this;
    }

     /**
     * 设置 排除重复值，详细说明：{@link #FIELD_DISTINCTMODE}
     * <P>
     * 等同 {@link #setDistinctMode}
     * @param distinctMode
     */
    @JsonIgnore
    public PSDETreeNode distinctmode(Boolean distinctMode){
        if(distinctMode == null){
            this.setDistinctMode(null);
        }
        else{
            this.setDistinctMode(distinctMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DYNACLASS</B>&nbsp;动态样式表
     */
    public final static String FIELD_DYNACLASS = "dynaclass";

    /**
     * 设置 动态样式表
     * 
     * @param dynaClass
     * 
     */
    @JsonProperty(FIELD_DYNACLASS)
    public void setDynaClass(String dynaClass){
        this.set(FIELD_DYNACLASS, dynaClass);
    }
    
    /**
     * 获取 动态样式表  
     * @return
     */
    @JsonIgnore
    public String getDynaClass(){
        Object objValue = this.get(FIELD_DYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDynaClassDirty(){
        if(this.contains(FIELD_DYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态样式表
     */
    @JsonIgnore
    public void resetDynaClass(){
        this.reset(FIELD_DYNACLASS);
    }

    /**
     * 设置 动态样式表
     * <P>
     * 等同 {@link #setDynaClass}
     * @param dynaClass
     */
    @JsonIgnore
    public PSDETreeNode dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>EDITDATAMODE</B>&nbsp;编辑数据模式，指定实体动态树节点编辑数据的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditDataMode} 
     */
    public final static String FIELD_EDITDATAMODE = "editdatamode";

    /**
     * 设置 编辑数据模式，详细说明：{@link #FIELD_EDITDATAMODE}
     * 
     * @param editDataMode
     * 
     */
    @JsonProperty(FIELD_EDITDATAMODE)
    public void setEditDataMode(String editDataMode){
        this.set(FIELD_EDITDATAMODE, editDataMode);
    }
    
    /**
     * 获取 编辑数据模式  
     * @return
     */
    @JsonIgnore
    public String getEditDataMode(){
        Object objValue = this.get(FIELD_EDITDATAMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditDataModeDirty(){
        if(this.contains(FIELD_EDITDATAMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑数据模式
     */
    @JsonIgnore
    public void resetEditDataMode(){
        this.reset(FIELD_EDITDATAMODE);
    }

    /**
     * 设置 编辑数据模式，详细说明：{@link #FIELD_EDITDATAMODE}
     * <P>
     * 等同 {@link #setEditDataMode}
     * @param editDataMode
     */
    @JsonIgnore
    public PSDETreeNode editdatamode(String editDataMode){
        this.setEditDataMode(editDataMode);
        return this;
    }

     /**
     * 设置 编辑数据模式，详细说明：{@link #FIELD_EDITDATAMODE}
     * <P>
     * 等同 {@link #setEditDataMode}
     * @param editDataMode
     */
    @JsonIgnore
    public PSDETreeNode editdatamode(net.ibizsys.psmodel.core.util.PSModelEnums.EditDataMode editDataMode){
        if(editDataMode == null){
            this.setEditDataMode(null);
        }
        else{
            this.setEditDataMode(editDataMode.value);
        }
        return this;
    }

    /**
     * <B>EDITMODE</B>&nbsp;编辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeEditMode} 
     */
    public final static String FIELD_EDITMODE = "editmode";

    /**
     * 设置 编辑模式
     * 
     * @param editMode
     * 
     */
    @JsonProperty(FIELD_EDITMODE)
    public void setEditMode(Integer editMode){
        this.set(FIELD_EDITMODE, editMode);
    }
    
    /**
     * 获取 编辑模式  
     * @return
     */
    @JsonIgnore
    public Integer getEditMode(){
        Object objValue = this.get(FIELD_EDITMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditModeDirty(){
        if(this.contains(FIELD_EDITMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑模式
     */
    @JsonIgnore
    public void resetEditMode(){
        this.reset(FIELD_EDITMODE);
    }

    /**
     * 设置 编辑模式
     * <P>
     * 等同 {@link #setEditMode}
     * @param editMode
     */
    @JsonIgnore
    public PSDETreeNode editmode(Integer editMode){
        this.setEditMode(editMode);
        return this;
    }

     /**
     * 设置 编辑模式
     * <P>
     * 等同 {@link #setEditMode}
     * @param editMode
     */
    @JsonIgnore
    public PSDETreeNode editmode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeEditMode[] editMode){
        if(editMode == null || editMode.length == 0){
            this.setEditMode(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeEditMode _item : editMode){
                _value |= _item.value;
            }
            this.setEditMode(_value);
        }
        return this;
    }

    /**
     * <B>ENABLECHECK</B>&nbsp;启用选中，指定树节点是否启用选中，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECHECK = "enablecheck";

    /**
     * 设置 启用选中，详细说明：{@link #FIELD_ENABLECHECK}
     * 
     * @param enableCheck
     * 
     */
    @JsonProperty(FIELD_ENABLECHECK)
    public void setEnableCheck(Integer enableCheck){
        this.set(FIELD_ENABLECHECK, enableCheck);
    }
    
    /**
     * 获取 启用选中  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCheck(){
        Object objValue = this.get(FIELD_ENABLECHECK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用选中 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCheckDirty(){
        if(this.contains(FIELD_ENABLECHECK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用选中
     */
    @JsonIgnore
    public void resetEnableCheck(){
        this.reset(FIELD_ENABLECHECK);
    }

    /**
     * 设置 启用选中，详细说明：{@link #FIELD_ENABLECHECK}
     * <P>
     * 等同 {@link #setEnableCheck}
     * @param enableCheck
     */
    @JsonIgnore
    public PSDETreeNode enablecheck(Integer enableCheck){
        this.setEnableCheck(enableCheck);
        return this;
    }

     /**
     * 设置 启用选中，详细说明：{@link #FIELD_ENABLECHECK}
     * <P>
     * 等同 {@link #setEnableCheck}
     * @param enableCheck
     */
    @JsonIgnore
    public PSDETreeNode enablecheck(Boolean enableCheck){
        if(enableCheck == null){
            this.setEnableCheck(null);
        }
        else{
            this.setEnableCheck(enableCheck?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPAGING</B>&nbsp;启用分页
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPAGING = "enablepaging";

    /**
     * 设置 启用分页
     * 
     * @param enablePaging
     * 
     */
    @JsonProperty(FIELD_ENABLEPAGING)
    public void setEnablePaging(Integer enablePaging){
        this.set(FIELD_ENABLEPAGING, enablePaging);
    }
    
    /**
     * 获取 启用分页  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePaging(){
        Object objValue = this.get(FIELD_ENABLEPAGING);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用分页 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePagingDirty(){
        if(this.contains(FIELD_ENABLEPAGING)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用分页
     */
    @JsonIgnore
    public void resetEnablePaging(){
        this.reset(FIELD_ENABLEPAGING);
    }

    /**
     * 设置 启用分页
     * <P>
     * 等同 {@link #setEnablePaging}
     * @param enablePaging
     */
    @JsonIgnore
    public PSDETreeNode enablepaging(Integer enablePaging){
        this.setEnablePaging(enablePaging);
        return this;
    }

     /**
     * 设置 启用分页
     * <P>
     * 等同 {@link #setEnablePaging}
     * @param enablePaging
     */
    @JsonIgnore
    public PSDETreeNode enablepaging(Boolean enablePaging){
        if(enablePaging == null){
            this.setEnablePaging(null);
        }
        else{
            this.setEnablePaging(enablePaging?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEQUICKSEARCH</B>&nbsp;支持快速搜索，指定树节点是否支持快速搜索，未定义时使用树视图部件配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEQUICKSEARCH = "enablequicksearch";

    /**
     * 设置 支持快速搜索，详细说明：{@link #FIELD_ENABLEQUICKSEARCH}
     * 
     * @param enableQuickSearch
     * 
     */
    @JsonProperty(FIELD_ENABLEQUICKSEARCH)
    public void setEnableQuickSearch(Integer enableQuickSearch){
        this.set(FIELD_ENABLEQUICKSEARCH, enableQuickSearch);
    }
    
    /**
     * 获取 支持快速搜索  
     * @return
     */
    @JsonIgnore
    public Integer getEnableQuickSearch(){
        Object objValue = this.get(FIELD_ENABLEQUICKSEARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持快速搜索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableQuickSearchDirty(){
        if(this.contains(FIELD_ENABLEQUICKSEARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持快速搜索
     */
    @JsonIgnore
    public void resetEnableQuickSearch(){
        this.reset(FIELD_ENABLEQUICKSEARCH);
    }

    /**
     * 设置 支持快速搜索，详细说明：{@link #FIELD_ENABLEQUICKSEARCH}
     * <P>
     * 等同 {@link #setEnableQuickSearch}
     * @param enableQuickSearch
     */
    @JsonIgnore
    public PSDETreeNode enablequicksearch(Integer enableQuickSearch){
        this.setEnableQuickSearch(enableQuickSearch);
        return this;
    }

     /**
     * 设置 支持快速搜索，详细说明：{@link #FIELD_ENABLEQUICKSEARCH}
     * <P>
     * 等同 {@link #setEnableQuickSearch}
     * @param enableQuickSearch
     */
    @JsonIgnore
    public PSDETreeNode enablequicksearch(Boolean enableQuickSearch){
        if(enableQuickSearch == null){
            this.setEnableQuickSearch(null);
        }
        else{
            this.setEnableQuickSearch(enableQuickSearch?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用节点操作控制，指定树节点是否启用操作控制，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用节点操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用节点操作控制  
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
     * 判断 启用节点操作控制 是否指定值，包括空值
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
     * 重置 启用节点操作控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用节点操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDETreeNode enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用节点操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDETreeNode enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXPAND</B>&nbsp;默认展开，指定树节点的默认展开方式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeExpandMode} 
     */
    public final static String FIELD_EXPAND = "expand";

    /**
     * 设置 默认展开，详细说明：{@link #FIELD_EXPAND}
     * 
     * @param expand
     * 
     */
    @JsonProperty(FIELD_EXPAND)
    public void setExpand(Integer expand){
        this.set(FIELD_EXPAND, expand);
    }
    
    /**
     * 获取 默认展开  
     * @return
     */
    @JsonIgnore
    public Integer getExpand(){
        Object objValue = this.get(FIELD_EXPAND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认展开 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpandDirty(){
        if(this.contains(FIELD_EXPAND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认展开
     */
    @JsonIgnore
    public void resetExpand(){
        this.reset(FIELD_EXPAND);
    }

    /**
     * 设置 默认展开，详细说明：{@link #FIELD_EXPAND}
     * <P>
     * 等同 {@link #setExpand}
     * @param expand
     */
    @JsonIgnore
    public PSDETreeNode expand(Integer expand){
        this.setExpand(expand);
        return this;
    }

     /**
     * 设置 默认展开，详细说明：{@link #FIELD_EXPAND}
     * <P>
     * 等同 {@link #setExpand}
     * @param expand
     */
    @JsonIgnore
    public PSDETreeNode expand(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeExpandMode expand){
        if(expand == null){
            this.setExpand(null);
        }
        else{
            this.setExpand(expand.value);
        }
        return this;
    }

    /**
     * <B>FIELDNAME</B>&nbsp;属性名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_FIELDNAME = "fieldname";

    /**
     * 设置 属性名称
     * 
     * @param fieldName
     * 
     */
    @JsonProperty(FIELD_FIELDNAME)
    public void setFieldName(String fieldName){
        this.set(FIELD_FIELDNAME, fieldName);
    }
    
    /**
     * 获取 属性名称  
     * @return
     */
    @JsonIgnore
    public String getFieldName(){
        Object objValue = this.get(FIELD_FIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldNameDirty(){
        if(this.contains(FIELD_FIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetFieldName(){
        this.reset(FIELD_FIELDNAME);
    }

    /**
     * 设置 属性名称
     * <P>
     * 等同 {@link #setFieldName}
     * @param fieldName
     */
    @JsonIgnore
    public PSDETreeNode fieldname(String fieldName){
        this.setFieldName(fieldName);
        return this;
    }

    /**
     * <B>FILTERPSDEDSID</B>&nbsp;过滤数据集合，指定实体动态节点在过滤模式下使用的数据集对象，未定义时使用正常模式的数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_FILTERPSDEDSID = "filterpsdedsid";

    /**
     * 设置 过滤数据集合，详细说明：{@link #FIELD_FILTERPSDEDSID}
     * 
     * @param filterPSDEDSId
     * 
     */
    @JsonProperty(FIELD_FILTERPSDEDSID)
    public void setFilterPSDEDSId(String filterPSDEDSId){
        this.set(FIELD_FILTERPSDEDSID, filterPSDEDSId);
    }
    
    /**
     * 获取 过滤数据集合  
     * @return
     */
    @JsonIgnore
    public String getFilterPSDEDSId(){
        Object objValue = this.get(FIELD_FILTERPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterPSDEDSIdDirty(){
        if(this.contains(FIELD_FILTERPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤数据集合
     */
    @JsonIgnore
    public void resetFilterPSDEDSId(){
        this.reset(FIELD_FILTERPSDEDSID);
    }

    /**
     * 设置 过滤数据集合，详细说明：{@link #FIELD_FILTERPSDEDSID}
     * <P>
     * 等同 {@link #setFilterPSDEDSId}
     * @param filterPSDEDSId
     */
    @JsonIgnore
    public PSDETreeNode filterpsdedsid(String filterPSDEDSId){
        this.setFilterPSDEDSId(filterPSDEDSId);
        return this;
    }

    /**
     * 设置 过滤数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFilterPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDETreeNode filterpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setFilterPSDEDSId(null);
            this.setFilterPSDEDSName(null);
        }
        else{
            this.setFilterPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setFilterPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>FILTERPSDEDSNAME</B>&nbsp;过滤数据集合，指定实体动态节点在过滤模式下使用的数据集对象，未定义时使用正常模式的数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FILTERPSDEDSID}
     */
    public final static String FIELD_FILTERPSDEDSNAME = "filterpsdedsname";

    /**
     * 设置 过滤数据集合，详细说明：{@link #FIELD_FILTERPSDEDSNAME}
     * 
     * @param filterPSDEDSName
     * 
     */
    @JsonProperty(FIELD_FILTERPSDEDSNAME)
    public void setFilterPSDEDSName(String filterPSDEDSName){
        this.set(FIELD_FILTERPSDEDSNAME, filterPSDEDSName);
    }
    
    /**
     * 获取 过滤数据集合  
     * @return
     */
    @JsonIgnore
    public String getFilterPSDEDSName(){
        Object objValue = this.get(FIELD_FILTERPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 过滤数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilterPSDEDSNameDirty(){
        if(this.contains(FIELD_FILTERPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过滤数据集合
     */
    @JsonIgnore
    public void resetFilterPSDEDSName(){
        this.reset(FIELD_FILTERPSDEDSNAME);
    }

    /**
     * 设置 过滤数据集合，详细说明：{@link #FIELD_FILTERPSDEDSNAME}
     * <P>
     * 等同 {@link #setFilterPSDEDSName}
     * @param filterPSDEDSName
     */
    @JsonIgnore
    public PSDETreeNode filterpsdedsname(String filterPSDEDSName){
        this.setFilterPSDEDSName(filterPSDEDSName);
        return this;
    }

    /**
     * <B>ICONPSDEFID</B>&nbsp;图标属性，指定动态树节点显示图标的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ICONPSDEFID = "iconpsdefid";

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFID}
     * 
     * @param iconPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONPSDEFID)
    public void setIconPSDEFId(String iconPSDEFId){
        this.set(FIELD_ICONPSDEFID, iconPSDEFId);
    }
    
    /**
     * 获取 图标属性  
     * @return
     */
    @JsonIgnore
    public String getIconPSDEFId(){
        Object objValue = this.get(FIELD_ICONPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPSDEFIdDirty(){
        if(this.contains(FIELD_ICONPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标属性
     */
    @JsonIgnore
    public void resetIconPSDEFId(){
        this.reset(FIELD_ICONPSDEFID);
    }

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFID}
     * <P>
     * 等同 {@link #setIconPSDEFId}
     * @param iconPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode iconpsdefid(String iconPSDEFId){
        this.setIconPSDEFId(iconPSDEFId);
        return this;
    }

    /**
     * 设置 图标属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode iconpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIconPSDEFId(null);
            this.setIconPSDEFName(null);
        }
        else{
            this.setIconPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONPSDEFNAME</B>&nbsp;图标属性，指定动态树节点显示图标的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONPSDEFID}
     */
    public final static String FIELD_ICONPSDEFNAME = "iconpsdefname";

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFNAME}
     * 
     * @param iconPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONPSDEFNAME)
    public void setIconPSDEFName(String iconPSDEFName){
        this.set(FIELD_ICONPSDEFNAME, iconPSDEFName);
    }
    
    /**
     * 获取 图标属性  
     * @return
     */
    @JsonIgnore
    public String getIconPSDEFName(){
        Object objValue = this.get(FIELD_ICONPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPSDEFNameDirty(){
        if(this.contains(FIELD_ICONPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标属性
     */
    @JsonIgnore
    public void resetIconPSDEFName(){
        this.reset(FIELD_ICONPSDEFNAME);
    }

    /**
     * 设置 图标属性，详细说明：{@link #FIELD_ICONPSDEFNAME}
     * <P>
     * 等同 {@link #setIconPSDEFName}
     * @param iconPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode iconpsdefname(String iconPSDEFName){
        this.setIconPSDEFName(iconPSDEFName);
        return this;
    }

    /**
     * <B>KEYPSDEFID</B>&nbsp;标识属性，指定动态树节点标识的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_KEYPSDEFID = "keypsdefid";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * 
     * @param keyPSDEFId
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFID)
    public void setKeyPSDEFId(String keyPSDEFId){
        this.set(FIELD_KEYPSDEFID, keyPSDEFId);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFId(){
        Object objValue = this.get(FIELD_KEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFIdDirty(){
        if(this.contains(FIELD_KEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFId(){
        this.reset(FIELD_KEYPSDEFID);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFID}
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param keyPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode keypsdefid(String keyPSDEFId){
        this.setKeyPSDEFId(keyPSDEFId);
        return this;
    }

    /**
     * 设置 标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode keypsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setKeyPSDEFId(null);
            this.setKeyPSDEFName(null);
        }
        else{
            this.setKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>KEYPSDEFNAME</B>&nbsp;标识属性，指定动态树节点标识的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_KEYPSDEFID}
     */
    public final static String FIELD_KEYPSDEFNAME = "keypsdefname";

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * 
     * @param keyPSDEFName
     * 
     */
    @JsonProperty(FIELD_KEYPSDEFNAME)
    public void setKeyPSDEFName(String keyPSDEFName){
        this.set(FIELD_KEYPSDEFNAME, keyPSDEFName);
    }
    
    /**
     * 获取 标识属性  
     * @return
     */
    @JsonIgnore
    public String getKeyPSDEFName(){
        Object objValue = this.get(FIELD_KEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyPSDEFNameDirty(){
        if(this.contains(FIELD_KEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标识属性
     */
    @JsonIgnore
    public void resetKeyPSDEFName(){
        this.reset(FIELD_KEYPSDEFNAME);
    }

    /**
     * 设置 标识属性，详细说明：{@link #FIELD_KEYPSDEFNAME}
     * <P>
     * 等同 {@link #setKeyPSDEFName}
     * @param keyPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode keypsdefname(String keyPSDEFName){
        this.setKeyPSDEFName(keyPSDEFName);
        return this;
    }

    /**
     * <B>LEAFFLAGPSDEFID</B>&nbsp;叶子节点标识属性，指定动态树节点叶子节点标识的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_LEAFFLAGPSDEFID = "leafflagpsdefid";

    /**
     * 设置 叶子节点标识属性，详细说明：{@link #FIELD_LEAFFLAGPSDEFID}
     * 
     * @param leafFlagPSDEFId
     * 
     */
    @JsonProperty(FIELD_LEAFFLAGPSDEFID)
    public void setLeafFlagPSDEFId(String leafFlagPSDEFId){
        this.set(FIELD_LEAFFLAGPSDEFID, leafFlagPSDEFId);
    }
    
    /**
     * 获取 叶子节点标识属性  
     * @return
     */
    @JsonIgnore
    public String getLeafFlagPSDEFId(){
        Object objValue = this.get(FIELD_LEAFFLAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 叶子节点标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeafFlagPSDEFIdDirty(){
        if(this.contains(FIELD_LEAFFLAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 叶子节点标识属性
     */
    @JsonIgnore
    public void resetLeafFlagPSDEFId(){
        this.reset(FIELD_LEAFFLAGPSDEFID);
    }

    /**
     * 设置 叶子节点标识属性，详细说明：{@link #FIELD_LEAFFLAGPSDEFID}
     * <P>
     * 等同 {@link #setLeafFlagPSDEFId}
     * @param leafFlagPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode leafflagpsdefid(String leafFlagPSDEFId){
        this.setLeafFlagPSDEFId(leafFlagPSDEFId);
        return this;
    }

    /**
     * 设置 叶子节点标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLeafFlagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode leafflagpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setLeafFlagPSDEFId(null);
            this.setLeafFlagPSDEFName(null);
        }
        else{
            this.setLeafFlagPSDEFId(pSDEField.getPSDEFieldId());
            this.setLeafFlagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LEAFFLAGPSDEFNAME</B>&nbsp;叶子节点标识属性，指定动态树节点叶子节点标识的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LEAFFLAGPSDEFID}
     */
    public final static String FIELD_LEAFFLAGPSDEFNAME = "leafflagpsdefname";

    /**
     * 设置 叶子节点标识属性，详细说明：{@link #FIELD_LEAFFLAGPSDEFNAME}
     * 
     * @param leafFlagPSDEFName
     * 
     */
    @JsonProperty(FIELD_LEAFFLAGPSDEFNAME)
    public void setLeafFlagPSDEFName(String leafFlagPSDEFName){
        this.set(FIELD_LEAFFLAGPSDEFNAME, leafFlagPSDEFName);
    }
    
    /**
     * 获取 叶子节点标识属性  
     * @return
     */
    @JsonIgnore
    public String getLeafFlagPSDEFName(){
        Object objValue = this.get(FIELD_LEAFFLAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 叶子节点标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeafFlagPSDEFNameDirty(){
        if(this.contains(FIELD_LEAFFLAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 叶子节点标识属性
     */
    @JsonIgnore
    public void resetLeafFlagPSDEFName(){
        this.reset(FIELD_LEAFFLAGPSDEFNAME);
    }

    /**
     * 设置 叶子节点标识属性，详细说明：{@link #FIELD_LEAFFLAGPSDEFNAME}
     * <P>
     * 等同 {@link #setLeafFlagPSDEFName}
     * @param leafFlagPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode leafflagpsdefname(String leafFlagPSDEFName){
        this.setLeafFlagPSDEFName(leafFlagPSDEFName);
        return this;
    }

    /**
     * <B>LINKPSDEFID</B>&nbsp;链接属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_LINKPSDEFID = "linkpsdefid";

    /**
     * 设置 链接属性
     * 
     * @param linkPSDEFId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEFID)
    public void setLinkPSDEFId(String linkPSDEFId){
        this.set(FIELD_LINKPSDEFID, linkPSDEFId);
    }
    
    /**
     * 获取 链接属性  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEFId(){
        Object objValue = this.get(FIELD_LINKPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEFIdDirty(){
        if(this.contains(FIELD_LINKPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接属性
     */
    @JsonIgnore
    public void resetLinkPSDEFId(){
        this.reset(FIELD_LINKPSDEFID);
    }

    /**
     * 设置 链接属性
     * <P>
     * 等同 {@link #setLinkPSDEFId}
     * @param linkPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode linkpsdefid(String linkPSDEFId){
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    /**
     * 设置 链接属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode linkpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setLinkPSDEFId(null);
            this.setLinkPSDEFName(null);
        }
        else{
            this.setLinkPSDEFId(pSDEField.getPSDEFieldId());
            this.setLinkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEFNAME</B>&nbsp;链接属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEFID}
     */
    public final static String FIELD_LINKPSDEFNAME = "linkpsdefname";

    /**
     * 设置 链接属性
     * 
     * @param linkPSDEFName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEFNAME)
    public void setLinkPSDEFName(String linkPSDEFName){
        this.set(FIELD_LINKPSDEFNAME, linkPSDEFName);
    }
    
    /**
     * 获取 链接属性  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEFName(){
        Object objValue = this.get(FIELD_LINKPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEFNameDirty(){
        if(this.contains(FIELD_LINKPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接属性
     */
    @JsonIgnore
    public void resetLinkPSDEFName(){
        this.reset(FIELD_LINKPSDEFNAME);
    }

    /**
     * 设置 链接属性
     * <P>
     * 等同 {@link #setLinkPSDEFName}
     * @param linkPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode linkpsdefname(String linkPSDEFName){
        this.setLinkPSDEFName(linkPSDEFName);
        return this;
    }

    /**
     * <B>MAXSIZE</B>&nbsp;最大节点数量，指定实体动态节点最大的加载数量，-1为不限制。未定义时为【-1】
     */
    public final static String FIELD_MAXSIZE = "maxsize";

    /**
     * 设置 最大节点数量，详细说明：{@link #FIELD_MAXSIZE}
     * 
     * @param maxSize
     * 
     */
    @JsonProperty(FIELD_MAXSIZE)
    public void setMaxSize(Integer maxSize){
        this.set(FIELD_MAXSIZE, maxSize);
    }
    
    /**
     * 获取 最大节点数量  
     * @return
     */
    @JsonIgnore
    public Integer getMaxSize(){
        Object objValue = this.get(FIELD_MAXSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大节点数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxSizeDirty(){
        if(this.contains(FIELD_MAXSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大节点数量
     */
    @JsonIgnore
    public void resetMaxSize(){
        this.reset(FIELD_MAXSIZE);
    }

    /**
     * 设置 最大节点数量，详细说明：{@link #FIELD_MAXSIZE}
     * <P>
     * 等同 {@link #setMaxSize}
     * @param maxSize
     */
    @JsonIgnore
    public PSDETreeNode maxsize(Integer maxSize){
        this.setMaxSize(maxSize);
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
    public PSDETreeNode memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELOBJ</B>&nbsp;节点模型对象，指定树节点的动态模型对象，此配置需确定各模板具体的实现方式
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_MODELOBJ = "modelobj";

    /**
     * 设置 节点模型对象，详细说明：{@link #FIELD_MODELOBJ}
     * 
     * @param modelObj
     * 
     */
    @JsonProperty(FIELD_MODELOBJ)
    public void setModelObj(String modelObj){
        this.set(FIELD_MODELOBJ, modelObj);
    }
    
    /**
     * 获取 节点模型对象  
     * @return
     */
    @JsonIgnore
    public String getModelObj(){
        Object objValue = this.get(FIELD_MODELOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelObjDirty(){
        if(this.contains(FIELD_MODELOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点模型对象
     */
    @JsonIgnore
    public void resetModelObj(){
        this.reset(FIELD_MODELOBJ);
    }

    /**
     * 设置 节点模型对象，详细说明：{@link #FIELD_MODELOBJ}
     * <P>
     * 等同 {@link #setModelObj}
     * @param modelObj
     */
    @JsonIgnore
    public PSDETreeNode modelobj(String modelObj){
        this.setModelObj(modelObj);
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONID</B>&nbsp;移动数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_MOVEPSDEACTIONID = "movepsdeactionid";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionId
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONID)
    public void setMovePSDEActionId(String movePSDEActionId){
        this.set(FIELD_MOVEPSDEACTIONID, movePSDEActionId);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionId(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionIdDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionId(){
        this.reset(FIELD_MOVEPSDEACTIONID);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param movePSDEActionId
     */
    @JsonIgnore
    public PSDETreeNode movepsdeactionid(String movePSDEActionId){
        this.setMovePSDEActionId(movePSDEActionId);
        return this;
    }

    /**
     * 设置 移动数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDETreeNode movepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setMovePSDEActionId(null);
            this.setMovePSDEActionName(null);
        }
        else{
            this.setMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>MOVEPSDEACTIONNAME</B>&nbsp;移动数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOVEPSDEACTIONID}
     */
    public final static String FIELD_MOVEPSDEACTIONNAME = "movepsdeactionname";

    /**
     * 设置 移动数据实体行为
     * 
     * @param movePSDEActionName
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEACTIONNAME)
    public void setMovePSDEActionName(String movePSDEActionName){
        this.set(FIELD_MOVEPSDEACTIONNAME, movePSDEActionName);
    }
    
    /**
     * 获取 移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEActionName(){
        Object objValue = this.get(FIELD_MOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEActionNameDirty(){
        if(this.contains(FIELD_MOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动数据实体行为
     */
    @JsonIgnore
    public void resetMovePSDEActionName(){
        this.reset(FIELD_MOVEPSDEACTIONNAME);
    }

    /**
     * 设置 移动数据实体行为
     * <P>
     * 等同 {@link #setMovePSDEActionName}
     * @param movePSDEActionName
     */
    @JsonIgnore
    public PSDETreeNode movepsdeactionname(String movePSDEActionName){
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    /**
     * <B>MOVEPSDEOPPRIVID</B>&nbsp;移动实体操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_MOVEPSDEOPPRIVID = "movepsdeopprivid";

    /**
     * 设置 移动实体操作标识
     * 
     * @param movePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEOPPRIVID)
    public void setMovePSDEOPPrivId(String movePSDEOPPrivId){
        this.set(FIELD_MOVEPSDEOPPRIVID, movePSDEOPPrivId);
    }
    
    /**
     * 获取 移动实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEOPPrivId(){
        Object objValue = this.get(FIELD_MOVEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_MOVEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动实体操作标识
     */
    @JsonIgnore
    public void resetMovePSDEOPPrivId(){
        this.reset(FIELD_MOVEPSDEOPPRIVID);
    }

    /**
     * 设置 移动实体操作标识
     * <P>
     * 等同 {@link #setMovePSDEOPPrivId}
     * @param movePSDEOPPrivId
     */
    @JsonIgnore
    public PSDETreeNode movepsdeopprivid(String movePSDEOPPrivId){
        this.setMovePSDEOPPrivId(movePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 移动实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMovePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDETreeNode movepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setMovePSDEOPPrivId(null);
            this.setMovePSDEOPPrivName(null);
        }
        else{
            this.setMovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setMovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>MOVEPSDEOPPRIVNAME</B>&nbsp;移动实体操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOVEPSDEOPPRIVID}
     */
    public final static String FIELD_MOVEPSDEOPPRIVNAME = "movepsdeopprivname";

    /**
     * 设置 移动实体操作标识
     * 
     * @param movePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_MOVEPSDEOPPRIVNAME)
    public void setMovePSDEOPPrivName(String movePSDEOPPrivName){
        this.set(FIELD_MOVEPSDEOPPRIVNAME, movePSDEOPPrivName);
    }
    
    /**
     * 获取 移动实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getMovePSDEOPPrivName(){
        Object objValue = this.get(FIELD_MOVEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMovePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_MOVEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动实体操作标识
     */
    @JsonIgnore
    public void resetMovePSDEOPPrivName(){
        this.reset(FIELD_MOVEPSDEOPPRIVNAME);
    }

    /**
     * 设置 移动实体操作标识
     * <P>
     * 等同 {@link #setMovePSDEOPPrivName}
     * @param movePSDEOPPrivName
     */
    @JsonIgnore
    public PSDETreeNode movepsdeopprivname(String movePSDEOPPrivName){
        this.setMovePSDEOPPrivName(movePSDEOPPrivName);
        return this;
    }

    /**
     * <B>NAMEPSLANRESID</B>&nbsp;名称语言资源，指定树节点标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_NAMEPSLANRESID = "namepslanresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * 
     * @param namePSLanResId
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESID)
    public void setNamePSLanResId(String namePSLanResId){
        this.set(FIELD_NAMEPSLANRESID, namePSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResId(){
        Object objValue = this.get(FIELD_NAMEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResIdDirty(){
        if(this.contains(FIELD_NAMEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResId(){
        this.reset(FIELD_NAMEPSLANRESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param namePSLanResId
     */
    @JsonIgnore
    public PSDETreeNode namepslanresid(String namePSLanResId){
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDETreeNode namepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        }
        else{
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NAMEPSLANRESNAME</B>&nbsp;标题语言资源，指定树节点标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAMEPSLANRESID}
     */
    public final static String FIELD_NAMEPSLANRESNAME = "namepslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * 
     * @param namePSLanResName
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESNAME)
    public void setNamePSLanResName(String namePSLanResName){
        this.set(FIELD_NAMEPSLANRESNAME, namePSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResName(){
        Object objValue = this.get(FIELD_NAMEPSLANRESNAME);
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
    public boolean isNamePSLanResNameDirty(){
        if(this.contains(FIELD_NAMEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResName(){
        this.reset(FIELD_NAMEPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * <P>
     * 等同 {@link #setNamePSLanResName}
     * @param namePSLanResName
     */
    @JsonIgnore
    public PSDETreeNode namepslanresname(String namePSLanResName){
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定树视图节点关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NAVVIEWFILTER = "navviewfilter";

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * 
     * @param navViewFilter
     * 
     */
    @JsonProperty(FIELD_NAVVIEWFILTER)
    public void setNavViewFilter(String navViewFilter){
        this.set(FIELD_NAVVIEWFILTER, navViewFilter);
    }
    
    /**
     * 获取 导航视图过滤项  
     * @return
     */
    @JsonIgnore
    public String getNavViewFilter(){
        Object objValue = this.get(FIELD_NAVVIEWFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewFilterDirty(){
        if(this.contains(FIELD_NAVVIEWFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图过滤项
     */
    @JsonIgnore
    public void resetNavViewFilter(){
        this.reset(FIELD_NAVVIEWFILTER);
    }

    /**
     * 设置 导航视图过滤项，详细说明：{@link #FIELD_NAVVIEWFILTER}
     * <P>
     * 等同 {@link #setNavViewFilter}
     * @param navViewFilter
     */
    @JsonIgnore
    public PSDETreeNode navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定树视图节点关联导航视图的额外参数
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_NAVVIEWPARAM = "navviewparam";

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * 
     * @param navViewParam
     * 
     */
    @JsonProperty(FIELD_NAVVIEWPARAM)
    public void setNavViewParam(String navViewParam){
        this.set(FIELD_NAVVIEWPARAM, navViewParam);
    }
    
    /**
     * 获取 导航视图参数  
     * @return
     */
    @JsonIgnore
    public String getNavViewParam(){
        Object objValue = this.get(FIELD_NAVVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewParamDirty(){
        if(this.contains(FIELD_NAVVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图参数
     */
    @JsonIgnore
    public void resetNavViewParam(){
        this.reset(FIELD_NAVVIEWPARAM);
    }

    /**
     * 设置 导航视图参数，详细说明：{@link #FIELD_NAVVIEWPARAM}
     * <P>
     * 等同 {@link #setNavViewParam}
     * @param navViewParam
     */
    @JsonIgnore
    public PSDETreeNode navviewparam(String navViewParam){
        this.setNavViewParam(navViewParam);
        return this;
    }

    /**
     * <B>NEWDATAMODE</B>&nbsp;新建数据模式，指定实体动态树节点新建数据的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NewDataMode} 
     */
    public final static String FIELD_NEWDATAMODE = "newdatamode";

    /**
     * 设置 新建数据模式，详细说明：{@link #FIELD_NEWDATAMODE}
     * 
     * @param newDataMode
     * 
     */
    @JsonProperty(FIELD_NEWDATAMODE)
    public void setNewDataMode(String newDataMode){
        this.set(FIELD_NEWDATAMODE, newDataMode);
    }
    
    /**
     * 获取 新建数据模式  
     * @return
     */
    @JsonIgnore
    public String getNewDataMode(){
        Object objValue = this.get(FIELD_NEWDATAMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNewDataModeDirty(){
        if(this.contains(FIELD_NEWDATAMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建数据模式
     */
    @JsonIgnore
    public void resetNewDataMode(){
        this.reset(FIELD_NEWDATAMODE);
    }

    /**
     * 设置 新建数据模式，详细说明：{@link #FIELD_NEWDATAMODE}
     * <P>
     * 等同 {@link #setNewDataMode}
     * @param newDataMode
     */
    @JsonIgnore
    public PSDETreeNode newdatamode(String newDataMode){
        this.setNewDataMode(newDataMode);
        return this;
    }

     /**
     * 设置 新建数据模式，详细说明：{@link #FIELD_NEWDATAMODE}
     * <P>
     * 等同 {@link #setNewDataMode}
     * @param newDataMode
     */
    @JsonIgnore
    public PSDETreeNode newdatamode(net.ibizsys.psmodel.core.util.PSModelEnums.NewDataMode newDataMode){
        if(newDataMode == null){
            this.setNewDataMode(null);
        }
        else{
            this.setNewDataMode(newDataMode.value);
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPID</B>&nbsp;实体界面行为组2，指定树节点界面行为组占位2绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
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
    public PSDETreeNode no2psdeuagroupid(String no2PSDEUAGroupId){
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
    public PSDETreeNode no2psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>NO2PSDEUAGROUPNAME</B>&nbsp;实体界面行为组2，指定树节点界面行为组占位2绑定的界面行为组
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
    public PSDETreeNode no2psdeuagroupname(String no2PSDEUAGroupName){
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NODEDATATYPE</B>&nbsp;节点数据类别，指定树节点的数据类别
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NODEDATATYPE = "nodedatatype";

    /**
     * 设置 节点数据类别，详细说明：{@link #FIELD_NODEDATATYPE}
     * 
     * @param nodeDataType
     * 
     */
    @JsonProperty(FIELD_NODEDATATYPE)
    public void setNodeDataType(String nodeDataType){
        this.set(FIELD_NODEDATATYPE, nodeDataType);
    }
    
    /**
     * 获取 节点数据类别  
     * @return
     */
    @JsonIgnore
    public String getNodeDataType(){
        Object objValue = this.get(FIELD_NODEDATATYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点数据类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeDataTypeDirty(){
        if(this.contains(FIELD_NODEDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点数据类别
     */
    @JsonIgnore
    public void resetNodeDataType(){
        this.reset(FIELD_NODEDATATYPE);
    }

    /**
     * 设置 节点数据类别，详细说明：{@link #FIELD_NODEDATATYPE}
     * <P>
     * 等同 {@link #setNodeDataType}
     * @param nodeDataType
     */
    @JsonIgnore
    public PSDETreeNode nodedatatype(String nodeDataType){
        this.setNodeDataType(nodeDataType);
        return this;
    }

    /**
     * <B>NODEID2PSDEFID</B>&nbsp;父标识2绑定属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_NODEID2PSDEFID = "nodeid2psdefid";

    /**
     * 设置 父标识2绑定属性
     * 
     * @param nodeId2PSDEFId
     * 
     */
    @JsonProperty(FIELD_NODEID2PSDEFID)
    public void setNodeId2PSDEFId(String nodeId2PSDEFId){
        this.set(FIELD_NODEID2PSDEFID, nodeId2PSDEFId);
    }
    
    /**
     * 获取 父标识2绑定属性  
     * @return
     */
    @JsonIgnore
    public String getNodeId2PSDEFId(){
        Object objValue = this.get(FIELD_NODEID2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父标识2绑定属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeId2PSDEFIdDirty(){
        if(this.contains(FIELD_NODEID2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父标识2绑定属性
     */
    @JsonIgnore
    public void resetNodeId2PSDEFId(){
        this.reset(FIELD_NODEID2PSDEFID);
    }

    /**
     * 设置 父标识2绑定属性
     * <P>
     * 等同 {@link #setNodeId2PSDEFId}
     * @param nodeId2PSDEFId
     */
    @JsonIgnore
    public PSDETreeNode nodeid2psdefid(String nodeId2PSDEFId){
        this.setNodeId2PSDEFId(nodeId2PSDEFId);
        return this;
    }

    /**
     * 设置 父标识2绑定属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNodeId2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode nodeid2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setNodeId2PSDEFId(null);
        }
        else{
            this.setNodeId2PSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    /**
     * <B>NODEID3PSDEFID</B>&nbsp;父标识3绑定属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_NODEID3PSDEFID = "nodeid3psdefid";

    /**
     * 设置 父标识3绑定属性
     * 
     * @param nodeId3PSDEFId
     * 
     */
    @JsonProperty(FIELD_NODEID3PSDEFID)
    public void setNodeId3PSDEFId(String nodeId3PSDEFId){
        this.set(FIELD_NODEID3PSDEFID, nodeId3PSDEFId);
    }
    
    /**
     * 获取 父标识3绑定属性  
     * @return
     */
    @JsonIgnore
    public String getNodeId3PSDEFId(){
        Object objValue = this.get(FIELD_NODEID3PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父标识3绑定属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeId3PSDEFIdDirty(){
        if(this.contains(FIELD_NODEID3PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父标识3绑定属性
     */
    @JsonIgnore
    public void resetNodeId3PSDEFId(){
        this.reset(FIELD_NODEID3PSDEFID);
    }

    /**
     * 设置 父标识3绑定属性
     * <P>
     * 等同 {@link #setNodeId3PSDEFId}
     * @param nodeId3PSDEFId
     */
    @JsonIgnore
    public PSDETreeNode nodeid3psdefid(String nodeId3PSDEFId){
        this.setNodeId3PSDEFId(nodeId3PSDEFId);
        return this;
    }

    /**
     * 设置 父标识3绑定属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNodeId3PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode nodeid3psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setNodeId3PSDEFId(null);
        }
        else{
            this.setNodeId3PSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    /**
     * <B>NODEID4PSDEFID</B>&nbsp;父标识4绑定属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_NODEID4PSDEFID = "nodeid4psdefid";

    /**
     * 设置 父标识4绑定属性
     * 
     * @param nodeId4PSDEFId
     * 
     */
    @JsonProperty(FIELD_NODEID4PSDEFID)
    public void setNodeId4PSDEFId(String nodeId4PSDEFId){
        this.set(FIELD_NODEID4PSDEFID, nodeId4PSDEFId);
    }
    
    /**
     * 获取 父标识4绑定属性  
     * @return
     */
    @JsonIgnore
    public String getNodeId4PSDEFId(){
        Object objValue = this.get(FIELD_NODEID4PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父标识4绑定属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeId4PSDEFIdDirty(){
        if(this.contains(FIELD_NODEID4PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父标识4绑定属性
     */
    @JsonIgnore
    public void resetNodeId4PSDEFId(){
        this.reset(FIELD_NODEID4PSDEFID);
    }

    /**
     * 设置 父标识4绑定属性
     * <P>
     * 等同 {@link #setNodeId4PSDEFId}
     * @param nodeId4PSDEFId
     */
    @JsonIgnore
    public PSDETreeNode nodeid4psdefid(String nodeId4PSDEFId){
        this.setNodeId4PSDEFId(nodeId4PSDEFId);
        return this;
    }

    /**
     * 设置 父标识4绑定属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNodeId4PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode nodeid4psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setNodeId4PSDEFId(null);
        }
        else{
            this.setNodeId4PSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    /**
     * <B>NODEIDPSDEFID</B>&nbsp;父标识绑定属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_NODEIDPSDEFID = "nodeidpsdefid";

    /**
     * 设置 父标识绑定属性
     * 
     * @param nodeIdPSDEFId
     * 
     */
    @JsonProperty(FIELD_NODEIDPSDEFID)
    public void setNodeIdPSDEFId(String nodeIdPSDEFId){
        this.set(FIELD_NODEIDPSDEFID, nodeIdPSDEFId);
    }
    
    /**
     * 获取 父标识绑定属性  
     * @return
     */
    @JsonIgnore
    public String getNodeIdPSDEFId(){
        Object objValue = this.get(FIELD_NODEIDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父标识绑定属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeIdPSDEFIdDirty(){
        if(this.contains(FIELD_NODEIDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父标识绑定属性
     */
    @JsonIgnore
    public void resetNodeIdPSDEFId(){
        this.reset(FIELD_NODEIDPSDEFID);
    }

    /**
     * 设置 父标识绑定属性
     * <P>
     * 等同 {@link #setNodeIdPSDEFId}
     * @param nodeIdPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode nodeidpsdefid(String nodeIdPSDEFId){
        this.setNodeIdPSDEFId(nodeIdPSDEFId);
        return this;
    }

    /**
     * 设置 父标识绑定属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNodeIdPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode nodeidpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setNodeIdPSDEFId(null);
        }
        else{
            this.setNodeIdPSDEFId(pSDEField.getPSDEFieldId());
        }
        return this;
    }

    /**
     * <B>NODETYPE</B>&nbsp;树节点标识，指定树节点的标识，需在所在树视图中具备唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_NODETYPE = "nodetype";

    /**
     * 设置 树节点标识，详细说明：{@link #FIELD_NODETYPE}
     * 
     * @param nodeType
     * 
     */
    @JsonProperty(FIELD_NODETYPE)
    public void setNodeType(String nodeType){
        this.set(FIELD_NODETYPE, nodeType);
    }
    
    /**
     * 获取 树节点标识  
     * @return
     */
    @JsonIgnore
    public String getNodeType(){
        Object objValue = this.get(FIELD_NODETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeTypeDirty(){
        if(this.contains(FIELD_NODETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点标识
     */
    @JsonIgnore
    public void resetNodeType(){
        this.reset(FIELD_NODETYPE);
    }

    /**
     * 设置 树节点标识，详细说明：{@link #FIELD_NODETYPE}
     * <P>
     * 等同 {@link #setNodeType}
     * @param nodeType
     */
    @JsonIgnore
    public PSDETreeNode nodetype(String nodeType){
        this.setNodeType(nodeType);
        return this;
    }

    /**
     * <B>NODEVALUE</B>&nbsp;静态节点值，指定静态树节点的节点值，未定义时非根静态节点使用父节点值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_NODEVALUE = "nodevalue";

    /**
     * 设置 静态节点值，详细说明：{@link #FIELD_NODEVALUE}
     * 
     * @param nodeValue
     * 
     */
    @JsonProperty(FIELD_NODEVALUE)
    public void setNodeValue(String nodeValue){
        this.set(FIELD_NODEVALUE, nodeValue);
    }
    
    /**
     * 获取 静态节点值  
     * @return
     */
    @JsonIgnore
    public String getNodeValue(){
        Object objValue = this.get(FIELD_NODEVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 静态节点值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeValueDirty(){
        if(this.contains(FIELD_NODEVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 静态节点值
     */
    @JsonIgnore
    public void resetNodeValue(){
        this.reset(FIELD_NODEVALUE);
    }

    /**
     * 设置 静态节点值，详细说明：{@link #FIELD_NODEVALUE}
     * <P>
     * 等同 {@link #setNodeValue}
     * @param nodeValue
     */
    @JsonIgnore
    public PSDETreeNode nodevalue(String nodeValue){
        this.setNodeValue(nodeValue);
        return this;
    }

    /**
     * <B>PAGESIZE</B>&nbsp;分页大小
     */
    public final static String FIELD_PAGESIZE = "pagesize";

    /**
     * 设置 分页大小
     * 
     * @param pageSize
     * 
     */
    @JsonProperty(FIELD_PAGESIZE)
    public void setPageSize(Integer pageSize){
        this.set(FIELD_PAGESIZE, pageSize);
    }
    
    /**
     * 获取 分页大小  
     * @return
     */
    @JsonIgnore
    public Integer getPageSize(){
        Object objValue = this.get(FIELD_PAGESIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分页大小 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageSizeDirty(){
        if(this.contains(FIELD_PAGESIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分页大小
     */
    @JsonIgnore
    public void resetPageSize(){
        this.reset(FIELD_PAGESIZE);
    }

    /**
     * 设置 分页大小
     * <P>
     * 等同 {@link #setPageSize}
     * @param pageSize
     */
    @JsonIgnore
    public PSDETreeNode pagesize(Integer pageSize){
        this.setPageSize(pageSize);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表，指定代码表动态树节点使用的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListId(){
        Object objValue = this.get(FIELD_PSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListIdDirty(){
        if(this.contains(FIELD_PSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDETreeNode pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDETreeNode pscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;代码表，指定代码表动态树节点使用的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListName(){
        Object objValue = this.get(FIELD_PSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListNameDirty(){
        if(this.contains(FIELD_PSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDETreeNode pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为
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
     * 设置 实体行为
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSDETreeNode psdeactionid(String pSDEActionId){
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
    public PSDETreeNode psdeactionid(PSDEAction pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为
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
     * 设置 实体行为
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSDETreeNode psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集合，指定实体动态树节点供数的数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集合  
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
     * 判断 实体数据集合 是否指定值，包括空值
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
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDETreeNode psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psdedsid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDSNAME</B>&nbsp;实体数据集合，指定实体动态树节点供数的数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集合  
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
     * 判断 实体数据集合 是否指定值，包括空值
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
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDETreeNode psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体树表格
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGrid} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体树表格
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 实体树表格  
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
     * 判断 实体树表格 是否指定值，包括空值
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
     * 重置 实体树表格
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 实体树表格
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDETreeNode psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * 设置 实体树表格，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psdegridid(PSDEGrid pSDEGrid){
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
     * <B>PSDEGRIDNAME</B>&nbsp;实体树表格
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDID}
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 实体树表格
     * 
     * @param pSDEGridName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDNAME)
    public void setPSDEGridName(String pSDEGridName){
        this.set(FIELD_PSDEGRIDNAME, pSDEGridName);
    }
    
    /**
     * 获取 实体树表格  
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
     * 判断 实体树表格 是否指定值，包括空值
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
     * 重置 实体树表格
     */
    @JsonIgnore
    public void resetPSDEGridName(){
        this.reset(FIELD_PSDEGRIDNAME);
    }

    /**
     * 设置 实体树表格
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDETreeNode psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体树节点相关的实体对象
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
    public PSDETreeNode psdeid(String pSDEId){
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
    public PSDETreeNode psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;上下文数据逻辑，指定实体动态树节点使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 上下文数据逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文数据逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDETreeNode psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 上下文数据逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;上下文数据逻辑，指定实体动态树节点使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 上下文数据逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上下文数据逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 上下文数据逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDETreeNode psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体树节点相关的实体对象
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
    public PSDETreeNode psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;附加关系参数，指定树节点默认的导航关系，此配置在树导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 附加关系参数，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 附加关系参数  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加关系参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加关系参数
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 附加关系参数，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDETreeNode psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 附加关系参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;附加导航关系，指定树节点默认的导航关系，此配置在树导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 附加导航关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 附加导航关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加导航关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加导航关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 附加导航关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDETreeNode psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;上下文菜单，指定树节点的上下文菜单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_PSDETOOLBARID = "psdetoolbarid";

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARID}
     * 
     * @param pSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARID)
    public void setPSDEToolbarId(String pSDEToolbarId){
        this.set(FIELD_PSDETOOLBARID, pSDEToolbarId);
    }
    
    /**
     * 获取 上下文菜单  
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
     * 判断 上下文菜单 是否指定值，包括空值
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
     * 重置 上下文菜单
     */
    @JsonIgnore
    public void resetPSDEToolbarId(){
        this.reset(FIELD_PSDETOOLBARID);
    }

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARID}
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbarId
     */
    @JsonIgnore
    public PSDETreeNode psdetoolbarid(String pSDEToolbarId){
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    /**
     * 设置 上下文菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setPSDEToolbarId(null);
            this.setPSDEToolbarName(null);
        }
        else{
            this.setPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>PSDETOOLBARNAME</B>&nbsp;上下文菜单，指定树节点的上下文菜单对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETOOLBARID}
     */
    public final static String FIELD_PSDETOOLBARNAME = "psdetoolbarname";

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * 
     * @param pSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARNAME)
    public void setPSDEToolbarName(String pSDEToolbarName){
        this.set(FIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }
    
    /**
     * 获取 上下文菜单  
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
     * 判断 上下文菜单 是否指定值，包括空值
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
     * 重置 上下文菜单
     */
    @JsonIgnore
    public void resetPSDEToolbarName(){
        this.reset(FIELD_PSDETOOLBARNAME);
    }

    /**
     * 设置 上下文菜单，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setPSDEToolbarName}
     * @param pSDEToolbarName
     */
    @JsonIgnore
    public PSDETreeNode psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDETREENODEID</B>&nbsp;实体树节点标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETREENODEID = "psdetreenodeid";

    /**
     * 设置 实体树节点标识
     * 
     * @param pSDETreeNodeId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODEID)
    public void setPSDETreeNodeId(String pSDETreeNodeId){
        this.set(FIELD_PSDETREENODEID, pSDETreeNodeId);
    }
    
    /**
     * 获取 实体树节点标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeId(){
        Object objValue = this.get(FIELD_PSDETREENODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树节点标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty(){
        if(this.contains(FIELD_PSDETREENODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树节点标识
     */
    @JsonIgnore
    public void resetPSDETreeNodeId(){
        this.reset(FIELD_PSDETREENODEID);
    }

    /**
     * 设置 实体树节点标识
     * <P>
     * 等同 {@link #setPSDETreeNodeId}
     * @param pSDETreeNodeId
     */
    @JsonIgnore
    public PSDETreeNode psdetreenodeid(String pSDETreeNodeId){
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    /**
     * <B>PSDETREENODENAME</B>&nbsp;树节点名称，指定树节点的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDETREENODENAME = "psdetreenodename";

    /**
     * 设置 树节点名称，详细说明：{@link #FIELD_PSDETREENODENAME}
     * 
     * @param pSDETreeNodeName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODENAME)
    public void setPSDETreeNodeName(String pSDETreeNodeName){
        this.set(FIELD_PSDETREENODENAME, pSDETreeNodeName);
    }
    
    /**
     * 获取 树节点名称  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeName(){
        Object objValue = this.get(FIELD_PSDETREENODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeNameDirty(){
        if(this.contains(FIELD_PSDETREENODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点名称
     */
    @JsonIgnore
    public void resetPSDETreeNodeName(){
        this.reset(FIELD_PSDETREENODENAME);
    }

    /**
     * 设置 树节点名称，详细说明：{@link #FIELD_PSDETREENODENAME}
     * <P>
     * 等同 {@link #setPSDETreeNodeName}
     * @param pSDETreeNodeName
     */
    @JsonIgnore
    public PSDETreeNode psdetreenodename(String pSDETreeNodeName){
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeNodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeNodeName(strName);
    }

    @JsonIgnore
    public PSDETreeNode name(String strName){
        this.setPSDETreeNodeName(strName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，指定树节点所在的树视图部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeView} 
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 实体树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewId(){
        Object objValue = this.get(FIELD_PSDETREEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewIdDirty(){
        if(this.contains(FIELD_PSDETREEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDETreeNode psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * 设置 实体树视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeView 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psdetreeviewid(PSDETreeView pSDETreeView){
        if(pSDETreeView == null){
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        }
        else{
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图，指定树节点所在的树视图部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREEVIEWID}
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 实体树视图  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewName(){
        Object objValue = this.get(FIELD_PSDETREEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewNameDirty(){
        if(this.contains(FIELD_PSDETREEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDETreeNode psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组，指定树节点界面行为组占位绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
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
    public PSDETreeNode psdeuagroupid(String pSDEUAGroupId){
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
    public PSDETreeNode psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组，指定树节点界面行为组占位绑定的界面行为组
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
    public PSDETreeNode psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;导航视图，指定树节点默认的导航关系视图，此配置在树导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 导航视图  
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
     * 判断 导航视图 是否指定值，包括空值
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
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDETreeNode psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 导航视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDETreeNode psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;导航视图，指定树节点默认的导航关系视图，此配置在树导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 导航视图  
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
     * 判断 导航视图 是否指定值，包括空值
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
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDETreeNode psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;节点界面样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 节点界面样式
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 节点界面样式  
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
     * 判断 节点界面样式 是否指定值，包括空值
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
     * 重置 节点界面样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 节点界面样式
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDETreeNode pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 节点界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETreeNode pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;节点样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 节点样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 节点样式表  
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
     * 判断 节点样式表 是否指定值，包括空值
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
     * 重置 节点样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 节点样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDETreeNode pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;节点图标，指定树节点默认的图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 节点图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 节点图标  
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
     * 判断 节点图标 是否指定值，包括空值
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
     * 重置 节点图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 节点图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDETreeNode pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 节点图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDETreeNode pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;节点图标，指定树节点默认的图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 节点图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 节点图标  
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
     * 判断 节点图标 是否指定值，包括空值
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
     * 重置 节点图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 节点图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDETreeNode pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;节点前端插件，指定树节点扩展的前端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 节点前端插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 节点前端插件  
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
     * 判断 节点前端插件 是否指定值，包括空值
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
     * 重置 节点前端插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 节点前端插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDETreeNode pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 节点前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDETreeNode pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;节点前端插件，指定树节点扩展的前端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 节点前端插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 节点前端插件  
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
     * 判断 节点前端插件 是否指定值，包括空值
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
     * 重置 节点前端插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 节点前端插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDETreeNode pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;资源统一资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 资源统一资源
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 资源统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 资源统一资源
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSDETreeNode pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 资源统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSDETreeNode pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;资源统一资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 资源统一资源
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 资源统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 资源统一资源
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSDETreeNode pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;树节点布局面板，指定树节点自定义的布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 树节点布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 树节点布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 树节点布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDETreeNode pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 树节点布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDETreeNode pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;树节点布局面板，指定树节点自定义的布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 树节点布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 树节点布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 树节点布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDETreeNode pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONID</B>&nbsp;删除实体行为，指定实体动态树节点的删除数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_REMOVEPSDEACTIONID = "removepsdeactionid";

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONID}
     * 
     * @param removePSDEActionId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONID)
    public void setRemovePSDEActionId(String removePSDEActionId){
        this.set(FIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }
    
    /**
     * 获取 删除实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionId(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionId(){
        this.reset(FIELD_REMOVEPSDEACTIONID);
    }

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONID}
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param removePSDEActionId
     */
    @JsonIgnore
    public PSDETreeNode removepsdeactionid(String removePSDEActionId){
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    /**
     * 设置 删除实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDETreeNode removepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setRemovePSDEActionId(null);
            this.setRemovePSDEActionName(null);
        }
        else{
            this.setRemovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setRemovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONNAME</B>&nbsp;删除实体行为，指定实体动态树节点的删除数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEACTIONID}
     */
    public final static String FIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONNAME}
     * 
     * @param removePSDEActionName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONNAME)
    public void setRemovePSDEActionName(String removePSDEActionName){
        this.set(FIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }
    
    /**
     * 获取 删除实体行为  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEActionName(){
        Object objValue = this.get(FIELD_REMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEActionNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionName(){
        this.reset(FIELD_REMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 删除实体行为，详细说明：{@link #FIELD_REMOVEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setRemovePSDEActionName}
     * @param removePSDEActionName
     */
    @JsonIgnore
    public PSDETreeNode removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVID</B>&nbsp;删除实体操作标识，指定实体动态树节点的删除数据所需操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_REMOVEPSDEOPPRIVID = "removepsdeopprivid";

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVID}
     * 
     * @param removePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEOPPRIVID)
    public void setRemovePSDEOPPrivId(String removePSDEOPPrivId){
        this.set(FIELD_REMOVEPSDEOPPRIVID, removePSDEOPPrivId);
    }
    
    /**
     * 获取 删除实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEOPPrivId(){
        Object objValue = this.get(FIELD_REMOVEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_REMOVEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体操作标识
     */
    @JsonIgnore
    public void resetRemovePSDEOPPrivId(){
        this.reset(FIELD_REMOVEPSDEOPPRIVID);
    }

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivId}
     * @param removePSDEOPPrivId
     */
    @JsonIgnore
    public PSDETreeNode removepsdeopprivid(String removePSDEOPPrivId){
        this.setRemovePSDEOPPrivId(removePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 删除实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDETreeNode removepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setRemovePSDEOPPrivId(null);
            this.setRemovePSDEOPPrivName(null);
        }
        else{
            this.setRemovePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setRemovePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>REMOVEPSDEOPPRIVNAME</B>&nbsp;删除实体操作标识，指定实体动态树节点的删除数据所需操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEOPPRIVID}
     */
    public final static String FIELD_REMOVEPSDEOPPRIVNAME = "removepsdeopprivname";

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVNAME}
     * 
     * @param removePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEOPPRIVNAME)
    public void setRemovePSDEOPPrivName(String removePSDEOPPrivName){
        this.set(FIELD_REMOVEPSDEOPPRIVNAME, removePSDEOPPrivName);
    }
    
    /**
     * 获取 删除实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getRemovePSDEOPPrivName(){
        Object objValue = this.get(FIELD_REMOVEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemovePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_REMOVEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除实体操作标识
     */
    @JsonIgnore
    public void resetRemovePSDEOPPrivName(){
        this.reset(FIELD_REMOVEPSDEOPPRIVNAME);
    }

    /**
     * 设置 删除实体操作标识，详细说明：{@link #FIELD_REMOVEPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setRemovePSDEOPPrivName}
     * @param removePSDEOPPrivName
     */
    @JsonIgnore
    public PSDETreeNode removepsdeopprivname(String removePSDEOPPrivName){
        this.setRemovePSDEOPPrivName(removePSDEOPPrivName);
        return this;
    }

    /**
     * <B>ROOTNODE</B>&nbsp;根节点，指定树节点是否为根节点，树视图默认从根节点开始加载。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ROOTNODE = "rootnode";

    /**
     * 设置 根节点，详细说明：{@link #FIELD_ROOTNODE}
     * 
     * @param rootNode
     * 
     */
    @JsonProperty(FIELD_ROOTNODE)
    public void setRootNode(Integer rootNode){
        this.set(FIELD_ROOTNODE, rootNode);
    }
    
    /**
     * 获取 根节点  
     * @return
     */
    @JsonIgnore
    public Integer getRootNode(){
        Object objValue = this.get(FIELD_ROOTNODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 根节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRootNodeDirty(){
        if(this.contains(FIELD_ROOTNODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 根节点
     */
    @JsonIgnore
    public void resetRootNode(){
        this.reset(FIELD_ROOTNODE);
    }

    /**
     * 设置 根节点，详细说明：{@link #FIELD_ROOTNODE}
     * <P>
     * 等同 {@link #setRootNode}
     * @param rootNode
     */
    @JsonIgnore
    public PSDETreeNode rootnode(Integer rootNode){
        this.setRootNode(rootNode);
        return this;
    }

     /**
     * 设置 根节点，详细说明：{@link #FIELD_ROOTNODE}
     * <P>
     * 等同 {@link #setRootNode}
     * @param rootNode
     */
    @JsonIgnore
    public PSDETreeNode rootnode(Boolean rootNode){
        if(rootNode == null){
            this.setRootNode(null);
        }
        else{
            this.setRootNode(rootNode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SELECTED</B>&nbsp;默认选择，指定树节点的默认选择模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeSelectMode} 
     */
    public final static String FIELD_SELECTED = "selected";

    /**
     * 设置 默认选择，详细说明：{@link #FIELD_SELECTED}
     * 
     * @param selected
     * 
     */
    @JsonProperty(FIELD_SELECTED)
    public void setSelected(Integer selected){
        this.set(FIELD_SELECTED, selected);
    }
    
    /**
     * 获取 默认选择  
     * @return
     */
    @JsonIgnore
    public Integer getSelected(){
        Object objValue = this.get(FIELD_SELECTED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认选择 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSelectedDirty(){
        if(this.contains(FIELD_SELECTED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认选择
     */
    @JsonIgnore
    public void resetSelected(){
        this.reset(FIELD_SELECTED);
    }

    /**
     * 设置 默认选择，详细说明：{@link #FIELD_SELECTED}
     * <P>
     * 等同 {@link #setSelected}
     * @param selected
     */
    @JsonIgnore
    public PSDETreeNode selected(Integer selected){
        this.setSelected(selected);
        return this;
    }

     /**
     * 设置 默认选择，详细说明：{@link #FIELD_SELECTED}
     * <P>
     * 等同 {@link #setSelected}
     * @param selected
     */
    @JsonIgnore
    public PSDETreeNode selected(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeSelectMode selected){
        if(selected == null){
            this.setSelected(null);
        }
        else{
            this.setSelected(selected.value);
        }
        return this;
    }

    /**
     * <B>SHAPECLSPSDEFID</B>&nbsp;图形样式表属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SHAPECLSPSDEFID = "shapeclspsdefid";

    /**
     * 设置 图形样式表属性
     * 
     * @param shapeClsPSDEFId
     * 
     */
    @JsonProperty(FIELD_SHAPECLSPSDEFID)
    public void setShapeClsPSDEFId(String shapeClsPSDEFId){
        this.set(FIELD_SHAPECLSPSDEFID, shapeClsPSDEFId);
    }
    
    /**
     * 获取 图形样式表属性  
     * @return
     */
    @JsonIgnore
    public String getShapeClsPSDEFId(){
        Object objValue = this.get(FIELD_SHAPECLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeClsPSDEFIdDirty(){
        if(this.contains(FIELD_SHAPECLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形样式表属性
     */
    @JsonIgnore
    public void resetShapeClsPSDEFId(){
        this.reset(FIELD_SHAPECLSPSDEFID);
    }

    /**
     * 设置 图形样式表属性
     * <P>
     * 等同 {@link #setShapeClsPSDEFId}
     * @param shapeClsPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode shapeclspsdefid(String shapeClsPSDEFId){
        this.setShapeClsPSDEFId(shapeClsPSDEFId);
        return this;
    }

    /**
     * 设置 图形样式表属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setShapeClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode shapeclspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setShapeClsPSDEFId(null);
            this.setShapeClsPSDEFName(null);
        }
        else{
            this.setShapeClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setShapeClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SHAPECLSPSDEFNAME</B>&nbsp;图形样式表属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SHAPECLSPSDEFID}
     */
    public final static String FIELD_SHAPECLSPSDEFNAME = "shapeclspsdefname";

    /**
     * 设置 图形样式表属性
     * 
     * @param shapeClsPSDEFName
     * 
     */
    @JsonProperty(FIELD_SHAPECLSPSDEFNAME)
    public void setShapeClsPSDEFName(String shapeClsPSDEFName){
        this.set(FIELD_SHAPECLSPSDEFNAME, shapeClsPSDEFName);
    }
    
    /**
     * 获取 图形样式表属性  
     * @return
     */
    @JsonIgnore
    public String getShapeClsPSDEFName(){
        Object objValue = this.get(FIELD_SHAPECLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeClsPSDEFNameDirty(){
        if(this.contains(FIELD_SHAPECLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形样式表属性
     */
    @JsonIgnore
    public void resetShapeClsPSDEFName(){
        this.reset(FIELD_SHAPECLSPSDEFNAME);
    }

    /**
     * 设置 图形样式表属性
     * <P>
     * 等同 {@link #setShapeClsPSDEFName}
     * @param shapeClsPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode shapeclspsdefname(String shapeClsPSDEFName){
        this.setShapeClsPSDEFName(shapeClsPSDEFName);
        return this;
    }

    /**
     * <B>SHAPEDYNACLASS</B>&nbsp;图形动态样式表
     */
    public final static String FIELD_SHAPEDYNACLASS = "shapedynaclass";

    /**
     * 设置 图形动态样式表
     * 
     * @param shapeDynaClass
     * 
     */
    @JsonProperty(FIELD_SHAPEDYNACLASS)
    public void setShapeDynaClass(String shapeDynaClass){
        this.set(FIELD_SHAPEDYNACLASS, shapeDynaClass);
    }
    
    /**
     * 获取 图形动态样式表  
     * @return
     */
    @JsonIgnore
    public String getShapeDynaClass(){
        Object objValue = this.get(FIELD_SHAPEDYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeDynaClassDirty(){
        if(this.contains(FIELD_SHAPEDYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形动态样式表
     */
    @JsonIgnore
    public void resetShapeDynaClass(){
        this.reset(FIELD_SHAPEDYNACLASS);
    }

    /**
     * 设置 图形动态样式表
     * <P>
     * 等同 {@link #setShapeDynaClass}
     * @param shapeDynaClass
     */
    @JsonIgnore
    public PSDETreeNode shapedynaclass(String shapeDynaClass){
        this.setShapeDynaClass(shapeDynaClass);
        return this;
    }

    /**
     * <B>SHAPEPSSYSCSSID</B>&nbsp;图形系统界面样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_SHAPEPSSYSCSSID = "shapepssyscssid";

    /**
     * 设置 图形系统界面样式
     * 
     * @param shapePSSysCssId
     * 
     */
    @JsonProperty(FIELD_SHAPEPSSYSCSSID)
    public void setShapePSSysCssId(String shapePSSysCssId){
        this.set(FIELD_SHAPEPSSYSCSSID, shapePSSysCssId);
    }
    
    /**
     * 获取 图形系统界面样式  
     * @return
     */
    @JsonIgnore
    public String getShapePSSysCssId(){
        Object objValue = this.get(FIELD_SHAPEPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形系统界面样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapePSSysCssIdDirty(){
        if(this.contains(FIELD_SHAPEPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形系统界面样式
     */
    @JsonIgnore
    public void resetShapePSSysCssId(){
        this.reset(FIELD_SHAPEPSSYSCSSID);
    }

    /**
     * 设置 图形系统界面样式
     * <P>
     * 等同 {@link #setShapePSSysCssId}
     * @param shapePSSysCssId
     */
    @JsonIgnore
    public PSDETreeNode shapepssyscssid(String shapePSSysCssId){
        this.setShapePSSysCssId(shapePSSysCssId);
        return this;
    }

    /**
     * 设置 图形系统界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setShapePSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETreeNode shapepssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setShapePSSysCssId(null);
            this.setShapePSSysCssName(null);
        }
        else{
            this.setShapePSSysCssId(pSSysCss.getPSSysCssId());
            this.setShapePSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>SHAPEPSSYSCSSNAME</B>&nbsp;图形系统界面样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SHAPEPSSYSCSSID}
     */
    public final static String FIELD_SHAPEPSSYSCSSNAME = "shapepssyscssname";

    /**
     * 设置 图形系统界面样式
     * 
     * @param shapePSSysCssName
     * 
     */
    @JsonProperty(FIELD_SHAPEPSSYSCSSNAME)
    public void setShapePSSysCssName(String shapePSSysCssName){
        this.set(FIELD_SHAPEPSSYSCSSNAME, shapePSSysCssName);
    }
    
    /**
     * 获取 图形系统界面样式  
     * @return
     */
    @JsonIgnore
    public String getShapePSSysCssName(){
        Object objValue = this.get(FIELD_SHAPEPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图形系统界面样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapePSSysCssNameDirty(){
        if(this.contains(FIELD_SHAPEPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图形系统界面样式
     */
    @JsonIgnore
    public void resetShapePSSysCssName(){
        this.reset(FIELD_SHAPEPSSYSCSSNAME);
    }

    /**
     * 设置 图形系统界面样式
     * <P>
     * 等同 {@link #setShapePSSysCssName}
     * @param shapePSSysCssName
     */
    @JsonIgnore
    public PSDETreeNode shapepssyscssname(String shapePSSysCssName){
        this.setShapePSSysCssName(shapePSSysCssName);
        return this;
    }

    /**
     * <B>SORTDIR</B>&nbsp;排序方向，指定实体动态树节点对数据集合的默认排序方向，需指定默认排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeSortDir} 
     */
    public final static String FIELD_SORTDIR = "sortdir";

    /**
     * 设置 排序方向，详细说明：{@link #FIELD_SORTDIR}
     * 
     * @param sortDir
     * 
     */
    @JsonProperty(FIELD_SORTDIR)
    public void setSortDir(String sortDir){
        this.set(FIELD_SORTDIR, sortDir);
    }
    
    /**
     * 获取 排序方向  
     * @return
     */
    @JsonIgnore
    public String getSortDir(){
        Object objValue = this.get(FIELD_SORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSortDirDirty(){
        if(this.contains(FIELD_SORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序方向
     */
    @JsonIgnore
    public void resetSortDir(){
        this.reset(FIELD_SORTDIR);
    }

    /**
     * 设置 排序方向，详细说明：{@link #FIELD_SORTDIR}
     * <P>
     * 等同 {@link #setSortDir}
     * @param sortDir
     */
    @JsonIgnore
    public PSDETreeNode sortdir(String sortDir){
        this.setSortDir(sortDir);
        return this;
    }

     /**
     * 设置 排序方向，详细说明：{@link #FIELD_SORTDIR}
     * <P>
     * 等同 {@link #setSortDir}
     * @param sortDir
     */
    @JsonIgnore
    public PSDETreeNode sortdir(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeSortDir sortDir){
        if(sortDir == null){
            this.setSortDir(null);
        }
        else{
            this.setSortDir(sortDir.value);
        }
        return this;
    }

    /**
     * <B>SORTPSDEFID</B>&nbsp;排序属性，指定动态树节点数据集的排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SORTPSDEFID = "sortpsdefid";

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_SORTPSDEFID}
     * 
     * @param sortPSDEFId
     * 
     */
    @JsonProperty(FIELD_SORTPSDEFID)
    public void setSortPSDEFId(String sortPSDEFId){
        this.set(FIELD_SORTPSDEFID, sortPSDEFId);
    }
    
    /**
     * 获取 排序属性  
     * @return
     */
    @JsonIgnore
    public String getSortPSDEFId(){
        Object objValue = this.get(FIELD_SORTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSortPSDEFIdDirty(){
        if(this.contains(FIELD_SORTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序属性
     */
    @JsonIgnore
    public void resetSortPSDEFId(){
        this.reset(FIELD_SORTPSDEFID);
    }

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_SORTPSDEFID}
     * <P>
     * 等同 {@link #setSortPSDEFId}
     * @param sortPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode sortpsdefid(String sortPSDEFId){
        this.setSortPSDEFId(sortPSDEFId);
        return this;
    }

    /**
     * 设置 排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSortPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode sortpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setSortPSDEFId(null);
            this.setSortPSDEFName(null);
        }
        else{
            this.setSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SORTPSDEFNAME</B>&nbsp;排序属性，指定动态树节点数据集的排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SORTPSDEFID}
     */
    public final static String FIELD_SORTPSDEFNAME = "sortpsdefname";

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_SORTPSDEFNAME}
     * 
     * @param sortPSDEFName
     * 
     */
    @JsonProperty(FIELD_SORTPSDEFNAME)
    public void setSortPSDEFName(String sortPSDEFName){
        this.set(FIELD_SORTPSDEFNAME, sortPSDEFName);
    }
    
    /**
     * 获取 排序属性  
     * @return
     */
    @JsonIgnore
    public String getSortPSDEFName(){
        Object objValue = this.get(FIELD_SORTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSortPSDEFNameDirty(){
        if(this.contains(FIELD_SORTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序属性
     */
    @JsonIgnore
    public void resetSortPSDEFName(){
        this.reset(FIELD_SORTPSDEFNAME);
    }

    /**
     * 设置 排序属性，详细说明：{@link #FIELD_SORTPSDEFNAME}
     * <P>
     * 等同 {@link #setSortPSDEFName}
     * @param sortPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode sortpsdefname(String sortPSDEFName){
        this.setSortPSDEFName(sortPSDEFName);
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性，指定动态树节点文本的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TEXTPSDEFID = "textpsdefid";

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFID}
     * 
     * @param textPSDEFId
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFID)
    public void setTextPSDEFId(String textPSDEFId){
        this.set(FIELD_TEXTPSDEFID, textPSDEFId);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFId(){
        Object objValue = this.get(FIELD_TEXTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFIdDirty(){
        if(this.contains(FIELD_TEXTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFId(){
        this.reset(FIELD_TEXTPSDEFID);
    }

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFID}
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param textPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode textpsdefid(String textPSDEFId){
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    /**
     * 设置 文本属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode textpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        }
        else{
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性，指定动态树节点文本的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSDEFID}
     */
    public final static String FIELD_TEXTPSDEFNAME = "textpsdefname";

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFNAME}
     * 
     * @param textPSDEFName
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFNAME)
    public void setTextPSDEFName(String textPSDEFName){
        this.set(FIELD_TEXTPSDEFNAME, textPSDEFName);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFName(){
        Object objValue = this.get(FIELD_TEXTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFNameDirty(){
        if(this.contains(FIELD_TEXTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFName(){
        this.reset(FIELD_TEXTPSDEFNAME);
    }

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFNAME}
     * <P>
     * 等同 {@link #setTextPSDEFName}
     * @param textPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;节点提示语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 节点提示语言资源
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 节点提示语言资源  
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
     * 判断 节点提示语言资源 是否指定值，包括空值
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
     * 重置 节点提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 节点提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSDETreeNode tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 节点提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDETreeNode tippslanresid(PSLanguageRes pSLanguageRes){
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
    public PSDETreeNode tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TIPSPSDEFID</B>&nbsp;提示属性，指定动态树节点提示信息的取值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TIPSPSDEFID = "tipspsdefid";

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFID}
     * 
     * @param tipsPSDEFId
     * 
     */
    @JsonProperty(FIELD_TIPSPSDEFID)
    public void setTipsPSDEFId(String tipsPSDEFId){
        this.set(FIELD_TIPSPSDEFID, tipsPSDEFId);
    }
    
    /**
     * 获取 提示属性  
     * @return
     */
    @JsonIgnore
    public String getTipsPSDEFId(){
        Object objValue = this.get(FIELD_TIPSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipsPSDEFIdDirty(){
        if(this.contains(FIELD_TIPSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示属性
     */
    @JsonIgnore
    public void resetTipsPSDEFId(){
        this.reset(FIELD_TIPSPSDEFID);
    }

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFID}
     * <P>
     * 等同 {@link #setTipsPSDEFId}
     * @param tipsPSDEFId
     */
    @JsonIgnore
    public PSDETreeNode tipspsdefid(String tipsPSDEFId){
        this.setTipsPSDEFId(tipsPSDEFId);
        return this;
    }

    /**
     * 设置 提示属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDETreeNode tipspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTipsPSDEFId(null);
            this.setTipsPSDEFName(null);
        }
        else{
            this.setTipsPSDEFId(pSDEField.getPSDEFieldId());
            this.setTipsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TIPSPSDEFNAME</B>&nbsp;提示属性，指定动态树节点提示信息的取值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPSPSDEFID}
     */
    public final static String FIELD_TIPSPSDEFNAME = "tipspsdefname";

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFNAME}
     * 
     * @param tipsPSDEFName
     * 
     */
    @JsonProperty(FIELD_TIPSPSDEFNAME)
    public void setTipsPSDEFName(String tipsPSDEFName){
        this.set(FIELD_TIPSPSDEFNAME, tipsPSDEFName);
    }
    
    /**
     * 获取 提示属性  
     * @return
     */
    @JsonIgnore
    public String getTipsPSDEFName(){
        Object objValue = this.get(FIELD_TIPSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipsPSDEFNameDirty(){
        if(this.contains(FIELD_TIPSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示属性
     */
    @JsonIgnore
    public void resetTipsPSDEFName(){
        this.reset(FIELD_TIPSPSDEFNAME);
    }

    /**
     * 设置 提示属性，详细说明：{@link #FIELD_TIPSPSDEFNAME}
     * <P>
     * 等同 {@link #setTipsPSDEFName}
     * @param tipsPSDEFName
     */
    @JsonIgnore
    public PSDETreeNode tipspsdefname(String tipsPSDEFName){
        this.setTipsPSDEFName(tipsPSDEFName);
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
    public PSDETreeNode tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    /**
     * <B>TREENODETYPE</B>&nbsp;树节点类型，指定树节点的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeType} 
     */
    public final static String FIELD_TREENODETYPE = "treenodetype";

    /**
     * 设置 树节点类型，详细说明：{@link #FIELD_TREENODETYPE}
     * 
     * @param treeNodeType
     * 
     */
    @JsonProperty(FIELD_TREENODETYPE)
    public void setTreeNodeType(String treeNodeType){
        this.set(FIELD_TREENODETYPE, treeNodeType);
    }
    
    /**
     * 获取 树节点类型  
     * @return
     */
    @JsonIgnore
    public String getTreeNodeType(){
        Object objValue = this.get(FIELD_TREENODETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTreeNodeTypeDirty(){
        if(this.contains(FIELD_TREENODETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点类型
     */
    @JsonIgnore
    public void resetTreeNodeType(){
        this.reset(FIELD_TREENODETYPE);
    }

    /**
     * 设置 树节点类型，详细说明：{@link #FIELD_TREENODETYPE}
     * <P>
     * 等同 {@link #setTreeNodeType}
     * @param treeNodeType
     */
    @JsonIgnore
    public PSDETreeNode treenodetype(String treeNodeType){
        this.setTreeNodeType(treeNodeType);
        return this;
    }

     /**
     * 设置 树节点类型，详细说明：{@link #FIELD_TREENODETYPE}
     * <P>
     * 等同 {@link #setTreeNodeType}
     * @param treeNodeType
     */
    @JsonIgnore
    public PSDETreeNode treenodetype(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeType treeNodeType){
        if(treeNodeType == null){
            this.setTreeNodeType(null);
        }
        else{
            this.setTreeNodeType(treeNodeType.value);
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
    public PSDETreeNode updatedate(String updateDate){
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
    public PSDETreeNode updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONID</B>&nbsp;更新实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";

    /**
     * 设置 更新实体行为
     * 
     * @param updatePSDEActionId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONID)
    public void setUpdatePSDEActionId(String updatePSDEActionId){
        this.set(FIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }
    
    /**
     * 获取 更新实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionId(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionId(){
        this.reset(FIELD_UPDATEPSDEACTIONID);
    }

    /**
     * 设置 更新实体行为
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param updatePSDEActionId
     */
    @JsonIgnore
    public PSDETreeNode updatepsdeactionid(String updatePSDEActionId){
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    /**
     * 设置 更新实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDETreeNode updatepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUpdatePSDEActionId(null);
            this.setUpdatePSDEActionName(null);
        }
        else{
            this.setUpdatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setUpdatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONNAME</B>&nbsp;更新实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEACTIONID}
     */
    public final static String FIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";

    /**
     * 设置 更新实体行为
     * 
     * @param updatePSDEActionName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONNAME)
    public void setUpdatePSDEActionName(String updatePSDEActionName){
        this.set(FIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }
    
    /**
     * 获取 更新实体行为  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEActionName(){
        Object objValue = this.get(FIELD_UPDATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEActionNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionName(){
        this.reset(FIELD_UPDATEPSDEACTIONNAME);
    }

    /**
     * 设置 更新实体行为
     * <P>
     * 等同 {@link #setUpdatePSDEActionName}
     * @param updatePSDEActionName
     */
    @JsonIgnore
    public PSDETreeNode updatepsdeactionname(String updatePSDEActionName){
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVID</B>&nbsp;更新实体操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_UPDATEPSDEOPPRIVID = "updatepsdeopprivid";

    /**
     * 设置 更新实体操作标识
     * 
     * @param updatePSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEOPPRIVID)
    public void setUpdatePSDEOPPrivId(String updatePSDEOPPrivId){
        this.set(FIELD_UPDATEPSDEOPPRIVID, updatePSDEOPPrivId);
    }
    
    /**
     * 获取 更新实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEOPPrivId(){
        Object objValue = this.get(FIELD_UPDATEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_UPDATEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体操作标识
     */
    @JsonIgnore
    public void resetUpdatePSDEOPPrivId(){
        this.reset(FIELD_UPDATEPSDEOPPRIVID);
    }

    /**
     * 设置 更新实体操作标识
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivId}
     * @param updatePSDEOPPrivId
     */
    @JsonIgnore
    public PSDETreeNode updatepsdeopprivid(String updatePSDEOPPrivId){
        this.setUpdatePSDEOPPrivId(updatePSDEOPPrivId);
        return this;
    }

    /**
     * 设置 更新实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDETreeNode updatepsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setUpdatePSDEOPPrivId(null);
            this.setUpdatePSDEOPPrivName(null);
        }
        else{
            this.setUpdatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setUpdatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>UPDATEPSDEOPPRIVNAME</B>&nbsp;更新实体操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEOPPRIVID}
     */
    public final static String FIELD_UPDATEPSDEOPPRIVNAME = "updatepsdeopprivname";

    /**
     * 设置 更新实体操作标识
     * 
     * @param updatePSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEOPPRIVNAME)
    public void setUpdatePSDEOPPrivName(String updatePSDEOPPrivName){
        this.set(FIELD_UPDATEPSDEOPPRIVNAME, updatePSDEOPPrivName);
    }
    
    /**
     * 获取 更新实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getUpdatePSDEOPPrivName(){
        Object objValue = this.get(FIELD_UPDATEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_UPDATEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新实体操作标识
     */
    @JsonIgnore
    public void resetUpdatePSDEOPPrivName(){
        this.reset(FIELD_UPDATEPSDEOPPRIVNAME);
    }

    /**
     * 设置 更新实体操作标识
     * <P>
     * 等同 {@link #setUpdatePSDEOPPrivName}
     * @param updatePSDEOPPrivName
     */
    @JsonIgnore
    public PSDETreeNode updatepsdeopprivname(String updatePSDEOPPrivName){
        this.setUpdatePSDEOPPrivName(updatePSDEOPPrivName);
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
    public PSDETreeNode usercat(String userCat){
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
    public PSDETreeNode usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDETreeNode usertag(String userTag){
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
    public PSDETreeNode usertag2(String userTag2){
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
    public PSDETreeNode usertag3(String userTag3){
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
    public PSDETreeNode usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWACTIONS</B>&nbsp;支持操作，树节点启用操作控制时，指定树节点支持的操作集合
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlUIAction} 
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
    public PSDETreeNode viewactions(Integer viewActions){
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
    public PSDETreeNode viewactions(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlUIAction[] viewActions){
        if(viewActions == null || viewActions.length == 0){
            this.setViewActions(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlUIAction _item : viewActions){
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDETreeNodeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETreeNodeId(strValue);
    }

    @JsonIgnore
    public PSDETreeNode id(String strValue){
        this.setPSDETreeNodeId(strValue);
        return this;
    }


    /**
     *  树表编辑项更新模式 成员集合
     */
    public final static String FIELD_PSDETEIUPDATES = "psdeteiupdates";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDETEIUpdate> psdeteiupdates;

    /**
     * 获取 树表编辑项更新模式 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETEIUPDATES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETEIUpdate> getPSDETEIUpdates(){
        return this.psdeteiupdates;
    }

    /**
     * 设置 树表编辑项更新模式 成员集合  
     * @param psdeteiupdates
     */
    @JsonProperty(FIELD_PSDETEIUPDATES)
    public void setPSDETEIUpdates(java.util.List<net.ibizsys.psmodel.core.domain.PSDETEIUpdate> psdeteiupdates){
        this.psdeteiupdates = psdeteiupdates;
    }

    /**
     * 获取 树表编辑项更新模式 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETEIUpdate> getPSDETEIUpdatesIf(){
        if(this.psdeteiupdates == null){
            this.psdeteiupdates = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDETEIUpdate>();          
        }
        return this.psdeteiupdates;
    }


    /**
     *  树节点数据项 成员集合
     */
    public final static String FIELD_PSDETREENODECOLS = "psdetreenodecols";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeCol> psdetreenodecols;

    /**
     * 获取 树节点数据项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETREENODECOLS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeCol> getPSDETreeNodeCols(){
        return this.psdetreenodecols;
    }

    /**
     * 设置 树节点数据项 成员集合  
     * @param psdetreenodecols
     */
    @JsonProperty(FIELD_PSDETREENODECOLS)
    public void setPSDETreeNodeCols(java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeCol> psdetreenodecols){
        this.psdetreenodecols = psdetreenodecols;
    }

    /**
     * 获取 树节点数据项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeCol> getPSDETreeNodeColsIf(){
        if(this.psdetreenodecols == null){
            this.psdetreenodecols = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDETreeNodeCol>();          
        }
        return this.psdetreenodecols;
    }


    /**
     *  树节点关联视图 成员集合
     */
    public final static String FIELD_PSDETREENODERVS = "psdetreenodervs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeRV> psdetreenodervs;

    /**
     * 获取 树节点关联视图 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETREENODERVS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeRV> getPSDETreeNodeRVs(){
        return this.psdetreenodervs;
    }

    /**
     * 设置 树节点关联视图 成员集合  
     * @param psdetreenodervs
     */
    @JsonProperty(FIELD_PSDETREENODERVS)
    public void setPSDETreeNodeRVs(java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeRV> psdetreenodervs){
        this.psdetreenodervs = psdetreenodervs;
    }

    /**
     * 获取 树节点关联视图 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDETreeNodeRV> getPSDETreeNodeRVsIf(){
        if(this.psdetreenodervs == null){
            this.psdetreenodervs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDETreeNodeRV>();          
        }
        return this.psdetreenodervs;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETreeNode){
            PSDETreeNode model = (PSDETreeNode)iPSModel;
            model.setPSDETEIUpdates(this.getPSDETEIUpdates());
            model.setPSDETreeNodeCols(this.getPSDETreeNodeCols());
            model.setPSDETreeNodeRVs(this.getPSDETreeNodeRVs());
        }
        super.copyTo(iPSModel);
    }
}
