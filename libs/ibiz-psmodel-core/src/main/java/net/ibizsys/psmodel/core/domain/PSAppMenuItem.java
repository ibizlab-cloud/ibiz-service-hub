package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPMENUITEM</B>应用菜单项 模型传输对象
 * <P>
 * 应用菜单项模型，支持菜单项、直接内容项等类型
 */
public class PSAppMenuItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppMenuItem(){
    }      

    /**
     * <B>ACTIONLEVEL</B>&nbsp;行为级别，指定菜单项的行为级别，未定义时为【一般操作】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UIActionLevel} 
     */
    public final static String FIELD_ACTIONLEVEL = "actionlevel";

    /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * 
     * @param actionLevel
     * 
     */
    @JsonProperty(FIELD_ACTIONLEVEL)
    public void setActionLevel(Integer actionLevel){
        this.set(FIELD_ACTIONLEVEL, actionLevel);
    }
    
    /**
     * 获取 行为级别  
     * @return
     */
    @JsonIgnore
    public Integer getActionLevel(){
        Object objValue = this.get(FIELD_ACTIONLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionLevelDirty(){
        if(this.contains(FIELD_ACTIONLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为级别
     */
    @JsonIgnore
    public void resetActionLevel(){
        this.reset(FIELD_ACTIONLEVEL);
    }

    /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSAppMenuItem actionlevel(Integer actionLevel){
        this.setActionLevel(actionLevel);
        return this;
    }

     /**
     * 设置 行为级别，详细说明：{@link #FIELD_ACTIONLEVEL}
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSAppMenuItem actionlevel(net.ibizsys.psmodel.core.util.PSModelEnums.UIActionLevel actionLevel){
        if(actionLevel == null){
            this.setActionLevel(null);
        }
        else{
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    /**
     * <B>AMITEMTYPE</B>&nbsp;项类型，指定应用菜单项的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppMenuItemType} 
     */
    public final static String FIELD_AMITEMTYPE = "amitemtype";

    /**
     * 设置 项类型，详细说明：{@link #FIELD_AMITEMTYPE}
     * 
     * @param aMItemType
     * 
     */
    @JsonProperty(FIELD_AMITEMTYPE)
    public void setAMItemType(String aMItemType){
        this.set(FIELD_AMITEMTYPE, aMItemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getAMItemType(){
        Object objValue = this.get(FIELD_AMITEMTYPE);
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
    public boolean isAMItemTypeDirty(){
        if(this.contains(FIELD_AMITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetAMItemType(){
        this.reset(FIELD_AMITEMTYPE);
    }

    /**
     * 设置 项类型，详细说明：{@link #FIELD_AMITEMTYPE}
     * <P>
     * 等同 {@link #setAMItemType}
     * @param aMItemType
     */
    @JsonIgnore
    public PSAppMenuItem amitemtype(String aMItemType){
        this.setAMItemType(aMItemType);
        return this;
    }

     /**
     * 设置 项类型，详细说明：{@link #FIELD_AMITEMTYPE}
     * <P>
     * 等同 {@link #setAMItemType}
     * @param aMItemType
     */
    @JsonIgnore
    public PSAppMenuItem amitemtype(net.ibizsys.psmodel.core.util.PSModelEnums.AppMenuItemType aMItemType){
        if(aMItemType == null){
            this.setAMItemType(null);
        }
        else{
            this.setAMItemType(aMItemType.value);
        }
        return this;
    }

    /**
     * <B>BL_POS</B>&nbsp;位置布局位置，菜单项父容器布局模式为【边缘布局】时指定项的位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BorderLayoutPos} 
     */
    public final static String FIELD_BL_POS = "bl_pos";

    /**
     * 设置 位置布局位置，详细说明：{@link #FIELD_BL_POS}
     * 
     * @param bL_Pos
     * 
     */
    @JsonProperty(FIELD_BL_POS)
    public void setBL_Pos(String bL_Pos){
        this.set(FIELD_BL_POS, bL_Pos);
    }
    
    /**
     * 获取 位置布局位置  
     * @return
     */
    @JsonIgnore
    public String getBL_Pos(){
        Object objValue = this.get(FIELD_BL_POS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 位置布局位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBL_PosDirty(){
        if(this.contains(FIELD_BL_POS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 位置布局位置
     */
    @JsonIgnore
    public void resetBL_Pos(){
        this.reset(FIELD_BL_POS);
    }

    /**
     * 设置 位置布局位置，详细说明：{@link #FIELD_BL_POS}
     * <P>
     * 等同 {@link #setBL_Pos}
     * @param bL_Pos
     */
    @JsonIgnore
    public PSAppMenuItem bl_pos(String bL_Pos){
        this.setBL_Pos(bL_Pos);
        return this;
    }

    /**
     * <B>BORDERSTYLE</B>&nbsp;边框样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_BORDERSTYLE = "borderstyle";

    /**
     * 设置 边框样式
     * 
     * @param borderStyle
     * 
     */
    @JsonProperty(FIELD_BORDERSTYLE)
    public void setBorderStyle(String borderStyle){
        this.set(FIELD_BORDERSTYLE, borderStyle);
    }
    
    /**
     * 获取 边框样式  
     * @return
     */
    @JsonIgnore
    public String getBorderStyle(){
        Object objValue = this.get(FIELD_BORDERSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 边框样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBorderStyleDirty(){
        if(this.contains(FIELD_BORDERSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 边框样式
     */
    @JsonIgnore
    public void resetBorderStyle(){
        this.reset(FIELD_BORDERSTYLE);
    }

    /**
     * 设置 边框样式
     * <P>
     * 等同 {@link #setBorderStyle}
     * @param borderStyle
     */
    @JsonIgnore
    public PSAppMenuItem borderstyle(String borderStyle){
        this.setBorderStyle(borderStyle);
        return this;
    }

    /**
     * <B>BTNACTIONTYPE</B>&nbsp;功能类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppMenuButtonActionType} 
     */
    public final static String FIELD_BTNACTIONTYPE = "btnactiontype";

    /**
     * 设置 功能类型
     * 
     * @param btnActionType
     * 
     */
    @JsonProperty(FIELD_BTNACTIONTYPE)
    public void setBtnActionType(String btnActionType){
        this.set(FIELD_BTNACTIONTYPE, btnActionType);
    }
    
    /**
     * 获取 功能类型  
     * @return
     */
    @JsonIgnore
    public String getBtnActionType(){
        Object objValue = this.get(FIELD_BTNACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBtnActionTypeDirty(){
        if(this.contains(FIELD_BTNACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能类型
     */
    @JsonIgnore
    public void resetBtnActionType(){
        this.reset(FIELD_BTNACTIONTYPE);
    }

    /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSAppMenuItem btnactiontype(String btnActionType){
        this.setBtnActionType(btnActionType);
        return this;
    }

     /**
     * 设置 功能类型
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSAppMenuItem btnactiontype(net.ibizsys.psmodel.core.util.PSModelEnums.AppMenuButtonActionType btnActionType){
        if(btnActionType == null){
            this.setBtnActionType(null);
        }
        else{
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定菜单项标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_CAPPSLANRESID = "cappslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * 
     * @param capPSLanResId
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESID)
    public void setCapPSLanResId(String capPSLanResId){
        this.set(FIELD_CAPPSLANRESID, capPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResId(){
        Object objValue = this.get(FIELD_CAPPSLANRESID);
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
    public boolean isCapPSLanResIdDirty(){
        if(this.contains(FIELD_CAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResId(){
        this.reset(FIELD_CAPPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param capPSLanResId
     */
    @JsonIgnore
    public PSAppMenuItem cappslanresid(String capPSLanResId){
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem cappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        }
        else{
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定菜单项标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CAPPSLANRESID}
     */
    public final static String FIELD_CAPPSLANRESNAME = "cappslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * 
     * @param capPSLanResName
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESNAME)
    public void setCapPSLanResName(String capPSLanResName){
        this.set(FIELD_CAPPSLANRESNAME, capPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResName(){
        Object objValue = this.get(FIELD_CAPPSLANRESNAME);
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
    public boolean isCapPSLanResNameDirty(){
        if(this.contains(FIELD_CAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResName(){
        this.reset(FIELD_CAPPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setCapPSLanResName}
     * @param capPSLanResName
     */
    @JsonIgnore
    public PSAppMenuItem cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定菜单项的标题
     * <P>
     * 字符串：最大长度 60
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
    public PSAppMenuItem caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>COL_LG</B>&nbsp;大型列宽，应用菜单项父容器布局模式为【栅格布局】时指定成员在大型界面的列占位数量，未定义时为【-1】
     */
    public final static String FIELD_COL_LG = "col_lg";

    /**
     * 设置 大型列宽，详细说明：{@link #FIELD_COL_LG}
     * 
     * @param col_LG
     * 
     */
    @JsonProperty(FIELD_COL_LG)
    public void setCol_LG(Integer col_LG){
        this.set(FIELD_COL_LG, col_LG);
    }
    
    /**
     * 获取 大型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCol_LG(){
        Object objValue = this.get(FIELD_COL_LG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 大型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_LGDirty(){
        if(this.contains(FIELD_COL_LG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大型列宽
     */
    @JsonIgnore
    public void resetCol_LG(){
        this.reset(FIELD_COL_LG);
    }

    /**
     * 设置 大型列宽，详细说明：{@link #FIELD_COL_LG}
     * <P>
     * 等同 {@link #setCol_LG}
     * @param col_LG
     */
    @JsonIgnore
    public PSAppMenuItem col_lg(Integer col_LG){
        this.setCol_LG(col_LG);
        return this;
    }

    /**
     * <B>COL_LG_OS</B>&nbsp;大型偏移，应用菜单项父容器布局模式为【栅格布局】时指定成员在大型界面的列偏移数量，未定义时为【-1】
     */
    public final static String FIELD_COL_LG_OS = "col_lg_os";

    /**
     * 设置 大型偏移，详细说明：{@link #FIELD_COL_LG_OS}
     * 
     * @param col_LG_OS
     * 
     */
    @JsonProperty(FIELD_COL_LG_OS)
    public void setCol_LG_OS(Integer col_LG_OS){
        this.set(FIELD_COL_LG_OS, col_LG_OS);
    }
    
    /**
     * 获取 大型偏移  
     * @return
     */
    @JsonIgnore
    public Integer getCol_LG_OS(){
        Object objValue = this.get(FIELD_COL_LG_OS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 大型偏移 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_LG_OSDirty(){
        if(this.contains(FIELD_COL_LG_OS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大型偏移
     */
    @JsonIgnore
    public void resetCol_LG_OS(){
        this.reset(FIELD_COL_LG_OS);
    }

    /**
     * 设置 大型偏移，详细说明：{@link #FIELD_COL_LG_OS}
     * <P>
     * 等同 {@link #setCol_LG_OS}
     * @param col_LG_OS
     */
    @JsonIgnore
    public PSAppMenuItem col_lg_os(Integer col_LG_OS){
        this.setCol_LG_OS(col_LG_OS);
        return this;
    }

    /**
     * <B>COL_MD</B>&nbsp;中型列宽，应用菜单项容器布局模式为【栅格布局】时指定成员在中型界面的列占位数量，未定义时为【-1】
     */
    public final static String FIELD_COL_MD = "col_md";

    /**
     * 设置 中型列宽，详细说明：{@link #FIELD_COL_MD}
     * 
     * @param col_MD
     * 
     */
    @JsonProperty(FIELD_COL_MD)
    public void setCol_MD(Integer col_MD){
        this.set(FIELD_COL_MD, col_MD);
    }
    
    /**
     * 获取 中型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCol_MD(){
        Object objValue = this.get(FIELD_COL_MD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 中型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_MDDirty(){
        if(this.contains(FIELD_COL_MD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中型列宽
     */
    @JsonIgnore
    public void resetCol_MD(){
        this.reset(FIELD_COL_MD);
    }

    /**
     * 设置 中型列宽，详细说明：{@link #FIELD_COL_MD}
     * <P>
     * 等同 {@link #setCol_MD}
     * @param col_MD
     */
    @JsonIgnore
    public PSAppMenuItem col_md(Integer col_MD){
        this.setCol_MD(col_MD);
        return this;
    }

    /**
     * <B>COL_MD_OS</B>&nbsp;中型偏移，应用菜单项父容器布局模式为【栅格布局】时指定成员在中型界面的列偏移数量，未定义时为【-1】
     */
    public final static String FIELD_COL_MD_OS = "col_md_os";

    /**
     * 设置 中型偏移，详细说明：{@link #FIELD_COL_MD_OS}
     * 
     * @param col_MD_OS
     * 
     */
    @JsonProperty(FIELD_COL_MD_OS)
    public void setCol_MD_OS(Integer col_MD_OS){
        this.set(FIELD_COL_MD_OS, col_MD_OS);
    }
    
    /**
     * 获取 中型偏移  
     * @return
     */
    @JsonIgnore
    public Integer getCol_MD_OS(){
        Object objValue = this.get(FIELD_COL_MD_OS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 中型偏移 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_MD_OSDirty(){
        if(this.contains(FIELD_COL_MD_OS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中型偏移
     */
    @JsonIgnore
    public void resetCol_MD_OS(){
        this.reset(FIELD_COL_MD_OS);
    }

    /**
     * 设置 中型偏移，详细说明：{@link #FIELD_COL_MD_OS}
     * <P>
     * 等同 {@link #setCol_MD_OS}
     * @param col_MD_OS
     */
    @JsonIgnore
    public PSAppMenuItem col_md_os(Integer col_MD_OS){
        this.setCol_MD_OS(col_MD_OS);
        return this;
    }

    /**
     * <B>COL_SM</B>&nbsp;小型列宽，应用菜单项父容器布局模式为【栅格布局】时指定成员在小型界面的列占位数量，未定义时为【-1】
     */
    public final static String FIELD_COL_SM = "col_sm";

    /**
     * 设置 小型列宽，详细说明：{@link #FIELD_COL_SM}
     * 
     * @param col_SM
     * 
     */
    @JsonProperty(FIELD_COL_SM)
    public void setCol_SM(Integer col_SM){
        this.set(FIELD_COL_SM, col_SM);
    }
    
    /**
     * 获取 小型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCol_SM(){
        Object objValue = this.get(FIELD_COL_SM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 小型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_SMDirty(){
        if(this.contains(FIELD_COL_SM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 小型列宽
     */
    @JsonIgnore
    public void resetCol_SM(){
        this.reset(FIELD_COL_SM);
    }

    /**
     * 设置 小型列宽，详细说明：{@link #FIELD_COL_SM}
     * <P>
     * 等同 {@link #setCol_SM}
     * @param col_SM
     */
    @JsonIgnore
    public PSAppMenuItem col_sm(Integer col_SM){
        this.setCol_SM(col_SM);
        return this;
    }

    /**
     * <B>COL_SM_OS</B>&nbsp;小型偏移，应用菜单项父容器布局模式为【栅格布局】时指定成员在小型界面的列偏移数量，未定义时为【-1】
     */
    public final static String FIELD_COL_SM_OS = "col_sm_os";

    /**
     * 设置 小型偏移，详细说明：{@link #FIELD_COL_SM_OS}
     * 
     * @param col_SM_OS
     * 
     */
    @JsonProperty(FIELD_COL_SM_OS)
    public void setCol_SM_OS(Integer col_SM_OS){
        this.set(FIELD_COL_SM_OS, col_SM_OS);
    }
    
    /**
     * 获取 小型偏移  
     * @return
     */
    @JsonIgnore
    public Integer getCol_SM_OS(){
        Object objValue = this.get(FIELD_COL_SM_OS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 小型偏移 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_SM_OSDirty(){
        if(this.contains(FIELD_COL_SM_OS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 小型偏移
     */
    @JsonIgnore
    public void resetCol_SM_OS(){
        this.reset(FIELD_COL_SM_OS);
    }

    /**
     * 设置 小型偏移，详细说明：{@link #FIELD_COL_SM_OS}
     * <P>
     * 等同 {@link #setCol_SM_OS}
     * @param col_SM_OS
     */
    @JsonIgnore
    public PSAppMenuItem col_sm_os(Integer col_SM_OS){
        this.setCol_SM_OS(col_SM_OS);
        return this;
    }

    /**
     * <B>COL_XS</B>&nbsp;超小列宽，应用菜单项父容器布局模式为【栅格布局】时指定成员在超小界面的列占位数量，未定义时为【-1】
     */
    public final static String FIELD_COL_XS = "col_xs";

    /**
     * 设置 超小列宽，详细说明：{@link #FIELD_COL_XS}
     * 
     * @param col_XS
     * 
     */
    @JsonProperty(FIELD_COL_XS)
    public void setCol_XS(Integer col_XS){
        this.set(FIELD_COL_XS, col_XS);
    }
    
    /**
     * 获取 超小列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCol_XS(){
        Object objValue = this.get(FIELD_COL_XS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 超小列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_XSDirty(){
        if(this.contains(FIELD_COL_XS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 超小列宽
     */
    @JsonIgnore
    public void resetCol_XS(){
        this.reset(FIELD_COL_XS);
    }

    /**
     * 设置 超小列宽，详细说明：{@link #FIELD_COL_XS}
     * <P>
     * 等同 {@link #setCol_XS}
     * @param col_XS
     */
    @JsonIgnore
    public PSAppMenuItem col_xs(Integer col_XS){
        this.setCol_XS(col_XS);
        return this;
    }

    /**
     * <B>COL_XS_OS</B>&nbsp;超小偏移，应用菜单项父容器布局模式为【栅格布局】时指定成员在超小界面的列偏移数量，未定义时为【-1】
     */
    public final static String FIELD_COL_XS_OS = "col_xs_os";

    /**
     * 设置 超小偏移，详细说明：{@link #FIELD_COL_XS_OS}
     * 
     * @param col_XS_OS
     * 
     */
    @JsonProperty(FIELD_COL_XS_OS)
    public void setCol_XS_OS(Integer col_XS_OS){
        this.set(FIELD_COL_XS_OS, col_XS_OS);
    }
    
    /**
     * 获取 超小偏移  
     * @return
     */
    @JsonIgnore
    public Integer getCol_XS_OS(){
        Object objValue = this.get(FIELD_COL_XS_OS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 超小偏移 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_XS_OSDirty(){
        if(this.contains(FIELD_COL_XS_OS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 超小偏移
     */
    @JsonIgnore
    public void resetCol_XS_OS(){
        this.reset(FIELD_COL_XS_OS);
    }

    /**
     * 设置 超小偏移，详细说明：{@link #FIELD_COL_XS_OS}
     * <P>
     * 等同 {@link #setCol_XS_OS}
     * @param col_XS_OS
     */
    @JsonIgnore
    public PSAppMenuItem col_xs_os(Integer col_XS_OS){
        this.setCol_XS_OS(col_XS_OS);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定应用菜单直接内容项的内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType} 
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSAppMenuItem contenttype(String contentType){
        this.setContentType(contentType);
        return this;
    }

     /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSAppMenuItem contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数项标识，指定菜单项的计数标识
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
    public PSAppMenuItem counterid(String counterId){
        this.setCounterId(counterId);
        return this;
    }

    /**
     * <B>COUNTERMODE</B>&nbsp;计数器模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode} 
     */
    public final static String FIELD_COUNTERMODE = "countermode";

    /**
     * 设置 计数器模式
     * 
     * @param counterMode
     * 
     */
    @JsonProperty(FIELD_COUNTERMODE)
    public void setCounterMode(Integer counterMode){
        this.set(FIELD_COUNTERMODE, counterMode);
    }
    
    /**
     * 获取 计数器模式  
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
     * 判断 计数器模式 是否指定值，包括空值
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
     * 重置 计数器模式
     */
    @JsonIgnore
    public void resetCounterMode(){
        this.reset(FIELD_COUNTERMODE);
    }

    /**
     * 设置 计数器模式
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSAppMenuItem countermode(Integer counterMode){
        this.setCounterMode(counterMode);
        return this;
    }

     /**
     * 设置 计数器模式
     * <P>
     * 等同 {@link #setCounterMode}
     * @param counterMode
     */
    @JsonIgnore
    public PSAppMenuItem countermode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode counterMode){
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
    public PSAppMenuItem createdate(String createDate){
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
    public PSAppMenuItem createman(String createMan){
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
    public PSAppMenuItem customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据，指定应用菜单项的数据
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 项数据，详细说明：{@link #FIELD_DATA}
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 项数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 项数据，详细说明：{@link #FIELD_DATA}
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSAppMenuItem data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DISABLECLOSE</B>&nbsp;禁止用户关闭，指定应用菜单项打开的视图是否禁止用户关闭，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DISABLECLOSE = "disableclose";

    /**
     * 设置 禁止用户关闭，详细说明：{@link #FIELD_DISABLECLOSE}
     * 
     * @param disableClose
     * 
     */
    @JsonProperty(FIELD_DISABLECLOSE)
    public void setDisableClose(Integer disableClose){
        this.set(FIELD_DISABLECLOSE, disableClose);
    }
    
    /**
     * 获取 禁止用户关闭  
     * @return
     */
    @JsonIgnore
    public Integer getDisableClose(){
        Object objValue = this.get(FIELD_DISABLECLOSE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 禁止用户关闭 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDisableCloseDirty(){
        if(this.contains(FIELD_DISABLECLOSE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁止用户关闭
     */
    @JsonIgnore
    public void resetDisableClose(){
        this.reset(FIELD_DISABLECLOSE);
    }

    /**
     * 设置 禁止用户关闭，详细说明：{@link #FIELD_DISABLECLOSE}
     * <P>
     * 等同 {@link #setDisableClose}
     * @param disableClose
     */
    @JsonIgnore
    public PSAppMenuItem disableclose(Integer disableClose){
        this.setDisableClose(disableClose);
        return this;
    }

     /**
     * 设置 禁止用户关闭，详细说明：{@link #FIELD_DISABLECLOSE}
     * <P>
     * 等同 {@link #setDisableClose}
     * @param disableClose
     */
    @JsonIgnore
    public PSAppMenuItem disableclose(Boolean disableClose){
        if(disableClose == null){
            this.setDisableClose(null);
        }
        else{
            this.setDisableClose(disableClose?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSAppMenuItem dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>ENABLEMODE</B>&nbsp;是否启用，指定应用菜单项是否启用，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMODE = "enablemode";

    /**
     * 设置 是否启用，详细说明：{@link #FIELD_ENABLEMODE}
     * 
     * @param enableMode
     * 
     */
    @JsonProperty(FIELD_ENABLEMODE)
    public void setEnableMode(Integer enableMode){
        this.set(FIELD_ENABLEMODE, enableMode);
    }
    
    /**
     * 获取 是否启用  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMode(){
        Object objValue = this.get(FIELD_ENABLEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否启用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableModeDirty(){
        if(this.contains(FIELD_ENABLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否启用
     */
    @JsonIgnore
    public void resetEnableMode(){
        this.reset(FIELD_ENABLEMODE);
    }

    /**
     * 设置 是否启用，详细说明：{@link #FIELD_ENABLEMODE}
     * <P>
     * 等同 {@link #setEnableMode}
     * @param enableMode
     */
    @JsonIgnore
    public PSAppMenuItem enablemode(Integer enableMode){
        this.setEnableMode(enableMode);
        return this;
    }

     /**
     * 设置 是否启用，详细说明：{@link #FIELD_ENABLEMODE}
     * <P>
     * 等同 {@link #setEnableMode}
     * @param enableMode
     */
    @JsonIgnore
    public PSAppMenuItem enablemode(Boolean enableMode){
        if(enableMode == null){
            this.setEnableMode(null);
        }
        else{
            this.setEnableMode(enableMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXPAND</B>&nbsp;默认展开，指定应用菜单项是否默认展开，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSAppMenuItem expand(Integer expand){
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
    public PSAppMenuItem expand(Boolean expand){
        if(expand == null){
            this.setExpand(null);
        }
        else{
            this.setExpand(expand?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FILLEROBJ</B>&nbsp;填充器对象，指定应用菜单项的动态填充器程序对象，需按模板约定实现相关接口
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_FILLEROBJ = "fillerobj";

    /**
     * 设置 填充器对象，详细说明：{@link #FIELD_FILLEROBJ}
     * 
     * @param fillerObj
     * 
     */
    @JsonProperty(FIELD_FILLEROBJ)
    public void setFillerObj(String fillerObj){
        this.set(FIELD_FILLEROBJ, fillerObj);
    }
    
    /**
     * 获取 填充器对象  
     * @return
     */
    @JsonIgnore
    public String getFillerObj(){
        Object objValue = this.get(FIELD_FILLEROBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 填充器对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFillerObjDirty(){
        if(this.contains(FIELD_FILLEROBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 填充器对象
     */
    @JsonIgnore
    public void resetFillerObj(){
        this.reset(FIELD_FILLEROBJ);
    }

    /**
     * 设置 填充器对象，详细说明：{@link #FIELD_FILLEROBJ}
     * <P>
     * 等同 {@link #setFillerObj}
     * @param fillerObj
     */
    @JsonIgnore
    public PSAppMenuItem fillerobj(String fillerObj){
        this.setFillerObj(fillerObj);
        return this;
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，应用菜单项容器布局模式为【Flex布局】时指定横轴对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign} 
     */
    public final static String FIELD_FLEXALIGN = "flexalign";

    /**
     * 设置 Flex横轴对齐，详细说明：{@link #FIELD_FLEXALIGN}
     * 
     * @param flexAlign
     * 
     */
    @JsonProperty(FIELD_FLEXALIGN)
    public void setFlexAlign(String flexAlign){
        this.set(FIELD_FLEXALIGN, flexAlign);
    }
    
    /**
     * 获取 Flex横轴对齐  
     * @return
     */
    @JsonIgnore
    public String getFlexAlign(){
        Object objValue = this.get(FIELD_FLEXALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Flex横轴对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexAlignDirty(){
        if(this.contains(FIELD_FLEXALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex横轴对齐
     */
    @JsonIgnore
    public void resetFlexAlign(){
        this.reset(FIELD_FLEXALIGN);
    }

    /**
     * 设置 Flex横轴对齐，详细说明：{@link #FIELD_FLEXALIGN}
     * <P>
     * 等同 {@link #setFlexAlign}
     * @param flexAlign
     */
    @JsonIgnore
    public PSAppMenuItem flexalign(String flexAlign){
        this.setFlexAlign(flexAlign);
        return this;
    }

     /**
     * 设置 Flex横轴对齐，详细说明：{@link #FIELD_FLEXALIGN}
     * <P>
     * 等同 {@link #setFlexAlign}
     * @param flexAlign
     */
    @JsonIgnore
    public PSAppMenuItem flexalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign flexAlign){
        if(flexAlign == null){
            this.setFlexAlign(null);
        }
        else{
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    /**
     * <B>FLEXBASIS</B>&nbsp;Flex伸缩基值
     */
    public final static String FIELD_FLEXBASIS = "flexbasis";

    /**
     * 设置 Flex伸缩基值
     * 
     * @param flexBasis
     * 
     */
    @JsonProperty(FIELD_FLEXBASIS)
    public void setFlexBasis(Integer flexBasis){
        this.set(FIELD_FLEXBASIS, flexBasis);
    }
    
    /**
     * 获取 Flex伸缩基值  
     * @return
     */
    @JsonIgnore
    public Integer getFlexBasis(){
        Object objValue = this.get(FIELD_FLEXBASIS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 Flex伸缩基值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexBasisDirty(){
        if(this.contains(FIELD_FLEXBASIS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex伸缩基值
     */
    @JsonIgnore
    public void resetFlexBasis(){
        this.reset(FIELD_FLEXBASIS);
    }

    /**
     * 设置 Flex伸缩基值
     * <P>
     * 等同 {@link #setFlexBasis}
     * @param flexBasis
     */
    @JsonIgnore
    public PSAppMenuItem flexbasis(Integer flexBasis){
        this.setFlexBasis(flexBasis);
        return this;
    }

    /**
     * <B>FLEXDIR</B>&nbsp;Flex布局方向，应用菜单项容器布局模式为【Flex布局】时指定布局方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir} 
     */
    public final static String FIELD_FLEXDIR = "flexdir";

    /**
     * 设置 Flex布局方向，详细说明：{@link #FIELD_FLEXDIR}
     * 
     * @param flexDir
     * 
     */
    @JsonProperty(FIELD_FLEXDIR)
    public void setFlexDir(String flexDir){
        this.set(FIELD_FLEXDIR, flexDir);
    }
    
    /**
     * 获取 Flex布局方向  
     * @return
     */
    @JsonIgnore
    public String getFlexDir(){
        Object objValue = this.get(FIELD_FLEXDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Flex布局方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexDirDirty(){
        if(this.contains(FIELD_FLEXDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex布局方向
     */
    @JsonIgnore
    public void resetFlexDir(){
        this.reset(FIELD_FLEXDIR);
    }

    /**
     * 设置 Flex布局方向，详细说明：{@link #FIELD_FLEXDIR}
     * <P>
     * 等同 {@link #setFlexDir}
     * @param flexDir
     */
    @JsonIgnore
    public PSAppMenuItem flexdir(String flexDir){
        this.setFlexDir(flexDir);
        return this;
    }

     /**
     * 设置 Flex布局方向，详细说明：{@link #FIELD_FLEXDIR}
     * <P>
     * 等同 {@link #setFlexDir}
     * @param flexDir
     */
    @JsonIgnore
    public PSAppMenuItem flexdir(net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir flexDir){
        if(flexDir == null){
            this.setFlexDir(null);
        }
        else{
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    /**
     * <B>FLEXGROW</B>&nbsp;Flex延展值，应用菜单项父容器布局模式为【Flex布局】时指定成员的延展值，未定义时为【-1】
     */
    public final static String FIELD_FLEXGROW = "flexgrow";

    /**
     * 设置 Flex延展值，详细说明：{@link #FIELD_FLEXGROW}
     * 
     * @param flexGrow
     * 
     */
    @JsonProperty(FIELD_FLEXGROW)
    public void setFlexGrow(Integer flexGrow){
        this.set(FIELD_FLEXGROW, flexGrow);
    }
    
    /**
     * 获取 Flex延展值  
     * @return
     */
    @JsonIgnore
    public Integer getFlexGrow(){
        Object objValue = this.get(FIELD_FLEXGROW);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 Flex延展值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexGrowDirty(){
        if(this.contains(FIELD_FLEXGROW)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex延展值
     */
    @JsonIgnore
    public void resetFlexGrow(){
        this.reset(FIELD_FLEXGROW);
    }

    /**
     * 设置 Flex延展值，详细说明：{@link #FIELD_FLEXGROW}
     * <P>
     * 等同 {@link #setFlexGrow}
     * @param flexGrow
     */
    @JsonIgnore
    public PSAppMenuItem flexgrow(Integer flexGrow){
        this.setFlexGrow(flexGrow);
        return this;
    }

    /**
     * <B>FLEXSHRINK</B>&nbsp;Flex伸缩
     */
    public final static String FIELD_FLEXSHRINK = "flexshrink";

    /**
     * 设置 Flex伸缩
     * 
     * @param flexShrink
     * 
     */
    @JsonProperty(FIELD_FLEXSHRINK)
    public void setFlexShrink(Integer flexShrink){
        this.set(FIELD_FLEXSHRINK, flexShrink);
    }
    
    /**
     * 获取 Flex伸缩  
     * @return
     */
    @JsonIgnore
    public Integer getFlexShrink(){
        Object objValue = this.get(FIELD_FLEXSHRINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 Flex伸缩 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexShrinkDirty(){
        if(this.contains(FIELD_FLEXSHRINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex伸缩
     */
    @JsonIgnore
    public void resetFlexShrink(){
        this.reset(FIELD_FLEXSHRINK);
    }

    /**
     * 设置 Flex伸缩
     * <P>
     * 等同 {@link #setFlexShrink}
     * @param flexShrink
     */
    @JsonIgnore
    public PSAppMenuItem flexshrink(Integer flexShrink){
        this.setFlexShrink(flexShrink);
        return this;
    }

    /**
     * <B>FLEXVALIGN</B>&nbsp;Flex纵轴对齐，应用菜单项容器布局模式为【Flex布局】时指定纵轴对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign} 
     */
    public final static String FIELD_FLEXVALIGN = "flexvalign";

    /**
     * 设置 Flex纵轴对齐，详细说明：{@link #FIELD_FLEXVALIGN}
     * 
     * @param flexVAlign
     * 
     */
    @JsonProperty(FIELD_FLEXVALIGN)
    public void setFlexVAlign(String flexVAlign){
        this.set(FIELD_FLEXVALIGN, flexVAlign);
    }
    
    /**
     * 获取 Flex纵轴对齐  
     * @return
     */
    @JsonIgnore
    public String getFlexVAlign(){
        Object objValue = this.get(FIELD_FLEXVALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Flex纵轴对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexVAlignDirty(){
        if(this.contains(FIELD_FLEXVALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex纵轴对齐
     */
    @JsonIgnore
    public void resetFlexVAlign(){
        this.reset(FIELD_FLEXVALIGN);
    }

    /**
     * 设置 Flex纵轴对齐，详细说明：{@link #FIELD_FLEXVALIGN}
     * <P>
     * 等同 {@link #setFlexVAlign}
     * @param flexVAlign
     */
    @JsonIgnore
    public PSAppMenuItem flexvalign(String flexVAlign){
        this.setFlexVAlign(flexVAlign);
        return this;
    }

     /**
     * 设置 Flex纵轴对齐，详细说明：{@link #FIELD_FLEXVALIGN}
     * <P>
     * 等同 {@link #setFlexVAlign}
     * @param flexVAlign
     */
    @JsonIgnore
    public PSAppMenuItem flexvalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign flexVAlign){
        if(flexVAlign == null){
            this.setFlexVAlign(null);
        }
        else{
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    /**
     * <B>HALIGNSELF</B>&nbsp;水平对齐（自身）
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign} 
     */
    public final static String FIELD_HALIGNSELF = "halignself";

    /**
     * 设置 水平对齐（自身）
     * 
     * @param hAlignSelf
     * 
     */
    @JsonProperty(FIELD_HALIGNSELF)
    public void setHAlignSelf(String hAlignSelf){
        this.set(FIELD_HALIGNSELF, hAlignSelf);
    }
    
    /**
     * 获取 水平对齐（自身）  
     * @return
     */
    @JsonIgnore
    public String getHAlignSelf(){
        Object objValue = this.get(FIELD_HALIGNSELF);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 水平对齐（自身） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHAlignSelfDirty(){
        if(this.contains(FIELD_HALIGNSELF)){
            return true;
        }
        return false;
    }

    /**
     * 重置 水平对齐（自身）
     */
    @JsonIgnore
    public void resetHAlignSelf(){
        this.reset(FIELD_HALIGNSELF);
    }

    /**
     * 设置 水平对齐（自身）
     * <P>
     * 等同 {@link #setHAlignSelf}
     * @param hAlignSelf
     */
    @JsonIgnore
    public PSAppMenuItem halignself(String hAlignSelf){
        this.setHAlignSelf(hAlignSelf);
        return this;
    }

     /**
     * 设置 水平对齐（自身）
     * <P>
     * 等同 {@link #setHAlignSelf}
     * @param hAlignSelf
     */
    @JsonIgnore
    public PSAppMenuItem halignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlignSelf){
        if(hAlignSelf == null){
            this.setHAlignSelf(null);
        }
        else{
            this.setHAlignSelf(hAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定应用菜单项的高度
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
     * @return
     */
    @JsonIgnore
    public Integer getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightDirty(){
        if(this.contains(FIELD_HEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSAppMenuItem height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>HIDDENITEM</B>&nbsp;隐藏项，指定应用菜单项是否为隐藏项，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDDENITEM = "hiddenitem";

    /**
     * 设置 隐藏项，详细说明：{@link #FIELD_HIDDENITEM}
     * 
     * @param hiddenItem
     * 
     */
    @JsonProperty(FIELD_HIDDENITEM)
    public void setHiddenItem(Integer hiddenItem){
        this.set(FIELD_HIDDENITEM, hiddenItem);
    }
    
    /**
     * 获取 隐藏项  
     * @return
     */
    @JsonIgnore
    public Integer getHiddenItem(){
        Object objValue = this.get(FIELD_HIDDENITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 隐藏项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHiddenItemDirty(){
        if(this.contains(FIELD_HIDDENITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 隐藏项
     */
    @JsonIgnore
    public void resetHiddenItem(){
        this.reset(FIELD_HIDDENITEM);
    }

    /**
     * 设置 隐藏项，详细说明：{@link #FIELD_HIDDENITEM}
     * <P>
     * 等同 {@link #setHiddenItem}
     * @param hiddenItem
     */
    @JsonIgnore
    public PSAppMenuItem hiddenitem(Integer hiddenItem){
        this.setHiddenItem(hiddenItem);
        return this;
    }

     /**
     * 设置 隐藏项，详细说明：{@link #FIELD_HIDDENITEM}
     * <P>
     * 等同 {@link #setHiddenItem}
     * @param hiddenItem
     */
    @JsonIgnore
    public PSAppMenuItem hiddenitem(Boolean hiddenItem){
        if(hiddenItem == null){
            this.setHiddenItem(null);
        }
        else{
            this.setHiddenItem(hiddenItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HIDESIDEBAR</B>&nbsp;执行后关闭边栏，指定应用菜单项是否执行后关闭边栏，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDESIDEBAR = "hidesidebar";

    /**
     * 设置 执行后关闭边栏，详细说明：{@link #FIELD_HIDESIDEBAR}
     * 
     * @param hIdeSideBar
     * 
     */
    @JsonProperty(FIELD_HIDESIDEBAR)
    public void setHIdeSideBar(Integer hIdeSideBar){
        this.set(FIELD_HIDESIDEBAR, hIdeSideBar);
    }
    
    /**
     * 获取 执行后关闭边栏  
     * @return
     */
    @JsonIgnore
    public Integer getHIdeSideBar(){
        Object objValue = this.get(FIELD_HIDESIDEBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 执行后关闭边栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHIdeSideBarDirty(){
        if(this.contains(FIELD_HIDESIDEBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 执行后关闭边栏
     */
    @JsonIgnore
    public void resetHIdeSideBar(){
        this.reset(FIELD_HIDESIDEBAR);
    }

    /**
     * 设置 执行后关闭边栏，详细说明：{@link #FIELD_HIDESIDEBAR}
     * <P>
     * 等同 {@link #setHIdeSideBar}
     * @param hIdeSideBar
     */
    @JsonIgnore
    public PSAppMenuItem hidesidebar(Integer hIdeSideBar){
        this.setHIdeSideBar(hIdeSideBar);
        return this;
    }

     /**
     * 设置 执行后关闭边栏，详细说明：{@link #FIELD_HIDESIDEBAR}
     * <P>
     * 等同 {@link #setHIdeSideBar}
     * @param hIdeSideBar
     */
    @JsonIgnore
    public PSAppMenuItem hidesidebar(Boolean hIdeSideBar){
        if(hIdeSideBar == null){
            this.setHIdeSideBar(null);
        }
        else{
            this.setHIdeSideBar(hIdeSideBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HTMLCONTENT</B>&nbsp;HTML内容，直接内容项内容类型为【Html内容】时指定Html内容，未指定时使用指定的系统资源定义内容
     */
    public final static String FIELD_HTMLCONTENT = "htmlcontent";

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_HTMLCONTENT}
     * 
     * @param htmlContent
     * 
     */
    @JsonProperty(FIELD_HTMLCONTENT)
    public void setHtmlContent(String htmlContent){
        this.set(FIELD_HTMLCONTENT, htmlContent);
    }
    
    /**
     * 获取 HTML内容  
     * @return
     */
    @JsonIgnore
    public String getHtmlContent(){
        Object objValue = this.get(FIELD_HTMLCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 HTML内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlContentDirty(){
        if(this.contains(FIELD_HTMLCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTML内容
     */
    @JsonIgnore
    public void resetHtmlContent(){
        this.reset(FIELD_HTMLCONTENT);
    }

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_HTMLCONTENT}
     * <P>
     * 等同 {@link #setHtmlContent}
     * @param htmlContent
     */
    @JsonIgnore
    public PSAppMenuItem htmlcontent(String htmlContent){
        this.setHtmlContent(htmlContent);
        return this;
    }

    /**
     * <B>HTMLPAGEURL</B>&nbsp;HTML页面地址
     * <P>
     * 字符串：最大长度 300
     */
    public final static String FIELD_HTMLPAGEURL = "htmlpageurl";

    /**
     * 设置 HTML页面地址
     * 
     * @param htmlPageUrl
     * 
     */
    @JsonProperty(FIELD_HTMLPAGEURL)
    public void setHtmlPageUrl(String htmlPageUrl){
        this.set(FIELD_HTMLPAGEURL, htmlPageUrl);
    }
    
    /**
     * 获取 HTML页面地址  
     * @return
     */
    @JsonIgnore
    public String getHtmlPageUrl(){
        Object objValue = this.get(FIELD_HTMLPAGEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 HTML页面地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlPageUrlDirty(){
        if(this.contains(FIELD_HTMLPAGEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTML页面地址
     */
    @JsonIgnore
    public void resetHtmlPageUrl(){
        this.reset(FIELD_HTMLPAGEURL);
    }

    /**
     * 设置 HTML页面地址
     * <P>
     * 等同 {@link #setHtmlPageUrl}
     * @param htmlPageUrl
     */
    @JsonIgnore
    public PSAppMenuItem htmlpageurl(String htmlPageUrl){
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    /**
     * <B>INFORMTAG</B>&nbsp;通知标识，指定应用菜单项的通知标记
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_INFORMTAG = "informtag";

    /**
     * 设置 通知标识，详细说明：{@link #FIELD_INFORMTAG}
     * 
     * @param informTag
     * 
     */
    @JsonProperty(FIELD_INFORMTAG)
    public void setInformTag(String informTag){
        this.set(FIELD_INFORMTAG, informTag);
    }
    
    /**
     * 获取 通知标识  
     * @return
     */
    @JsonIgnore
    public String getInformTag(){
        Object objValue = this.get(FIELD_INFORMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 通知标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInformTagDirty(){
        if(this.contains(FIELD_INFORMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 通知标识
     */
    @JsonIgnore
    public void resetInformTag(){
        this.reset(FIELD_INFORMTAG);
    }

    /**
     * 设置 通知标识，详细说明：{@link #FIELD_INFORMTAG}
     * <P>
     * 等同 {@link #setInformTag}
     * @param informTag
     */
    @JsonIgnore
    public PSAppMenuItem informtag(String informTag){
        this.setInformTag(informTag);
        return this;
    }

    /**
     * <B>INFORMTAG2</B>&nbsp;通知标识2，指定应用菜单项的通知标记2
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_INFORMTAG2 = "informtag2";

    /**
     * 设置 通知标识2，详细说明：{@link #FIELD_INFORMTAG2}
     * 
     * @param informTag2
     * 
     */
    @JsonProperty(FIELD_INFORMTAG2)
    public void setInformTag2(String informTag2){
        this.set(FIELD_INFORMTAG2, informTag2);
    }
    
    /**
     * 获取 通知标识2  
     * @return
     */
    @JsonIgnore
    public String getInformTag2(){
        Object objValue = this.get(FIELD_INFORMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 通知标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInformTag2Dirty(){
        if(this.contains(FIELD_INFORMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 通知标识2
     */
    @JsonIgnore
    public void resetInformTag2(){
        this.reset(FIELD_INFORMTAG2);
    }

    /**
     * 设置 通知标识2，详细说明：{@link #FIELD_INFORMTAG2}
     * <P>
     * 等同 {@link #setInformTag2}
     * @param informTag2
     */
    @JsonIgnore
    public PSAppMenuItem informtag2(String informTag2){
        this.setInformTag2(informTag2);
        return this;
    }

    /**
     * <B>ITEMSTYLE</B>&nbsp;项样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_ITEMSTYLE = "itemstyle";

    /**
     * 设置 项样式
     * 
     * @param itemStyle
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLE)
    public void setItemStyle(String itemStyle){
        this.set(FIELD_ITEMSTYLE, itemStyle);
    }
    
    /**
     * 获取 项样式  
     * @return
     */
    @JsonIgnore
    public String getItemStyle(){
        Object objValue = this.get(FIELD_ITEMSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStyleDirty(){
        if(this.contains(FIELD_ITEMSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项样式
     */
    @JsonIgnore
    public void resetItemStyle(){
        this.reset(FIELD_ITEMSTYLE);
    }

    /**
     * 设置 项样式
     * <P>
     * 等同 {@link #setItemStyle}
     * @param itemStyle
     */
    @JsonIgnore
    public PSAppMenuItem itemstyle(String itemStyle){
        this.setItemStyle(itemStyle);
        return this;
    }

    /**
     * <B>ITEMSTYLETEXT</B>&nbsp;项样式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_ITEMSTYLETEXT = "itemstyletext";

    /**
     * 设置 项样式
     * 
     * @param itemStyleText
     * 
     */
    @JsonProperty(FIELD_ITEMSTYLETEXT)
    public void setItemStyleText(String itemStyleText){
        this.set(FIELD_ITEMSTYLETEXT, itemStyleText);
    }
    
    /**
     * 获取 项样式  
     * @return
     */
    @JsonIgnore
    public String getItemStyleText(){
        Object objValue = this.get(FIELD_ITEMSTYLETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStyleTextDirty(){
        if(this.contains(FIELD_ITEMSTYLETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项样式
     */
    @JsonIgnore
    public void resetItemStyleText(){
        this.reset(FIELD_ITEMSTYLETEXT);
    }

    /**
     * 设置 项样式
     * <P>
     * 等同 {@link #setItemStyleText}
     * @param itemStyleText
     */
    @JsonIgnore
    public PSAppMenuItem itemstyletext(String itemStyleText){
        this.setItemStyleText(itemStyleText);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定应用菜单项的布局容器模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode} 
     */
    public final static String FIELD_LAYOUTMODE = "layoutmode";

    /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * 
     * @param layoutMode
     * 
     */
    @JsonProperty(FIELD_LAYOUTMODE)
    public void setLayoutMode(String layoutMode){
        this.set(FIELD_LAYOUTMODE, layoutMode);
    }
    
    /**
     * 获取 布局模式  
     * @return
     */
    @JsonIgnore
    public String getLayoutMode(){
        Object objValue = this.get(FIELD_LAYOUTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutModeDirty(){
        if(this.contains(FIELD_LAYOUTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局模式
     */
    @JsonIgnore
    public void resetLayoutMode(){
        this.reset(FIELD_LAYOUTMODE);
    }

    /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * <P>
     * 等同 {@link #setLayoutMode}
     * @param layoutMode
     */
    @JsonIgnore
    public PSAppMenuItem layoutmode(String layoutMode){
        this.setLayoutMode(layoutMode);
        return this;
    }

     /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * <P>
     * 等同 {@link #setLayoutMode}
     * @param layoutMode
     */
    @JsonIgnore
    public PSAppMenuItem layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
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
    public PSAppMenuItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MENUITEMSTATE</B>&nbsp;菜单项状态，指定应用菜单项的状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MenuItemState} 
     */
    public final static String FIELD_MENUITEMSTATE = "menuitemstate";

    /**
     * 设置 菜单项状态，详细说明：{@link #FIELD_MENUITEMSTATE}
     * 
     * @param menuItemState
     * 
     */
    @JsonProperty(FIELD_MENUITEMSTATE)
    public void setMenuItemState(Integer menuItemState){
        this.set(FIELD_MENUITEMSTATE, menuItemState);
    }
    
    /**
     * 获取 菜单项状态  
     * @return
     */
    @JsonIgnore
    public Integer getMenuItemState(){
        Object objValue = this.get(FIELD_MENUITEMSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 菜单项状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMenuItemStateDirty(){
        if(this.contains(FIELD_MENUITEMSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单项状态
     */
    @JsonIgnore
    public void resetMenuItemState(){
        this.reset(FIELD_MENUITEMSTATE);
    }

    /**
     * 设置 菜单项状态，详细说明：{@link #FIELD_MENUITEMSTATE}
     * <P>
     * 等同 {@link #setMenuItemState}
     * @param menuItemState
     */
    @JsonIgnore
    public PSAppMenuItem menuitemstate(Integer menuItemState){
        this.setMenuItemState(menuItemState);
        return this;
    }

     /**
     * 设置 菜单项状态，详细说明：{@link #FIELD_MENUITEMSTATE}
     * <P>
     * 等同 {@link #setMenuItemState}
     * @param menuItemState
     */
    @JsonIgnore
    public PSAppMenuItem menuitemstate(net.ibizsys.psmodel.core.util.PSModelEnums.MenuItemState[] menuItemState){
        if(menuItemState == null || menuItemState.length == 0){
            this.setMenuItemState(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.MenuItemState _item : menuItemState){
                _value |= _item.value;
            }
            this.setMenuItemState(_value);
        }
        return this;
    }

    /**
     * <B>OPENDEFAULT</B>&nbsp;默认打开，指定应用菜单项是否默认打开，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_OPENDEFAULT = "opendefault";

    /**
     * 设置 默认打开，详细说明：{@link #FIELD_OPENDEFAULT}
     * 
     * @param openDefault
     * 
     */
    @JsonProperty(FIELD_OPENDEFAULT)
    public void setOpenDefault(Integer openDefault){
        this.set(FIELD_OPENDEFAULT, openDefault);
    }
    
    /**
     * 获取 默认打开  
     * @return
     */
    @JsonIgnore
    public Integer getOpenDefault(){
        Object objValue = this.get(FIELD_OPENDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认打开 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenDefaultDirty(){
        if(this.contains(FIELD_OPENDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认打开
     */
    @JsonIgnore
    public void resetOpenDefault(){
        this.reset(FIELD_OPENDEFAULT);
    }

    /**
     * 设置 默认打开，详细说明：{@link #FIELD_OPENDEFAULT}
     * <P>
     * 等同 {@link #setOpenDefault}
     * @param openDefault
     */
    @JsonIgnore
    public PSAppMenuItem opendefault(Integer openDefault){
        this.setOpenDefault(openDefault);
        return this;
    }

     /**
     * 设置 默认打开，详细说明：{@link #FIELD_OPENDEFAULT}
     * <P>
     * 等同 {@link #setOpenDefault}
     * @param openDefault
     */
    @JsonIgnore
    public PSAppMenuItem opendefault(Boolean openDefault){
        if(openDefault == null){
            this.setOpenDefault(null);
        }
        else{
            this.setOpenDefault(openDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>OPENPSAPPVIEWID</B>&nbsp;打开应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_OPENPSAPPVIEWID = "openpsappviewid";

    /**
     * 设置 打开应用视图
     * 
     * @param openPSAppViewId
     * 
     */
    @JsonProperty(FIELD_OPENPSAPPVIEWID)
    public void setOpenPSAppViewId(String openPSAppViewId){
        this.set(FIELD_OPENPSAPPVIEWID, openPSAppViewId);
    }
    
    /**
     * 获取 打开应用视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSAppViewId(){
        Object objValue = this.get(FIELD_OPENPSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSAppViewIdDirty(){
        if(this.contains(FIELD_OPENPSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开应用视图
     */
    @JsonIgnore
    public void resetOpenPSAppViewId(){
        this.reset(FIELD_OPENPSAPPVIEWID);
    }

    /**
     * 设置 打开应用视图
     * <P>
     * 等同 {@link #setOpenPSAppViewId}
     * @param openPSAppViewId
     */
    @JsonIgnore
    public PSAppMenuItem openpsappviewid(String openPSAppViewId){
        this.setOpenPSAppViewId(openPSAppViewId);
        return this;
    }

    /**
     * 设置 打开应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOpenPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem openpsappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setOpenPSAppViewId(null);
            this.setOpenPSAppViewName(null);
        }
        else{
            this.setOpenPSAppViewId(pSAppView.getPSAppViewId());
            this.setOpenPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>OPENPSAPPVIEWNAME</B>&nbsp;打开应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OPENPSAPPVIEWID}
     */
    public final static String FIELD_OPENPSAPPVIEWNAME = "openpsappviewname";

    /**
     * 设置 打开应用视图
     * 
     * @param openPSAppViewName
     * 
     */
    @JsonProperty(FIELD_OPENPSAPPVIEWNAME)
    public void setOpenPSAppViewName(String openPSAppViewName){
        this.set(FIELD_OPENPSAPPVIEWNAME, openPSAppViewName);
    }
    
    /**
     * 获取 打开应用视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSAppViewName(){
        Object objValue = this.get(FIELD_OPENPSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSAppViewNameDirty(){
        if(this.contains(FIELD_OPENPSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开应用视图
     */
    @JsonIgnore
    public void resetOpenPSAppViewName(){
        this.reset(FIELD_OPENPSAPPVIEWNAME);
    }

    /**
     * 设置 打开应用视图
     * <P>
     * 等同 {@link #setOpenPSAppViewName}
     * @param openPSAppViewName
     */
    @JsonIgnore
    public PSAppMenuItem openpsappviewname(String openPSAppViewName){
        this.setOpenPSAppViewName(openPSAppViewName);
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
    public PSAppMenuItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSAPPMENUITEMID</B>&nbsp;父菜单项，指定应用菜单项的父项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppMenuItem} 
     */
    public final static String FIELD_PPSAPPMENUITEMID = "ppsappmenuitemid";

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSAPPMENUITEMID}
     * 
     * @param pPSAppMenuItemId
     * 
     */
    @JsonProperty(FIELD_PPSAPPMENUITEMID)
    public void setPPSAppMenuItemId(String pPSAppMenuItemId){
        this.set(FIELD_PPSAPPMENUITEMID, pPSAppMenuItemId);
    }
    
    /**
     * 获取 父菜单项  
     * @return
     */
    @JsonIgnore
    public String getPPSAppMenuItemId(){
        Object objValue = this.get(FIELD_PPSAPPMENUITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父菜单项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppMenuItemIdDirty(){
        if(this.contains(FIELD_PPSAPPMENUITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父菜单项
     */
    @JsonIgnore
    public void resetPPSAppMenuItemId(){
        this.reset(FIELD_PPSAPPMENUITEMID);
    }

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSAPPMENUITEMID}
     * <P>
     * 等同 {@link #setPPSAppMenuItemId}
     * @param pPSAppMenuItemId
     */
    @JsonIgnore
    public PSAppMenuItem ppsappmenuitemid(String pPSAppMenuItemId){
        this.setPPSAppMenuItemId(pPSAppMenuItemId);
        return this;
    }

    /**
     * 设置 父菜单项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSAppMenuItemId}
     * @param pSAppMenuItem 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem ppsappmenuitemid(PSAppMenuItem pSAppMenuItem){
        if(pSAppMenuItem == null){
            this.setPPSAppMenuItemId(null);
            this.setPPSAppMenuItemName(null);
        }
        else{
            this.setPPSAppMenuItemId(pSAppMenuItem.getPSAppMenuItemId());
            this.setPPSAppMenuItemName(pSAppMenuItem.getPSAppMenuItemName());
        }
        return this;
    }

    /**
     * <B>PPSAPPMENUITEMNAME</B>&nbsp;父菜单项，指定应用菜单项的父项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSAPPMENUITEMID}
     */
    public final static String FIELD_PPSAPPMENUITEMNAME = "ppsappmenuitemname";

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSAPPMENUITEMNAME}
     * 
     * @param pPSAppMenuItemName
     * 
     */
    @JsonProperty(FIELD_PPSAPPMENUITEMNAME)
    public void setPPSAppMenuItemName(String pPSAppMenuItemName){
        this.set(FIELD_PPSAPPMENUITEMNAME, pPSAppMenuItemName);
    }
    
    /**
     * 获取 父菜单项  
     * @return
     */
    @JsonIgnore
    public String getPPSAppMenuItemName(){
        Object objValue = this.get(FIELD_PPSAPPMENUITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父菜单项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppMenuItemNameDirty(){
        if(this.contains(FIELD_PPSAPPMENUITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父菜单项
     */
    @JsonIgnore
    public void resetPPSAppMenuItemName(){
        this.reset(FIELD_PPSAPPMENUITEMNAME);
    }

    /**
     * 设置 父菜单项，详细说明：{@link #FIELD_PPSAPPMENUITEMNAME}
     * <P>
     * 等同 {@link #setPPSAppMenuItemName}
     * @param pPSAppMenuItemName
     */
    @JsonIgnore
    public PSAppMenuItem ppsappmenuitemname(String pPSAppMenuItemName){
        this.setPPSAppMenuItemName(pPSAppMenuItemName);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSAppMenuItem predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPEPARAM</B>&nbsp;预定义类型参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";

    /**
     * 设置 预定义类型参数
     * 
     * @param predefinedTypeParam
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPEPARAM)
    public void setPredefinedTypeParam(String predefinedTypeParam){
        this.set(FIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }
    
    /**
     * 获取 预定义类型参数  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeParam(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeParamDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型参数
     */
    @JsonIgnore
    public void resetPredefinedTypeParam(){
        this.reset(FIELD_PREDEFINEDTYPEPARAM);
    }

    /**
     * 设置 预定义类型参数
     * <P>
     * 等同 {@link #setPredefinedTypeParam}
     * @param predefinedTypeParam
     */
    @JsonIgnore
    public PSAppMenuItem predefinedtypeparam(String predefinedTypeParam){
        this.setPredefinedTypeParam(predefinedTypeParam);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPETEXT</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedTypeText
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPETEXT)
    public void setPredefinedTypeText(String predefinedTypeText){
        this.set(FIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeText(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeTextDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedTypeText(){
        this.reset(FIELD_PREDEFINEDTYPETEXT);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedTypeText}
     * @param predefinedTypeText
     */
    @JsonIgnore
    public PSAppMenuItem predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSAPPFUNCID</B>&nbsp;应用功能，指定应用菜单项执行的应用功能
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppFunc} 
     */
    public final static String FIELD_PSAPPFUNCID = "psappfuncid";

    /**
     * 设置 应用功能，详细说明：{@link #FIELD_PSAPPFUNCID}
     * 
     * @param pSAppFuncId
     * 
     */
    @JsonProperty(FIELD_PSAPPFUNCID)
    public void setPSAppFuncId(String pSAppFuncId){
        this.set(FIELD_PSAPPFUNCID, pSAppFuncId);
    }
    
    /**
     * 获取 应用功能  
     * @return
     */
    @JsonIgnore
    public String getPSAppFuncId(){
        Object objValue = this.get(FIELD_PSAPPFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppFuncIdDirty(){
        if(this.contains(FIELD_PSAPPFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能
     */
    @JsonIgnore
    public void resetPSAppFuncId(){
        this.reset(FIELD_PSAPPFUNCID);
    }

    /**
     * 设置 应用功能，详细说明：{@link #FIELD_PSAPPFUNCID}
     * <P>
     * 等同 {@link #setPSAppFuncId}
     * @param pSAppFuncId
     */
    @JsonIgnore
    public PSAppMenuItem psappfuncid(String pSAppFuncId){
        this.setPSAppFuncId(pSAppFuncId);
        return this;
    }

    /**
     * 设置 应用功能，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppFuncId}
     * @param pSAppFunc 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem psappfuncid(PSAppFunc pSAppFunc){
        if(pSAppFunc == null){
            this.setPSAppFuncId(null);
            this.setPSAppFuncName(null);
        }
        else{
            this.setPSAppFuncId(pSAppFunc.getPSAppFuncId());
            this.setPSAppFuncName(pSAppFunc.getPSAppFuncName());
        }
        return this;
    }

    /**
     * <B>PSAPPFUNCNAME</B>&nbsp;应用功能，指定应用菜单项执行的应用功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPFUNCID}
     */
    public final static String FIELD_PSAPPFUNCNAME = "psappfuncname";

    /**
     * 设置 应用功能，详细说明：{@link #FIELD_PSAPPFUNCNAME}
     * 
     * @param pSAppFuncName
     * 
     */
    @JsonProperty(FIELD_PSAPPFUNCNAME)
    public void setPSAppFuncName(String pSAppFuncName){
        this.set(FIELD_PSAPPFUNCNAME, pSAppFuncName);
    }
    
    /**
     * 获取 应用功能  
     * @return
     */
    @JsonIgnore
    public String getPSAppFuncName(){
        Object objValue = this.get(FIELD_PSAPPFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppFuncNameDirty(){
        if(this.contains(FIELD_PSAPPFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能
     */
    @JsonIgnore
    public void resetPSAppFuncName(){
        this.reset(FIELD_PSAPPFUNCNAME);
    }

    /**
     * 设置 应用功能，详细说明：{@link #FIELD_PSAPPFUNCNAME}
     * <P>
     * 等同 {@link #setPSAppFuncName}
     * @param pSAppFuncName
     */
    @JsonIgnore
    public PSAppMenuItem psappfuncname(String pSAppFuncName){
        this.setPSAppFuncName(pSAppFuncName);
        return this;
    }

    /**
     * <B>PSAPPDATAENTITYID</B>&nbsp;应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppDataEntity} 
     */
    public final static String FIELD_PSAPPDATAENTITYID = "psappdataentityid";

    /**
     * 设置 应用实体
     * 
     * @param pSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYID)
    public void setPSAppDataEntityId(String pSAppDataEntityId){
        this.set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldeid", pSAppDataEntityId);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityId(){
        this.reset(FIELD_PSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldeid");
    }

    /**
     * 设置 应用实体
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntityId
     */
    @JsonIgnore
    public PSAppMenuItem psappdataentityid(String pSAppDataEntityId){
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    /**
     * 设置 应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem psappdataentityid(PSAppDataEntity pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
            this.setPSDEId(pSAppDataEntity.getPSDEId());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId(){
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEId(String pSAppLocalDEId){
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty(){
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId(){
        this.resetPSAppDataEntityId();
    }

    /**
     * <B>PSAPPDATAENTITYNAME</B>&nbsp;应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
     */
    public final static String FIELD_PSAPPDATAENTITYNAME = "psappdataentityname";

    /**
     * 设置 应用实体
     * 
     * @param pSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYNAME)
    public void setPSAppDataEntityName(String pSAppDataEntityName){
        this.set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldename", pSAppDataEntityName);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityName(){
        this.reset(FIELD_PSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldename");
    }

    /**
     * 设置 应用实体
     * <P>
     * 等同 {@link #setPSAppDataEntityName}
     * @param pSAppDataEntityName
     */
    @JsonIgnore
    public PSAppMenuItem psappdataentityname(String pSAppDataEntityName){
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName(){
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEName(String pSAppLocalDEName){
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty(){
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName(){
        this.resetPSAppDataEntityName();
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;应用菜单，指定应用菜单项所属的应用菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppMenu} 
     */
    public final static String FIELD_PSAPPMENUID = "psappmenuid";

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUID}
     * 
     * @param pSAppMenuId
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUID)
    public void setPSAppMenuId(String pSAppMenuId){
        this.set(FIELD_PSAPPMENUID, pSAppMenuId);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuId(){
        Object objValue = this.get(FIELD_PSAPPMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuIdDirty(){
        if(this.contains(FIELD_PSAPPMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuId(){
        this.reset(FIELD_PSAPPMENUID);
    }

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUID}
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenuId
     */
    @JsonIgnore
    public PSAppMenuItem psappmenuid(String pSAppMenuId){
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    /**
     * 设置 应用菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenu 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem psappmenuid(PSAppMenu pSAppMenu){
        if(pSAppMenu == null){
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
            this.setPSSysAppId(null);
        }
        else{
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
            this.setPSSysAppId(pSAppMenu.getPSSysAppId());
        }
        return this;
    }

    /**
     * <B>PSAPPMENUITEMID</B>&nbsp;云应用菜单项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPMENUITEMID = "psappmenuitemid";

    /**
     * 设置 云应用菜单项标识
     * 
     * @param pSAppMenuItemId
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUITEMID)
    public void setPSAppMenuItemId(String pSAppMenuItemId){
        this.set(FIELD_PSAPPMENUITEMID, pSAppMenuItemId);
    }
    
    /**
     * 获取 云应用菜单项标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuItemId(){
        Object objValue = this.get(FIELD_PSAPPMENUITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云应用菜单项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuItemIdDirty(){
        if(this.contains(FIELD_PSAPPMENUITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云应用菜单项标识
     */
    @JsonIgnore
    public void resetPSAppMenuItemId(){
        this.reset(FIELD_PSAPPMENUITEMID);
    }

    /**
     * 设置 云应用菜单项标识
     * <P>
     * 等同 {@link #setPSAppMenuItemId}
     * @param pSAppMenuItemId
     */
    @JsonIgnore
    public PSAppMenuItem psappmenuitemid(String pSAppMenuItemId){
        this.setPSAppMenuItemId(pSAppMenuItemId);
        return this;
    }

    /**
     * <B>PSAPPMENUITEMNAME</B>&nbsp;菜单项名称，指定应用菜单项的名称，需在所属应用菜单中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSAPPMENUITEMNAME = "psappmenuitemname";

    /**
     * 设置 菜单项名称，详细说明：{@link #FIELD_PSAPPMENUITEMNAME}
     * 
     * @param pSAppMenuItemName
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUITEMNAME)
    public void setPSAppMenuItemName(String pSAppMenuItemName){
        this.set(FIELD_PSAPPMENUITEMNAME, pSAppMenuItemName);
    }
    
    /**
     * 获取 菜单项名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuItemName(){
        Object objValue = this.get(FIELD_PSAPPMENUITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 菜单项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuItemNameDirty(){
        if(this.contains(FIELD_PSAPPMENUITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单项名称
     */
    @JsonIgnore
    public void resetPSAppMenuItemName(){
        this.reset(FIELD_PSAPPMENUITEMNAME);
    }

    /**
     * 设置 菜单项名称，详细说明：{@link #FIELD_PSAPPMENUITEMNAME}
     * <P>
     * 等同 {@link #setPSAppMenuItemName}
     * @param pSAppMenuItemName
     */
    @JsonIgnore
    public PSAppMenuItem psappmenuitemname(String pSAppMenuItemName){
        this.setPSAppMenuItemName(pSAppMenuItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppMenuItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppMenuItemName(strName);
    }

    @JsonIgnore
    public PSAppMenuItem name(String strName){
        this.setPSAppMenuItemName(strName);
        return this;
    }

    /**
     * <B>PSAPPMENUNAME</B>&nbsp;应用菜单，指定应用菜单项所属的应用菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMENUID}
     */
    public final static String FIELD_PSAPPMENUNAME = "psappmenuname";

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUNAME}
     * 
     * @param pSAppMenuName
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUNAME)
    public void setPSAppMenuName(String pSAppMenuName){
        this.set(FIELD_PSAPPMENUNAME, pSAppMenuName);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuName(){
        Object objValue = this.get(FIELD_PSAPPMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuNameDirty(){
        if(this.contains(FIELD_PSAPPMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuName(){
        this.reset(FIELD_PSAPPMENUNAME);
    }

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUNAME}
     * <P>
     * 等同 {@link #setPSAppMenuName}
     * @param pSAppMenuName
     */
    @JsonIgnore
    public PSAppMenuItem psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
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
    public PSAppMenuItem psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体界面逻辑
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体界面逻辑  
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
     * 判断 实体界面逻辑 是否指定值，包括空值
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
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体界面逻辑
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSAppMenuItem psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 界面逻辑
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 界面逻辑  
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
     * 判断 界面逻辑 是否指定值，包括空值
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
     * 重置 界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 界面逻辑
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSAppMenuItem psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 界面行为
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSAppMenuItem psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 界面行为
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSAppMenuItem psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMENUID}
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
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
     * 判断 系统应用 是否指定值，包括空值
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
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppMenuItem pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;显示样式，指定应用菜单项容器的界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 显示样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 显示样式  
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
     * 判断 显示样式 是否指定值，包括空值
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
     * 重置 显示样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 显示样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSAppMenuItem pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 显示样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定应用菜单项容器的界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
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
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSAppMenuItem pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定应用菜单项的显示图标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSAppMenuItem pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定应用菜单项的显示图标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSAppMenuItem pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定应用菜单项使用的前端模板扩展插件，使用插件类型【应用菜单项绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
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
    public PSAppMenuItem pssyspfpluginid(String pSSysPFPluginId){
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
    public PSAppMenuItem pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定应用菜单项使用的前端模板扩展插件，使用插件类型【应用菜单项绘制插件】
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
    public PSAppMenuItem pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceId
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCEID)
    public void setPSSysResourceId(String pSSysResourceId){
        this.set(FIELD_PSSYSRESOURCEID, pSSysResourceId);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceId(){
        Object objValue = this.get(FIELD_PSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceIdDirty(){
        if(this.contains(FIELD_PSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceId(){
        this.reset(FIELD_PSSYSRESOURCEID);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSAppMenuItem pssysresourceid(String pSSysResourceId){
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    /**
     * 设置 系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem pssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        }
        else{
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceName
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCENAME)
    public void setPSSysResourceName(String pSSysResourceName){
        this.set(FIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceName(){
        Object objValue = this.get(FIELD_PSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceNameDirty(){
        if(this.contains(FIELD_PSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceName(){
        this.reset(FIELD_PSSYSRESOURCENAME);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSAppMenuItem pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;访问控制资源标识，指定应用菜单项访问控制的统一资源对象，未定义时使用应用功能配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 访问控制资源标识，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 访问控制资源标识  
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
     * 判断 访问控制资源标识 是否指定值，包括空值
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
     * 重置 访问控制资源标识
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 访问控制资源标识，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSAppMenuItem pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 访问控制资源标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem pssysuniresid(PSSysUniRes pSSysUniRes){
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
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，指定应用菜单项访问控制的统一资源对象，未定义时使用应用功能配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
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
     * 判断 系统统一资源 是否指定值，包括空值
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
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSAppMenuItem pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>RAWCONTENT</B>&nbsp;直接内容，直接内容项内容类型为【直接内容】时指定直接内容，未指定时使用指定的系统资源定义内容
     */
    public final static String FIELD_RAWCONTENT = "rawcontent";

    /**
     * 设置 直接内容，详细说明：{@link #FIELD_RAWCONTENT}
     * 
     * @param rawContent
     * 
     */
    @JsonProperty(FIELD_RAWCONTENT)
    public void setRawContent(String rawContent){
        this.set(FIELD_RAWCONTENT, rawContent);
    }
    
    /**
     * 获取 直接内容  
     * @return
     */
    @JsonIgnore
    public String getRawContent(){
        Object objValue = this.get(FIELD_RAWCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawContentDirty(){
        if(this.contains(FIELD_RAWCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接内容
     */
    @JsonIgnore
    public void resetRawContent(){
        this.reset(FIELD_RAWCONTENT);
    }

    /**
     * 设置 直接内容，详细说明：{@link #FIELD_RAWCONTENT}
     * <P>
     * 等同 {@link #setRawContent}
     * @param rawContent
     */
    @JsonIgnore
    public PSAppMenuItem rawcontent(String rawContent){
        this.setRawContent(rawContent);
        return this;
    }

    /**
     * <B>RAWCSSSTYLE</B>&nbsp;直接样式
     */
    public final static String FIELD_RAWCSSSTYLE = "rawcssstyle";

    /**
     * 设置 直接样式
     * 
     * @param rawCssStyle
     * 
     */
    @JsonProperty(FIELD_RAWCSSSTYLE)
    public void setRawCssStyle(String rawCssStyle){
        this.set(FIELD_RAWCSSSTYLE, rawCssStyle);
    }
    
    /**
     * 获取 直接样式  
     * @return
     */
    @JsonIgnore
    public String getRawCssStyle(){
        Object objValue = this.get(FIELD_RAWCSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawCssStyleDirty(){
        if(this.contains(FIELD_RAWCSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接样式
     */
    @JsonIgnore
    public void resetRawCssStyle(){
        this.reset(FIELD_RAWCSSSTYLE);
    }

    /**
     * 设置 直接样式
     * <P>
     * 等同 {@link #setRawCssStyle}
     * @param rawCssStyle
     */
    @JsonIgnore
    public PSAppMenuItem rawcssstyle(String rawCssStyle){
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    /**
     * <B>REFPSAPPMENUID</B>&nbsp;菜单引用，指定菜单项所引用的应用菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppMenu} 
     */
    public final static String FIELD_REFPSAPPMENUID = "refpsappmenuid";

    /**
     * 设置 菜单引用，详细说明：{@link #FIELD_REFPSAPPMENUID}
     * 
     * @param refPSAppMenuId
     * 
     */
    @JsonProperty(FIELD_REFPSAPPMENUID)
    public void setRefPSAppMenuId(String refPSAppMenuId){
        this.set(FIELD_REFPSAPPMENUID, refPSAppMenuId);
    }
    
    /**
     * 获取 菜单引用  
     * @return
     */
    @JsonIgnore
    public String getRefPSAppMenuId(){
        Object objValue = this.get(FIELD_REFPSAPPMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 菜单引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSAppMenuIdDirty(){
        if(this.contains(FIELD_REFPSAPPMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单引用
     */
    @JsonIgnore
    public void resetRefPSAppMenuId(){
        this.reset(FIELD_REFPSAPPMENUID);
    }

    /**
     * 设置 菜单引用，详细说明：{@link #FIELD_REFPSAPPMENUID}
     * <P>
     * 等同 {@link #setRefPSAppMenuId}
     * @param refPSAppMenuId
     */
    @JsonIgnore
    public PSAppMenuItem refpsappmenuid(String refPSAppMenuId){
        this.setRefPSAppMenuId(refPSAppMenuId);
        return this;
    }

    /**
     * 设置 菜单引用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSAppMenuId}
     * @param pSAppMenu 引用对象
     */
    @JsonIgnore
    public PSAppMenuItem refpsappmenuid(PSAppMenu pSAppMenu){
        if(pSAppMenu == null){
            this.setRefPSAppMenuId(null);
            this.setRefPSAppMenuName(null);
        }
        else{
            this.setRefPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setRefPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    /**
     * <B>REFPSAPPMENUNAME</B>&nbsp;菜单引用，指定菜单项所引用的应用菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSAPPMENUID}
     */
    public final static String FIELD_REFPSAPPMENUNAME = "refpsappmenuname";

    /**
     * 设置 菜单引用，详细说明：{@link #FIELD_REFPSAPPMENUNAME}
     * 
     * @param refPSAppMenuName
     * 
     */
    @JsonProperty(FIELD_REFPSAPPMENUNAME)
    public void setRefPSAppMenuName(String refPSAppMenuName){
        this.set(FIELD_REFPSAPPMENUNAME, refPSAppMenuName);
    }
    
    /**
     * 获取 菜单引用  
     * @return
     */
    @JsonIgnore
    public String getRefPSAppMenuName(){
        Object objValue = this.get(FIELD_REFPSAPPMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 菜单引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSAppMenuNameDirty(){
        if(this.contains(FIELD_REFPSAPPMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单引用
     */
    @JsonIgnore
    public void resetRefPSAppMenuName(){
        this.reset(FIELD_REFPSAPPMENUNAME);
    }

    /**
     * 设置 菜单引用，详细说明：{@link #FIELD_REFPSAPPMENUNAME}
     * <P>
     * 等同 {@link #setRefPSAppMenuName}
     * @param refPSAppMenuName
     */
    @JsonIgnore
    public PSAppMenuItem refpsappmenuname(String refPSAppMenuName){
        this.setRefPSAppMenuName(refPSAppMenuName);
        return this;
    }

    /**
     * <B>SPANFLAG</B>&nbsp;中间占位
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SPANFLAG = "spanflag";

    /**
     * 设置 中间占位
     * 
     * @param spanFlag
     * 
     */
    @JsonProperty(FIELD_SPANFLAG)
    public void setSpanFlag(Integer spanFlag){
        this.set(FIELD_SPANFLAG, spanFlag);
    }
    
    /**
     * 获取 中间占位  
     * @return
     */
    @JsonIgnore
    public Integer getSpanFlag(){
        Object objValue = this.get(FIELD_SPANFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 中间占位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSpanFlagDirty(){
        if(this.contains(FIELD_SPANFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中间占位
     */
    @JsonIgnore
    public void resetSpanFlag(){
        this.reset(FIELD_SPANFLAG);
    }

    /**
     * 设置 中间占位
     * <P>
     * 等同 {@link #setSpanFlag}
     * @param spanFlag
     */
    @JsonIgnore
    public PSAppMenuItem spanflag(Integer spanFlag){
        this.setSpanFlag(spanFlag);
        return this;
    }

     /**
     * 设置 中间占位
     * <P>
     * 等同 {@link #setSpanFlag}
     * @param spanFlag
     */
    @JsonIgnore
    public PSAppMenuItem spanflag(Boolean spanFlag){
        if(spanFlag == null){
            this.setSpanFlag(null);
        }
        else{
            this.setSpanFlag(spanFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TEMPLATEMODE</B>&nbsp;模板模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TEMPLATEMODE = "templatemode";

    /**
     * 设置 模板模式
     * 
     * @param templateMode
     * 
     */
    @JsonProperty(FIELD_TEMPLATEMODE)
    public void setTemplateMode(Integer templateMode){
        this.set(FIELD_TEMPLATEMODE, templateMode);
    }
    
    /**
     * 获取 模板模式  
     * @return
     */
    @JsonIgnore
    public Integer getTemplateMode(){
        Object objValue = this.get(FIELD_TEMPLATEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplateModeDirty(){
        if(this.contains(FIELD_TEMPLATEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板模式
     */
    @JsonIgnore
    public void resetTemplateMode(){
        this.reset(FIELD_TEMPLATEMODE);
    }

    /**
     * 设置 模板模式
     * <P>
     * 等同 {@link #setTemplateMode}
     * @param templateMode
     */
    @JsonIgnore
    public PSAppMenuItem templatemode(Integer templateMode){
        this.setTemplateMode(templateMode);
        return this;
    }

     /**
     * 设置 模板模式
     * <P>
     * 等同 {@link #setTemplateMode}
     * @param templateMode
     */
    @JsonIgnore
    public PSAppMenuItem templatemode(Boolean templateMode){
        if(templateMode == null){
            this.setTemplateMode(null);
        }
        else{
            this.setTemplateMode(templateMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源，指定应用菜单项的提示信息的多语言资源
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
    public PSAppMenuItem tippslanresid(String tipPSLanResId){
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
    public PSAppMenuItem tippslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源，指定应用菜单项的提示信息的多语言资源
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
    public PSAppMenuItem tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TITLEBARCLOSEMODE</B>&nbsp;标题栏关闭模式，指定应用菜单项分组标题栏关闭模式，未定义时为【无关闭】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode} 
     */
    public final static String FIELD_TITLEBARCLOSEMODE = "titlebarclosemode";

    /**
     * 设置 标题栏关闭模式，详细说明：{@link #FIELD_TITLEBARCLOSEMODE}
     * 
     * @param titleBarCloseMode
     * 
     */
    @JsonProperty(FIELD_TITLEBARCLOSEMODE)
    public void setTitleBarCloseMode(Integer titleBarCloseMode){
        this.set(FIELD_TITLEBARCLOSEMODE, titleBarCloseMode);
    }
    
    /**
     * 获取 标题栏关闭模式  
     * @return
     */
    @JsonIgnore
    public Integer getTitleBarCloseMode(){
        Object objValue = this.get(FIELD_TITLEBARCLOSEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标题栏关闭模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitleBarCloseModeDirty(){
        if(this.contains(FIELD_TITLEBARCLOSEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题栏关闭模式
     */
    @JsonIgnore
    public void resetTitleBarCloseMode(){
        this.reset(FIELD_TITLEBARCLOSEMODE);
    }

    /**
     * 设置 标题栏关闭模式，详细说明：{@link #FIELD_TITLEBARCLOSEMODE}
     * <P>
     * 等同 {@link #setTitleBarCloseMode}
     * @param titleBarCloseMode
     */
    @JsonIgnore
    public PSAppMenuItem titlebarclosemode(Integer titleBarCloseMode){
        this.setTitleBarCloseMode(titleBarCloseMode);
        return this;
    }

     /**
     * 设置 标题栏关闭模式，详细说明：{@link #FIELD_TITLEBARCLOSEMODE}
     * <P>
     * 等同 {@link #setTitleBarCloseMode}
     * @param titleBarCloseMode
     */
    @JsonIgnore
    public PSAppMenuItem titlebarclosemode(net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode){
        if(titleBarCloseMode == null){
            this.setTitleBarCloseMode(null);
        }
        else{
            this.setTitleBarCloseMode(titleBarCloseMode.value);
        }
        return this;
    }

    /**
     * <B>TOGGLEMODE</B>&nbsp;切换模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_TOGGLEMODE = "togglemode";

    /**
     * 设置 切换模式
     * 
     * @param toggleMode
     * 
     */
    @JsonProperty(FIELD_TOGGLEMODE)
    public void setToggleMode(String toggleMode){
        this.set(FIELD_TOGGLEMODE, toggleMode);
    }
    
    /**
     * 获取 切换模式  
     * @return
     */
    @JsonIgnore
    public String getToggleMode(){
        Object objValue = this.get(FIELD_TOGGLEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 切换模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isToggleModeDirty(){
        if(this.contains(FIELD_TOGGLEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 切换模式
     */
    @JsonIgnore
    public void resetToggleMode(){
        this.reset(FIELD_TOGGLEMODE);
    }

    /**
     * 设置 切换模式
     * <P>
     * 等同 {@link #setToggleMode}
     * @param toggleMode
     */
    @JsonIgnore
    public PSAppMenuItem togglemode(String toggleMode){
        this.setToggleMode(toggleMode);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息，指定应用菜单项的提示信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_TOOLTIPINFO = "tooltipinfo";

    /**
     * 设置 提示信息，详细说明：{@link #FIELD_TOOLTIPINFO}
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
     * 设置 提示信息，详细说明：{@link #FIELD_TOOLTIPINFO}
     * <P>
     * 等同 {@link #setTooltipInfo}
     * @param tooltipInfo
     */
    @JsonIgnore
    public PSAppMenuItem tooltipinfo(String tooltipInfo){
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
    public PSAppMenuItem updatedate(String updateDate){
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
    public PSAppMenuItem updateman(String updateMan){
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
    public PSAppMenuItem userparams(String userParams){
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
    public PSAppMenuItem usertag(String userTag){
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
    public PSAppMenuItem usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALIGNSELF</B>&nbsp;垂直对齐（自身）
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign} 
     */
    public final static String FIELD_VALIGNSELF = "valignself";

    /**
     * 设置 垂直对齐（自身）
     * 
     * @param vAlignSelf
     * 
     */
    @JsonProperty(FIELD_VALIGNSELF)
    public void setVAlignSelf(String vAlignSelf){
        this.set(FIELD_VALIGNSELF, vAlignSelf);
    }
    
    /**
     * 获取 垂直对齐（自身）  
     * @return
     */
    @JsonIgnore
    public String getVAlignSelf(){
        Object objValue = this.get(FIELD_VALIGNSELF);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 垂直对齐（自身） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVAlignSelfDirty(){
        if(this.contains(FIELD_VALIGNSELF)){
            return true;
        }
        return false;
    }

    /**
     * 重置 垂直对齐（自身）
     */
    @JsonIgnore
    public void resetVAlignSelf(){
        this.reset(FIELD_VALIGNSELF);
    }

    /**
     * 设置 垂直对齐（自身）
     * <P>
     * 等同 {@link #setVAlignSelf}
     * @param vAlignSelf
     */
    @JsonIgnore
    public PSAppMenuItem valignself(String vAlignSelf){
        this.setVAlignSelf(vAlignSelf);
        return this;
    }

     /**
     * 设置 垂直对齐（自身）
     * <P>
     * 等同 {@link #setVAlignSelf}
     * @param vAlignSelf
     */
    @JsonIgnore
    public PSAppMenuItem valignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlignSelf){
        if(vAlignSelf == null){
            this.setVAlignSelf(null);
        }
        else{
            this.setVAlignSelf(vAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定应用菜单项的宽度
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
     * @return
     */
    @JsonIgnore
    public Integer getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthDirty(){
        if(this.contains(FIELD_WIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSAppMenuItem width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppMenuItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppMenuItemId(strValue);
    }

    @JsonIgnore
    public PSAppMenuItem id(String strValue){
        this.setPSAppMenuItemId(strValue);
        return this;
    }


    /**
     *  应用菜单项 成员集合
     */
    public final static String FIELD_PSAPPMENUITEMS = "psappmenuitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSAppMenuItem> psappmenuitems;

    /**
     * 获取 应用菜单项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSAPPMENUITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppMenuItem> getPSAppMenuItems(){
        return this.psappmenuitems;
    }

    /**
     * 设置 应用菜单项 成员集合  
     * @param psappmenuitems
     */
    @JsonProperty(FIELD_PSAPPMENUITEMS)
    public void setPSAppMenuItems(java.util.List<net.ibizsys.psmodel.core.domain.PSAppMenuItem> psappmenuitems){
        this.psappmenuitems = psappmenuitems;
    }

    /**
     * 获取 应用菜单项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppMenuItem> getPSAppMenuItemsIf(){
        if(this.psappmenuitems == null){
            this.psappmenuitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSAppMenuItem>();          
        }
        return this.psappmenuitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppMenuItem){
            PSAppMenuItem model = (PSAppMenuItem)iPSModel;
            model.setPSAppMenuItems(this.getPSAppMenuItems());
        }
        super.copyTo(iPSModel);
    }
}
