package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEVIEWCTRL</B>实体视图部件 模型传输对象
 * <P>
 * 实体视图的部件成员模型，将系统或实体定义的界面部件挂接到视图，并指定相应的参数。要注意，视图部件的配置优先于部件自身定义的默认配置
 */
public class PSDEViewCtrlDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEViewCtrlDTO(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定视图部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
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
    public PSDEViewCtrlDTO adpsdelogicid(String aDPSDELogicId){
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
    public PSDEViewCtrlDTO adpsdelogicid(PSDELogicDTO pSDELogic){
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
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定视图部件使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
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
    public PSDEViewCtrlDTO adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
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
    public PSDEViewCtrlDTO bottompos(Integer bottomPos){
        this.setBottomPos(bottomPos);
        return this;
    }

    /**
     * <B>BTNACTIONTYPE</B>&nbsp;按钮行为类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.FormButtonActionType} 
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
    public PSDEViewCtrlDTO btnactiontype(String btnActionType){
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
    public PSDEViewCtrlDTO btnactiontype(net.ibizsys.model.PSModelEnums.FormButtonActionType btnActionType){
        if(btnActionType == null){
            this.setBtnActionType(null);
        }
        else{
            this.setBtnActionType(btnActionType.value);
        }
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示，指定界面部件在发送请求到接受反馈这段时间是否显示【处理中】等加载信息，未定义时为【是】
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
    public PSDEViewCtrlDTO busyindicator(Integer busyIndicator){
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
    public PSDEViewCtrlDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定部件的标题多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
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
    public PSDEViewCtrlDTO cappslanresid(String capPSLanResId){
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
    public PSDEViewCtrlDTO cappslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定部件的标题多语言资源对象
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
    public PSDEViewCtrlDTO cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定部件的标题
     * <P>
     * 字符串：最大长度 200
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
    public PSDEViewCtrlDTO caption(String caption){
        this.setCaption(caption);
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
    public PSDEViewCtrlDTO createdate(Timestamp createDate){
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
    public PSDEViewCtrlDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLPARAM</B>&nbsp;控件参数，指定控件参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM = "ctrlparam";

    /**
     * 设置 控件参数，详细说明：{@link #FIELD_CTRLPARAM}
     * 
     * @param ctrlParam
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM)
    public void setCtrlParam(String ctrlParam){
        this.set(FIELD_CTRLPARAM, ctrlParam);
    }
    
    /**
     * 获取 控件参数  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam(){
        Object objValue = this.get(FIELD_CTRLPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParamDirty(){
        if(this.contains(FIELD_CTRLPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数
     */
    @JsonIgnore
    public void resetCtrlParam(){
        this.reset(FIELD_CTRLPARAM);
    }

    /**
     * 设置 控件参数，详细说明：{@link #FIELD_CTRLPARAM}
     * <P>
     * 等同 {@link #setCtrlParam}
     * @param ctrlParam
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam(String ctrlParam){
        this.setCtrlParam(ctrlParam);
        return this;
    }

    /**
     * <B>CTRLPARAM10</B>&nbsp;控件参数10，指定控件参数10
     */
    public final static String FIELD_CTRLPARAM10 = "ctrlparam10";

    /**
     * 设置 控件参数10，详细说明：{@link #FIELD_CTRLPARAM10}
     * 
     * @param ctrlParam10
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM10)
    public void setCtrlParam10(Double ctrlParam10){
        this.set(FIELD_CTRLPARAM10, ctrlParam10);
    }
    
    /**
     * 获取 控件参数10  
     * @return
     */
    @JsonIgnore
    public Double getCtrlParam10(){
        Object objValue = this.get(FIELD_CTRLPARAM10);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 控件参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam10Dirty(){
        if(this.contains(FIELD_CTRLPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数10
     */
    @JsonIgnore
    public void resetCtrlParam10(){
        this.reset(FIELD_CTRLPARAM10);
    }

    /**
     * 设置 控件参数10，详细说明：{@link #FIELD_CTRLPARAM10}
     * <P>
     * 等同 {@link #setCtrlParam10}
     * @param ctrlParam10
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam10(Double ctrlParam10){
        this.setCtrlParam10(ctrlParam10);
        return this;
    }

    /**
     * <B>CTRLPARAM11</B>&nbsp;控件参数11，指定控件参数11
     */
    public final static String FIELD_CTRLPARAM11 = "ctrlparam11";

    /**
     * 设置 控件参数11，详细说明：{@link #FIELD_CTRLPARAM11}
     * 
     * @param ctrlParam11
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM11)
    public void setCtrlParam11(Integer ctrlParam11){
        this.set(FIELD_CTRLPARAM11, ctrlParam11);
    }
    
    /**
     * 获取 控件参数11  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam11(){
        Object objValue = this.get(FIELD_CTRLPARAM11);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam11Dirty(){
        if(this.contains(FIELD_CTRLPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数11
     */
    @JsonIgnore
    public void resetCtrlParam11(){
        this.reset(FIELD_CTRLPARAM11);
    }

    /**
     * 设置 控件参数11，详细说明：{@link #FIELD_CTRLPARAM11}
     * <P>
     * 等同 {@link #setCtrlParam11}
     * @param ctrlParam11
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam11(Integer ctrlParam11){
        this.setCtrlParam11(ctrlParam11);
        return this;
    }

    /**
     * <B>CTRLPARAM12</B>&nbsp;控件参数12，指定控件参数12
     */
    public final static String FIELD_CTRLPARAM12 = "ctrlparam12";

    /**
     * 设置 控件参数12，详细说明：{@link #FIELD_CTRLPARAM12}
     * 
     * @param ctrlParam12
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM12)
    public void setCtrlParam12(Integer ctrlParam12){
        this.set(FIELD_CTRLPARAM12, ctrlParam12);
    }
    
    /**
     * 获取 控件参数12  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam12(){
        Object objValue = this.get(FIELD_CTRLPARAM12);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam12Dirty(){
        if(this.contains(FIELD_CTRLPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数12
     */
    @JsonIgnore
    public void resetCtrlParam12(){
        this.reset(FIELD_CTRLPARAM12);
    }

    /**
     * 设置 控件参数12，详细说明：{@link #FIELD_CTRLPARAM12}
     * <P>
     * 等同 {@link #setCtrlParam12}
     * @param ctrlParam12
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam12(Integer ctrlParam12){
        this.setCtrlParam12(ctrlParam12);
        return this;
    }

    /**
     * <B>CTRLPARAM2</B>&nbsp;控件参数2，指定控件参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM2 = "ctrlparam2";

    /**
     * 设置 控件参数2，详细说明：{@link #FIELD_CTRLPARAM2}
     * 
     * @param ctrlParam2
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM2)
    public void setCtrlParam2(String ctrlParam2){
        this.set(FIELD_CTRLPARAM2, ctrlParam2);
    }
    
    /**
     * 获取 控件参数2  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam2(){
        Object objValue = this.get(FIELD_CTRLPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam2Dirty(){
        if(this.contains(FIELD_CTRLPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数2
     */
    @JsonIgnore
    public void resetCtrlParam2(){
        this.reset(FIELD_CTRLPARAM2);
    }

    /**
     * 设置 控件参数2，详细说明：{@link #FIELD_CTRLPARAM2}
     * <P>
     * 等同 {@link #setCtrlParam2}
     * @param ctrlParam2
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam2(String ctrlParam2){
        this.setCtrlParam2(ctrlParam2);
        return this;
    }

    /**
     * <B>CTRLPARAM3</B>&nbsp;控件参数3，指定控件参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM3 = "ctrlparam3";

    /**
     * 设置 控件参数3，详细说明：{@link #FIELD_CTRLPARAM3}
     * 
     * @param ctrlParam3
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM3)
    public void setCtrlParam3(String ctrlParam3){
        this.set(FIELD_CTRLPARAM3, ctrlParam3);
    }
    
    /**
     * 获取 控件参数3  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam3(){
        Object objValue = this.get(FIELD_CTRLPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam3Dirty(){
        if(this.contains(FIELD_CTRLPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数3
     */
    @JsonIgnore
    public void resetCtrlParam3(){
        this.reset(FIELD_CTRLPARAM3);
    }

    /**
     * 设置 控件参数3，详细说明：{@link #FIELD_CTRLPARAM3}
     * <P>
     * 等同 {@link #setCtrlParam3}
     * @param ctrlParam3
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam3(String ctrlParam3){
        this.setCtrlParam3(ctrlParam3);
        return this;
    }

    /**
     * <B>CTRLPARAM4</B>&nbsp;控件参数4，指定控件参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM4 = "ctrlparam4";

    /**
     * 设置 控件参数4，详细说明：{@link #FIELD_CTRLPARAM4}
     * 
     * @param ctrlParam4
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM4)
    public void setCtrlParam4(String ctrlParam4){
        this.set(FIELD_CTRLPARAM4, ctrlParam4);
    }
    
    /**
     * 获取 控件参数4  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam4(){
        Object objValue = this.get(FIELD_CTRLPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam4Dirty(){
        if(this.contains(FIELD_CTRLPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数4
     */
    @JsonIgnore
    public void resetCtrlParam4(){
        this.reset(FIELD_CTRLPARAM4);
    }

    /**
     * 设置 控件参数4，详细说明：{@link #FIELD_CTRLPARAM4}
     * <P>
     * 等同 {@link #setCtrlParam4}
     * @param ctrlParam4
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam4(String ctrlParam4){
        this.setCtrlParam4(ctrlParam4);
        return this;
    }

    /**
     * <B>CTRLPARAM5</B>&nbsp;控件参数5，指定控件参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLPARAM5 = "ctrlparam5";

    /**
     * 设置 控件参数5，详细说明：{@link #FIELD_CTRLPARAM5}
     * 
     * @param ctrlParam5
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM5)
    public void setCtrlParam5(Integer ctrlParam5){
        this.set(FIELD_CTRLPARAM5, ctrlParam5);
    }
    
    /**
     * 获取 控件参数5  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam5(){
        Object objValue = this.get(FIELD_CTRLPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam5Dirty(){
        if(this.contains(FIELD_CTRLPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数5
     */
    @JsonIgnore
    public void resetCtrlParam5(){
        this.reset(FIELD_CTRLPARAM5);
    }

    /**
     * 设置 控件参数5，详细说明：{@link #FIELD_CTRLPARAM5}
     * <P>
     * 等同 {@link #setCtrlParam5}
     * @param ctrlParam5
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam5(Integer ctrlParam5){
        this.setCtrlParam5(ctrlParam5);
        return this;
    }

     /**
     * 设置 控件参数5，详细说明：{@link #FIELD_CTRLPARAM5}
     * <P>
     * 等同 {@link #setCtrlParam5}
     * @param ctrlParam5
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam5(Boolean ctrlParam5){
        if(ctrlParam5 == null){
            this.setCtrlParam5(null);
        }
        else{
            this.setCtrlParam5(ctrlParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CTRLPARAM6</B>&nbsp;控件参数6，指定控件参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLPARAM6 = "ctrlparam6";

    /**
     * 设置 控件参数6，详细说明：{@link #FIELD_CTRLPARAM6}
     * 
     * @param ctrlParam6
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM6)
    public void setCtrlParam6(Integer ctrlParam6){
        this.set(FIELD_CTRLPARAM6, ctrlParam6);
    }
    
    /**
     * 获取 控件参数6  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam6(){
        Object objValue = this.get(FIELD_CTRLPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam6Dirty(){
        if(this.contains(FIELD_CTRLPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数6
     */
    @JsonIgnore
    public void resetCtrlParam6(){
        this.reset(FIELD_CTRLPARAM6);
    }

    /**
     * 设置 控件参数6，详细说明：{@link #FIELD_CTRLPARAM6}
     * <P>
     * 等同 {@link #setCtrlParam6}
     * @param ctrlParam6
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam6(Integer ctrlParam6){
        this.setCtrlParam6(ctrlParam6);
        return this;
    }

     /**
     * 设置 控件参数6，详细说明：{@link #FIELD_CTRLPARAM6}
     * <P>
     * 等同 {@link #setCtrlParam6}
     * @param ctrlParam6
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam6(Boolean ctrlParam6){
        if(ctrlParam6 == null){
            this.setCtrlParam6(null);
        }
        else{
            this.setCtrlParam6(ctrlParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CTRLPARAM7</B>&nbsp;控件参数7，指定控件参数7
     */
    public final static String FIELD_CTRLPARAM7 = "ctrlparam7";

    /**
     * 设置 控件参数7，详细说明：{@link #FIELD_CTRLPARAM7}
     * 
     * @param ctrlParam7
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM7)
    public void setCtrlParam7(Integer ctrlParam7){
        this.set(FIELD_CTRLPARAM7, ctrlParam7);
    }
    
    /**
     * 获取 控件参数7  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam7(){
        Object objValue = this.get(FIELD_CTRLPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam7Dirty(){
        if(this.contains(FIELD_CTRLPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数7
     */
    @JsonIgnore
    public void resetCtrlParam7(){
        this.reset(FIELD_CTRLPARAM7);
    }

    /**
     * 设置 控件参数7，详细说明：{@link #FIELD_CTRLPARAM7}
     * <P>
     * 等同 {@link #setCtrlParam7}
     * @param ctrlParam7
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam7(Integer ctrlParam7){
        this.setCtrlParam7(ctrlParam7);
        return this;
    }

    /**
     * <B>CTRLPARAM8</B>&nbsp;控件参数8，指定控件参数8
     */
    public final static String FIELD_CTRLPARAM8 = "ctrlparam8";

    /**
     * 设置 控件参数8，详细说明：{@link #FIELD_CTRLPARAM8}
     * 
     * @param ctrlParam8
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM8)
    public void setCtrlParam8(Integer ctrlParam8){
        this.set(FIELD_CTRLPARAM8, ctrlParam8);
    }
    
    /**
     * 获取 控件参数8  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam8(){
        Object objValue = this.get(FIELD_CTRLPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam8Dirty(){
        if(this.contains(FIELD_CTRLPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数8
     */
    @JsonIgnore
    public void resetCtrlParam8(){
        this.reset(FIELD_CTRLPARAM8);
    }

    /**
     * 设置 控件参数8，详细说明：{@link #FIELD_CTRLPARAM8}
     * <P>
     * 等同 {@link #setCtrlParam8}
     * @param ctrlParam8
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam8(Integer ctrlParam8){
        this.setCtrlParam8(ctrlParam8);
        return this;
    }

    /**
     * <B>CTRLPARAM9</B>&nbsp;控件参数9，指定控件参数9
     */
    public final static String FIELD_CTRLPARAM9 = "ctrlparam9";

    /**
     * 设置 控件参数9，详细说明：{@link #FIELD_CTRLPARAM9}
     * 
     * @param ctrlParam9
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM9)
    public void setCtrlParam9(Double ctrlParam9){
        this.set(FIELD_CTRLPARAM9, ctrlParam9);
    }
    
    /**
     * 获取 控件参数9  
     * @return
     */
    @JsonIgnore
    public Double getCtrlParam9(){
        Object objValue = this.get(FIELD_CTRLPARAM9);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 控件参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam9Dirty(){
        if(this.contains(FIELD_CTRLPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数9
     */
    @JsonIgnore
    public void resetCtrlParam9(){
        this.reset(FIELD_CTRLPARAM9);
    }

    /**
     * 设置 控件参数9，详细说明：{@link #FIELD_CTRLPARAM9}
     * <P>
     * 等同 {@link #setCtrlParam9}
     * @param ctrlParam9
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparam9(Double ctrlParam9){
        this.setCtrlParam9(ctrlParam9);
        return this;
    }

    /**
     * <B>CTRLPARAMS</B>&nbsp;控件动态参数，指定控件的动态参数集合，使用Properties格式
     */
    public final static String FIELD_CTRLPARAMS = "ctrlparams";

    /**
     * 设置 控件动态参数，详细说明：{@link #FIELD_CTRLPARAMS}
     * 
     * @param ctrlParams
     * 
     */
    @JsonProperty(FIELD_CTRLPARAMS)
    public void setCtrlParams(String ctrlParams){
        this.set(FIELD_CTRLPARAMS, ctrlParams);
    }
    
    /**
     * 获取 控件动态参数  
     * @return
     */
    @JsonIgnore
    public String getCtrlParams(){
        Object objValue = this.get(FIELD_CTRLPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件动态参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParamsDirty(){
        if(this.contains(FIELD_CTRLPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件动态参数
     */
    @JsonIgnore
    public void resetCtrlParams(){
        this.reset(FIELD_CTRLPARAMS);
    }

    /**
     * 设置 控件动态参数，详细说明：{@link #FIELD_CTRLPARAMS}
     * <P>
     * 等同 {@link #setCtrlParams}
     * @param ctrlParams
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ctrlparams(String ctrlParams){
        this.setCtrlParams(ctrlParams);
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
    public PSDEViewCtrlDTO customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认部件，指定部件是否为视图的默认成员，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认部件，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认部件  
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
     * 判断 默认部件 是否指定值，包括空值
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
     * 重置 默认部件
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认部件，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEViewCtrlDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认部件，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEViewCtrlDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用列权限控制，指定视图部件是否启用列权限控制，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEViewCtrlDTO enableitempriv(Integer enableItemPriv){
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
    public PSDEViewCtrlDTO enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用界面行为控制，指定部件是否仅接收注册在视图的界面行为，未定义时为【全部】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用界面行为控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用界面行为控制  
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
     * 判断 启用界面行为控制 是否指定值，包括空值
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
     * 重置 启用界面行为控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用界面行为控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEViewCtrlDTO enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用界面行为控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEViewCtrlDTO enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定部件的高度，未定义时为【0】
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Double height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
     * @return
     */
    @JsonIgnore
    public Double getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
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
    public PSDEViewCtrlDTO height(Double height){
        this.setHeight(height);
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
    public PSDEViewCtrlDTO leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
        return this;
    }

    /**
     * <B>LOCALMODE</B>&nbsp;上下文数据模式，指定部件处理是否启用本地模式，本地模式是指不与远程交互，在本地完成功能。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_LOCALMODE = "localmode";

    /**
     * 设置 上下文数据模式，详细说明：{@link #FIELD_LOCALMODE}
     * 
     * @param localMode
     * 
     */
    @JsonProperty(FIELD_LOCALMODE)
    public void setLocalMode(Integer localMode){
        this.set(FIELD_LOCALMODE, localMode);
    }
    
    /**
     * 获取 上下文数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getLocalMode(){
        Object objValue = this.get(FIELD_LOCALMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 上下文数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLocalModeDirty(){
        if(this.contains(FIELD_LOCALMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上下文数据模式
     */
    @JsonIgnore
    public void resetLocalMode(){
        this.reset(FIELD_LOCALMODE);
    }

    /**
     * 设置 上下文数据模式，详细说明：{@link #FIELD_LOCALMODE}
     * <P>
     * 等同 {@link #setLocalMode}
     * @param localMode
     */
    @JsonIgnore
    public PSDEViewCtrlDTO localmode(Integer localMode){
        this.setLocalMode(localMode);
        return this;
    }

     /**
     * 设置 上下文数据模式，详细说明：{@link #FIELD_LOCALMODE}
     * <P>
     * 等同 {@link #setLocalMode}
     * @param localMode
     */
    @JsonIgnore
    public PSDEViewCtrlDTO localmode(Boolean localMode){
        if(localMode == null){
            this.setLocalMode(null);
        }
        else{
            this.setLocalMode(localMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEViewCtrlDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MULTISELECT</B>&nbsp;支持多选，支持视图部件是否支持多项选择，未定义时使用部件的默认定义
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MULTISELECT = "multiselect";

    /**
     * 设置 支持多选，详细说明：{@link #FIELD_MULTISELECT}
     * 
     * @param multiSelect
     * 
     */
    @JsonProperty(FIELD_MULTISELECT)
    public void setMultiSelect(Integer multiSelect){
        this.set(FIELD_MULTISELECT, multiSelect);
    }
    
    /**
     * 获取 支持多选  
     * @return
     */
    @JsonIgnore
    public Integer getMultiSelect(){
        Object objValue = this.get(FIELD_MULTISELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持多选 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMultiSelectDirty(){
        if(this.contains(FIELD_MULTISELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持多选
     */
    @JsonIgnore
    public void resetMultiSelect(){
        this.reset(FIELD_MULTISELECT);
    }

    /**
     * 设置 支持多选，详细说明：{@link #FIELD_MULTISELECT}
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEViewCtrlDTO multiselect(Integer multiSelect){
        this.setMultiSelect(multiSelect);
        return this;
    }

     /**
     * 设置 支持多选，详细说明：{@link #FIELD_MULTISELECT}
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEViewCtrlDTO multiselect(Boolean multiSelect){
        if(multiSelect == null){
            this.setMultiSelect(null);
        }
        else{
            this.setMultiSelect(multiSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPID</B>&nbsp;实体界面行为组2，指定部件界面行为组占位2绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * 
     * @param nO2PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPID)
    public void setNO2PSDEUAGroupId(String nO2PSDEUAGroupId){
        this.set(FIELD_NO2PSDEUAGROUPID, nO2PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组2  
     * @return
     */
    @JsonIgnore
    public String getNO2PSDEUAGroupId(){
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
    public boolean isNO2PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组2
     */
    @JsonIgnore
    public void resetNO2PSDEUAGroupId(){
        this.reset(FIELD_NO2PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNO2PSDEUAGroupId}
     * @param nO2PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no2psdeuagroupid(String nO2PSDEUAGroupId){
        this.setNO2PSDEUAGroupId(nO2PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNO2PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no2psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNO2PSDEUAGroupId(null);
            this.setNO2PSDEUAGroupName(null);
        }
        else{
            this.setNO2PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO2PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPNAME</B>&nbsp;实体界面行为组2，指定部件界面行为组占位2绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEUAGROUPID}
     */
    public final static String FIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * 
     * @param nO2PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPNAME)
    public void setNO2PSDEUAGroupName(String nO2PSDEUAGroupName){
        this.set(FIELD_NO2PSDEUAGROUPNAME, nO2PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组2  
     * @return
     */
    @JsonIgnore
    public String getNO2PSDEUAGroupName(){
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
    public boolean isNO2PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO2PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组2
     */
    @JsonIgnore
    public void resetNO2PSDEUAGroupName(){
        this.reset(FIELD_NO2PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组2，详细说明：{@link #FIELD_NO2PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNO2PSDEUAGroupName}
     * @param nO2PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no2psdeuagroupname(String nO2PSDEUAGroupName){
        this.setNO2PSDEUAGroupName(nO2PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO3PSDEUAGROUPID</B>&nbsp;实体界面行为组3，指定部件界面行为组占位3绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO3PSDEUAGROUPID = "no3psdeuagroupid";

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPID}
     * 
     * @param nO3PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO3PSDEUAGROUPID)
    public void setNO3PSDEUAGroupId(String nO3PSDEUAGroupId){
        this.set(FIELD_NO3PSDEUAGROUPID, nO3PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组3  
     * @return
     */
    @JsonIgnore
    public String getNO3PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO3PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO3PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO3PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组3
     */
    @JsonIgnore
    public void resetNO3PSDEUAGroupId(){
        this.reset(FIELD_NO3PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNO3PSDEUAGroupId}
     * @param nO3PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no3psdeuagroupid(String nO3PSDEUAGroupId){
        this.setNO3PSDEUAGroupId(nO3PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNO3PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no3psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNO3PSDEUAGroupId(null);
            this.setNO3PSDEUAGroupName(null);
        }
        else{
            this.setNO3PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO3PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO3PSDEUAGROUPNAME</B>&nbsp;实体界面行为组3，指定部件界面行为组占位3绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3PSDEUAGROUPID}
     */
    public final static String FIELD_NO3PSDEUAGROUPNAME = "no3psdeuagroupname";

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPNAME}
     * 
     * @param nO3PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO3PSDEUAGROUPNAME)
    public void setNO3PSDEUAGroupName(String nO3PSDEUAGroupName){
        this.set(FIELD_NO3PSDEUAGROUPNAME, nO3PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组3  
     * @return
     */
    @JsonIgnore
    public String getNO3PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO3PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO3PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO3PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组3
     */
    @JsonIgnore
    public void resetNO3PSDEUAGroupName(){
        this.reset(FIELD_NO3PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组3，详细说明：{@link #FIELD_NO3PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNO3PSDEUAGroupName}
     * @param nO3PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no3psdeuagroupname(String nO3PSDEUAGroupName){
        this.setNO3PSDEUAGroupName(nO3PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO4PSDEUAGROUPID</B>&nbsp;实体界面行为组4，指定部件界面行为组占位4绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO4PSDEUAGROUPID = "no4psdeuagroupid";

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPID}
     * 
     * @param nO4PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO4PSDEUAGROUPID)
    public void setNO4PSDEUAGroupId(String nO4PSDEUAGroupId){
        this.set(FIELD_NO4PSDEUAGROUPID, nO4PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组4  
     * @return
     */
    @JsonIgnore
    public String getNO4PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO4PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO4PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO4PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组4
     */
    @JsonIgnore
    public void resetNO4PSDEUAGroupId(){
        this.reset(FIELD_NO4PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNO4PSDEUAGroupId}
     * @param nO4PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no4psdeuagroupid(String nO4PSDEUAGroupId){
        this.setNO4PSDEUAGroupId(nO4PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNO4PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no4psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNO4PSDEUAGroupId(null);
            this.setNO4PSDEUAGroupName(null);
        }
        else{
            this.setNO4PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO4PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO4PSDEUAGROUPNAME</B>&nbsp;实体界面行为组4，指定部件界面行为组占位4绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO4PSDEUAGROUPID}
     */
    public final static String FIELD_NO4PSDEUAGROUPNAME = "no4psdeuagroupname";

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPNAME}
     * 
     * @param nO4PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO4PSDEUAGROUPNAME)
    public void setNO4PSDEUAGroupName(String nO4PSDEUAGroupName){
        this.set(FIELD_NO4PSDEUAGROUPNAME, nO4PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组4  
     * @return
     */
    @JsonIgnore
    public String getNO4PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO4PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO4PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO4PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组4
     */
    @JsonIgnore
    public void resetNO4PSDEUAGroupName(){
        this.reset(FIELD_NO4PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组4，详细说明：{@link #FIELD_NO4PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNO4PSDEUAGroupName}
     * @param nO4PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no4psdeuagroupname(String nO4PSDEUAGroupName){
        this.setNO4PSDEUAGroupName(nO4PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO5PSDEUAGROUPID</B>&nbsp;实体界面行为组5，指定部件界面行为组占位5绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO5PSDEUAGROUPID = "no5psdeuagroupid";

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPID}
     * 
     * @param nO5PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO5PSDEUAGROUPID)
    public void setNO5PSDEUAGroupId(String nO5PSDEUAGroupId){
        this.set(FIELD_NO5PSDEUAGROUPID, nO5PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组5  
     * @return
     */
    @JsonIgnore
    public String getNO5PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO5PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO5PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO5PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组5
     */
    @JsonIgnore
    public void resetNO5PSDEUAGroupId(){
        this.reset(FIELD_NO5PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNO5PSDEUAGroupId}
     * @param nO5PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no5psdeuagroupid(String nO5PSDEUAGroupId){
        this.setNO5PSDEUAGroupId(nO5PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组5，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNO5PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no5psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNO5PSDEUAGroupId(null);
            this.setNO5PSDEUAGroupName(null);
        }
        else{
            this.setNO5PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO5PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO5PSDEUAGROUPNAME</B>&nbsp;实体界面行为组5，指定部件界面行为组占位5绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO5PSDEUAGROUPID}
     */
    public final static String FIELD_NO5PSDEUAGROUPNAME = "no5psdeuagroupname";

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPNAME}
     * 
     * @param nO5PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO5PSDEUAGROUPNAME)
    public void setNO5PSDEUAGroupName(String nO5PSDEUAGroupName){
        this.set(FIELD_NO5PSDEUAGROUPNAME, nO5PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组5  
     * @return
     */
    @JsonIgnore
    public String getNO5PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO5PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO5PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO5PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组5
     */
    @JsonIgnore
    public void resetNO5PSDEUAGroupName(){
        this.reset(FIELD_NO5PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组5，详细说明：{@link #FIELD_NO5PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNO5PSDEUAGroupName}
     * @param nO5PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no5psdeuagroupname(String nO5PSDEUAGroupName){
        this.setNO5PSDEUAGroupName(nO5PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NO6PSDEUAGROUPID</B>&nbsp;实体界面行为组6，指定部件界面行为组占位6绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_NO6PSDEUAGROUPID = "no6psdeuagroupid";

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPID}
     * 
     * @param nO6PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO6PSDEUAGROUPID)
    public void setNO6PSDEUAGroupId(String nO6PSDEUAGroupId){
        this.set(FIELD_NO6PSDEUAGROUPID, nO6PSDEUAGroupId);
    }
    
    /**
     * 获取 实体界面行为组6  
     * @return
     */
    @JsonIgnore
    public String getNO6PSDEUAGroupId(){
        Object objValue = this.get(FIELD_NO6PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO6PSDEUAGroupIdDirty(){
        if(this.contains(FIELD_NO6PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组6
     */
    @JsonIgnore
    public void resetNO6PSDEUAGroupId(){
        this.reset(FIELD_NO6PSDEUAGROUPID);
    }

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setNO6PSDEUAGroupId}
     * @param nO6PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no6psdeuagroupid(String nO6PSDEUAGroupId){
        this.setNO6PSDEUAGroupId(nO6PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 实体界面行为组6，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNO6PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no6psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setNO6PSDEUAGroupId(null);
            this.setNO6PSDEUAGroupName(null);
        }
        else{
            this.setNO6PSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setNO6PSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>NO6PSDEUAGROUPNAME</B>&nbsp;实体界面行为组6，指定部件界面行为组占位6绑定的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO6PSDEUAGROUPID}
     */
    public final static String FIELD_NO6PSDEUAGROUPNAME = "no6psdeuagroupname";

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPNAME}
     * 
     * @param nO6PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO6PSDEUAGROUPNAME)
    public void setNO6PSDEUAGroupName(String nO6PSDEUAGroupName){
        this.set(FIELD_NO6PSDEUAGROUPNAME, nO6PSDEUAGroupName);
    }
    
    /**
     * 获取 实体界面行为组6  
     * @return
     */
    @JsonIgnore
    public String getNO6PSDEUAGroupName(){
        Object objValue = this.get(FIELD_NO6PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为组6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNO6PSDEUAGroupNameDirty(){
        if(this.contains(FIELD_NO6PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为组6
     */
    @JsonIgnore
    public void resetNO6PSDEUAGroupName(){
        this.reset(FIELD_NO6PSDEUAGROUPNAME);
    }

    /**
     * 设置 实体界面行为组6，详细说明：{@link #FIELD_NO6PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setNO6PSDEUAGroupName}
     * @param nO6PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO no6psdeuagroupname(String nO6PSDEUAGroupName){
        this.setNO6PSDEUAGroupName(nO6PSDEUAGroupName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序，指定视图部件的显示次序，流式布局或分页部件会按照此值顺序输出部件
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示次序  
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
     * 判断 显示次序 是否指定值，包括空值
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
     * 重置 显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEViewCtrlDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
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
    public PSDEViewCtrlDTO predefinedtype(String predefinedType){
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
    public PSDEViewCtrlDTO predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定部件的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 界面处理对象  
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
     * 判断 界面处理对象 是否指定值，包括空值
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
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 界面处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psachandlerid(PSACHandlerDTO pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定部件的界面处理对象
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
    public PSDEViewCtrlDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定视图部件附加的部件逻辑组对象，如指定将替换部件默认配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
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
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEViewCtrlDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定视图部件附加的部件逻辑组对象，如指定将替换部件默认配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
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
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定视图部件附加的部件消息对象，如指定将替换部件默认配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlMsgDTO} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定视图部件附加的部件消息对象，如指定将替换部件默认配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定实体行为对象
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
    public PSDEViewCtrlDTO psdeactionid(String pSDEActionId){
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
    public PSDEViewCtrlDTO psdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定实体行为对象
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
    public PSDEViewCtrlDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDECHARTID</B>&nbsp;实体图表，指定实体图表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEChartDTO} 
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
    public PSDEViewCtrlDTO psdechartid(String pSDEChartId){
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
    public PSDEViewCtrlDTO psdechartid(PSDEChartDTO pSDEChart){
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
     * <B>PSDECHARTNAME</B>&nbsp;实体图表，指定实体图表对象
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
    public PSDEViewCtrlDTO psdechartname(String pSDEChartName){
        this.setPSDEChartName(pSDEChartName);
        return this;
    }

    /**
     * <B>PSDEDATAEXPID</B>&nbsp;实体数据导出，指定实体数据导出对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataExpDTO} 
     */
    public final static String FIELD_PSDEDATAEXPID = "psdedataexpid";

    /**
     * 设置 实体数据导出，详细说明：{@link #FIELD_PSDEDATAEXPID}
     * 
     * @param pSDEDataExpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAEXPID)
    public void setPSDEDataExpId(String pSDEDataExpId){
        this.set(FIELD_PSDEDATAEXPID, pSDEDataExpId);
    }
    
    /**
     * 获取 实体数据导出  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataExpId(){
        Object objValue = this.get(FIELD_PSDEDATAEXPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataExpIdDirty(){
        if(this.contains(FIELD_PSDEDATAEXPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导出
     */
    @JsonIgnore
    public void resetPSDEDataExpId(){
        this.reset(FIELD_PSDEDATAEXPID);
    }

    /**
     * 设置 实体数据导出，详细说明：{@link #FIELD_PSDEDATAEXPID}
     * <P>
     * 等同 {@link #setPSDEDataExpId}
     * @param pSDEDataExpId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedataexpid(String pSDEDataExpId){
        this.setPSDEDataExpId(pSDEDataExpId);
        return this;
    }

    /**
     * 设置 实体数据导出，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataExpId}
     * @param pSDEDataExp 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedataexpid(PSDEDataExpDTO pSDEDataExp){
        if(pSDEDataExp == null){
            this.setPSDEDataExpId(null);
            this.setPSDEDataExpName(null);
        }
        else{
            this.setPSDEDataExpId(pSDEDataExp.getPSDEDataExpId());
            this.setPSDEDataExpName(pSDEDataExp.getPSDEDataExpName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAEXPNAME</B>&nbsp;实体数据导出，指定实体数据导出对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAEXPID}
     */
    public final static String FIELD_PSDEDATAEXPNAME = "psdedataexpname";

    /**
     * 设置 实体数据导出，详细说明：{@link #FIELD_PSDEDATAEXPNAME}
     * 
     * @param pSDEDataExpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAEXPNAME)
    public void setPSDEDataExpName(String pSDEDataExpName){
        this.set(FIELD_PSDEDATAEXPNAME, pSDEDataExpName);
    }
    
    /**
     * 获取 实体数据导出  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataExpName(){
        Object objValue = this.get(FIELD_PSDEDATAEXPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataExpNameDirty(){
        if(this.contains(FIELD_PSDEDATAEXPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导出
     */
    @JsonIgnore
    public void resetPSDEDataExpName(){
        this.reset(FIELD_PSDEDATAEXPNAME);
    }

    /**
     * 设置 实体数据导出，详细说明：{@link #FIELD_PSDEDATAEXPNAME}
     * <P>
     * 等同 {@link #setPSDEDataExpName}
     * @param pSDEDataExpName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedataexpname(String pSDEDataExpName){
        this.setPSDEDataExpName(pSDEDataExpName);
        return this;
    }

    /**
     * <B>PSDEDATAIMPID</B>&nbsp;实体数据导入，指定实体数据导入对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO} 
     */
    public final static String FIELD_PSDEDATAIMPID = "psdedataimpid";

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPID}
     * 
     * @param pSDEDataImpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPID)
    public void setPSDEDataImpId(String pSDEDataImpId){
        this.set(FIELD_PSDEDATAIMPID, pSDEDataImpId);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpId(){
        Object objValue = this.get(FIELD_PSDEDATAIMPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpIdDirty(){
        if(this.contains(FIELD_PSDEDATAIMPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpId(){
        this.reset(FIELD_PSDEDATAIMPID);
    }

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPID}
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImpId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedataimpid(String pSDEDataImpId){
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    /**
     * 设置 实体数据导入，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImp 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp){
        if(pSDEDataImp == null){
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
        }
        else{
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAIMPNAME</B>&nbsp;实体数据导入，指定实体数据导入对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAIMPID}
     */
    public final static String FIELD_PSDEDATAIMPNAME = "psdedataimpname";

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPNAME}
     * 
     * @param pSDEDataImpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPNAME)
    public void setPSDEDataImpName(String pSDEDataImpName){
        this.set(FIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpName(){
        Object objValue = this.get(FIELD_PSDEDATAIMPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpNameDirty(){
        if(this.contains(FIELD_PSDEDATAIMPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpName(){
        this.reset(FIELD_PSDEDATAIMPNAME);
    }

    /**
     * 设置 实体数据导入，详细说明：{@link #FIELD_PSDEDATAIMPNAME}
     * <P>
     * 等同 {@link #setPSDEDataImpName}
     * @param pSDEDataImpName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedataimpname(String pSDEDataImpName){
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;实体数据集，指定实体数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
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
    public PSDEViewCtrlDTO psdedatasetid(String pSDEDataSetId){
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
    public PSDEViewCtrlDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;实体数据集，指定实体数据集对象
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
    public PSDEViewCtrlDTO psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEDATAVIEWID</B>&nbsp;实体卡片视图，指定实体卡片视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataViewDTO} 
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
    public PSDEViewCtrlDTO psdedataviewid(String pSDEDataViewId){
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
    public PSDEViewCtrlDTO psdedataviewid(PSDEDataViewDTO pSDEDataView){
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
     * <B>PSDEDATAVIEWNAME</B>&nbsp;实体卡片视图，指定实体卡片视图
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
    public PSDEViewCtrlDTO psdedataviewname(String pSDEDataViewName){
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    /**
     * <B>PSDEDRID</B>&nbsp;实体数据关系组，指定实体数据关系组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO} 
     */
    public final static String FIELD_PSDEDRID = "psdedrid";

    /**
     * 设置 实体数据关系组，详细说明：{@link #FIELD_PSDEDRID}
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
     * 设置 实体数据关系组，详细说明：{@link #FIELD_PSDEDRID}
     * <P>
     * 等同 {@link #setPSDEDRId}
     * @param pSDEDRId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedrid(String pSDEDRId){
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
    public PSDEViewCtrlDTO psdedrid(PSDEDataRelationDTO pSDEDataRelation){
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
     * <B>PSDEDRNAME</B>&nbsp;实体数据关系组，指定实体数据关系组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDRID}
     */
    public final static String FIELD_PSDEDRNAME = "psdedrname";

    /**
     * 设置 实体数据关系组，详细说明：{@link #FIELD_PSDEDRNAME}
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
     * 设置 实体数据关系组，详细说明：{@link #FIELD_PSDEDRNAME}
     * <P>
     * 等同 {@link #setPSDEDRName}
     * @param pSDEDRName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdedrname(String pSDEDRName){
        this.setPSDEDRName(pSDEDRName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单，指定实体表单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFormDTO} 
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
    public PSDEViewCtrlDTO psdeformid(String pSDEFormId){
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
    public PSDEViewCtrlDTO psdeformid(PSDEFormDTO pSDEForm){
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
     * <B>PSDEFORMNAME</B>&nbsp;实体表单，指定实体表单对象
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
    public PSDEViewCtrlDTO psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体表格，指定实体表格对象
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
    public PSDEViewCtrlDTO psdegridid(String pSDEGridId){
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
    public PSDEViewCtrlDTO psdegridid(PSDEGridDTO pSDEGrid){
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
     * <B>PSDEGRIDNAME</B>&nbsp;实体表格，指定实体表格对象
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
    public PSDEViewCtrlDTO psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;部件实体，指定部件的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 部件实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 部件实体  
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
     * 判断 部件实体 是否指定值，包括空值
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
     * 重置 部件实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 部件实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 部件实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDELISTID</B>&nbsp;实体列表，指定实体列表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEListDTO} 
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
    public PSDEViewCtrlDTO psdelistid(String pSDEListId){
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
    public PSDEViewCtrlDTO psdelistid(PSDEListDTO pSDEList){
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
     * <B>PSDELISTNAME</B>&nbsp;实体列表，指定实体列表对象
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
    public PSDEViewCtrlDTO psdelistname(String pSDEListName){
        this.setPSDEListName(pSDEListName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;部件实体，指定部件的所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 部件实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 部件实体  
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
     * 判断 部件实体 是否指定值，包括空值
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
     * 重置 部件实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 部件实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;实体操作标识，指定分页视图面板动态显示的控制操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_PSDEOPPRIVID = "psdeopprivid";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * 
     * @param pSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVID)
    public void setPSDEOPPrivId(String pSDEOPPrivId){
        this.set(FIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivId(){
        this.reset(FIELD_PSDEOPPRIVID);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPrivId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeopprivid(String pSDEOPPrivId){
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    /**
     * 设置 实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        }
        else{
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>PSDEOPPRIVNAME</B>&nbsp;实体操作标识，指定分页视图面板动态显示的控制操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEOPPRIVID}
     */
    public final static String FIELD_PSDEOPPRIVNAME = "psdeopprivname";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * 
     * @param pSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVNAME)
    public void setPSDEOPPrivName(String pSDEOPPrivName){
        this.set(FIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivName(){
        this.reset(FIELD_PSDEOPPRIVNAME);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setPSDEOPPrivName}
     * @param pSDEOPPrivName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    /**
     * <B>PSDEREPORTID</B>&nbsp;实体报表，指定实体报表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEReportDTO} 
     */
    public final static String FIELD_PSDEREPORTID = "psdereportid";

    /**
     * 设置 实体报表，详细说明：{@link #FIELD_PSDEREPORTID}
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
     * 设置 实体报表，详细说明：{@link #FIELD_PSDEREPORTID}
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReportId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdereportid(String pSDEReportId){
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
    public PSDEViewCtrlDTO psdereportid(PSDEReportDTO pSDEReport){
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
     * <B>PSDEREPORTNAME</B>&nbsp;实体报表，指定实体报表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEREPORTID}
     */
    public final static String FIELD_PSDEREPORTNAME = "psdereportname";

    /**
     * 设置 实体报表，详细说明：{@link #FIELD_PSDEREPORTNAME}
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
     * 设置 实体报表，详细说明：{@link #FIELD_PSDEREPORTNAME}
     * <P>
     * 等同 {@link #setPSDEReportName}
     * @param pSDEReportName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdereportname(String pSDEReportName){
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    /**
     * <B>PSDETOOLBARID</B>&nbsp;实体工具栏，指定实体工具栏对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEToolbarDTO} 
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
    public PSDEViewCtrlDTO psdetoolbarid(String pSDEToolbarId){
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
    public PSDEViewCtrlDTO psdetoolbarid(PSDEToolbarDTO pSDEToolbar){
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
     * <B>PSDETOOLBARNAME</B>&nbsp;实体工具栏，指定实体工具栏对象
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
    public PSDEViewCtrlDTO psdetoolbarname(String pSDEToolbarName){
        this.setPSDEToolbarName(pSDEToolbarName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，指定实体树视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDETreeViewDTO} 
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
    public PSDEViewCtrlDTO psdetreeviewid(String pSDETreeViewId){
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
    public PSDEViewCtrlDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView){
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
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图，指定实体树视图对象
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
    public PSDEViewCtrlDTO psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;实体界面行为组，指定部件界面行为组占位绑定的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
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
    public PSDEViewCtrlDTO psdeuagroupid(String pSDEUAGroupId){
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
    public PSDEViewCtrlDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;实体界面行为组，指定部件界面行为组占位绑定的界面行为组
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
    public PSDEViewCtrlDTO psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图，指定部件所在的视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
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
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewbaseid(String pSDEViewBaseId){
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
    public PSDEViewCtrlDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图，指定部件所在的视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
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
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLID</B>&nbsp;实体视图部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVIEWCTRLID = "psdeviewctrlid";

    /**
     * 设置 实体视图部件标识
     * 
     * @param pSDEViewCtrlId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLID)
    public void setPSDEViewCtrlId(String pSDEViewCtrlId){
        this.set(FIELD_PSDEVIEWCTRLID, pSDEViewCtrlId);
    }
    
    /**
     * 获取 实体视图部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewCtrlId(){
        Object objValue = this.get(FIELD_PSDEVIEWCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewCtrlIdDirty(){
        if(this.contains(FIELD_PSDEVIEWCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图部件标识
     */
    @JsonIgnore
    public void resetPSDEViewCtrlId(){
        this.reset(FIELD_PSDEVIEWCTRLID);
    }

    /**
     * 设置 实体视图部件标识
     * <P>
     * 等同 {@link #setPSDEViewCtrlId}
     * @param pSDEViewCtrlId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrlid(String pSDEViewCtrlId){
        this.setPSDEViewCtrlId(pSDEViewCtrlId);
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLNAME</B>&nbsp;部件名称，指定部件的名称，需要在所在的实体视图中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_PSDEVIEWCTRLNAME = "psdeviewctrlname";

    /**
     * 设置 部件名称，详细说明：{@link #FIELD_PSDEVIEWCTRLNAME}
     * 
     * @param pSDEViewCtrlName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLNAME)
    public void setPSDEViewCtrlName(String pSDEViewCtrlName){
        this.set(FIELD_PSDEVIEWCTRLNAME, pSDEViewCtrlName);
    }
    
    /**
     * 获取 部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewCtrlName(){
        Object objValue = this.get(FIELD_PSDEVIEWCTRLNAME);
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
    public boolean isPSDEViewCtrlNameDirty(){
        if(this.contains(FIELD_PSDEVIEWCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件名称
     */
    @JsonIgnore
    public void resetPSDEViewCtrlName(){
        this.reset(FIELD_PSDEVIEWCTRLNAME);
    }

    /**
     * 设置 部件名称，详细说明：{@link #FIELD_PSDEVIEWCTRLNAME}
     * <P>
     * 等同 {@link #setPSDEViewCtrlName}
     * @param pSDEViewCtrlName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrlname(String pSDEViewCtrlName){
        this.setPSDEViewCtrlName(pSDEViewCtrlName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEViewCtrlName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEViewCtrlName(strName);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO name(String strName){
        this.setPSDEViewCtrlName(strName);
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLTYPE</B>&nbsp;部件类型，指定部件的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlType} 
     */
    public final static String FIELD_PSDEVIEWCTRLTYPE = "psdeviewctrltype";

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_PSDEVIEWCTRLTYPE}
     * 
     * @param pSDEViewCtrlType
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLTYPE)
    public void setPSDEViewCtrlType(String pSDEViewCtrlType){
        this.set(FIELD_PSDEVIEWCTRLTYPE, pSDEViewCtrlType);
    }
    
    /**
     * 获取 部件类型  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewCtrlType(){
        Object objValue = this.get(FIELD_PSDEVIEWCTRLTYPE);
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
    public boolean isPSDEViewCtrlTypeDirty(){
        if(this.contains(FIELD_PSDEVIEWCTRLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件类型
     */
    @JsonIgnore
    public void resetPSDEViewCtrlType(){
        this.reset(FIELD_PSDEVIEWCTRLTYPE);
    }

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_PSDEVIEWCTRLTYPE}
     * <P>
     * 等同 {@link #setPSDEViewCtrlType}
     * @param pSDEViewCtrlType
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrltype(String pSDEViewCtrlType){
        this.setPSDEViewCtrlType(pSDEViewCtrlType);
        return this;
    }

     /**
     * 设置 部件类型，详细说明：{@link #FIELD_PSDEVIEWCTRLTYPE}
     * <P>
     * 等同 {@link #setPSDEViewCtrlType}
     * @param pSDEViewCtrlType
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewctrltype(net.ibizsys.model.PSModelEnums.CtrlType pSDEViewCtrlType){
        if(pSDEViewCtrlType == null){
            this.setPSDEViewCtrlType(null);
        }
        else{
            this.setPSDEViewCtrlType(pSDEViewCtrlType.value);
        }
        return this;
    }

    /**
     * <B>PSDEVIEWID</B>&nbsp;实体视图，指定使用的实体视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_PSDEVIEWID = "psdeviewid";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWID}
     * 
     * @param pSDEViewId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWID)
    public void setPSDEViewId(String pSDEViewId){
        this.set(FIELD_PSDEVIEWID, pSDEViewId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewId(){
        Object objValue = this.get(FIELD_PSDEVIEWID);
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
    public boolean isPSDEViewIdDirty(){
        if(this.contains(FIELD_PSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewId(){
        this.reset(FIELD_PSDEVIEWID);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWID}
     * <P>
     * 等同 {@link #setPSDEViewId}
     * @param pSDEViewId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewid(String pSDEViewId){
        this.setPSDEViewId(pSDEViewId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewId(null);
            this.setPSDEViewName(null);
        }
        else{
            this.setPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWNAME</B>&nbsp;实体视图，指定使用的实体视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWID}
     */
    public final static String FIELD_PSDEVIEWNAME = "psdeviewname";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWNAME}
     * 
     * @param pSDEViewName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWNAME)
    public void setPSDEViewName(String pSDEViewName){
        this.set(FIELD_PSDEVIEWNAME, pSDEViewName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewName(){
        Object objValue = this.get(FIELD_PSDEVIEWNAME);
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
    public boolean isPSDEViewNameDirty(){
        if(this.contains(FIELD_PSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewName(){
        this.reset(FIELD_PSDEVIEWNAME);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDEViewName}
     * @param pSDEViewName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdeviewname(String pSDEViewName){
        this.setPSDEViewName(pSDEViewName);
        return this;
    }

    /**
     * <B>PSDEWIZARDID</B>&nbsp;实体向导，指定实体向导对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO} 
     */
    public final static String FIELD_PSDEWIZARDID = "psdewizardid";

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDID}
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
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDID}
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizardId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdewizardid(String pSDEWizardId){
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
    public PSDEViewCtrlDTO psdewizardid(PSDEWizardDTO pSDEWizard){
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
     * <B>PSDEWIZARDNAME</B>&nbsp;实体向导，指定实体向导对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEWIZARDNAME = "psdewizardname";

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDNAME}
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
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * <P>
     * 等同 {@link #setPSDEWizardName}
     * @param pSDEWizardName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO psdewizardname(String pSDEWizardName){
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板，指定视图部件启用的前端模板，该配置在多前端模板的多应用场合使用
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFID}
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFID}
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端模板，指定视图部件启用的前端模板，该配置在多前端模板的多应用场合使用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFNAME}
     * 
     * @param pSPFName
     * 
     */
    @JsonProperty(FIELD_PSPFNAME)
    public void setPSPFName(String pSPFName){
        this.set(FIELD_PSPFNAME, pSPFName);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFName(){
        Object objValue = this.get(FIELD_PSPFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFNameDirty(){
        if(this.contains(FIELD_PSPFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFName(){
        this.reset(FIELD_PSPFNAME);
    }

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFNAME}
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSSYSCALENDARID</B>&nbsp;日历部件，指定实体日历部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCalendarDTO} 
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
    public PSDEViewCtrlDTO pssyscalendarid(String pSSysCalendarId){
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
    public PSDEViewCtrlDTO pssyscalendarid(PSSysCalendarDTO pSSysCalendar){
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
     * <B>PSSYSCALENDARNAME</B>&nbsp;日历部件，指定实体日历部件对象
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
    public PSDEViewCtrlDTO pssyscalendarname(String pSSysCalendarName){
        this.setPSSysCalendarName(pSSysCalendarName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定系统计数器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCounterDTO} 
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
    public PSDEViewCtrlDTO pssyscounterid(String pSSysCounterId){
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
    public PSDEViewCtrlDTO pssyscounterid(PSSysCounterDTO pSSysCounter){
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
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定系统计数器对象
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
    public PSDEViewCtrlDTO pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;部件样式表，指定部件的样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 部件样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 部件样式表  
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
     * 判断 部件样式表 是否指定值，包括空值
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
     * 重置 部件样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 部件样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;部件样式表，指定部件的样式表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 部件样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 部件样式表  
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
     * 判断 部件样式表 是否指定值，包括空值
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
     * 重置 部件样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 部件样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDASHBOARDID</B>&nbsp;数据看板，指定数据看板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDashboardDTO} 
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
    public PSDEViewCtrlDTO pssysdashboardid(String pSSysDashboardId){
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
    public PSDEViewCtrlDTO pssysdashboardid(PSSysDashboardDTO pSSysDashboard){
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
     * <B>PSSYSDASHBOARDNAME</B>&nbsp;数据看板，指定数据看板对象
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
    public PSDEViewCtrlDTO pssysdashboardname(String pSSysDashboardName){
        this.setPSSysDashboardName(pSSysDashboardName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定部件显示图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
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
    public PSDEViewCtrlDTO pssysimageid(String pSSysImageId){
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
    public PSDEViewCtrlDTO pssysimageid(PSSysImageDTO pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;图标，指定部件显示图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 图标  
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
     * 判断 图标 是否指定值，包括空值
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
     * 重置 图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSMAPVIEWID</B>&nbsp;地图部件，指定部件使用地图视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMapViewDTO} 
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
    public PSDEViewCtrlDTO pssysmapviewid(String pSSysMapViewId){
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
    public PSDEViewCtrlDTO pssysmapviewid(PSSysMapViewDTO pSSysMapView){
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
     * <B>PSSYSMAPVIEWNAME</B>&nbsp;地图部件，指定部件使用地图视图对象
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
    public PSDEViewCtrlDTO pssysmapviewname(String pSSysMapViewName){
        this.setPSSysMapViewName(pSSysMapViewName);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;系统消息模板，指定部件使用消息模板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * 
     * @param pSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLID)
    public void setPSSysMsgTemplId(String pSSysMsgTemplId){
        this.set(FIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }
    
    /**
     * 获取 系统消息模板  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplId(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplId(){
        this.reset(FIELD_PSSYSMSGTEMPLID);
    }

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLID}
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysmsgtemplid(String pSSysMsgTemplId){
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 系统消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl){
        if(pSSysMsgTempl == null){
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        }
        else{
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;系统消息模板，指定部件使用消息模板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * 
     * @param pSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLNAME)
    public void setPSSysMsgTemplName(String pSSysMsgTemplName){
        this.set(FIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }
    
    /**
     * 获取 系统消息模板  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplName(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplName(){
        this.reset(FIELD_PSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 系统消息模板，详细说明：{@link #FIELD_PSSYSMSGTEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体视图部件使用的前端模板扩展插件，使用插件类型【自定义部件绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
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
    public PSDEViewCtrlDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEViewCtrlDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体视图部件使用的前端模板扩展插件，使用插件类型【自定义部件绘制插件】
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
    public PSDEViewCtrlDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHBARID</B>&nbsp;搜索栏，指定部件使用的搜索栏对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchBarDTO} 
     */
    public final static String FIELD_PSSYSSEARCHBARID = "pssyssearchbarid";

    /**
     * 设置 搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARID}
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
     * 设置 搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARID}
     * <P>
     * 等同 {@link #setPSSysSearchBarId}
     * @param pSSysSearchBarId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssyssearchbarid(String pSSysSearchBarId){
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
    public PSDEViewCtrlDTO pssyssearchbarid(PSSysSearchBarDTO pSSysSearchBar){
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
     * <B>PSSYSSEARCHBARNAME</B>&nbsp;搜索栏，指定部件使用的搜索栏对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHBARID}
     */
    public final static String FIELD_PSSYSSEARCHBARNAME = "pssyssearchbarname";

    /**
     * 设置 搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARNAME}
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
     * 设置 搜索栏，详细说明：{@link #FIELD_PSSYSSEARCHBARNAME}
     * <P>
     * 等同 {@link #setPSSysSearchBarName}
     * @param pSSysSearchBarName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssyssearchbarname(String pSSysSearchBarName){
        this.setPSSysSearchBarName(pSSysSearchBarName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;系统面板，指定部件使用的面板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 系统面板  
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
     * 判断 系统面板 是否指定值，包括空值
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
     * 重置 系统面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 系统面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;系统面板，指定部件使用的面板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 系统面板  
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
     * 判断 系统面板 是否指定值，包括空值
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
     * 重置 系统面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 系统面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>READONLYMODE</B>&nbsp;只读模式，指定部件是否启用只读模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_READONLYMODE = "readonlymode";

    /**
     * 设置 只读模式，详细说明：{@link #FIELD_READONLYMODE}
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
     * 设置 只读模式，详细说明：{@link #FIELD_READONLYMODE}
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSDEViewCtrlDTO readonlymode(Integer readOnlyMode){
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

     /**
     * 设置 只读模式，详细说明：{@link #FIELD_READONLYMODE}
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSDEViewCtrlDTO readonlymode(Boolean readOnlyMode){
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
    public PSDEViewCtrlDTO refctrl2name(String refCtrl2Name){
        this.setRefCtrl2Name(refCtrl2Name);
        return this;
    }

    /**
     * <B>REFCTRL2USAGE</B>&nbsp;部件界面引擎2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewCtrlRefUsageAll} 
     */
    public final static String FIELD_REFCTRL2USAGE = "refctrl2usage";

    /**
     * 设置 部件界面引擎2
     * 
     * @param refCtrl2Usage
     * 
     */
    @JsonProperty(FIELD_REFCTRL2USAGE)
    public void setRefCtrl2Usage(String refCtrl2Usage){
        this.set(FIELD_REFCTRL2USAGE, refCtrl2Usage);
    }
    
    /**
     * 获取 部件界面引擎2  
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
     * 判断 部件界面引擎2 是否指定值，包括空值
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
     * 重置 部件界面引擎2
     */
    @JsonIgnore
    public void resetRefCtrl2Usage(){
        this.reset(FIELD_REFCTRL2USAGE);
    }

    /**
     * 设置 部件界面引擎2
     * <P>
     * 等同 {@link #setRefCtrl2Usage}
     * @param refCtrl2Usage
     */
    @JsonIgnore
    public PSDEViewCtrlDTO refctrl2usage(String refCtrl2Usage){
        this.setRefCtrl2Usage(refCtrl2Usage);
        return this;
    }

     /**
     * 设置 部件界面引擎2
     * <P>
     * 等同 {@link #setRefCtrl2Usage}
     * @param refCtrl2Usage
     */
    @JsonIgnore
    public PSDEViewCtrlDTO refctrl2usage(net.ibizsys.model.PSModelEnums.ViewCtrlRefUsageAll refCtrl2Usage){
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
    public PSDEViewCtrlDTO refctrl2usagetext(String refCtrl2UsageText){
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
    public PSDEViewCtrlDTO refctrlname(String refCtrlName){
        this.setRefCtrlName(refCtrlName);
        return this;
    }

    /**
     * <B>REFCTRLUSAGE</B>&nbsp;部件界面引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ViewCtrlRefUsageAll} 
     */
    public final static String FIELD_REFCTRLUSAGE = "refctrlusage";

    /**
     * 设置 部件界面引擎
     * 
     * @param refCtrlUsage
     * 
     */
    @JsonProperty(FIELD_REFCTRLUSAGE)
    public void setRefCtrlUsage(String refCtrlUsage){
        this.set(FIELD_REFCTRLUSAGE, refCtrlUsage);
    }
    
    /**
     * 获取 部件界面引擎  
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
     * 判断 部件界面引擎 是否指定值，包括空值
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
     * 重置 部件界面引擎
     */
    @JsonIgnore
    public void resetRefCtrlUsage(){
        this.reset(FIELD_REFCTRLUSAGE);
    }

    /**
     * 设置 部件界面引擎
     * <P>
     * 等同 {@link #setRefCtrlUsage}
     * @param refCtrlUsage
     */
    @JsonIgnore
    public PSDEViewCtrlDTO refctrlusage(String refCtrlUsage){
        this.setRefCtrlUsage(refCtrlUsage);
        return this;
    }

     /**
     * 设置 部件界面引擎
     * <P>
     * 等同 {@link #setRefCtrlUsage}
     * @param refCtrlUsage
     */
    @JsonIgnore
    public PSDEViewCtrlDTO refctrlusage(net.ibizsys.model.PSModelEnums.ViewCtrlRefUsageAll refCtrlUsage){
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
    public PSDEViewCtrlDTO refctrlusagetext(String refCtrlUsageText){
        this.setRefCtrlUsageText(refCtrlUsageText);
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
    public PSDEViewCtrlDTO rightpos(Integer rightPos){
        this.setRightPos(rightPos);
        return this;
    }

    /**
     * <B>SUBPSACHANDLERID</B>&nbsp;子部件处理对象，指定部件子部件的处理对象，某些部件包含了有处理能力的子部件，通过这个参数为子部件指定处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_SUBPSACHANDLERID = "subpsachandlerid";

    /**
     * 设置 子部件处理对象，详细说明：{@link #FIELD_SUBPSACHANDLERID}
     * 
     * @param subPSACHandlerId
     * 
     */
    @JsonProperty(FIELD_SUBPSACHANDLERID)
    public void setSubPSACHandlerId(String subPSACHandlerId){
        this.set(FIELD_SUBPSACHANDLERID, subPSACHandlerId);
    }
    
    /**
     * 获取 子部件处理对象  
     * @return
     */
    @JsonIgnore
    public String getSubPSACHandlerId(){
        Object objValue = this.get(FIELD_SUBPSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子部件处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubPSACHandlerIdDirty(){
        if(this.contains(FIELD_SUBPSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子部件处理对象
     */
    @JsonIgnore
    public void resetSubPSACHandlerId(){
        this.reset(FIELD_SUBPSACHANDLERID);
    }

    /**
     * 设置 子部件处理对象，详细说明：{@link #FIELD_SUBPSACHANDLERID}
     * <P>
     * 等同 {@link #setSubPSACHandlerId}
     * @param subPSACHandlerId
     */
    @JsonIgnore
    public PSDEViewCtrlDTO subpsachandlerid(String subPSACHandlerId){
        this.setSubPSACHandlerId(subPSACHandlerId);
        return this;
    }

    /**
     * 设置 子部件处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEViewCtrlDTO subpsachandlerid(PSACHandlerDTO pSACHandler){
        if(pSACHandler == null){
            this.setSubPSACHandlerId(null);
            this.setSubPSACHandlerName(null);
        }
        else{
            this.setSubPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setSubPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>SUBPSACHANDLERNAME</B>&nbsp;子部件处理对象，指定部件子部件的处理对象，某些部件包含了有处理能力的子部件，通过这个参数为子部件指定处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBPSACHANDLERID}
     */
    public final static String FIELD_SUBPSACHANDLERNAME = "subpsachandlername";

    /**
     * 设置 子部件处理对象，详细说明：{@link #FIELD_SUBPSACHANDLERNAME}
     * 
     * @param subPSACHandlerName
     * 
     */
    @JsonProperty(FIELD_SUBPSACHANDLERNAME)
    public void setSubPSACHandlerName(String subPSACHandlerName){
        this.set(FIELD_SUBPSACHANDLERNAME, subPSACHandlerName);
    }
    
    /**
     * 获取 子部件处理对象  
     * @return
     */
    @JsonIgnore
    public String getSubPSACHandlerName(){
        Object objValue = this.get(FIELD_SUBPSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子部件处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubPSACHandlerNameDirty(){
        if(this.contains(FIELD_SUBPSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子部件处理对象
     */
    @JsonIgnore
    public void resetSubPSACHandlerName(){
        this.reset(FIELD_SUBPSACHANDLERNAME);
    }

    /**
     * 设置 子部件处理对象，详细说明：{@link #FIELD_SUBPSACHANDLERNAME}
     * <P>
     * 等同 {@link #setSubPSACHandlerName}
     * @param subPSACHandlerName
     */
    @JsonIgnore
    public PSDEViewCtrlDTO subpsachandlername(String subPSACHandlerName){
        this.setSubPSACHandlerName(subPSACHandlerName);
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
    public PSDEViewCtrlDTO toppos(Integer topPos){
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
    public PSDEViewCtrlDTO updatedate(Timestamp updateDate){
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
    public PSDEViewCtrlDTO updateman(String updateMan){
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
    public PSDEViewCtrlDTO usertag(String userTag){
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
    public PSDEViewCtrlDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用，指定部件是否被启用，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VALIDFLAG = "validflag";

    /**
     * 设置 启用，详细说明：{@link #FIELD_VALIDFLAG}
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
     * 设置 启用，详细说明：{@link #FIELD_VALIDFLAG}
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSDEViewCtrlDTO validflag(Integer validFlag){
        this.setValidFlag(validFlag);
        return this;
    }

     /**
     * 设置 启用，详细说明：{@link #FIELD_VALIDFLAG}
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSDEViewCtrlDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定部件的宽度，未定义时为【0】
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Double width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
     * @return
     */
    @JsonIgnore
    public Double getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
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
    public PSDEViewCtrlDTO width(Double width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEViewCtrlId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEViewCtrlId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEViewCtrlId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEViewCtrlId(strValue);
    }

    @JsonIgnore
    public PSDEViewCtrlDTO id(String strValue){
        this.setPSDEViewCtrlId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEViewCtrlDTO){
            PSDEViewCtrlDTO dto = (PSDEViewCtrlDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
