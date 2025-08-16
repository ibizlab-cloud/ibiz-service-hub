package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFORMDETAIL</B>实体表单成员 模型传输对象
 * <P>
 * 实体表单成员模型，提供多种成员类型。支持定义成员的子成员（多层）、成员的动态逻辑等。注意：模型属性根据成员类型可能存在不同的解释（版本遗留问题）
 */
public class PSDEFormDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFormDetail(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许空输入，指定表单项是否允许空输入，未定义时使用引用的属性界面模式的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许空输入  
     * @return
     */
    @JsonIgnore
    public Integer getAllowEmpty(){
        Object objValue = this.get(FIELD_ALLOWEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许空输入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowEmptyDirty(){
        if(this.contains(FIELD_ALLOWEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许空输入
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEFormDetail allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEFormDetail allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BL_POS</B>&nbsp;边缘布局位置，表单成员父容器布局模式为【边缘布局】时指定成员的位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BorderLayoutPos} 
     */
    public final static String FIELD_BL_POS = "bl_pos";

    /**
     * 设置 边缘布局位置，详细说明：{@link #FIELD_BL_POS}
     * 
     * @param bL_Pos
     * 
     */
    @JsonProperty(FIELD_BL_POS)
    public void setBL_Pos(String bL_Pos){
        this.set(FIELD_BL_POS, bL_Pos);
    }
    
    /**
     * 获取 边缘布局位置  
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
     * 判断 边缘布局位置 是否指定值，包括空值
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
     * 重置 边缘布局位置
     */
    @JsonIgnore
    public void resetBL_Pos(){
        this.reset(FIELD_BL_POS);
    }

    /**
     * 设置 边缘布局位置，详细说明：{@link #FIELD_BL_POS}
     * <P>
     * 等同 {@link #setBL_Pos}
     * @param bL_Pos
     */
    @JsonIgnore
    public PSDEFormDetail bl_pos(String bL_Pos){
        this.setBL_Pos(bL_Pos);
        return this;
    }

     /**
     * 设置 边缘布局位置，详细说明：{@link #FIELD_BL_POS}
     * <P>
     * 等同 {@link #setBL_Pos}
     * @param bL_Pos
     */
    @JsonIgnore
    public PSDEFormDetail bl_pos(net.ibizsys.psmodel.core.util.PSModelEnums.BorderLayoutPos bL_Pos){
        if(bL_Pos == null){
            this.setBL_Pos(null);
        }
        else{
            this.setBL_Pos(bL_Pos.value);
        }
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
    public PSDEFormDetail borderstyle(String borderStyle){
        this.setBorderStyle(borderStyle);
        return this;
    }

    /**
     * <B>BTNACTIONTYPE</B>&nbsp;按钮行为类型，指定表单按钮的处理类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormButtonActionType} 
     */
    public final static String FIELD_BTNACTIONTYPE = "btnactiontype";

    /**
     * 设置 按钮行为类型，详细说明：{@link #FIELD_BTNACTIONTYPE}
     * 
     * @param btnActionType
     * 
     */
    @JsonProperty(FIELD_BTNACTIONTYPE)
    public void setBtnActionType(String btnActionType){
        this.set(FIELD_BTNACTIONTYPE, btnActionType);
    }
    
    /**
     * 获取 按钮行为类型  
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
     * 判断 按钮行为类型 是否指定值，包括空值
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
     * 重置 按钮行为类型
     */
    @JsonIgnore
    public void resetBtnActionType(){
        this.reset(FIELD_BTNACTIONTYPE);
    }

    /**
     * 设置 按钮行为类型，详细说明：{@link #FIELD_BTNACTIONTYPE}
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSDEFormDetail btnactiontype(String btnActionType){
        this.setBtnActionType(btnActionType);
        return this;
    }

     /**
     * 设置 按钮行为类型，详细说明：{@link #FIELD_BTNACTIONTYPE}
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSDEFormDetail btnactiontype(net.ibizsys.psmodel.core.util.PSModelEnums.FormButtonActionType btnActionType){
        if(btnActionType == null){
            this.setBtnActionType(null);
        }
        else{
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    /**
     * <B>BUILDINACTION</B>&nbsp;内置操作，指定表单分组面板提供内置操作功能，一般应用于分组包含多数据界面部件场合，调用多数据部件界面提供的相关功能
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupBarMoreAction} 
     */
    public final static String FIELD_BUILDINACTION = "buildinaction";

    /**
     * 设置 内置操作，详细说明：{@link #FIELD_BUILDINACTION}
     * 
     * @param buildInAction
     * 
     */
    @JsonProperty(FIELD_BUILDINACTION)
    public void setBuildInAction(Integer buildInAction){
        this.set(FIELD_BUILDINACTION, buildInAction);
    }
    
    /**
     * 获取 内置操作  
     * @return
     */
    @JsonIgnore
    public Integer getBuildInAction(){
        Object objValue = this.get(FIELD_BUILDINACTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 内置操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBuildInActionDirty(){
        if(this.contains(FIELD_BUILDINACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内置操作
     */
    @JsonIgnore
    public void resetBuildInAction(){
        this.reset(FIELD_BUILDINACTION);
    }

    /**
     * 设置 内置操作，详细说明：{@link #FIELD_BUILDINACTION}
     * <P>
     * 等同 {@link #setBuildInAction}
     * @param buildInAction
     */
    @JsonIgnore
    public PSDEFormDetail buildinaction(Integer buildInAction){
        this.setBuildInAction(buildInAction);
        return this;
    }

     /**
     * 设置 内置操作，详细说明：{@link #FIELD_BUILDINACTION}
     * <P>
     * 等同 {@link #setBuildInAction}
     * @param buildInAction
     */
    @JsonIgnore
    public PSDEFormDetail buildinaction(net.ibizsys.psmodel.core.util.PSModelEnums.GroupBarMoreAction[] buildInAction){
        if(buildInAction == null || buildInAction.length == 0){
            this.setBuildInAction(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.GroupBarMoreAction _item : buildInAction){
                _value |= _item.value;
            }
            this.setBuildInAction(_value);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定表单成员的标题的多语言资源对象，未定义时表单项成员使用引用属性界面模式的配置
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
    public PSDEFormDetail cappslanresid(String capPSLanResId){
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
    public PSDEFormDetail cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定表单成员的标题的多语言资源对象，未定义时表单项成员使用引用属性界面模式的配置
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
    public PSDEFormDetail cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定表单成员的标题，不同类型的成员按照自身逻辑放置标题，未定义时表单项成员使用引用属性界面模式的配置
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
    public PSDEFormDetail caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CHILD_COL_LG</B>&nbsp;内容大型列宽，表单成员父容器布局模式为【栅格布局】时指定成员在大型界面的默认列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CHILD_COL_LG = "child_col_lg";

    /**
     * 设置 内容大型列宽，详细说明：{@link #FIELD_CHILD_COL_LG}
     * 
     * @param child_Col_LG
     * 
     */
    @JsonProperty(FIELD_CHILD_COL_LG)
    public void setChild_Col_LG(Integer child_Col_LG){
        this.set(FIELD_CHILD_COL_LG, child_Col_LG);
    }
    
    /**
     * 获取 内容大型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getChild_Col_LG(){
        Object objValue = this.get(FIELD_CHILD_COL_LG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 内容大型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChild_Col_LGDirty(){
        if(this.contains(FIELD_CHILD_COL_LG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容大型列宽
     */
    @JsonIgnore
    public void resetChild_Col_LG(){
        this.reset(FIELD_CHILD_COL_LG);
    }

    /**
     * 设置 内容大型列宽，详细说明：{@link #FIELD_CHILD_COL_LG}
     * <P>
     * 等同 {@link #setChild_Col_LG}
     * @param child_Col_LG
     */
    @JsonIgnore
    public PSDEFormDetail child_col_lg(Integer child_Col_LG){
        this.setChild_Col_LG(child_Col_LG);
        return this;
    }

    /**
     * <B>CHILD_COL_MD</B>&nbsp;内容中型列宽，表单成员父容器布局模式为【栅格布局】时指定成员在中型界面的默认列占位数量，未定义时为当前栅格列数，也就是整行占满
     */
    public final static String FIELD_CHILD_COL_MD = "child_col_md";

    /**
     * 设置 内容中型列宽，详细说明：{@link #FIELD_CHILD_COL_MD}
     * 
     * @param child_Col_MD
     * 
     */
    @JsonProperty(FIELD_CHILD_COL_MD)
    public void setChild_Col_MD(Integer child_Col_MD){
        this.set(FIELD_CHILD_COL_MD, child_Col_MD);
    }
    
    /**
     * 获取 内容中型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getChild_Col_MD(){
        Object objValue = this.get(FIELD_CHILD_COL_MD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 内容中型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChild_Col_MDDirty(){
        if(this.contains(FIELD_CHILD_COL_MD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容中型列宽
     */
    @JsonIgnore
    public void resetChild_Col_MD(){
        this.reset(FIELD_CHILD_COL_MD);
    }

    /**
     * 设置 内容中型列宽，详细说明：{@link #FIELD_CHILD_COL_MD}
     * <P>
     * 等同 {@link #setChild_Col_MD}
     * @param child_Col_MD
     */
    @JsonIgnore
    public PSDEFormDetail child_col_md(Integer child_Col_MD){
        this.setChild_Col_MD(child_Col_MD);
        return this;
    }

    /**
     * <B>CHILD_COL_SM</B>&nbsp;内容小型列宽，表单成员父容器布局模式为【栅格布局】时指定成员在小型界面的默认列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CHILD_COL_SM = "child_col_sm";

    /**
     * 设置 内容小型列宽，详细说明：{@link #FIELD_CHILD_COL_SM}
     * 
     * @param child_Col_SM
     * 
     */
    @JsonProperty(FIELD_CHILD_COL_SM)
    public void setChild_Col_SM(Integer child_Col_SM){
        this.set(FIELD_CHILD_COL_SM, child_Col_SM);
    }
    
    /**
     * 获取 内容小型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getChild_Col_SM(){
        Object objValue = this.get(FIELD_CHILD_COL_SM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 内容小型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChild_Col_SMDirty(){
        if(this.contains(FIELD_CHILD_COL_SM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容小型列宽
     */
    @JsonIgnore
    public void resetChild_Col_SM(){
        this.reset(FIELD_CHILD_COL_SM);
    }

    /**
     * 设置 内容小型列宽，详细说明：{@link #FIELD_CHILD_COL_SM}
     * <P>
     * 等同 {@link #setChild_Col_SM}
     * @param child_Col_SM
     */
    @JsonIgnore
    public PSDEFormDetail child_col_sm(Integer child_Col_SM){
        this.setChild_Col_SM(child_Col_SM);
        return this;
    }

    /**
     * <B>CHILD_COL_XS</B>&nbsp;内容超小列宽，表单成员父容器布局模式为【栅格布局】时指定成员在超小型界面的默认列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CHILD_COL_XS = "child_col_xs";

    /**
     * 设置 内容超小列宽，详细说明：{@link #FIELD_CHILD_COL_XS}
     * 
     * @param child_Col_XS
     * 
     */
    @JsonProperty(FIELD_CHILD_COL_XS)
    public void setChild_Col_XS(Integer child_Col_XS){
        this.set(FIELD_CHILD_COL_XS, child_Col_XS);
    }
    
    /**
     * 获取 内容超小列宽  
     * @return
     */
    @JsonIgnore
    public Integer getChild_Col_XS(){
        Object objValue = this.get(FIELD_CHILD_COL_XS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 内容超小列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChild_Col_XSDirty(){
        if(this.contains(FIELD_CHILD_COL_XS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容超小列宽
     */
    @JsonIgnore
    public void resetChild_Col_XS(){
        this.reset(FIELD_CHILD_COL_XS);
    }

    /**
     * 设置 内容超小列宽，详细说明：{@link #FIELD_CHILD_COL_XS}
     * <P>
     * 等同 {@link #setChild_Col_XS}
     * @param child_Col_XS
     */
    @JsonIgnore
    public PSDEFormDetail child_col_xs(Integer child_Col_XS){
        this.setChild_Col_XS(child_Col_XS);
        return this;
    }

    /**
     * <B>CODELISTCONFIGMODE</B>&nbsp;输出代码表配置模式，指定表单项代码表配置的输出模式，未定义时如表单项编辑器与引用属性界面模式一致则使用属性界面模式的配置，否则为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode} 
     */
    public final static String FIELD_CODELISTCONFIGMODE = "codelistconfigmode";

    /**
     * 设置 输出代码表配置模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * 
     * @param codeListConfigMode
     * 
     */
    @JsonProperty(FIELD_CODELISTCONFIGMODE)
    public void setCodeListConfigMode(Integer codeListConfigMode){
        this.set(FIELD_CODELISTCONFIGMODE, codeListConfigMode);
    }
    
    /**
     * 获取 输出代码表配置模式  
     * @return
     */
    @JsonIgnore
    public Integer getCodeListConfigMode(){
        Object objValue = this.get(FIELD_CODELISTCONFIGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出代码表配置模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeListConfigModeDirty(){
        if(this.contains(FIELD_CODELISTCONFIGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出代码表配置模式
     */
    @JsonIgnore
    public void resetCodeListConfigMode(){
        this.reset(FIELD_CODELISTCONFIGMODE);
    }

    /**
     * 设置 输出代码表配置模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDEFormDetail codelistconfigmode(Integer codeListConfigMode){
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

     /**
     * 设置 输出代码表配置模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDEFormDetail codelistconfigmode(net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode codeListConfigMode){
        if(codeListConfigMode == null){
            this.setCodeListConfigMode(null);
        }
        else{
            this.setCodeListConfigMode(codeListConfigMode.value);
        }
        return this;
    }

    /**
     * <B>COLALIGN</B>&nbsp;表格列对齐
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign} 
     */
    public final static String FIELD_COLALIGN = "colalign";

    /**
     * 设置 表格列对齐
     * 
     * @param colAlign
     * 
     */
    @JsonProperty(FIELD_COLALIGN)
    public void setColAlign(String colAlign){
        this.set(FIELD_COLALIGN, colAlign);
    }
    
    /**
     * 获取 表格列对齐  
     * @return
     */
    @JsonIgnore
    public String getColAlign(){
        Object objValue = this.get(FIELD_COLALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColAlignDirty(){
        if(this.contains(FIELD_COLALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列对齐
     */
    @JsonIgnore
    public void resetColAlign(){
        this.reset(FIELD_COLALIGN);
    }

    /**
     * 设置 表格列对齐
     * <P>
     * 等同 {@link #setColAlign}
     * @param colAlign
     */
    @JsonIgnore
    public PSDEFormDetail colalign(String colAlign){
        this.setColAlign(colAlign);
        return this;
    }

     /**
     * 设置 表格列对齐
     * <P>
     * 等同 {@link #setColAlign}
     * @param colAlign
     */
    @JsonIgnore
    public PSDEFormDetail colalign(net.ibizsys.psmodel.core.util.PSModelEnums.GridColAlign colAlign){
        if(colAlign == null){
            this.setColAlign(null);
        }
        else{
            this.setColAlign(colAlign.value);
        }
        return this;
    }

    /**
     * <B>COLID</B>&nbsp;列号，表单成员父容器布局模式为【表格布局】时指定占位列标识，-1为自动，未定义时为【-1】
     */
    public final static String FIELD_COLID = "colid";

    /**
     * 设置 列号，详细说明：{@link #FIELD_COLID}
     * 
     * @param colId
     * 
     */
    @JsonProperty(FIELD_COLID)
    public void setColId(Integer colId){
        this.set(FIELD_COLID, colId);
    }
    
    /**
     * 获取 列号  
     * @return
     */
    @JsonIgnore
    public Integer getColId(){
        Object objValue = this.get(FIELD_COLID);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 列号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColIdDirty(){
        if(this.contains(FIELD_COLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列号
     */
    @JsonIgnore
    public void resetColId(){
        this.reset(FIELD_COLID);
    }

    /**
     * 设置 列号，详细说明：{@link #FIELD_COLID}
     * <P>
     * 等同 {@link #setColId}
     * @param colId
     */
    @JsonIgnore
    public PSDEFormDetail colid(Integer colId){
        this.setColId(colId);
        return this;
    }

    /**
     * <B>COLMODEL</B>&nbsp;列模型，表单成员布局容器模式为【表格布局】时指定表格列分割模型，多列使用分号分隔，列宽度可以使用百分数（表格宽度占比）、数字、星号（剩余），如 100;50%;* 表现第一列100像素、第二列表格一半宽度，第三列为剩余宽度
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_COLMODEL = "colmodel";

    /**
     * 设置 列模型，详细说明：{@link #FIELD_COLMODEL}
     * 
     * @param colModel
     * 
     */
    @JsonProperty(FIELD_COLMODEL)
    public void setColModel(String colModel){
        this.set(FIELD_COLMODEL, colModel);
    }
    
    /**
     * 获取 列模型  
     * @return
     */
    @JsonIgnore
    public String getColModel(){
        Object objValue = this.get(FIELD_COLMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColModelDirty(){
        if(this.contains(FIELD_COLMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列模型
     */
    @JsonIgnore
    public void resetColModel(){
        this.reset(FIELD_COLMODEL);
    }

    /**
     * 设置 列模型，详细说明：{@link #FIELD_COLMODEL}
     * <P>
     * 等同 {@link #setColModel}
     * @param colModel
     */
    @JsonIgnore
    public PSDEFormDetail colmodel(String colModel){
        this.setColModel(colModel);
        return this;
    }

    /**
     * <B>COLSPAN</B>&nbsp;列数，表单成员父容器布局模式为【表格布局】时指定成员的占位列数，未定义时为【1】
     */
    public final static String FIELD_COLSPAN = "colspan";

    /**
     * 设置 列数，详细说明：{@link #FIELD_COLSPAN}
     * 
     * @param colSpan
     * 
     */
    @JsonProperty(FIELD_COLSPAN)
    public void setColSpan(Integer colSpan){
        this.set(FIELD_COLSPAN, colSpan);
    }
    
    /**
     * 获取 列数  
     * @return
     */
    @JsonIgnore
    public Integer getColSpan(){
        Object objValue = this.get(FIELD_COLSPAN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 列数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColSpanDirty(){
        if(this.contains(FIELD_COLSPAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列数
     */
    @JsonIgnore
    public void resetColSpan(){
        this.reset(FIELD_COLSPAN);
    }

    /**
     * 设置 列数，详细说明：{@link #FIELD_COLSPAN}
     * <P>
     * 等同 {@link #setColSpan}
     * @param colSpan
     */
    @JsonIgnore
    public PSDEFormDetail colspan(Integer colSpan){
        this.setColSpan(colSpan);
        return this;
    }

    /**
     * <B>COL_LG</B>&nbsp;大型列宽，表单成员父容器布局模式为【栅格布局】时指定成员在大型界面的列占位数量，未定义时使用父容器的默认大型界面列占位数量
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
    public PSDEFormDetail col_lg(Integer col_LG){
        this.setCol_LG(col_LG);
        return this;
    }

    /**
     * <B>COL_LG_OS</B>&nbsp;大型偏移，表单成员父容器布局模式为【栅格布局】时指定成员在大型界面的列偏移数量，未定义时为【-1】
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
    public PSDEFormDetail col_lg_os(Integer col_LG_OS){
        this.setCol_LG_OS(col_LG_OS);
        return this;
    }

    /**
     * <B>COL_MD</B>&nbsp;中型列宽，表单成员父容器布局模式为【栅格布局】时指定成员在中型界面的列占位数量，未定义时使用父容器的默认中型界面列占位数量
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
    public PSDEFormDetail col_md(Integer col_MD){
        this.setCol_MD(col_MD);
        return this;
    }

    /**
     * <B>COL_MD_OS</B>&nbsp;中型偏移，表单成员父容器布局模式为【栅格布局】时指定成员在中型界面的列偏移数量，未定义时为【-1】
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
    public PSDEFormDetail col_md_os(Integer col_MD_OS){
        this.setCol_MD_OS(col_MD_OS);
        return this;
    }

    /**
     * <B>COL_SM</B>&nbsp;小型列宽，表单成员父容器布局模式为【栅格布局】时指定成员在小型界面的列占位数量，未定义时使用父容器的默认小型界面列占位数量
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
    public PSDEFormDetail col_sm(Integer col_SM){
        this.setCol_SM(col_SM);
        return this;
    }

    /**
     * <B>COL_SM_OS</B>&nbsp;小型偏移，表单成员父容器布局模式为【栅格布局】时指定成员在小型界面的列偏移数量，未定义时为【-1】
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
    public PSDEFormDetail col_sm_os(Integer col_SM_OS){
        this.setCol_SM_OS(col_SM_OS);
        return this;
    }

    /**
     * <B>COL_WIDTH</B>&nbsp;固定宽度，指定表单成员在【栅格布局】模式下的固定列宽，未定义时为【-1】
     */
    public final static String FIELD_COL_WIDTH = "col_width";

    /**
     * 设置 固定宽度，详细说明：{@link #FIELD_COL_WIDTH}
     * 
     * @param col_Width
     * 
     */
    @JsonProperty(FIELD_COL_WIDTH)
    public void setCol_Width(Integer col_Width){
        this.set(FIELD_COL_WIDTH, col_Width);
    }
    
    /**
     * 获取 固定宽度  
     * @return
     */
    @JsonIgnore
    public Integer getCol_Width(){
        Object objValue = this.get(FIELD_COL_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 固定宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCol_WidthDirty(){
        if(this.contains(FIELD_COL_WIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 固定宽度
     */
    @JsonIgnore
    public void resetCol_Width(){
        this.reset(FIELD_COL_WIDTH);
    }

    /**
     * 设置 固定宽度，详细说明：{@link #FIELD_COL_WIDTH}
     * <P>
     * 等同 {@link #setCol_Width}
     * @param col_Width
     */
    @JsonIgnore
    public PSDEFormDetail col_width(Integer col_Width){
        this.setCol_Width(col_Width);
        return this;
    }

    /**
     * <B>COL_XS</B>&nbsp;超小列宽，表单成员父容器布局模式为【栅格布局】时指定成员在超小界面的列占位数量，未定义时使用父容器的默认超小界面列占位数量
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
    public PSDEFormDetail col_xs(Integer col_XS){
        this.setCol_XS(col_XS);
        return this;
    }

    /**
     * <B>COL_XS_OS</B>&nbsp;超小偏移，表单成员父容器布局模式为【栅格布局】时指定成员在超小界面的列偏移数量，未定义时为【-1】
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
    public PSDEFormDetail col_xs_os(Integer col_XS_OS){
        this.setCol_XS_OS(col_XS_OS);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定表单直接内容成员的内容类型
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
    public PSDEFormDetail contenttype(String contentType){
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
    public PSDEFormDetail contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
        return this;
    }

    /**
     * <B>CONVERTCITEXT</B>&nbsp;转换代码项文本，在表单项指定代码表情况下，指定是否将代码值转换为文本输出，未定义时由表单项的编辑器决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CONVERTCITEXT = "convertcitext";

    /**
     * 设置 转换代码项文本，详细说明：{@link #FIELD_CONVERTCITEXT}
     * 
     * @param convertCIText
     * 
     */
    @JsonProperty(FIELD_CONVERTCITEXT)
    public void setConvertCIText(Integer convertCIText){
        this.set(FIELD_CONVERTCITEXT, convertCIText);
    }
    
    /**
     * 获取 转换代码项文本  
     * @return
     */
    @JsonIgnore
    public Integer getConvertCIText(){
        Object objValue = this.get(FIELD_CONVERTCITEXT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 转换代码项文本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConvertCITextDirty(){
        if(this.contains(FIELD_CONVERTCITEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换代码项文本
     */
    @JsonIgnore
    public void resetConvertCIText(){
        this.reset(FIELD_CONVERTCITEXT);
    }

    /**
     * 设置 转换代码项文本，详细说明：{@link #FIELD_CONVERTCITEXT}
     * <P>
     * 等同 {@link #setConvertCIText}
     * @param convertCIText
     */
    @JsonIgnore
    public PSDEFormDetail convertcitext(Integer convertCIText){
        this.setConvertCIText(convertCIText);
        return this;
    }

     /**
     * 设置 转换代码项文本，详细说明：{@link #FIELD_CONVERTCITEXT}
     * <P>
     * 等同 {@link #setConvertCIText}
     * @param convertCIText
     */
    @JsonIgnore
    public PSDEFormDetail convertcitext(Boolean convertCIText){
        if(convertCIText == null){
            this.setConvertCIText(null);
        }
        else{
            this.setConvertCIText(convertCIText?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数器标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_COUNTERID = "counterid";

    /**
     * 设置 计数器标识
     * 
     * @param counterId
     * 
     */
    @JsonProperty(FIELD_COUNTERID)
    public void setCounterId(String counterId){
        this.set(FIELD_COUNTERID, counterId);
    }
    
    /**
     * 获取 计数器标识  
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
     * 判断 计数器标识 是否指定值，包括空值
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
     * 重置 计数器标识
     */
    @JsonIgnore
    public void resetCounterId(){
        this.reset(FIELD_COUNTERID);
    }

    /**
     * 设置 计数器标识
     * <P>
     * 等同 {@link #setCounterId}
     * @param counterId
     */
    @JsonIgnore
    public PSDEFormDetail counterid(String counterId){
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
    public PSDEFormDetail countermode(Integer counterMode){
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
    public PSDEFormDetail countermode(net.ibizsys.psmodel.core.util.PSModelEnums.TreeNodeCounterMode counterMode){
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
    public PSDEFormDetail createdate(String createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEDV</B>&nbsp;建立默认值，指定表单项的建立默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CREATEDV = "createdv";

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * 
     * @param createDV
     * 
     */
    @JsonProperty(FIELD_CREATEDV)
    public void setCreateDV(String createDV){
        this.set(FIELD_CREATEDV, createDV);
    }
    
    /**
     * 获取 建立默认值  
     * @return
     */
    @JsonIgnore
    public String getCreateDV(){
        Object objValue = this.get(FIELD_CREATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVDirty(){
        if(this.contains(FIELD_CREATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立默认值
     */
    @JsonIgnore
    public void resetCreateDV(){
        this.reset(FIELD_CREATEDV);
    }

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * <P>
     * 等同 {@link #setCreateDV}
     * @param createDV
     */
    @JsonIgnore
    public PSDEFormDetail createdv(String createDV){
        this.setCreateDV(createDV);
        return this;
    }

    /**
     * <B>CREATEDVT</B>&nbsp;新建默认值类型，指定表单项的建立默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType} 
     */
    public final static String FIELD_CREATEDVT = "createdvt";

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * 
     * @param createDVT
     * 
     */
    @JsonProperty(FIELD_CREATEDVT)
    public void setCreateDVT(String createDVT){
        this.set(FIELD_CREATEDVT, createDVT);
    }
    
    /**
     * 获取 新建默认值类型  
     * @return
     */
    @JsonIgnore
    public String getCreateDVT(){
        Object objValue = this.get(FIELD_CREATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVTDirty(){
        if(this.contains(FIELD_CREATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建默认值类型
     */
    @JsonIgnore
    public void resetCreateDVT(){
        this.reset(FIELD_CREATEDVT);
    }

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDEFormDetail createdvt(String createDVT){
        this.setCreateDVT(createDVT);
        return this;
    }

     /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDEFormDetail createdvt(net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType createDVT){
        if(createDVT == null){
            this.setCreateDVT(null);
        }
        else{
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDEFormDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLCOLSPAN</B>&nbsp;控件列数，指定栅格布局时表单项容器中编辑控件的占位列数，此参数为早期模板保留，现已不再使用
     */
    public final static String FIELD_CTRLCOLSPAN = "ctrlcolspan";

    /**
     * 设置 控件列数，详细说明：{@link #FIELD_CTRLCOLSPAN}
     * 
     * @param ctrlColSpan
     * 
     */
    @JsonProperty(FIELD_CTRLCOLSPAN)
    public void setCtrlColSpan(Integer ctrlColSpan){
        this.set(FIELD_CTRLCOLSPAN, ctrlColSpan);
    }
    
    /**
     * 获取 控件列数  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlColSpan(){
        Object objValue = this.get(FIELD_CTRLCOLSPAN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件列数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlColSpanDirty(){
        if(this.contains(FIELD_CTRLCOLSPAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件列数
     */
    @JsonIgnore
    public void resetCtrlColSpan(){
        this.reset(FIELD_CTRLCOLSPAN);
    }

    /**
     * 设置 控件列数，详细说明：{@link #FIELD_CTRLCOLSPAN}
     * <P>
     * 等同 {@link #setCtrlColSpan}
     * @param ctrlColSpan
     */
    @JsonIgnore
    public PSDEFormDetail ctrlcolspan(Integer ctrlColSpan){
        this.setCtrlColSpan(ctrlColSpan);
        return this;
    }

    /**
     * <B>CTRLDYNACLASS</B>&nbsp;部件动态样式表
     */
    public final static String FIELD_CTRLDYNACLASS = "ctrldynaclass";

    /**
     * 设置 部件动态样式表
     * 
     * @param ctrlDynaClass
     * 
     */
    @JsonProperty(FIELD_CTRLDYNACLASS)
    public void setCtrlDynaClass(String ctrlDynaClass){
        this.set(FIELD_CTRLDYNACLASS, ctrlDynaClass);
    }
    
    /**
     * 获取 部件动态样式表  
     * @return
     */
    @JsonIgnore
    public String getCtrlDynaClass(){
        Object objValue = this.get(FIELD_CTRLDYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlDynaClassDirty(){
        if(this.contains(FIELD_CTRLDYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件动态样式表
     */
    @JsonIgnore
    public void resetCtrlDynaClass(){
        this.reset(FIELD_CTRLDYNACLASS);
    }

    /**
     * 设置 部件动态样式表
     * <P>
     * 等同 {@link #setCtrlDynaClass}
     * @param ctrlDynaClass
     */
    @JsonIgnore
    public PSDEFormDetail ctrldynaclass(String ctrlDynaClass){
        this.setCtrlDynaClass(ctrlDynaClass);
        return this;
    }

    /**
     * <B>CTRLHEIGHT</B>&nbsp;控件高度，指定表单项编辑器的高度，未定义时如表单项编辑器与引用属性界面模式一致则使用属性界面模式的配置值，否则使用编辑器类型的默认高度
     */
    public final static String FIELD_CTRLHEIGHT = "ctrlheight";

    /**
     * 设置 控件高度，详细说明：{@link #FIELD_CTRLHEIGHT}
     * 
     * @param ctrlHeight
     * 
     */
    @JsonProperty(FIELD_CTRLHEIGHT)
    public void setCtrlHeight(Integer ctrlHeight){
        this.set(FIELD_CTRLHEIGHT, ctrlHeight);
    }
    
    /**
     * 获取 控件高度  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlHeight(){
        Object objValue = this.get(FIELD_CTRLHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlHeightDirty(){
        if(this.contains(FIELD_CTRLHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件高度
     */
    @JsonIgnore
    public void resetCtrlHeight(){
        this.reset(FIELD_CTRLHEIGHT);
    }

    /**
     * 设置 控件高度，详细说明：{@link #FIELD_CTRLHEIGHT}
     * <P>
     * 等同 {@link #setCtrlHeight}
     * @param ctrlHeight
     */
    @JsonIgnore
    public PSDEFormDetail ctrlheight(Integer ctrlHeight){
        this.setCtrlHeight(ctrlHeight);
        return this;
    }

    /**
     * <B>CTRLPSSYSCSSID</B>&nbsp;部件样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_CTRLPSSYSCSSID = "ctrlpssyscssid";

    /**
     * 设置 部件样式表
     * 
     * @param ctrlPSSysCssId
     * 
     */
    @JsonProperty(FIELD_CTRLPSSYSCSSID)
    public void setCtrlPSSysCssId(String ctrlPSSysCssId){
        this.set(FIELD_CTRLPSSYSCSSID, ctrlPSSysCssId);
    }
    
    /**
     * 获取 部件样式表  
     * @return
     */
    @JsonIgnore
    public String getCtrlPSSysCssId(){
        Object objValue = this.get(FIELD_CTRLPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlPSSysCssIdDirty(){
        if(this.contains(FIELD_CTRLPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件样式表
     */
    @JsonIgnore
    public void resetCtrlPSSysCssId(){
        this.reset(FIELD_CTRLPSSYSCSSID);
    }

    /**
     * 设置 部件样式表
     * <P>
     * 等同 {@link #setCtrlPSSysCssId}
     * @param ctrlPSSysCssId
     */
    @JsonIgnore
    public PSDEFormDetail ctrlpssyscssid(String ctrlPSSysCssId){
        this.setCtrlPSSysCssId(ctrlPSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCtrlPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail ctrlpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setCtrlPSSysCssId(null);
            this.setCtrlPSSysCssName(null);
        }
        else{
            this.setCtrlPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCtrlPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>CTRLPSSYSCSSNAME</B>&nbsp;部件样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CTRLPSSYSCSSID}
     */
    public final static String FIELD_CTRLPSSYSCSSNAME = "ctrlpssyscssname";

    /**
     * 设置 部件样式表
     * 
     * @param ctrlPSSysCssName
     * 
     */
    @JsonProperty(FIELD_CTRLPSSYSCSSNAME)
    public void setCtrlPSSysCssName(String ctrlPSSysCssName){
        this.set(FIELD_CTRLPSSYSCSSNAME, ctrlPSSysCssName);
    }
    
    /**
     * 获取 部件样式表  
     * @return
     */
    @JsonIgnore
    public String getCtrlPSSysCssName(){
        Object objValue = this.get(FIELD_CTRLPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlPSSysCssNameDirty(){
        if(this.contains(FIELD_CTRLPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件样式表
     */
    @JsonIgnore
    public void resetCtrlPSSysCssName(){
        this.reset(FIELD_CTRLPSSYSCSSNAME);
    }

    /**
     * 设置 部件样式表
     * <P>
     * 等同 {@link #setCtrlPSSysCssName}
     * @param ctrlPSSysCssName
     */
    @JsonIgnore
    public PSDEFormDetail ctrlpssyscssname(String ctrlPSSysCssName){
        this.setCtrlPSSysCssName(ctrlPSSysCssName);
        return this;
    }

    /**
     * <B>CTRLRAWCSSSTYLE</B>&nbsp;部件直接样式
     */
    public final static String FIELD_CTRLRAWCSSSTYLE = "ctrlrawcssstyle";

    /**
     * 设置 部件直接样式
     * 
     * @param ctrlRawCssStyle
     * 
     */
    @JsonProperty(FIELD_CTRLRAWCSSSTYLE)
    public void setCtrlRawCssStyle(String ctrlRawCssStyle){
        this.set(FIELD_CTRLRAWCSSSTYLE, ctrlRawCssStyle);
    }
    
    /**
     * 获取 部件直接样式  
     * @return
     */
    @JsonIgnore
    public String getCtrlRawCssStyle(){
        Object objValue = this.get(FIELD_CTRLRAWCSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件直接样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlRawCssStyleDirty(){
        if(this.contains(FIELD_CTRLRAWCSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件直接样式
     */
    @JsonIgnore
    public void resetCtrlRawCssStyle(){
        this.reset(FIELD_CTRLRAWCSSSTYLE);
    }

    /**
     * 设置 部件直接样式
     * <P>
     * 等同 {@link #setCtrlRawCssStyle}
     * @param ctrlRawCssStyle
     */
    @JsonIgnore
    public PSDEFormDetail ctrlrawcssstyle(String ctrlRawCssStyle){
        this.setCtrlRawCssStyle(ctrlRawCssStyle);
        return this;
    }

    /**
     * <B>CTRLWIDTH</B>&nbsp;控件宽度，指定表单项编辑器的宽度，未定义时如表单项编辑器与引用属性界面模式一致则使用属性界面模式的配置值，否则使用编辑器类型的默认宽度
     */
    public final static String FIELD_CTRLWIDTH = "ctrlwidth";

    /**
     * 设置 控件宽度，详细说明：{@link #FIELD_CTRLWIDTH}
     * 
     * @param ctrlWidth
     * 
     */
    @JsonProperty(FIELD_CTRLWIDTH)
    public void setCtrlWidth(Integer ctrlWidth){
        this.set(FIELD_CTRLWIDTH, ctrlWidth);
    }
    
    /**
     * 获取 控件宽度  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlWidth(){
        Object objValue = this.get(FIELD_CTRLWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlWidthDirty(){
        if(this.contains(FIELD_CTRLWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件宽度
     */
    @JsonIgnore
    public void resetCtrlWidth(){
        this.reset(FIELD_CTRLWIDTH);
    }

    /**
     * 设置 控件宽度，详细说明：{@link #FIELD_CTRLWIDTH}
     * <P>
     * 等同 {@link #setCtrlWidth}
     * @param ctrlWidth
     */
    @JsonIgnore
    public PSDEFormDetail ctrlwidth(Integer ctrlWidth){
        this.setCtrlWidth(ctrlWidth);
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
    public PSDEFormDetail customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;搜索项数据
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 搜索项数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 搜索项数据  
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
     * 判断 搜索项数据 是否指定值，包括空值
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
     * 重置 搜索项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 搜索项数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSDEFormDetail data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认搜索项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认搜索项
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认搜索项  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认搜索项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认搜索项
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认搜索项
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEFormDetail defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认搜索项
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEFormDetail defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DETAILSTYLE</B>&nbsp;内置样式，指定表单成员的内置式样，内置式样是模板提供的表现式样，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_DETAILSTYLE = "detailstyle";

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_DETAILSTYLE}
     * 
     * @param detailStyle
     * 
     */
    @JsonProperty(FIELD_DETAILSTYLE)
    public void setDetailStyle(String detailStyle){
        this.set(FIELD_DETAILSTYLE, detailStyle);
    }
    
    /**
     * 获取 内置样式  
     * @return
     */
    @JsonIgnore
    public String getDetailStyle(){
        Object objValue = this.get(FIELD_DETAILSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内置样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailStyleDirty(){
        if(this.contains(FIELD_DETAILSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内置样式
     */
    @JsonIgnore
    public void resetDetailStyle(){
        this.reset(FIELD_DETAILSTYLE);
    }

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_DETAILSTYLE}
     * <P>
     * 等同 {@link #setDetailStyle}
     * @param detailStyle
     */
    @JsonIgnore
    public PSDEFormDetail detailstyle(String detailStyle){
        this.setDetailStyle(detailStyle);
        return this;
    }

     /**
     * 设置 内置样式，详细说明：{@link #FIELD_DETAILSTYLE}
     * <P>
     * 等同 {@link #setDetailStyle}
     * @param detailStyle
     */
    @JsonIgnore
    public PSDEFormDetail detailstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle detailStyle){
        if(detailStyle == null){
            this.setDetailStyle(null);
        }
        else{
            this.setDetailStyle(detailStyle.value);
        }
        return this;
    }

    /**
     * <B>DETAILSTYLETEXT</B>&nbsp;成员样式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DETAILSTYLETEXT = "detailstyletext";

    /**
     * 设置 成员样式
     * 
     * @param detailStyleText
     * 
     */
    @JsonProperty(FIELD_DETAILSTYLETEXT)
    public void setDetailStyleText(String detailStyleText){
        this.set(FIELD_DETAILSTYLETEXT, detailStyleText);
    }
    
    /**
     * 获取 成员样式  
     * @return
     */
    @JsonIgnore
    public String getDetailStyleText(){
        Object objValue = this.get(FIELD_DETAILSTYLETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailStyleTextDirty(){
        if(this.contains(FIELD_DETAILSTYLETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员样式
     */
    @JsonIgnore
    public void resetDetailStyleText(){
        this.reset(FIELD_DETAILSTYLETEXT);
    }

    /**
     * 设置 成员样式
     * <P>
     * 等同 {@link #setDetailStyleText}
     * @param detailStyleText
     */
    @JsonIgnore
    public PSDEFormDetail detailstyletext(String detailStyleText){
        this.setDetailStyleText(detailStyleText);
        return this;
    }

    /**
     * <B>DETAILTAG</B>&nbsp;项标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILTAG = "detailtag";

    /**
     * 设置 项标记
     * 
     * @param detailTag
     * 
     */
    @JsonProperty(FIELD_DETAILTAG)
    public void setDetailTag(String detailTag){
        this.set(FIELD_DETAILTAG, detailTag);
    }
    
    /**
     * 获取 项标记  
     * @return
     */
    @JsonIgnore
    public String getDetailTag(){
        Object objValue = this.get(FIELD_DETAILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTagDirty(){
        if(this.contains(FIELD_DETAILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记
     */
    @JsonIgnore
    public void resetDetailTag(){
        this.reset(FIELD_DETAILTAG);
    }

    /**
     * 设置 项标记
     * <P>
     * 等同 {@link #setDetailTag}
     * @param detailTag
     */
    @JsonIgnore
    public PSDEFormDetail detailtag(String detailTag){
        this.setDetailTag(detailTag);
        return this;
    }

    /**
     * <B>DETAILTAG2</B>&nbsp;项标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILTAG2 = "detailtag2";

    /**
     * 设置 项标记2
     * 
     * @param detailTag2
     * 
     */
    @JsonProperty(FIELD_DETAILTAG2)
    public void setDetailTag2(String detailTag2){
        this.set(FIELD_DETAILTAG2, detailTag2);
    }
    
    /**
     * 获取 项标记2  
     * @return
     */
    @JsonIgnore
    public String getDetailTag2(){
        Object objValue = this.get(FIELD_DETAILTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTag2Dirty(){
        if(this.contains(FIELD_DETAILTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记2
     */
    @JsonIgnore
    public void resetDetailTag2(){
        this.reset(FIELD_DETAILTAG2);
    }

    /**
     * 设置 项标记2
     * <P>
     * 等同 {@link #setDetailTag2}
     * @param detailTag2
     */
    @JsonIgnore
    public PSDEFormDetail detailtag2(String detailTag2){
        this.setDetailTag2(detailTag2);
        return this;
    }

    /**
     * <B>DETAILTYPE</B>&nbsp;类型，指定表单成员的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailType} 
     */
    public final static String FIELD_DETAILTYPE = "detailtype";

    /**
     * 设置 类型，详细说明：{@link #FIELD_DETAILTYPE}
     * 
     * @param detailType
     * 
     */
    @JsonProperty(FIELD_DETAILTYPE)
    public void setDetailType(String detailType){
        this.set(FIELD_DETAILTYPE, detailType);
    }
    
    /**
     * 获取 类型  
     * @return
     */
    @JsonIgnore
    public String getDetailType(){
        Object objValue = this.get(FIELD_DETAILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTypeDirty(){
        if(this.contains(FIELD_DETAILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型
     */
    @JsonIgnore
    public void resetDetailType(){
        this.reset(FIELD_DETAILTYPE);
    }

    /**
     * 设置 类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEFormDetail detailtype(String detailType){
        this.setDetailType(detailType);
        return this;
    }

     /**
     * 设置 类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEFormDetail detailtype(net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailType detailType){
        if(detailType == null){
            this.setDetailType(null);
        }
        else{
            this.setDetailType(detailType.value);
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
    public PSDEFormDetail dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>EDITORPARAMS</B>&nbsp;编辑器参数，指定表单项编辑器的参数，如表单项引用的属性界面模式的配置编辑器类型与当前编辑器一致，同时附加引用的属性界面模式的编辑器参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_EDITORPARAMS = "editorparams";

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * 
     * @param editorParams
     * 
     */
    @JsonProperty(FIELD_EDITORPARAMS)
    public void setEditorParams(String editorParams){
        this.set(FIELD_EDITORPARAMS, editorParams);
    }
    
    /**
     * 获取 编辑器参数  
     * @return
     */
    @JsonIgnore
    public String getEditorParams(){
        Object objValue = this.get(FIELD_EDITORPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorParamsDirty(){
        if(this.contains(FIELD_EDITORPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器参数
     */
    @JsonIgnore
    public void resetEditorParams(){
        this.reset(FIELD_EDITORPARAMS);
    }

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * <P>
     * 等同 {@link #setEditorParams}
     * @param editorParams
     */
    @JsonIgnore
    public PSDEFormDetail editorparams(String editorParams){
        this.setEditorParams(editorParams);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定表单项编辑器的类型，未定义时使用引用属性界面模式的配置
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_EDITORTYPE = "editortype";

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * 
     * @param editorType
     * 
     */
    @JsonProperty(FIELD_EDITORTYPE)
    public void setEditorType(String editorType){
        this.set(FIELD_EDITORTYPE, editorType);
    }
    
    /**
     * 获取 编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getEditorType(){
        Object objValue = this.get(FIELD_EDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorTypeDirty(){
        if(this.contains(FIELD_EDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器类型
     */
    @JsonIgnore
    public void resetEditorType(){
        this.reset(FIELD_EDITORTYPE);
    }

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * <P>
     * 等同 {@link #setEditorType}
     * @param editorType
     */
    @JsonIgnore
    public PSDEFormDetail editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>EMPTYCAPTION</B>&nbsp;空白标签，指定表单项是否启用空白标签，空白标签是指使用无内容的标签进行占位。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EMPTYCAPTION = "emptycaption";

    /**
     * 设置 空白标签，详细说明：{@link #FIELD_EMPTYCAPTION}
     * 
     * @param emptyCaption
     * 
     */
    @JsonProperty(FIELD_EMPTYCAPTION)
    public void setEmptyCaption(Integer emptyCaption){
        this.set(FIELD_EMPTYCAPTION, emptyCaption);
    }
    
    /**
     * 获取 空白标签  
     * @return
     */
    @JsonIgnore
    public Integer getEmptyCaption(){
        Object objValue = this.get(FIELD_EMPTYCAPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 空白标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyCaptionDirty(){
        if(this.contains(FIELD_EMPTYCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 空白标签
     */
    @JsonIgnore
    public void resetEmptyCaption(){
        this.reset(FIELD_EMPTYCAPTION);
    }

    /**
     * 设置 空白标签，详细说明：{@link #FIELD_EMPTYCAPTION}
     * <P>
     * 等同 {@link #setEmptyCaption}
     * @param emptyCaption
     */
    @JsonIgnore
    public PSDEFormDetail emptycaption(Integer emptyCaption){
        this.setEmptyCaption(emptyCaption);
        return this;
    }

     /**
     * 设置 空白标签，详细说明：{@link #FIELD_EMPTYCAPTION}
     * <P>
     * 等同 {@link #setEmptyCaption}
     * @param emptyCaption
     */
    @JsonIgnore
    public PSDEFormDetail emptycaption(Boolean emptyCaption){
        if(emptyCaption == null){
            this.setEmptyCaption(null);
        }
        else{
            this.setEmptyCaption(emptyCaption?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEANCHOR</B>&nbsp;支持锚点，指定表单成员是否支持锚点，支持锚点是提供了直接定位成员的功能，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEANCHOR = "enableanchor";

    /**
     * 设置 支持锚点，详细说明：{@link #FIELD_ENABLEANCHOR}
     * 
     * @param enableAnchor
     * 
     */
    @JsonProperty(FIELD_ENABLEANCHOR)
    public void setEnableAnchor(Integer enableAnchor){
        this.set(FIELD_ENABLEANCHOR, enableAnchor);
    }
    
    /**
     * 获取 支持锚点  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAnchor(){
        Object objValue = this.get(FIELD_ENABLEANCHOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持锚点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAnchorDirty(){
        if(this.contains(FIELD_ENABLEANCHOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持锚点
     */
    @JsonIgnore
    public void resetEnableAnchor(){
        this.reset(FIELD_ENABLEANCHOR);
    }

    /**
     * 设置 支持锚点，详细说明：{@link #FIELD_ENABLEANCHOR}
     * <P>
     * 等同 {@link #setEnableAnchor}
     * @param enableAnchor
     */
    @JsonIgnore
    public PSDEFormDetail enableanchor(Integer enableAnchor){
        this.setEnableAnchor(enableAnchor);
        return this;
    }

     /**
     * 设置 支持锚点，详细说明：{@link #FIELD_ENABLEANCHOR}
     * <P>
     * 等同 {@link #setEnableAnchor}
     * @param enableAnchor
     */
    @JsonIgnore
    public PSDEFormDetail enableanchor(Boolean enableAnchor){
        if(enableAnchor == null){
            this.setEnableAnchor(null);
        }
        else{
            this.setEnableAnchor(enableAnchor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECOND</B>&nbsp;启用条件，指定表单项的静态启用条件，未定义时使用引用的属性界面模式的配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond} 
     */
    public final static String FIELD_ENABLECOND = "enablecond";

    /**
     * 设置 启用条件，详细说明：{@link #FIELD_ENABLECOND}
     * 
     * @param enableCond
     * 
     */
    @JsonProperty(FIELD_ENABLECOND)
    public void setEnableCond(Integer enableCond){
        this.set(FIELD_ENABLECOND, enableCond);
    }
    
    /**
     * 获取 启用条件  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCond(){
        Object objValue = this.get(FIELD_ENABLECOND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCondDirty(){
        if(this.contains(FIELD_ENABLECOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用条件
     */
    @JsonIgnore
    public void resetEnableCond(){
        this.reset(FIELD_ENABLECOND);
    }

    /**
     * 设置 启用条件，详细说明：{@link #FIELD_ENABLECOND}
     * <P>
     * 等同 {@link #setEnableCond}
     * @param enableCond
     */
    @JsonIgnore
    public PSDEFormDetail enablecond(Integer enableCond){
        this.setEnableCond(enableCond);
        return this;
    }

     /**
     * 设置 启用条件，详细说明：{@link #FIELD_ENABLECOND}
     * <P>
     * 等同 {@link #setEnableCond}
     * @param enableCond
     */
    @JsonIgnore
    public PSDEFormDetail enablecond(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond enableCond){
        if(enableCond == null){
            this.setEnableCond(null);
        }
        else{
            this.setEnableCond(enableCond.value);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用列权限控制，指定表单项是否启用列权限控制，未定义时由表单项绑定的实体属性决定，无实体属性则为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用列权限控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableItemPriv(){
        Object objValue = this.get(FIELD_ENABLEITEMPRIV);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用列权限控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableItemPrivDirty(){
        if(this.contains(FIELD_ENABLEITEMPRIV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用列权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEFormDetail enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEFormDetail enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FIELDNAME</B>&nbsp;值属性名称
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_FIELDNAME = "fieldname";

    /**
     * 设置 值属性名称
     * 
     * @param fieldName
     * 
     */
    @JsonProperty(FIELD_FIELDNAME)
    public void setFieldName(String fieldName){
        this.set(FIELD_FIELDNAME, fieldName);
    }
    
    /**
     * 获取 值属性名称  
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
     * 判断 值属性名称 是否指定值，包括空值
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
     * 重置 值属性名称
     */
    @JsonIgnore
    public void resetFieldName(){
        this.reset(FIELD_FIELDNAME);
    }

    /**
     * 设置 值属性名称
     * <P>
     * 等同 {@link #setFieldName}
     * @param fieldName
     */
    @JsonIgnore
    public PSDEFormDetail fieldname(String fieldName){
        this.setFieldName(fieldName);
        return this;
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，表单成员容器布局模式为【Flex布局】时指定横轴对齐方式
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
    public PSDEFormDetail flexalign(String flexAlign){
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
    public PSDEFormDetail flexalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign flexAlign){
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
    public PSDEFormDetail flexbasis(Integer flexBasis){
        this.setFlexBasis(flexBasis);
        return this;
    }

    /**
     * <B>FLEXDIR</B>&nbsp;Flex布局方向，表单成员容器布局模式为【Flex布局】时指定布局方向
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
    public PSDEFormDetail flexdir(String flexDir){
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
    public PSDEFormDetail flexdir(net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir flexDir){
        if(flexDir == null){
            this.setFlexDir(null);
        }
        else{
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    /**
     * <B>FLEXGROW</B>&nbsp;Flex延展值，表单成员父容器布局模式为【Flex布局】时指定成员的延展值，未定义时为【-1】
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
    public PSDEFormDetail flexgrow(Integer flexGrow){
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
    public PSDEFormDetail flexshrink(Integer flexShrink){
        this.setFlexShrink(flexShrink);
        return this;
    }

    /**
     * <B>FLEXVALIGN</B>&nbsp;Flex纵轴对齐，表单成员容器布局模式为【Flex布局】时指定纵轴对齐方式
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
    public PSDEFormDetail flexvalign(String flexVAlign){
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
    public PSDEFormDetail flexvalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign flexVAlign){
        if(flexVAlign == null){
            this.setFlexVAlign(null);
        }
        else{
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    /**
     * <B>FORMTYPE</B>&nbsp;表单类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_FORMTYPE = "formtype";

    /**
     * 设置 表单类型
     * 
     * @param formType
     * 
     */
    @JsonProperty(FIELD_FORMTYPE)
    public void setFormType(String formType){
        this.set(FIELD_FORMTYPE, formType);
    }
    
    /**
     * 获取 表单类型  
     * @return
     */
    @JsonIgnore
    public String getFormType(){
        Object objValue = this.get(FIELD_FORMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTypeDirty(){
        if(this.contains(FIELD_FORMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单类型
     */
    @JsonIgnore
    public void resetFormType(){
        this.reset(FIELD_FORMTYPE);
    }

    /**
     * 设置 表单类型
     * <P>
     * 等同 {@link #setFormType}
     * @param formType
     */
    @JsonIgnore
    public PSDEFormDetail formtype(String formType){
        this.setFormType(formType);
        return this;
    }

    /**
     * <B>GRIDROWID</B>&nbsp;行号，表单成员父容器布局模式为【表格布局】时指定占位行标识，-1为自动，未定义时为【-1】
     */
    public final static String FIELD_GRIDROWID = "gridrowid";

    /**
     * 设置 行号，详细说明：{@link #FIELD_GRIDROWID}
     * 
     * @param gridRowId
     * 
     */
    @JsonProperty(FIELD_GRIDROWID)
    public void setGridRowId(Integer gridRowId){
        this.set(FIELD_GRIDROWID, gridRowId);
    }
    
    /**
     * 获取 行号  
     * @return
     */
    @JsonIgnore
    public Integer getGridRowId(){
        Object objValue = this.get(FIELD_GRIDROWID);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridRowIdDirty(){
        if(this.contains(FIELD_GRIDROWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行号
     */
    @JsonIgnore
    public void resetGridRowId(){
        this.reset(FIELD_GRIDROWID);
    }

    /**
     * 设置 行号，详细说明：{@link #FIELD_GRIDROWID}
     * <P>
     * 等同 {@link #setGridRowId}
     * @param gridRowId
     */
    @JsonIgnore
    public PSDEFormDetail gridrowid(Integer gridRowId){
        this.setGridRowId(gridRowId);
        return this;
    }

    /**
     * <B>HALIGN</B>&nbsp;水平对齐
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign} 
     */
    public final static String FIELD_HALIGN = "halign";

    /**
     * 设置 水平对齐
     * 
     * @param hAlign
     * 
     */
    @JsonProperty(FIELD_HALIGN)
    public void setHAlign(String hAlign){
        this.set(FIELD_HALIGN, hAlign);
    }
    
    /**
     * 获取 水平对齐  
     * @return
     */
    @JsonIgnore
    public String getHAlign(){
        Object objValue = this.get(FIELD_HALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 水平对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHAlignDirty(){
        if(this.contains(FIELD_HALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 水平对齐
     */
    @JsonIgnore
    public void resetHAlign(){
        this.reset(FIELD_HALIGN);
    }

    /**
     * 设置 水平对齐
     * <P>
     * 等同 {@link #setHAlign}
     * @param hAlign
     */
    @JsonIgnore
    public PSDEFormDetail halign(String hAlign){
        this.setHAlign(hAlign);
        return this;
    }

     /**
     * 设置 水平对齐
     * <P>
     * 等同 {@link #setHAlign}
     * @param hAlign
     */
    @JsonIgnore
    public PSDEFormDetail halign(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlign){
        if(hAlign == null){
            this.setHAlign(null);
        }
        else{
            this.setHAlign(hAlign.value);
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
    public PSDEFormDetail halignself(String hAlignSelf){
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
    public PSDEFormDetail halignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlignSelf){
        if(hAlignSelf == null){
            this.setHAlignSelf(null);
        }
        else{
            this.setHAlignSelf(hAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定表单成员的高度，0为自动计算，未定义时为【0】
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
    public PSDEFormDetail height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>HEIGHTMODE</B>&nbsp;高度模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.HeightMode} 
     */
    public final static String FIELD_HEIGHTMODE = "heightmode";

    /**
     * 设置 高度模式
     * 
     * @param heightMode
     * 
     */
    @JsonProperty(FIELD_HEIGHTMODE)
    public void setHeightMode(String heightMode){
        this.set(FIELD_HEIGHTMODE, heightMode);
    }
    
    /**
     * 获取 高度模式  
     * @return
     */
    @JsonIgnore
    public String getHeightMode(){
        Object objValue = this.get(FIELD_HEIGHTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 高度模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightModeDirty(){
        if(this.contains(FIELD_HEIGHTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 高度模式
     */
    @JsonIgnore
    public void resetHeightMode(){
        this.reset(FIELD_HEIGHTMODE);
    }

    /**
     * 设置 高度模式
     * <P>
     * 等同 {@link #setHeightMode}
     * @param heightMode
     */
    @JsonIgnore
    public PSDEFormDetail heightmode(String heightMode){
        this.setHeightMode(heightMode);
        return this;
    }

     /**
     * 设置 高度模式
     * <P>
     * 等同 {@link #setHeightMode}
     * @param heightMode
     */
    @JsonIgnore
    public PSDEFormDetail heightmode(net.ibizsys.psmodel.core.util.PSModelEnums.HeightMode heightMode){
        if(heightMode == null){
            this.setHeightMode(null);
        }
        else{
            this.setHeightMode(heightMode.value);
        }
        return this;
    }

    /**
     * <B>HTMLCONTENT</B>&nbsp;HTML内容，直接内容项内容类型为【Html内容】时指定的Html内容，未指定时使用指定的系统资源定义内容
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
    public PSDEFormDetail htmlcontent(String htmlContent){
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
    public PSDEFormDetail htmlpageurl(String htmlPageUrl){
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    /**
     * <B>ICONALIGN</B>&nbsp;图标位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ButtonIconAlign} 
     */
    public final static String FIELD_ICONALIGN = "iconalign";

    /**
     * 设置 图标位置
     * 
     * @param iconAlign
     * 
     */
    @JsonProperty(FIELD_ICONALIGN)
    public void setIconAlign(String iconAlign){
        this.set(FIELD_ICONALIGN, iconAlign);
    }
    
    /**
     * 获取 图标位置  
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
     * 判断 图标位置 是否指定值，包括空值
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
     * 重置 图标位置
     */
    @JsonIgnore
    public void resetIconAlign(){
        this.reset(FIELD_ICONALIGN);
    }

    /**
     * 设置 图标位置
     * <P>
     * 等同 {@link #setIconAlign}
     * @param iconAlign
     */
    @JsonIgnore
    public PSDEFormDetail iconalign(String iconAlign){
        this.setIconAlign(iconAlign);
        return this;
    }

     /**
     * 设置 图标位置
     * <P>
     * 等同 {@link #setIconAlign}
     * @param iconAlign
     */
    @JsonIgnore
    public PSDEFormDetail iconalign(net.ibizsys.psmodel.core.util.PSModelEnums.ButtonIconAlign iconAlign){
        if(iconAlign == null){
            this.setIconAlign(null);
        }
        else{
            this.setIconAlign(iconAlign.value);
        }
        return this;
    }

    /**
     * <B>IGNOREINPUT</B>&nbsp;忽略输入值，指定表单项的忽略输入值的方式，如表单项启用代码值转换文本处理则直接为【建立及更新】，未定义时（1）如引用的属性界面模式存在忽略输入值配置则使用该配置（2）如成员父容器存在忽略输入值配置则使用该配置（3）如表单项属性为系统属性则为【建立及更新】（4）如以上条件都不满足则为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemIgnoreMode} 
     */
    public final static String FIELD_IGNOREINPUT = "ignoreinput";

    /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * 
     * @param ignoreInput
     * 
     */
    @JsonProperty(FIELD_IGNOREINPUT)
    public void setIgnoreInput(Integer ignoreInput){
        this.set(FIELD_IGNOREINPUT, ignoreInput);
    }
    
    /**
     * 获取 忽略输入值  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreInput(){
        Object objValue = this.get(FIELD_IGNOREINPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略输入值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreInputDirty(){
        if(this.contains(FIELD_IGNOREINPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略输入值
     */
    @JsonIgnore
    public void resetIgnoreInput(){
        this.reset(FIELD_IGNOREINPUT);
    }

    /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDEFormDetail ignoreinput(Integer ignoreInput){
        this.setIgnoreInput(ignoreInput);
        return this;
    }

     /**
     * 设置 忽略输入值，详细说明：{@link #FIELD_IGNOREINPUT}
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDEFormDetail ignoreinput(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemIgnoreMode ignoreInput){
        if(ignoreInput == null){
            this.setIgnoreInput(null);
        }
        else{
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    /**
     * <B>INSERTPOS</B>&nbsp;插入位置
     */
    public final static String FIELD_INSERTPOS = "insertpos";

    /**
     * 设置 插入位置
     * 
     * @param insertPos
     * 
     */
    @JsonProperty(FIELD_INSERTPOS)
    public void setInsertPos(Integer insertPos){
        this.set(FIELD_INSERTPOS, insertPos);
    }
    
    /**
     * 获取 插入位置  
     * @return
     */
    @JsonIgnore
    public Integer getInsertPos(){
        Object objValue = this.get(FIELD_INSERTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 插入位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInsertPosDirty(){
        if(this.contains(FIELD_INSERTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插入位置
     */
    @JsonIgnore
    public void resetInsertPos(){
        this.reset(FIELD_INSERTPOS);
    }

    /**
     * 设置 插入位置
     * <P>
     * 等同 {@link #setInsertPos}
     * @param insertPos
     */
    @JsonIgnore
    public PSDEFormDetail insertpos(Integer insertPos){
        this.setInsertPos(insertPos);
        return this;
    }

    /**
     * <B>ITEMPSACHANDLERID</B>&nbsp;表单项处理对象，指定表单项界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_ITEMPSACHANDLERID = "itempsachandlerid";

    /**
     * 设置 表单项处理对象，详细说明：{@link #FIELD_ITEMPSACHANDLERID}
     * 
     * @param itemPSACHandlerId
     * 
     */
    @JsonProperty(FIELD_ITEMPSACHANDLERID)
    public void setItemPSACHandlerId(String itemPSACHandlerId){
        this.set(FIELD_ITEMPSACHANDLERID, itemPSACHandlerId);
    }
    
    /**
     * 获取 表单项处理对象  
     * @return
     */
    @JsonIgnore
    public String getItemPSACHandlerId(){
        Object objValue = this.get(FIELD_ITEMPSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSACHandlerIdDirty(){
        if(this.contains(FIELD_ITEMPSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项处理对象
     */
    @JsonIgnore
    public void resetItemPSACHandlerId(){
        this.reset(FIELD_ITEMPSACHANDLERID);
    }

    /**
     * 设置 表单项处理对象，详细说明：{@link #FIELD_ITEMPSACHANDLERID}
     * <P>
     * 等同 {@link #setItemPSACHandlerId}
     * @param itemPSACHandlerId
     */
    @JsonIgnore
    public PSDEFormDetail itempsachandlerid(String itemPSACHandlerId){
        this.setItemPSACHandlerId(itemPSACHandlerId);
        return this;
    }

    /**
     * 设置 表单项处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail itempsachandlerid(PSACHandler pSACHandler){
        if(pSACHandler == null){
            this.setItemPSACHandlerId(null);
            this.setItemPSACHandlerName(null);
        }
        else{
            this.setItemPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setItemPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>ITEMPSACHANDLERNAME</B>&nbsp;表单项处理对象，指定表单项界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSACHANDLERID}
     */
    public final static String FIELD_ITEMPSACHANDLERNAME = "itempsachandlername";

    /**
     * 设置 表单项处理对象，详细说明：{@link #FIELD_ITEMPSACHANDLERNAME}
     * 
     * @param itemPSACHandlerName
     * 
     */
    @JsonProperty(FIELD_ITEMPSACHANDLERNAME)
    public void setItemPSACHandlerName(String itemPSACHandlerName){
        this.set(FIELD_ITEMPSACHANDLERNAME, itemPSACHandlerName);
    }
    
    /**
     * 获取 表单项处理对象  
     * @return
     */
    @JsonIgnore
    public String getItemPSACHandlerName(){
        Object objValue = this.get(FIELD_ITEMPSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSACHandlerNameDirty(){
        if(this.contains(FIELD_ITEMPSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项处理对象
     */
    @JsonIgnore
    public void resetItemPSACHandlerName(){
        this.reset(FIELD_ITEMPSACHANDLERNAME);
    }

    /**
     * 设置 表单项处理对象，详细说明：{@link #FIELD_ITEMPSACHANDLERNAME}
     * <P>
     * 等同 {@link #setItemPSACHandlerName}
     * @param itemPSACHandlerName
     */
    @JsonIgnore
    public PSDEFormDetail itempsachandlername(String itemPSACHandlerName){
        this.setItemPSACHandlerName(itemPSACHandlerName);
        return this;
    }

    /**
     * <B>ITEMSTATES</B>&nbsp;表单项默认状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelFieldState} 
     */
    public final static String FIELD_ITEMSTATES = "itemstates";

    /**
     * 设置 表单项默认状态
     * 
     * @param itemStates
     * 
     */
    @JsonProperty(FIELD_ITEMSTATES)
    public void setItemStates(Integer itemStates){
        this.set(FIELD_ITEMSTATES, itemStates);
    }
    
    /**
     * 获取 表单项默认状态  
     * @return
     */
    @JsonIgnore
    public Integer getItemStates(){
        Object objValue = this.get(FIELD_ITEMSTATES);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表单项默认状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemStatesDirty(){
        if(this.contains(FIELD_ITEMSTATES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项默认状态
     */
    @JsonIgnore
    public void resetItemStates(){
        this.reset(FIELD_ITEMSTATES);
    }

    /**
     * 设置 表单项默认状态
     * <P>
     * 等同 {@link #setItemStates}
     * @param itemStates
     */
    @JsonIgnore
    public PSDEFormDetail itemstates(Integer itemStates){
        this.setItemStates(itemStates);
        return this;
    }

     /**
     * 设置 表单项默认状态
     * <P>
     * 等同 {@link #setItemStates}
     * @param itemStates
     */
    @JsonIgnore
    public PSDEFormDetail itemstates(net.ibizsys.psmodel.core.util.PSModelEnums.PanelFieldState[] itemStates){
        if(itemStates == null || itemStates.length == 0){
            this.setItemStates(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.PanelFieldState _item : itemStates){
                _value |= _item.value;
            }
            this.setItemStates(_value);
        }
        return this;
    }

    /**
     * <B>LABELCOLSPAN</B>&nbsp;标题列数，指定栅格布局时表单项容器中标签的占位列数，此参数为早期模板保留，现已不再使用
     */
    public final static String FIELD_LABELCOLSPAN = "labelcolspan";

    /**
     * 设置 标题列数，详细说明：{@link #FIELD_LABELCOLSPAN}
     * 
     * @param labelColSpan
     * 
     */
    @JsonProperty(FIELD_LABELCOLSPAN)
    public void setLabelColSpan(Integer labelColSpan){
        this.set(FIELD_LABELCOLSPAN, labelColSpan);
    }
    
    /**
     * 获取 标题列数  
     * @return
     */
    @JsonIgnore
    public Integer getLabelColSpan(){
        Object objValue = this.get(FIELD_LABELCOLSPAN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标题列数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelColSpanDirty(){
        if(this.contains(FIELD_LABELCOLSPAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题列数
     */
    @JsonIgnore
    public void resetLabelColSpan(){
        this.reset(FIELD_LABELCOLSPAN);
    }

    /**
     * 设置 标题列数，详细说明：{@link #FIELD_LABELCOLSPAN}
     * <P>
     * 等同 {@link #setLabelColSpan}
     * @param labelColSpan
     */
    @JsonIgnore
    public PSDEFormDetail labelcolspan(Integer labelColSpan){
        this.setLabelColSpan(labelColSpan);
        return this;
    }

    /**
     * <B>LABELCOLSPAN2</B>&nbsp;首列标签列数，指定栅格布局时表单项容器中首列标签的占位列数，此参数为早期模板保留，现已不再使用
     */
    public final static String FIELD_LABELCOLSPAN2 = "labelcolspan2";

    /**
     * 设置 首列标签列数，详细说明：{@link #FIELD_LABELCOLSPAN2}
     * 
     * @param labelColSpan2
     * 
     */
    @JsonProperty(FIELD_LABELCOLSPAN2)
    public void setLabelColSpan2(Integer labelColSpan2){
        this.set(FIELD_LABELCOLSPAN2, labelColSpan2);
    }
    
    /**
     * 获取 首列标签列数  
     * @return
     */
    @JsonIgnore
    public Integer getLabelColSpan2(){
        Object objValue = this.get(FIELD_LABELCOLSPAN2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 首列标签列数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelColSpan2Dirty(){
        if(this.contains(FIELD_LABELCOLSPAN2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 首列标签列数
     */
    @JsonIgnore
    public void resetLabelColSpan2(){
        this.reset(FIELD_LABELCOLSPAN2);
    }

    /**
     * 设置 首列标签列数，详细说明：{@link #FIELD_LABELCOLSPAN2}
     * <P>
     * 等同 {@link #setLabelColSpan2}
     * @param labelColSpan2
     */
    @JsonIgnore
    public PSDEFormDetail labelcolspan2(Integer labelColSpan2){
        this.setLabelColSpan2(labelColSpan2);
        return this;
    }

    /**
     * <B>LABELDYNACLASS</B>&nbsp;标签动态样式表
     */
    public final static String FIELD_LABELDYNACLASS = "labeldynaclass";

    /**
     * 设置 标签动态样式表
     * 
     * @param labelDynaClass
     * 
     */
    @JsonProperty(FIELD_LABELDYNACLASS)
    public void setLabelDynaClass(String labelDynaClass){
        this.set(FIELD_LABELDYNACLASS, labelDynaClass);
    }
    
    /**
     * 获取 标签动态样式表  
     * @return
     */
    @JsonIgnore
    public String getLabelDynaClass(){
        Object objValue = this.get(FIELD_LABELDYNACLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标签动态样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelDynaClassDirty(){
        if(this.contains(FIELD_LABELDYNACLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签动态样式表
     */
    @JsonIgnore
    public void resetLabelDynaClass(){
        this.reset(FIELD_LABELDYNACLASS);
    }

    /**
     * 设置 标签动态样式表
     * <P>
     * 等同 {@link #setLabelDynaClass}
     * @param labelDynaClass
     */
    @JsonIgnore
    public PSDEFormDetail labeldynaclass(String labelDynaClass){
        this.setLabelDynaClass(labelDynaClass);
        return this;
    }

    /**
     * <B>LABELPOS</B>&nbsp;标签位置，指定表单项标签的位置，未定义时为【左边】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LabelPos} 
     */
    public final static String FIELD_LABELPOS = "labelpos";

    /**
     * 设置 标签位置，详细说明：{@link #FIELD_LABELPOS}
     * 
     * @param labelPos
     * 
     */
    @JsonProperty(FIELD_LABELPOS)
    public void setLabelPos(String labelPos){
        this.set(FIELD_LABELPOS, labelPos);
    }
    
    /**
     * 获取 标签位置  
     * @return
     */
    @JsonIgnore
    public String getLabelPos(){
        Object objValue = this.get(FIELD_LABELPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标签位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelPosDirty(){
        if(this.contains(FIELD_LABELPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签位置
     */
    @JsonIgnore
    public void resetLabelPos(){
        this.reset(FIELD_LABELPOS);
    }

    /**
     * 设置 标签位置，详细说明：{@link #FIELD_LABELPOS}
     * <P>
     * 等同 {@link #setLabelPos}
     * @param labelPos
     */
    @JsonIgnore
    public PSDEFormDetail labelpos(String labelPos){
        this.setLabelPos(labelPos);
        return this;
    }

     /**
     * 设置 标签位置，详细说明：{@link #FIELD_LABELPOS}
     * <P>
     * 等同 {@link #setLabelPos}
     * @param labelPos
     */
    @JsonIgnore
    public PSDEFormDetail labelpos(net.ibizsys.psmodel.core.util.PSModelEnums.LabelPos labelPos){
        if(labelPos == null){
            this.setLabelPos(null);
        }
        else{
            this.setLabelPos(labelPos.value);
        }
        return this;
    }

    /**
     * <B>LABELPSSYSCSSID</B>&nbsp;标题样式表，指定标题使用的界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_LABELPSSYSCSSID = "labelpssyscssid";

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSID}
     * 
     * @param labelPSSysCssId
     * 
     */
    @JsonProperty(FIELD_LABELPSSYSCSSID)
    public void setLabelPSSysCssId(String labelPSSysCssId){
        this.set(FIELD_LABELPSSYSCSSID, labelPSSysCssId);
    }
    
    /**
     * 获取 标题样式表  
     * @return
     */
    @JsonIgnore
    public String getLabelPSSysCssId(){
        Object objValue = this.get(FIELD_LABELPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelPSSysCssIdDirty(){
        if(this.contains(FIELD_LABELPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题样式表
     */
    @JsonIgnore
    public void resetLabelPSSysCssId(){
        this.reset(FIELD_LABELPSSYSCSSID);
    }

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSID}
     * <P>
     * 等同 {@link #setLabelPSSysCssId}
     * @param labelPSSysCssId
     */
    @JsonIgnore
    public PSDEFormDetail labelpssyscssid(String labelPSSysCssId){
        this.setLabelPSSysCssId(labelPSSysCssId);
        return this;
    }

    /**
     * 设置 标题样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLabelPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail labelpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setLabelPSSysCssId(null);
            this.setLabelPSSysCssName(null);
        }
        else{
            this.setLabelPSSysCssId(pSSysCss.getPSSysCssId());
            this.setLabelPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>LABELPSSYSCSSNAME</B>&nbsp;标题样式表，指定标题使用的界面样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LABELPSSYSCSSID}
     */
    public final static String FIELD_LABELPSSYSCSSNAME = "labelpssyscssname";

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSNAME}
     * 
     * @param labelPSSysCssName
     * 
     */
    @JsonProperty(FIELD_LABELPSSYSCSSNAME)
    public void setLabelPSSysCssName(String labelPSSysCssName){
        this.set(FIELD_LABELPSSYSCSSNAME, labelPSSysCssName);
    }
    
    /**
     * 获取 标题样式表  
     * @return
     */
    @JsonIgnore
    public String getLabelPSSysCssName(){
        Object objValue = this.get(FIELD_LABELPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelPSSysCssNameDirty(){
        if(this.contains(FIELD_LABELPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题样式表
     */
    @JsonIgnore
    public void resetLabelPSSysCssName(){
        this.reset(FIELD_LABELPSSYSCSSNAME);
    }

    /**
     * 设置 标题样式表，详细说明：{@link #FIELD_LABELPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setLabelPSSysCssName}
     * @param labelPSSysCssName
     */
    @JsonIgnore
    public PSDEFormDetail labelpssyscssname(String labelPSSysCssName){
        this.setLabelPSSysCssName(labelPSSysCssName);
        return this;
    }

    /**
     * <B>LABELRAWCSSSTYLE</B>&nbsp;标签直接样式
     */
    public final static String FIELD_LABELRAWCSSSTYLE = "labelrawcssstyle";

    /**
     * 设置 标签直接样式
     * 
     * @param labelRawCssStyle
     * 
     */
    @JsonProperty(FIELD_LABELRAWCSSSTYLE)
    public void setLabelRawCssStyle(String labelRawCssStyle){
        this.set(FIELD_LABELRAWCSSSTYLE, labelRawCssStyle);
    }
    
    /**
     * 获取 标签直接样式  
     * @return
     */
    @JsonIgnore
    public String getLabelRawCssStyle(){
        Object objValue = this.get(FIELD_LABELRAWCSSSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标签直接样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelRawCssStyleDirty(){
        if(this.contains(FIELD_LABELRAWCSSSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签直接样式
     */
    @JsonIgnore
    public void resetLabelRawCssStyle(){
        this.reset(FIELD_LABELRAWCSSSTYLE);
    }

    /**
     * 设置 标签直接样式
     * <P>
     * 等同 {@link #setLabelRawCssStyle}
     * @param labelRawCssStyle
     */
    @JsonIgnore
    public PSDEFormDetail labelrawcssstyle(String labelRawCssStyle){
        this.setLabelRawCssStyle(labelRawCssStyle);
        return this;
    }

    /**
     * <B>LABELWIDTH</B>&nbsp;标签宽度，指定表单项标签的宽度，未定义时使用表单默认标签宽度
     */
    public final static String FIELD_LABELWIDTH = "labelwidth";

    /**
     * 设置 标签宽度，详细说明：{@link #FIELD_LABELWIDTH}
     * 
     * @param labelWidth
     * 
     */
    @JsonProperty(FIELD_LABELWIDTH)
    public void setLabelWidth(Integer labelWidth){
        this.set(FIELD_LABELWIDTH, labelWidth);
    }
    
    /**
     * 获取 标签宽度  
     * @return
     */
    @JsonIgnore
    public Integer getLabelWidth(){
        Object objValue = this.get(FIELD_LABELWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标签宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLabelWidthDirty(){
        if(this.contains(FIELD_LABELWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标签宽度
     */
    @JsonIgnore
    public void resetLabelWidth(){
        this.reset(FIELD_LABELWIDTH);
    }

    /**
     * 设置 标签宽度，详细说明：{@link #FIELD_LABELWIDTH}
     * <P>
     * 等同 {@link #setLabelWidth}
     * @param labelWidth
     */
    @JsonIgnore
    public PSDEFormDetail labelwidth(Integer labelWidth){
        this.setLabelWidth(labelWidth);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定表单成员的布局容器模式
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
    public PSDEFormDetail layoutmode(String layoutMode){
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
    public PSDEFormDetail layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    /**
     * <B>LEVELTAG</B>&nbsp;标题值项，指定表单成员的动态标题值项，值项必须是当前表单的表单项
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_LEVELTAG = "leveltag";

    /**
     * 设置 标题值项，详细说明：{@link #FIELD_LEVELTAG}
     * 
     * @param levelTag
     * 
     */
    @JsonProperty(FIELD_LEVELTAG)
    public void setLevelTag(String levelTag){
        this.set(FIELD_LEVELTAG, levelTag);
    }
    
    /**
     * 获取 标题值项  
     * @return
     */
    @JsonIgnore
    public String getLevelTag(){
        Object objValue = this.get(FIELD_LEVELTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题值项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLevelTagDirty(){
        if(this.contains(FIELD_LEVELTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题值项
     */
    @JsonIgnore
    public void resetLevelTag(){
        this.reset(FIELD_LEVELTAG);
    }

    /**
     * 设置 标题值项，详细说明：{@link #FIELD_LEVELTAG}
     * <P>
     * 等同 {@link #setLevelTag}
     * @param levelTag
     */
    @JsonIgnore
    public PSDEFormDetail leveltag(String levelTag){
        this.setLevelTag(levelTag);
        return this;
    }

    /**
     * <B>LINKPSDEVIEWID</B>&nbsp;数据链接视图，指定表单项引用数据的链接视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_LINKPSDEVIEWID = "linkpsdeviewid";

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * 
     * @param linkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWID)
    public void setLinkPSDEViewId(String linkPSDEViewId){
        this.set(FIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }
    
    /**
     * 获取 数据链接视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewId(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据链接视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewId(){
        this.reset(FIELD_LINKPSDEVIEWID);
    }

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param linkPSDEViewId
     */
    @JsonIgnore
    public PSDEFormDetail linkpsdeviewid(String linkPSDEViewId){
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    /**
     * 设置 数据链接视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail linkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        }
        else{
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWNAME</B>&nbsp;数据链接视图，指定表单项引用数据的链接视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEVIEWID}
     */
    public final static String FIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * 
     * @param linkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWNAME)
    public void setLinkPSDEViewName(String linkPSDEViewName){
        this.set(FIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }
    
    /**
     * 获取 数据链接视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewName(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据链接视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewName(){
        this.reset(FIELD_LINKPSDEVIEWNAME);
    }

    /**
     * 设置 数据链接视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setLinkPSDEViewName}
     * @param linkPSDEViewName
     */
    @JsonIgnore
    public PSDEFormDetail linkpsdeviewname(String linkPSDEViewName){
        this.setLinkPSDEViewName(linkPSDEViewName);
        return this;
    }

    /**
     * <B>MARGIN</B>&nbsp;外框间隔，指定表单成员的外边距，注意：此配置后续将被取消，建议通过使用界面样式表完成对应的功能
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MARGIN = "margin";

    /**
     * 设置 外框间隔，详细说明：{@link #FIELD_MARGIN}
     * 
     * @param margin
     * 
     */
    @JsonProperty(FIELD_MARGIN)
    public void setMargin(String margin){
        this.set(FIELD_MARGIN, margin);
    }
    
    /**
     * 获取 外框间隔  
     * @return
     */
    @JsonIgnore
    public String getMargin(){
        Object objValue = this.get(FIELD_MARGIN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外框间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMarginDirty(){
        if(this.contains(FIELD_MARGIN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外框间隔
     */
    @JsonIgnore
    public void resetMargin(){
        this.reset(FIELD_MARGIN);
    }

    /**
     * 设置 外框间隔，详细说明：{@link #FIELD_MARGIN}
     * <P>
     * 等同 {@link #setMargin}
     * @param margin
     */
    @JsonIgnore
    public PSDEFormDetail margin(String margin){
        this.setMargin(margin);
        return this;
    }

    /**
     * <B>MASKINFO</B>&nbsp;遮罩信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_MASKINFO = "maskinfo";

    /**
     * 设置 遮罩信息
     * 
     * @param maskInfo
     * 
     */
    @JsonProperty(FIELD_MASKINFO)
    public void setMaskInfo(String maskInfo){
        this.set(FIELD_MASKINFO, maskInfo);
    }
    
    /**
     * 获取 遮罩信息  
     * @return
     */
    @JsonIgnore
    public String getMaskInfo(){
        Object objValue = this.get(FIELD_MASKINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 遮罩信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaskInfoDirty(){
        if(this.contains(FIELD_MASKINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 遮罩信息
     */
    @JsonIgnore
    public void resetMaskInfo(){
        this.reset(FIELD_MASKINFO);
    }

    /**
     * 设置 遮罩信息
     * <P>
     * 等同 {@link #setMaskInfo}
     * @param maskInfo
     */
    @JsonIgnore
    public PSDEFormDetail maskinfo(String maskInfo){
        this.setMaskInfo(maskInfo);
        return this;
    }

    /**
     * <B>MASKMODE</B>&nbsp;遮罩模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormDRUIPartMaskMode} 
     */
    public final static String FIELD_MASKMODE = "maskmode";

    /**
     * 设置 遮罩模式
     * 
     * @param maskMode
     * 
     */
    @JsonProperty(FIELD_MASKMODE)
    public void setMaskMode(Integer maskMode){
        this.set(FIELD_MASKMODE, maskMode);
    }
    
    /**
     * 获取 遮罩模式  
     * @return
     */
    @JsonIgnore
    public Integer getMaskMode(){
        Object objValue = this.get(FIELD_MASKMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 遮罩模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaskModeDirty(){
        if(this.contains(FIELD_MASKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 遮罩模式
     */
    @JsonIgnore
    public void resetMaskMode(){
        this.reset(FIELD_MASKMODE);
    }

    /**
     * 设置 遮罩模式
     * <P>
     * 等同 {@link #setMaskMode}
     * @param maskMode
     */
    @JsonIgnore
    public PSDEFormDetail maskmode(Integer maskMode){
        this.setMaskMode(maskMode);
        return this;
    }

     /**
     * 设置 遮罩模式
     * <P>
     * 等同 {@link #setMaskMode}
     * @param maskMode
     */
    @JsonIgnore
    public PSDEFormDetail maskmode(net.ibizsys.psmodel.core.util.PSModelEnums.FormDRUIPartMaskMode maskMode){
        if(maskMode == null){
            this.setMaskMode(null);
        }
        else{
            this.setMaskMode(maskMode.value);
        }
        return this;
    }

    /**
     * <B>MASKPSLANRESID</B>&nbsp;遮罩语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_MASKPSLANRESID = "maskpslanresid";

    /**
     * 设置 遮罩语言资源
     * 
     * @param maskPSLanResId
     * 
     */
    @JsonProperty(FIELD_MASKPSLANRESID)
    public void setMaskPSLanResId(String maskPSLanResId){
        this.set(FIELD_MASKPSLANRESID, maskPSLanResId);
    }
    
    /**
     * 获取 遮罩语言资源  
     * @return
     */
    @JsonIgnore
    public String getMaskPSLanResId(){
        Object objValue = this.get(FIELD_MASKPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 遮罩语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaskPSLanResIdDirty(){
        if(this.contains(FIELD_MASKPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 遮罩语言资源
     */
    @JsonIgnore
    public void resetMaskPSLanResId(){
        this.reset(FIELD_MASKPSLANRESID);
    }

    /**
     * 设置 遮罩语言资源
     * <P>
     * 等同 {@link #setMaskPSLanResId}
     * @param maskPSLanResId
     */
    @JsonIgnore
    public PSDEFormDetail maskpslanresid(String maskPSLanResId){
        this.setMaskPSLanResId(maskPSLanResId);
        return this;
    }

    /**
     * 设置 遮罩语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMaskPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail maskpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setMaskPSLanResId(null);
            this.setMaskPSLanResName(null);
        }
        else{
            this.setMaskPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMaskPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>MASKPSLANRESNAME</B>&nbsp;遮罩语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MASKPSLANRESID}
     */
    public final static String FIELD_MASKPSLANRESNAME = "maskpslanresname";

    /**
     * 设置 遮罩语言资源
     * 
     * @param maskPSLanResName
     * 
     */
    @JsonProperty(FIELD_MASKPSLANRESNAME)
    public void setMaskPSLanResName(String maskPSLanResName){
        this.set(FIELD_MASKPSLANRESNAME, maskPSLanResName);
    }
    
    /**
     * 获取 遮罩语言资源  
     * @return
     */
    @JsonIgnore
    public String getMaskPSLanResName(){
        Object objValue = this.get(FIELD_MASKPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 遮罩语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaskPSLanResNameDirty(){
        if(this.contains(FIELD_MASKPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 遮罩语言资源
     */
    @JsonIgnore
    public void resetMaskPSLanResName(){
        this.reset(FIELD_MASKPSLANRESNAME);
    }

    /**
     * 设置 遮罩语言资源
     * <P>
     * 等同 {@link #setMaskPSLanResName}
     * @param maskPSLanResName
     */
    @JsonIgnore
    public PSDEFormDetail maskpslanresname(String maskPSLanResName){
        this.setMaskPSLanResName(maskPSLanResName);
        return this;
    }

    /**
     * <B>MDCTRLTYPE</B>&nbsp;多数据部件类型，表单成员类型为【多数据部件】时指定多数据部件的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailMDCtrlType} 
     */
    public final static String FIELD_MDCTRLTYPE = "mdctrltype";

    /**
     * 设置 多数据部件类型，详细说明：{@link #FIELD_MDCTRLTYPE}
     * 
     * @param mDCtrlType
     * 
     */
    @JsonProperty(FIELD_MDCTRLTYPE)
    public void setMDCtrlType(String mDCtrlType){
        this.set(FIELD_MDCTRLTYPE, mDCtrlType);
    }
    
    /**
     * 获取 多数据部件类型  
     * @return
     */
    @JsonIgnore
    public String getMDCtrlType(){
        Object objValue = this.get(FIELD_MDCTRLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据部件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDCtrlTypeDirty(){
        if(this.contains(FIELD_MDCTRLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据部件类型
     */
    @JsonIgnore
    public void resetMDCtrlType(){
        this.reset(FIELD_MDCTRLTYPE);
    }

    /**
     * 设置 多数据部件类型，详细说明：{@link #FIELD_MDCTRLTYPE}
     * <P>
     * 等同 {@link #setMDCtrlType}
     * @param mDCtrlType
     */
    @JsonIgnore
    public PSDEFormDetail mdctrltype(String mDCtrlType){
        this.setMDCtrlType(mDCtrlType);
        return this;
    }

     /**
     * 设置 多数据部件类型，详细说明：{@link #FIELD_MDCTRLTYPE}
     * <P>
     * 等同 {@link #setMDCtrlType}
     * @param mDCtrlType
     */
    @JsonIgnore
    public PSDEFormDetail mdctrltype(net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailMDCtrlType mDCtrlType){
        if(mDCtrlType == null){
            this.setMDCtrlType(null);
        }
        else{
            this.setMDCtrlType(mDCtrlType.value);
        }
        return this;
    }

    /**
     * <B>MDPSDEDATAVIEWID</B>&nbsp;多数据卡片视图部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataView} 
     */
    public final static String FIELD_MDPSDEDATAVIEWID = "mdpsdedataviewid";

    /**
     * 设置 多数据卡片视图部件
     * 
     * @param mDPSDEDataViewId
     * 
     */
    @JsonProperty(FIELD_MDPSDEDATAVIEWID)
    public void setMDPSDEDataViewId(String mDPSDEDataViewId){
        this.set(FIELD_MDPSDEDATAVIEWID, mDPSDEDataViewId);
    }
    
    /**
     * 获取 多数据卡片视图部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEDataViewId(){
        Object objValue = this.get(FIELD_MDPSDEDATAVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据卡片视图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEDataViewIdDirty(){
        if(this.contains(FIELD_MDPSDEDATAVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据卡片视图部件
     */
    @JsonIgnore
    public void resetMDPSDEDataViewId(){
        this.reset(FIELD_MDPSDEDATAVIEWID);
    }

    /**
     * 设置 多数据卡片视图部件
     * <P>
     * 等同 {@link #setMDPSDEDataViewId}
     * @param mDPSDEDataViewId
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdedataviewid(String mDPSDEDataViewId){
        this.setMDPSDEDataViewId(mDPSDEDataViewId);
        return this;
    }

    /**
     * 设置 多数据卡片视图部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSDEDataViewId}
     * @param pSDEDataView 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdedataviewid(PSDEDataView pSDEDataView){
        if(pSDEDataView == null){
            this.setMDPSDEDataViewId(null);
            this.setMDPSDEDataViewName(null);
        }
        else{
            this.setMDPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setMDPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    /**
     * <B>MDPSDEDATAVIEWNAME</B>&nbsp;多数据卡片视图部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSDEDATAVIEWID}
     */
    public final static String FIELD_MDPSDEDATAVIEWNAME = "mdpsdedataviewname";

    /**
     * 设置 多数据卡片视图部件
     * 
     * @param mDPSDEDataViewName
     * 
     */
    @JsonProperty(FIELD_MDPSDEDATAVIEWNAME)
    public void setMDPSDEDataViewName(String mDPSDEDataViewName){
        this.set(FIELD_MDPSDEDATAVIEWNAME, mDPSDEDataViewName);
    }
    
    /**
     * 获取 多数据卡片视图部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEDataViewName(){
        Object objValue = this.get(FIELD_MDPSDEDATAVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据卡片视图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEDataViewNameDirty(){
        if(this.contains(FIELD_MDPSDEDATAVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据卡片视图部件
     */
    @JsonIgnore
    public void resetMDPSDEDataViewName(){
        this.reset(FIELD_MDPSDEDATAVIEWNAME);
    }

    /**
     * 设置 多数据卡片视图部件
     * <P>
     * 等同 {@link #setMDPSDEDataViewName}
     * @param mDPSDEDataViewName
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdedataviewname(String mDPSDEDataViewName){
        this.setMDPSDEDataViewName(mDPSDEDataViewName);
        return this;
    }

    /**
     * <B>MDPSDEFORMID</B>&nbsp;多数据表单部件，表单多数据部件类型为【表单】时指定循环绘制的表单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MDPSDEFORMID = "mdpsdeformid";

    /**
     * 设置 多数据表单部件，详细说明：{@link #FIELD_MDPSDEFORMID}
     * 
     * @param mDPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MDPSDEFORMID)
    public void setMDPSDEFormId(String mDPSDEFormId){
        this.set(FIELD_MDPSDEFORMID, mDPSDEFormId);
    }
    
    /**
     * 获取 多数据表单部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEFormId(){
        Object objValue = this.get(FIELD_MDPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据表单部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEFormIdDirty(){
        if(this.contains(FIELD_MDPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据表单部件
     */
    @JsonIgnore
    public void resetMDPSDEFormId(){
        this.reset(FIELD_MDPSDEFORMID);
    }

    /**
     * 设置 多数据表单部件，详细说明：{@link #FIELD_MDPSDEFORMID}
     * <P>
     * 等同 {@link #setMDPSDEFormId}
     * @param mDPSDEFormId
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdeformid(String mDPSDEFormId){
        this.setMDPSDEFormId(mDPSDEFormId);
        return this;
    }

    /**
     * 设置 多数据表单部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMDPSDEFormId(null);
            this.setMDPSDEFormName(null);
        }
        else{
            this.setMDPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMDPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MDPSDEFORMNAME</B>&nbsp;多数据表单部件，表单多数据部件类型为【表单】时指定循环绘制的表单对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSDEFORMID}
     */
    public final static String FIELD_MDPSDEFORMNAME = "mdpsdeformname";

    /**
     * 设置 多数据表单部件，详细说明：{@link #FIELD_MDPSDEFORMNAME}
     * 
     * @param mDPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MDPSDEFORMNAME)
    public void setMDPSDEFormName(String mDPSDEFormName){
        this.set(FIELD_MDPSDEFORMNAME, mDPSDEFormName);
    }
    
    /**
     * 获取 多数据表单部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEFormName(){
        Object objValue = this.get(FIELD_MDPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据表单部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEFormNameDirty(){
        if(this.contains(FIELD_MDPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据表单部件
     */
    @JsonIgnore
    public void resetMDPSDEFormName(){
        this.reset(FIELD_MDPSDEFORMNAME);
    }

    /**
     * 设置 多数据表单部件，详细说明：{@link #FIELD_MDPSDEFORMNAME}
     * <P>
     * 等同 {@link #setMDPSDEFormName}
     * @param mDPSDEFormName
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdeformname(String mDPSDEFormName){
        this.setMDPSDEFormName(mDPSDEFormName);
        return this;
    }

    /**
     * <B>MDPSDEGRIDID</B>&nbsp;多数据表格部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGrid} 
     */
    public final static String FIELD_MDPSDEGRIDID = "mdpsdegridid";

    /**
     * 设置 多数据表格部件
     * 
     * @param mDPSDEGridId
     * 
     */
    @JsonProperty(FIELD_MDPSDEGRIDID)
    public void setMDPSDEGridId(String mDPSDEGridId){
        this.set(FIELD_MDPSDEGRIDID, mDPSDEGridId);
    }
    
    /**
     * 获取 多数据表格部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEGridId(){
        Object objValue = this.get(FIELD_MDPSDEGRIDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据表格部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEGridIdDirty(){
        if(this.contains(FIELD_MDPSDEGRIDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据表格部件
     */
    @JsonIgnore
    public void resetMDPSDEGridId(){
        this.reset(FIELD_MDPSDEGRIDID);
    }

    /**
     * 设置 多数据表格部件
     * <P>
     * 等同 {@link #setMDPSDEGridId}
     * @param mDPSDEGridId
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdegridid(String mDPSDEGridId){
        this.setMDPSDEGridId(mDPSDEGridId);
        return this;
    }

    /**
     * 设置 多数据表格部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdegridid(PSDEGrid pSDEGrid){
        if(pSDEGrid == null){
            this.setMDPSDEGridId(null);
            this.setMDPSDEGridName(null);
        }
        else{
            this.setMDPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setMDPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    /**
     * <B>MDPSDEGRIDNAME</B>&nbsp;多数据表格部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSDEGRIDID}
     */
    public final static String FIELD_MDPSDEGRIDNAME = "mdpsdegridname";

    /**
     * 设置 多数据表格部件
     * 
     * @param mDPSDEGridName
     * 
     */
    @JsonProperty(FIELD_MDPSDEGRIDNAME)
    public void setMDPSDEGridName(String mDPSDEGridName){
        this.set(FIELD_MDPSDEGRIDNAME, mDPSDEGridName);
    }
    
    /**
     * 获取 多数据表格部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEGridName(){
        Object objValue = this.get(FIELD_MDPSDEGRIDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据表格部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEGridNameDirty(){
        if(this.contains(FIELD_MDPSDEGRIDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据表格部件
     */
    @JsonIgnore
    public void resetMDPSDEGridName(){
        this.reset(FIELD_MDPSDEGRIDNAME);
    }

    /**
     * 设置 多数据表格部件
     * <P>
     * 等同 {@link #setMDPSDEGridName}
     * @param mDPSDEGridName
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdegridname(String mDPSDEGridName){
        this.setMDPSDEGridName(mDPSDEGridName);
        return this;
    }

    /**
     * <B>MDPSDELISTID</B>&nbsp;多数据列表部件，表单多数据部件类型为【列表】时指定绘制的列表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEList} 
     */
    public final static String FIELD_MDPSDELISTID = "mdpsdelistid";

    /**
     * 设置 多数据列表部件，详细说明：{@link #FIELD_MDPSDELISTID}
     * 
     * @param mDPSDEListId
     * 
     */
    @JsonProperty(FIELD_MDPSDELISTID)
    public void setMDPSDEListId(String mDPSDEListId){
        this.set(FIELD_MDPSDELISTID, mDPSDEListId);
    }
    
    /**
     * 获取 多数据列表部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEListId(){
        Object objValue = this.get(FIELD_MDPSDELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据列表部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEListIdDirty(){
        if(this.contains(FIELD_MDPSDELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据列表部件
     */
    @JsonIgnore
    public void resetMDPSDEListId(){
        this.reset(FIELD_MDPSDELISTID);
    }

    /**
     * 设置 多数据列表部件，详细说明：{@link #FIELD_MDPSDELISTID}
     * <P>
     * 等同 {@link #setMDPSDEListId}
     * @param mDPSDEListId
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdelistid(String mDPSDEListId){
        this.setMDPSDEListId(mDPSDEListId);
        return this;
    }

    /**
     * 设置 多数据列表部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSDEListId}
     * @param pSDEList 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdelistid(PSDEList pSDEList){
        if(pSDEList == null){
            this.setMDPSDEListId(null);
            this.setMDPSDEListName(null);
        }
        else{
            this.setMDPSDEListId(pSDEList.getPSDEListId());
            this.setMDPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    /**
     * <B>MDPSDELISTNAME</B>&nbsp;多数据列表部件，表单多数据部件类型为【列表】时指定绘制的列表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSDELISTID}
     */
    public final static String FIELD_MDPSDELISTNAME = "mdpsdelistname";

    /**
     * 设置 多数据列表部件，详细说明：{@link #FIELD_MDPSDELISTNAME}
     * 
     * @param mDPSDEListName
     * 
     */
    @JsonProperty(FIELD_MDPSDELISTNAME)
    public void setMDPSDEListName(String mDPSDEListName){
        this.set(FIELD_MDPSDELISTNAME, mDPSDEListName);
    }
    
    /**
     * 获取 多数据列表部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEListName(){
        Object objValue = this.get(FIELD_MDPSDELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据列表部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEListNameDirty(){
        if(this.contains(FIELD_MDPSDELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据列表部件
     */
    @JsonIgnore
    public void resetMDPSDEListName(){
        this.reset(FIELD_MDPSDELISTNAME);
    }

    /**
     * 设置 多数据列表部件，详细说明：{@link #FIELD_MDPSDELISTNAME}
     * <P>
     * 等同 {@link #setMDPSDEListName}
     * @param mDPSDEListName
     */
    @JsonIgnore
    public PSDEFormDetail mdpsdelistname(String mDPSDEListName){
        this.setMDPSDEListName(mDPSDEListName);
        return this;
    }

    /**
     * <B>MDPSSYSVIEWPANELID</B>&nbsp;多数据面板部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_MDPSSYSVIEWPANELID = "mdpssysviewpanelid";

    /**
     * 设置 多数据面板部件
     * 
     * @param mDPSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_MDPSSYSVIEWPANELID)
    public void setMDPSSysViewPanelId(String mDPSSysViewPanelId){
        this.set(FIELD_MDPSSYSVIEWPANELID, mDPSSysViewPanelId);
    }
    
    /**
     * 获取 多数据面板部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSSysViewPanelId(){
        Object objValue = this.get(FIELD_MDPSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据面板部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_MDPSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据面板部件
     */
    @JsonIgnore
    public void resetMDPSSysViewPanelId(){
        this.reset(FIELD_MDPSSYSVIEWPANELID);
    }

    /**
     * 设置 多数据面板部件
     * <P>
     * 等同 {@link #setMDPSSysViewPanelId}
     * @param mDPSSysViewPanelId
     */
    @JsonIgnore
    public PSDEFormDetail mdpssysviewpanelid(String mDPSSysViewPanelId){
        this.setMDPSSysViewPanelId(mDPSSysViewPanelId);
        return this;
    }

    /**
     * 设置 多数据面板部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail mdpssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setMDPSSysViewPanelId(null);
            this.setMDPSSysViewPanelName(null);
        }
        else{
            this.setMDPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setMDPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>MDPSSYSVIEWPANELNAME</B>&nbsp;多数据面板部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSSYSVIEWPANELID}
     */
    public final static String FIELD_MDPSSYSVIEWPANELNAME = "mdpssysviewpanelname";

    /**
     * 设置 多数据面板部件
     * 
     * @param mDPSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_MDPSSYSVIEWPANELNAME)
    public void setMDPSSysViewPanelName(String mDPSSysViewPanelName){
        this.set(FIELD_MDPSSYSVIEWPANELNAME, mDPSSysViewPanelName);
    }
    
    /**
     * 获取 多数据面板部件  
     * @return
     */
    @JsonIgnore
    public String getMDPSSysViewPanelName(){
        Object objValue = this.get(FIELD_MDPSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多数据面板部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_MDPSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多数据面板部件
     */
    @JsonIgnore
    public void resetMDPSSysViewPanelName(){
        this.reset(FIELD_MDPSSYSVIEWPANELNAME);
    }

    /**
     * 设置 多数据面板部件
     * <P>
     * 等同 {@link #setMDPSSysViewPanelName}
     * @param mDPSSysViewPanelName
     */
    @JsonIgnore
    public PSDEFormDetail mdpssysviewpanelname(String mDPSSysViewPanelName){
        this.setMDPSSysViewPanelName(mDPSSysViewPanelName);
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
    public PSDEFormDetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端表单
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端表单
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端表单  
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
     * 判断 移动端表单 是否指定值，包括空值
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
     * 重置 移动端表单
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端表单
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSDEFormDetail mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
        return this;
    }

    /**
     * <B>MODELSTATE</B>&nbsp;模型状态，RESERVEMODELV2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFormDetailState} 
     */
    public final static String FIELD_MODELSTATE = "modelstate";

    /**
     * 设置 模型状态，详细说明：{@link #FIELD_MODELSTATE}
     * 
     * @param modelState
     * 
     */
    @JsonProperty(FIELD_MODELSTATE)
    public void setModelState(Integer modelState){
        this.set(FIELD_MODELSTATE, modelState);
    }
    
    /**
     * 获取 模型状态  
     * @return
     */
    @JsonIgnore
    public Integer getModelState(){
        Object objValue = this.get(FIELD_MODELSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelStateDirty(){
        if(this.contains(FIELD_MODELSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型状态
     */
    @JsonIgnore
    public void resetModelState(){
        this.reset(FIELD_MODELSTATE);
    }

    /**
     * 设置 模型状态，详细说明：{@link #FIELD_MODELSTATE}
     * <P>
     * 等同 {@link #setModelState}
     * @param modelState
     */
    @JsonIgnore
    public PSDEFormDetail modelstate(Integer modelState){
        this.setModelState(modelState);
        return this;
    }

     /**
     * 设置 模型状态，详细说明：{@link #FIELD_MODELSTATE}
     * <P>
     * 等同 {@link #setModelState}
     * @param modelState
     */
    @JsonIgnore
    public PSDEFormDetail modelstate(net.ibizsys.psmodel.core.util.PSModelEnums.DEFormDetailState[] modelState){
        if(modelState == null || modelState.length == 0){
            this.setModelState(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEFormDetailState _item : modelState){
                _value |= _item.value;
            }
            this.setModelState(_value);
        }
        return this;
    }

    /**
     * <B>NEEDCODELISTCONFIG</B>&nbsp;需要提供代码表配置，指定表单项是否需要提供代码表配置，未定义时如表单项编辑器与引用属性界面模式一致则使用属性界面模式的配置，否则使用表单项编辑器默认配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NEEDCODELISTCONFIG = "needcodelistconfig";

    /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * 
     * @param needCodeListConfig
     * 
     */
    @JsonProperty(FIELD_NEEDCODELISTCONFIG)
    public void setNeedCodeListConfig(Integer needCodeListConfig){
        this.set(FIELD_NEEDCODELISTCONFIG, needCodeListConfig);
    }
    
    /**
     * 获取 需要提供代码表配置  
     * @return
     */
    @JsonIgnore
    public Integer getNeedCodeListConfig(){
        Object objValue = this.get(FIELD_NEEDCODELISTCONFIG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 需要提供代码表配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNeedCodeListConfigDirty(){
        if(this.contains(FIELD_NEEDCODELISTCONFIG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需要提供代码表配置
     */
    @JsonIgnore
    public void resetNeedCodeListConfig(){
        this.reset(FIELD_NEEDCODELISTCONFIG);
    }

    /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDEFormDetail needcodelistconfig(Integer needCodeListConfig){
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

     /**
     * 设置 需要提供代码表配置，详细说明：{@link #FIELD_NEEDCODELISTCONFIG}
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDEFormDetail needcodelistconfig(Boolean needCodeListConfig){
        if(needCodeListConfig == null){
            this.setNeedCodeListConfig(null);
        }
        else{
            this.setNeedCodeListConfig(needCodeListConfig?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NOPRIVDM</B>&nbsp;无权限显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode} 
     */
    public final static String FIELD_NOPRIVDM = "noprivdm";

    /**
     * 设置 无权限显示模式
     * 
     * @param noPrivDM
     * 
     */
    @JsonProperty(FIELD_NOPRIVDM)
    public void setNoPrivDM(Integer noPrivDM){
        this.set(FIELD_NOPRIVDM, noPrivDM);
    }
    
    /**
     * 获取 无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNoPrivDM(){
        Object objValue = this.get(FIELD_NOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoPrivDMDirty(){
        if(this.contains(FIELD_NOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无权限显示模式
     */
    @JsonIgnore
    public void resetNoPrivDM(){
        this.reset(FIELD_NOPRIVDM);
    }

    /**
     * 设置 无权限显示模式
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDEFormDetail noprivdm(Integer noPrivDM){
        this.setNoPrivDM(noPrivDM);
        return this;
    }

     /**
     * 设置 无权限显示模式
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDEFormDetail noprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode noPrivDM){
        if(noPrivDM == null){
            this.setNoPrivDM(null);
        }
        else{
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    /**
     * <B>OPENPSDEVIEWID</B>&nbsp;打开实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_OPENPSDEVIEWID = "openpsdeviewid";

    /**
     * 设置 打开实体视图
     * 
     * @param openPSDEViewId
     * 
     */
    @JsonProperty(FIELD_OPENPSDEVIEWID)
    public void setOpenPSDEViewId(String openPSDEViewId){
        this.set(FIELD_OPENPSDEVIEWID, openPSDEViewId);
    }
    
    /**
     * 获取 打开实体视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSDEViewId(){
        Object objValue = this.get(FIELD_OPENPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSDEViewIdDirty(){
        if(this.contains(FIELD_OPENPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开实体视图
     */
    @JsonIgnore
    public void resetOpenPSDEViewId(){
        this.reset(FIELD_OPENPSDEVIEWID);
    }

    /**
     * 设置 打开实体视图
     * <P>
     * 等同 {@link #setOpenPSDEViewId}
     * @param openPSDEViewId
     */
    @JsonIgnore
    public PSDEFormDetail openpsdeviewid(String openPSDEViewId){
        this.setOpenPSDEViewId(openPSDEViewId);
        return this;
    }

    /**
     * 设置 打开实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOpenPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail openpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setOpenPSDEViewId(null);
            this.setOpenPSDEViewName(null);
        }
        else{
            this.setOpenPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setOpenPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>OPENPSDEVIEWNAME</B>&nbsp;打开实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OPENPSDEVIEWID}
     */
    public final static String FIELD_OPENPSDEVIEWNAME = "openpsdeviewname";

    /**
     * 设置 打开实体视图
     * 
     * @param openPSDEViewName
     * 
     */
    @JsonProperty(FIELD_OPENPSDEVIEWNAME)
    public void setOpenPSDEViewName(String openPSDEViewName){
        this.set(FIELD_OPENPSDEVIEWNAME, openPSDEViewName);
    }
    
    /**
     * 获取 打开实体视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSDEViewName(){
        Object objValue = this.get(FIELD_OPENPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSDEViewNameDirty(){
        if(this.contains(FIELD_OPENPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开实体视图
     */
    @JsonIgnore
    public void resetOpenPSDEViewName(){
        this.reset(FIELD_OPENPSDEVIEWNAME);
    }

    /**
     * 设置 打开实体视图
     * <P>
     * 等同 {@link #setOpenPSDEViewName}
     * @param openPSDEViewName
     */
    @JsonIgnore
    public PSDEFormDetail openpsdeviewname(String openPSDEViewName){
        this.setOpenPSDEViewName(openPSDEViewName);
        return this;
    }

    /**
     * <B>OPENPSSYSPDTVIEWID</B>&nbsp;打开系统预置视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPDTView} 
     */
    public final static String FIELD_OPENPSSYSPDTVIEWID = "openpssyspdtviewid";

    /**
     * 设置 打开系统预置视图
     * 
     * @param openPSSysPDTViewId
     * 
     */
    @JsonProperty(FIELD_OPENPSSYSPDTVIEWID)
    public void setOpenPSSysPDTViewId(String openPSSysPDTViewId){
        this.set(FIELD_OPENPSSYSPDTVIEWID, openPSSysPDTViewId);
    }
    
    /**
     * 获取 打开系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSSysPDTViewId(){
        Object objValue = this.get(FIELD_OPENPSSYSPDTVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSSysPDTViewIdDirty(){
        if(this.contains(FIELD_OPENPSSYSPDTVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开系统预置视图
     */
    @JsonIgnore
    public void resetOpenPSSysPDTViewId(){
        this.reset(FIELD_OPENPSSYSPDTVIEWID);
    }

    /**
     * 设置 打开系统预置视图
     * <P>
     * 等同 {@link #setOpenPSSysPDTViewId}
     * @param openPSSysPDTViewId
     */
    @JsonIgnore
    public PSDEFormDetail openpssyspdtviewid(String openPSSysPDTViewId){
        this.setOpenPSSysPDTViewId(openPSSysPDTViewId);
        return this;
    }

    /**
     * 设置 打开系统预置视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOpenPSSysPDTViewId}
     * @param pSSysPDTView 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail openpssyspdtviewid(PSSysPDTView pSSysPDTView){
        if(pSSysPDTView == null){
            this.setOpenPSSysPDTViewId(null);
            this.setOpenPSSysPDTViewName(null);
        }
        else{
            this.setOpenPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setOpenPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    /**
     * <B>OPENPSSYSPDTVIEWNAME</B>&nbsp;打开系统预置视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OPENPSSYSPDTVIEWID}
     */
    public final static String FIELD_OPENPSSYSPDTVIEWNAME = "openpssyspdtviewname";

    /**
     * 设置 打开系统预置视图
     * 
     * @param openPSSysPDTViewName
     * 
     */
    @JsonProperty(FIELD_OPENPSSYSPDTVIEWNAME)
    public void setOpenPSSysPDTViewName(String openPSSysPDTViewName){
        this.set(FIELD_OPENPSSYSPDTVIEWNAME, openPSSysPDTViewName);
    }
    
    /**
     * 获取 打开系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getOpenPSSysPDTViewName(){
        Object objValue = this.get(FIELD_OPENPSSYSPDTVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenPSSysPDTViewNameDirty(){
        if(this.contains(FIELD_OPENPSSYSPDTVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开系统预置视图
     */
    @JsonIgnore
    public void resetOpenPSSysPDTViewName(){
        this.reset(FIELD_OPENPSSYSPDTVIEWNAME);
    }

    /**
     * 设置 打开系统预置视图
     * <P>
     * 等同 {@link #setOpenPSSysPDTViewName}
     * @param openPSSysPDTViewName
     */
    @JsonIgnore
    public PSDEFormDetail openpssyspdtviewname(String openPSSysPDTViewName){
        this.setOpenPSSysPDTViewName(openPSSysPDTViewName);
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
    public PSDEFormDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PADDING</B>&nbsp;内框间隔，指定表单成员的内边距，注意：此配置后续将被取消，建议通过使用界面样式表完成对应的功能
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PADDING = "padding";

    /**
     * 设置 内框间隔，详细说明：{@link #FIELD_PADDING}
     * 
     * @param padding
     * 
     */
    @JsonProperty(FIELD_PADDING)
    public void setPadding(String padding){
        this.set(FIELD_PADDING, padding);
    }
    
    /**
     * 获取 内框间隔  
     * @return
     */
    @JsonIgnore
    public String getPadding(){
        Object objValue = this.get(FIELD_PADDING);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内框间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPaddingDirty(){
        if(this.contains(FIELD_PADDING)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内框间隔
     */
    @JsonIgnore
    public void resetPadding(){
        this.reset(FIELD_PADDING);
    }

    /**
     * 设置 内框间隔，详细说明：{@link #FIELD_PADDING}
     * <P>
     * 等同 {@link #setPadding}
     * @param padding
     */
    @JsonIgnore
    public PSDEFormDetail padding(String padding){
        this.setPadding(padding);
        return this;
    }

    /**
     * <B>PHPSLANRESID</B>&nbsp;占位内容语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_PHPSLANRESID = "phpslanresid";

    /**
     * 设置 占位内容语言资源
     * 
     * @param pHPSLanResId
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESID)
    public void setPHPSLanResId(String pHPSLanResId){
        this.set(FIELD_PHPSLANRESID, pHPSLanResId);
    }
    
    /**
     * 获取 占位内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResId(){
        Object objValue = this.get(FIELD_PHPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResIdDirty(){
        if(this.contains(FIELD_PHPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位内容语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResId(){
        this.reset(FIELD_PHPSLANRESID);
    }

    /**
     * 设置 占位内容语言资源
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pHPSLanResId
     */
    @JsonIgnore
    public PSDEFormDetail phpslanresid(String pHPSLanResId){
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    /**
     * 设置 占位内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail phpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setPHPSLanResId(null);
            this.setPHPSLanResName(null);
        }
        else{
            this.setPHPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPHPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>PHPSLANRESNAME</B>&nbsp;占位内容语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PHPSLANRESID}
     */
    public final static String FIELD_PHPSLANRESNAME = "phpslanresname";

    /**
     * 设置 占位内容语言资源
     * 
     * @param pHPSLanResName
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESNAME)
    public void setPHPSLanResName(String pHPSLanResName){
        this.set(FIELD_PHPSLANRESNAME, pHPSLanResName);
    }
    
    /**
     * 获取 占位内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResName(){
        Object objValue = this.get(FIELD_PHPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResNameDirty(){
        if(this.contains(FIELD_PHPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位内容语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResName(){
        this.reset(FIELD_PHPSLANRESNAME);
    }

    /**
     * 设置 占位内容语言资源
     * <P>
     * 等同 {@link #setPHPSLanResName}
     * @param pHPSLanResName
     */
    @JsonIgnore
    public PSDEFormDetail phpslanresname(String pHPSLanResName){
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWID</B>&nbsp;选择界面视图，指定表单项引用数据的选择视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWID}
     * 
     * @param pickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWID)
    public void setPickupPSDEViewId(String pickupPSDEViewId){
        this.set(FIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }
    
    /**
     * 获取 选择界面视图  
     * @return
     */
    @JsonIgnore
    public String getPickupPSDEViewId(){
        Object objValue = this.get(FIELD_PICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择界面视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_PICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择界面视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewId(){
        this.reset(FIELD_PICKUPPSDEVIEWID);
    }

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFormDetail pickuppsdeviewid(String pickupPSDEViewId){
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    /**
     * 设置 选择界面视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail pickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPickupPSDEViewId(null);
            this.setPickupPSDEViewName(null);
        }
        else{
            this.setPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWNAME</B>&nbsp;选择界面视图，指定表单项引用数据的选择视图对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PICKUPPSDEVIEWID}
     */
    public final static String FIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWNAME}
     * 
     * @param pickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWNAME)
    public void setPickupPSDEViewName(String pickupPSDEViewName){
        this.set(FIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }
    
    /**
     * 获取 选择界面视图  
     * @return
     */
    @JsonIgnore
    public String getPickupPSDEViewName(){
        Object objValue = this.get(FIELD_PICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择界面视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_PICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择界面视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewName(){
        this.reset(FIELD_PICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 选择界面视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setPickupPSDEViewName}
     * @param pickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFormDetail pickuppsdeviewname(String pickupPSDEViewName){
        this.setPickupPSDEViewName(pickupPSDEViewName);
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定表单项编辑器的占位提示信息，未定义时使用引用的属性界面模式的配置
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PLACEHOLDER = "placeholder";

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * 
     * @param placeHolder
     * 
     */
    @JsonProperty(FIELD_PLACEHOLDER)
    public void setPlaceHolder(String placeHolder){
        this.set(FIELD_PLACEHOLDER, placeHolder);
    }
    
    /**
     * 获取 占位提示  
     * @return
     */
    @JsonIgnore
    public String getPlaceHolder(){
        Object objValue = this.get(FIELD_PLACEHOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlaceHolderDirty(){
        if(this.contains(FIELD_PLACEHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示
     */
    @JsonIgnore
    public void resetPlaceHolder(){
        this.reset(FIELD_PLACEHOLDER);
    }

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * <P>
     * 等同 {@link #setPlaceHolder}
     * @param placeHolder
     */
    @JsonIgnore
    public PSDEFormDetail placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PLAYOUTMODE</B>&nbsp;父布局模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEFORMDETAILID}
     */
    public final static String FIELD_PLAYOUTMODE = "playoutmode";

    /**
     * 设置 父布局模式
     * 
     * @param pLayoutMode
     * 
     */
    @JsonProperty(FIELD_PLAYOUTMODE)
    public void setPLayoutMode(String pLayoutMode){
        this.set(FIELD_PLAYOUTMODE, pLayoutMode);
    }
    
    /**
     * 获取 父布局模式  
     * @return
     */
    @JsonIgnore
    public String getPLayoutMode(){
        Object objValue = this.get(FIELD_PLAYOUTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父布局模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPLayoutModeDirty(){
        if(this.contains(FIELD_PLAYOUTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父布局模式
     */
    @JsonIgnore
    public void resetPLayoutMode(){
        this.reset(FIELD_PLAYOUTMODE);
    }

    /**
     * 设置 父布局模式
     * <P>
     * 等同 {@link #setPLayoutMode}
     * @param pLayoutMode
     */
    @JsonIgnore
    public PSDEFormDetail playoutmode(String pLayoutMode){
        this.setPLayoutMode(pLayoutMode);
        return this;
    }

    /**
     * <B>PPSDEFORMDETAILID</B>&nbsp;父表单成员
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFormDetail} 
     */
    public final static String FIELD_PPSDEFORMDETAILID = "ppsdeformdetailid";

    /**
     * 设置 父表单成员
     * 
     * @param pPSDEFormDetailId
     * 
     */
    @JsonProperty(FIELD_PPSDEFORMDETAILID)
    public void setPPSDEFormDetailId(String pPSDEFormDetailId){
        this.set(FIELD_PPSDEFORMDETAILID, pPSDEFormDetailId);
    }
    
    /**
     * 获取 父表单成员  
     * @return
     */
    @JsonIgnore
    public String getPPSDEFormDetailId(){
        Object objValue = this.get(FIELD_PPSDEFORMDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父表单成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEFormDetailIdDirty(){
        if(this.contains(FIELD_PPSDEFORMDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父表单成员
     */
    @JsonIgnore
    public void resetPPSDEFormDetailId(){
        this.reset(FIELD_PPSDEFORMDETAILID);
    }

    /**
     * 设置 父表单成员
     * <P>
     * 等同 {@link #setPPSDEFormDetailId}
     * @param pPSDEFormDetailId
     */
    @JsonIgnore
    public PSDEFormDetail ppsdeformdetailid(String pPSDEFormDetailId){
        this.setPPSDEFormDetailId(pPSDEFormDetailId);
        return this;
    }

    /**
     * 设置 父表单成员，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEFormDetailId}
     * @param pSDEFormDetail 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail ppsdeformdetailid(PSDEFormDetail pSDEFormDetail){
        if(pSDEFormDetail == null){
            this.setPLayoutMode(null);
            this.setPPSDEFormDetailId(null);
            this.setPPSDEFormDetailName(null);
        }
        else{
            this.setPLayoutMode(pSDEFormDetail.getLayoutMode());
            this.setPPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    /**
     * <B>PPSDEFORMDETAILNAME</B>&nbsp;父对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEFORMDETAILID}
     */
    public final static String FIELD_PPSDEFORMDETAILNAME = "ppsdeformdetailname";

    /**
     * 设置 父对象
     * 
     * @param pPSDEFormDetailName
     * 
     */
    @JsonProperty(FIELD_PPSDEFORMDETAILNAME)
    public void setPPSDEFormDetailName(String pPSDEFormDetailName){
        this.set(FIELD_PPSDEFORMDETAILNAME, pPSDEFormDetailName);
    }
    
    /**
     * 获取 父对象  
     * @return
     */
    @JsonIgnore
    public String getPPSDEFormDetailName(){
        Object objValue = this.get(FIELD_PPSDEFORMDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEFormDetailNameDirty(){
        if(this.contains(FIELD_PPSDEFORMDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父对象
     */
    @JsonIgnore
    public void resetPPSDEFormDetailName(){
        this.reset(FIELD_PPSDEFORMDETAILNAME);
    }

    /**
     * 设置 父对象
     * <P>
     * 等同 {@link #setPPSDEFormDetailName}
     * @param pPSDEFormDetailName
     */
    @JsonIgnore
    public PSDEFormDetail ppsdeformdetailname(String pPSDEFormDetailName){
        this.setPPSDEFormDetailName(pPSDEFormDetailName);
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
    public PSDEFormDetail predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
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
    public PSDEFormDetail predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定表单项的代码表对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表  
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
     * 判断 系统代码表 是否指定值，包括空值
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
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDEFormDetail pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 系统代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定表单项的代码表对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 系统代码表  
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
     * 判断 系统代码表 是否指定值，包括空值
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
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDEFormDetail pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEDRID</B>&nbsp;实体数据关系组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataRelation} 
     */
    public final static String FIELD_PSDEDRID = "psdedrid";

    /**
     * 设置 实体数据关系组
     * 
     * @param pSDEDRId
     * 
     */
    @JsonProperty(FIELD_PSDEDRID)
    public void setPSDEDRId(String pSDEDRId){
        this.set(FIELD_PSDEDRID, pSDEDRId);
    }
    
    /**
     * 获取 实体数据关系组  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRId(){
        Object objValue = this.get(FIELD_PSDEDRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据关系组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRIdDirty(){
        if(this.contains(FIELD_PSDEDRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据关系组
     */
    @JsonIgnore
    public void resetPSDEDRId(){
        this.reset(FIELD_PSDEDRID);
    }

    /**
     * 设置 实体数据关系组
     * <P>
     * 等同 {@link #setPSDEDRId}
     * @param pSDEDRId
     */
    @JsonIgnore
    public PSDEFormDetail psdedrid(String pSDEDRId){
        this.setPSDEDRId(pSDEDRId);
        return this;
    }

    /**
     * 设置 实体数据关系组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDRId}
     * @param pSDEDataRelation 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdedrid(PSDEDataRelation pSDEDataRelation){
        if(pSDEDataRelation == null){
            this.setPSDEDRId(null);
            this.setPSDEDRName(null);
        }
        else{
            this.setPSDEDRId(pSDEDataRelation.getPSDEDataRelationId());
            this.setPSDEDRName(pSDEDataRelation.getPSDEDataRelationName());
        }
        return this;
    }

    /**
     * <B>PSDEDRITEMID</B>&nbsp;数据关系界面，指定表单关系界面部件嵌入的关系界面
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDRItem} 
     */
    public final static String FIELD_PSDEDRITEMID = "psdedritemid";

    /**
     * 设置 数据关系界面，详细说明：{@link #FIELD_PSDEDRITEMID}
     * 
     * @param pSDEDRItemId
     * 
     */
    @JsonProperty(FIELD_PSDEDRITEMID)
    public void setPSDEDRItemId(String pSDEDRItemId){
        this.set(FIELD_PSDEDRITEMID, pSDEDRItemId);
    }
    
    /**
     * 获取 数据关系界面  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRItemId(){
        Object objValue = this.get(FIELD_PSDEDRITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据关系界面 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRItemIdDirty(){
        if(this.contains(FIELD_PSDEDRITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据关系界面
     */
    @JsonIgnore
    public void resetPSDEDRItemId(){
        this.reset(FIELD_PSDEDRITEMID);
    }

    /**
     * 设置 数据关系界面，详细说明：{@link #FIELD_PSDEDRITEMID}
     * <P>
     * 等同 {@link #setPSDEDRItemId}
     * @param pSDEDRItemId
     */
    @JsonIgnore
    public PSDEFormDetail psdedritemid(String pSDEDRItemId){
        this.setPSDEDRItemId(pSDEDRItemId);
        return this;
    }

    /**
     * 设置 数据关系界面，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDRItemId}
     * @param pSDEDRItem 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdedritemid(PSDEDRItem pSDEDRItem){
        if(pSDEDRItem == null){
            this.setPSDEDRItemId(null);
            this.setPSDEDRItemName(null);
        }
        else{
            this.setPSDEDRItemId(pSDEDRItem.getPSDEDRItemId());
            this.setPSDEDRItemName(pSDEDRItem.getPSDEDRItemName());
        }
        return this;
    }

    /**
     * <B>PSDEDRITEMNAME</B>&nbsp;数据关系界面，指定表单关系界面部件嵌入的关系界面
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRITEMID}
     */
    public final static String FIELD_PSDEDRITEMNAME = "psdedritemname";

    /**
     * 设置 数据关系界面，详细说明：{@link #FIELD_PSDEDRITEMNAME}
     * 
     * @param pSDEDRItemName
     * 
     */
    @JsonProperty(FIELD_PSDEDRITEMNAME)
    public void setPSDEDRItemName(String pSDEDRItemName){
        this.set(FIELD_PSDEDRITEMNAME, pSDEDRItemName);
    }
    
    /**
     * 获取 数据关系界面  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRItemName(){
        Object objValue = this.get(FIELD_PSDEDRITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据关系界面 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRItemNameDirty(){
        if(this.contains(FIELD_PSDEDRITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据关系界面
     */
    @JsonIgnore
    public void resetPSDEDRItemName(){
        this.reset(FIELD_PSDEDRITEMNAME);
    }

    /**
     * 设置 数据关系界面，详细说明：{@link #FIELD_PSDEDRITEMNAME}
     * <P>
     * 等同 {@link #setPSDEDRItemName}
     * @param pSDEDRItemName
     */
    @JsonIgnore
    public PSDEFormDetail psdedritemname(String pSDEDRItemName){
        this.setPSDEDRItemName(pSDEDRItemName);
        return this;
    }

    /**
     * <B>PSDEDRNAME</B>&nbsp;实体数据关系组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRID}
     */
    public final static String FIELD_PSDEDRNAME = "psdedrname";

    /**
     * 设置 实体数据关系组
     * 
     * @param pSDEDRName
     * 
     */
    @JsonProperty(FIELD_PSDEDRNAME)
    public void setPSDEDRName(String pSDEDRName){
        this.set(FIELD_PSDEDRNAME, pSDEDRName);
    }
    
    /**
     * 获取 实体数据关系组  
     * @return
     */
    @JsonIgnore
    public String getPSDEDRName(){
        Object objValue = this.get(FIELD_PSDEDRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据关系组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDRNameDirty(){
        if(this.contains(FIELD_PSDEDRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据关系组
     */
    @JsonIgnore
    public void resetPSDEDRName(){
        this.reset(FIELD_PSDEDRNAME);
    }

    /**
     * 设置 实体数据关系组
     * <P>
     * 等同 {@link #setPSDEDRName}
     * @param pSDEDRName
     */
    @JsonIgnore
    public PSDEFormDetail psdedrname(String pSDEDRName){
        this.setPSDEDRName(pSDEDRName);
        return this;
    }

    /**
     * <B>PSDEFUIMODEID</B>&nbsp;表单项模式，指定表单项的属性界面模式，未定义时按照以下方式计算模式（1）当前应用的默认模式（2）当前应用类型的默认模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFUIMode} 
     */
    public final static String FIELD_PSDEFUIMODEID = "psdefuimodeid";

    /**
     * 设置 表单项模式，详细说明：{@link #FIELD_PSDEFUIMODEID}
     * 
     * @param pSDEFUIModeId
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODEID)
    public void setPSDEFUIModeId(String pSDEFUIModeId){
        this.set(FIELD_PSDEFUIMODEID, pSDEFUIModeId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdefformitemid", pSDEFUIModeId);
    }
    
    /**
     * 获取 表单项模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeId(){
        Object objValue = this.get(FIELD_PSDEFUIMODEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdefformitemid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty(){
        if(this.contains(FIELD_PSDEFUIMODEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdefformitemid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项模式
     */
    @JsonIgnore
    public void resetPSDEFUIModeId(){
        this.reset(FIELD_PSDEFUIMODEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdefformitemid");
    }

    /**
     * 设置 表单项模式，详细说明：{@link #FIELD_PSDEFUIMODEID}
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIModeId
     */
    @JsonIgnore
    public PSDEFormDetail psdefuimodeid(String pSDEFUIModeId){
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    /**
     * 设置 表单项模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIMode 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdefuimodeid(PSDEFUIMode pSDEFUIMode){
        if(pSDEFUIMode == null){
            this.setPSDEFUIModeId(null);
            this.setPSDEFUIModeName(null);
        }
        else{
            this.setPSDEFUIModeId(pSDEFUIMode.getPSDEFUIModeId());
            this.setPSDEFUIModeName(pSDEFUIMode.getPSDEFUIModeName());
        }
        return this;
    }

    /**
     * <B>PSDEFUIMODENAME</B>&nbsp;表单项模式，指定表单项的属性界面模式，未定义时按照以下方式计算模式（1）当前应用的默认模式（2）当前应用类型的默认模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFUIMODEID}
     */
    public final static String FIELD_PSDEFUIMODENAME = "psdefuimodename";

    /**
     * 设置 表单项模式，详细说明：{@link #FIELD_PSDEFUIMODENAME}
     * 
     * @param pSDEFUIModeName
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODENAME)
    public void setPSDEFUIModeName(String pSDEFUIModeName){
        this.set(FIELD_PSDEFUIMODENAME, pSDEFUIModeName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdefformitemname", pSDEFUIModeName);
    }
    
    /**
     * 获取 表单项模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeName(){
        Object objValue = this.get(FIELD_PSDEFUIMODENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdefformitemname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty(){
        if(this.contains(FIELD_PSDEFUIMODENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdefformitemname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项模式
     */
    @JsonIgnore
    public void resetPSDEFUIModeName(){
        this.reset(FIELD_PSDEFUIMODENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdefformitemname");
    }

    /**
     * 设置 表单项模式，详细说明：{@link #FIELD_PSDEFUIMODENAME}
     * <P>
     * 等同 {@link #setPSDEFUIModeName}
     * @param pSDEFUIModeName
     */
    @JsonIgnore
    public PSDEFormDetail psdefuimodename(String pSDEFUIModeName){
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定表单项绑定的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEFormDetail psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFIUPDATEID</B>&nbsp;表单项更新，指定表单项值变化时触发的表单项更新操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFIUpdate} 
     */
    public final static String FIELD_PSDEFIUPDATEID = "psdefiupdateid";

    /**
     * 设置 表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATEID}
     * 
     * @param pSDEFIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDEFIUPDATEID)
    public void setPSDEFIUpdateId(String pSDEFIUpdateId){
        this.set(FIELD_PSDEFIUPDATEID, pSDEFIUpdateId);
    }
    
    /**
     * 获取 表单项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIUpdateId(){
        Object objValue = this.get(FIELD_PSDEFIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIUpdateIdDirty(){
        if(this.contains(FIELD_PSDEFIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项更新
     */
    @JsonIgnore
    public void resetPSDEFIUpdateId(){
        this.reset(FIELD_PSDEFIUPDATEID);
    }

    /**
     * 设置 表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATEID}
     * <P>
     * 等同 {@link #setPSDEFIUpdateId}
     * @param pSDEFIUpdateId
     */
    @JsonIgnore
    public PSDEFormDetail psdefiupdateid(String pSDEFIUpdateId){
        this.setPSDEFIUpdateId(pSDEFIUpdateId);
        return this;
    }

    /**
     * 设置 表单项更新，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFIUpdateId}
     * @param pSDEFIUpdate 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdefiupdateid(PSDEFIUpdate pSDEFIUpdate){
        if(pSDEFIUpdate == null){
            this.setPSDEFIUpdateId(null);
            this.setPSDEFIUpdateName(null);
        }
        else{
            this.setPSDEFIUpdateId(pSDEFIUpdate.getPSDEFIUpdateId());
            this.setPSDEFIUpdateName(pSDEFIUpdate.getPSDEFIUpdateName());
        }
        return this;
    }

    /**
     * <B>PSDEFIUPDATENAME</B>&nbsp;表单项更新，指定表单项值变化时触发的表单项更新操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFIUPDATEID}
     */
    public final static String FIELD_PSDEFIUPDATENAME = "psdefiupdatename";

    /**
     * 设置 表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATENAME}
     * 
     * @param pSDEFIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDEFIUPDATENAME)
    public void setPSDEFIUpdateName(String pSDEFIUpdateName){
        this.set(FIELD_PSDEFIUPDATENAME, pSDEFIUpdateName);
    }
    
    /**
     * 获取 表单项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIUpdateName(){
        Object objValue = this.get(FIELD_PSDEFIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIUpdateNameDirty(){
        if(this.contains(FIELD_PSDEFIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项更新
     */
    @JsonIgnore
    public void resetPSDEFIUpdateName(){
        this.reset(FIELD_PSDEFIUPDATENAME);
    }

    /**
     * 设置 表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATENAME}
     * <P>
     * 等同 {@link #setPSDEFIUpdateName}
     * @param pSDEFIUpdateName
     */
    @JsonIgnore
    public PSDEFormDetail psdefiupdatename(String pSDEFIUpdateName){
        this.setPSDEFIUpdateName(pSDEFIUpdateName);
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定表单项绑定的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEFormDetail psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFORMDETAILID</B>&nbsp;实体表单成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFORMDETAILID = "psdeformdetailid";

    /**
     * 设置 实体表单成员标识
     * 
     * @param pSDEFormDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMDETAILID)
    public void setPSDEFormDetailId(String pSDEFormDetailId){
        this.set(FIELD_PSDEFORMDETAILID, pSDEFormDetailId);
    }
    
    /**
     * 获取 实体表单成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormDetailId(){
        Object objValue = this.get(FIELD_PSDEFORMDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormDetailIdDirty(){
        if(this.contains(FIELD_PSDEFORMDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单成员标识
     */
    @JsonIgnore
    public void resetPSDEFormDetailId(){
        this.reset(FIELD_PSDEFORMDETAILID);
    }

    /**
     * 设置 实体表单成员标识
     * <P>
     * 等同 {@link #setPSDEFormDetailId}
     * @param pSDEFormDetailId
     */
    @JsonIgnore
    public PSDEFormDetail psdeformdetailid(String pSDEFormDetailId){
        this.setPSDEFormDetailId(pSDEFormDetailId);
        return this;
    }

    /**
     * <B>PSDEFORMDETAILNAME</B>&nbsp;名称，指定表单成员的标识，需在所在表单中具有唯一性
     * <P>
     * 字符串：最大长度 80，由字母、数字、下划线及@组成，且开始必须为字母
     */
    public final static String FIELD_PSDEFORMDETAILNAME = "psdeformdetailname";

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSDEFORMDETAILNAME}
     * 
     * @param pSDEFormDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMDETAILNAME)
    public void setPSDEFormDetailName(String pSDEFormDetailName){
        this.set(FIELD_PSDEFORMDETAILNAME, pSDEFormDetailName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormDetailName(){
        Object objValue = this.get(FIELD_PSDEFORMDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormDetailNameDirty(){
        if(this.contains(FIELD_PSDEFORMDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSDEFormDetailName(){
        this.reset(FIELD_PSDEFORMDETAILNAME);
    }

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSDEFORMDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEFormDetailName}
     * @param pSDEFormDetailName
     */
    @JsonIgnore
    public PSDEFormDetail psdeformdetailname(String pSDEFormDetailName){
        this.setPSDEFormDetailName(pSDEFormDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFormDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFormDetailName(strName);
    }

    @JsonIgnore
    public PSDEFormDetail name(String strName){
        this.setPSDEFormDetailName(strName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单，指定表单成员所在的表单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 实体表单  
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
     * 判断 实体表单 是否指定值，包括空值
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
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEFormDetail psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setFormType(null);
            this.setMobFlag(null);
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
            this.setPSDEId(null);
        }
        else{
            this.setFormType(pSDEForm.getFormType());
            this.setMobFlag(pSDEForm.getMobFlag());
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
            this.setPSDEId(pSDEForm.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;实体表单，指定表单成员所在的表单对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 实体表单  
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
     * 判断 实体表单 是否指定值，包括空值
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
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEFormDetail psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEFORMRFID</B>&nbsp;实体表单引用，指定表单部件使用的表单引用对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFormRF} 
     */
    public final static String FIELD_PSDEFORMRFID = "psdeformrfid";

    /**
     * 设置 实体表单引用，详细说明：{@link #FIELD_PSDEFORMRFID}
     * 
     * @param pSDEFormRFId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMRFID)
    public void setPSDEFormRFId(String pSDEFormRFId){
        this.set(FIELD_PSDEFORMRFID, pSDEFormRFId);
    }
    
    /**
     * 获取 实体表单引用  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormRFId(){
        Object objValue = this.get(FIELD_PSDEFORMRFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormRFIdDirty(){
        if(this.contains(FIELD_PSDEFORMRFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单引用
     */
    @JsonIgnore
    public void resetPSDEFormRFId(){
        this.reset(FIELD_PSDEFORMRFID);
    }

    /**
     * 设置 实体表单引用，详细说明：{@link #FIELD_PSDEFORMRFID}
     * <P>
     * 等同 {@link #setPSDEFormRFId}
     * @param pSDEFormRFId
     */
    @JsonIgnore
    public PSDEFormDetail psdeformrfid(String pSDEFormRFId){
        this.setPSDEFormRFId(pSDEFormRFId);
        return this;
    }

    /**
     * 设置 实体表单引用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormRFId}
     * @param pSDEFormRF 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdeformrfid(PSDEFormRF pSDEFormRF){
        if(pSDEFormRF == null){
            this.setPSDEFormRFId(null);
            this.setPSDEFormRFName(null);
            this.setRefPSDEFormId(null);
        }
        else{
            this.setPSDEFormRFId(pSDEFormRF.getPSDEFormRFId());
            this.setPSDEFormRFName(pSDEFormRF.getPSDEFormRFName());
            this.setRefPSDEFormId(pSDEFormRF.getMinorPSDEFormId());
        }
        return this;
    }

    /**
     * <B>PSDEFORMRFNAME</B>&nbsp;实体表单引用，指定表单部件使用的表单引用对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMRFID}
     */
    public final static String FIELD_PSDEFORMRFNAME = "psdeformrfname";

    /**
     * 设置 实体表单引用，详细说明：{@link #FIELD_PSDEFORMRFNAME}
     * 
     * @param pSDEFormRFName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMRFNAME)
    public void setPSDEFormRFName(String pSDEFormRFName){
        this.set(FIELD_PSDEFORMRFNAME, pSDEFormRFName);
    }
    
    /**
     * 获取 实体表单引用  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormRFName(){
        Object objValue = this.get(FIELD_PSDEFORMRFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormRFNameDirty(){
        if(this.contains(FIELD_PSDEFORMRFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单引用
     */
    @JsonIgnore
    public void resetPSDEFormRFName(){
        this.reset(FIELD_PSDEFORMRFNAME);
    }

    /**
     * 设置 实体表单引用，详细说明：{@link #FIELD_PSDEFORMRFNAME}
     * <P>
     * 等同 {@link #setPSDEFormRFName}
     * @param pSDEFormRFName
     */
    @JsonIgnore
    public PSDEFormDetail psdeformrfname(String pSDEFormRFName){
        this.setPSDEFormRFName(pSDEFormRFName);
        return this;
    }

    /**
     * <B>PSDEFSFITEMID</B>&nbsp;属性搜索模式，指定搜索表单项使用的属性界面模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFSFItem} 
     */
    public final static String FIELD_PSDEFSFITEMID = "psdefsfitemid";

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMID}
     * 
     * @param pSDEFSFItemId
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMID)
    public void setPSDEFSFItemId(String pSDEFSFItemId){
        this.set(FIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemId(){
        Object objValue = this.get(FIELD_PSDEFSFITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty(){
        if(this.contains(FIELD_PSDEFSFITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemId(){
        this.reset(FIELD_PSDEFSFITEMID);
    }

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMID}
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItemId
     */
    @JsonIgnore
    public PSDEFormDetail psdefsfitemid(String pSDEFSFItemId){
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    /**
     * 设置 属性搜索模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItem 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdefsfitemid(PSDEFSFItem pSDEFSFItem){
        if(pSDEFSFItem == null){
            this.setPSDEFSFItemId(null);
            this.setPSDEFSFItemName(null);
        }
        else{
            this.setPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
        }
        return this;
    }

    /**
     * <B>PSDEFSFITEMNAME</B>&nbsp;属性搜索模式，指定搜索表单项使用的属性界面模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFSFITEMID}
     */
    public final static String FIELD_PSDEFSFITEMNAME = "psdefsfitemname";

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMNAME}
     * 
     * @param pSDEFSFItemName
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMNAME)
    public void setPSDEFSFItemName(String pSDEFSFItemName){
        this.set(FIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }
    
    /**
     * 获取 属性搜索模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemName(){
        Object objValue = this.get(FIELD_PSDEFSFITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty(){
        if(this.contains(FIELD_PSDEFSFITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性搜索模式
     */
    @JsonIgnore
    public void resetPSDEFSFItemName(){
        this.reset(FIELD_PSDEFSFITEMNAME);
    }

    /**
     * 设置 属性搜索模式，详细说明：{@link #FIELD_PSDEFSFITEMNAME}
     * <P>
     * 等同 {@link #setPSDEFSFItemName}
     * @param pSDEFSFItemName
     */
    @JsonIgnore
    public PSDEFormDetail psdefsfitemname(String pSDEFSFItemName){
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体编号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体编号
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体编号  
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
     * 判断 实体编号 是否指定值，包括空值
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
     * 重置 实体编号
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体编号
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEFormDetail psdeid(String pSDEId){
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
    public PSDEFormDetail psdelogicid(String pSDELogicId){
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
    public PSDEFormDetail psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体界面逻辑
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体界面逻辑  
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
     * 判断 实体界面逻辑 是否指定值，包括空值
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
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体界面逻辑
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDEFormDetail psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组，指定表单分组面板使用的界面行为组，界面行为组将在分组面板标题区展开
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
    public PSDEFormDetail psdeuagroupid(String pSDEUAGroupId){
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
    public PSDEFormDetail psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组，指定表单分组面板使用的界面行为组，界面行为组将在分组面板标题区展开
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
    public PSDEFormDetail psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为，表单按钮处理类型【界面行为】时指定触发的界面行为操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 实体界面行为  
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
     * 判断 实体界面行为 是否指定值，包括空值
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
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDEFormDetail psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 实体界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail psdeuiactionid(PSDEUIAction pSDEUIAction){
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
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为，表单按钮处理类型【界面行为】时指定触发的界面行为操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 实体界面行为  
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
     * 判断 实体界面行为 是否指定值，包括空值
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
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDEFormDetail psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定表单成员的加载的计数器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCounter} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSDEFormDetail pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 系统计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail pssyscounterid(PSSysCounter pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定表单成员的加载的计数器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSDEFormDetail pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;容器样式表，指定表单成员的容器样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 容器样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 容器样式表  
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
     * 判断 容器样式表 是否指定值，包括空值
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
     * 重置 容器样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 容器样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEFormDetail pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 容器样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;容器样式表，指定表单成员的容器样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 容器样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 容器样式表  
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
     * 判断 容器样式表 是否指定值，包括空值
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
     * 重置 容器样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 容器样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEFormDetail pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDICTCATID</B>&nbsp;输入词条类别，指定表单项编辑器使用的辅助输入词条类别对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDictCat} 
     */
    public final static String FIELD_PSSYSDICTCATID = "pssysdictcatid";

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATID}
     * 
     * @param pSSysDictCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATID)
    public void setPSSysDictCatId(String pSSysDictCatId){
        this.set(FIELD_PSSYSDICTCATID, pSSysDictCatId);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatId(){
        Object objValue = this.get(FIELD_PSSYSDICTCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatIdDirty(){
        if(this.contains(FIELD_PSSYSDICTCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatId(){
        this.reset(FIELD_PSSYSDICTCATID);
    }

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATID}
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCatId
     */
    @JsonIgnore
    public PSDEFormDetail pssysdictcatid(String pSSysDictCatId){
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    /**
     * 设置 输入词条类别，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCat 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail pssysdictcatid(PSSysDictCat pSSysDictCat){
        if(pSSysDictCat == null){
            this.setPSSysDictCatId(null);
            this.setPSSysDictCatName(null);
        }
        else{
            this.setPSSysDictCatId(pSSysDictCat.getPSSysDictCatId());
            this.setPSSysDictCatName(pSSysDictCat.getPSSysDictCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSDICTCATNAME</B>&nbsp;输入词条类别，指定表单项编辑器使用的辅助输入词条类别对象，未定义时使用引用的属性界面模式的配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDICTCATID}
     */
    public final static String FIELD_PSSYSDICTCATNAME = "pssysdictcatname";

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * 
     * @param pSSysDictCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATNAME)
    public void setPSSysDictCatName(String pSSysDictCatName){
        this.set(FIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatName(){
        Object objValue = this.get(FIELD_PSSYSDICTCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatNameDirty(){
        if(this.contains(FIELD_PSSYSDICTCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatName(){
        this.reset(FIELD_PSSYSDICTCATNAME);
    }

    /**
     * 设置 输入词条类别，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * <P>
     * 等同 {@link #setPSSysDictCatName}
     * @param pSSysDictCatName
     */
    @JsonIgnore
    public PSDEFormDetail pssysdictcatname(String pSSysDictCatName){
        this.setPSSysDictCatName(pSSysDictCatName);
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
    public PSDEFormDetail pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDEFormDetail pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDEFormDetail pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;编辑器样式，指定表单项的编辑器的扩展样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEditorStyle} 
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleId(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleIdDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSDEFormDetail pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * 设置 编辑器样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyle 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
        if(pSSysEditorStyle == null){
            this.setPSSysEditorStyleId(null);
            this.setPSSysEditorStyleName(null);
        }
        else{
            this.setPSSysEditorStyleId(pSSysEditorStyle.getPSSysEditorStyleId());
            this.setPSSysEditorStyleName(pSSysEditorStyle.getPSSysEditorStyleName());
        }
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式，指定表单项的编辑器的扩展样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEDITORSTYLEID}
     */
    public final static String FIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * 
     * @param pSSysEditorStyleName
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLENAME)
    public void setPSSysEditorStyleName(String pSSysEditorStyleName){
        this.set(FIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }
    
    /**
     * 获取 编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleName(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleNameDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleName(){
        this.reset(FIELD_PSSYSEDITORSTYLENAME);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * <P>
     * 等同 {@link #setPSSysEditorStyleName}
     * @param pSSysEditorStyleName
     */
    @JsonIgnore
    public PSDEFormDetail pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定表单成员的图标对象，各类型成员按自身约定放置图标对象
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
    public PSDEFormDetail pssysimageid(String pSSysImageId){
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
    public PSDEFormDetail pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定表单成员的图标对象，各类型成员按自身约定放置图标对象
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
    public PSDEFormDetail pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源，直接内容项类型为【直接内容】或【html内容】时指定系统预置的资源对象进行内容提供
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源，详细说明：{@link #FIELD_PSSYSRESOURCEID}
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
     * 设置 系统资源，详细说明：{@link #FIELD_PSSYSRESOURCEID}
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSDEFormDetail pssysresourceid(String pSSysResourceId){
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
    public PSDEFormDetail pssysresourceid(PSSysResource pSSysResource){
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
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源，直接内容项类型为【直接内容】或【html内容】时指定系统预置的资源对象进行内容提供
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源，详细说明：{@link #FIELD_PSSYSRESOURCENAME}
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
     * 设置 系统资源，详细说明：{@link #FIELD_PSSYSRESOURCENAME}
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSDEFormDetail pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
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
    public PSDEFormDetail rawcontent(String rawContent){
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
    public PSDEFormDetail rawcssstyle(String rawCssStyle){
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    /**
     * <B>RAWSERVICEMETHOD</B>&nbsp;直接服务请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_RAWSERVICEMETHOD = "rawservicemethod";

    /**
     * 设置 直接服务请求方式
     * 
     * @param rawServiceMethod
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEMETHOD)
    public void setRawServiceMethod(String rawServiceMethod){
        this.set(FIELD_RAWSERVICEMETHOD, rawServiceMethod);
    }
    
    /**
     * 获取 直接服务请求方式  
     * @return
     */
    @JsonIgnore
    public String getRawServiceMethod(){
        Object objValue = this.get(FIELD_RAWSERVICEMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceMethodDirty(){
        if(this.contains(FIELD_RAWSERVICEMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务请求方式
     */
    @JsonIgnore
    public void resetRawServiceMethod(){
        this.reset(FIELD_RAWSERVICEMETHOD);
    }

    /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSDEFormDetail rawservicemethod(String rawServiceMethod){
        this.setRawServiceMethod(rawServiceMethod);
        return this;
    }

     /**
     * 设置 直接服务请求方式
     * <P>
     * 等同 {@link #setRawServiceMethod}
     * @param rawServiceMethod
     */
    @JsonIgnore
    public PSDEFormDetail rawservicemethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod rawServiceMethod){
        if(rawServiceMethod == null){
            this.setRawServiceMethod(null);
        }
        else{
            this.setRawServiceMethod(rawServiceMethod.value);
        }
        return this;
    }

    /**
     * <B>RAWSERVICEURL</B>&nbsp;直接服务路径
     */
    public final static String FIELD_RAWSERVICEURL = "rawserviceurl";

    /**
     * 设置 直接服务路径
     * 
     * @param rawServiceUrl
     * 
     */
    @JsonProperty(FIELD_RAWSERVICEURL)
    public void setRawServiceUrl(String rawServiceUrl){
        this.set(FIELD_RAWSERVICEURL, rawServiceUrl);
    }
    
    /**
     * 获取 直接服务路径  
     * @return
     */
    @JsonIgnore
    public String getRawServiceUrl(){
        Object objValue = this.get(FIELD_RAWSERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawServiceUrlDirty(){
        if(this.contains(FIELD_RAWSERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接服务路径
     */
    @JsonIgnore
    public void resetRawServiceUrl(){
        this.reset(FIELD_RAWSERVICEURL);
    }

    /**
     * 设置 直接服务路径
     * <P>
     * 等同 {@link #setRawServiceUrl}
     * @param rawServiceUrl
     */
    @JsonIgnore
    public PSDEFormDetail rawserviceurl(String rawServiceUrl){
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    /**
     * <B>REFPSDEACMODEID</B>&nbsp;引用实体自填模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_REFPSDEACMODEID = "refpsdeacmodeid";

    /**
     * 设置 引用实体自填模式
     * 
     * @param refPSDEACModeId
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODEID)
    public void setRefPSDEACModeId(String refPSDEACModeId){
        this.set(FIELD_REFPSDEACMODEID, refPSDEACModeId);
    }
    
    /**
     * 获取 引用实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeId(){
        Object objValue = this.get(FIELD_REFPSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeIdDirty(){
        if(this.contains(FIELD_REFPSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeId(){
        this.reset(FIELD_REFPSDEACMODEID);
    }

    /**
     * 设置 引用实体自填模式
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param refPSDEACModeId
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeacmodeid(String refPSDEACModeId){
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    /**
     * 设置 引用实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeacmodeid(PSDEACMode pSDEACMode){
        if(pSDEACMode == null){
            this.setRefPSDEACModeId(null);
            this.setRefPSDEACModeName(null);
        }
        else{
            this.setRefPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setRefPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>REFPSDEACMODENAME</B>&nbsp;引用实体自填模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEACMODEID}
     */
    public final static String FIELD_REFPSDEACMODENAME = "refpsdeacmodename";

    /**
     * 设置 引用实体自填模式
     * 
     * @param refPSDEACModeName
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODENAME)
    public void setRefPSDEACModeName(String refPSDEACModeName){
        this.set(FIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }
    
    /**
     * 获取 引用实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeName(){
        Object objValue = this.get(FIELD_REFPSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeNameDirty(){
        if(this.contains(FIELD_REFPSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeName(){
        this.reset(FIELD_REFPSDEACMODENAME);
    }

    /**
     * 设置 引用实体自填模式
     * <P>
     * 等同 {@link #setRefPSDEACModeName}
     * @param refPSDEACModeName
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeacmodename(String refPSDEACModeName){
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    /**
     * <B>REFPSDEDATASETID</B>&nbsp;引用实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_REFPSDEDATASETID = "refpsdedatasetid";

    /**
     * 设置 引用实体数据集
     * 
     * @param refPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETID)
    public void setRefPSDEDataSetId(String refPSDEDataSetId){
        this.set(FIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }
    
    /**
     * 获取 引用实体数据集  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetId(){
        Object objValue = this.get(FIELD_REFPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty(){
        if(this.contains(FIELD_REFPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体数据集
     */
    @JsonIgnore
    public void resetRefPSDEDataSetId(){
        this.reset(FIELD_REFPSDEDATASETID);
    }

    /**
     * 设置 引用实体数据集
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param refPSDEDataSetId
     */
    @JsonIgnore
    public PSDEFormDetail refpsdedatasetid(String refPSDEDataSetId){
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    /**
     * 设置 引用实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail refpsdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        }
        else{
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>REFPSDEDATASETNAME</B>&nbsp;引用实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEDATASETID}
     */
    public final static String FIELD_REFPSDEDATASETNAME = "refpsdedatasetname";

    /**
     * 设置 引用实体数据集
     * 
     * @param refPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETNAME)
    public void setRefPSDEDataSetName(String refPSDEDataSetName){
        this.set(FIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }
    
    /**
     * 获取 引用实体数据集  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetName(){
        Object objValue = this.get(FIELD_REFPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty(){
        if(this.contains(FIELD_REFPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体数据集
     */
    @JsonIgnore
    public void resetRefPSDEDataSetName(){
        this.reset(FIELD_REFPSDEDATASETNAME);
    }

    /**
     * 设置 引用实体数据集
     * <P>
     * 等同 {@link #setRefPSDEDataSetName}
     * @param refPSDEDataSetName
     */
    @JsonIgnore
    public PSDEFormDetail refpsdedatasetname(String refPSDEDataSetName){
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    /**
     * <B>REFPSDEFORMDETAILID</B>&nbsp;表单成员引用，指定表单部件引用的表单部件的成员
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFormDetail} 
     */
    public final static String FIELD_REFPSDEFORMDETAILID = "refpsdeformdetailid";

    /**
     * 设置 表单成员引用，详细说明：{@link #FIELD_REFPSDEFORMDETAILID}
     * 
     * @param refPSDEFormDetailId
     * 
     */
    @JsonProperty(FIELD_REFPSDEFORMDETAILID)
    public void setRefPSDEFormDetailId(String refPSDEFormDetailId){
        this.set(FIELD_REFPSDEFORMDETAILID, refPSDEFormDetailId);
    }
    
    /**
     * 获取 表单成员引用  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFormDetailId(){
        Object objValue = this.get(FIELD_REFPSDEFORMDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单成员引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFormDetailIdDirty(){
        if(this.contains(FIELD_REFPSDEFORMDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单成员引用
     */
    @JsonIgnore
    public void resetRefPSDEFormDetailId(){
        this.reset(FIELD_REFPSDEFORMDETAILID);
    }

    /**
     * 设置 表单成员引用，详细说明：{@link #FIELD_REFPSDEFORMDETAILID}
     * <P>
     * 等同 {@link #setRefPSDEFormDetailId}
     * @param refPSDEFormDetailId
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeformdetailid(String refPSDEFormDetailId){
        this.setRefPSDEFormDetailId(refPSDEFormDetailId);
        return this;
    }

    /**
     * 设置 表单成员引用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEFormDetailId}
     * @param pSDEFormDetail 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeformdetailid(PSDEFormDetail pSDEFormDetail){
        if(pSDEFormDetail == null){
            this.setRefPSDEFormDetailId(null);
            this.setRefPSDEFormDetailName(null);
        }
        else{
            this.setRefPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setRefPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    /**
     * <B>REFPSDEFORMDETAILNAME</B>&nbsp;表单成员引用，指定表单部件引用的表单部件的成员
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEFORMDETAILID}
     */
    public final static String FIELD_REFPSDEFORMDETAILNAME = "refpsdeformdetailname";

    /**
     * 设置 表单成员引用，详细说明：{@link #FIELD_REFPSDEFORMDETAILNAME}
     * 
     * @param refPSDEFormDetailName
     * 
     */
    @JsonProperty(FIELD_REFPSDEFORMDETAILNAME)
    public void setRefPSDEFormDetailName(String refPSDEFormDetailName){
        this.set(FIELD_REFPSDEFORMDETAILNAME, refPSDEFormDetailName);
    }
    
    /**
     * 获取 表单成员引用  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFormDetailName(){
        Object objValue = this.get(FIELD_REFPSDEFORMDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单成员引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFormDetailNameDirty(){
        if(this.contains(FIELD_REFPSDEFORMDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单成员引用
     */
    @JsonIgnore
    public void resetRefPSDEFormDetailName(){
        this.reset(FIELD_REFPSDEFORMDETAILNAME);
    }

    /**
     * 设置 表单成员引用，详细说明：{@link #FIELD_REFPSDEFORMDETAILNAME}
     * <P>
     * 等同 {@link #setRefPSDEFormDetailName}
     * @param refPSDEFormDetailName
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeformdetailname(String refPSDEFormDetailName){
        this.setRefPSDEFormDetailName(refPSDEFormDetailName);
        return this;
    }

    /**
     * <B>REFPSDEFORMID</B>&nbsp;REFPSDEFORMID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMRFID}
     */
    public final static String FIELD_REFPSDEFORMID = "refpsdeformid";

    /**
     * 设置 REFPSDEFORMID
     * 
     * @param refPSDEFormId
     * 
     */
    @JsonProperty(FIELD_REFPSDEFORMID)
    public void setRefPSDEFormId(String refPSDEFormId){
        this.set(FIELD_REFPSDEFORMID, refPSDEFormId);
    }
    
    /**
     * 获取 REFPSDEFORMID  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFormId(){
        Object objValue = this.get(FIELD_REFPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 REFPSDEFORMID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFormIdDirty(){
        if(this.contains(FIELD_REFPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 REFPSDEFORMID
     */
    @JsonIgnore
    public void resetRefPSDEFormId(){
        this.reset(FIELD_REFPSDEFORMID);
    }

    /**
     * 设置 REFPSDEFORMID
     * <P>
     * 等同 {@link #setRefPSDEFormId}
     * @param refPSDEFormId
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeformid(String refPSDEFormId){
        this.setRefPSDEFormId(refPSDEFormId);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体
     * 
     * @param refPSDEId
     * 
     */
    @JsonProperty(FIELD_REFPSDEID)
    public void setRefPSDEId(String refPSDEId){
        this.set(FIELD_REFPSDEID, refPSDEId);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEId(){
        Object objValue = this.get(FIELD_REFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEIdDirty(){
        if(this.contains(FIELD_REFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEId(){
        this.reset(FIELD_REFPSDEID);
    }

    /**
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeid(String refPSDEId){
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    /**
     * 设置 引用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail refpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        }
        else{
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>REFPSDENAME</B>&nbsp;引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体
     * 
     * @param refPSDEName
     * 
     */
    @JsonProperty(FIELD_REFPSDENAME)
    public void setRefPSDEName(String refPSDEName){
        this.set(FIELD_REFPSDENAME, refPSDEName);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEName(){
        Object objValue = this.get(FIELD_REFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDENameDirty(){
        if(this.contains(FIELD_REFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEName(){
        this.reset(FIELD_REFPSDENAME);
    }

    /**
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDEFormDetail refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSDERID</B>&nbsp;引用实体关系，指定表单项的引用实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_REFPSDERID = "refpsderid";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * 
     * @param refPSDERId
     * 
     */
    @JsonProperty(FIELD_REFPSDERID)
    public void setRefPSDERId(String refPSDERId){
        this.set(FIELD_REFPSDERID, refPSDERId);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERId(){
        Object objValue = this.get(FIELD_REFPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERIdDirty(){
        if(this.contains(FIELD_REFPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERId(){
        this.reset(FIELD_REFPSDERID);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param refPSDERId
     */
    @JsonIgnore
    public PSDEFormDetail refpsderid(String refPSDERId){
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    /**
     * 设置 引用实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail refpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setRefPSDERId(null);
            this.setRefPSDERName(null);
        }
        else{
            this.setRefPSDERId(pSDER.getPSDERId());
            this.setRefPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>REFPSDERNAME</B>&nbsp;引用实体关系，指定表单项的引用实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDERID}
     */
    public final static String FIELD_REFPSDERNAME = "refpsdername";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * 
     * @param refPSDERName
     * 
     */
    @JsonProperty(FIELD_REFPSDERNAME)
    public void setRefPSDERName(String refPSDERName){
        this.set(FIELD_REFPSDERNAME, refPSDERName);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERName(){
        Object objValue = this.get(FIELD_REFPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERNameDirty(){
        if(this.contains(FIELD_REFPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERName(){
        this.reset(FIELD_REFPSDERNAME);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * <P>
     * 等同 {@link #setRefPSDERName}
     * @param refPSDERName
     */
    @JsonIgnore
    public PSDEFormDetail refpsdername(String refPSDERName){
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    /**
     * <B>RENDERMODE</B>&nbsp;绘制模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_RENDERMODE = "rendermode";

    /**
     * 设置 绘制模式
     * 
     * @param renderMode
     * 
     */
    @JsonProperty(FIELD_RENDERMODE)
    public void setRenderMode(String renderMode){
        this.set(FIELD_RENDERMODE, renderMode);
    }
    
    /**
     * 获取 绘制模式  
     * @return
     */
    @JsonIgnore
    public String getRenderMode(){
        Object objValue = this.get(FIELD_RENDERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRenderModeDirty(){
        if(this.contains(FIELD_RENDERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绘制模式
     */
    @JsonIgnore
    public void resetRenderMode(){
        this.reset(FIELD_RENDERMODE);
    }

    /**
     * 设置 绘制模式
     * <P>
     * 等同 {@link #setRenderMode}
     * @param renderMode
     */
    @JsonIgnore
    public PSDEFormDetail rendermode(String renderMode){
        this.setRenderMode(renderMode);
        return this;
    }

    /**
     * <B>RENDERMODETEXT</B>&nbsp;绘制模式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_RENDERMODETEXT = "rendermodetext";

    /**
     * 设置 绘制模式
     * 
     * @param renderModeText
     * 
     */
    @JsonProperty(FIELD_RENDERMODETEXT)
    public void setRenderModeText(String renderModeText){
        this.set(FIELD_RENDERMODETEXT, renderModeText);
    }
    
    /**
     * 获取 绘制模式  
     * @return
     */
    @JsonIgnore
    public String getRenderModeText(){
        Object objValue = this.get(FIELD_RENDERMODETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRenderModeTextDirty(){
        if(this.contains(FIELD_RENDERMODETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绘制模式
     */
    @JsonIgnore
    public void resetRenderModeText(){
        this.reset(FIELD_RENDERMODETEXT);
    }

    /**
     * 设置 绘制模式
     * <P>
     * 等同 {@link #setRenderModeText}
     * @param renderModeText
     */
    @JsonIgnore
    public PSDEFormDetail rendermodetext(String renderModeText){
        this.setRenderModeText(renderModeText);
        return this;
    }

    /**
     * <B>RESETITEMNAME</B>&nbsp;重置项名称，指定表单项监控的重置项名称，当重置项值发生变化时重置当前表单项
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_RESETITEMNAME = "resetitemname";

    /**
     * 设置 重置项名称，详细说明：{@link #FIELD_RESETITEMNAME}
     * 
     * @param resetItemName
     * 
     */
    @JsonProperty(FIELD_RESETITEMNAME)
    public void setResetItemName(String resetItemName){
        this.set(FIELD_RESETITEMNAME, resetItemName);
    }
    
    /**
     * 获取 重置项名称  
     * @return
     */
    @JsonIgnore
    public String getResetItemName(){
        Object objValue = this.get(FIELD_RESETITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 重置项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResetItemNameDirty(){
        if(this.contains(FIELD_RESETITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重置项名称
     */
    @JsonIgnore
    public void resetResetItemName(){
        this.reset(FIELD_RESETITEMNAME);
    }

    /**
     * 设置 重置项名称，详细说明：{@link #FIELD_RESETITEMNAME}
     * <P>
     * 等同 {@link #setResetItemName}
     * @param resetItemName
     */
    @JsonIgnore
    public PSDEFormDetail resetitemname(String resetItemName){
        this.setResetItemName(resetItemName);
        return this;
    }

    /**
     * <B>ROWSPAN</B>&nbsp;行数，表单成员父容器布局模式为【表格布局】时指定成员的占位行数，未定义时为【1】
     */
    public final static String FIELD_ROWSPAN = "rowspan";

    /**
     * 设置 行数，详细说明：{@link #FIELD_ROWSPAN}
     * 
     * @param rowSpan
     * 
     */
    @JsonProperty(FIELD_ROWSPAN)
    public void setRowSpan(Integer rowSpan){
        this.set(FIELD_ROWSPAN, rowSpan);
    }
    
    /**
     * 获取 行数  
     * @return
     */
    @JsonIgnore
    public Integer getRowSpan(){
        Object objValue = this.get(FIELD_ROWSPAN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRowSpanDirty(){
        if(this.contains(FIELD_ROWSPAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行数
     */
    @JsonIgnore
    public void resetRowSpan(){
        this.reset(FIELD_ROWSPAN);
    }

    /**
     * 设置 行数，详细说明：{@link #FIELD_ROWSPAN}
     * <P>
     * 等同 {@link #setRowSpan}
     * @param rowSpan
     */
    @JsonIgnore
    public PSDEFormDetail rowspan(Integer rowSpan){
        this.setRowSpan(rowSpan);
        return this;
    }

    /**
     * <B>SHOWCAPTION</B>&nbsp;显示标题，指定表单成员是否显示标题，表单项成员忽略此参数，其它成员默认显示标题
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWCAPTION = "showcaption";

    /**
     * 设置 显示标题，详细说明：{@link #FIELD_SHOWCAPTION}
     * 
     * @param showCaption
     * 
     */
    @JsonProperty(FIELD_SHOWCAPTION)
    public void setShowCaption(Integer showCaption){
        this.set(FIELD_SHOWCAPTION, showCaption);
    }
    
    /**
     * 获取 显示标题  
     * @return
     */
    @JsonIgnore
    public Integer getShowCaption(){
        Object objValue = this.get(FIELD_SHOWCAPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowCaptionDirty(){
        if(this.contains(FIELD_SHOWCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题
     */
    @JsonIgnore
    public void resetShowCaption(){
        this.reset(FIELD_SHOWCAPTION);
    }

    /**
     * 设置 显示标题，详细说明：{@link #FIELD_SHOWCAPTION}
     * <P>
     * 等同 {@link #setShowCaption}
     * @param showCaption
     */
    @JsonIgnore
    public PSDEFormDetail showcaption(Integer showCaption){
        this.setShowCaption(showCaption);
        return this;
    }

     /**
     * 设置 显示标题，详细说明：{@link #FIELD_SHOWCAPTION}
     * <P>
     * 等同 {@link #setShowCaption}
     * @param showCaption
     */
    @JsonIgnore
    public PSDEFormDetail showcaption(Boolean showCaption){
        if(showCaption == null){
            this.setShowCaption(null);
        }
        else{
            this.setShowCaption(showCaption?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHOWMOREMODE</B>&nbsp;显示更多模式，指定表单成员的显示更多模式，为定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailShowMoreMode} 
     */
    public final static String FIELD_SHOWMOREMODE = "showmoremode";

    /**
     * 设置 显示更多模式，详细说明：{@link #FIELD_SHOWMOREMODE}
     * 
     * @param showMoreMode
     * 
     */
    @JsonProperty(FIELD_SHOWMOREMODE)
    public void setShowMoreMode(Integer showMoreMode){
        this.set(FIELD_SHOWMOREMODE, showMoreMode);
    }
    
    /**
     * 获取 显示更多模式  
     * @return
     */
    @JsonIgnore
    public Integer getShowMoreMode(){
        Object objValue = this.get(FIELD_SHOWMOREMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示更多模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowMoreModeDirty(){
        if(this.contains(FIELD_SHOWMOREMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示更多模式
     */
    @JsonIgnore
    public void resetShowMoreMode(){
        this.reset(FIELD_SHOWMOREMODE);
    }

    /**
     * 设置 显示更多模式，详细说明：{@link #FIELD_SHOWMOREMODE}
     * <P>
     * 等同 {@link #setShowMoreMode}
     * @param showMoreMode
     */
    @JsonIgnore
    public PSDEFormDetail showmoremode(Integer showMoreMode){
        this.setShowMoreMode(showMoreMode);
        return this;
    }

     /**
     * 设置 显示更多模式，详细说明：{@link #FIELD_SHOWMOREMODE}
     * <P>
     * 等同 {@link #setShowMoreMode}
     * @param showMoreMode
     */
    @JsonIgnore
    public PSDEFormDetail showmoremode(net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailShowMoreMode showMoreMode){
        if(showMoreMode == null){
            this.setShowMoreMode(null);
        }
        else{
            this.setShowMoreMode(showMoreMode.value);
        }
        return this;
    }

    /**
     * <B>SPACINGBOTTOM</B>&nbsp;下方间隔
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode} 
     */
    public final static String FIELD_SPACINGBOTTOM = "spacingbottom";

    /**
     * 设置 下方间隔
     * 
     * @param spacingBottom
     * 
     */
    @JsonProperty(FIELD_SPACINGBOTTOM)
    public void setSpacingBottom(String spacingBottom){
        this.set(FIELD_SPACINGBOTTOM, spacingBottom);
    }
    
    /**
     * 获取 下方间隔  
     * @return
     */
    @JsonIgnore
    public String getSpacingBottom(){
        Object objValue = this.get(FIELD_SPACINGBOTTOM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下方间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSpacingBottomDirty(){
        if(this.contains(FIELD_SPACINGBOTTOM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下方间隔
     */
    @JsonIgnore
    public void resetSpacingBottom(){
        this.reset(FIELD_SPACINGBOTTOM);
    }

    /**
     * 设置 下方间隔
     * <P>
     * 等同 {@link #setSpacingBottom}
     * @param spacingBottom
     */
    @JsonIgnore
    public PSDEFormDetail spacingbottom(String spacingBottom){
        this.setSpacingBottom(spacingBottom);
        return this;
    }

     /**
     * 设置 下方间隔
     * <P>
     * 等同 {@link #setSpacingBottom}
     * @param spacingBottom
     */
    @JsonIgnore
    public PSDEFormDetail spacingbottom(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingBottom){
        if(spacingBottom == null){
            this.setSpacingBottom(null);
        }
        else{
            this.setSpacingBottom(spacingBottom.value);
        }
        return this;
    }

    /**
     * <B>SPACINGLEFT</B>&nbsp;左侧间隔
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode} 
     */
    public final static String FIELD_SPACINGLEFT = "spacingleft";

    /**
     * 设置 左侧间隔
     * 
     * @param spacingLeft
     * 
     */
    @JsonProperty(FIELD_SPACINGLEFT)
    public void setSpacingLeft(String spacingLeft){
        this.set(FIELD_SPACINGLEFT, spacingLeft);
    }
    
    /**
     * 获取 左侧间隔  
     * @return
     */
    @JsonIgnore
    public String getSpacingLeft(){
        Object objValue = this.get(FIELD_SPACINGLEFT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 左侧间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSpacingLeftDirty(){
        if(this.contains(FIELD_SPACINGLEFT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左侧间隔
     */
    @JsonIgnore
    public void resetSpacingLeft(){
        this.reset(FIELD_SPACINGLEFT);
    }

    /**
     * 设置 左侧间隔
     * <P>
     * 等同 {@link #setSpacingLeft}
     * @param spacingLeft
     */
    @JsonIgnore
    public PSDEFormDetail spacingleft(String spacingLeft){
        this.setSpacingLeft(spacingLeft);
        return this;
    }

     /**
     * 设置 左侧间隔
     * <P>
     * 等同 {@link #setSpacingLeft}
     * @param spacingLeft
     */
    @JsonIgnore
    public PSDEFormDetail spacingleft(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingLeft){
        if(spacingLeft == null){
            this.setSpacingLeft(null);
        }
        else{
            this.setSpacingLeft(spacingLeft.value);
        }
        return this;
    }

    /**
     * <B>SPACINGRIGHT</B>&nbsp;右侧间隔
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode} 
     */
    public final static String FIELD_SPACINGRIGHT = "spacingright";

    /**
     * 设置 右侧间隔
     * 
     * @param spacingRight
     * 
     */
    @JsonProperty(FIELD_SPACINGRIGHT)
    public void setSpacingRight(String spacingRight){
        this.set(FIELD_SPACINGRIGHT, spacingRight);
    }
    
    /**
     * 获取 右侧间隔  
     * @return
     */
    @JsonIgnore
    public String getSpacingRight(){
        Object objValue = this.get(FIELD_SPACINGRIGHT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 右侧间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSpacingRightDirty(){
        if(this.contains(FIELD_SPACINGRIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右侧间隔
     */
    @JsonIgnore
    public void resetSpacingRight(){
        this.reset(FIELD_SPACINGRIGHT);
    }

    /**
     * 设置 右侧间隔
     * <P>
     * 等同 {@link #setSpacingRight}
     * @param spacingRight
     */
    @JsonIgnore
    public PSDEFormDetail spacingright(String spacingRight){
        this.setSpacingRight(spacingRight);
        return this;
    }

     /**
     * 设置 右侧间隔
     * <P>
     * 等同 {@link #setSpacingRight}
     * @param spacingRight
     */
    @JsonIgnore
    public PSDEFormDetail spacingright(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingRight){
        if(spacingRight == null){
            this.setSpacingRight(null);
        }
        else{
            this.setSpacingRight(spacingRight.value);
        }
        return this;
    }

    /**
     * <B>SPACINGTOP</B>&nbsp;上方间隔
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode} 
     */
    public final static String FIELD_SPACINGTOP = "spacingtop";

    /**
     * 设置 上方间隔
     * 
     * @param spacingTop
     * 
     */
    @JsonProperty(FIELD_SPACINGTOP)
    public void setSpacingTop(String spacingTop){
        this.set(FIELD_SPACINGTOP, spacingTop);
    }
    
    /**
     * 获取 上方间隔  
     * @return
     */
    @JsonIgnore
    public String getSpacingTop(){
        Object objValue = this.get(FIELD_SPACINGTOP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上方间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSpacingTopDirty(){
        if(this.contains(FIELD_SPACINGTOP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上方间隔
     */
    @JsonIgnore
    public void resetSpacingTop(){
        this.reset(FIELD_SPACINGTOP);
    }

    /**
     * 设置 上方间隔
     * <P>
     * 等同 {@link #setSpacingTop}
     * @param spacingTop
     */
    @JsonIgnore
    public PSDEFormDetail spacingtop(String spacingTop){
        this.setSpacingTop(spacingTop);
        return this;
    }

     /**
     * 设置 上方间隔
     * <P>
     * 等同 {@link #setSpacingTop}
     * @param spacingTop
     */
    @JsonIgnore
    public PSDEFormDetail spacingtop(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingTop){
        if(spacingTop == null){
            this.setSpacingTop(null);
        }
        else{
            this.setSpacingTop(spacingTop.value);
        }
        return this;
    }

    /**
     * <B>SWAPMODE</B>&nbsp;内容换行模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_SWAPMODE = "swapmode";

    /**
     * 设置 内容换行模式
     * 
     * @param swapMode
     * 
     */
    @JsonProperty(FIELD_SWAPMODE)
    public void setSwapMode(String swapMode){
        this.set(FIELD_SWAPMODE, swapMode);
    }
    
    /**
     * 获取 内容换行模式  
     * @return
     */
    @JsonIgnore
    public String getSwapMode(){
        Object objValue = this.get(FIELD_SWAPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容换行模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwapModeDirty(){
        if(this.contains(FIELD_SWAPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容换行模式
     */
    @JsonIgnore
    public void resetSwapMode(){
        this.reset(FIELD_SWAPMODE);
    }

    /**
     * 设置 内容换行模式
     * <P>
     * 等同 {@link #setSwapMode}
     * @param swapMode
     */
    @JsonIgnore
    public PSDEFormDetail swapmode(String swapMode){
        this.setSwapMode(swapMode);
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
    public PSDEFormDetail templatemode(Integer templateMode){
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
    public PSDEFormDetail templatemode(Boolean templateMode){
        if(templateMode == null){
            this.setTemplateMode(null);
        }
        else{
            this.setTemplateMode(templateMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEFormDetail tippslanresid(String tipPSLanResId){
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
    public PSDEFormDetail tippslanresid(PSLanguageRes pSLanguageRes){
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
    public PSDEFormDetail tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TITLEBARCLOSEMODE</B>&nbsp;标题栏关闭模式，指定表单分组标题栏关闭模式，未定义时为【无关闭】
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
    public PSDEFormDetail titlebarclosemode(Integer titleBarCloseMode){
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
    public PSDEFormDetail titlebarclosemode(net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode){
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
    public PSDEFormDetail togglemode(String toggleMode){
        this.setToggleMode(toggleMode);
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
    public PSDEFormDetail tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    /**
     * <B>UCPSSYSPFPLUGINID</B>&nbsp;自定义前端插件，指定自定义前端插件使用的前端模板扩展插件，使用插件类型【表单自定义控件绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_UCPSSYSPFPLUGINID = "ucpssyspfpluginid";

    /**
     * 设置 自定义前端插件，详细说明：{@link #FIELD_UCPSSYSPFPLUGINID}
     * 
     * @param uCPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_UCPSSYSPFPLUGINID)
    public void setUCPSSysPFPluginId(String uCPSSysPFPluginId){
        this.set(FIELD_UCPSSYSPFPLUGINID, uCPSSysPFPluginId);
    }
    
    /**
     * 获取 自定义前端插件  
     * @return
     */
    @JsonIgnore
    public String getUCPSSysPFPluginId(){
        Object objValue = this.get(FIELD_UCPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUCPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_UCPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义前端插件
     */
    @JsonIgnore
    public void resetUCPSSysPFPluginId(){
        this.reset(FIELD_UCPSSYSPFPLUGINID);
    }

    /**
     * 设置 自定义前端插件，详细说明：{@link #FIELD_UCPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setUCPSSysPFPluginId}
     * @param uCPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEFormDetail ucpssyspfpluginid(String uCPSSysPFPluginId){
        this.setUCPSSysPFPluginId(uCPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 自定义前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUCPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEFormDetail ucpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setUCPSSysPFPluginId(null);
            this.setUCPSSysPFPluginName(null);
        }
        else{
            this.setUCPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setUCPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>UCPSSYSPFPLUGINNAME</B>&nbsp;自定义前端插件，指定自定义前端插件使用的前端模板扩展插件，使用插件类型【表单自定义控件绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UCPSSYSPFPLUGINID}
     */
    public final static String FIELD_UCPSSYSPFPLUGINNAME = "ucpssyspfpluginname";

    /**
     * 设置 自定义前端插件，详细说明：{@link #FIELD_UCPSSYSPFPLUGINNAME}
     * 
     * @param uCPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_UCPSSYSPFPLUGINNAME)
    public void setUCPSSysPFPluginName(String uCPSSysPFPluginName){
        this.set(FIELD_UCPSSYSPFPLUGINNAME, uCPSSysPFPluginName);
    }
    
    /**
     * 获取 自定义前端插件  
     * @return
     */
    @JsonIgnore
    public String getUCPSSysPFPluginName(){
        Object objValue = this.get(FIELD_UCPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUCPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_UCPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义前端插件
     */
    @JsonIgnore
    public void resetUCPSSysPFPluginName(){
        this.reset(FIELD_UCPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 自定义前端插件，详细说明：{@link #FIELD_UCPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setUCPSSysPFPluginName}
     * @param uCPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEFormDetail ucpssyspfpluginname(String uCPSSysPFPluginName){
        this.setUCPSSysPFPluginName(uCPSSysPFPluginName);
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
    public PSDEFormDetail updatedate(String updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEDV</B>&nbsp;更新默认值，指定表单项的更新默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UPDATEDV = "updatedv";

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * 
     * @param updateDV
     * 
     */
    @JsonProperty(FIELD_UPDATEDV)
    public void setUpdateDV(String updateDV){
        this.set(FIELD_UPDATEDV, updateDV);
    }
    
    /**
     * 获取 更新默认值  
     * @return
     */
    @JsonIgnore
    public String getUpdateDV(){
        Object objValue = this.get(FIELD_UPDATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVDirty(){
        if(this.contains(FIELD_UPDATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值
     */
    @JsonIgnore
    public void resetUpdateDV(){
        this.reset(FIELD_UPDATEDV);
    }

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * <P>
     * 等同 {@link #setUpdateDV}
     * @param updateDV
     */
    @JsonIgnore
    public PSDEFormDetail updatedv(String updateDV){
        this.setUpdateDV(updateDV);
        return this;
    }

    /**
     * <B>UPDATEDVT</B>&nbsp;更新默认值类型，指定表单项的更新默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType} 
     */
    public final static String FIELD_UPDATEDVT = "updatedvt";

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * 
     * @param updateDVT
     * 
     */
    @JsonProperty(FIELD_UPDATEDVT)
    public void setUpdateDVT(String updateDVT){
        this.set(FIELD_UPDATEDVT, updateDVT);
    }
    
    /**
     * 获取 更新默认值类型  
     * @return
     */
    @JsonIgnore
    public String getUpdateDVT(){
        Object objValue = this.get(FIELD_UPDATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVTDirty(){
        if(this.contains(FIELD_UPDATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值类型
     */
    @JsonIgnore
    public void resetUpdateDVT(){
        this.reset(FIELD_UPDATEDVT);
    }

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDEFormDetail updatedvt(String updateDVT){
        this.setUpdateDVT(updateDVT);
        return this;
    }

     /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDEFormDetail updatedvt(net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType updateDVT){
        if(updateDVT == null){
            this.setUpdateDVT(null);
        }
        else{
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDEFormDetail updateman(String updateMan){
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
    public PSDEFormDetail usertag(String userTag){
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
    public PSDEFormDetail usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALIGN</B>&nbsp;垂直对齐
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign} 
     */
    public final static String FIELD_VALIGN = "valign";

    /**
     * 设置 垂直对齐
     * 
     * @param vAlign
     * 
     */
    @JsonProperty(FIELD_VALIGN)
    public void setVAlign(String vAlign){
        this.set(FIELD_VALIGN, vAlign);
    }
    
    /**
     * 获取 垂直对齐  
     * @return
     */
    @JsonIgnore
    public String getVAlign(){
        Object objValue = this.get(FIELD_VALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 垂直对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVAlignDirty(){
        if(this.contains(FIELD_VALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 垂直对齐
     */
    @JsonIgnore
    public void resetVAlign(){
        this.reset(FIELD_VALIGN);
    }

    /**
     * 设置 垂直对齐
     * <P>
     * 等同 {@link #setVAlign}
     * @param vAlign
     */
    @JsonIgnore
    public PSDEFormDetail valign(String vAlign){
        this.setVAlign(vAlign);
        return this;
    }

     /**
     * 设置 垂直对齐
     * <P>
     * 等同 {@link #setVAlign}
     * @param vAlign
     */
    @JsonIgnore
    public PSDEFormDetail valign(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlign){
        if(vAlign == null){
            this.setVAlign(null);
        }
        else{
            this.setVAlign(vAlign.value);
        }
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
    public PSDEFormDetail valignself(String vAlignSelf){
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
    public PSDEFormDetail valignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlignSelf){
        if(vAlignSelf == null){
            this.setVAlignSelf(null);
        }
        else{
            this.setVAlignSelf(vAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定表单项的值格式化串，未定义时使用引用的属性界面模式的配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VALUEFORMAT = "valueformat";

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * 
     * @param valueFormat
     * 
     */
    @JsonProperty(FIELD_VALUEFORMAT)
    public void setValueFormat(String valueFormat){
        this.set(FIELD_VALUEFORMAT, valueFormat);
    }
    
    /**
     * 获取 值格式化  
     * @return
     */
    @JsonIgnore
    public String getValueFormat(){
        Object objValue = this.get(FIELD_VALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFormatDirty(){
        if(this.contains(FIELD_VALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值格式化
     */
    @JsonIgnore
    public void resetValueFormat(){
        this.reset(FIELD_VALUEFORMAT);
    }

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * <P>
     * 等同 {@link #setValueFormat}
     * @param valueFormat
     */
    @JsonIgnore
    public PSDEFormDetail valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUEITEMNAME</B>&nbsp;值项名称，指定表单项编辑器实际值项填充的表单项，未指定时使用引用的属性界面模式配置
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VALUEITEMNAME = "valueitemname";

    /**
     * 设置 值项名称，详细说明：{@link #FIELD_VALUEITEMNAME}
     * 
     * @param valueItemName
     * 
     */
    @JsonProperty(FIELD_VALUEITEMNAME)
    public void setValueItemName(String valueItemName){
        this.set(FIELD_VALUEITEMNAME, valueItemName);
    }
    
    /**
     * 获取 值项名称  
     * @return
     */
    @JsonIgnore
    public String getValueItemName(){
        Object objValue = this.get(FIELD_VALUEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueItemNameDirty(){
        if(this.contains(FIELD_VALUEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值项名称
     */
    @JsonIgnore
    public void resetValueItemName(){
        this.reset(FIELD_VALUEITEMNAME);
    }

    /**
     * 设置 值项名称，详细说明：{@link #FIELD_VALUEITEMNAME}
     * <P>
     * 等同 {@link #setValueItemName}
     * @param valueItemName
     */
    @JsonIgnore
    public PSDEFormDetail valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
    }

    /**
     * <B>WBDEFMODE</B>&nbsp;回写属性值模式，指定表单项回写属性值的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemWriteBackMode} 
     */
    public final static String FIELD_WBDEFMODE = "wbdefmode";

    /**
     * 设置 回写属性值模式，详细说明：{@link #FIELD_WBDEFMODE}
     * 
     * @param wBDEFMode
     * 
     */
    @JsonProperty(FIELD_WBDEFMODE)
    public void setWBDEFMode(Integer wBDEFMode){
        this.set(FIELD_WBDEFMODE, wBDEFMode);
    }
    
    /**
     * 获取 回写属性值模式  
     * @return
     */
    @JsonIgnore
    public Integer getWBDEFMode(){
        Object objValue = this.get(FIELD_WBDEFMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 回写属性值模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWBDEFModeDirty(){
        if(this.contains(FIELD_WBDEFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 回写属性值模式
     */
    @JsonIgnore
    public void resetWBDEFMode(){
        this.reset(FIELD_WBDEFMODE);
    }

    /**
     * 设置 回写属性值模式，详细说明：{@link #FIELD_WBDEFMODE}
     * <P>
     * 等同 {@link #setWBDEFMode}
     * @param wBDEFMode
     */
    @JsonIgnore
    public PSDEFormDetail wbdefmode(Integer wBDEFMode){
        this.setWBDEFMode(wBDEFMode);
        return this;
    }

     /**
     * 设置 回写属性值模式，详细说明：{@link #FIELD_WBDEFMODE}
     * <P>
     * 等同 {@link #setWBDEFMode}
     * @param wBDEFMode
     */
    @JsonIgnore
    public PSDEFormDetail wbdefmode(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemWriteBackMode wBDEFMode){
        if(wBDEFMode == null){
            this.setWBDEFMode(null);
        }
        else{
            this.setWBDEFMode(wBDEFMode.value);
        }
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定表单成员的宽度，0为自适应容器宽度，未定义时为【0】
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
    public PSDEFormDetail width(Integer width){
        this.setWidth(width);
        return this;
    }

    /**
     * <B>WIDTHMODE</B>&nbsp;宽度模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WidthMode} 
     */
    public final static String FIELD_WIDTHMODE = "widthmode";

    /**
     * 设置 宽度模式
     * 
     * @param widthMode
     * 
     */
    @JsonProperty(FIELD_WIDTHMODE)
    public void setWidthMode(String widthMode){
        this.set(FIELD_WIDTHMODE, widthMode);
    }
    
    /**
     * 获取 宽度模式  
     * @return
     */
    @JsonIgnore
    public String getWidthMode(){
        Object objValue = this.get(FIELD_WIDTHMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 宽度模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthModeDirty(){
        if(this.contains(FIELD_WIDTHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 宽度模式
     */
    @JsonIgnore
    public void resetWidthMode(){
        this.reset(FIELD_WIDTHMODE);
    }

    /**
     * 设置 宽度模式
     * <P>
     * 等同 {@link #setWidthMode}
     * @param widthMode
     */
    @JsonIgnore
    public PSDEFormDetail widthmode(String widthMode){
        this.setWidthMode(widthMode);
        return this;
    }

     /**
     * 设置 宽度模式
     * <P>
     * 等同 {@link #setWidthMode}
     * @param widthMode
     */
    @JsonIgnore
    public PSDEFormDetail widthmode(net.ibizsys.psmodel.core.util.PSModelEnums.WidthMode widthMode){
        if(widthMode == null){
            this.setWidthMode(null);
        }
        else{
            this.setWidthMode(widthMode.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFormDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFormDetailId(strValue);
    }

    @JsonIgnore
    public PSDEFormDetail id(String strValue){
        this.setPSDEFormDetailId(strValue);
        return this;
    }


    /**
     *  实体表单成员 成员集合
     */
    public final static String FIELD_PSDEFORMDETAILS = "psdeformdetails";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> psdeformdetails;

    /**
     * 获取 实体表单成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFORMDETAILS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> getPSDEFormDetails(){
        return this.psdeformdetails;
    }

    /**
     * 设置 实体表单成员 成员集合  
     * @param psdeformdetails
     */
    @JsonProperty(FIELD_PSDEFORMDETAILS)
    public void setPSDEFormDetails(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> psdeformdetails){
        this.psdeformdetails = psdeformdetails;
    }

    /**
     * 获取 实体表单成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFormDetail> getPSDEFormDetailsIf(){
        if(this.psdeformdetails == null){
            this.psdeformdetails = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFormDetail>();          
        }
        return this.psdeformdetails;
    }


    /**
     *  实体表单成员逻辑项 成员集合
     */
    public final static String FIELD_PSDEFDLOGICS = "psdefdlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> psdefdlogics;

    /**
     * 获取 实体表单成员逻辑项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFDLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> getPSDEFDLogics(){
        return this.psdefdlogics;
    }

    /**
     * 设置 实体表单成员逻辑项 成员集合  
     * @param psdefdlogics
     */
    @JsonProperty(FIELD_PSDEFDLOGICS)
    public void setPSDEFDLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> psdefdlogics){
        this.psdefdlogics = psdefdlogics;
    }

    /**
     * 获取 实体表单成员逻辑项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> getPSDEFDLogicsIf(){
        if(this.psdefdlogics == null){
            this.psdefdlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFDLogic>();          
        }
        return this.psdefdlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFormDetail){
            PSDEFormDetail model = (PSDEFormDetail)iPSModel;
            model.setPSDEFormDetails(this.getPSDEFormDetails());
            model.setPSDEFDLogics(this.getPSDEFDLogics());
        }
        super.copyTo(iPSModel);
    }
}
