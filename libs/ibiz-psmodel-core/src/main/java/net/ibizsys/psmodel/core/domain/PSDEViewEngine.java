package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEVIEWENGINE</B>实体视图界面引擎 模型传输对象
 * <P>
 * 实体视图挂接的界面引擎模型，界面引擎是预置的界面交互逻辑，视图挂接引擎并指定引擎需要的参数
 */
public class PSDEViewEngine extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEViewEngine(){
        this.setValidFlag(1);
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
    public PSDEViewEngine createdate(String createDate){
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
    public PSDEViewEngine createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEVIEWCTRLFLAG</B>&nbsp;启用视图部件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEVIEWCTRLFLAG = "deviewctrlflag";

    /**
     * 设置 启用视图部件
     * 
     * @param dEViewCtrlFlag
     * 
     */
    @JsonProperty(FIELD_DEVIEWCTRLFLAG)
    public void setDEViewCtrlFlag(Integer dEViewCtrlFlag){
        this.set(FIELD_DEVIEWCTRLFLAG, dEViewCtrlFlag);
    }
    
    /**
     * 获取 启用视图部件  
     * @return
     */
    @JsonIgnore
    public Integer getDEViewCtrlFlag(){
        Object objValue = this.get(FIELD_DEVIEWCTRLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewCtrlFlagDirty(){
        if(this.contains(FIELD_DEVIEWCTRLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图部件
     */
    @JsonIgnore
    public void resetDEViewCtrlFlag(){
        this.reset(FIELD_DEVIEWCTRLFLAG);
    }

    /**
     * 设置 启用视图部件
     * <P>
     * 等同 {@link #setDEViewCtrlFlag}
     * @param dEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine deviewctrlflag(Integer dEViewCtrlFlag){
        this.setDEViewCtrlFlag(dEViewCtrlFlag);
        return this;
    }

     /**
     * 设置 启用视图部件
     * <P>
     * 等同 {@link #setDEViewCtrlFlag}
     * @param dEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine deviewctrlflag(Boolean dEViewCtrlFlag){
        if(dEViewCtrlFlag == null){
            this.setDEViewCtrlFlag(null);
        }
        else{
            this.setDEViewCtrlFlag(dEViewCtrlFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEVIEWCTRLLABEL</B>&nbsp;视图部件标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_DEVIEWCTRLLABEL = "deviewctrllabel";

    /**
     * 设置 视图部件标签
     * 
     * @param dEViewCtrlLabel
     * 
     */
    @JsonProperty(FIELD_DEVIEWCTRLLABEL)
    public void setDEViewCtrlLabel(String dEViewCtrlLabel){
        this.set(FIELD_DEVIEWCTRLLABEL, dEViewCtrlLabel);
    }
    
    /**
     * 获取 视图部件标签  
     * @return
     */
    @JsonIgnore
    public String getDEViewCtrlLabel(){
        Object objValue = this.get(FIELD_DEVIEWCTRLLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewCtrlLabelDirty(){
        if(this.contains(FIELD_DEVIEWCTRLLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件标签
     */
    @JsonIgnore
    public void resetDEViewCtrlLabel(){
        this.reset(FIELD_DEVIEWCTRLLABEL);
    }

    /**
     * 设置 视图部件标签
     * <P>
     * 等同 {@link #setDEViewCtrlLabel}
     * @param dEViewCtrlLabel
     */
    @JsonIgnore
    public PSDEViewEngine deviewctrllabel(String dEViewCtrlLabel){
        this.setDEViewCtrlLabel(dEViewCtrlLabel);
        return this;
    }

    /**
     * <B>DEVIEWLOGICFLAG</B>&nbsp;启用视图逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEVIEWLOGICFLAG = "deviewlogicflag";

    /**
     * 设置 启用视图逻辑
     * 
     * @param dEViewLogicFlag
     * 
     */
    @JsonProperty(FIELD_DEVIEWLOGICFLAG)
    public void setDEViewLogicFlag(Integer dEViewLogicFlag){
        this.set(FIELD_DEVIEWLOGICFLAG, dEViewLogicFlag);
    }
    
    /**
     * 获取 启用视图逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getDEViewLogicFlag(){
        Object objValue = this.get(FIELD_DEVIEWLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewLogicFlagDirty(){
        if(this.contains(FIELD_DEVIEWLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图逻辑
     */
    @JsonIgnore
    public void resetDEViewLogicFlag(){
        this.reset(FIELD_DEVIEWLOGICFLAG);
    }

    /**
     * 设置 启用视图逻辑
     * <P>
     * 等同 {@link #setDEViewLogicFlag}
     * @param dEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine deviewlogicflag(Integer dEViewLogicFlag){
        this.setDEViewLogicFlag(dEViewLogicFlag);
        return this;
    }

     /**
     * 设置 启用视图逻辑
     * <P>
     * 等同 {@link #setDEViewLogicFlag}
     * @param dEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine deviewlogicflag(Boolean dEViewLogicFlag){
        if(dEViewLogicFlag == null){
            this.setDEViewLogicFlag(null);
        }
        else{
            this.setDEViewLogicFlag(dEViewLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEVIEWLOGICLABEL</B>&nbsp;视图逻辑标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_DEVIEWLOGICLABEL = "deviewlogiclabel";

    /**
     * 设置 视图逻辑标签
     * 
     * @param dEViewLogicLabel
     * 
     */
    @JsonProperty(FIELD_DEVIEWLOGICLABEL)
    public void setDEViewLogicLabel(String dEViewLogicLabel){
        this.set(FIELD_DEVIEWLOGICLABEL, dEViewLogicLabel);
    }
    
    /**
     * 获取 视图逻辑标签  
     * @return
     */
    @JsonIgnore
    public String getDEViewLogicLabel(){
        Object objValue = this.get(FIELD_DEVIEWLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewLogicLabelDirty(){
        if(this.contains(FIELD_DEVIEWLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑标签
     */
    @JsonIgnore
    public void resetDEViewLogicLabel(){
        this.reset(FIELD_DEVIEWLOGICLABEL);
    }

    /**
     * 设置 视图逻辑标签
     * <P>
     * 等同 {@link #setDEViewLogicLabel}
     * @param dEViewLogicLabel
     */
    @JsonIgnore
    public PSDEViewEngine deviewlogiclabel(String dEViewLogicLabel){
        this.setDEViewLogicLabel(dEViewLogicLabel);
        return this;
    }

    /**
     * <B>ENGINEOPTION</B>&nbsp;引擎配置
     */
    public final static String FIELD_ENGINEOPTION = "engineoption";

    /**
     * 设置 引擎配置
     * 
     * @param engineOption
     * 
     */
    @JsonProperty(FIELD_ENGINEOPTION)
    public void setEngineOption(String engineOption){
        this.set(FIELD_ENGINEOPTION, engineOption);
    }
    
    /**
     * 获取 引擎配置  
     * @return
     */
    @JsonIgnore
    public String getEngineOption(){
        Object objValue = this.get(FIELD_ENGINEOPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineOptionDirty(){
        if(this.contains(FIELD_ENGINEOPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎配置
     */
    @JsonIgnore
    public void resetEngineOption(){
        this.reset(FIELD_ENGINEOPTION);
    }

    /**
     * 设置 引擎配置
     * <P>
     * 等同 {@link #setEngineOption}
     * @param engineOption
     */
    @JsonIgnore
    public PSDEViewEngine engineoption(String engineOption){
        this.setEngineOption(engineOption);
        return this;
    }

    /**
     * <B>ENGINEPARAM</B>&nbsp;引擎参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ENGINEPARAM = "engineparam";

    /**
     * 设置 引擎参数
     * 
     * @param engineParam
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM)
    public void setEngineParam(String engineParam){
        this.set(FIELD_ENGINEPARAM, engineParam);
    }
    
    /**
     * 获取 引擎参数  
     * @return
     */
    @JsonIgnore
    public String getEngineParam(){
        Object objValue = this.get(FIELD_ENGINEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParamDirty(){
        if(this.contains(FIELD_ENGINEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数
     */
    @JsonIgnore
    public void resetEngineParam(){
        this.reset(FIELD_ENGINEPARAM);
    }

    /**
     * 设置 引擎参数
     * <P>
     * 等同 {@link #setEngineParam}
     * @param engineParam
     */
    @JsonIgnore
    public PSDEViewEngine engineparam(String engineParam){
        this.setEngineParam(engineParam);
        return this;
    }

    /**
     * <B>ENGINEPARAM10</B>&nbsp;引擎参数10
     */
    public final static String FIELD_ENGINEPARAM10 = "engineparam10";

    /**
     * 设置 引擎参数10
     * 
     * @param engineParam10
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM10)
    public void setEngineParam10(Integer engineParam10){
        this.set(FIELD_ENGINEPARAM10, engineParam10);
    }
    
    /**
     * 获取 引擎参数10  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam10(){
        Object objValue = this.get(FIELD_ENGINEPARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam10Dirty(){
        if(this.contains(FIELD_ENGINEPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数10
     */
    @JsonIgnore
    public void resetEngineParam10(){
        this.reset(FIELD_ENGINEPARAM10);
    }

    /**
     * 设置 引擎参数10
     * <P>
     * 等同 {@link #setEngineParam10}
     * @param engineParam10
     */
    @JsonIgnore
    public PSDEViewEngine engineparam10(Integer engineParam10){
        this.setEngineParam10(engineParam10);
        return this;
    }

    /**
     * <B>ENGINEPARAM10FLAG</B>&nbsp;启用引擎参数10
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM10FLAG = "engineparam10flag";

    /**
     * 设置 启用引擎参数10
     * 
     * @param engineParam10Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM10FLAG)
    public void setEngineParam10Flag(Integer engineParam10Flag){
        this.set(FIELD_ENGINEPARAM10FLAG, engineParam10Flag);
    }
    
    /**
     * 获取 启用引擎参数10  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam10Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM10FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam10FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM10FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数10
     */
    @JsonIgnore
    public void resetEngineParam10Flag(){
        this.reset(FIELD_ENGINEPARAM10FLAG);
    }

    /**
     * 设置 启用引擎参数10
     * <P>
     * 等同 {@link #setEngineParam10Flag}
     * @param engineParam10Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam10flag(Integer engineParam10Flag){
        this.setEngineParam10Flag(engineParam10Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数10
     * <P>
     * 等同 {@link #setEngineParam10Flag}
     * @param engineParam10Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam10flag(Boolean engineParam10Flag){
        if(engineParam10Flag == null){
            this.setEngineParam10Flag(null);
        }
        else{
            this.setEngineParam10Flag(engineParam10Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM10LABEL</B>&nbsp;视图引擎参数10标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM10LABEL = "engineparam10label";

    /**
     * 设置 视图引擎参数10标签
     * 
     * @param engineParam10Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM10LABEL)
    public void setEngineParam10Label(String engineParam10Label){
        this.set(FIELD_ENGINEPARAM10LABEL, engineParam10Label);
    }
    
    /**
     * 获取 视图引擎参数10标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam10Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM10LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数10标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam10LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM10LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数10标签
     */
    @JsonIgnore
    public void resetEngineParam10Label(){
        this.reset(FIELD_ENGINEPARAM10LABEL);
    }

    /**
     * 设置 视图引擎参数10标签
     * <P>
     * 等同 {@link #setEngineParam10Label}
     * @param engineParam10Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam10label(String engineParam10Label){
        this.setEngineParam10Label(engineParam10Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM2</B>&nbsp;引擎参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ENGINEPARAM2 = "engineparam2";

    /**
     * 设置 引擎参数2
     * 
     * @param engineParam2
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM2)
    public void setEngineParam2(String engineParam2){
        this.set(FIELD_ENGINEPARAM2, engineParam2);
    }
    
    /**
     * 获取 引擎参数2  
     * @return
     */
    @JsonIgnore
    public String getEngineParam2(){
        Object objValue = this.get(FIELD_ENGINEPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam2Dirty(){
        if(this.contains(FIELD_ENGINEPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数2
     */
    @JsonIgnore
    public void resetEngineParam2(){
        this.reset(FIELD_ENGINEPARAM2);
    }

    /**
     * 设置 引擎参数2
     * <P>
     * 等同 {@link #setEngineParam2}
     * @param engineParam2
     */
    @JsonIgnore
    public PSDEViewEngine engineparam2(String engineParam2){
        this.setEngineParam2(engineParam2);
        return this;
    }

    /**
     * <B>ENGINEPARAM2FLAG</B>&nbsp;启用引擎参数2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM2FLAG = "engineparam2flag";

    /**
     * 设置 启用引擎参数2
     * 
     * @param engineParam2Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM2FLAG)
    public void setEngineParam2Flag(Integer engineParam2Flag){
        this.set(FIELD_ENGINEPARAM2FLAG, engineParam2Flag);
    }
    
    /**
     * 获取 启用引擎参数2  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam2Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM2FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam2FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM2FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数2
     */
    @JsonIgnore
    public void resetEngineParam2Flag(){
        this.reset(FIELD_ENGINEPARAM2FLAG);
    }

    /**
     * 设置 启用引擎参数2
     * <P>
     * 等同 {@link #setEngineParam2Flag}
     * @param engineParam2Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam2flag(Integer engineParam2Flag){
        this.setEngineParam2Flag(engineParam2Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数2
     * <P>
     * 等同 {@link #setEngineParam2Flag}
     * @param engineParam2Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam2flag(Boolean engineParam2Flag){
        if(engineParam2Flag == null){
            this.setEngineParam2Flag(null);
        }
        else{
            this.setEngineParam2Flag(engineParam2Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM2LABEL</B>&nbsp;视图引擎参数2标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM2LABEL = "engineparam2label";

    /**
     * 设置 视图引擎参数2标签
     * 
     * @param engineParam2Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM2LABEL)
    public void setEngineParam2Label(String engineParam2Label){
        this.set(FIELD_ENGINEPARAM2LABEL, engineParam2Label);
    }
    
    /**
     * 获取 视图引擎参数2标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam2Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM2LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数2标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam2LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM2LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数2标签
     */
    @JsonIgnore
    public void resetEngineParam2Label(){
        this.reset(FIELD_ENGINEPARAM2LABEL);
    }

    /**
     * 设置 视图引擎参数2标签
     * <P>
     * 等同 {@link #setEngineParam2Label}
     * @param engineParam2Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam2label(String engineParam2Label){
        this.setEngineParam2Label(engineParam2Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM3</B>&nbsp;引擎参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ENGINEPARAM3 = "engineparam3";

    /**
     * 设置 引擎参数3
     * 
     * @param engineParam3
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM3)
    public void setEngineParam3(String engineParam3){
        this.set(FIELD_ENGINEPARAM3, engineParam3);
    }
    
    /**
     * 获取 引擎参数3  
     * @return
     */
    @JsonIgnore
    public String getEngineParam3(){
        Object objValue = this.get(FIELD_ENGINEPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam3Dirty(){
        if(this.contains(FIELD_ENGINEPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数3
     */
    @JsonIgnore
    public void resetEngineParam3(){
        this.reset(FIELD_ENGINEPARAM3);
    }

    /**
     * 设置 引擎参数3
     * <P>
     * 等同 {@link #setEngineParam3}
     * @param engineParam3
     */
    @JsonIgnore
    public PSDEViewEngine engineparam3(String engineParam3){
        this.setEngineParam3(engineParam3);
        return this;
    }

    /**
     * <B>ENGINEPARAM3FLAG</B>&nbsp;启用引擎参数3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM3FLAG = "engineparam3flag";

    /**
     * 设置 启用引擎参数3
     * 
     * @param engineParam3Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM3FLAG)
    public void setEngineParam3Flag(Integer engineParam3Flag){
        this.set(FIELD_ENGINEPARAM3FLAG, engineParam3Flag);
    }
    
    /**
     * 获取 启用引擎参数3  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam3Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM3FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam3FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM3FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数3
     */
    @JsonIgnore
    public void resetEngineParam3Flag(){
        this.reset(FIELD_ENGINEPARAM3FLAG);
    }

    /**
     * 设置 启用引擎参数3
     * <P>
     * 等同 {@link #setEngineParam3Flag}
     * @param engineParam3Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam3flag(Integer engineParam3Flag){
        this.setEngineParam3Flag(engineParam3Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数3
     * <P>
     * 等同 {@link #setEngineParam3Flag}
     * @param engineParam3Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam3flag(Boolean engineParam3Flag){
        if(engineParam3Flag == null){
            this.setEngineParam3Flag(null);
        }
        else{
            this.setEngineParam3Flag(engineParam3Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM3LABEL</B>&nbsp;视图引擎参数3标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM3LABEL = "engineparam3label";

    /**
     * 设置 视图引擎参数3标签
     * 
     * @param engineParam3Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM3LABEL)
    public void setEngineParam3Label(String engineParam3Label){
        this.set(FIELD_ENGINEPARAM3LABEL, engineParam3Label);
    }
    
    /**
     * 获取 视图引擎参数3标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam3Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM3LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数3标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam3LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM3LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数3标签
     */
    @JsonIgnore
    public void resetEngineParam3Label(){
        this.reset(FIELD_ENGINEPARAM3LABEL);
    }

    /**
     * 设置 视图引擎参数3标签
     * <P>
     * 等同 {@link #setEngineParam3Label}
     * @param engineParam3Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam3label(String engineParam3Label){
        this.setEngineParam3Label(engineParam3Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM4</B>&nbsp;引擎参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ENGINEPARAM4 = "engineparam4";

    /**
     * 设置 引擎参数4
     * 
     * @param engineParam4
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM4)
    public void setEngineParam4(String engineParam4){
        this.set(FIELD_ENGINEPARAM4, engineParam4);
    }
    
    /**
     * 获取 引擎参数4  
     * @return
     */
    @JsonIgnore
    public String getEngineParam4(){
        Object objValue = this.get(FIELD_ENGINEPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam4Dirty(){
        if(this.contains(FIELD_ENGINEPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数4
     */
    @JsonIgnore
    public void resetEngineParam4(){
        this.reset(FIELD_ENGINEPARAM4);
    }

    /**
     * 设置 引擎参数4
     * <P>
     * 等同 {@link #setEngineParam4}
     * @param engineParam4
     */
    @JsonIgnore
    public PSDEViewEngine engineparam4(String engineParam4){
        this.setEngineParam4(engineParam4);
        return this;
    }

    /**
     * <B>ENGINEPARAM4FLAG</B>&nbsp;启用引擎参数4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM4FLAG = "engineparam4flag";

    /**
     * 设置 启用引擎参数4
     * 
     * @param engineParam4Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM4FLAG)
    public void setEngineParam4Flag(Integer engineParam4Flag){
        this.set(FIELD_ENGINEPARAM4FLAG, engineParam4Flag);
    }
    
    /**
     * 获取 启用引擎参数4  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam4Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM4FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam4FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM4FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数4
     */
    @JsonIgnore
    public void resetEngineParam4Flag(){
        this.reset(FIELD_ENGINEPARAM4FLAG);
    }

    /**
     * 设置 启用引擎参数4
     * <P>
     * 等同 {@link #setEngineParam4Flag}
     * @param engineParam4Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam4flag(Integer engineParam4Flag){
        this.setEngineParam4Flag(engineParam4Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数4
     * <P>
     * 等同 {@link #setEngineParam4Flag}
     * @param engineParam4Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam4flag(Boolean engineParam4Flag){
        if(engineParam4Flag == null){
            this.setEngineParam4Flag(null);
        }
        else{
            this.setEngineParam4Flag(engineParam4Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM4LABEL</B>&nbsp;视图引擎参数4标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM4LABEL = "engineparam4label";

    /**
     * 设置 视图引擎参数4标签
     * 
     * @param engineParam4Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM4LABEL)
    public void setEngineParam4Label(String engineParam4Label){
        this.set(FIELD_ENGINEPARAM4LABEL, engineParam4Label);
    }
    
    /**
     * 获取 视图引擎参数4标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam4Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM4LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数4标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam4LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM4LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数4标签
     */
    @JsonIgnore
    public void resetEngineParam4Label(){
        this.reset(FIELD_ENGINEPARAM4LABEL);
    }

    /**
     * 设置 视图引擎参数4标签
     * <P>
     * 等同 {@link #setEngineParam4Label}
     * @param engineParam4Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam4label(String engineParam4Label){
        this.setEngineParam4Label(engineParam4Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM5</B>&nbsp;引擎参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM5 = "engineparam5";

    /**
     * 设置 引擎参数5
     * 
     * @param engineParam5
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM5)
    public void setEngineParam5(Integer engineParam5){
        this.set(FIELD_ENGINEPARAM5, engineParam5);
    }
    
    /**
     * 获取 引擎参数5  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam5(){
        Object objValue = this.get(FIELD_ENGINEPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam5Dirty(){
        if(this.contains(FIELD_ENGINEPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数5
     */
    @JsonIgnore
    public void resetEngineParam5(){
        this.reset(FIELD_ENGINEPARAM5);
    }

    /**
     * 设置 引擎参数5
     * <P>
     * 等同 {@link #setEngineParam5}
     * @param engineParam5
     */
    @JsonIgnore
    public PSDEViewEngine engineparam5(Integer engineParam5){
        this.setEngineParam5(engineParam5);
        return this;
    }

     /**
     * 设置 引擎参数5
     * <P>
     * 等同 {@link #setEngineParam5}
     * @param engineParam5
     */
    @JsonIgnore
    public PSDEViewEngine engineparam5(Boolean engineParam5){
        if(engineParam5 == null){
            this.setEngineParam5(null);
        }
        else{
            this.setEngineParam5(engineParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM5FLAG</B>&nbsp;启用引擎参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM5FLAG = "engineparam5flag";

    /**
     * 设置 启用引擎参数5
     * 
     * @param engineParam5Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM5FLAG)
    public void setEngineParam5Flag(Integer engineParam5Flag){
        this.set(FIELD_ENGINEPARAM5FLAG, engineParam5Flag);
    }
    
    /**
     * 获取 启用引擎参数5  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam5Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM5FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam5FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM5FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数5
     */
    @JsonIgnore
    public void resetEngineParam5Flag(){
        this.reset(FIELD_ENGINEPARAM5FLAG);
    }

    /**
     * 设置 启用引擎参数5
     * <P>
     * 等同 {@link #setEngineParam5Flag}
     * @param engineParam5Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam5flag(Integer engineParam5Flag){
        this.setEngineParam5Flag(engineParam5Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数5
     * <P>
     * 等同 {@link #setEngineParam5Flag}
     * @param engineParam5Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam5flag(Boolean engineParam5Flag){
        if(engineParam5Flag == null){
            this.setEngineParam5Flag(null);
        }
        else{
            this.setEngineParam5Flag(engineParam5Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM5LABEL</B>&nbsp;视图引擎参数5标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM5LABEL = "engineparam5label";

    /**
     * 设置 视图引擎参数5标签
     * 
     * @param engineParam5Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM5LABEL)
    public void setEngineParam5Label(String engineParam5Label){
        this.set(FIELD_ENGINEPARAM5LABEL, engineParam5Label);
    }
    
    /**
     * 获取 视图引擎参数5标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam5Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM5LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数5标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam5LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM5LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数5标签
     */
    @JsonIgnore
    public void resetEngineParam5Label(){
        this.reset(FIELD_ENGINEPARAM5LABEL);
    }

    /**
     * 设置 视图引擎参数5标签
     * <P>
     * 等同 {@link #setEngineParam5Label}
     * @param engineParam5Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam5label(String engineParam5Label){
        this.setEngineParam5Label(engineParam5Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM6</B>&nbsp;引擎参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM6 = "engineparam6";

    /**
     * 设置 引擎参数6
     * 
     * @param engineParam6
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM6)
    public void setEngineParam6(Integer engineParam6){
        this.set(FIELD_ENGINEPARAM6, engineParam6);
    }
    
    /**
     * 获取 引擎参数6  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam6(){
        Object objValue = this.get(FIELD_ENGINEPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam6Dirty(){
        if(this.contains(FIELD_ENGINEPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数6
     */
    @JsonIgnore
    public void resetEngineParam6(){
        this.reset(FIELD_ENGINEPARAM6);
    }

    /**
     * 设置 引擎参数6
     * <P>
     * 等同 {@link #setEngineParam6}
     * @param engineParam6
     */
    @JsonIgnore
    public PSDEViewEngine engineparam6(Integer engineParam6){
        this.setEngineParam6(engineParam6);
        return this;
    }

     /**
     * 设置 引擎参数6
     * <P>
     * 等同 {@link #setEngineParam6}
     * @param engineParam6
     */
    @JsonIgnore
    public PSDEViewEngine engineparam6(Boolean engineParam6){
        if(engineParam6 == null){
            this.setEngineParam6(null);
        }
        else{
            this.setEngineParam6(engineParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM6FLAG</B>&nbsp;启用引擎参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM6FLAG = "engineparam6flag";

    /**
     * 设置 启用引擎参数6
     * 
     * @param engineParam6Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM6FLAG)
    public void setEngineParam6Flag(Integer engineParam6Flag){
        this.set(FIELD_ENGINEPARAM6FLAG, engineParam6Flag);
    }
    
    /**
     * 获取 启用引擎参数6  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam6Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM6FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam6FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM6FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数6
     */
    @JsonIgnore
    public void resetEngineParam6Flag(){
        this.reset(FIELD_ENGINEPARAM6FLAG);
    }

    /**
     * 设置 启用引擎参数6
     * <P>
     * 等同 {@link #setEngineParam6Flag}
     * @param engineParam6Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam6flag(Integer engineParam6Flag){
        this.setEngineParam6Flag(engineParam6Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数6
     * <P>
     * 等同 {@link #setEngineParam6Flag}
     * @param engineParam6Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam6flag(Boolean engineParam6Flag){
        if(engineParam6Flag == null){
            this.setEngineParam6Flag(null);
        }
        else{
            this.setEngineParam6Flag(engineParam6Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM6LABEL</B>&nbsp;视图引擎参数6标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM6LABEL = "engineparam6label";

    /**
     * 设置 视图引擎参数6标签
     * 
     * @param engineParam6Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM6LABEL)
    public void setEngineParam6Label(String engineParam6Label){
        this.set(FIELD_ENGINEPARAM6LABEL, engineParam6Label);
    }
    
    /**
     * 获取 视图引擎参数6标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam6Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM6LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数6标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam6LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM6LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数6标签
     */
    @JsonIgnore
    public void resetEngineParam6Label(){
        this.reset(FIELD_ENGINEPARAM6LABEL);
    }

    /**
     * 设置 视图引擎参数6标签
     * <P>
     * 等同 {@link #setEngineParam6Label}
     * @param engineParam6Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam6label(String engineParam6Label){
        this.setEngineParam6Label(engineParam6Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM7</B>&nbsp;引擎参数7
     */
    public final static String FIELD_ENGINEPARAM7 = "engineparam7";

    /**
     * 设置 引擎参数7
     * 
     * @param engineParam7
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM7)
    public void setEngineParam7(Integer engineParam7){
        this.set(FIELD_ENGINEPARAM7, engineParam7);
    }
    
    /**
     * 获取 引擎参数7  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam7(){
        Object objValue = this.get(FIELD_ENGINEPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam7Dirty(){
        if(this.contains(FIELD_ENGINEPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数7
     */
    @JsonIgnore
    public void resetEngineParam7(){
        this.reset(FIELD_ENGINEPARAM7);
    }

    /**
     * 设置 引擎参数7
     * <P>
     * 等同 {@link #setEngineParam7}
     * @param engineParam7
     */
    @JsonIgnore
    public PSDEViewEngine engineparam7(Integer engineParam7){
        this.setEngineParam7(engineParam7);
        return this;
    }

    /**
     * <B>ENGINEPARAM7FLAG</B>&nbsp;启用引擎参数7
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM7FLAG = "engineparam7flag";

    /**
     * 设置 启用引擎参数7
     * 
     * @param engineParam7Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM7FLAG)
    public void setEngineParam7Flag(Integer engineParam7Flag){
        this.set(FIELD_ENGINEPARAM7FLAG, engineParam7Flag);
    }
    
    /**
     * 获取 启用引擎参数7  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam7Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM7FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam7FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM7FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数7
     */
    @JsonIgnore
    public void resetEngineParam7Flag(){
        this.reset(FIELD_ENGINEPARAM7FLAG);
    }

    /**
     * 设置 启用引擎参数7
     * <P>
     * 等同 {@link #setEngineParam7Flag}
     * @param engineParam7Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam7flag(Integer engineParam7Flag){
        this.setEngineParam7Flag(engineParam7Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数7
     * <P>
     * 等同 {@link #setEngineParam7Flag}
     * @param engineParam7Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam7flag(Boolean engineParam7Flag){
        if(engineParam7Flag == null){
            this.setEngineParam7Flag(null);
        }
        else{
            this.setEngineParam7Flag(engineParam7Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM7LABEL</B>&nbsp;视图引擎参数7标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM7LABEL = "engineparam7label";

    /**
     * 设置 视图引擎参数7标签
     * 
     * @param engineParam7Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM7LABEL)
    public void setEngineParam7Label(String engineParam7Label){
        this.set(FIELD_ENGINEPARAM7LABEL, engineParam7Label);
    }
    
    /**
     * 获取 视图引擎参数7标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam7Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM7LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数7标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam7LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM7LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数7标签
     */
    @JsonIgnore
    public void resetEngineParam7Label(){
        this.reset(FIELD_ENGINEPARAM7LABEL);
    }

    /**
     * 设置 视图引擎参数7标签
     * <P>
     * 等同 {@link #setEngineParam7Label}
     * @param engineParam7Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam7label(String engineParam7Label){
        this.setEngineParam7Label(engineParam7Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM8</B>&nbsp;引擎参数8
     */
    public final static String FIELD_ENGINEPARAM8 = "engineparam8";

    /**
     * 设置 引擎参数8
     * 
     * @param engineParam8
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM8)
    public void setEngineParam8(Integer engineParam8){
        this.set(FIELD_ENGINEPARAM8, engineParam8);
    }
    
    /**
     * 获取 引擎参数8  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam8(){
        Object objValue = this.get(FIELD_ENGINEPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam8Dirty(){
        if(this.contains(FIELD_ENGINEPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数8
     */
    @JsonIgnore
    public void resetEngineParam8(){
        this.reset(FIELD_ENGINEPARAM8);
    }

    /**
     * 设置 引擎参数8
     * <P>
     * 等同 {@link #setEngineParam8}
     * @param engineParam8
     */
    @JsonIgnore
    public PSDEViewEngine engineparam8(Integer engineParam8){
        this.setEngineParam8(engineParam8);
        return this;
    }

    /**
     * <B>ENGINEPARAM8FLAG</B>&nbsp;启用引擎参数8
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM8FLAG = "engineparam8flag";

    /**
     * 设置 启用引擎参数8
     * 
     * @param engineParam8Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM8FLAG)
    public void setEngineParam8Flag(Integer engineParam8Flag){
        this.set(FIELD_ENGINEPARAM8FLAG, engineParam8Flag);
    }
    
    /**
     * 获取 启用引擎参数8  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam8Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM8FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam8FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM8FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数8
     */
    @JsonIgnore
    public void resetEngineParam8Flag(){
        this.reset(FIELD_ENGINEPARAM8FLAG);
    }

    /**
     * 设置 启用引擎参数8
     * <P>
     * 等同 {@link #setEngineParam8Flag}
     * @param engineParam8Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam8flag(Integer engineParam8Flag){
        this.setEngineParam8Flag(engineParam8Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数8
     * <P>
     * 等同 {@link #setEngineParam8Flag}
     * @param engineParam8Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam8flag(Boolean engineParam8Flag){
        if(engineParam8Flag == null){
            this.setEngineParam8Flag(null);
        }
        else{
            this.setEngineParam8Flag(engineParam8Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM8LABEL</B>&nbsp;视图引擎参数8标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM8LABEL = "engineparam8label";

    /**
     * 设置 视图引擎参数8标签
     * 
     * @param engineParam8Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM8LABEL)
    public void setEngineParam8Label(String engineParam8Label){
        this.set(FIELD_ENGINEPARAM8LABEL, engineParam8Label);
    }
    
    /**
     * 获取 视图引擎参数8标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam8Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM8LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数8标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam8LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM8LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数8标签
     */
    @JsonIgnore
    public void resetEngineParam8Label(){
        this.reset(FIELD_ENGINEPARAM8LABEL);
    }

    /**
     * 设置 视图引擎参数8标签
     * <P>
     * 等同 {@link #setEngineParam8Label}
     * @param engineParam8Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam8label(String engineParam8Label){
        this.setEngineParam8Label(engineParam8Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM9</B>&nbsp;引擎参数9
     */
    public final static String FIELD_ENGINEPARAM9 = "engineparam9";

    /**
     * 设置 引擎参数9
     * 
     * @param engineParam9
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM9)
    public void setEngineParam9(Integer engineParam9){
        this.set(FIELD_ENGINEPARAM9, engineParam9);
    }
    
    /**
     * 获取 引擎参数9  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam9(){
        Object objValue = this.get(FIELD_ENGINEPARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引擎参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam9Dirty(){
        if(this.contains(FIELD_ENGINEPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎参数9
     */
    @JsonIgnore
    public void resetEngineParam9(){
        this.reset(FIELD_ENGINEPARAM9);
    }

    /**
     * 设置 引擎参数9
     * <P>
     * 等同 {@link #setEngineParam9}
     * @param engineParam9
     */
    @JsonIgnore
    public PSDEViewEngine engineparam9(Integer engineParam9){
        this.setEngineParam9(engineParam9);
        return this;
    }

    /**
     * <B>ENGINEPARAM9FLAG</B>&nbsp;启用引擎参数9
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM9FLAG = "engineparam9flag";

    /**
     * 设置 启用引擎参数9
     * 
     * @param engineParam9Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM9FLAG)
    public void setEngineParam9Flag(Integer engineParam9Flag){
        this.set(FIELD_ENGINEPARAM9FLAG, engineParam9Flag);
    }
    
    /**
     * 获取 启用引擎参数9  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParam9Flag(){
        Object objValue = this.get(FIELD_ENGINEPARAM9FLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam9FlagDirty(){
        if(this.contains(FIELD_ENGINEPARAM9FLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数9
     */
    @JsonIgnore
    public void resetEngineParam9Flag(){
        this.reset(FIELD_ENGINEPARAM9FLAG);
    }

    /**
     * 设置 启用引擎参数9
     * <P>
     * 等同 {@link #setEngineParam9Flag}
     * @param engineParam9Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam9flag(Integer engineParam9Flag){
        this.setEngineParam9Flag(engineParam9Flag);
        return this;
    }

     /**
     * 设置 启用引擎参数9
     * <P>
     * 等同 {@link #setEngineParam9Flag}
     * @param engineParam9Flag
     */
    @JsonIgnore
    public PSDEViewEngine engineparam9flag(Boolean engineParam9Flag){
        if(engineParam9Flag == null){
            this.setEngineParam9Flag(null);
        }
        else{
            this.setEngineParam9Flag(engineParam9Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM9LABEL</B>&nbsp;视图引擎参数9标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM9LABEL = "engineparam9label";

    /**
     * 设置 视图引擎参数9标签
     * 
     * @param engineParam9Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM9LABEL)
    public void setEngineParam9Label(String engineParam9Label){
        this.set(FIELD_ENGINEPARAM9LABEL, engineParam9Label);
    }
    
    /**
     * 获取 视图引擎参数9标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParam9Label(){
        Object objValue = this.get(FIELD_ENGINEPARAM9LABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数9标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParam9LabelDirty(){
        if(this.contains(FIELD_ENGINEPARAM9LABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数9标签
     */
    @JsonIgnore
    public void resetEngineParam9Label(){
        this.reset(FIELD_ENGINEPARAM9LABEL);
    }

    /**
     * 设置 视图引擎参数9标签
     * <P>
     * 等同 {@link #setEngineParam9Label}
     * @param engineParam9Label
     */
    @JsonIgnore
    public PSDEViewEngine engineparam9label(String engineParam9Label){
        this.setEngineParam9Label(engineParam9Label);
        return this;
    }

    /**
     * <B>ENGINEPARAMFLAG</B>&nbsp;启用引擎参数
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAMFLAG = "engineparamflag";

    /**
     * 设置 启用引擎参数
     * 
     * @param engineParamFlag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAMFLAG)
    public void setEngineParamFlag(Integer engineParamFlag){
        this.set(FIELD_ENGINEPARAMFLAG, engineParamFlag);
    }
    
    /**
     * 获取 启用引擎参数  
     * @return
     */
    @JsonIgnore
    public Integer getEngineParamFlag(){
        Object objValue = this.get(FIELD_ENGINEPARAMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用引擎参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParamFlagDirty(){
        if(this.contains(FIELD_ENGINEPARAMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用引擎参数
     */
    @JsonIgnore
    public void resetEngineParamFlag(){
        this.reset(FIELD_ENGINEPARAMFLAG);
    }

    /**
     * 设置 启用引擎参数
     * <P>
     * 等同 {@link #setEngineParamFlag}
     * @param engineParamFlag
     */
    @JsonIgnore
    public PSDEViewEngine engineparamflag(Integer engineParamFlag){
        this.setEngineParamFlag(engineParamFlag);
        return this;
    }

     /**
     * 设置 启用引擎参数
     * <P>
     * 等同 {@link #setEngineParamFlag}
     * @param engineParamFlag
     */
    @JsonIgnore
    public PSDEViewEngine engineparamflag(Boolean engineParamFlag){
        if(engineParamFlag == null){
            this.setEngineParamFlag(null);
        }
        else{
            this.setEngineParamFlag(engineParamFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAMLABEL</B>&nbsp;视图引擎参数标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAMLABEL = "engineparamlabel";

    /**
     * 设置 视图引擎参数标签
     * 
     * @param engineParamLabel
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAMLABEL)
    public void setEngineParamLabel(String engineParamLabel){
        this.set(FIELD_ENGINEPARAMLABEL, engineParamLabel);
    }
    
    /**
     * 获取 视图引擎参数标签  
     * @return
     */
    @JsonIgnore
    public String getEngineParamLabel(){
        Object objValue = this.get(FIELD_ENGINEPARAMLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎参数标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEngineParamLabelDirty(){
        if(this.contains(FIELD_ENGINEPARAMLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎参数标签
     */
    @JsonIgnore
    public void resetEngineParamLabel(){
        this.reset(FIELD_ENGINEPARAMLABEL);
    }

    /**
     * 设置 视图引擎参数标签
     * <P>
     * 等同 {@link #setEngineParamLabel}
     * @param engineParamLabel
     */
    @JsonIgnore
    public PSDEViewEngine engineparamlabel(String engineParamLabel){
        this.setEngineParamLabel(engineParamLabel);
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
    public PSDEViewEngine memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NO2DEVIEWCTRLFLAG</B>&nbsp;启用视图部件2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO2DEVIEWCTRLFLAG = "no2deviewctrlflag";

    /**
     * 设置 启用视图部件2
     * 
     * @param no2DEViewCtrlFlag
     * 
     */
    @JsonProperty(FIELD_NO2DEVIEWCTRLFLAG)
    public void setNo2DEViewCtrlFlag(Integer no2DEViewCtrlFlag){
        this.set(FIELD_NO2DEVIEWCTRLFLAG, no2DEViewCtrlFlag);
    }
    
    /**
     * 获取 启用视图部件2  
     * @return
     */
    @JsonIgnore
    public Integer getNo2DEViewCtrlFlag(){
        Object objValue = this.get(FIELD_NO2DEVIEWCTRLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图部件2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2DEViewCtrlFlagDirty(){
        if(this.contains(FIELD_NO2DEVIEWCTRLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图部件2
     */
    @JsonIgnore
    public void resetNo2DEViewCtrlFlag(){
        this.reset(FIELD_NO2DEVIEWCTRLFLAG);
    }

    /**
     * 设置 启用视图部件2
     * <P>
     * 等同 {@link #setNo2DEViewCtrlFlag}
     * @param no2DEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine no2deviewctrlflag(Integer no2DEViewCtrlFlag){
        this.setNo2DEViewCtrlFlag(no2DEViewCtrlFlag);
        return this;
    }

     /**
     * 设置 启用视图部件2
     * <P>
     * 等同 {@link #setNo2DEViewCtrlFlag}
     * @param no2DEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine no2deviewctrlflag(Boolean no2DEViewCtrlFlag){
        if(no2DEViewCtrlFlag == null){
            this.setNo2DEViewCtrlFlag(null);
        }
        else{
            this.setNo2DEViewCtrlFlag(no2DEViewCtrlFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2DEVIEWCTRLLABEL</B>&nbsp;视图部件2标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO2DEVIEWCTRLLABEL = "no2deviewctrllabel";

    /**
     * 设置 视图部件2标签
     * 
     * @param no2DEViewCtrlLabel
     * 
     */
    @JsonProperty(FIELD_NO2DEVIEWCTRLLABEL)
    public void setNo2DEViewCtrlLabel(String no2DEViewCtrlLabel){
        this.set(FIELD_NO2DEVIEWCTRLLABEL, no2DEViewCtrlLabel);
    }
    
    /**
     * 获取 视图部件2标签  
     * @return
     */
    @JsonIgnore
    public String getNo2DEViewCtrlLabel(){
        Object objValue = this.get(FIELD_NO2DEVIEWCTRLLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件2标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2DEViewCtrlLabelDirty(){
        if(this.contains(FIELD_NO2DEVIEWCTRLLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件2标签
     */
    @JsonIgnore
    public void resetNo2DEViewCtrlLabel(){
        this.reset(FIELD_NO2DEVIEWCTRLLABEL);
    }

    /**
     * 设置 视图部件2标签
     * <P>
     * 等同 {@link #setNo2DEViewCtrlLabel}
     * @param no2DEViewCtrlLabel
     */
    @JsonIgnore
    public PSDEViewEngine no2deviewctrllabel(String no2DEViewCtrlLabel){
        this.setNo2DEViewCtrlLabel(no2DEViewCtrlLabel);
        return this;
    }

    /**
     * <B>NO2DEVIEWLOGICFLAG</B>&nbsp;启用视图逻辑2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO2DEVIEWLOGICFLAG = "no2deviewlogicflag";

    /**
     * 设置 启用视图逻辑2
     * 
     * @param no2DEViewLogicFlag
     * 
     */
    @JsonProperty(FIELD_NO2DEVIEWLOGICFLAG)
    public void setNo2DEViewLogicFlag(Integer no2DEViewLogicFlag){
        this.set(FIELD_NO2DEVIEWLOGICFLAG, no2DEViewLogicFlag);
    }
    
    /**
     * 获取 启用视图逻辑2  
     * @return
     */
    @JsonIgnore
    public Integer getNo2DEViewLogicFlag(){
        Object objValue = this.get(FIELD_NO2DEVIEWLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图逻辑2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2DEViewLogicFlagDirty(){
        if(this.contains(FIELD_NO2DEVIEWLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图逻辑2
     */
    @JsonIgnore
    public void resetNo2DEViewLogicFlag(){
        this.reset(FIELD_NO2DEVIEWLOGICFLAG);
    }

    /**
     * 设置 启用视图逻辑2
     * <P>
     * 等同 {@link #setNo2DEViewLogicFlag}
     * @param no2DEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine no2deviewlogicflag(Integer no2DEViewLogicFlag){
        this.setNo2DEViewLogicFlag(no2DEViewLogicFlag);
        return this;
    }

     /**
     * 设置 启用视图逻辑2
     * <P>
     * 等同 {@link #setNo2DEViewLogicFlag}
     * @param no2DEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine no2deviewlogicflag(Boolean no2DEViewLogicFlag){
        if(no2DEViewLogicFlag == null){
            this.setNo2DEViewLogicFlag(null);
        }
        else{
            this.setNo2DEViewLogicFlag(no2DEViewLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2DEVIEWLOGICLABEL</B>&nbsp;视图逻辑2标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO2DEVIEWLOGICLABEL = "no2deviewlogiclabel";

    /**
     * 设置 视图逻辑2标签
     * 
     * @param no2DEViewLogicLabel
     * 
     */
    @JsonProperty(FIELD_NO2DEVIEWLOGICLABEL)
    public void setNo2DEViewLogicLabel(String no2DEViewLogicLabel){
        this.set(FIELD_NO2DEVIEWLOGICLABEL, no2DEViewLogicLabel);
    }
    
    /**
     * 获取 视图逻辑2标签  
     * @return
     */
    @JsonIgnore
    public String getNo2DEViewLogicLabel(){
        Object objValue = this.get(FIELD_NO2DEVIEWLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑2标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2DEViewLogicLabelDirty(){
        if(this.contains(FIELD_NO2DEVIEWLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑2标签
     */
    @JsonIgnore
    public void resetNo2DEViewLogicLabel(){
        this.reset(FIELD_NO2DEVIEWLOGICLABEL);
    }

    /**
     * 设置 视图逻辑2标签
     * <P>
     * 等同 {@link #setNo2DEViewLogicLabel}
     * @param no2DEViewLogicLabel
     */
    @JsonIgnore
    public PSDEViewEngine no2deviewlogiclabel(String no2DEViewLogicLabel){
        this.setNo2DEViewLogicLabel(no2DEViewLogicLabel);
        return this;
    }

    /**
     * <B>NO2PSDEVIEWCTRLID</B>&nbsp;视图部件2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewCtrl} 
     */
    public final static String FIELD_NO2PSDEVIEWCTRLID = "no2psdeviewctrlid";

    /**
     * 设置 视图部件2
     * 
     * @param no2PSDEViewCtrlId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEVIEWCTRLID)
    public void setNo2PSDEViewCtrlId(String no2PSDEViewCtrlId){
        this.set(FIELD_NO2PSDEVIEWCTRLID, no2PSDEViewCtrlId);
    }
    
    /**
     * 获取 视图部件2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEViewCtrlId(){
        Object objValue = this.get(FIELD_NO2PSDEVIEWCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEViewCtrlIdDirty(){
        if(this.contains(FIELD_NO2PSDEVIEWCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件2
     */
    @JsonIgnore
    public void resetNo2PSDEViewCtrlId(){
        this.reset(FIELD_NO2PSDEVIEWCTRLID);
    }

    /**
     * 设置 视图部件2
     * <P>
     * 等同 {@link #setNo2PSDEViewCtrlId}
     * @param no2PSDEViewCtrlId
     */
    @JsonIgnore
    public PSDEViewEngine no2psdeviewctrlid(String no2PSDEViewCtrlId){
        this.setNo2PSDEViewCtrlId(no2PSDEViewCtrlId);
        return this;
    }

    /**
     * 设置 视图部件2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEViewCtrlId}
     * @param pSDEViewCtrl 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine no2psdeviewctrlid(PSDEViewCtrl pSDEViewCtrl){
        if(pSDEViewCtrl == null){
            this.setNo2PSDEViewCtrlId(null);
            this.setNo2PSDEViewCtrlName(null);
        }
        else{
            this.setNo2PSDEViewCtrlId(pSDEViewCtrl.getPSDEViewCtrlId());
            this.setNo2PSDEViewCtrlName(pSDEViewCtrl.getPSDEViewCtrlName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEVIEWCTRLNAME</B>&nbsp;视图部件2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEVIEWCTRLID}
     */
    public final static String FIELD_NO2PSDEVIEWCTRLNAME = "no2psdeviewctrlname";

    /**
     * 设置 视图部件2
     * 
     * @param no2PSDEViewCtrlName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEVIEWCTRLNAME)
    public void setNo2PSDEViewCtrlName(String no2PSDEViewCtrlName){
        this.set(FIELD_NO2PSDEVIEWCTRLNAME, no2PSDEViewCtrlName);
    }
    
    /**
     * 获取 视图部件2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEViewCtrlName(){
        Object objValue = this.get(FIELD_NO2PSDEVIEWCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEViewCtrlNameDirty(){
        if(this.contains(FIELD_NO2PSDEVIEWCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件2
     */
    @JsonIgnore
    public void resetNo2PSDEViewCtrlName(){
        this.reset(FIELD_NO2PSDEVIEWCTRLNAME);
    }

    /**
     * 设置 视图部件2
     * <P>
     * 等同 {@link #setNo2PSDEViewCtrlName}
     * @param no2PSDEViewCtrlName
     */
    @JsonIgnore
    public PSDEViewEngine no2psdeviewctrlname(String no2PSDEViewCtrlName){
        this.setNo2PSDEViewCtrlName(no2PSDEViewCtrlName);
        return this;
    }

    /**
     * <B>NO2PSDEVIEWLOGICID</B>&nbsp;视图逻辑2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewLogic} 
     */
    public final static String FIELD_NO2PSDEVIEWLOGICID = "no2psdeviewlogicid";

    /**
     * 设置 视图逻辑2
     * 
     * @param no2PSDEViewLogicId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEVIEWLOGICID)
    public void setNo2PSDEViewLogicId(String no2PSDEViewLogicId){
        this.set(FIELD_NO2PSDEVIEWLOGICID, no2PSDEViewLogicId);
    }
    
    /**
     * 获取 视图逻辑2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEViewLogicId(){
        Object objValue = this.get(FIELD_NO2PSDEVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEViewLogicIdDirty(){
        if(this.contains(FIELD_NO2PSDEVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑2
     */
    @JsonIgnore
    public void resetNo2PSDEViewLogicId(){
        this.reset(FIELD_NO2PSDEVIEWLOGICID);
    }

    /**
     * 设置 视图逻辑2
     * <P>
     * 等同 {@link #setNo2PSDEViewLogicId}
     * @param no2PSDEViewLogicId
     */
    @JsonIgnore
    public PSDEViewEngine no2psdeviewlogicid(String no2PSDEViewLogicId){
        this.setNo2PSDEViewLogicId(no2PSDEViewLogicId);
        return this;
    }

    /**
     * 设置 视图逻辑2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEViewLogicId}
     * @param pSDEViewLogic 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine no2psdeviewlogicid(PSDEViewLogic pSDEViewLogic){
        if(pSDEViewLogic == null){
            this.setNo2PSDEViewLogicId(null);
            this.setNo2PSDEViewLogicName(null);
        }
        else{
            this.setNo2PSDEViewLogicId(pSDEViewLogic.getPSDEViewLogicId());
            this.setNo2PSDEViewLogicName(pSDEViewLogic.getPSDEViewLogicName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEVIEWLOGICNAME</B>&nbsp;视图逻辑2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEVIEWLOGICID}
     */
    public final static String FIELD_NO2PSDEVIEWLOGICNAME = "no2psdeviewlogicname";

    /**
     * 设置 视图逻辑2
     * 
     * @param no2PSDEViewLogicName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEVIEWLOGICNAME)
    public void setNo2PSDEViewLogicName(String no2PSDEViewLogicName){
        this.set(FIELD_NO2PSDEVIEWLOGICNAME, no2PSDEViewLogicName);
    }
    
    /**
     * 获取 视图逻辑2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEViewLogicName(){
        Object objValue = this.get(FIELD_NO2PSDEVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEViewLogicNameDirty(){
        if(this.contains(FIELD_NO2PSDEVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑2
     */
    @JsonIgnore
    public void resetNo2PSDEViewLogicName(){
        this.reset(FIELD_NO2PSDEVIEWLOGICNAME);
    }

    /**
     * 设置 视图逻辑2
     * <P>
     * 等同 {@link #setNo2PSDEViewLogicName}
     * @param no2PSDEViewLogicName
     */
    @JsonIgnore
    public PSDEViewEngine no2psdeviewlogicname(String no2PSDEViewLogicName){
        this.setNo2PSDEViewLogicName(no2PSDEViewLogicName);
        return this;
    }

    /**
     * <B>NO3DEVIEWCTRLFLAG</B>&nbsp;启用视图部件3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO3DEVIEWCTRLFLAG = "no3deviewctrlflag";

    /**
     * 设置 启用视图部件3
     * 
     * @param no3DEViewCtrlFlag
     * 
     */
    @JsonProperty(FIELD_NO3DEVIEWCTRLFLAG)
    public void setNo3DEViewCtrlFlag(Integer no3DEViewCtrlFlag){
        this.set(FIELD_NO3DEVIEWCTRLFLAG, no3DEViewCtrlFlag);
    }
    
    /**
     * 获取 启用视图部件3  
     * @return
     */
    @JsonIgnore
    public Integer getNo3DEViewCtrlFlag(){
        Object objValue = this.get(FIELD_NO3DEVIEWCTRLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图部件3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3DEViewCtrlFlagDirty(){
        if(this.contains(FIELD_NO3DEVIEWCTRLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图部件3
     */
    @JsonIgnore
    public void resetNo3DEViewCtrlFlag(){
        this.reset(FIELD_NO3DEVIEWCTRLFLAG);
    }

    /**
     * 设置 启用视图部件3
     * <P>
     * 等同 {@link #setNo3DEViewCtrlFlag}
     * @param no3DEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine no3deviewctrlflag(Integer no3DEViewCtrlFlag){
        this.setNo3DEViewCtrlFlag(no3DEViewCtrlFlag);
        return this;
    }

     /**
     * 设置 启用视图部件3
     * <P>
     * 等同 {@link #setNo3DEViewCtrlFlag}
     * @param no3DEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine no3deviewctrlflag(Boolean no3DEViewCtrlFlag){
        if(no3DEViewCtrlFlag == null){
            this.setNo3DEViewCtrlFlag(null);
        }
        else{
            this.setNo3DEViewCtrlFlag(no3DEViewCtrlFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO3DEVIEWCTRLLABEL</B>&nbsp;视图部件3标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO3DEVIEWCTRLLABEL = "no3deviewctrllabel";

    /**
     * 设置 视图部件3标签
     * 
     * @param no3DEViewCtrlLabel
     * 
     */
    @JsonProperty(FIELD_NO3DEVIEWCTRLLABEL)
    public void setNo3DEViewCtrlLabel(String no3DEViewCtrlLabel){
        this.set(FIELD_NO3DEVIEWCTRLLABEL, no3DEViewCtrlLabel);
    }
    
    /**
     * 获取 视图部件3标签  
     * @return
     */
    @JsonIgnore
    public String getNo3DEViewCtrlLabel(){
        Object objValue = this.get(FIELD_NO3DEVIEWCTRLLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件3标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3DEViewCtrlLabelDirty(){
        if(this.contains(FIELD_NO3DEVIEWCTRLLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件3标签
     */
    @JsonIgnore
    public void resetNo3DEViewCtrlLabel(){
        this.reset(FIELD_NO3DEVIEWCTRLLABEL);
    }

    /**
     * 设置 视图部件3标签
     * <P>
     * 等同 {@link #setNo3DEViewCtrlLabel}
     * @param no3DEViewCtrlLabel
     */
    @JsonIgnore
    public PSDEViewEngine no3deviewctrllabel(String no3DEViewCtrlLabel){
        this.setNo3DEViewCtrlLabel(no3DEViewCtrlLabel);
        return this;
    }

    /**
     * <B>NO3DEVIEWLOGICFLAG</B>&nbsp;启用视图逻辑3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO3DEVIEWLOGICFLAG = "no3deviewlogicflag";

    /**
     * 设置 启用视图逻辑3
     * 
     * @param no3DEViewLogicFlag
     * 
     */
    @JsonProperty(FIELD_NO3DEVIEWLOGICFLAG)
    public void setNo3DEViewLogicFlag(Integer no3DEViewLogicFlag){
        this.set(FIELD_NO3DEVIEWLOGICFLAG, no3DEViewLogicFlag);
    }
    
    /**
     * 获取 启用视图逻辑3  
     * @return
     */
    @JsonIgnore
    public Integer getNo3DEViewLogicFlag(){
        Object objValue = this.get(FIELD_NO3DEVIEWLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图逻辑3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3DEViewLogicFlagDirty(){
        if(this.contains(FIELD_NO3DEVIEWLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图逻辑3
     */
    @JsonIgnore
    public void resetNo3DEViewLogicFlag(){
        this.reset(FIELD_NO3DEVIEWLOGICFLAG);
    }

    /**
     * 设置 启用视图逻辑3
     * <P>
     * 等同 {@link #setNo3DEViewLogicFlag}
     * @param no3DEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine no3deviewlogicflag(Integer no3DEViewLogicFlag){
        this.setNo3DEViewLogicFlag(no3DEViewLogicFlag);
        return this;
    }

     /**
     * 设置 启用视图逻辑3
     * <P>
     * 等同 {@link #setNo3DEViewLogicFlag}
     * @param no3DEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine no3deviewlogicflag(Boolean no3DEViewLogicFlag){
        if(no3DEViewLogicFlag == null){
            this.setNo3DEViewLogicFlag(null);
        }
        else{
            this.setNo3DEViewLogicFlag(no3DEViewLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO3DEVIEWLOGICLABEL</B>&nbsp;视图逻辑3标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO3DEVIEWLOGICLABEL = "no3deviewlogiclabel";

    /**
     * 设置 视图逻辑3标签
     * 
     * @param no3DEViewLogicLabel
     * 
     */
    @JsonProperty(FIELD_NO3DEVIEWLOGICLABEL)
    public void setNo3DEViewLogicLabel(String no3DEViewLogicLabel){
        this.set(FIELD_NO3DEVIEWLOGICLABEL, no3DEViewLogicLabel);
    }
    
    /**
     * 获取 视图逻辑3标签  
     * @return
     */
    @JsonIgnore
    public String getNo3DEViewLogicLabel(){
        Object objValue = this.get(FIELD_NO3DEVIEWLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑3标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3DEViewLogicLabelDirty(){
        if(this.contains(FIELD_NO3DEVIEWLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑3标签
     */
    @JsonIgnore
    public void resetNo3DEViewLogicLabel(){
        this.reset(FIELD_NO3DEVIEWLOGICLABEL);
    }

    /**
     * 设置 视图逻辑3标签
     * <P>
     * 等同 {@link #setNo3DEViewLogicLabel}
     * @param no3DEViewLogicLabel
     */
    @JsonIgnore
    public PSDEViewEngine no3deviewlogiclabel(String no3DEViewLogicLabel){
        this.setNo3DEViewLogicLabel(no3DEViewLogicLabel);
        return this;
    }

    /**
     * <B>NO3PSDEVIEWCTRLID</B>&nbsp;视图部件3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewCtrl} 
     */
    public final static String FIELD_NO3PSDEVIEWCTRLID = "no3psdeviewctrlid";

    /**
     * 设置 视图部件3
     * 
     * @param no3PSDEViewCtrlId
     * 
     */
    @JsonProperty(FIELD_NO3PSDEVIEWCTRLID)
    public void setNo3PSDEViewCtrlId(String no3PSDEViewCtrlId){
        this.set(FIELD_NO3PSDEVIEWCTRLID, no3PSDEViewCtrlId);
    }
    
    /**
     * 获取 视图部件3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSDEViewCtrlId(){
        Object objValue = this.get(FIELD_NO3PSDEVIEWCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSDEViewCtrlIdDirty(){
        if(this.contains(FIELD_NO3PSDEVIEWCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件3
     */
    @JsonIgnore
    public void resetNo3PSDEViewCtrlId(){
        this.reset(FIELD_NO3PSDEVIEWCTRLID);
    }

    /**
     * 设置 视图部件3
     * <P>
     * 等同 {@link #setNo3PSDEViewCtrlId}
     * @param no3PSDEViewCtrlId
     */
    @JsonIgnore
    public PSDEViewEngine no3psdeviewctrlid(String no3PSDEViewCtrlId){
        this.setNo3PSDEViewCtrlId(no3PSDEViewCtrlId);
        return this;
    }

    /**
     * 设置 视图部件3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo3PSDEViewCtrlId}
     * @param pSDEViewCtrl 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine no3psdeviewctrlid(PSDEViewCtrl pSDEViewCtrl){
        if(pSDEViewCtrl == null){
            this.setNo3PSDEViewCtrlId(null);
            this.setNo3PSDEViewCtrlName(null);
        }
        else{
            this.setNo3PSDEViewCtrlId(pSDEViewCtrl.getPSDEViewCtrlId());
            this.setNo3PSDEViewCtrlName(pSDEViewCtrl.getPSDEViewCtrlName());
        }
        return this;
    }

    /**
     * <B>NO3PSDEVIEWCTRLNAME</B>&nbsp;视图部件3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3PSDEVIEWCTRLID}
     */
    public final static String FIELD_NO3PSDEVIEWCTRLNAME = "no3psdeviewctrlname";

    /**
     * 设置 视图部件3
     * 
     * @param no3PSDEViewCtrlName
     * 
     */
    @JsonProperty(FIELD_NO3PSDEVIEWCTRLNAME)
    public void setNo3PSDEViewCtrlName(String no3PSDEViewCtrlName){
        this.set(FIELD_NO3PSDEVIEWCTRLNAME, no3PSDEViewCtrlName);
    }
    
    /**
     * 获取 视图部件3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSDEViewCtrlName(){
        Object objValue = this.get(FIELD_NO3PSDEVIEWCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSDEViewCtrlNameDirty(){
        if(this.contains(FIELD_NO3PSDEVIEWCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件3
     */
    @JsonIgnore
    public void resetNo3PSDEViewCtrlName(){
        this.reset(FIELD_NO3PSDEVIEWCTRLNAME);
    }

    /**
     * 设置 视图部件3
     * <P>
     * 等同 {@link #setNo3PSDEViewCtrlName}
     * @param no3PSDEViewCtrlName
     */
    @JsonIgnore
    public PSDEViewEngine no3psdeviewctrlname(String no3PSDEViewCtrlName){
        this.setNo3PSDEViewCtrlName(no3PSDEViewCtrlName);
        return this;
    }

    /**
     * <B>NO3PSDEVIEWLOGICID</B>&nbsp;视图逻辑3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewLogic} 
     */
    public final static String FIELD_NO3PSDEVIEWLOGICID = "no3psdeviewlogicid";

    /**
     * 设置 视图逻辑3
     * 
     * @param no3PSDEViewLogicId
     * 
     */
    @JsonProperty(FIELD_NO3PSDEVIEWLOGICID)
    public void setNo3PSDEViewLogicId(String no3PSDEViewLogicId){
        this.set(FIELD_NO3PSDEVIEWLOGICID, no3PSDEViewLogicId);
    }
    
    /**
     * 获取 视图逻辑3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSDEViewLogicId(){
        Object objValue = this.get(FIELD_NO3PSDEVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSDEViewLogicIdDirty(){
        if(this.contains(FIELD_NO3PSDEVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑3
     */
    @JsonIgnore
    public void resetNo3PSDEViewLogicId(){
        this.reset(FIELD_NO3PSDEVIEWLOGICID);
    }

    /**
     * 设置 视图逻辑3
     * <P>
     * 等同 {@link #setNo3PSDEViewLogicId}
     * @param no3PSDEViewLogicId
     */
    @JsonIgnore
    public PSDEViewEngine no3psdeviewlogicid(String no3PSDEViewLogicId){
        this.setNo3PSDEViewLogicId(no3PSDEViewLogicId);
        return this;
    }

    /**
     * 设置 视图逻辑3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo3PSDEViewLogicId}
     * @param pSDEViewLogic 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine no3psdeviewlogicid(PSDEViewLogic pSDEViewLogic){
        if(pSDEViewLogic == null){
            this.setNo3PSDEViewLogicId(null);
            this.setNo3PSDEViewLogicName(null);
        }
        else{
            this.setNo3PSDEViewLogicId(pSDEViewLogic.getPSDEViewLogicId());
            this.setNo3PSDEViewLogicName(pSDEViewLogic.getPSDEViewLogicName());
        }
        return this;
    }

    /**
     * <B>NO3PSDEVIEWLOGICNAME</B>&nbsp;视图逻辑3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3PSDEVIEWLOGICID}
     */
    public final static String FIELD_NO3PSDEVIEWLOGICNAME = "no3psdeviewlogicname";

    /**
     * 设置 视图逻辑3
     * 
     * @param no3PSDEViewLogicName
     * 
     */
    @JsonProperty(FIELD_NO3PSDEVIEWLOGICNAME)
    public void setNo3PSDEViewLogicName(String no3PSDEViewLogicName){
        this.set(FIELD_NO3PSDEVIEWLOGICNAME, no3PSDEViewLogicName);
    }
    
    /**
     * 获取 视图逻辑3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSDEViewLogicName(){
        Object objValue = this.get(FIELD_NO3PSDEVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSDEViewLogicNameDirty(){
        if(this.contains(FIELD_NO3PSDEVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑3
     */
    @JsonIgnore
    public void resetNo3PSDEViewLogicName(){
        this.reset(FIELD_NO3PSDEVIEWLOGICNAME);
    }

    /**
     * 设置 视图逻辑3
     * <P>
     * 等同 {@link #setNo3PSDEViewLogicName}
     * @param no3PSDEViewLogicName
     */
    @JsonIgnore
    public PSDEViewEngine no3psdeviewlogicname(String no3PSDEViewLogicName){
        this.setNo3PSDEViewLogicName(no3PSDEViewLogicName);
        return this;
    }

    /**
     * <B>NO4DEVIEWCTRLFLAG</B>&nbsp;启用视图部件4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO4DEVIEWCTRLFLAG = "no4deviewctrlflag";

    /**
     * 设置 启用视图部件4
     * 
     * @param no4DEViewCtrlFlag
     * 
     */
    @JsonProperty(FIELD_NO4DEVIEWCTRLFLAG)
    public void setNo4DEViewCtrlFlag(Integer no4DEViewCtrlFlag){
        this.set(FIELD_NO4DEVIEWCTRLFLAG, no4DEViewCtrlFlag);
    }
    
    /**
     * 获取 启用视图部件4  
     * @return
     */
    @JsonIgnore
    public Integer getNo4DEViewCtrlFlag(){
        Object objValue = this.get(FIELD_NO4DEVIEWCTRLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图部件4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4DEViewCtrlFlagDirty(){
        if(this.contains(FIELD_NO4DEVIEWCTRLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图部件4
     */
    @JsonIgnore
    public void resetNo4DEViewCtrlFlag(){
        this.reset(FIELD_NO4DEVIEWCTRLFLAG);
    }

    /**
     * 设置 启用视图部件4
     * <P>
     * 等同 {@link #setNo4DEViewCtrlFlag}
     * @param no4DEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine no4deviewctrlflag(Integer no4DEViewCtrlFlag){
        this.setNo4DEViewCtrlFlag(no4DEViewCtrlFlag);
        return this;
    }

     /**
     * 设置 启用视图部件4
     * <P>
     * 等同 {@link #setNo4DEViewCtrlFlag}
     * @param no4DEViewCtrlFlag
     */
    @JsonIgnore
    public PSDEViewEngine no4deviewctrlflag(Boolean no4DEViewCtrlFlag){
        if(no4DEViewCtrlFlag == null){
            this.setNo4DEViewCtrlFlag(null);
        }
        else{
            this.setNo4DEViewCtrlFlag(no4DEViewCtrlFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO4DEVIEWCTRLLABEL</B>&nbsp;视图部件4标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO4DEVIEWCTRLLABEL = "no4deviewctrllabel";

    /**
     * 设置 视图部件4标签
     * 
     * @param no4DEViewCtrlLabel
     * 
     */
    @JsonProperty(FIELD_NO4DEVIEWCTRLLABEL)
    public void setNo4DEViewCtrlLabel(String no4DEViewCtrlLabel){
        this.set(FIELD_NO4DEVIEWCTRLLABEL, no4DEViewCtrlLabel);
    }
    
    /**
     * 获取 视图部件4标签  
     * @return
     */
    @JsonIgnore
    public String getNo4DEViewCtrlLabel(){
        Object objValue = this.get(FIELD_NO4DEVIEWCTRLLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件4标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4DEViewCtrlLabelDirty(){
        if(this.contains(FIELD_NO4DEVIEWCTRLLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件4标签
     */
    @JsonIgnore
    public void resetNo4DEViewCtrlLabel(){
        this.reset(FIELD_NO4DEVIEWCTRLLABEL);
    }

    /**
     * 设置 视图部件4标签
     * <P>
     * 等同 {@link #setNo4DEViewCtrlLabel}
     * @param no4DEViewCtrlLabel
     */
    @JsonIgnore
    public PSDEViewEngine no4deviewctrllabel(String no4DEViewCtrlLabel){
        this.setNo4DEViewCtrlLabel(no4DEViewCtrlLabel);
        return this;
    }

    /**
     * <B>NO4DEVIEWLOGICFLAG</B>&nbsp;启用视图逻辑4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO4DEVIEWLOGICFLAG = "no4deviewlogicflag";

    /**
     * 设置 启用视图逻辑4
     * 
     * @param no4DEViewLogicFlag
     * 
     */
    @JsonProperty(FIELD_NO4DEVIEWLOGICFLAG)
    public void setNo4DEViewLogicFlag(Integer no4DEViewLogicFlag){
        this.set(FIELD_NO4DEVIEWLOGICFLAG, no4DEViewLogicFlag);
    }
    
    /**
     * 获取 启用视图逻辑4  
     * @return
     */
    @JsonIgnore
    public Integer getNo4DEViewLogicFlag(){
        Object objValue = this.get(FIELD_NO4DEVIEWLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图逻辑4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4DEViewLogicFlagDirty(){
        if(this.contains(FIELD_NO4DEVIEWLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图逻辑4
     */
    @JsonIgnore
    public void resetNo4DEViewLogicFlag(){
        this.reset(FIELD_NO4DEVIEWLOGICFLAG);
    }

    /**
     * 设置 启用视图逻辑4
     * <P>
     * 等同 {@link #setNo4DEViewLogicFlag}
     * @param no4DEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine no4deviewlogicflag(Integer no4DEViewLogicFlag){
        this.setNo4DEViewLogicFlag(no4DEViewLogicFlag);
        return this;
    }

     /**
     * 设置 启用视图逻辑4
     * <P>
     * 等同 {@link #setNo4DEViewLogicFlag}
     * @param no4DEViewLogicFlag
     */
    @JsonIgnore
    public PSDEViewEngine no4deviewlogicflag(Boolean no4DEViewLogicFlag){
        if(no4DEViewLogicFlag == null){
            this.setNo4DEViewLogicFlag(null);
        }
        else{
            this.setNo4DEViewLogicFlag(no4DEViewLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO4DEVIEWLOGICLABEL</B>&nbsp;视图逻辑4标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO4DEVIEWLOGICLABEL = "no4deviewlogiclabel";

    /**
     * 设置 视图逻辑4标签
     * 
     * @param no4DEViewLogicLabel
     * 
     */
    @JsonProperty(FIELD_NO4DEVIEWLOGICLABEL)
    public void setNo4DEViewLogicLabel(String no4DEViewLogicLabel){
        this.set(FIELD_NO4DEVIEWLOGICLABEL, no4DEViewLogicLabel);
    }
    
    /**
     * 获取 视图逻辑4标签  
     * @return
     */
    @JsonIgnore
    public String getNo4DEViewLogicLabel(){
        Object objValue = this.get(FIELD_NO4DEVIEWLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑4标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4DEViewLogicLabelDirty(){
        if(this.contains(FIELD_NO4DEVIEWLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑4标签
     */
    @JsonIgnore
    public void resetNo4DEViewLogicLabel(){
        this.reset(FIELD_NO4DEVIEWLOGICLABEL);
    }

    /**
     * 设置 视图逻辑4标签
     * <P>
     * 等同 {@link #setNo4DEViewLogicLabel}
     * @param no4DEViewLogicLabel
     */
    @JsonIgnore
    public PSDEViewEngine no4deviewlogiclabel(String no4DEViewLogicLabel){
        this.setNo4DEViewLogicLabel(no4DEViewLogicLabel);
        return this;
    }

    /**
     * <B>NO4PSDEVIEWCTRLID</B>&nbsp;视图部件4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewCtrl} 
     */
    public final static String FIELD_NO4PSDEVIEWCTRLID = "no4psdeviewctrlid";

    /**
     * 设置 视图部件4
     * 
     * @param no4PSDEViewCtrlId
     * 
     */
    @JsonProperty(FIELD_NO4PSDEVIEWCTRLID)
    public void setNo4PSDEViewCtrlId(String no4PSDEViewCtrlId){
        this.set(FIELD_NO4PSDEVIEWCTRLID, no4PSDEViewCtrlId);
    }
    
    /**
     * 获取 视图部件4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSDEViewCtrlId(){
        Object objValue = this.get(FIELD_NO4PSDEVIEWCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSDEViewCtrlIdDirty(){
        if(this.contains(FIELD_NO4PSDEVIEWCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件4
     */
    @JsonIgnore
    public void resetNo4PSDEViewCtrlId(){
        this.reset(FIELD_NO4PSDEVIEWCTRLID);
    }

    /**
     * 设置 视图部件4
     * <P>
     * 等同 {@link #setNo4PSDEViewCtrlId}
     * @param no4PSDEViewCtrlId
     */
    @JsonIgnore
    public PSDEViewEngine no4psdeviewctrlid(String no4PSDEViewCtrlId){
        this.setNo4PSDEViewCtrlId(no4PSDEViewCtrlId);
        return this;
    }

    /**
     * 设置 视图部件4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo4PSDEViewCtrlId}
     * @param pSDEViewCtrl 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine no4psdeviewctrlid(PSDEViewCtrl pSDEViewCtrl){
        if(pSDEViewCtrl == null){
            this.setNo4PSDEViewCtrlId(null);
            this.setNo4PSDEViewCtrlName(null);
        }
        else{
            this.setNo4PSDEViewCtrlId(pSDEViewCtrl.getPSDEViewCtrlId());
            this.setNo4PSDEViewCtrlName(pSDEViewCtrl.getPSDEViewCtrlName());
        }
        return this;
    }

    /**
     * <B>NO4PSDEVIEWCTRLNAME</B>&nbsp;视图部件4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO4PSDEVIEWCTRLID}
     */
    public final static String FIELD_NO4PSDEVIEWCTRLNAME = "no4psdeviewctrlname";

    /**
     * 设置 视图部件4
     * 
     * @param no4PSDEViewCtrlName
     * 
     */
    @JsonProperty(FIELD_NO4PSDEVIEWCTRLNAME)
    public void setNo4PSDEViewCtrlName(String no4PSDEViewCtrlName){
        this.set(FIELD_NO4PSDEVIEWCTRLNAME, no4PSDEViewCtrlName);
    }
    
    /**
     * 获取 视图部件4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSDEViewCtrlName(){
        Object objValue = this.get(FIELD_NO4PSDEVIEWCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图部件4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSDEViewCtrlNameDirty(){
        if(this.contains(FIELD_NO4PSDEVIEWCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图部件4
     */
    @JsonIgnore
    public void resetNo4PSDEViewCtrlName(){
        this.reset(FIELD_NO4PSDEVIEWCTRLNAME);
    }

    /**
     * 设置 视图部件4
     * <P>
     * 等同 {@link #setNo4PSDEViewCtrlName}
     * @param no4PSDEViewCtrlName
     */
    @JsonIgnore
    public PSDEViewEngine no4psdeviewctrlname(String no4PSDEViewCtrlName){
        this.setNo4PSDEViewCtrlName(no4PSDEViewCtrlName);
        return this;
    }

    /**
     * <B>NO4PSDEVIEWLOGICID</B>&nbsp;视图逻辑4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewLogic} 
     */
    public final static String FIELD_NO4PSDEVIEWLOGICID = "no4psdeviewlogicid";

    /**
     * 设置 视图逻辑4
     * 
     * @param no4PSDEViewLogicId
     * 
     */
    @JsonProperty(FIELD_NO4PSDEVIEWLOGICID)
    public void setNo4PSDEViewLogicId(String no4PSDEViewLogicId){
        this.set(FIELD_NO4PSDEVIEWLOGICID, no4PSDEViewLogicId);
    }
    
    /**
     * 获取 视图逻辑4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSDEViewLogicId(){
        Object objValue = this.get(FIELD_NO4PSDEVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSDEViewLogicIdDirty(){
        if(this.contains(FIELD_NO4PSDEVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑4
     */
    @JsonIgnore
    public void resetNo4PSDEViewLogicId(){
        this.reset(FIELD_NO4PSDEVIEWLOGICID);
    }

    /**
     * 设置 视图逻辑4
     * <P>
     * 等同 {@link #setNo4PSDEViewLogicId}
     * @param no4PSDEViewLogicId
     */
    @JsonIgnore
    public PSDEViewEngine no4psdeviewlogicid(String no4PSDEViewLogicId){
        this.setNo4PSDEViewLogicId(no4PSDEViewLogicId);
        return this;
    }

    /**
     * 设置 视图逻辑4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo4PSDEViewLogicId}
     * @param pSDEViewLogic 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine no4psdeviewlogicid(PSDEViewLogic pSDEViewLogic){
        if(pSDEViewLogic == null){
            this.setNo4PSDEViewLogicId(null);
            this.setNo4PSDEViewLogicName(null);
        }
        else{
            this.setNo4PSDEViewLogicId(pSDEViewLogic.getPSDEViewLogicId());
            this.setNo4PSDEViewLogicName(pSDEViewLogic.getPSDEViewLogicName());
        }
        return this;
    }

    /**
     * <B>NO4PSDEVIEWLOGICNAME</B>&nbsp;视图逻辑4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO4PSDEVIEWLOGICID}
     */
    public final static String FIELD_NO4PSDEVIEWLOGICNAME = "no4psdeviewlogicname";

    /**
     * 设置 视图逻辑4
     * 
     * @param no4PSDEViewLogicName
     * 
     */
    @JsonProperty(FIELD_NO4PSDEVIEWLOGICNAME)
    public void setNo4PSDEViewLogicName(String no4PSDEViewLogicName){
        this.set(FIELD_NO4PSDEVIEWLOGICNAME, no4PSDEViewLogicName);
    }
    
    /**
     * 获取 视图逻辑4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSDEViewLogicName(){
        Object objValue = this.get(FIELD_NO4PSDEVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSDEViewLogicNameDirty(){
        if(this.contains(FIELD_NO4PSDEVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑4
     */
    @JsonIgnore
    public void resetNo4PSDEViewLogicName(){
        this.reset(FIELD_NO4PSDEVIEWLOGICNAME);
    }

    /**
     * 设置 视图逻辑4
     * <P>
     * 等同 {@link #setNo4PSDEViewLogicName}
     * @param no4PSDEViewLogicName
     */
    @JsonIgnore
    public PSDEViewEngine no4psdeviewlogicname(String no4PSDEViewLogicName){
        this.setNo4PSDEViewLogicName(no4PSDEViewLogicName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定实体视图界面引擎的挂接次序
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
    public PSDEViewEngine ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图，指定实体视图界面引擎所属的实体视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
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
    public PSDEViewEngine psdeviewbaseid(String pSDEViewBaseId){
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
    public PSDEViewEngine psdeviewbaseid(PSDEViewBase pSDEViewBase){
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
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图，指定实体视图界面引擎所属的实体视图对象
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
    public PSDEViewEngine psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLID</B>&nbsp;视图部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewCtrl} 
     */
    public final static String FIELD_PSDEVIEWCTRLID = "psdeviewctrlid";

    /**
     * 设置 视图部件
     * 
     * @param pSDEViewCtrlId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLID)
    public void setPSDEViewCtrlId(String pSDEViewCtrlId){
        this.set(FIELD_PSDEVIEWCTRLID, pSDEViewCtrlId);
    }
    
    /**
     * 获取 视图部件  
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
     * 判断 视图部件 是否指定值，包括空值
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
     * 重置 视图部件
     */
    @JsonIgnore
    public void resetPSDEViewCtrlId(){
        this.reset(FIELD_PSDEVIEWCTRLID);
    }

    /**
     * 设置 视图部件
     * <P>
     * 等同 {@link #setPSDEViewCtrlId}
     * @param pSDEViewCtrlId
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewctrlid(String pSDEViewCtrlId){
        this.setPSDEViewCtrlId(pSDEViewCtrlId);
        return this;
    }

    /**
     * 设置 视图部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewCtrlId}
     * @param pSDEViewCtrl 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewctrlid(PSDEViewCtrl pSDEViewCtrl){
        if(pSDEViewCtrl == null){
            this.setPSDEViewCtrlId(null);
            this.setPSDEViewCtrlName(null);
        }
        else{
            this.setPSDEViewCtrlId(pSDEViewCtrl.getPSDEViewCtrlId());
            this.setPSDEViewCtrlName(pSDEViewCtrl.getPSDEViewCtrlName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWCTRLNAME</B>&nbsp;视图部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWCTRLID}
     */
    public final static String FIELD_PSDEVIEWCTRLNAME = "psdeviewctrlname";

    /**
     * 设置 视图部件
     * 
     * @param pSDEViewCtrlName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLNAME)
    public void setPSDEViewCtrlName(String pSDEViewCtrlName){
        this.set(FIELD_PSDEVIEWCTRLNAME, pSDEViewCtrlName);
    }
    
    /**
     * 获取 视图部件  
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
     * 判断 视图部件 是否指定值，包括空值
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
     * 重置 视图部件
     */
    @JsonIgnore
    public void resetPSDEViewCtrlName(){
        this.reset(FIELD_PSDEVIEWCTRLNAME);
    }

    /**
     * 设置 视图部件
     * <P>
     * 等同 {@link #setPSDEViewCtrlName}
     * @param pSDEViewCtrlName
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewctrlname(String pSDEViewCtrlName){
        this.setPSDEViewCtrlName(pSDEViewCtrlName);
        return this;
    }

    /**
     * <B>PSDEVIEWENGINEID</B>&nbsp;实体视图界面引擎标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVIEWENGINEID = "psdeviewengineid";

    /**
     * 设置 实体视图界面引擎标识
     * 
     * @param pSDEViewEngineId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWENGINEID)
    public void setPSDEViewEngineId(String pSDEViewEngineId){
        this.set(FIELD_PSDEVIEWENGINEID, pSDEViewEngineId);
    }
    
    /**
     * 获取 实体视图界面引擎标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewEngineId(){
        Object objValue = this.get(FIELD_PSDEVIEWENGINEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图界面引擎标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewEngineIdDirty(){
        if(this.contains(FIELD_PSDEVIEWENGINEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图界面引擎标识
     */
    @JsonIgnore
    public void resetPSDEViewEngineId(){
        this.reset(FIELD_PSDEVIEWENGINEID);
    }

    /**
     * 设置 实体视图界面引擎标识
     * <P>
     * 等同 {@link #setPSDEViewEngineId}
     * @param pSDEViewEngineId
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewengineid(String pSDEViewEngineId){
        this.setPSDEViewEngineId(pSDEViewEngineId);
        return this;
    }

    /**
     * <B>PSDEVIEWENGINENAME</B>&nbsp;界面引擎标识，指定实体视图界面引擎的标识，需在所在实体视图中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEVIEWENGINENAME = "psdeviewenginename";

    /**
     * 设置 界面引擎标识，详细说明：{@link #FIELD_PSDEVIEWENGINENAME}
     * 
     * @param pSDEViewEngineName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWENGINENAME)
    public void setPSDEViewEngineName(String pSDEViewEngineName){
        this.set(FIELD_PSDEVIEWENGINENAME, pSDEViewEngineName);
    }
    
    /**
     * 获取 界面引擎标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewEngineName(){
        Object objValue = this.get(FIELD_PSDEVIEWENGINENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面引擎标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewEngineNameDirty(){
        if(this.contains(FIELD_PSDEVIEWENGINENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面引擎标识
     */
    @JsonIgnore
    public void resetPSDEViewEngineName(){
        this.reset(FIELD_PSDEVIEWENGINENAME);
    }

    /**
     * 设置 界面引擎标识，详细说明：{@link #FIELD_PSDEVIEWENGINENAME}
     * <P>
     * 等同 {@link #setPSDEViewEngineName}
     * @param pSDEViewEngineName
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewenginename(String pSDEViewEngineName){
        this.setPSDEViewEngineName(pSDEViewEngineName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEViewEngineName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEViewEngineName(strName);
    }

    @JsonIgnore
    public PSDEViewEngine name(String strName){
        this.setPSDEViewEngineName(strName);
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICID</B>&nbsp;视图逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewLogic} 
     */
    public final static String FIELD_PSDEVIEWLOGICID = "psdeviewlogicid";

    /**
     * 设置 视图逻辑
     * 
     * @param pSDEViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICID)
    public void setPSDEViewLogicId(String pSDEViewLogicId){
        this.set(FIELD_PSDEVIEWLOGICID, pSDEViewLogicId);
    }
    
    /**
     * 获取 视图逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicId(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewLogicIdDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑
     */
    @JsonIgnore
    public void resetPSDEViewLogicId(){
        this.reset(FIELD_PSDEVIEWLOGICID);
    }

    /**
     * 设置 视图逻辑
     * <P>
     * 等同 {@link #setPSDEViewLogicId}
     * @param pSDEViewLogicId
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewlogicid(String pSDEViewLogicId){
        this.setPSDEViewLogicId(pSDEViewLogicId);
        return this;
    }

    /**
     * 设置 视图逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewLogicId}
     * @param pSDEViewLogic 引用对象
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewlogicid(PSDEViewLogic pSDEViewLogic){
        if(pSDEViewLogic == null){
            this.setPSDEViewLogicId(null);
            this.setPSDEViewLogicName(null);
        }
        else{
            this.setPSDEViewLogicId(pSDEViewLogic.getPSDEViewLogicId());
            this.setPSDEViewLogicName(pSDEViewLogic.getPSDEViewLogicName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICNAME</B>&nbsp;视图逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWLOGICID}
     */
    public final static String FIELD_PSDEVIEWLOGICNAME = "psdeviewlogicname";

    /**
     * 设置 视图逻辑
     * 
     * @param pSDEViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICNAME)
    public void setPSDEViewLogicName(String pSDEViewLogicName){
        this.set(FIELD_PSDEVIEWLOGICNAME, pSDEViewLogicName);
    }
    
    /**
     * 获取 视图逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicName(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewLogicNameDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图逻辑
     */
    @JsonIgnore
    public void resetPSDEViewLogicName(){
        this.reset(FIELD_PSDEVIEWLOGICNAME);
    }

    /**
     * 设置 视图逻辑
     * <P>
     * 等同 {@link #setPSDEViewLogicName}
     * @param pSDEViewLogicName
     */
    @JsonIgnore
    public PSDEViewEngine psdeviewlogicname(String pSDEViewLogicName){
        this.setPSDEViewLogicName(pSDEViewLogicName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体视图界面引擎使用的前端模板扩展插件，使用插件类型【界面引擎】
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
    public PSDEViewEngine pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEViewEngine pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体视图界面引擎使用的前端模板扩展插件，使用插件类型【界面引擎】
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
    public PSDEViewEngine pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSUIENGINETYPEID</B>&nbsp;界面引擎类型，指定实体视图界面引擎的类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSUIENGINETYPEID = "psuienginetypeid";

    /**
     * 设置 界面引擎类型，详细说明：{@link #FIELD_PSUIENGINETYPEID}
     * 
     * @param pSUIEngineTypeId
     * 
     */
    @JsonProperty(FIELD_PSUIENGINETYPEID)
    public void setPSUIEngineTypeId(String pSUIEngineTypeId){
        this.set(FIELD_PSUIENGINETYPEID, pSUIEngineTypeId);
    }
    
    /**
     * 获取 界面引擎类型  
     * @return
     */
    @JsonIgnore
    public String getPSUIEngineTypeId(){
        Object objValue = this.get(FIELD_PSUIENGINETYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSUIEngineTypeIdDirty(){
        if(this.contains(FIELD_PSUIENGINETYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面引擎类型
     */
    @JsonIgnore
    public void resetPSUIEngineTypeId(){
        this.reset(FIELD_PSUIENGINETYPEID);
    }

    /**
     * 设置 界面引擎类型，详细说明：{@link #FIELD_PSUIENGINETYPEID}
     * <P>
     * 等同 {@link #setPSUIEngineTypeId}
     * @param pSUIEngineTypeId
     */
    @JsonIgnore
    public PSDEViewEngine psuienginetypeid(String pSUIEngineTypeId){
        this.setPSUIEngineTypeId(pSUIEngineTypeId);
        return this;
    }

    /**
     * <B>PSUIENGINETYPENAME</B>&nbsp;界面引擎类型，指定实体视图界面引擎的类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSUIENGINETYPEID}
     */
    public final static String FIELD_PSUIENGINETYPENAME = "psuienginetypename";

    /**
     * 设置 界面引擎类型，详细说明：{@link #FIELD_PSUIENGINETYPENAME}
     * 
     * @param pSUIEngineTypeName
     * 
     */
    @JsonProperty(FIELD_PSUIENGINETYPENAME)
    public void setPSUIEngineTypeName(String pSUIEngineTypeName){
        this.set(FIELD_PSUIENGINETYPENAME, pSUIEngineTypeName);
    }
    
    /**
     * 获取 界面引擎类型  
     * @return
     */
    @JsonIgnore
    public String getPSUIEngineTypeName(){
        Object objValue = this.get(FIELD_PSUIENGINETYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSUIEngineTypeNameDirty(){
        if(this.contains(FIELD_PSUIENGINETYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面引擎类型
     */
    @JsonIgnore
    public void resetPSUIEngineTypeName(){
        this.reset(FIELD_PSUIENGINETYPENAME);
    }

    /**
     * 设置 界面引擎类型，详细说明：{@link #FIELD_PSUIENGINETYPENAME}
     * <P>
     * 等同 {@link #setPSUIEngineTypeName}
     * @param pSUIEngineTypeName
     */
    @JsonIgnore
    public PSDEViewEngine psuienginetypename(String pSUIEngineTypeName){
        this.setPSUIEngineTypeName(pSUIEngineTypeName);
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
    public PSDEViewEngine updatedate(String updateDate){
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
    public PSDEViewEngine updateman(String updateMan){
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
    public PSDEViewEngine usercat(String userCat){
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
    public PSDEViewEngine usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEViewEngine usertag(String userTag){
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
    public PSDEViewEngine usertag2(String userTag2){
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
    public PSDEViewEngine usertag3(String userTag3){
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
    public PSDEViewEngine usertag4(String userTag4){
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
    public PSDEViewEngine validflag(Integer validFlag){
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
    public PSDEViewEngine validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWPARAM</B>&nbsp;视图参数
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_VIEWPARAM = "viewparam";

    /**
     * 设置 视图参数
     * 
     * @param viewParam
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM)
    public void setViewParam(String viewParam){
        this.set(FIELD_VIEWPARAM, viewParam);
    }
    
    /**
     * 获取 视图参数  
     * @return
     */
    @JsonIgnore
    public String getViewParam(){
        Object objValue = this.get(FIELD_VIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParamDirty(){
        if(this.contains(FIELD_VIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数
     */
    @JsonIgnore
    public void resetViewParam(){
        this.reset(FIELD_VIEWPARAM);
    }

    /**
     * 设置 视图参数
     * <P>
     * 等同 {@link #setViewParam}
     * @param viewParam
     */
    @JsonIgnore
    public PSDEViewEngine viewparam(String viewParam){
        this.setViewParam(viewParam);
        return this;
    }

    /**
     * <B>VIEWPARAM10</B>&nbsp;视图参数10
     */
    public final static String FIELD_VIEWPARAM10 = "viewparam10";

    /**
     * 设置 视图参数10
     * 
     * @param viewParam10
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM10)
    public void setViewParam10(Integer viewParam10){
        this.set(FIELD_VIEWPARAM10, viewParam10);
    }
    
    /**
     * 获取 视图参数10  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam10(){
        Object objValue = this.get(FIELD_VIEWPARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam10Dirty(){
        if(this.contains(FIELD_VIEWPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数10
     */
    @JsonIgnore
    public void resetViewParam10(){
        this.reset(FIELD_VIEWPARAM10);
    }

    /**
     * 设置 视图参数10
     * <P>
     * 等同 {@link #setViewParam10}
     * @param viewParam10
     */
    @JsonIgnore
    public PSDEViewEngine viewparam10(Integer viewParam10){
        this.setViewParam10(viewParam10);
        return this;
    }

    /**
     * <B>VIEWPARAM2</B>&nbsp;视图参数2
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_VIEWPARAM2 = "viewparam2";

    /**
     * 设置 视图参数2
     * 
     * @param viewParam2
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM2)
    public void setViewParam2(String viewParam2){
        this.set(FIELD_VIEWPARAM2, viewParam2);
    }
    
    /**
     * 获取 视图参数2  
     * @return
     */
    @JsonIgnore
    public String getViewParam2(){
        Object objValue = this.get(FIELD_VIEWPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam2Dirty(){
        if(this.contains(FIELD_VIEWPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数2
     */
    @JsonIgnore
    public void resetViewParam2(){
        this.reset(FIELD_VIEWPARAM2);
    }

    /**
     * 设置 视图参数2
     * <P>
     * 等同 {@link #setViewParam2}
     * @param viewParam2
     */
    @JsonIgnore
    public PSDEViewEngine viewparam2(String viewParam2){
        this.setViewParam2(viewParam2);
        return this;
    }

    /**
     * <B>VIEWPARAM3</B>&nbsp;视图参数3
     */
    public final static String FIELD_VIEWPARAM3 = "viewparam3";

    /**
     * 设置 视图参数3
     * 
     * @param viewParam3
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM3)
    public void setViewParam3(Integer viewParam3){
        this.set(FIELD_VIEWPARAM3, viewParam3);
    }
    
    /**
     * 获取 视图参数3  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam3(){
        Object objValue = this.get(FIELD_VIEWPARAM3);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam3Dirty(){
        if(this.contains(FIELD_VIEWPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数3
     */
    @JsonIgnore
    public void resetViewParam3(){
        this.reset(FIELD_VIEWPARAM3);
    }

    /**
     * 设置 视图参数3
     * <P>
     * 等同 {@link #setViewParam3}
     * @param viewParam3
     */
    @JsonIgnore
    public PSDEViewEngine viewparam3(Integer viewParam3){
        this.setViewParam3(viewParam3);
        return this;
    }

    /**
     * <B>VIEWPARAM4</B>&nbsp;视图参数4
     */
    public final static String FIELD_VIEWPARAM4 = "viewparam4";

    /**
     * 设置 视图参数4
     * 
     * @param viewParam4
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM4)
    public void setViewParam4(Integer viewParam4){
        this.set(FIELD_VIEWPARAM4, viewParam4);
    }
    
    /**
     * 获取 视图参数4  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam4(){
        Object objValue = this.get(FIELD_VIEWPARAM4);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam4Dirty(){
        if(this.contains(FIELD_VIEWPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数4
     */
    @JsonIgnore
    public void resetViewParam4(){
        this.reset(FIELD_VIEWPARAM4);
    }

    /**
     * 设置 视图参数4
     * <P>
     * 等同 {@link #setViewParam4}
     * @param viewParam4
     */
    @JsonIgnore
    public PSDEViewEngine viewparam4(Integer viewParam4){
        this.setViewParam4(viewParam4);
        return this;
    }

    /**
     * <B>VIEWPARAM5</B>&nbsp;视图参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VIEWPARAM5 = "viewparam5";

    /**
     * 设置 视图参数5
     * 
     * @param viewParam5
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM5)
    public void setViewParam5(Integer viewParam5){
        this.set(FIELD_VIEWPARAM5, viewParam5);
    }
    
    /**
     * 获取 视图参数5  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam5(){
        Object objValue = this.get(FIELD_VIEWPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam5Dirty(){
        if(this.contains(FIELD_VIEWPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数5
     */
    @JsonIgnore
    public void resetViewParam5(){
        this.reset(FIELD_VIEWPARAM5);
    }

    /**
     * 设置 视图参数5
     * <P>
     * 等同 {@link #setViewParam5}
     * @param viewParam5
     */
    @JsonIgnore
    public PSDEViewEngine viewparam5(Integer viewParam5){
        this.setViewParam5(viewParam5);
        return this;
    }

     /**
     * 设置 视图参数5
     * <P>
     * 等同 {@link #setViewParam5}
     * @param viewParam5
     */
    @JsonIgnore
    public PSDEViewEngine viewparam5(Boolean viewParam5){
        if(viewParam5 == null){
            this.setViewParam5(null);
        }
        else{
            this.setViewParam5(viewParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWPARAM6</B>&nbsp;视图参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VIEWPARAM6 = "viewparam6";

    /**
     * 设置 视图参数6
     * 
     * @param viewParam6
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM6)
    public void setViewParam6(Integer viewParam6){
        this.set(FIELD_VIEWPARAM6, viewParam6);
    }
    
    /**
     * 获取 视图参数6  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam6(){
        Object objValue = this.get(FIELD_VIEWPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam6Dirty(){
        if(this.contains(FIELD_VIEWPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数6
     */
    @JsonIgnore
    public void resetViewParam6(){
        this.reset(FIELD_VIEWPARAM6);
    }

    /**
     * 设置 视图参数6
     * <P>
     * 等同 {@link #setViewParam6}
     * @param viewParam6
     */
    @JsonIgnore
    public PSDEViewEngine viewparam6(Integer viewParam6){
        this.setViewParam6(viewParam6);
        return this;
    }

     /**
     * 设置 视图参数6
     * <P>
     * 等同 {@link #setViewParam6}
     * @param viewParam6
     */
    @JsonIgnore
    public PSDEViewEngine viewparam6(Boolean viewParam6){
        if(viewParam6 == null){
            this.setViewParam6(null);
        }
        else{
            this.setViewParam6(viewParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWPARAM7</B>&nbsp;视图参数7
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VIEWPARAM7 = "viewparam7";

    /**
     * 设置 视图参数7
     * 
     * @param viewParam7
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM7)
    public void setViewParam7(String viewParam7){
        this.set(FIELD_VIEWPARAM7, viewParam7);
    }
    
    /**
     * 获取 视图参数7  
     * @return
     */
    @JsonIgnore
    public String getViewParam7(){
        Object objValue = this.get(FIELD_VIEWPARAM7);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam7Dirty(){
        if(this.contains(FIELD_VIEWPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数7
     */
    @JsonIgnore
    public void resetViewParam7(){
        this.reset(FIELD_VIEWPARAM7);
    }

    /**
     * 设置 视图参数7
     * <P>
     * 等同 {@link #setViewParam7}
     * @param viewParam7
     */
    @JsonIgnore
    public PSDEViewEngine viewparam7(String viewParam7){
        this.setViewParam7(viewParam7);
        return this;
    }

    /**
     * <B>VIEWPARAM8</B>&nbsp;视图参数8
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VIEWPARAM8 = "viewparam8";

    /**
     * 设置 视图参数8
     * 
     * @param viewParam8
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM8)
    public void setViewParam8(String viewParam8){
        this.set(FIELD_VIEWPARAM8, viewParam8);
    }
    
    /**
     * 获取 视图参数8  
     * @return
     */
    @JsonIgnore
    public String getViewParam8(){
        Object objValue = this.get(FIELD_VIEWPARAM8);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam8Dirty(){
        if(this.contains(FIELD_VIEWPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数8
     */
    @JsonIgnore
    public void resetViewParam8(){
        this.reset(FIELD_VIEWPARAM8);
    }

    /**
     * 设置 视图参数8
     * <P>
     * 等同 {@link #setViewParam8}
     * @param viewParam8
     */
    @JsonIgnore
    public PSDEViewEngine viewparam8(String viewParam8){
        this.setViewParam8(viewParam8);
        return this;
    }

    /**
     * <B>VIEWPARAM9</B>&nbsp;视图参数9
     */
    public final static String FIELD_VIEWPARAM9 = "viewparam9";

    /**
     * 设置 视图参数9
     * 
     * @param viewParam9
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM9)
    public void setViewParam9(Integer viewParam9){
        this.set(FIELD_VIEWPARAM9, viewParam9);
    }
    
    /**
     * 获取 视图参数9  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam9(){
        Object objValue = this.get(FIELD_VIEWPARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam9Dirty(){
        if(this.contains(FIELD_VIEWPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数9
     */
    @JsonIgnore
    public void resetViewParam9(){
        this.reset(FIELD_VIEWPARAM9);
    }

    /**
     * 设置 视图参数9
     * <P>
     * 等同 {@link #setViewParam9}
     * @param viewParam9
     */
    @JsonIgnore
    public PSDEViewEngine viewparam9(Integer viewParam9){
        this.setViewParam9(viewParam9);
        return this;
    }

    /**
     * <B>WFVIEWPARAM</B>&nbsp;流程视图参数
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_WFVIEWPARAM = "wfviewparam";

    /**
     * 设置 流程视图参数
     * 
     * @param wFViewParam
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM)
    public void setWFViewParam(Integer wFViewParam){
        this.set(FIELD_WFVIEWPARAM, wFViewParam);
    }
    
    /**
     * 获取 流程视图参数  
     * @return
     */
    @JsonIgnore
    public Integer getWFViewParam(){
        Object objValue = this.get(FIELD_WFVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 流程视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParamDirty(){
        if(this.contains(FIELD_WFVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数
     */
    @JsonIgnore
    public void resetWFViewParam(){
        this.reset(FIELD_WFVIEWPARAM);
    }

    /**
     * 设置 流程视图参数
     * <P>
     * 等同 {@link #setWFViewParam}
     * @param wFViewParam
     */
    @JsonIgnore
    public PSDEViewEngine wfviewparam(Integer wFViewParam){
        this.setWFViewParam(wFViewParam);
        return this;
    }

     /**
     * 设置 流程视图参数
     * <P>
     * 等同 {@link #setWFViewParam}
     * @param wFViewParam
     */
    @JsonIgnore
    public PSDEViewEngine wfviewparam(Boolean wFViewParam){
        if(wFViewParam == null){
            this.setWFViewParam(null);
        }
        else{
            this.setWFViewParam(wFViewParam?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WFVIEWPARAM2</B>&nbsp;流程视图参数2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_WFVIEWPARAM2 = "wfviewparam2";

    /**
     * 设置 流程视图参数2
     * 
     * @param wFViewParam2
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM2)
    public void setWFViewParam2(Integer wFViewParam2){
        this.set(FIELD_WFVIEWPARAM2, wFViewParam2);
    }
    
    /**
     * 获取 流程视图参数2  
     * @return
     */
    @JsonIgnore
    public Integer getWFViewParam2(){
        Object objValue = this.get(FIELD_WFVIEWPARAM2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 流程视图参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParam2Dirty(){
        if(this.contains(FIELD_WFVIEWPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数2
     */
    @JsonIgnore
    public void resetWFViewParam2(){
        this.reset(FIELD_WFVIEWPARAM2);
    }

    /**
     * 设置 流程视图参数2
     * <P>
     * 等同 {@link #setWFViewParam2}
     * @param wFViewParam2
     */
    @JsonIgnore
    public PSDEViewEngine wfviewparam2(Integer wFViewParam2){
        this.setWFViewParam2(wFViewParam2);
        return this;
    }

     /**
     * 设置 流程视图参数2
     * <P>
     * 等同 {@link #setWFViewParam2}
     * @param wFViewParam2
     */
    @JsonIgnore
    public PSDEViewEngine wfviewparam2(Boolean wFViewParam2){
        if(wFViewParam2 == null){
            this.setWFViewParam2(null);
        }
        else{
            this.setWFViewParam2(wFViewParam2?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WFVIEWPARAM3</B>&nbsp;流程视图参数3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_WFVIEWPARAM3 = "wfviewparam3";

    /**
     * 设置 流程视图参数3
     * 
     * @param wFViewParam3
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM3)
    public void setWFViewParam3(String wFViewParam3){
        this.set(FIELD_WFVIEWPARAM3, wFViewParam3);
    }
    
    /**
     * 获取 流程视图参数3  
     * @return
     */
    @JsonIgnore
    public String getWFViewParam3(){
        Object objValue = this.get(FIELD_WFVIEWPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程视图参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParam3Dirty(){
        if(this.contains(FIELD_WFVIEWPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数3
     */
    @JsonIgnore
    public void resetWFViewParam3(){
        this.reset(FIELD_WFVIEWPARAM3);
    }

    /**
     * 设置 流程视图参数3
     * <P>
     * 等同 {@link #setWFViewParam3}
     * @param wFViewParam3
     */
    @JsonIgnore
    public PSDEViewEngine wfviewparam3(String wFViewParam3){
        this.setWFViewParam3(wFViewParam3);
        return this;
    }

    /**
     * <B>WFVIEWPARAM4</B>&nbsp;流程视图参数4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_WFVIEWPARAM4 = "wfviewparam4";

    /**
     * 设置 流程视图参数4
     * 
     * @param wFViewParam4
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM4)
    public void setWFViewParam4(String wFViewParam4){
        this.set(FIELD_WFVIEWPARAM4, wFViewParam4);
    }
    
    /**
     * 获取 流程视图参数4  
     * @return
     */
    @JsonIgnore
    public String getWFViewParam4(){
        Object objValue = this.get(FIELD_WFVIEWPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程视图参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParam4Dirty(){
        if(this.contains(FIELD_WFVIEWPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数4
     */
    @JsonIgnore
    public void resetWFViewParam4(){
        this.reset(FIELD_WFVIEWPARAM4);
    }

    /**
     * 设置 流程视图参数4
     * <P>
     * 等同 {@link #setWFViewParam4}
     * @param wFViewParam4
     */
    @JsonIgnore
    public PSDEViewEngine wfviewparam4(String wFViewParam4){
        this.setWFViewParam4(wFViewParam4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEViewEngineId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEViewEngineId(strValue);
    }

    @JsonIgnore
    public PSDEViewEngine id(String strValue){
        this.setPSDEViewEngineId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEViewEngine){
            PSDEViewEngine model = (PSDEViewEngine)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
