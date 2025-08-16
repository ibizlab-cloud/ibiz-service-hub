package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSVIEWPANELITEM</B>系统面板成员 模型传输对象
 * <P>
 * 面板部件成员模型，定义面板成员的表现及处理逻辑，提供多种成员类型。支持定义成员的子项（多层）、成员的动态逻辑等
 */
public class PSSysViewPanelItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysViewPanelItem(){
    }      

    /**
     * <B>ACTIVEDATAMODE</B>&nbsp;当前数据模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ACTIVEDATAMODE = "activedatamode";

    /**
     * 设置 当前数据模式
     * 
     * @param activeDataMode
     * 
     */
    @JsonProperty(FIELD_ACTIVEDATAMODE)
    public void setActiveDataMode(Integer activeDataMode){
        this.set(FIELD_ACTIVEDATAMODE, activeDataMode);
    }
    
    /**
     * 获取 当前数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getActiveDataMode(){
        Object objValue = this.get(FIELD_ACTIVEDATAMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 当前数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActiveDataModeDirty(){
        if(this.contains(FIELD_ACTIVEDATAMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前数据模式
     */
    @JsonIgnore
    public void resetActiveDataMode(){
        this.reset(FIELD_ACTIVEDATAMODE);
    }

    /**
     * 设置 当前数据模式
     * <P>
     * 等同 {@link #setActiveDataMode}
     * @param activeDataMode
     */
    @JsonIgnore
    public PSSysViewPanelItem activedatamode(Integer activeDataMode){
        this.setActiveDataMode(activeDataMode);
        return this;
    }

     /**
     * 设置 当前数据模式
     * <P>
     * 等同 {@link #setActiveDataMode}
     * @param activeDataMode
     */
    @JsonIgnore
    public PSSysViewPanelItem activedatamode(Boolean activeDataMode){
        if(activeDataMode == null){
            this.setActiveDataMode(null);
        }
        else{
            this.setActiveDataMode(activeDataMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定面板成员使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_ADPSDELOGICID = "adpsdelogicid";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * 
     * @param aDPSDELogicId
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICID)
    public void setADPSDELogicId(String aDPSDELogicId){
        this.set(FIELD_ADPSDELOGICID, aDPSDELogicId);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicId(){
        Object objValue = this.get(FIELD_ADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicIdDirty(){
        if(this.contains(FIELD_ADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicId(){
        this.reset(FIELD_ADPSDELOGICID);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param aDPSDELogicId
     */
    @JsonIgnore
    public PSSysViewPanelItem adpsdelogicid(String aDPSDELogicId){
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    /**
     * 设置 查询转换逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem adpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        }
        else{
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定面板成员使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADPSDELOGICID}
     */
    public final static String FIELD_ADPSDELOGICNAME = "adpsdelogicname";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * 
     * @param aDPSDELogicName
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICNAME)
    public void setADPSDELogicName(String aDPSDELogicName){
        this.set(FIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicName(){
        Object objValue = this.get(FIELD_ADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicNameDirty(){
        if(this.contains(FIELD_ADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicName(){
        this.reset(FIELD_ADPSDELOGICNAME);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setADPSDELogicName}
     * @param aDPSDELogicName
     */
    @JsonIgnore
    public PSSysViewPanelItem adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>AL_POS</B>&nbsp;绝对布局位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AbsoluteLayoutPos} 
     */
    public final static String FIELD_AL_POS = "al_pos";

    /**
     * 设置 绝对布局位置
     * 
     * @param aL_Pos
     * 
     */
    @JsonProperty(FIELD_AL_POS)
    public void setAL_Pos(String aL_Pos){
        this.set(FIELD_AL_POS, aL_Pos);
    }
    
    /**
     * 获取 绝对布局位置  
     * @return
     */
    @JsonIgnore
    public String getAL_Pos(){
        Object objValue = this.get(FIELD_AL_POS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绝对布局位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAL_PosDirty(){
        if(this.contains(FIELD_AL_POS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绝对布局位置
     */
    @JsonIgnore
    public void resetAL_Pos(){
        this.reset(FIELD_AL_POS);
    }

    /**
     * 设置 绝对布局位置
     * <P>
     * 等同 {@link #setAL_Pos}
     * @param aL_Pos
     */
    @JsonIgnore
    public PSSysViewPanelItem al_pos(String aL_Pos){
        this.setAL_Pos(aL_Pos);
        return this;
    }

     /**
     * 设置 绝对布局位置
     * <P>
     * 等同 {@link #setAL_Pos}
     * @param aL_Pos
     */
    @JsonIgnore
    public PSSysViewPanelItem al_pos(net.ibizsys.psmodel.core.util.PSModelEnums.AbsoluteLayoutPos aL_Pos){
        if(aL_Pos == null){
            this.setAL_Pos(null);
        }
        else{
            this.setAL_Pos(aL_Pos.value);
        }
        return this;
    }

    /**
     * <B>BL_POS</B>&nbsp;边缘布局位置，面板成员父容器布局模式为【边缘布局】时指定项的位置
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
    public PSSysViewPanelItem bl_pos(String bL_Pos){
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
    public PSSysViewPanelItem bl_pos(net.ibizsys.psmodel.core.util.PSModelEnums.BorderLayoutPos bL_Pos){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BorderStyle} 
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
    public PSSysViewPanelItem borderstyle(String borderStyle){
        this.setBorderStyle(borderStyle);
        return this;
    }

     /**
     * 设置 边框样式
     * <P>
     * 等同 {@link #setBorderStyle}
     * @param borderStyle
     */
    @JsonIgnore
    public PSSysViewPanelItem borderstyle(net.ibizsys.psmodel.core.util.PSModelEnums.BorderStyle borderStyle){
        if(borderStyle == null){
            this.setBorderStyle(null);
        }
        else{
            this.setBorderStyle(borderStyle.value);
        }
        return this;
    }

    /**
     * <B>BOTTOMPOS</B>&nbsp;下方位置
     */
    public final static String FIELD_BOTTOMPOS = "bottompos";

    /**
     * 设置 下方位置
     * 
     * @param bottomPos
     * 
     */
    @JsonProperty(FIELD_BOTTOMPOS)
    public void setBottomPos(Integer bottomPos){
        this.set(FIELD_BOTTOMPOS, bottomPos);
    }
    
    /**
     * 获取 下方位置  
     * @return
     */
    @JsonIgnore
    public Integer getBottomPos(){
        Object objValue = this.get(FIELD_BOTTOMPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 下方位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomPosDirty(){
        if(this.contains(FIELD_BOTTOMPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下方位置
     */
    @JsonIgnore
    public void resetBottomPos(){
        this.reset(FIELD_BOTTOMPOS);
    }

    /**
     * 设置 下方位置
     * <P>
     * 等同 {@link #setBottomPos}
     * @param bottomPos
     */
    @JsonIgnore
    public PSSysViewPanelItem bottompos(Integer bottomPos){
        this.setBottomPos(bottomPos);
        return this;
    }

    /**
     * <B>BTNACTIONTYPE</B>&nbsp;按钮行为类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelButtonActionType} 
     */
    public final static String FIELD_BTNACTIONTYPE = "btnactiontype";

    /**
     * 设置 按钮行为类型
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
     * 设置 按钮行为类型
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSSysViewPanelItem btnactiontype(String btnActionType){
        this.setBtnActionType(btnActionType);
        return this;
    }

     /**
     * 设置 按钮行为类型
     * <P>
     * 等同 {@link #setBtnActionType}
     * @param btnActionType
     */
    @JsonIgnore
    public PSSysViewPanelItem btnactiontype(net.ibizsys.psmodel.core.util.PSModelEnums.PanelButtonActionType btnActionType){
        if(btnActionType == null){
            this.setBtnActionType(null);
        }
        else{
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示
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
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSSysViewPanelItem busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSSysViewPanelItem busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定面板成员的标题的多语言资源对象
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
    public PSSysViewPanelItem cappslanresid(String capPSLanResId){
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
    public PSSysViewPanelItem cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定面板成员的标题的多语言资源对象
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
    public PSSysViewPanelItem cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定面板成员的标题，不同类型的成员按照自身逻辑放置标题
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
    public PSSysViewPanelItem caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CAPTIONPOS</B>&nbsp;标题位置，指定面板属性项标签的位置，未定义时为【左边】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LabelPos} 
     */
    public final static String FIELD_CAPTIONPOS = "captionpos";

    /**
     * 设置 标题位置，详细说明：{@link #FIELD_CAPTIONPOS}
     * 
     * @param captionPos
     * 
     */
    @JsonProperty(FIELD_CAPTIONPOS)
    public void setCaptionPos(String captionPos){
        this.set(FIELD_CAPTIONPOS, captionPos);
    }
    
    /**
     * 获取 标题位置  
     * @return
     */
    @JsonIgnore
    public String getCaptionPos(){
        Object objValue = this.get(FIELD_CAPTIONPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionPosDirty(){
        if(this.contains(FIELD_CAPTIONPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题位置
     */
    @JsonIgnore
    public void resetCaptionPos(){
        this.reset(FIELD_CAPTIONPOS);
    }

    /**
     * 设置 标题位置，详细说明：{@link #FIELD_CAPTIONPOS}
     * <P>
     * 等同 {@link #setCaptionPos}
     * @param captionPos
     */
    @JsonIgnore
    public PSSysViewPanelItem captionpos(String captionPos){
        this.setCaptionPos(captionPos);
        return this;
    }

     /**
     * 设置 标题位置，详细说明：{@link #FIELD_CAPTIONPOS}
     * <P>
     * 等同 {@link #setCaptionPos}
     * @param captionPos
     */
    @JsonIgnore
    public PSSysViewPanelItem captionpos(net.ibizsys.psmodel.core.util.PSModelEnums.LabelPos captionPos){
        if(captionPos == null){
            this.setCaptionPos(null);
        }
        else{
            this.setCaptionPos(captionPos.value);
        }
        return this;
    }

    /**
     * <B>CHILD_COL_LG</B>&nbsp;内容大型列宽，面板成员父容器布局模式为【栅格布局】时指定项在大型界面的默认列占位数量
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
    public PSSysViewPanelItem child_col_lg(Integer child_Col_LG){
        this.setChild_Col_LG(child_Col_LG);
        return this;
    }

    /**
     * <B>CHILD_COL_MD</B>&nbsp;内容中型列宽，面板成员父容器布局模式为【栅格布局】时指定项在中型界面的默认列占位数量
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
    public PSSysViewPanelItem child_col_md(Integer child_Col_MD){
        this.setChild_Col_MD(child_Col_MD);
        return this;
    }

    /**
     * <B>CHILD_COL_SM</B>&nbsp;内容小型列宽，面板成员父容器布局模式为【栅格布局】时指定项在小型界面的默认列占位数量
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
    public PSSysViewPanelItem child_col_sm(Integer child_Col_SM){
        this.setChild_Col_SM(child_Col_SM);
        return this;
    }

    /**
     * <B>CHILD_COL_XS</B>&nbsp;内容超小列宽，面板成员父容器布局模式为【栅格布局】时指定项在超小型界面的默认列占位数量
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
    public PSSysViewPanelItem child_col_xs(Integer child_Col_XS){
        this.setChild_Col_XS(child_Col_XS);
        return this;
    }

    /**
     * <B>COLID</B>&nbsp;列号，面板成员父容器布局模式为【表格布局】时指定占位列标识，-1为自动，未定义时为【-1】
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
    public PSSysViewPanelItem colid(Integer colId){
        this.setColId(colId);
        return this;
    }

    /**
     * <B>COLLAPSIBLEFLAG</B>&nbsp;折叠模式，面板成员父容器布局模式为【边缘布局】时指定成员的折叠模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelCollapsibleMode} 
     */
    public final static String FIELD_COLLAPSIBLEFLAG = "collapsibleflag";

    /**
     * 设置 折叠模式，详细说明：{@link #FIELD_COLLAPSIBLEFLAG}
     * 
     * @param collapsibleFlag
     * 
     */
    @JsonProperty(FIELD_COLLAPSIBLEFLAG)
    public void setCollapsibleFlag(Integer collapsibleFlag){
        this.set(FIELD_COLLAPSIBLEFLAG, collapsibleFlag);
    }
    
    /**
     * 获取 折叠模式  
     * @return
     */
    @JsonIgnore
    public Integer getCollapsibleFlag(){
        Object objValue = this.get(FIELD_COLLAPSIBLEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 折叠模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCollapsibleFlagDirty(){
        if(this.contains(FIELD_COLLAPSIBLEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 折叠模式
     */
    @JsonIgnore
    public void resetCollapsibleFlag(){
        this.reset(FIELD_COLLAPSIBLEFLAG);
    }

    /**
     * 设置 折叠模式，详细说明：{@link #FIELD_COLLAPSIBLEFLAG}
     * <P>
     * 等同 {@link #setCollapsibleFlag}
     * @param collapsibleFlag
     */
    @JsonIgnore
    public PSSysViewPanelItem collapsibleflag(Integer collapsibleFlag){
        this.setCollapsibleFlag(collapsibleFlag);
        return this;
    }

     /**
     * 设置 折叠模式，详细说明：{@link #FIELD_COLLAPSIBLEFLAG}
     * <P>
     * 等同 {@link #setCollapsibleFlag}
     * @param collapsibleFlag
     */
    @JsonIgnore
    public PSSysViewPanelItem collapsibleflag(net.ibizsys.psmodel.core.util.PSModelEnums.PanelCollapsibleMode collapsibleFlag){
        if(collapsibleFlag == null){
            this.setCollapsibleFlag(null);
        }
        else{
            this.setCollapsibleFlag(collapsibleFlag.value);
        }
        return this;
    }

    /**
     * <B>COLMODEL</B>&nbsp;列模型，面板成员布局容器模式为【表格布局】时指定表格列分割模型，多列使用分号分隔，列宽度可以使用百分数（表格宽度占比）、数字、星号（剩余），如 100;50%;* 表现第一列100像素、第二列表格一半宽度，第三列为剩余宽度
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
    public PSSysViewPanelItem colmodel(String colModel){
        this.setColModel(colModel);
        return this;
    }

    /**
     * <B>COLSPAN</B>&nbsp;列数，面板成员父容器布局模式为【表格布局】时指定成员的占位列数，未定义时为【1】
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
    public PSSysViewPanelItem colspan(Integer colSpan){
        this.setColSpan(colSpan);
        return this;
    }

    /**
     * <B>COL_LG</B>&nbsp;大型列宽，面板成员父容器布局模式为【栅格布局】时指定成员在大型界面的列占位数量，未定义时使用父容器的默认大型界面列占位数量
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
    public PSSysViewPanelItem col_lg(Integer col_LG){
        this.setCol_LG(col_LG);
        return this;
    }

    /**
     * <B>COL_LG_OS</B>&nbsp;大型偏移，面板成员父容器布局模式为【栅格布局】时指定成员在大型界面的列偏移数量，未定义时为【-1】
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
    public PSSysViewPanelItem col_lg_os(Integer col_LG_OS){
        this.setCol_LG_OS(col_LG_OS);
        return this;
    }

    /**
     * <B>COL_MD</B>&nbsp;中型列宽，面板成员父容器布局模式为【栅格布局】时指定成员在中型界面的列占位数量，未定义时使用父容器的默认中型界面列占位数量
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
    public PSSysViewPanelItem col_md(Integer col_MD){
        this.setCol_MD(col_MD);
        return this;
    }

    /**
     * <B>COL_MD_OS</B>&nbsp;中型偏移，面板成员父容器布局模式为【栅格布局】时指定成员在中型界面的列偏移数量，未定义时为【-1】
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
    public PSSysViewPanelItem col_md_os(Integer col_MD_OS){
        this.setCol_MD_OS(col_MD_OS);
        return this;
    }

    /**
     * <B>COL_SM</B>&nbsp;小型列宽，面板成员父容器布局模式为【栅格布局】时指定成员在小型界面的列占位数量，未定义时使用父容器的默认小型界面列占位数量
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
    public PSSysViewPanelItem col_sm(Integer col_SM){
        this.setCol_SM(col_SM);
        return this;
    }

    /**
     * <B>COL_SM_OS</B>&nbsp;小型偏移，面板成员父容器布局模式为【栅格布局】时指定成员在小型界面的列偏移数量，未定义时为【-1】
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
    public PSSysViewPanelItem col_sm_os(Integer col_SM_OS){
        this.setCol_SM_OS(col_SM_OS);
        return this;
    }

    /**
     * <B>COL_WIDTH</B>&nbsp;固定列宽，指定面板成员在【栅格布局】模式下的固定列宽，未定义时为【-1】
     */
    public final static String FIELD_COL_WIDTH = "col_width";

    /**
     * 设置 固定列宽，详细说明：{@link #FIELD_COL_WIDTH}
     * 
     * @param col_Width
     * 
     */
    @JsonProperty(FIELD_COL_WIDTH)
    public void setCol_Width(Integer col_Width){
        this.set(FIELD_COL_WIDTH, col_Width);
    }
    
    /**
     * 获取 固定列宽  
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
     * 判断 固定列宽 是否指定值，包括空值
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
     * 重置 固定列宽
     */
    @JsonIgnore
    public void resetCol_Width(){
        this.reset(FIELD_COL_WIDTH);
    }

    /**
     * 设置 固定列宽，详细说明：{@link #FIELD_COL_WIDTH}
     * <P>
     * 等同 {@link #setCol_Width}
     * @param col_Width
     */
    @JsonIgnore
    public PSSysViewPanelItem col_width(Integer col_Width){
        this.setCol_Width(col_Width);
        return this;
    }

    /**
     * <B>COL_XS</B>&nbsp;超小列宽，面板成员父容器布局模式为【栅格布局】时指定成员在超小界面的列占位数量，未定义时使用父容器的默认超小界面列占位数量
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
    public PSSysViewPanelItem col_xs(Integer col_XS){
        this.setCol_XS(col_XS);
        return this;
    }

    /**
     * <B>COL_XS_OS</B>&nbsp;超小偏移，面板成员父容器布局模式为【栅格布局】时指定成员在超小界面的列偏移数量，未定义时为【-1】
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
    public PSSysViewPanelItem col_xs_os(Integer col_XS_OS){
        this.setCol_XS_OS(col_XS_OS);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定面板直接内容项的内容类型
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
    public PSSysViewPanelItem contenttype(String contentType){
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
    public PSSysViewPanelItem contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
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
    public PSSysViewPanelItem createdate(String createDate){
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
    public PSSysViewPanelItem createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysViewPanelItem ctrldynaclass(String ctrlDynaClass){
        this.setCtrlDynaClass(ctrlDynaClass);
        return this;
    }

    /**
     * <B>CTRLHEIGHT</B>&nbsp;控件高度
     */
    public final static String FIELD_CTRLHEIGHT = "ctrlheight";

    /**
     * 设置 控件高度
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
     * 设置 控件高度
     * <P>
     * 等同 {@link #setCtrlHeight}
     * @param ctrlHeight
     */
    @JsonIgnore
    public PSSysViewPanelItem ctrlheight(Integer ctrlHeight){
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
    public PSSysViewPanelItem ctrlpssyscssid(String ctrlPSSysCssId){
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
    public PSSysViewPanelItem ctrlpssyscssid(PSSysCss pSSysCss){
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
    public PSSysViewPanelItem ctrlpssyscssname(String ctrlPSSysCssName){
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
    public PSSysViewPanelItem ctrlrawcssstyle(String ctrlRawCssStyle){
        this.setCtrlRawCssStyle(ctrlRawCssStyle);
        return this;
    }

    /**
     * <B>CTRLTYPE</B>&nbsp;部件类型，指定面板控件项的控件类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelCtrlType} 
     */
    public final static String FIELD_CTRLTYPE = "ctrltype";

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_CTRLTYPE}
     * 
     * @param ctrlType
     * 
     */
    @JsonProperty(FIELD_CTRLTYPE)
    public void setCtrlType(String ctrlType){
        this.set(FIELD_CTRLTYPE, ctrlType);
    }
    
    /**
     * 获取 部件类型  
     * @return
     */
    @JsonIgnore
    public String getCtrlType(){
        Object objValue = this.get(FIELD_CTRLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlTypeDirty(){
        if(this.contains(FIELD_CTRLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件类型
     */
    @JsonIgnore
    public void resetCtrlType(){
        this.reset(FIELD_CTRLTYPE);
    }

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_CTRLTYPE}
     * <P>
     * 等同 {@link #setCtrlType}
     * @param ctrlType
     */
    @JsonIgnore
    public PSSysViewPanelItem ctrltype(String ctrlType){
        this.setCtrlType(ctrlType);
        return this;
    }

     /**
     * 设置 部件类型，详细说明：{@link #FIELD_CTRLTYPE}
     * <P>
     * 等同 {@link #setCtrlType}
     * @param ctrlType
     */
    @JsonIgnore
    public PSSysViewPanelItem ctrltype(net.ibizsys.psmodel.core.util.PSModelEnums.PanelCtrlType ctrlType){
        if(ctrlType == null){
            this.setCtrlType(null);
        }
        else{
            this.setCtrlType(ctrlType.value);
        }
        return this;
    }

    /**
     * <B>CTRLWIDTH</B>&nbsp;控件宽度
     */
    public final static String FIELD_CTRLWIDTH = "ctrlwidth";

    /**
     * 设置 控件宽度
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
     * 设置 控件宽度
     * <P>
     * 等同 {@link #setCtrlWidth}
     * @param ctrlWidth
     */
    @JsonIgnore
    public PSSysViewPanelItem ctrlwidth(Integer ctrlWidth){
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
    public PSSysViewPanelItem customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;自定义模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 自定义模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 自定义模式  
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
     * 判断 自定义模式 是否指定值，包括空值
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
     * 重置 自定义模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysViewPanelItem custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSysViewPanelItem custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATAPANELMODE</B>&nbsp;数据面板模式，指定面板项的数据模式，未定义时为【继承】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataPanelMode} 
     */
    public final static String FIELD_DATAPANELMODE = "datapanelmode";

    /**
     * 设置 数据面板模式，详细说明：{@link #FIELD_DATAPANELMODE}
     * 
     * @param dataPanelMode
     * 
     */
    @JsonProperty(FIELD_DATAPANELMODE)
    public void setDataPanelMode(String dataPanelMode){
        this.set(FIELD_DATAPANELMODE, dataPanelMode);
    }
    
    /**
     * 获取 数据面板模式  
     * @return
     */
    @JsonIgnore
    public String getDataPanelMode(){
        Object objValue = this.get(FIELD_DATAPANELMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据面板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataPanelModeDirty(){
        if(this.contains(FIELD_DATAPANELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据面板模式
     */
    @JsonIgnore
    public void resetDataPanelMode(){
        this.reset(FIELD_DATAPANELMODE);
    }

    /**
     * 设置 数据面板模式，详细说明：{@link #FIELD_DATAPANELMODE}
     * <P>
     * 等同 {@link #setDataPanelMode}
     * @param dataPanelMode
     */
    @JsonIgnore
    public PSSysViewPanelItem datapanelmode(String dataPanelMode){
        this.setDataPanelMode(dataPanelMode);
        return this;
    }

     /**
     * 设置 数据面板模式，详细说明：{@link #FIELD_DATAPANELMODE}
     * <P>
     * 等同 {@link #setDataPanelMode}
     * @param dataPanelMode
     */
    @JsonIgnore
    public PSSysViewPanelItem datapanelmode(net.ibizsys.psmodel.core.util.PSModelEnums.DataPanelMode dataPanelMode){
        if(dataPanelMode == null){
            this.setDataPanelMode(null);
        }
        else{
            this.setDataPanelMode(dataPanelMode.value);
        }
        return this;
    }

    /**
     * <B>DATASOURCE</B>&nbsp;数据源，指定数据区域的数据源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataPanelSource} 
     */
    public final static String FIELD_DATASOURCE = "datasource";

    /**
     * 设置 数据源，详细说明：{@link #FIELD_DATASOURCE}
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
     * 设置 数据源，详细说明：{@link #FIELD_DATASOURCE}
     * <P>
     * 等同 {@link #setDataSource}
     * @param dataSource
     */
    @JsonIgnore
    public PSSysViewPanelItem datasource(String dataSource){
        this.setDataSource(dataSource);
        return this;
    }

     /**
     * 设置 数据源，详细说明：{@link #FIELD_DATASOURCE}
     * <P>
     * 等同 {@link #setDataSource}
     * @param dataSource
     */
    @JsonIgnore
    public PSSysViewPanelItem datasource(net.ibizsys.psmodel.core.util.PSModelEnums.DataPanelSource dataSource){
        if(dataSource == null){
            this.setDataSource(null);
        }
        else{
            this.setDataSource(dataSource.value);
        }
        return this;
    }

    /**
     * <B>DATASOURCETEXT</B>&nbsp;数据源
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_DATASOURCETEXT = "datasourcetext";

    /**
     * 设置 数据源
     * 
     * @param dataSourceText
     * 
     */
    @JsonProperty(FIELD_DATASOURCETEXT)
    public void setDataSourceText(String dataSourceText){
        this.set(FIELD_DATASOURCETEXT, dataSourceText);
    }
    
    /**
     * 获取 数据源  
     * @return
     */
    @JsonIgnore
    public String getDataSourceText(){
        Object objValue = this.get(FIELD_DATASOURCETEXT);
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
    public boolean isDataSourceTextDirty(){
        if(this.contains(FIELD_DATASOURCETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据源
     */
    @JsonIgnore
    public void resetDataSourceText(){
        this.reset(FIELD_DATASOURCETEXT);
    }

    /**
     * 设置 数据源
     * <P>
     * 等同 {@link #setDataSourceText}
     * @param dataSourceText
     */
    @JsonIgnore
    public PSSysViewPanelItem datasourcetext(String dataSourceText){
        this.setDataSourceText(dataSourceText);
        return this;
    }

    /**
     * <B>DETAILSTYLE</B>&nbsp;内置样式，指定面板成员的内置式样，内置式样是模板提供的表现式样，未定义时为【默认】
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
    public PSSysViewPanelItem detailstyle(String detailStyle){
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
    public PSSysViewPanelItem detailstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle detailStyle){
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
    public PSSysViewPanelItem detailstyletext(String detailStyleText){
        this.setDetailStyleText(detailStyleText);
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
    public PSSysViewPanelItem dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定面板属性项的编辑器类型
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
    public PSSysViewPanelItem editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>EMPTYCAPTION</B>&nbsp;空白标题，指定面板属性项是否启用空白标签，空白标签是指使用无内容的标签进行占位。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EMPTYCAPTION = "emptycaption";

    /**
     * 设置 空白标题，详细说明：{@link #FIELD_EMPTYCAPTION}
     * 
     * @param emptyCaption
     * 
     */
    @JsonProperty(FIELD_EMPTYCAPTION)
    public void setEmptyCaption(Integer emptyCaption){
        this.set(FIELD_EMPTYCAPTION, emptyCaption);
    }
    
    /**
     * 获取 空白标题  
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
     * 判断 空白标题 是否指定值，包括空值
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
     * 重置 空白标题
     */
    @JsonIgnore
    public void resetEmptyCaption(){
        this.reset(FIELD_EMPTYCAPTION);
    }

    /**
     * 设置 空白标题，详细说明：{@link #FIELD_EMPTYCAPTION}
     * <P>
     * 等同 {@link #setEmptyCaption}
     * @param emptyCaption
     */
    @JsonIgnore
    public PSSysViewPanelItem emptycaption(Integer emptyCaption){
        this.setEmptyCaption(emptyCaption);
        return this;
    }

     /**
     * 设置 空白标题，详细说明：{@link #FIELD_EMPTYCAPTION}
     * <P>
     * 等同 {@link #setEmptyCaption}
     * @param emptyCaption
     */
    @JsonIgnore
    public PSSysViewPanelItem emptycaption(Boolean emptyCaption){
        if(emptyCaption == null){
            this.setEmptyCaption(null);
        }
        else{
            this.setEmptyCaption(emptyCaption?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEANCHOR</B>&nbsp;支持锚点
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEANCHOR = "enableanchor";

    /**
     * 设置 支持锚点
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
     * 设置 支持锚点
     * <P>
     * 等同 {@link #setEnableAnchor}
     * @param enableAnchor
     */
    @JsonIgnore
    public PSSysViewPanelItem enableanchor(Integer enableAnchor){
        this.setEnableAnchor(enableAnchor);
        return this;
    }

     /**
     * 设置 支持锚点
     * <P>
     * 等同 {@link #setEnableAnchor}
     * @param enableAnchor
     */
    @JsonIgnore
    public PSSysViewPanelItem enableanchor(Boolean enableAnchor){
        if(enableAnchor == null){
            this.setEnableAnchor(null);
        }
        else{
            this.setEnableAnchor(enableAnchor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FIELDNAME</B>&nbsp;数据属性，指定面板属性项绑定的面板模型属性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_FIELDNAME = "fieldname";

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_FIELDNAME}
     * 
     * @param fieldName
     * 
     */
    @JsonProperty(FIELD_FIELDNAME)
    public void setFieldName(String fieldName){
        this.set(FIELD_FIELDNAME, fieldName);
    }
    
    /**
     * 获取 数据属性  
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
     * 判断 数据属性 是否指定值，包括空值
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
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetFieldName(){
        this.reset(FIELD_FIELDNAME);
    }

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_FIELDNAME}
     * <P>
     * 等同 {@link #setFieldName}
     * @param fieldName
     */
    @JsonIgnore
    public PSSysViewPanelItem fieldname(String fieldName){
        this.setFieldName(fieldName);
        return this;
    }

    /**
     * <B>FIELDSTATES</B>&nbsp;默认状态，指定面板属性项的默认状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelFieldState} 
     */
    public final static String FIELD_FIELDSTATES = "fieldstates";

    /**
     * 设置 默认状态，详细说明：{@link #FIELD_FIELDSTATES}
     * 
     * @param fieldStates
     * 
     */
    @JsonProperty(FIELD_FIELDSTATES)
    public void setFieldStates(Integer fieldStates){
        this.set(FIELD_FIELDSTATES, fieldStates);
    }
    
    /**
     * 获取 默认状态  
     * @return
     */
    @JsonIgnore
    public Integer getFieldStates(){
        Object objValue = this.get(FIELD_FIELDSTATES);
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
    public boolean isFieldStatesDirty(){
        if(this.contains(FIELD_FIELDSTATES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认状态
     */
    @JsonIgnore
    public void resetFieldStates(){
        this.reset(FIELD_FIELDSTATES);
    }

    /**
     * 设置 默认状态，详细说明：{@link #FIELD_FIELDSTATES}
     * <P>
     * 等同 {@link #setFieldStates}
     * @param fieldStates
     */
    @JsonIgnore
    public PSSysViewPanelItem fieldstates(Integer fieldStates){
        this.setFieldStates(fieldStates);
        return this;
    }

     /**
     * 设置 默认状态，详细说明：{@link #FIELD_FIELDSTATES}
     * <P>
     * 等同 {@link #setFieldStates}
     * @param fieldStates
     */
    @JsonIgnore
    public PSSysViewPanelItem fieldstates(net.ibizsys.psmodel.core.util.PSModelEnums.PanelFieldState[] fieldStates){
        if(fieldStates == null || fieldStates.length == 0){
            this.setFieldStates(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.PanelFieldState _item : fieldStates){
                _value |= _item.value;
            }
            this.setFieldStates(_value);
        }
        return this;
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，面板成员容器布局模式为【Flex布局】时指定横轴对齐方式
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
    public PSSysViewPanelItem flexalign(String flexAlign){
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
    public PSSysViewPanelItem flexalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign flexAlign){
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
    public PSSysViewPanelItem flexbasis(Integer flexBasis){
        this.setFlexBasis(flexBasis);
        return this;
    }

    /**
     * <B>FLEXDIR</B>&nbsp;Flex布局方向，面板成员容器布局模式为【Flex布局】时指定布局方向
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
    public PSSysViewPanelItem flexdir(String flexDir){
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
    public PSSysViewPanelItem flexdir(net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir flexDir){
        if(flexDir == null){
            this.setFlexDir(null);
        }
        else{
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    /**
     * <B>FLEXGROW</B>&nbsp;Flex延展值，面板成员父容器布局模式为【Flex布局】时指定成员的延展值，未定义时为【-1】
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
    public PSSysViewPanelItem flexgrow(Integer flexGrow){
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
    public PSSysViewPanelItem flexshrink(Integer flexShrink){
        this.setFlexShrink(flexShrink);
        return this;
    }

    /**
     * <B>FLEXVALIGN</B>&nbsp;Flex纵轴对齐，面板成员容器布局模式为【Flex布局】时指定纵轴对齐方式
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
    public PSSysViewPanelItem flexvalign(String flexVAlign){
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
    public PSSysViewPanelItem flexvalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign flexVAlign){
        if(flexVAlign == null){
            this.setFlexVAlign(null);
        }
        else{
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    /**
     * <B>GETDATATIMER</B>&nbsp;数据刷新间隔，指定数据源的刷新间隔，单位为【毫秒】，-1为未定义，未定义时为【-1】
     */
    public final static String FIELD_GETDATATIMER = "getdatatimer";

    /**
     * 设置 数据刷新间隔，详细说明：{@link #FIELD_GETDATATIMER}
     * 
     * @param getDataTimer
     * 
     */
    @JsonProperty(FIELD_GETDATATIMER)
    public void setGetDataTimer(Integer getDataTimer){
        this.set(FIELD_GETDATATIMER, getDataTimer);
    }
    
    /**
     * 获取 数据刷新间隔  
     * @return
     */
    @JsonIgnore
    public Integer getGetDataTimer(){
        Object objValue = this.get(FIELD_GETDATATIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据刷新间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDataTimerDirty(){
        if(this.contains(FIELD_GETDATATIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据刷新间隔
     */
    @JsonIgnore
    public void resetGetDataTimer(){
        this.reset(FIELD_GETDATATIMER);
    }

    /**
     * 设置 数据刷新间隔，详细说明：{@link #FIELD_GETDATATIMER}
     * <P>
     * 等同 {@link #setGetDataTimer}
     * @param getDataTimer
     */
    @JsonIgnore
    public PSSysViewPanelItem getdatatimer(Integer getDataTimer){
        this.setGetDataTimer(getDataTimer);
        return this;
    }

    /**
     * <B>GRIDROWID</B>&nbsp;行号，面板成员父容器布局模式为【表格布局】时指定占位行标识，-1为自动，未定义时为【-1】
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
    public PSSysViewPanelItem gridrowid(Integer gridRowId){
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
    public PSSysViewPanelItem halign(String hAlign){
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
    public PSSysViewPanelItem halign(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlign){
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
    public PSSysViewPanelItem halignself(String hAlignSelf){
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
    public PSSysViewPanelItem halignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlignSelf){
        if(hAlignSelf == null){
            this.setHAlignSelf(null);
        }
        else{
            this.setHAlignSelf(hAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定面板成员的高度，0为自动计算，未定义时为【0】
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
    public PSSysViewPanelItem height(Integer height){
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
    public PSSysViewPanelItem heightmode(String heightMode){
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
    public PSSysViewPanelItem heightmode(net.ibizsys.psmodel.core.util.PSModelEnums.HeightMode heightMode){
        if(heightMode == null){
            this.setHeightMode(null);
        }
        else{
            this.setHeightMode(heightMode.value);
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
    public PSSysViewPanelItem htmlcontent(String htmlContent){
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
    public PSSysViewPanelItem htmlpageurl(String htmlPageUrl){
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
    public PSSysViewPanelItem iconalign(String iconAlign){
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
    public PSSysViewPanelItem iconalign(net.ibizsys.psmodel.core.util.PSModelEnums.ButtonIconAlign iconAlign){
        if(iconAlign == null){
            this.setIconAlign(null);
        }
        else{
            this.setIconAlign(iconAlign.value);
        }
        return this;
    }

    /**
     * <B>IGNOREINPUT</B>&nbsp;忽略输入值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemIgnoreMode} 
     */
    public final static String FIELD_IGNOREINPUT = "ignoreinput";

    /**
     * 设置 忽略输入值
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
     * 设置 忽略输入值
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSSysViewPanelItem ignoreinput(Integer ignoreInput){
        this.setIgnoreInput(ignoreInput);
        return this;
    }

     /**
     * 设置 忽略输入值
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSSysViewPanelItem ignoreinput(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemIgnoreMode ignoreInput){
        if(ignoreInput == null){
            this.setIgnoreInput(null);
        }
        else{
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    /**
     * <B>ITEMPARAM</B>&nbsp;面板项参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMPARAM = "itemparam";

    /**
     * 设置 面板项参数
     * 
     * @param itemParam
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM)
    public void setItemParam(String itemParam){
        this.set(FIELD_ITEMPARAM, itemParam);
    }
    
    /**
     * 获取 面板项参数  
     * @return
     */
    @JsonIgnore
    public String getItemParam(){
        Object objValue = this.get(FIELD_ITEMPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParamDirty(){
        if(this.contains(FIELD_ITEMPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数
     */
    @JsonIgnore
    public void resetItemParam(){
        this.reset(FIELD_ITEMPARAM);
    }

    /**
     * 设置 面板项参数
     * <P>
     * 等同 {@link #setItemParam}
     * @param itemParam
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam(String itemParam){
        this.setItemParam(itemParam);
        return this;
    }

    /**
     * <B>ITEMPARAM10</B>&nbsp;面板项参数10
     */
    public final static String FIELD_ITEMPARAM10 = "itemparam10";

    /**
     * 设置 面板项参数10
     * 
     * @param itemParam10
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM10)
    public void setItemParam10(Double itemParam10){
        this.set(FIELD_ITEMPARAM10, itemParam10);
    }
    
    /**
     * 获取 面板项参数10  
     * @return
     */
    @JsonIgnore
    public Double getItemParam10(){
        Object objValue = this.get(FIELD_ITEMPARAM10);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 面板项参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam10Dirty(){
        if(this.contains(FIELD_ITEMPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数10
     */
    @JsonIgnore
    public void resetItemParam10(){
        this.reset(FIELD_ITEMPARAM10);
    }

    /**
     * 设置 面板项参数10
     * <P>
     * 等同 {@link #setItemParam10}
     * @param itemParam10
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam10(Double itemParam10){
        this.setItemParam10(itemParam10);
        return this;
    }

    /**
     * <B>ITEMPARAM11</B>&nbsp;面板项参数11
     */
    public final static String FIELD_ITEMPARAM11 = "itemparam11";

    /**
     * 设置 面板项参数11
     * 
     * @param itemParam11
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM11)
    public void setItemParam11(Integer itemParam11){
        this.set(FIELD_ITEMPARAM11, itemParam11);
    }
    
    /**
     * 获取 面板项参数11  
     * @return
     */
    @JsonIgnore
    public Integer getItemParam11(){
        Object objValue = this.get(FIELD_ITEMPARAM11);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam11Dirty(){
        if(this.contains(FIELD_ITEMPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数11
     */
    @JsonIgnore
    public void resetItemParam11(){
        this.reset(FIELD_ITEMPARAM11);
    }

    /**
     * 设置 面板项参数11
     * <P>
     * 等同 {@link #setItemParam11}
     * @param itemParam11
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam11(Integer itemParam11){
        this.setItemParam11(itemParam11);
        return this;
    }

    /**
     * <B>ITEMPARAM12</B>&nbsp;面板项参数12
     */
    public final static String FIELD_ITEMPARAM12 = "itemparam12";

    /**
     * 设置 面板项参数12
     * 
     * @param itemParam12
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM12)
    public void setItemParam12(Integer itemParam12){
        this.set(FIELD_ITEMPARAM12, itemParam12);
    }
    
    /**
     * 获取 面板项参数12  
     * @return
     */
    @JsonIgnore
    public Integer getItemParam12(){
        Object objValue = this.get(FIELD_ITEMPARAM12);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam12Dirty(){
        if(this.contains(FIELD_ITEMPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数12
     */
    @JsonIgnore
    public void resetItemParam12(){
        this.reset(FIELD_ITEMPARAM12);
    }

    /**
     * 设置 面板项参数12
     * <P>
     * 等同 {@link #setItemParam12}
     * @param itemParam12
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam12(Integer itemParam12){
        this.setItemParam12(itemParam12);
        return this;
    }

    /**
     * <B>ITEMPARAM2</B>&nbsp;面板项参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMPARAM2 = "itemparam2";

    /**
     * 设置 面板项参数2
     * 
     * @param itemParam2
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM2)
    public void setItemParam2(String itemParam2){
        this.set(FIELD_ITEMPARAM2, itemParam2);
    }
    
    /**
     * 获取 面板项参数2  
     * @return
     */
    @JsonIgnore
    public String getItemParam2(){
        Object objValue = this.get(FIELD_ITEMPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam2Dirty(){
        if(this.contains(FIELD_ITEMPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数2
     */
    @JsonIgnore
    public void resetItemParam2(){
        this.reset(FIELD_ITEMPARAM2);
    }

    /**
     * 设置 面板项参数2
     * <P>
     * 等同 {@link #setItemParam2}
     * @param itemParam2
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam2(String itemParam2){
        this.setItemParam2(itemParam2);
        return this;
    }

    /**
     * <B>ITEMPARAM3</B>&nbsp;面板项参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMPARAM3 = "itemparam3";

    /**
     * 设置 面板项参数3
     * 
     * @param itemParam3
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM3)
    public void setItemParam3(String itemParam3){
        this.set(FIELD_ITEMPARAM3, itemParam3);
    }
    
    /**
     * 获取 面板项参数3  
     * @return
     */
    @JsonIgnore
    public String getItemParam3(){
        Object objValue = this.get(FIELD_ITEMPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam3Dirty(){
        if(this.contains(FIELD_ITEMPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数3
     */
    @JsonIgnore
    public void resetItemParam3(){
        this.reset(FIELD_ITEMPARAM3);
    }

    /**
     * 设置 面板项参数3
     * <P>
     * 等同 {@link #setItemParam3}
     * @param itemParam3
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam3(String itemParam3){
        this.setItemParam3(itemParam3);
        return this;
    }

    /**
     * <B>ITEMPARAM4</B>&nbsp;面板项参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMPARAM4 = "itemparam4";

    /**
     * 设置 面板项参数4
     * 
     * @param itemParam4
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM4)
    public void setItemParam4(String itemParam4){
        this.set(FIELD_ITEMPARAM4, itemParam4);
    }
    
    /**
     * 获取 面板项参数4  
     * @return
     */
    @JsonIgnore
    public String getItemParam4(){
        Object objValue = this.get(FIELD_ITEMPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板项参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam4Dirty(){
        if(this.contains(FIELD_ITEMPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数4
     */
    @JsonIgnore
    public void resetItemParam4(){
        this.reset(FIELD_ITEMPARAM4);
    }

    /**
     * 设置 面板项参数4
     * <P>
     * 等同 {@link #setItemParam4}
     * @param itemParam4
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam4(String itemParam4){
        this.setItemParam4(itemParam4);
        return this;
    }

    /**
     * <B>ITEMPARAM5</B>&nbsp;面板项参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ITEMPARAM5 = "itemparam5";

    /**
     * 设置 面板项参数5
     * 
     * @param itemParam5
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM5)
    public void setItemParam5(Integer itemParam5){
        this.set(FIELD_ITEMPARAM5, itemParam5);
    }
    
    /**
     * 获取 面板项参数5  
     * @return
     */
    @JsonIgnore
    public Integer getItemParam5(){
        Object objValue = this.get(FIELD_ITEMPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam5Dirty(){
        if(this.contains(FIELD_ITEMPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数5
     */
    @JsonIgnore
    public void resetItemParam5(){
        this.reset(FIELD_ITEMPARAM5);
    }

    /**
     * 设置 面板项参数5
     * <P>
     * 等同 {@link #setItemParam5}
     * @param itemParam5
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam5(Integer itemParam5){
        this.setItemParam5(itemParam5);
        return this;
    }

     /**
     * 设置 面板项参数5
     * <P>
     * 等同 {@link #setItemParam5}
     * @param itemParam5
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam5(Boolean itemParam5){
        if(itemParam5 == null){
            this.setItemParam5(null);
        }
        else{
            this.setItemParam5(itemParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ITEMPARAM6</B>&nbsp;面板项参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ITEMPARAM6 = "itemparam6";

    /**
     * 设置 面板项参数6
     * 
     * @param itemParam6
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM6)
    public void setItemParam6(Integer itemParam6){
        this.set(FIELD_ITEMPARAM6, itemParam6);
    }
    
    /**
     * 获取 面板项参数6  
     * @return
     */
    @JsonIgnore
    public Integer getItemParam6(){
        Object objValue = this.get(FIELD_ITEMPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam6Dirty(){
        if(this.contains(FIELD_ITEMPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数6
     */
    @JsonIgnore
    public void resetItemParam6(){
        this.reset(FIELD_ITEMPARAM6);
    }

    /**
     * 设置 面板项参数6
     * <P>
     * 等同 {@link #setItemParam6}
     * @param itemParam6
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam6(Integer itemParam6){
        this.setItemParam6(itemParam6);
        return this;
    }

     /**
     * 设置 面板项参数6
     * <P>
     * 等同 {@link #setItemParam6}
     * @param itemParam6
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam6(Boolean itemParam6){
        if(itemParam6 == null){
            this.setItemParam6(null);
        }
        else{
            this.setItemParam6(itemParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ITEMPARAM7</B>&nbsp;面板项参数7
     */
    public final static String FIELD_ITEMPARAM7 = "itemparam7";

    /**
     * 设置 面板项参数7
     * 
     * @param itemParam7
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM7)
    public void setItemParam7(Integer itemParam7){
        this.set(FIELD_ITEMPARAM7, itemParam7);
    }
    
    /**
     * 获取 面板项参数7  
     * @return
     */
    @JsonIgnore
    public Integer getItemParam7(){
        Object objValue = this.get(FIELD_ITEMPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam7Dirty(){
        if(this.contains(FIELD_ITEMPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数7
     */
    @JsonIgnore
    public void resetItemParam7(){
        this.reset(FIELD_ITEMPARAM7);
    }

    /**
     * 设置 面板项参数7
     * <P>
     * 等同 {@link #setItemParam7}
     * @param itemParam7
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam7(Integer itemParam7){
        this.setItemParam7(itemParam7);
        return this;
    }

    /**
     * <B>ITEMPARAM8</B>&nbsp;面板项参数8
     */
    public final static String FIELD_ITEMPARAM8 = "itemparam8";

    /**
     * 设置 面板项参数8
     * 
     * @param itemParam8
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM8)
    public void setItemParam8(Integer itemParam8){
        this.set(FIELD_ITEMPARAM8, itemParam8);
    }
    
    /**
     * 获取 面板项参数8  
     * @return
     */
    @JsonIgnore
    public Integer getItemParam8(){
        Object objValue = this.get(FIELD_ITEMPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板项参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam8Dirty(){
        if(this.contains(FIELD_ITEMPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数8
     */
    @JsonIgnore
    public void resetItemParam8(){
        this.reset(FIELD_ITEMPARAM8);
    }

    /**
     * 设置 面板项参数8
     * <P>
     * 等同 {@link #setItemParam8}
     * @param itemParam8
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam8(Integer itemParam8){
        this.setItemParam8(itemParam8);
        return this;
    }

    /**
     * <B>ITEMPARAM9</B>&nbsp;面板项参数9
     */
    public final static String FIELD_ITEMPARAM9 = "itemparam9";

    /**
     * 设置 面板项参数9
     * 
     * @param itemParam9
     * 
     */
    @JsonProperty(FIELD_ITEMPARAM9)
    public void setItemParam9(Double itemParam9){
        this.set(FIELD_ITEMPARAM9, itemParam9);
    }
    
    /**
     * 获取 面板项参数9  
     * @return
     */
    @JsonIgnore
    public Double getItemParam9(){
        Object objValue = this.get(FIELD_ITEMPARAM9);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 面板项参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParam9Dirty(){
        if(this.contains(FIELD_ITEMPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板项参数9
     */
    @JsonIgnore
    public void resetItemParam9(){
        this.reset(FIELD_ITEMPARAM9);
    }

    /**
     * 设置 面板项参数9
     * <P>
     * 等同 {@link #setItemParam9}
     * @param itemParam9
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparam9(Double itemParam9){
        this.setItemParam9(itemParam9);
        return this;
    }

    /**
     * <B>ITEMPARAMS</B>&nbsp;项参数
     */
    public final static String FIELD_ITEMPARAMS = "itemparams";

    /**
     * 设置 项参数
     * 
     * @param itemParams
     * 
     */
    @JsonProperty(FIELD_ITEMPARAMS)
    public void setItemParams(String itemParams){
        this.set(FIELD_ITEMPARAMS, itemParams);
    }
    
    /**
     * 获取 项参数  
     * @return
     */
    @JsonIgnore
    public String getItemParams(){
        Object objValue = this.get(FIELD_ITEMPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParamsDirty(){
        if(this.contains(FIELD_ITEMPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项参数
     */
    @JsonIgnore
    public void resetItemParams(){
        this.reset(FIELD_ITEMPARAMS);
    }

    /**
     * 设置 项参数
     * <P>
     * 等同 {@link #setItemParams}
     * @param itemParams
     */
    @JsonIgnore
    public PSSysViewPanelItem itemparams(String itemParams){
        this.setItemParams(itemParams);
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;成员类型，指定面板部件成员的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PanelItemType} 
     */
    public final static String FIELD_ITEMTYPE = "itemtype";

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_ITEMTYPE}
     * 
     * @param itemType
     * 
     */
    @JsonProperty(FIELD_ITEMTYPE)
    public void setItemType(String itemType){
        this.set(FIELD_ITEMTYPE, itemType);
    }
    
    /**
     * 获取 成员类型  
     * @return
     */
    @JsonIgnore
    public String getItemType(){
        Object objValue = this.get(FIELD_ITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTypeDirty(){
        if(this.contains(FIELD_ITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetItemType(){
        this.reset(FIELD_ITEMTYPE);
    }

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysViewPanelItem itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

     /**
     * 设置 成员类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysViewPanelItem itemtype(net.ibizsys.psmodel.core.util.PSModelEnums.PanelItemType itemType){
        if(itemType == null){
            this.setItemType(null);
        }
        else{
            this.setItemType(itemType.value);
        }
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
    public PSSysViewPanelItem labeldynaclass(String labelDynaClass){
        this.setLabelDynaClass(labelDynaClass);
        return this;
    }

    /**
     * <B>LABELPSSYSCSSID</B>&nbsp;标题样式表，指定面板成员标题的多语言资源对象
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
    public PSSysViewPanelItem labelpssyscssid(String labelPSSysCssId){
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
    public PSSysViewPanelItem labelpssyscssid(PSSysCss pSSysCss){
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
     * <B>LABELPSSYSCSSNAME</B>&nbsp;标题样式表，指定面板成员标题的多语言资源对象
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
    public PSSysViewPanelItem labelpssyscssname(String labelPSSysCssName){
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
    public PSSysViewPanelItem labelrawcssstyle(String labelRawCssStyle){
        this.setLabelRawCssStyle(labelRawCssStyle);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定面板成员的布局容器模式
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
    public PSSysViewPanelItem layoutmode(String layoutMode){
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
    public PSSysViewPanelItem layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左侧位置
     */
    public final static String FIELD_LEFTPOS = "leftpos";

    /**
     * 设置 左侧位置
     * 
     * @param leftPos
     * 
     */
    @JsonProperty(FIELD_LEFTPOS)
    public void setLeftPos(Integer leftPos){
        this.set(FIELD_LEFTPOS, leftPos);
    }
    
    /**
     * 获取 左侧位置  
     * @return
     */
    @JsonIgnore
    public Integer getLeftPos(){
        Object objValue = this.get(FIELD_LEFTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 左侧位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeftPosDirty(){
        if(this.contains(FIELD_LEFTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左侧位置
     */
    @JsonIgnore
    public void resetLeftPos(){
        this.reset(FIELD_LEFTPOS);
    }

    /**
     * 设置 左侧位置
     * <P>
     * 等同 {@link #setLeftPos}
     * @param leftPos
     */
    @JsonIgnore
    public PSSysViewPanelItem leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定面板成员的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
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
     * 判断 逻辑名称 是否指定值，包括空值
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
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysViewPanelItem logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 1000
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
    public PSSysViewPanelItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端面板
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端面板
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端面板  
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
     * 判断 移动端面板 是否指定值，包括空值
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
     * 重置 移动端面板
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端面板
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSSysViewPanelItem mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
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
    public PSSysViewPanelItem openpsappviewid(String openPSAppViewId){
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
    public PSSysViewPanelItem openpsappviewid(PSAppView pSAppView){
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
    public PSSysViewPanelItem openpsappviewname(String openPSAppViewName){
        this.setOpenPSAppViewName(openPSAppViewName);
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
    public PSSysViewPanelItem openpsdeviewid(String openPSDEViewId){
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
    public PSSysViewPanelItem openpsdeviewid(PSDEViewBase pSDEViewBase){
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
    public PSSysViewPanelItem openpsdeviewname(String openPSDEViewName){
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
    public PSSysViewPanelItem openpssyspdtviewid(String openPSSysPDTViewId){
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
    public PSSysViewPanelItem openpssyspdtviewid(PSSysPDTView pSSysPDTView){
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
    public PSSysViewPanelItem openpssyspdtviewname(String openPSSysPDTViewName){
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
    public PSSysViewPanelItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>ORIENTATIONMODE</B>&nbsp;方向设置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobAppOrientationMode} 
     */
    public final static String FIELD_ORIENTATIONMODE = "orientationmode";

    /**
     * 设置 方向设置
     * 
     * @param orientationMode
     * 
     */
    @JsonProperty(FIELD_ORIENTATIONMODE)
    public void setOrientationMode(String orientationMode){
        this.set(FIELD_ORIENTATIONMODE, orientationMode);
    }
    
    /**
     * 获取 方向设置  
     * @return
     */
    @JsonIgnore
    public String getOrientationMode(){
        Object objValue = this.get(FIELD_ORIENTATIONMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方向设置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrientationModeDirty(){
        if(this.contains(FIELD_ORIENTATIONMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方向设置
     */
    @JsonIgnore
    public void resetOrientationMode(){
        this.reset(FIELD_ORIENTATIONMODE);
    }

    /**
     * 设置 方向设置
     * <P>
     * 等同 {@link #setOrientationMode}
     * @param orientationMode
     */
    @JsonIgnore
    public PSSysViewPanelItem orientationmode(String orientationMode){
        this.setOrientationMode(orientationMode);
        return this;
    }

     /**
     * 设置 方向设置
     * <P>
     * 等同 {@link #setOrientationMode}
     * @param orientationMode
     */
    @JsonIgnore
    public PSSysViewPanelItem orientationmode(net.ibizsys.psmodel.core.util.PSModelEnums.MobAppOrientationMode orientationMode){
        if(orientationMode == null){
            this.setOrientationMode(null);
        }
        else{
            this.setOrientationMode(orientationMode.value);
        }
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
    public PSSysViewPanelItem phpslanresid(String pHPSLanResId){
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
    public PSSysViewPanelItem phpslanresid(PSLanguageRes pSLanguageRes){
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
    public PSSysViewPanelItem phpslanresname(String pHPSLanResName){
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定面板属性项编辑器的占位提示信息
     * <P>
     * 字符串：最大长度 200
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
    public PSSysViewPanelItem placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PLAYOUTMODE</B>&nbsp;父布局模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSVIEWPANELITEMID}
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
    public PSSysViewPanelItem playoutmode(String pLayoutMode){
        this.setPLayoutMode(pLayoutMode);
        return this;
    }

    /**
     * <B>PPSSYSVIEWPANELITEMID</B>&nbsp;父项，指定面板成员的父成员对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanelItem} 
     */
    public final static String FIELD_PPSSYSVIEWPANELITEMID = "ppssysviewpanelitemid";

    /**
     * 设置 父项，详细说明：{@link #FIELD_PPSSYSVIEWPANELITEMID}
     * 
     * @param pPSSysViewPanelItemId
     * 
     */
    @JsonProperty(FIELD_PPSSYSVIEWPANELITEMID)
    public void setPPSSysViewPanelItemId(String pPSSysViewPanelItemId){
        this.set(FIELD_PPSSYSVIEWPANELITEMID, pPSSysViewPanelItemId);
    }
    
    /**
     * 获取 父项  
     * @return
     */
    @JsonIgnore
    public String getPPSSysViewPanelItemId(){
        Object objValue = this.get(FIELD_PPSSYSVIEWPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysViewPanelItemIdDirty(){
        if(this.contains(FIELD_PPSSYSVIEWPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父项
     */
    @JsonIgnore
    public void resetPPSSysViewPanelItemId(){
        this.reset(FIELD_PPSSYSVIEWPANELITEMID);
    }

    /**
     * 设置 父项，详细说明：{@link #FIELD_PPSSYSVIEWPANELITEMID}
     * <P>
     * 等同 {@link #setPPSSysViewPanelItemId}
     * @param pPSSysViewPanelItemId
     */
    @JsonIgnore
    public PSSysViewPanelItem ppssysviewpanelitemid(String pPSSysViewPanelItemId){
        this.setPPSSysViewPanelItemId(pPSSysViewPanelItemId);
        return this;
    }

    /**
     * 设置 父项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysViewPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem ppssysviewpanelitemid(PSSysViewPanelItem pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setPLayoutMode(null);
            this.setPPSSysViewPanelItemId(null);
            this.setPPSSysViewPanelItemName(null);
        }
        else{
            this.setPLayoutMode(pSSysViewPanelItem.getLayoutMode());
            this.setPPSSysViewPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPPSSysViewPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>PPSSYSVIEWPANELITEMNAME</B>&nbsp;父项，指定面板成员的父成员对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSVIEWPANELITEMID}
     */
    public final static String FIELD_PPSSYSVIEWPANELITEMNAME = "ppssysviewpanelitemname";

    /**
     * 设置 父项，详细说明：{@link #FIELD_PPSSYSVIEWPANELITEMNAME}
     * 
     * @param pPSSysViewPanelItemName
     * 
     */
    @JsonProperty(FIELD_PPSSYSVIEWPANELITEMNAME)
    public void setPPSSysViewPanelItemName(String pPSSysViewPanelItemName){
        this.set(FIELD_PPSSYSVIEWPANELITEMNAME, pPSSysViewPanelItemName);
    }
    
    /**
     * 获取 父项  
     * @return
     */
    @JsonIgnore
    public String getPPSSysViewPanelItemName(){
        Object objValue = this.get(FIELD_PPSSYSVIEWPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysViewPanelItemNameDirty(){
        if(this.contains(FIELD_PPSSYSVIEWPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父项
     */
    @JsonIgnore
    public void resetPPSSysViewPanelItemName(){
        this.reset(FIELD_PPSSYSVIEWPANELITEMNAME);
    }

    /**
     * 设置 父项，详细说明：{@link #FIELD_PPSSYSVIEWPANELITEMNAME}
     * <P>
     * 等同 {@link #setPPSSysViewPanelItemName}
     * @param pPSSysViewPanelItemName
     */
    @JsonIgnore
    public PSSysViewPanelItem ppssysviewpanelitemname(String pPSSysViewPanelItemName){
        this.setPPSSysViewPanelItemName(pPSSysViewPanelItemName);
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
    public PSSysViewPanelItem predefinedtype(String predefinedType){
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
    public PSSysViewPanelItem predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;后台处理对象，指定面板控件成员的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
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
     * 设置 后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSSysViewPanelItem psachandlerid(String pSACHandlerId){
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
    public PSSysViewPanelItem psachandlerid(PSACHandler pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定面板控件成员的界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 界面处理对象  
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
     * 判断 界面处理对象 是否指定值，包括空值
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
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSSysViewPanelItem psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;应用菜单，指定面板控件成员类型为【应用菜单】时指定应用菜单对象
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
    public PSSysViewPanelItem psappmenuid(String pSAppMenuId){
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
    public PSSysViewPanelItem psappmenuid(PSAppMenu pSAppMenu){
        if(pSAppMenu == null){
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        }
        else{
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    /**
     * <B>PSAPPMENUNAME</B>&nbsp;应用菜单，指定面板控件成员类型为【应用菜单】时指定应用菜单对象
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
    public PSSysViewPanelItem psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定面板属性项相关的代码表对象，提供面板模型值的转换逻辑
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
    public PSSysViewPanelItem pscodelistid(String pSCodeListId){
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
    public PSSysViewPanelItem pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定面板属性项相关的代码表对象，提供面板模型值的转换逻辑
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
    public PSSysViewPanelItem pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSCTRLID</B>&nbsp;部件标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSCTRLID = "psctrlid";

    /**
     * 设置 部件标识
     * 
     * @param pSCtrlId
     * 
     */
    @JsonProperty(FIELD_PSCTRLID)
    public void setPSCtrlId(String pSCtrlId){
        this.set(FIELD_PSCTRLID, pSCtrlId);
    }
    
    /**
     * 获取 部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlId(){
        Object objValue = this.get(FIELD_PSCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlIdDirty(){
        if(this.contains(FIELD_PSCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件标识
     */
    @JsonIgnore
    public void resetPSCtrlId(){
        this.reset(FIELD_PSCTRLID);
    }

    /**
     * 设置 部件标识
     * <P>
     * 等同 {@link #setPSCtrlId}
     * @param pSCtrlId
     */
    @JsonIgnore
    public PSSysViewPanelItem psctrlid(String pSCtrlId){
        this.setPSCtrlId(pSCtrlId);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSSysViewPanelItem psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSSysViewPanelItem psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLNAME</B>&nbsp;部件名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCTRLNAME = "psctrlname";

    /**
     * 设置 部件名称
     * 
     * @param pSCtrlName
     * 
     */
    @JsonProperty(FIELD_PSCTRLNAME)
    public void setPSCtrlName(String pSCtrlName){
        this.set(FIELD_PSCTRLNAME, pSCtrlName);
    }
    
    /**
     * 获取 部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlName(){
        Object objValue = this.get(FIELD_PSCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlNameDirty(){
        if(this.contains(FIELD_PSCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件名称
     */
    @JsonIgnore
    public void resetPSCtrlName(){
        this.reset(FIELD_PSCTRLNAME);
    }

    /**
     * 设置 部件名称
     * <P>
     * 等同 {@link #setPSCtrlName}
     * @param pSCtrlName
     */
    @JsonIgnore
    public PSSysViewPanelItem psctrlname(String pSCtrlName){
        this.setPSCtrlName(pSCtrlName);
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
    public PSSysViewPanelItem psdeactionid(String pSDEActionId){
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
    public PSSysViewPanelItem psdeactionid(PSDEAction pSDEAction){
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
    public PSSysViewPanelItem psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDECHARTID</B>&nbsp;实体图表，面板控件成员类型为【数据图表】时指定实体图表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEChart} 
     */
    public final static String FIELD_PSDECHARTID = "psdechartid";

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTID}
     * 
     * @param pSDEChartId
     * 
     */
    @JsonProperty(FIELD_PSDECHARTID)
    public void setPSDEChartId(String pSDEChartId){
        this.set(FIELD_PSDECHARTID, pSDEChartId);
    }
    
    /**
     * 获取 实体图表  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartId(){
        Object objValue = this.get(FIELD_PSDECHARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartIdDirty(){
        if(this.contains(FIELD_PSDECHARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表
     */
    @JsonIgnore
    public void resetPSDEChartId(){
        this.reset(FIELD_PSDECHARTID);
    }

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTID}
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChartId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdechartid(String pSDEChartId){
        this.setPSDEChartId(pSDEChartId);
        return this;
    }

    /**
     * 设置 实体图表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEChartId}
     * @param pSDEChart 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdechartid(PSDEChart pSDEChart){
        if(pSDEChart == null){
            this.setPSDEChartId(null);
            this.setPSDEChartName(null);
        }
        else{
            this.setPSDEChartId(pSDEChart.getPSDEChartId());
            this.setPSDEChartName(pSDEChart.getPSDEChartName());
        }
        return this;
    }

    /**
     * <B>PSDECHARTNAME</B>&nbsp;实体图表，面板控件成员类型为【数据图表】时指定实体图表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDECHARTID}
     */
    public final static String FIELD_PSDECHARTNAME = "psdechartname";

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTNAME}
     * 
     * @param pSDEChartName
     * 
     */
    @JsonProperty(FIELD_PSDECHARTNAME)
    public void setPSDEChartName(String pSDEChartName){
        this.set(FIELD_PSDECHARTNAME, pSDEChartName);
    }
    
    /**
     * 获取 实体图表  
     * @return
     */
    @JsonIgnore
    public String getPSDEChartName(){
        Object objValue = this.get(FIELD_PSDECHARTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体图表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEChartNameDirty(){
        if(this.contains(FIELD_PSDECHARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体图表
     */
    @JsonIgnore
    public void resetPSDEChartName(){
        this.reset(FIELD_PSDECHARTNAME);
    }

    /**
     * 设置 实体图表，详细说明：{@link #FIELD_PSDECHARTNAME}
     * <P>
     * 等同 {@link #setPSDEChartName}
     * @param pSDEChartName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdechartname(String pSDEChartName){
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;实体数据集，面板控件成员使用的数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
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
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;实体数据集，面板控件成员使用的数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
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
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEDATAVIEWID</B>&nbsp;实体卡片视图，面板控件成员类型为【卡片视图】时指定实体卡片视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataView} 
     */
    public final static String FIELD_PSDEDATAVIEWID = "psdedataviewid";

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWID}
     * 
     * @param pSDEDataViewId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWID)
    public void setPSDEDataViewId(String pSDEDataViewId){
        this.set(FIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }
    
    /**
     * 获取 实体卡片视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataViewId(){
        Object objValue = this.get(FIELD_PSDEDATAVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体卡片视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataViewIdDirty(){
        if(this.contains(FIELD_PSDEDATAVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体卡片视图
     */
    @JsonIgnore
    public void resetPSDEDataViewId(){
        this.reset(FIELD_PSDEDATAVIEWID);
    }

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWID}
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataViewId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedataviewid(String pSDEDataViewId){
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    /**
     * 设置 实体卡片视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataView 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedataviewid(PSDEDataView pSDEDataView){
        if(pSDEDataView == null){
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        }
        else{
            this.setPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAVIEWNAME</B>&nbsp;实体卡片视图，面板控件成员类型为【卡片视图】时指定实体卡片视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAVIEWID}
     */
    public final static String FIELD_PSDEDATAVIEWNAME = "psdedataviewname";

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWNAME}
     * 
     * @param pSDEDataViewName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWNAME)
    public void setPSDEDataViewName(String pSDEDataViewName){
        this.set(FIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }
    
    /**
     * 获取 实体卡片视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataViewName(){
        Object objValue = this.get(FIELD_PSDEDATAVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体卡片视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataViewNameDirty(){
        if(this.contains(FIELD_PSDEDATAVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体卡片视图
     */
    @JsonIgnore
    public void resetPSDEDataViewName(){
        this.reset(FIELD_PSDEDATAVIEWNAME);
    }

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWNAME}
     * <P>
     * 等同 {@link #setPSDEDataViewName}
     * @param pSDEDataViewName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedataviewname(String pSDEDataViewName){
        this.setPSDEDataViewName(pSDEDataViewName);
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
    public PSSysViewPanelItem psdedrid(String pSDEDRId){
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
    public PSSysViewPanelItem psdedrid(PSDEDataRelation pSDEDataRelation){
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
     * <B>PSDEDRITEMID</B>&nbsp;数据关系界面
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDRItem} 
     */
    public final static String FIELD_PSDEDRITEMID = "psdedritemid";

    /**
     * 设置 数据关系界面
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
     * 设置 数据关系界面
     * <P>
     * 等同 {@link #setPSDEDRItemId}
     * @param pSDEDRItemId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedritemid(String pSDEDRItemId){
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
    public PSSysViewPanelItem psdedritemid(PSDEDRItem pSDEDRItem){
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
     * <B>PSDEDRITEMNAME</B>&nbsp;数据关系界面
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRITEMID}
     */
    public final static String FIELD_PSDEDRITEMNAME = "psdedritemname";

    /**
     * 设置 数据关系界面
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
     * 设置 数据关系界面
     * <P>
     * 等同 {@link #setPSDEDRItemName}
     * @param pSDEDRItemName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdedritemname(String pSDEDRItemName){
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
    public PSSysViewPanelItem psdedrname(String pSDEDRName){
        this.setPSDEDRName(pSDEDRName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;云实体表单，面板控件成员类型为【编辑表单】时指定实体编辑表单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 云实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 云实体表单  
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
     * 判断 云实体表单 是否指定值，包括空值
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
     * 重置 云实体表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 云实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 云实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        }
        else{
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;实体表单，面板控件成员类型为【编辑表单】时指定实体编辑表单对象
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
    public PSSysViewPanelItem psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;云实体表格，面板控件成员类型为【数据表格】时指定实体表格对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGrid} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 云实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 云实体表格  
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
     * 判断 云实体表格 是否指定值，包括空值
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
     * 重置 云实体表格
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 云实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * 设置 云实体表格，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdegridid(PSDEGrid pSDEGrid){
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
     * <B>PSDEGRIDNAME</B>&nbsp;实体表格，面板控件成员类型为【数据表格】时指定实体表格对象
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
    public PSSysViewPanelItem psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定面板成员相关的实体对象
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
    public PSSysViewPanelItem psdeid(String pSDEId){
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
    public PSSysViewPanelItem psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELISTID</B>&nbsp;实体列表，面板控件成员类型为【列表】时指定实体列表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEList} 
     */
    public final static String FIELD_PSDELISTID = "psdelistid";

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTID}
     * 
     * @param pSDEListId
     * 
     */
    @JsonProperty(FIELD_PSDELISTID)
    public void setPSDEListId(String pSDEListId){
        this.set(FIELD_PSDELISTID, pSDEListId);
    }
    
    /**
     * 获取 实体列表  
     * @return
     */
    @JsonIgnore
    public String getPSDEListId(){
        Object objValue = this.get(FIELD_PSDELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListIdDirty(){
        if(this.contains(FIELD_PSDELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表
     */
    @JsonIgnore
    public void resetPSDEListId(){
        this.reset(FIELD_PSDELISTID);
    }

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTID}
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEListId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdelistid(String pSDEListId){
        this.setPSDEListId(pSDEListId);
        return this;
    }

    /**
     * 设置 实体列表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEList 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdelistid(PSDEList pSDEList){
        if(pSDEList == null){
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        }
        else{
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    /**
     * <B>PSDELISTNAME</B>&nbsp;实体列表，面板控件成员类型为【列表】时指定实体列表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELISTID}
     */
    public final static String FIELD_PSDELISTNAME = "psdelistname";

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTNAME}
     * 
     * @param pSDEListName
     * 
     */
    @JsonProperty(FIELD_PSDELISTNAME)
    public void setPSDEListName(String pSDEListName){
        this.set(FIELD_PSDELISTNAME, pSDEListName);
    }
    
    /**
     * 获取 实体列表  
     * @return
     */
    @JsonIgnore
    public String getPSDEListName(){
        Object objValue = this.get(FIELD_PSDELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListNameDirty(){
        if(this.contains(FIELD_PSDELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表
     */
    @JsonIgnore
    public void resetPSDEListName(){
        this.reset(FIELD_PSDELISTNAME);
    }

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTNAME}
     * <P>
     * 等同 {@link #setPSDEListName}
     * @param pSDEListName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdelistname(String pSDEListName){
        this.setPSDEListName(pSDEListName);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体处理逻辑
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体处理逻辑
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体处理逻辑
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体处理逻辑
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定面板成员相关的实体对象
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
    public PSSysViewPanelItem psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEPANELID</B>&nbsp;实体面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSDEPANELID = "psdepanelid";

    /**
     * 设置 实体面板
     * 
     * @param pSDEPanelId
     * 
     */
    @JsonProperty(FIELD_PSDEPANELID)
    public void setPSDEPanelId(String pSDEPanelId){
        this.set(FIELD_PSDEPANELID, pSDEPanelId);
    }
    
    /**
     * 获取 实体面板  
     * @return
     */
    @JsonIgnore
    public String getPSDEPanelId(){
        Object objValue = this.get(FIELD_PSDEPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPanelIdDirty(){
        if(this.contains(FIELD_PSDEPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体面板
     */
    @JsonIgnore
    public void resetPSDEPanelId(){
        this.reset(FIELD_PSDEPANELID);
    }

    /**
     * 设置 实体面板
     * <P>
     * 等同 {@link #setPSDEPanelId}
     * @param pSDEPanelId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdepanelid(String pSDEPanelId){
        this.setPSDEPanelId(pSDEPanelId);
        return this;
    }

    /**
     * 设置 实体面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdepanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSDEPanelId(null);
            this.setPSDEPanelName(null);
        }
        else{
            this.setPSDEPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSDEPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSDEPANELNAME</B>&nbsp;实体面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEPANELID}
     */
    public final static String FIELD_PSDEPANELNAME = "psdepanelname";

    /**
     * 设置 实体面板
     * 
     * @param pSDEPanelName
     * 
     */
    @JsonProperty(FIELD_PSDEPANELNAME)
    public void setPSDEPanelName(String pSDEPanelName){
        this.set(FIELD_PSDEPANELNAME, pSDEPanelName);
    }
    
    /**
     * 获取 实体面板  
     * @return
     */
    @JsonIgnore
    public String getPSDEPanelName(){
        Object objValue = this.get(FIELD_PSDEPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPanelNameDirty(){
        if(this.contains(FIELD_PSDEPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体面板
     */
    @JsonIgnore
    public void resetPSDEPanelName(){
        this.reset(FIELD_PSDEPANELNAME);
    }

    /**
     * 设置 实体面板
     * <P>
     * 等同 {@link #setPSDEPanelName}
     * @param pSDEPanelName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdepanelname(String pSDEPanelName){
        this.setPSDEPanelName(pSDEPanelName);
        return this;
    }

    /**
     * <B>PSDEREPORTID</B>&nbsp;实体报表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEReport} 
     */
    public final static String FIELD_PSDEREPORTID = "psdereportid";

    /**
     * 设置 实体报表
     * 
     * @param pSDEReportId
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTID)
    public void setPSDEReportId(String pSDEReportId){
        this.set(FIELD_PSDEREPORTID, pSDEReportId);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportId(){
        Object objValue = this.get(FIELD_PSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportIdDirty(){
        if(this.contains(FIELD_PSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetPSDEReportId(){
        this.reset(FIELD_PSDEREPORTID);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReportId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdereportid(String pSDEReportId){
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    /**
     * 设置 实体报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReport 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdereportid(PSDEReport pSDEReport){
        if(pSDEReport == null){
            this.setPSDEReportId(null);
            this.setPSDEReportName(null);
        }
        else{
            this.setPSDEReportId(pSDEReport.getPSDEReportId());
            this.setPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    /**
     * <B>PSDEREPORTNAME</B>&nbsp;实体报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEREPORTID}
     */
    public final static String FIELD_PSDEREPORTNAME = "psdereportname";

    /**
     * 设置 实体报表
     * 
     * @param pSDEReportName
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTNAME)
    public void setPSDEReportName(String pSDEReportName){
        this.set(FIELD_PSDEREPORTNAME, pSDEReportName);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportName(){
        Object objValue = this.get(FIELD_PSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportNameDirty(){
        if(this.contains(FIELD_PSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetPSDEReportName(){
        this.reset(FIELD_PSDEREPORTNAME);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setPSDEReportName}
     * @param pSDEReportName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdereportname(String pSDEReportName){
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    /**
     * <B>PSDESEARCHFORMID</B>&nbsp;实体搜索表单，面板控件成员类型为【搜索表单】时指定实体搜索表单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDESEARCHFORMID = "psdesearchformid";

    /**
     * 设置 实体搜索表单，详细说明：{@link #FIELD_PSDESEARCHFORMID}
     * 
     * @param pSDESearchFormId
     * 
     */
    @JsonProperty(FIELD_PSDESEARCHFORMID)
    public void setPSDESearchFormId(String pSDESearchFormId){
        this.set(FIELD_PSDESEARCHFORMID, pSDESearchFormId);
    }
    
    /**
     * 获取 实体搜索表单  
     * @return
     */
    @JsonIgnore
    public String getPSDESearchFormId(){
        Object objValue = this.get(FIELD_PSDESEARCHFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体搜索表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESearchFormIdDirty(){
        if(this.contains(FIELD_PSDESEARCHFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体搜索表单
     */
    @JsonIgnore
    public void resetPSDESearchFormId(){
        this.reset(FIELD_PSDESEARCHFORMID);
    }

    /**
     * 设置 实体搜索表单，详细说明：{@link #FIELD_PSDESEARCHFORMID}
     * <P>
     * 等同 {@link #setPSDESearchFormId}
     * @param pSDESearchFormId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdesearchformid(String pSDESearchFormId){
        this.setPSDESearchFormId(pSDESearchFormId);
        return this;
    }

    /**
     * 设置 实体搜索表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDESearchFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdesearchformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setPSDESearchFormId(null);
            this.setPSDESearchFormName(null);
        }
        else{
            this.setPSDESearchFormId(pSDEForm.getPSDEFormId());
            this.setPSDESearchFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDESEARCHFORMNAME</B>&nbsp;实体搜索表单，面板控件成员类型为【搜索表单】时指定实体搜索表单对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESEARCHFORMID}
     */
    public final static String FIELD_PSDESEARCHFORMNAME = "psdesearchformname";

    /**
     * 设置 实体搜索表单，详细说明：{@link #FIELD_PSDESEARCHFORMNAME}
     * 
     * @param pSDESearchFormName
     * 
     */
    @JsonProperty(FIELD_PSDESEARCHFORMNAME)
    public void setPSDESearchFormName(String pSDESearchFormName){
        this.set(FIELD_PSDESEARCHFORMNAME, pSDESearchFormName);
    }
    
    /**
     * 获取 实体搜索表单  
     * @return
     */
    @JsonIgnore
    public String getPSDESearchFormName(){
        Object objValue = this.get(FIELD_PSDESEARCHFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体搜索表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESearchFormNameDirty(){
        if(this.contains(FIELD_PSDESEARCHFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体搜索表单
     */
    @JsonIgnore
    public void resetPSDESearchFormName(){
        this.reset(FIELD_PSDESEARCHFORMNAME);
    }

    /**
     * 设置 实体搜索表单，详细说明：{@link #FIELD_PSDESEARCHFORMNAME}
     * <P>
     * 等同 {@link #setPSDESearchFormName}
     * @param pSDESearchFormName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdesearchformname(String pSDESearchFormName){
        this.setPSDESearchFormName(pSDESearchFormName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;实体工具栏，面板控件成员类型为【工具栏】时指定实体工具栏对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_PSDETOOLBARID = "psdetoolbarid";

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARID}
     * 
     * @param pSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARID)
    public void setPSDEToolbarId(String pSDEToolbarId){
        this.set(FIELD_PSDETOOLBARID, pSDEToolbarId);
    }
    
    /**
     * 获取 实体工具栏  
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
     * 判断 实体工具栏 是否指定值，包括空值
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
     * 重置 实体工具栏
     */
    @JsonIgnore
    public void resetPSDEToolbarId(){
        this.reset(FIELD_PSDETOOLBARID);
    }

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARID}
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbarId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdetoolbarid(String pSDEToolbarId){
        this.setPSDEToolbarId(pSDEToolbarId);
        return this;
    }

    /**
     * 设置 实体工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdetoolbarid(PSDEToolbar pSDEToolbar){
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
     * <B>PSDETOOLBARNAME</B>&nbsp;实体工具栏，面板控件成员类型为【工具栏】时指定实体工具栏对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETOOLBARID}
     */
    public final static String FIELD_PSDETOOLBARNAME = "psdetoolbarname";

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * 
     * @param pSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_PSDETOOLBARNAME)
    public void setPSDEToolbarName(String pSDEToolbarName){
        this.set(FIELD_PSDETOOLBARNAME, pSDEToolbarName);
    }
    
    /**
     * 获取 实体工具栏  
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
     * 判断 实体工具栏 是否指定值，包括空值
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
     * 重置 实体工具栏
     */
    @JsonIgnore
    public void resetPSDEToolbarName(){
        this.reset(FIELD_PSDETOOLBARNAME);
    }

    /**
     * 设置 实体工具栏，详细说明：{@link #FIELD_PSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setPSDEToolbarName}
     * @param pSDEToolbarName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，面板控件成员类型为【树视图】时指定实体树视图对象
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
    public PSSysViewPanelItem psdetreeviewid(String pSDETreeViewId){
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
    public PSSysViewPanelItem psdetreeviewid(PSDETreeView pSDETreeView){
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
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图，面板控件成员类型为【树视图】时指定实体树视图对象
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
    public PSSysViewPanelItem psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 实体界面行为组
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
     * 设置 实体界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeuagroupid(String pSDEUAGroupId){
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
    public PSSysViewPanelItem psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 实体界面行为组
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
     * 设置 实体界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为，面板按钮项指定触发的界面行为操作
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
    public PSSysViewPanelItem psdeuiactionid(String pSDEUIActionId){
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
    public PSSysViewPanelItem psdeuiactionid(PSDEUIAction pSDEUIAction){
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
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为，面板按钮项指定触发的界面行为操作
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
    public PSSysViewPanelItem psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图  
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
     * 判断 实体视图 是否指定值，包括空值
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
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeviewbaseid(PSDEViewBase pSDEViewBase){
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
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图  
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
     * 判断 实体视图 是否指定值，包括空值
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
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDEWIZARDID</B>&nbsp;实体向导
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEWizard} 
     */
    public final static String FIELD_PSDEWIZARDID = "psdewizardid";

    /**
     * 设置 实体向导
     * 
     * @param pSDEWizardId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDID)
    public void setPSDEWizardId(String pSDEWizardId){
        this.set(FIELD_PSDEWIZARDID, pSDEWizardId);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardId(){
        Object objValue = this.get(FIELD_PSDEWIZARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardId(){
        this.reset(FIELD_PSDEWIZARDID);
    }

    /**
     * 设置 实体向导
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizardId
     */
    @JsonIgnore
    public PSSysViewPanelItem psdewizardid(String pSDEWizardId){
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    /**
     * 设置 实体向导，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizard 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem psdewizardid(PSDEWizard pSDEWizard){
        if(pSDEWizard == null){
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        }
        else{
            this.setPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDNAME</B>&nbsp;实体向导
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEWIZARDNAME = "psdewizardname";

    /**
     * 设置 实体向导
     * 
     * @param pSDEWizardName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDNAME)
    public void setPSDEWizardName(String pSDEWizardName){
        this.set(FIELD_PSDEWIZARDNAME, pSDEWizardName);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardName(){
        Object objValue = this.get(FIELD_PSDEWIZARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardName(){
        this.reset(FIELD_PSDEWIZARDNAME);
    }

    /**
     * 设置 实体向导
     * <P>
     * 等同 {@link #setPSDEWizardName}
     * @param pSDEWizardName
     */
    @JsonIgnore
    public PSSysViewPanelItem psdewizardname(String pSDEWizardName){
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARID</B>&nbsp;日历部件，面板控件成员类型为【日历部件】时指定日历部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCalendar} 
     */
    public final static String FIELD_PSSYSCALENDARID = "pssyscalendarid";

    /**
     * 设置 日历部件，详细说明：{@link #FIELD_PSSYSCALENDARID}
     * 
     * @param pSSysCalendarId
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARID)
    public void setPSSysCalendarId(String pSSysCalendarId){
        this.set(FIELD_PSSYSCALENDARID, pSSysCalendarId);
    }
    
    /**
     * 获取 日历部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarId(){
        Object objValue = this.get(FIELD_PSSYSCALENDARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarIdDirty(){
        if(this.contains(FIELD_PSSYSCALENDARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历部件
     */
    @JsonIgnore
    public void resetPSSysCalendarId(){
        this.reset(FIELD_PSSYSCALENDARID);
    }

    /**
     * 设置 日历部件，详细说明：{@link #FIELD_PSSYSCALENDARID}
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendarId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssyscalendarid(String pSSysCalendarId){
        this.setPSSysCalendarId(pSSysCalendarId);
        return this;
    }

    /**
     * 设置 日历部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCalendarId}
     * @param pSSysCalendar 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem pssyscalendarid(PSSysCalendar pSSysCalendar){
        if(pSSysCalendar == null){
            this.setPSSysCalendarId(null);
            this.setPSSysCalendarName(null);
        }
        else{
            this.setPSSysCalendarId(pSSysCalendar.getPSSysCalendarId());
            this.setPSSysCalendarName(pSSysCalendar.getPSSysCalendarName());
        }
        return this;
    }

    /**
     * <B>PSSYSCALENDARNAME</B>&nbsp;日历部件，面板控件成员类型为【日历部件】时指定日历部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCALENDARID}
     */
    public final static String FIELD_PSSYSCALENDARNAME = "pssyscalendarname";

    /**
     * 设置 日历部件，详细说明：{@link #FIELD_PSSYSCALENDARNAME}
     * 
     * @param pSSysCalendarName
     * 
     */
    @JsonProperty(FIELD_PSSYSCALENDARNAME)
    public void setPSSysCalendarName(String pSSysCalendarName){
        this.set(FIELD_PSSYSCALENDARNAME, pSSysCalendarName);
    }
    
    /**
     * 获取 日历部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysCalendarName(){
        Object objValue = this.get(FIELD_PSSYSCALENDARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日历部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCalendarNameDirty(){
        if(this.contains(FIELD_PSSYSCALENDARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日历部件
     */
    @JsonIgnore
    public void resetPSSysCalendarName(){
        this.reset(FIELD_PSSYSCALENDARNAME);
    }

    /**
     * 设置 日历部件，详细说明：{@link #FIELD_PSSYSCALENDARNAME}
     * <P>
     * 等同 {@link #setPSSysCalendarName}
     * @param pSSysCalendarName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssyscalendarname(String pSSysCalendarName){
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;容器样式表，指定面板成员的容器样式表对象
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
    public PSSysViewPanelItem pssyscssid(String pSSysCssId){
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
    public PSSysViewPanelItem pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;容器样式表，指定面板成员的容器样式表对象
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
    public PSSysViewPanelItem pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDASHBOARDID</B>&nbsp;数据看板，面板控件成员类型为【数据看板】时指定数据看板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDashboard} 
     */
    public final static String FIELD_PSSYSDASHBOARDID = "pssysdashboardid";

    /**
     * 设置 数据看板，详细说明：{@link #FIELD_PSSYSDASHBOARDID}
     * 
     * @param pSSysDashboardId
     * 
     */
    @JsonProperty(FIELD_PSSYSDASHBOARDID)
    public void setPSSysDashboardId(String pSSysDashboardId){
        this.set(FIELD_PSSYSDASHBOARDID, pSSysDashboardId);
    }
    
    /**
     * 获取 数据看板  
     * @return
     */
    @JsonIgnore
    public String getPSSysDashboardId(){
        Object objValue = this.get(FIELD_PSSYSDASHBOARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据看板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDashboardIdDirty(){
        if(this.contains(FIELD_PSSYSDASHBOARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据看板
     */
    @JsonIgnore
    public void resetPSSysDashboardId(){
        this.reset(FIELD_PSSYSDASHBOARDID);
    }

    /**
     * 设置 数据看板，详细说明：{@link #FIELD_PSSYSDASHBOARDID}
     * <P>
     * 等同 {@link #setPSSysDashboardId}
     * @param pSSysDashboardId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysdashboardid(String pSSysDashboardId){
        this.setPSSysDashboardId(pSSysDashboardId);
        return this;
    }

    /**
     * 设置 数据看板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDashboardId}
     * @param pSSysDashboard 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysdashboardid(PSSysDashboard pSSysDashboard){
        if(pSSysDashboard == null){
            this.setPSSysDashboardId(null);
            this.setPSSysDashboardName(null);
        }
        else{
            this.setPSSysDashboardId(pSSysDashboard.getPSSysDashboardId());
            this.setPSSysDashboardName(pSSysDashboard.getPSSysDashboardName());
        }
        return this;
    }

    /**
     * <B>PSSYSDASHBOARDNAME</B>&nbsp;数据看板，面板控件成员类型为【数据看板】时指定数据看板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDASHBOARDID}
     */
    public final static String FIELD_PSSYSDASHBOARDNAME = "pssysdashboardname";

    /**
     * 设置 数据看板，详细说明：{@link #FIELD_PSSYSDASHBOARDNAME}
     * 
     * @param pSSysDashboardName
     * 
     */
    @JsonProperty(FIELD_PSSYSDASHBOARDNAME)
    public void setPSSysDashboardName(String pSSysDashboardName){
        this.set(FIELD_PSSYSDASHBOARDNAME, pSSysDashboardName);
    }
    
    /**
     * 获取 数据看板  
     * @return
     */
    @JsonIgnore
    public String getPSSysDashboardName(){
        Object objValue = this.get(FIELD_PSSYSDASHBOARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据看板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDashboardNameDirty(){
        if(this.contains(FIELD_PSSYSDASHBOARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据看板
     */
    @JsonIgnore
    public void resetPSSysDashboardName(){
        this.reset(FIELD_PSSYSDASHBOARDNAME);
    }

    /**
     * 设置 数据看板，详细说明：{@link #FIELD_PSSYSDASHBOARDNAME}
     * <P>
     * 等同 {@link #setPSSysDashboardName}
     * @param pSSysDashboardName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysdashboardname(String pSSysDashboardName){
        this.setPSSysDashboardName(pSSysDashboardName);
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
    public PSSysViewPanelItem pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysViewPanelItem pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSSysViewPanelItem pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;编辑器样式，指定面板属性项的编辑器的扩展样式
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
    public PSSysViewPanelItem pssyseditorstyleid(String pSSysEditorStyleId){
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
    public PSSysViewPanelItem pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
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
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式，指定面板属性项的编辑器的扩展样式
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
    public PSSysViewPanelItem pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;图片资源，指定面板成员的图标对象，各类型成员按自身约定放置图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 图片资源，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 图片资源  
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
     * 判断 图片资源 是否指定值，包括空值
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
     * 重置 图片资源
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 图片资源，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 图片资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;图片资源，指定面板成员的图标对象，各类型成员按自身约定放置图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 图片资源，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 图片资源  
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
     * 判断 图片资源 是否指定值，包括空值
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
     * 重置 图片资源
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 图片资源，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWID</B>&nbsp;地图部件，面板控件成员类型为【地图部件】时指定地图部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMapView} 
     */
    public final static String FIELD_PSSYSMAPVIEWID = "pssysmapviewid";

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWID}
     * 
     * @param pSSysMapViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWID)
    public void setPSSysMapViewId(String pSSysMapViewId){
        this.set(FIELD_PSSYSMAPVIEWID, pSSysMapViewId);
    }
    
    /**
     * 获取 地图部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapViewId(){
        Object objValue = this.get(FIELD_PSSYSMAPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapViewIdDirty(){
        if(this.contains(FIELD_PSSYSMAPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图部件
     */
    @JsonIgnore
    public void resetPSSysMapViewId(){
        this.reset(FIELD_PSSYSMAPVIEWID);
    }

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWID}
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapViewId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysmapviewid(String pSSysMapViewId){
        this.setPSSysMapViewId(pSSysMapViewId);
        return this;
    }

    /**
     * 设置 地图部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMapViewId}
     * @param pSSysMapView 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysmapviewid(PSSysMapView pSSysMapView){
        if(pSSysMapView == null){
            this.setPSSysMapViewId(null);
            this.setPSSysMapViewName(null);
        }
        else{
            this.setPSSysMapViewId(pSSysMapView.getPSSysMapViewId());
            this.setPSSysMapViewName(pSSysMapView.getPSSysMapViewName());
        }
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWNAME</B>&nbsp;地图部件，面板控件成员类型为【地图部件】时指定地图部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMAPVIEWID}
     */
    public final static String FIELD_PSSYSMAPVIEWNAME = "pssysmapviewname";

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWNAME}
     * 
     * @param pSSysMapViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSMAPVIEWNAME)
    public void setPSSysMapViewName(String pSSysMapViewName){
        this.set(FIELD_PSSYSMAPVIEWNAME, pSSysMapViewName);
    }
    
    /**
     * 获取 地图部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysMapViewName(){
        Object objValue = this.get(FIELD_PSSYSMAPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 地图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMapViewNameDirty(){
        if(this.contains(FIELD_PSSYSMAPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 地图部件
     */
    @JsonIgnore
    public void resetPSSysMapViewName(){
        this.reset(FIELD_PSSYSMAPVIEWNAME);
    }

    /**
     * 设置 地图部件，详细说明：{@link #FIELD_PSSYSMAPVIEWNAME}
     * <P>
     * 等同 {@link #setPSSysMapViewName}
     * @param pSSysMapViewName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysmapviewname(String pSSysMapViewName){
        this.setPSSysMapViewName(pSSysMapViewName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定面板成员使用的前端模板扩展插件，使用插件类型【面板部件成员绘制插件】
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
    public PSSysViewPanelItem pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysViewPanelItem pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定面板成员使用的前端模板扩展插件，使用插件类型【面板部件成员绘制插件】
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
    public PSSysViewPanelItem pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSSysViewPanelItem pssysresourceid(String pSSysResourceId){
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
    public PSSysViewPanelItem pssysresourceid(PSSysResource pSSysResource){
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
    public PSSysViewPanelItem pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARID</B>&nbsp;搜索栏
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSearchBar} 
     */
    public final static String FIELD_PSSYSSEARCHBARID = "pssyssearchbarid";

    /**
     * 设置 搜索栏
     * 
     * @param pSSysSearchBarId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARID)
    public void setPSSysSearchBarId(String pSSysSearchBarId){
        this.set(FIELD_PSSYSSEARCHBARID, pSSysSearchBarId);
    }
    
    /**
     * 获取 搜索栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索栏
     */
    @JsonIgnore
    public void resetPSSysSearchBarId(){
        this.reset(FIELD_PSSYSSEARCHBARID);
    }

    /**
     * 设置 搜索栏
     * <P>
     * 等同 {@link #setPSSysSearchBarId}
     * @param pSSysSearchBarId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssyssearchbarid(String pSSysSearchBarId){
        this.setPSSysSearchBarId(pSSysSearchBarId);
        return this;
    }

    /**
     * 设置 搜索栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchBarId}
     * @param pSSysSearchBar 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem pssyssearchbarid(PSSysSearchBar pSSysSearchBar){
        if(pSSysSearchBar == null){
            this.setPSSysSearchBarId(null);
            this.setPSSysSearchBarName(null);
        }
        else{
            this.setPSSysSearchBarId(pSSysSearchBar.getPSSysSearchBarId());
            this.setPSSysSearchBarName(pSSysSearchBar.getPSSysSearchBarName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARNAME</B>&nbsp;搜索栏
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHBARID}
     */
    public final static String FIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";

    /**
     * 设置 搜索栏
     * 
     * @param pSSysSearchBarName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHBARNAME)
    public void setPSSysSearchBarName(String pSSysSearchBarName){
        this.set(FIELD_PSSYSSEARCHBARNAME, pSSysSearchBarName);
    }
    
    /**
     * 获取 搜索栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchBarName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchBarNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索栏
     */
    @JsonIgnore
    public void resetPSSysSearchBarName(){
        this.reset(FIELD_PSSYSSEARCHBARNAME);
    }

    /**
     * 设置 搜索栏
     * <P>
     * 等同 {@link #setPSSysSearchBarName}
     * @param pSSysSearchBarName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssyssearchbarname(String pSSysSearchBarName){
        this.setPSSysSearchBarName(pSSysSearchBarName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;视图面板，指定面板成员所在的面板部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 视图面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 视图面板  
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
     * 判断 视图面板 是否指定值，包括空值
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
     * 重置 视图面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 视图面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 视图面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setMobFlag(null);
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setMobFlag(pSSysViewPanel.getMobFlag());
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELITEMID</B>&nbsp;系统面板成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVIEWPANELITEMID = "pssysviewpanelitemid";

    /**
     * 设置 系统面板成员标识
     * 
     * @param pSSysViewPanelItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMID)
    public void setPSSysViewPanelItemId(String pSSysViewPanelItemId){
        this.set(FIELD_PSSYSVIEWPANELITEMID, pSSysViewPanelItemId);
    }
    
    /**
     * 获取 系统面板成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelItemId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统面板成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelItemIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统面板成员标识
     */
    @JsonIgnore
    public void resetPSSysViewPanelItemId(){
        this.reset(FIELD_PSSYSVIEWPANELITEMID);
    }

    /**
     * 设置 系统面板成员标识
     * <P>
     * 等同 {@link #setPSSysViewPanelItemId}
     * @param pSSysViewPanelItemId
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysviewpanelitemid(String pSSysViewPanelItemId){
        this.setPSSysViewPanelItemId(pSSysViewPanelItemId);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELITEMNAME</B>&nbsp;名称，指定面板成员的名称，需在所在面板部件中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSVIEWPANELITEMNAME = "pssysviewpanelitemname";

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSSYSVIEWPANELITEMNAME}
     * 
     * @param pSSysViewPanelItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMNAME)
    public void setPSSysViewPanelItemName(String pSSysViewPanelItemName){
        this.set(FIELD_PSSYSVIEWPANELITEMNAME, pSSysViewPanelItemName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelItemName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELITEMNAME);
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
    public boolean isPSSysViewPanelItemNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSSysViewPanelItemName(){
        this.reset(FIELD_PSSYSVIEWPANELITEMNAME);
    }

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSSYSVIEWPANELITEMNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelItemName}
     * @param pSSysViewPanelItemName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysviewpanelitemname(String pSSysViewPanelItemName){
        this.setPSSysViewPanelItemName(pSSysViewPanelItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysViewPanelItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysViewPanelItemName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelItem name(String strName){
        this.setPSSysViewPanelItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;视图面板，指定面板成员所在的面板部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 视图面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 视图面板  
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
     * 判断 视图面板 是否指定值，包括空值
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
     * 重置 视图面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 视图面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSSysViewPanelItem pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSSysViewPanelItem rawcontent(String rawContent){
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
    public PSSysViewPanelItem rawcssstyle(String rawCssStyle){
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
    public PSSysViewPanelItem rawservicemethod(String rawServiceMethod){
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
    public PSSysViewPanelItem rawservicemethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod rawServiceMethod){
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
    public PSSysViewPanelItem rawserviceurl(String rawServiceUrl){
        this.setRawServiceUrl(rawServiceUrl);
        return this;
    }

    /**
     * <B>READONLYMODE</B>&nbsp;只读模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_READONLYMODE = "readonlymode";

    /**
     * 设置 只读模式
     * 
     * @param readOnlyMode
     * 
     */
    @JsonProperty(FIELD_READONLYMODE)
    public void setReadOnlyMode(Integer readOnlyMode){
        this.set(FIELD_READONLYMODE, readOnlyMode);
    }
    
    /**
     * 获取 只读模式  
     * @return
     */
    @JsonIgnore
    public Integer getReadOnlyMode(){
        Object objValue = this.get(FIELD_READONLYMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 只读模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadOnlyModeDirty(){
        if(this.contains(FIELD_READONLYMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只读模式
     */
    @JsonIgnore
    public void resetReadOnlyMode(){
        this.reset(FIELD_READONLYMODE);
    }

    /**
     * 设置 只读模式
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSSysViewPanelItem readonlymode(Integer readOnlyMode){
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

     /**
     * 设置 只读模式
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSSysViewPanelItem readonlymode(Boolean readOnlyMode){
        if(readOnlyMode == null){
            this.setReadOnlyMode(null);
        }
        else{
            this.setReadOnlyMode(readOnlyMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>REFCTRL2NAME</B>&nbsp;引用控件2名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFCTRL2NAME = "refctrl2name";

    /**
     * 设置 引用控件2名称
     * 
     * @param refCtrl2Name
     * 
     */
    @JsonProperty(FIELD_REFCTRL2NAME)
    public void setRefCtrl2Name(String refCtrl2Name){
        this.set(FIELD_REFCTRL2NAME, refCtrl2Name);
    }
    
    /**
     * 获取 引用控件2名称  
     * @return
     */
    @JsonIgnore
    public String getRefCtrl2Name(){
        Object objValue = this.get(FIELD_REFCTRL2NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用控件2名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCtrl2NameDirty(){
        if(this.contains(FIELD_REFCTRL2NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用控件2名称
     */
    @JsonIgnore
    public void resetRefCtrl2Name(){
        this.reset(FIELD_REFCTRL2NAME);
    }

    /**
     * 设置 引用控件2名称
     * <P>
     * 等同 {@link #setRefCtrl2Name}
     * @param refCtrl2Name
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrl2name(String refCtrl2Name){
        this.setRefCtrl2Name(refCtrl2Name);
        return this;
    }

    /**
     * <B>REFCTRL2USAGE</B>&nbsp;引用部件2用途
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewCtrlRefUsageAll} 
     */
    public final static String FIELD_REFCTRL2USAGE = "refctrl2usage";

    /**
     * 设置 引用部件2用途
     * 
     * @param refCtrl2Usage
     * 
     */
    @JsonProperty(FIELD_REFCTRL2USAGE)
    public void setRefCtrl2Usage(String refCtrl2Usage){
        this.set(FIELD_REFCTRL2USAGE, refCtrl2Usage);
    }
    
    /**
     * 获取 引用部件2用途  
     * @return
     */
    @JsonIgnore
    public String getRefCtrl2Usage(){
        Object objValue = this.get(FIELD_REFCTRL2USAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用部件2用途 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCtrl2UsageDirty(){
        if(this.contains(FIELD_REFCTRL2USAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用部件2用途
     */
    @JsonIgnore
    public void resetRefCtrl2Usage(){
        this.reset(FIELD_REFCTRL2USAGE);
    }

    /**
     * 设置 引用部件2用途
     * <P>
     * 等同 {@link #setRefCtrl2Usage}
     * @param refCtrl2Usage
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrl2usage(String refCtrl2Usage){
        this.setRefCtrl2Usage(refCtrl2Usage);
        return this;
    }

     /**
     * 设置 引用部件2用途
     * <P>
     * 等同 {@link #setRefCtrl2Usage}
     * @param refCtrl2Usage
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrl2usage(net.ibizsys.psmodel.core.util.PSModelEnums.ViewCtrlRefUsageAll refCtrl2Usage){
        if(refCtrl2Usage == null){
            this.setRefCtrl2Usage(null);
        }
        else{
            this.setRefCtrl2Usage(refCtrl2Usage.value);
        }
        return this;
    }

    /**
     * <B>REFCTRL2USAGETEXT</B>&nbsp;引用部件2用途
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFCTRL2USAGETEXT = "refctrl2usagetext";

    /**
     * 设置 引用部件2用途
     * 
     * @param refCtrl2UsageText
     * 
     */
    @JsonProperty(FIELD_REFCTRL2USAGETEXT)
    public void setRefCtrl2UsageText(String refCtrl2UsageText){
        this.set(FIELD_REFCTRL2USAGETEXT, refCtrl2UsageText);
    }
    
    /**
     * 获取 引用部件2用途  
     * @return
     */
    @JsonIgnore
    public String getRefCtrl2UsageText(){
        Object objValue = this.get(FIELD_REFCTRL2USAGETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用部件2用途 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCtrl2UsageTextDirty(){
        if(this.contains(FIELD_REFCTRL2USAGETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用部件2用途
     */
    @JsonIgnore
    public void resetRefCtrl2UsageText(){
        this.reset(FIELD_REFCTRL2USAGETEXT);
    }

    /**
     * 设置 引用部件2用途
     * <P>
     * 等同 {@link #setRefCtrl2UsageText}
     * @param refCtrl2UsageText
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrl2usagetext(String refCtrl2UsageText){
        this.setRefCtrl2UsageText(refCtrl2UsageText);
        return this;
    }

    /**
     * <B>REFCTRLNAME</B>&nbsp;引用控件名称
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFCTRLNAME = "refctrlname";

    /**
     * 设置 引用控件名称
     * 
     * @param refCtrlName
     * 
     */
    @JsonProperty(FIELD_REFCTRLNAME)
    public void setRefCtrlName(String refCtrlName){
        this.set(FIELD_REFCTRLNAME, refCtrlName);
    }
    
    /**
     * 获取 引用控件名称  
     * @return
     */
    @JsonIgnore
    public String getRefCtrlName(){
        Object objValue = this.get(FIELD_REFCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用控件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCtrlNameDirty(){
        if(this.contains(FIELD_REFCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用控件名称
     */
    @JsonIgnore
    public void resetRefCtrlName(){
        this.reset(FIELD_REFCTRLNAME);
    }

    /**
     * 设置 引用控件名称
     * <P>
     * 等同 {@link #setRefCtrlName}
     * @param refCtrlName
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrlname(String refCtrlName){
        this.setRefCtrlName(refCtrlName);
        return this;
    }

    /**
     * <B>REFCTRLUSAGE</B>&nbsp;挂载界面引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ViewCtrlRefUsageAll} 
     */
    public final static String FIELD_REFCTRLUSAGE = "refctrlusage";

    /**
     * 设置 挂载界面引擎
     * 
     * @param refCtrlUsage
     * 
     */
    @JsonProperty(FIELD_REFCTRLUSAGE)
    public void setRefCtrlUsage(String refCtrlUsage){
        this.set(FIELD_REFCTRLUSAGE, refCtrlUsage);
    }
    
    /**
     * 获取 挂载界面引擎  
     * @return
     */
    @JsonIgnore
    public String getRefCtrlUsage(){
        Object objValue = this.get(FIELD_REFCTRLUSAGE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 挂载界面引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCtrlUsageDirty(){
        if(this.contains(FIELD_REFCTRLUSAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 挂载界面引擎
     */
    @JsonIgnore
    public void resetRefCtrlUsage(){
        this.reset(FIELD_REFCTRLUSAGE);
    }

    /**
     * 设置 挂载界面引擎
     * <P>
     * 等同 {@link #setRefCtrlUsage}
     * @param refCtrlUsage
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrlusage(String refCtrlUsage){
        this.setRefCtrlUsage(refCtrlUsage);
        return this;
    }

     /**
     * 设置 挂载界面引擎
     * <P>
     * 等同 {@link #setRefCtrlUsage}
     * @param refCtrlUsage
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrlusage(net.ibizsys.psmodel.core.util.PSModelEnums.ViewCtrlRefUsageAll refCtrlUsage){
        if(refCtrlUsage == null){
            this.setRefCtrlUsage(null);
        }
        else{
            this.setRefCtrlUsage(refCtrlUsage.value);
        }
        return this;
    }

    /**
     * <B>REFCTRLUSAGETEXT</B>&nbsp;引用部件用途
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFCTRLUSAGETEXT = "refctrlusagetext";

    /**
     * 设置 引用部件用途
     * 
     * @param refCtrlUsageText
     * 
     */
    @JsonProperty(FIELD_REFCTRLUSAGETEXT)
    public void setRefCtrlUsageText(String refCtrlUsageText){
        this.set(FIELD_REFCTRLUSAGETEXT, refCtrlUsageText);
    }
    
    /**
     * 获取 引用部件用途  
     * @return
     */
    @JsonIgnore
    public String getRefCtrlUsageText(){
        Object objValue = this.get(FIELD_REFCTRLUSAGETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用部件用途 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefCtrlUsageTextDirty(){
        if(this.contains(FIELD_REFCTRLUSAGETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用部件用途
     */
    @JsonIgnore
    public void resetRefCtrlUsageText(){
        this.reset(FIELD_REFCTRLUSAGETEXT);
    }

    /**
     * 设置 引用部件用途
     * <P>
     * 等同 {@link #setRefCtrlUsageText}
     * @param refCtrlUsageText
     */
    @JsonIgnore
    public PSSysViewPanelItem refctrlusagetext(String refCtrlUsageText){
        this.setRefCtrlUsageText(refCtrlUsageText);
        return this;
    }

    /**
     * <B>REFLINKPSDEVIEWID</B>&nbsp;引用实体链接视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFLINKPSDEVIEWID = "reflinkpsdeviewid";

    /**
     * 设置 引用实体链接视图
     * 
     * @param refLinkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFLINKPSDEVIEWID)
    public void setRefLinkPSDEViewId(String refLinkPSDEViewId){
        this.set(FIELD_REFLINKPSDEVIEWID, refLinkPSDEViewId);
    }
    
    /**
     * 获取 引用实体链接视图  
     * @return
     */
    @JsonIgnore
    public String getRefLinkPSDEViewId(){
        Object objValue = this.get(FIELD_REFLINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_REFLINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体链接视图
     */
    @JsonIgnore
    public void resetRefLinkPSDEViewId(){
        this.reset(FIELD_REFLINKPSDEVIEWID);
    }

    /**
     * 设置 引用实体链接视图
     * <P>
     * 等同 {@link #setRefLinkPSDEViewId}
     * @param refLinkPSDEViewId
     */
    @JsonIgnore
    public PSSysViewPanelItem reflinkpsdeviewid(String refLinkPSDEViewId){
        this.setRefLinkPSDEViewId(refLinkPSDEViewId);
        return this;
    }

    /**
     * 设置 引用实体链接视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem reflinkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefLinkPSDEViewId(null);
            this.setRefLinkPSDEViewName(null);
        }
        else{
            this.setRefLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFLINKPSDEVIEWNAME</B>&nbsp;引用实体链接视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFLINKPSDEVIEWID}
     */
    public final static String FIELD_REFLINKPSDEVIEWNAME = "reflinkpsdeviewname";

    /**
     * 设置 引用实体链接视图
     * 
     * @param refLinkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFLINKPSDEVIEWNAME)
    public void setRefLinkPSDEViewName(String refLinkPSDEViewName){
        this.set(FIELD_REFLINKPSDEVIEWNAME, refLinkPSDEViewName);
    }
    
    /**
     * 获取 引用实体链接视图  
     * @return
     */
    @JsonIgnore
    public String getRefLinkPSDEViewName(){
        Object objValue = this.get(FIELD_REFLINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体链接视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_REFLINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体链接视图
     */
    @JsonIgnore
    public void resetRefLinkPSDEViewName(){
        this.reset(FIELD_REFLINKPSDEVIEWNAME);
    }

    /**
     * 设置 引用实体链接视图
     * <P>
     * 等同 {@link #setRefLinkPSDEViewName}
     * @param refLinkPSDEViewName
     */
    @JsonIgnore
    public PSSysViewPanelItem reflinkpsdeviewname(String refLinkPSDEViewName){
        this.setRefLinkPSDEViewName(refLinkPSDEViewName);
        return this;
    }

    /**
     * <B>REFPICKUPPSDEVIEWID</B>&nbsp;引用实体选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFPICKUPPSDEVIEWID = "refpickuppsdeviewid";

    /**
     * 设置 引用实体选择视图
     * 
     * @param refPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFPICKUPPSDEVIEWID)
    public void setRefPickupPSDEViewId(String refPickupPSDEViewId){
        this.set(FIELD_REFPICKUPPSDEVIEWID, refPickupPSDEViewId);
    }
    
    /**
     * 获取 引用实体选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体选择视图
     */
    @JsonIgnore
    public void resetRefPickupPSDEViewId(){
        this.reset(FIELD_REFPICKUPPSDEVIEWID);
    }

    /**
     * 设置 引用实体选择视图
     * <P>
     * 等同 {@link #setRefPickupPSDEViewId}
     * @param refPickupPSDEViewId
     */
    @JsonIgnore
    public PSSysViewPanelItem refpickuppsdeviewid(String refPickupPSDEViewId){
        this.setRefPickupPSDEViewId(refPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 引用实体选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelItem refpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefPickupPSDEViewId(null);
            this.setRefPickupPSDEViewName(null);
        }
        else{
            this.setRefPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFPICKUPPSDEVIEWNAME</B>&nbsp;引用实体选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFPICKUPPSDEVIEWNAME = "refpickuppsdeviewname";

    /**
     * 设置 引用实体选择视图
     * 
     * @param refPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFPICKUPPSDEVIEWNAME)
    public void setRefPickupPSDEViewName(String refPickupPSDEViewName){
        this.set(FIELD_REFPICKUPPSDEVIEWNAME, refPickupPSDEViewName);
    }
    
    /**
     * 获取 引用实体选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体选择视图
     */
    @JsonIgnore
    public void resetRefPickupPSDEViewName(){
        this.reset(FIELD_REFPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 引用实体选择视图
     * <P>
     * 等同 {@link #setRefPickupPSDEViewName}
     * @param refPickupPSDEViewName
     */
    @JsonIgnore
    public PSSysViewPanelItem refpickuppsdeviewname(String refPickupPSDEViewName){
        this.setRefPickupPSDEViewName(refPickupPSDEViewName);
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
    public PSSysViewPanelItem refpsdeacmodeid(String refPSDEACModeId){
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
    public PSSysViewPanelItem refpsdeacmodeid(PSDEACMode pSDEACMode){
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
    public PSSysViewPanelItem refpsdeacmodename(String refPSDEACModeName){
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
    public PSSysViewPanelItem refpsdedatasetid(String refPSDEDataSetId){
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
    public PSSysViewPanelItem refpsdedatasetid(PSDEDataSet pSDEDataSet){
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
    public PSSysViewPanelItem refpsdedatasetname(String refPSDEDataSetName){
        this.setRefPSDEDataSetName(refPSDEDataSetName);
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
    public PSSysViewPanelItem refpsdeid(String refPSDEId){
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
    public PSSysViewPanelItem refpsdeid(PSDataEntity pSDataEntity){
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
    public PSSysViewPanelItem refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
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
    public PSSysViewPanelItem rendermode(String renderMode){
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
    public PSSysViewPanelItem rendermodetext(String renderModeText){
        this.setRenderModeText(renderModeText);
        return this;
    }

    /**
     * <B>RESETITEMNAME</B>&nbsp;重置项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_RESETITEMNAME = "resetitemname";

    /**
     * 设置 重置项名称
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
     * 设置 重置项名称
     * <P>
     * 等同 {@link #setResetItemName}
     * @param resetItemName
     */
    @JsonIgnore
    public PSSysViewPanelItem resetitemname(String resetItemName){
        this.setResetItemName(resetItemName);
        return this;
    }

    /**
     * <B>RIGHTPOS</B>&nbsp;右侧位置
     */
    public final static String FIELD_RIGHTPOS = "rightpos";

    /**
     * 设置 右侧位置
     * 
     * @param rightPos
     * 
     */
    @JsonProperty(FIELD_RIGHTPOS)
    public void setRightPos(Integer rightPos){
        this.set(FIELD_RIGHTPOS, rightPos);
    }
    
    /**
     * 获取 右侧位置  
     * @return
     */
    @JsonIgnore
    public Integer getRightPos(){
        Object objValue = this.get(FIELD_RIGHTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 右侧位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRightPosDirty(){
        if(this.contains(FIELD_RIGHTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 右侧位置
     */
    @JsonIgnore
    public void resetRightPos(){
        this.reset(FIELD_RIGHTPOS);
    }

    /**
     * 设置 右侧位置
     * <P>
     * 等同 {@link #setRightPos}
     * @param rightPos
     */
    @JsonIgnore
    public PSSysViewPanelItem rightpos(Integer rightPos){
        this.setRightPos(rightPos);
        return this;
    }

    /**
     * <B>ROWSPAN</B>&nbsp;行数，面板成员父容器布局模式为【表格布局】时指定成员的占位行数，未定义时为【1】
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
    public PSSysViewPanelItem rowspan(Integer rowSpan){
        this.setRowSpan(rowSpan);
        return this;
    }

    /**
     * <B>SHOWCAPTION</B>&nbsp;显示标题，指定面板成员是否显示标题，未定义时为【是】
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
    public PSSysViewPanelItem showcaption(Integer showCaption){
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
    public PSSysViewPanelItem showcaption(Boolean showCaption){
        if(showCaption == null){
            this.setShowCaption(null);
        }
        else{
            this.setShowCaption(showCaption?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysViewPanelItem spacingbottom(String spacingBottom){
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
    public PSSysViewPanelItem spacingbottom(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingBottom){
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
    public PSSysViewPanelItem spacingleft(String spacingLeft){
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
    public PSSysViewPanelItem spacingleft(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingLeft){
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
    public PSSysViewPanelItem spacingright(String spacingRight){
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
    public PSSysViewPanelItem spacingright(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingRight){
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
    public PSSysViewPanelItem spacingtop(String spacingTop){
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
    public PSSysViewPanelItem spacingtop(net.ibizsys.psmodel.core.util.PSModelEnums.SpacingMode spacingTop){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WrapMode} 
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
    public PSSysViewPanelItem swapmode(String swapMode){
        this.setSwapMode(swapMode);
        return this;
    }

     /**
     * 设置 内容换行模式
     * <P>
     * 等同 {@link #setSwapMode}
     * @param swapMode
     */
    @JsonIgnore
    public PSSysViewPanelItem swapmode(net.ibizsys.psmodel.core.util.PSModelEnums.WrapMode swapMode){
        if(swapMode == null){
            this.setSwapMode(null);
        }
        else{
            this.setSwapMode(swapMode.value);
        }
        return this;
    }

    /**
     * <B>TABINDEX</B>&nbsp;TabIndex
     */
    public final static String FIELD_TABINDEX = "tabindex";

    /**
     * 设置 TabIndex
     * 
     * @param tabIndex
     * 
     */
    @JsonProperty(FIELD_TABINDEX)
    public void setTabIndex(Integer tabIndex){
        this.set(FIELD_TABINDEX, tabIndex);
    }
    
    /**
     * 获取 TabIndex  
     * @return
     */
    @JsonIgnore
    public Integer getTabIndex(){
        Object objValue = this.get(FIELD_TABINDEX);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 TabIndex 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTabIndexDirty(){
        if(this.contains(FIELD_TABINDEX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 TabIndex
     */
    @JsonIgnore
    public void resetTabIndex(){
        this.reset(FIELD_TABINDEX);
    }

    /**
     * 设置 TabIndex
     * <P>
     * 等同 {@link #setTabIndex}
     * @param tabIndex
     */
    @JsonIgnore
    public PSSysViewPanelItem tabindex(Integer tabIndex){
        this.setTabIndex(tabIndex);
        return this;
    }

    /**
     * <B>TARGETID</B>&nbsp;目标标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TARGETID = "targetid";

    /**
     * 设置 目标标识
     * 
     * @param targetId
     * 
     */
    @JsonProperty(FIELD_TARGETID)
    public void setTargetId(String targetId){
        this.set(FIELD_TARGETID, targetId);
    }
    
    /**
     * 获取 目标标识  
     * @return
     */
    @JsonIgnore
    public String getTargetId(){
        Object objValue = this.get(FIELD_TARGETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetIdDirty(){
        if(this.contains(FIELD_TARGETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识
     */
    @JsonIgnore
    public void resetTargetId(){
        this.reset(FIELD_TARGETID);
    }

    /**
     * 设置 目标标识
     * <P>
     * 等同 {@link #setTargetId}
     * @param targetId
     */
    @JsonIgnore
    public PSSysViewPanelItem targetid(String targetId){
        this.setTargetId(targetId);
        return this;
    }

    /**
     * <B>TARGETNAME</B>&nbsp;目标名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TARGETNAME = "targetname";

    /**
     * 设置 目标名称
     * 
     * @param targetName
     * 
     */
    @JsonProperty(FIELD_TARGETNAME)
    public void setTargetName(String targetName){
        this.set(FIELD_TARGETNAME, targetName);
    }
    
    /**
     * 获取 目标名称  
     * @return
     */
    @JsonIgnore
    public String getTargetName(){
        Object objValue = this.get(FIELD_TARGETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetNameDirty(){
        if(this.contains(FIELD_TARGETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标名称
     */
    @JsonIgnore
    public void resetTargetName(){
        this.reset(FIELD_TARGETNAME);
    }

    /**
     * 设置 目标名称
     * <P>
     * 等同 {@link #setTargetName}
     * @param targetName
     */
    @JsonIgnore
    public PSSysViewPanelItem targetname(String targetName){
        this.setTargetName(targetName);
        return this;
    }

    /**
     * <B>TARGETTYPE</B>&nbsp;目标类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_TARGETTYPE = "targettype";

    /**
     * 设置 目标类型
     * 
     * @param targetType
     * 
     */
    @JsonProperty(FIELD_TARGETTYPE)
    public void setTargetType(String targetType){
        this.set(FIELD_TARGETTYPE, targetType);
    }
    
    /**
     * 获取 目标类型  
     * @return
     */
    @JsonIgnore
    public String getTargetType(){
        Object objValue = this.get(FIELD_TARGETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypeDirty(){
        if(this.contains(FIELD_TARGETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型
     */
    @JsonIgnore
    public void resetTargetType(){
        this.reset(FIELD_TARGETTYPE);
    }

    /**
     * 设置 目标类型
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSSysViewPanelItem targettype(String targetType){
        this.setTargetType(targetType);
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
    public PSSysViewPanelItem templatemode(Integer templateMode){
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
    public PSSysViewPanelItem templatemode(Boolean templateMode){
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
    public PSSysViewPanelItem tippslanresid(String tipPSLanResId){
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
    public PSSysViewPanelItem tippslanresid(PSLanguageRes pSLanguageRes){
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
    public PSSysViewPanelItem tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TITLEBARCLOSEMODE</B>&nbsp;标题栏关闭模式，指定面板容器分组标题栏关闭模式，未定义时为【无关闭】
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
    public PSSysViewPanelItem titlebarclosemode(Integer titleBarCloseMode){
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
    public PSSysViewPanelItem titlebarclosemode(net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode){
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
    public PSSysViewPanelItem togglemode(String toggleMode){
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
    public PSSysViewPanelItem tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    /**
     * <B>TOPPOS</B>&nbsp;上方位置
     */
    public final static String FIELD_TOPPOS = "toppos";

    /**
     * 设置 上方位置
     * 
     * @param topPos
     * 
     */
    @JsonProperty(FIELD_TOPPOS)
    public void setTopPos(Integer topPos){
        this.set(FIELD_TOPPOS, topPos);
    }
    
    /**
     * 获取 上方位置  
     * @return
     */
    @JsonIgnore
    public Integer getTopPos(){
        Object objValue = this.get(FIELD_TOPPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 上方位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopPosDirty(){
        if(this.contains(FIELD_TOPPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上方位置
     */
    @JsonIgnore
    public void resetTopPos(){
        this.reset(FIELD_TOPPOS);
    }

    /**
     * 设置 上方位置
     * <P>
     * 等同 {@link #setTopPos}
     * @param topPos
     */
    @JsonIgnore
    public PSSysViewPanelItem toppos(Integer topPos){
        this.setTopPos(topPos);
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
    public PSSysViewPanelItem updatedate(String updateDate){
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
    public PSSysViewPanelItem updateman(String updateMan){
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
    public PSSysViewPanelItem usertag(String userTag){
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
    public PSSysViewPanelItem usertag2(String userTag2){
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
    public PSSysViewPanelItem valign(String vAlign){
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
    public PSSysViewPanelItem valign(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlign){
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
    public PSSysViewPanelItem valignself(String vAlignSelf){
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
    public PSSysViewPanelItem valignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlignSelf){
        if(vAlignSelf == null){
            this.setVAlignSelf(null);
        }
        else{
            this.setVAlignSelf(vAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定面板属性项的值格式化串
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
    public PSSysViewPanelItem valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUEITEMNAME</B>&nbsp;值项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VALUEITEMNAME = "valueitemname";

    /**
     * 设置 值项名称
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
     * 设置 值项名称
     * <P>
     * 等同 {@link #setValueItemName}
     * @param valueItemName
     */
    @JsonIgnore
    public PSSysViewPanelItem valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定面板成员的宽度，0为自适应容器宽度，未定义时为【0】
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
    public PSSysViewPanelItem width(Integer width){
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
    public PSSysViewPanelItem widthmode(String widthMode){
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
    public PSSysViewPanelItem widthmode(net.ibizsys.psmodel.core.util.PSModelEnums.WidthMode widthMode){
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
        return this.getPSSysViewPanelItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysViewPanelItemId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelItem id(String strValue){
        this.setPSSysViewPanelItemId(strValue);
        return this;
    }


    /**
     *  系统面板成员 成员集合
     */
    public final static String FIELD_PSSYSVIEWPANELITEMS = "pssysviewpanelitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysViewPanelItem> pssysviewpanelitems;

    /**
     * 获取 系统面板成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysViewPanelItem> getPSSysViewPanelItems(){
        return this.pssysviewpanelitems;
    }

    /**
     * 设置 系统面板成员 成员集合  
     * @param pssysviewpanelitems
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMS)
    public void setPSSysViewPanelItems(java.util.List<net.ibizsys.psmodel.core.domain.PSSysViewPanelItem> pssysviewpanelitems){
        this.pssysviewpanelitems = pssysviewpanelitems;
    }

    /**
     * 获取 系统面板成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysViewPanelItem> getPSSysViewPanelItemsIf(){
        if(this.pssysviewpanelitems == null){
            this.pssysviewpanelitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysViewPanelItem>();          
        }
        return this.pssysviewpanelitems;
    }


    /**
     *  面板项逻辑 成员集合
     */
    public final static String FIELD_PSPANELITEMLOGICS = "pspanelitemlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSPanelItemLogic> pspanelitemlogics;

    /**
     * 获取 面板项逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSPANELITEMLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSPanelItemLogic> getPSPanelItemLogics(){
        return this.pspanelitemlogics;
    }

    /**
     * 设置 面板项逻辑 成员集合  
     * @param pspanelitemlogics
     */
    @JsonProperty(FIELD_PSPANELITEMLOGICS)
    public void setPSPanelItemLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSPanelItemLogic> pspanelitemlogics){
        this.pspanelitemlogics = pspanelitemlogics;
    }

    /**
     * 获取 面板项逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSPanelItemLogic> getPSPanelItemLogicsIf(){
        if(this.pspanelitemlogics == null){
            this.pspanelitemlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSPanelItemLogic>();          
        }
        return this.pspanelitemlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysViewPanelItem){
            PSSysViewPanelItem model = (PSSysViewPanelItem)iPSModel;
            model.setPSSysViewPanelItems(this.getPSSysViewPanelItems());
            model.setPSPanelItemLogics(this.getPSPanelItemLogics());
        }
        super.copyTo(iPSModel);
    }
}
