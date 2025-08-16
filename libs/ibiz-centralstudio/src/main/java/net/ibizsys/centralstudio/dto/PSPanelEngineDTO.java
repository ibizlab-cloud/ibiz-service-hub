package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSPANELENGINE</B>面板界面引擎 模型传输对象
 * <P>
 * 面板部件挂接的界面引擎模型，界面引擎是预置的界面交互逻辑，面板挂接引擎并指定引擎需要的参数
 */
public class PSPanelEngineDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSPanelEngineDTO(){
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
    public PSPanelEngineDTO createdate(Timestamp createDate){
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
    public PSPanelEngineDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSPanelEngineDTO engineoption(String engineOption){
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
    public PSPanelEngineDTO engineparam(String engineParam){
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
    public PSPanelEngineDTO engineparam10(Integer engineParam10){
        this.setEngineParam10(engineParam10);
        return this;
    }

    /**
     * <B>ENGINEPARAM10FLAG</B>&nbsp;启用面板引擎参数10
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM10FLAG = "engineparam10flag";

    /**
     * 设置 启用面板引擎参数10
     * 
     * @param engineParam10Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM10FLAG)
    public void setEngineParam10Flag(Integer engineParam10Flag){
        this.set(FIELD_ENGINEPARAM10FLAG, engineParam10Flag);
    }
    
    /**
     * 获取 启用面板引擎参数10  
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
     * 判断 启用面板引擎参数10 是否指定值，包括空值
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
     * 重置 启用面板引擎参数10
     */
    @JsonIgnore
    public void resetEngineParam10Flag(){
        this.reset(FIELD_ENGINEPARAM10FLAG);
    }

    /**
     * 设置 启用面板引擎参数10
     * <P>
     * 等同 {@link #setEngineParam10Flag}
     * @param engineParam10Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam10flag(Integer engineParam10Flag){
        this.setEngineParam10Flag(engineParam10Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数10
     * <P>
     * 等同 {@link #setEngineParam10Flag}
     * @param engineParam10Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam10flag(Boolean engineParam10Flag){
        if(engineParam10Flag == null){
            this.setEngineParam10Flag(null);
        }
        else{
            this.setEngineParam10Flag(engineParam10Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM10LABEL</B>&nbsp;面板引擎参数10标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM10LABEL = "engineparam10label";

    /**
     * 设置 面板引擎参数10标签
     * 
     * @param engineParam10Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM10LABEL)
    public void setEngineParam10Label(String engineParam10Label){
        this.set(FIELD_ENGINEPARAM10LABEL, engineParam10Label);
    }
    
    /**
     * 获取 面板引擎参数10标签  
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
     * 判断 面板引擎参数10标签 是否指定值，包括空值
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
     * 重置 面板引擎参数10标签
     */
    @JsonIgnore
    public void resetEngineParam10Label(){
        this.reset(FIELD_ENGINEPARAM10LABEL);
    }

    /**
     * 设置 面板引擎参数10标签
     * <P>
     * 等同 {@link #setEngineParam10Label}
     * @param engineParam10Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam10label(String engineParam10Label){
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
    public PSPanelEngineDTO engineparam2(String engineParam2){
        this.setEngineParam2(engineParam2);
        return this;
    }

    /**
     * <B>ENGINEPARAM2FLAG</B>&nbsp;启用面板引擎参数2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM2FLAG = "engineparam2flag";

    /**
     * 设置 启用面板引擎参数2
     * 
     * @param engineParam2Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM2FLAG)
    public void setEngineParam2Flag(Integer engineParam2Flag){
        this.set(FIELD_ENGINEPARAM2FLAG, engineParam2Flag);
    }
    
    /**
     * 获取 启用面板引擎参数2  
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
     * 判断 启用面板引擎参数2 是否指定值，包括空值
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
     * 重置 启用面板引擎参数2
     */
    @JsonIgnore
    public void resetEngineParam2Flag(){
        this.reset(FIELD_ENGINEPARAM2FLAG);
    }

    /**
     * 设置 启用面板引擎参数2
     * <P>
     * 等同 {@link #setEngineParam2Flag}
     * @param engineParam2Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam2flag(Integer engineParam2Flag){
        this.setEngineParam2Flag(engineParam2Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数2
     * <P>
     * 等同 {@link #setEngineParam2Flag}
     * @param engineParam2Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam2flag(Boolean engineParam2Flag){
        if(engineParam2Flag == null){
            this.setEngineParam2Flag(null);
        }
        else{
            this.setEngineParam2Flag(engineParam2Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM2LABEL</B>&nbsp;面板引擎参数2标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM2LABEL = "engineparam2label";

    /**
     * 设置 面板引擎参数2标签
     * 
     * @param engineParam2Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM2LABEL)
    public void setEngineParam2Label(String engineParam2Label){
        this.set(FIELD_ENGINEPARAM2LABEL, engineParam2Label);
    }
    
    /**
     * 获取 面板引擎参数2标签  
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
     * 判断 面板引擎参数2标签 是否指定值，包括空值
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
     * 重置 面板引擎参数2标签
     */
    @JsonIgnore
    public void resetEngineParam2Label(){
        this.reset(FIELD_ENGINEPARAM2LABEL);
    }

    /**
     * 设置 面板引擎参数2标签
     * <P>
     * 等同 {@link #setEngineParam2Label}
     * @param engineParam2Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam2label(String engineParam2Label){
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
    public PSPanelEngineDTO engineparam3(String engineParam3){
        this.setEngineParam3(engineParam3);
        return this;
    }

    /**
     * <B>ENGINEPARAM3FLAG</B>&nbsp;启用面板引擎参数3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM3FLAG = "engineparam3flag";

    /**
     * 设置 启用面板引擎参数3
     * 
     * @param engineParam3Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM3FLAG)
    public void setEngineParam3Flag(Integer engineParam3Flag){
        this.set(FIELD_ENGINEPARAM3FLAG, engineParam3Flag);
    }
    
    /**
     * 获取 启用面板引擎参数3  
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
     * 判断 启用面板引擎参数3 是否指定值，包括空值
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
     * 重置 启用面板引擎参数3
     */
    @JsonIgnore
    public void resetEngineParam3Flag(){
        this.reset(FIELD_ENGINEPARAM3FLAG);
    }

    /**
     * 设置 启用面板引擎参数3
     * <P>
     * 等同 {@link #setEngineParam3Flag}
     * @param engineParam3Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam3flag(Integer engineParam3Flag){
        this.setEngineParam3Flag(engineParam3Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数3
     * <P>
     * 等同 {@link #setEngineParam3Flag}
     * @param engineParam3Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam3flag(Boolean engineParam3Flag){
        if(engineParam3Flag == null){
            this.setEngineParam3Flag(null);
        }
        else{
            this.setEngineParam3Flag(engineParam3Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM3LABEL</B>&nbsp;面板引擎参数3标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM3LABEL = "engineparam3label";

    /**
     * 设置 面板引擎参数3标签
     * 
     * @param engineParam3Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM3LABEL)
    public void setEngineParam3Label(String engineParam3Label){
        this.set(FIELD_ENGINEPARAM3LABEL, engineParam3Label);
    }
    
    /**
     * 获取 面板引擎参数3标签  
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
     * 判断 面板引擎参数3标签 是否指定值，包括空值
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
     * 重置 面板引擎参数3标签
     */
    @JsonIgnore
    public void resetEngineParam3Label(){
        this.reset(FIELD_ENGINEPARAM3LABEL);
    }

    /**
     * 设置 面板引擎参数3标签
     * <P>
     * 等同 {@link #setEngineParam3Label}
     * @param engineParam3Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam3label(String engineParam3Label){
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
    public PSPanelEngineDTO engineparam4(String engineParam4){
        this.setEngineParam4(engineParam4);
        return this;
    }

    /**
     * <B>ENGINEPARAM4FLAG</B>&nbsp;启用面板引擎参数4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM4FLAG = "engineparam4flag";

    /**
     * 设置 启用面板引擎参数4
     * 
     * @param engineParam4Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM4FLAG)
    public void setEngineParam4Flag(Integer engineParam4Flag){
        this.set(FIELD_ENGINEPARAM4FLAG, engineParam4Flag);
    }
    
    /**
     * 获取 启用面板引擎参数4  
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
     * 判断 启用面板引擎参数4 是否指定值，包括空值
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
     * 重置 启用面板引擎参数4
     */
    @JsonIgnore
    public void resetEngineParam4Flag(){
        this.reset(FIELD_ENGINEPARAM4FLAG);
    }

    /**
     * 设置 启用面板引擎参数4
     * <P>
     * 等同 {@link #setEngineParam4Flag}
     * @param engineParam4Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam4flag(Integer engineParam4Flag){
        this.setEngineParam4Flag(engineParam4Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数4
     * <P>
     * 等同 {@link #setEngineParam4Flag}
     * @param engineParam4Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam4flag(Boolean engineParam4Flag){
        if(engineParam4Flag == null){
            this.setEngineParam4Flag(null);
        }
        else{
            this.setEngineParam4Flag(engineParam4Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM4LABEL</B>&nbsp;面板引擎参数4标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM4LABEL = "engineparam4label";

    /**
     * 设置 面板引擎参数4标签
     * 
     * @param engineParam4Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM4LABEL)
    public void setEngineParam4Label(String engineParam4Label){
        this.set(FIELD_ENGINEPARAM4LABEL, engineParam4Label);
    }
    
    /**
     * 获取 面板引擎参数4标签  
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
     * 判断 面板引擎参数4标签 是否指定值，包括空值
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
     * 重置 面板引擎参数4标签
     */
    @JsonIgnore
    public void resetEngineParam4Label(){
        this.reset(FIELD_ENGINEPARAM4LABEL);
    }

    /**
     * 设置 面板引擎参数4标签
     * <P>
     * 等同 {@link #setEngineParam4Label}
     * @param engineParam4Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam4label(String engineParam4Label){
        this.setEngineParam4Label(engineParam4Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM5</B>&nbsp;引擎参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO engineparam5(Integer engineParam5){
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
    public PSPanelEngineDTO engineparam5(Boolean engineParam5){
        if(engineParam5 == null){
            this.setEngineParam5(null);
        }
        else{
            this.setEngineParam5(engineParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM5FLAG</B>&nbsp;启用面板引擎参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM5FLAG = "engineparam5flag";

    /**
     * 设置 启用面板引擎参数5
     * 
     * @param engineParam5Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM5FLAG)
    public void setEngineParam5Flag(Integer engineParam5Flag){
        this.set(FIELD_ENGINEPARAM5FLAG, engineParam5Flag);
    }
    
    /**
     * 获取 启用面板引擎参数5  
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
     * 判断 启用面板引擎参数5 是否指定值，包括空值
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
     * 重置 启用面板引擎参数5
     */
    @JsonIgnore
    public void resetEngineParam5Flag(){
        this.reset(FIELD_ENGINEPARAM5FLAG);
    }

    /**
     * 设置 启用面板引擎参数5
     * <P>
     * 等同 {@link #setEngineParam5Flag}
     * @param engineParam5Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam5flag(Integer engineParam5Flag){
        this.setEngineParam5Flag(engineParam5Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数5
     * <P>
     * 等同 {@link #setEngineParam5Flag}
     * @param engineParam5Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam5flag(Boolean engineParam5Flag){
        if(engineParam5Flag == null){
            this.setEngineParam5Flag(null);
        }
        else{
            this.setEngineParam5Flag(engineParam5Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM5LABEL</B>&nbsp;面板引擎参数5标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM5LABEL = "engineparam5label";

    /**
     * 设置 面板引擎参数5标签
     * 
     * @param engineParam5Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM5LABEL)
    public void setEngineParam5Label(String engineParam5Label){
        this.set(FIELD_ENGINEPARAM5LABEL, engineParam5Label);
    }
    
    /**
     * 获取 面板引擎参数5标签  
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
     * 判断 面板引擎参数5标签 是否指定值，包括空值
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
     * 重置 面板引擎参数5标签
     */
    @JsonIgnore
    public void resetEngineParam5Label(){
        this.reset(FIELD_ENGINEPARAM5LABEL);
    }

    /**
     * 设置 面板引擎参数5标签
     * <P>
     * 等同 {@link #setEngineParam5Label}
     * @param engineParam5Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam5label(String engineParam5Label){
        this.setEngineParam5Label(engineParam5Label);
        return this;
    }

    /**
     * <B>ENGINEPARAM6</B>&nbsp;引擎参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO engineparam6(Integer engineParam6){
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
    public PSPanelEngineDTO engineparam6(Boolean engineParam6){
        if(engineParam6 == null){
            this.setEngineParam6(null);
        }
        else{
            this.setEngineParam6(engineParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM6FLAG</B>&nbsp;启用面板引擎参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM6FLAG = "engineparam6flag";

    /**
     * 设置 启用面板引擎参数6
     * 
     * @param engineParam6Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM6FLAG)
    public void setEngineParam6Flag(Integer engineParam6Flag){
        this.set(FIELD_ENGINEPARAM6FLAG, engineParam6Flag);
    }
    
    /**
     * 获取 启用面板引擎参数6  
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
     * 判断 启用面板引擎参数6 是否指定值，包括空值
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
     * 重置 启用面板引擎参数6
     */
    @JsonIgnore
    public void resetEngineParam6Flag(){
        this.reset(FIELD_ENGINEPARAM6FLAG);
    }

    /**
     * 设置 启用面板引擎参数6
     * <P>
     * 等同 {@link #setEngineParam6Flag}
     * @param engineParam6Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam6flag(Integer engineParam6Flag){
        this.setEngineParam6Flag(engineParam6Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数6
     * <P>
     * 等同 {@link #setEngineParam6Flag}
     * @param engineParam6Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam6flag(Boolean engineParam6Flag){
        if(engineParam6Flag == null){
            this.setEngineParam6Flag(null);
        }
        else{
            this.setEngineParam6Flag(engineParam6Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM6LABEL</B>&nbsp;面板引擎参数6标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM6LABEL = "engineparam6label";

    /**
     * 设置 面板引擎参数6标签
     * 
     * @param engineParam6Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM6LABEL)
    public void setEngineParam6Label(String engineParam6Label){
        this.set(FIELD_ENGINEPARAM6LABEL, engineParam6Label);
    }
    
    /**
     * 获取 面板引擎参数6标签  
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
     * 判断 面板引擎参数6标签 是否指定值，包括空值
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
     * 重置 面板引擎参数6标签
     */
    @JsonIgnore
    public void resetEngineParam6Label(){
        this.reset(FIELD_ENGINEPARAM6LABEL);
    }

    /**
     * 设置 面板引擎参数6标签
     * <P>
     * 等同 {@link #setEngineParam6Label}
     * @param engineParam6Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam6label(String engineParam6Label){
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
    public PSPanelEngineDTO engineparam7(Integer engineParam7){
        this.setEngineParam7(engineParam7);
        return this;
    }

    /**
     * <B>ENGINEPARAM7FLAG</B>&nbsp;启用面板引擎参数7
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM7FLAG = "engineparam7flag";

    /**
     * 设置 启用面板引擎参数7
     * 
     * @param engineParam7Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM7FLAG)
    public void setEngineParam7Flag(Integer engineParam7Flag){
        this.set(FIELD_ENGINEPARAM7FLAG, engineParam7Flag);
    }
    
    /**
     * 获取 启用面板引擎参数7  
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
     * 判断 启用面板引擎参数7 是否指定值，包括空值
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
     * 重置 启用面板引擎参数7
     */
    @JsonIgnore
    public void resetEngineParam7Flag(){
        this.reset(FIELD_ENGINEPARAM7FLAG);
    }

    /**
     * 设置 启用面板引擎参数7
     * <P>
     * 等同 {@link #setEngineParam7Flag}
     * @param engineParam7Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam7flag(Integer engineParam7Flag){
        this.setEngineParam7Flag(engineParam7Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数7
     * <P>
     * 等同 {@link #setEngineParam7Flag}
     * @param engineParam7Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam7flag(Boolean engineParam7Flag){
        if(engineParam7Flag == null){
            this.setEngineParam7Flag(null);
        }
        else{
            this.setEngineParam7Flag(engineParam7Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM7LABEL</B>&nbsp;面板引擎参数7标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM7LABEL = "engineparam7label";

    /**
     * 设置 面板引擎参数7标签
     * 
     * @param engineParam7Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM7LABEL)
    public void setEngineParam7Label(String engineParam7Label){
        this.set(FIELD_ENGINEPARAM7LABEL, engineParam7Label);
    }
    
    /**
     * 获取 面板引擎参数7标签  
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
     * 判断 面板引擎参数7标签 是否指定值，包括空值
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
     * 重置 面板引擎参数7标签
     */
    @JsonIgnore
    public void resetEngineParam7Label(){
        this.reset(FIELD_ENGINEPARAM7LABEL);
    }

    /**
     * 设置 面板引擎参数7标签
     * <P>
     * 等同 {@link #setEngineParam7Label}
     * @param engineParam7Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam7label(String engineParam7Label){
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
    public PSPanelEngineDTO engineparam8(Integer engineParam8){
        this.setEngineParam8(engineParam8);
        return this;
    }

    /**
     * <B>ENGINEPARAM8FLAG</B>&nbsp;启用面板引擎参数8
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM8FLAG = "engineparam8flag";

    /**
     * 设置 启用面板引擎参数8
     * 
     * @param engineParam8Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM8FLAG)
    public void setEngineParam8Flag(Integer engineParam8Flag){
        this.set(FIELD_ENGINEPARAM8FLAG, engineParam8Flag);
    }
    
    /**
     * 获取 启用面板引擎参数8  
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
     * 判断 启用面板引擎参数8 是否指定值，包括空值
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
     * 重置 启用面板引擎参数8
     */
    @JsonIgnore
    public void resetEngineParam8Flag(){
        this.reset(FIELD_ENGINEPARAM8FLAG);
    }

    /**
     * 设置 启用面板引擎参数8
     * <P>
     * 等同 {@link #setEngineParam8Flag}
     * @param engineParam8Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam8flag(Integer engineParam8Flag){
        this.setEngineParam8Flag(engineParam8Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数8
     * <P>
     * 等同 {@link #setEngineParam8Flag}
     * @param engineParam8Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam8flag(Boolean engineParam8Flag){
        if(engineParam8Flag == null){
            this.setEngineParam8Flag(null);
        }
        else{
            this.setEngineParam8Flag(engineParam8Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM8LABEL</B>&nbsp;面板引擎参数8标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM8LABEL = "engineparam8label";

    /**
     * 设置 面板引擎参数8标签
     * 
     * @param engineParam8Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM8LABEL)
    public void setEngineParam8Label(String engineParam8Label){
        this.set(FIELD_ENGINEPARAM8LABEL, engineParam8Label);
    }
    
    /**
     * 获取 面板引擎参数8标签  
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
     * 判断 面板引擎参数8标签 是否指定值，包括空值
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
     * 重置 面板引擎参数8标签
     */
    @JsonIgnore
    public void resetEngineParam8Label(){
        this.reset(FIELD_ENGINEPARAM8LABEL);
    }

    /**
     * 设置 面板引擎参数8标签
     * <P>
     * 等同 {@link #setEngineParam8Label}
     * @param engineParam8Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam8label(String engineParam8Label){
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
    public PSPanelEngineDTO engineparam9(Integer engineParam9){
        this.setEngineParam9(engineParam9);
        return this;
    }

    /**
     * <B>ENGINEPARAM9FLAG</B>&nbsp;启用面板引擎参数9
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAM9FLAG = "engineparam9flag";

    /**
     * 设置 启用面板引擎参数9
     * 
     * @param engineParam9Flag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM9FLAG)
    public void setEngineParam9Flag(Integer engineParam9Flag){
        this.set(FIELD_ENGINEPARAM9FLAG, engineParam9Flag);
    }
    
    /**
     * 获取 启用面板引擎参数9  
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
     * 判断 启用面板引擎参数9 是否指定值，包括空值
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
     * 重置 启用面板引擎参数9
     */
    @JsonIgnore
    public void resetEngineParam9Flag(){
        this.reset(FIELD_ENGINEPARAM9FLAG);
    }

    /**
     * 设置 启用面板引擎参数9
     * <P>
     * 等同 {@link #setEngineParam9Flag}
     * @param engineParam9Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam9flag(Integer engineParam9Flag){
        this.setEngineParam9Flag(engineParam9Flag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数9
     * <P>
     * 等同 {@link #setEngineParam9Flag}
     * @param engineParam9Flag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam9flag(Boolean engineParam9Flag){
        if(engineParam9Flag == null){
            this.setEngineParam9Flag(null);
        }
        else{
            this.setEngineParam9Flag(engineParam9Flag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAM9LABEL</B>&nbsp;面板引擎参数9标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAM9LABEL = "engineparam9label";

    /**
     * 设置 面板引擎参数9标签
     * 
     * @param engineParam9Label
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAM9LABEL)
    public void setEngineParam9Label(String engineParam9Label){
        this.set(FIELD_ENGINEPARAM9LABEL, engineParam9Label);
    }
    
    /**
     * 获取 面板引擎参数9标签  
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
     * 判断 面板引擎参数9标签 是否指定值，包括空值
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
     * 重置 面板引擎参数9标签
     */
    @JsonIgnore
    public void resetEngineParam9Label(){
        this.reset(FIELD_ENGINEPARAM9LABEL);
    }

    /**
     * 设置 面板引擎参数9标签
     * <P>
     * 等同 {@link #setEngineParam9Label}
     * @param engineParam9Label
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparam9label(String engineParam9Label){
        this.setEngineParam9Label(engineParam9Label);
        return this;
    }

    /**
     * <B>ENGINEPARAMFLAG</B>&nbsp;启用面板引擎参数
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENGINEPARAMFLAG = "engineparamflag";

    /**
     * 设置 启用面板引擎参数
     * 
     * @param engineParamFlag
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAMFLAG)
    public void setEngineParamFlag(Integer engineParamFlag){
        this.set(FIELD_ENGINEPARAMFLAG, engineParamFlag);
    }
    
    /**
     * 获取 启用面板引擎参数  
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
     * 判断 启用面板引擎参数 是否指定值，包括空值
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
     * 重置 启用面板引擎参数
     */
    @JsonIgnore
    public void resetEngineParamFlag(){
        this.reset(FIELD_ENGINEPARAMFLAG);
    }

    /**
     * 设置 启用面板引擎参数
     * <P>
     * 等同 {@link #setEngineParamFlag}
     * @param engineParamFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparamflag(Integer engineParamFlag){
        this.setEngineParamFlag(engineParamFlag);
        return this;
    }

     /**
     * 设置 启用面板引擎参数
     * <P>
     * 等同 {@link #setEngineParamFlag}
     * @param engineParamFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparamflag(Boolean engineParamFlag){
        if(engineParamFlag == null){
            this.setEngineParamFlag(null);
        }
        else{
            this.setEngineParamFlag(engineParamFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENGINEPARAMLABEL</B>&nbsp;面板引擎参数标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_ENGINEPARAMLABEL = "engineparamlabel";

    /**
     * 设置 面板引擎参数标签
     * 
     * @param engineParamLabel
     * 
     */
    @JsonProperty(FIELD_ENGINEPARAMLABEL)
    public void setEngineParamLabel(String engineParamLabel){
        this.set(FIELD_ENGINEPARAMLABEL, engineParamLabel);
    }
    
    /**
     * 获取 面板引擎参数标签  
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
     * 判断 面板引擎参数标签 是否指定值，包括空值
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
     * 重置 面板引擎参数标签
     */
    @JsonIgnore
    public void resetEngineParamLabel(){
        this.reset(FIELD_ENGINEPARAMLABEL);
    }

    /**
     * 设置 面板引擎参数标签
     * <P>
     * 等同 {@link #setEngineParamLabel}
     * @param engineParamLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO engineparamlabel(String engineParamLabel){
        this.setEngineParamLabel(engineParamLabel);
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
    public PSPanelEngineDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NO2PANELITEMFLAG</B>&nbsp;启用面板成员2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO2PANELITEMFLAG = "no2panelitemflag";

    /**
     * 设置 启用面板成员2
     * 
     * @param no2PanelItemFlag
     * 
     */
    @JsonProperty(FIELD_NO2PANELITEMFLAG)
    public void setNo2PanelItemFlag(Integer no2PanelItemFlag){
        this.set(FIELD_NO2PANELITEMFLAG, no2PanelItemFlag);
    }
    
    /**
     * 获取 启用面板成员2  
     * @return
     */
    @JsonIgnore
    public Integer getNo2PanelItemFlag(){
        Object objValue = this.get(FIELD_NO2PANELITEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板成员2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PanelItemFlagDirty(){
        if(this.contains(FIELD_NO2PANELITEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板成员2
     */
    @JsonIgnore
    public void resetNo2PanelItemFlag(){
        this.reset(FIELD_NO2PANELITEMFLAG);
    }

    /**
     * 设置 启用面板成员2
     * <P>
     * 等同 {@link #setNo2PanelItemFlag}
     * @param no2PanelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no2panelitemflag(Integer no2PanelItemFlag){
        this.setNo2PanelItemFlag(no2PanelItemFlag);
        return this;
    }

     /**
     * 设置 启用面板成员2
     * <P>
     * 等同 {@link #setNo2PanelItemFlag}
     * @param no2PanelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no2panelitemflag(Boolean no2PanelItemFlag){
        if(no2PanelItemFlag == null){
            this.setNo2PanelItemFlag(null);
        }
        else{
            this.setNo2PanelItemFlag(no2PanelItemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2PANELITEMLABEL</B>&nbsp;面板成员2标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO2PANELITEMLABEL = "no2panelitemlabel";

    /**
     * 设置 面板成员2标签
     * 
     * @param no2PanelItemLabel
     * 
     */
    @JsonProperty(FIELD_NO2PANELITEMLABEL)
    public void setNo2PanelItemLabel(String no2PanelItemLabel){
        this.set(FIELD_NO2PANELITEMLABEL, no2PanelItemLabel);
    }
    
    /**
     * 获取 面板成员2标签  
     * @return
     */
    @JsonIgnore
    public String getNo2PanelItemLabel(){
        Object objValue = this.get(FIELD_NO2PANELITEMLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员2标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PanelItemLabelDirty(){
        if(this.contains(FIELD_NO2PANELITEMLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员2标签
     */
    @JsonIgnore
    public void resetNo2PanelItemLabel(){
        this.reset(FIELD_NO2PANELITEMLABEL);
    }

    /**
     * 设置 面板成员2标签
     * <P>
     * 等同 {@link #setNo2PanelItemLabel}
     * @param no2PanelItemLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO no2panelitemlabel(String no2PanelItemLabel){
        this.setNo2PanelItemLabel(no2PanelItemLabel);
        return this;
    }

    /**
     * <B>NO2PANELLOGICFLAG</B>&nbsp;启用面板逻辑2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO2PANELLOGICFLAG = "no2panellogicflag";

    /**
     * 设置 启用面板逻辑2
     * 
     * @param no2PanelLogicFlag
     * 
     */
    @JsonProperty(FIELD_NO2PANELLOGICFLAG)
    public void setNo2PanelLogicFlag(Integer no2PanelLogicFlag){
        this.set(FIELD_NO2PANELLOGICFLAG, no2PanelLogicFlag);
    }
    
    /**
     * 获取 启用面板逻辑2  
     * @return
     */
    @JsonIgnore
    public Integer getNo2PanelLogicFlag(){
        Object objValue = this.get(FIELD_NO2PANELLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板逻辑2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PanelLogicFlagDirty(){
        if(this.contains(FIELD_NO2PANELLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板逻辑2
     */
    @JsonIgnore
    public void resetNo2PanelLogicFlag(){
        this.reset(FIELD_NO2PANELLOGICFLAG);
    }

    /**
     * 设置 启用面板逻辑2
     * <P>
     * 等同 {@link #setNo2PanelLogicFlag}
     * @param no2PanelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no2panellogicflag(Integer no2PanelLogicFlag){
        this.setNo2PanelLogicFlag(no2PanelLogicFlag);
        return this;
    }

     /**
     * 设置 启用面板逻辑2
     * <P>
     * 等同 {@link #setNo2PanelLogicFlag}
     * @param no2PanelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no2panellogicflag(Boolean no2PanelLogicFlag){
        if(no2PanelLogicFlag == null){
            this.setNo2PanelLogicFlag(null);
        }
        else{
            this.setNo2PanelLogicFlag(no2PanelLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2PANELLOGICLABEL</B>&nbsp;面板逻辑2标签
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_NO2PANELLOGICLABEL = "no2panellogiclabel";

    /**
     * 设置 面板逻辑2标签
     * 
     * @param no2PanelLogicLabel
     * 
     */
    @JsonProperty(FIELD_NO2PANELLOGICLABEL)
    public void setNo2PanelLogicLabel(String no2PanelLogicLabel){
        this.set(FIELD_NO2PANELLOGICLABEL, no2PanelLogicLabel);
    }
    
    /**
     * 获取 面板逻辑2标签  
     * @return
     */
    @JsonIgnore
    public String getNo2PanelLogicLabel(){
        Object objValue = this.get(FIELD_NO2PANELLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑2标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PanelLogicLabelDirty(){
        if(this.contains(FIELD_NO2PANELLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑2标签
     */
    @JsonIgnore
    public void resetNo2PanelLogicLabel(){
        this.reset(FIELD_NO2PANELLOGICLABEL);
    }

    /**
     * 设置 面板逻辑2标签
     * <P>
     * 等同 {@link #setNo2PanelLogicLabel}
     * @param no2PanelLogicLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO no2panellogiclabel(String no2PanelLogicLabel){
        this.setNo2PanelLogicLabel(no2PanelLogicLabel);
        return this;
    }

    /**
     * <B>NO2PSPANELITEMID</B>&nbsp;面板成员2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO} 
     */
    public final static String FIELD_NO2PSPANELITEMID = "no2pspanelitemid";

    /**
     * 设置 面板成员2
     * 
     * @param no2PSPanelItemId
     * 
     */
    @JsonProperty(FIELD_NO2PSPANELITEMID)
    public void setNo2PSPanelItemId(String no2PSPanelItemId){
        this.set(FIELD_NO2PSPANELITEMID, no2PSPanelItemId);
    }
    
    /**
     * 获取 面板成员2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSPanelItemId(){
        Object objValue = this.get(FIELD_NO2PSPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSPanelItemIdDirty(){
        if(this.contains(FIELD_NO2PSPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员2
     */
    @JsonIgnore
    public void resetNo2PSPanelItemId(){
        this.reset(FIELD_NO2PSPANELITEMID);
    }

    /**
     * 设置 面板成员2
     * <P>
     * 等同 {@link #setNo2PSPanelItemId}
     * @param no2PSPanelItemId
     */
    @JsonIgnore
    public PSPanelEngineDTO no2pspanelitemid(String no2PSPanelItemId){
        this.setNo2PSPanelItemId(no2PSPanelItemId);
        return this;
    }

    /**
     * 设置 面板成员2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO no2pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setNo2PSPanelItemId(null);
            this.setNo2PSPanelItemName(null);
        }
        else{
            this.setNo2PSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setNo2PSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>NO2PSPANELITEMNAME</B>&nbsp;面板成员2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSPANELITEMID}
     */
    public final static String FIELD_NO2PSPANELITEMNAME = "no2pspanelitemname";

    /**
     * 设置 面板成员2
     * 
     * @param no2PSPanelItemName
     * 
     */
    @JsonProperty(FIELD_NO2PSPANELITEMNAME)
    public void setNo2PSPanelItemName(String no2PSPanelItemName){
        this.set(FIELD_NO2PSPANELITEMNAME, no2PSPanelItemName);
    }
    
    /**
     * 获取 面板成员2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSPanelItemName(){
        Object objValue = this.get(FIELD_NO2PSPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSPanelItemNameDirty(){
        if(this.contains(FIELD_NO2PSPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员2
     */
    @JsonIgnore
    public void resetNo2PSPanelItemName(){
        this.reset(FIELD_NO2PSPANELITEMNAME);
    }

    /**
     * 设置 面板成员2
     * <P>
     * 等同 {@link #setNo2PSPanelItemName}
     * @param no2PSPanelItemName
     */
    @JsonIgnore
    public PSPanelEngineDTO no2pspanelitemname(String no2PSPanelItemName){
        this.setNo2PSPanelItemName(no2PSPanelItemName);
        return this;
    }

    /**
     * <B>NO2PSPANELLOGICID</B>&nbsp;面板逻辑2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO} 
     */
    public final static String FIELD_NO2PSPANELLOGICID = "no2pspanellogicid";

    /**
     * 设置 面板逻辑2
     * 
     * @param no2PSPanelLogicId
     * 
     */
    @JsonProperty(FIELD_NO2PSPANELLOGICID)
    public void setNo2PSPanelLogicId(String no2PSPanelLogicId){
        this.set(FIELD_NO2PSPANELLOGICID, no2PSPanelLogicId);
    }
    
    /**
     * 获取 面板逻辑2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSPanelLogicId(){
        Object objValue = this.get(FIELD_NO2PSPANELLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSPanelLogicIdDirty(){
        if(this.contains(FIELD_NO2PSPANELLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑2
     */
    @JsonIgnore
    public void resetNo2PSPanelLogicId(){
        this.reset(FIELD_NO2PSPANELLOGICID);
    }

    /**
     * 设置 面板逻辑2
     * <P>
     * 等同 {@link #setNo2PSPanelLogicId}
     * @param no2PSPanelLogicId
     */
    @JsonIgnore
    public PSPanelEngineDTO no2pspanellogicid(String no2PSPanelLogicId){
        this.setNo2PSPanelLogicId(no2PSPanelLogicId);
        return this;
    }

    /**
     * 设置 面板逻辑2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSPanelLogicId}
     * @param pSSysViewPanelLogic 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO no2pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic){
        if(pSSysViewPanelLogic == null){
            this.setNo2PSPanelLogicId(null);
            this.setNo2PSPanelLogicName(null);
        }
        else{
            this.setNo2PSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setNo2PSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    /**
     * <B>NO2PSPANELLOGICNAME</B>&nbsp;面板逻辑2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSPANELLOGICID}
     */
    public final static String FIELD_NO2PSPANELLOGICNAME = "no2pspanellogicname";

    /**
     * 设置 面板逻辑2
     * 
     * @param no2PSPanelLogicName
     * 
     */
    @JsonProperty(FIELD_NO2PSPANELLOGICNAME)
    public void setNo2PSPanelLogicName(String no2PSPanelLogicName){
        this.set(FIELD_NO2PSPANELLOGICNAME, no2PSPanelLogicName);
    }
    
    /**
     * 获取 面板逻辑2  
     * @return
     */
    @JsonIgnore
    public String getNo2PSPanelLogicName(){
        Object objValue = this.get(FIELD_NO2PSPANELLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSPanelLogicNameDirty(){
        if(this.contains(FIELD_NO2PSPANELLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑2
     */
    @JsonIgnore
    public void resetNo2PSPanelLogicName(){
        this.reset(FIELD_NO2PSPANELLOGICNAME);
    }

    /**
     * 设置 面板逻辑2
     * <P>
     * 等同 {@link #setNo2PSPanelLogicName}
     * @param no2PSPanelLogicName
     */
    @JsonIgnore
    public PSPanelEngineDTO no2pspanellogicname(String no2PSPanelLogicName){
        this.setNo2PSPanelLogicName(no2PSPanelLogicName);
        return this;
    }

    /**
     * <B>NO3PANELITEMFLAG</B>&nbsp;启用面板成员3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO3PANELITEMFLAG = "no3panelitemflag";

    /**
     * 设置 启用面板成员3
     * 
     * @param no3PanelItemFlag
     * 
     */
    @JsonProperty(FIELD_NO3PANELITEMFLAG)
    public void setNo3PanelItemFlag(Integer no3PanelItemFlag){
        this.set(FIELD_NO3PANELITEMFLAG, no3PanelItemFlag);
    }
    
    /**
     * 获取 启用面板成员3  
     * @return
     */
    @JsonIgnore
    public Integer getNo3PanelItemFlag(){
        Object objValue = this.get(FIELD_NO3PANELITEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板成员3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PanelItemFlagDirty(){
        if(this.contains(FIELD_NO3PANELITEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板成员3
     */
    @JsonIgnore
    public void resetNo3PanelItemFlag(){
        this.reset(FIELD_NO3PANELITEMFLAG);
    }

    /**
     * 设置 启用面板成员3
     * <P>
     * 等同 {@link #setNo3PanelItemFlag}
     * @param no3PanelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no3panelitemflag(Integer no3PanelItemFlag){
        this.setNo3PanelItemFlag(no3PanelItemFlag);
        return this;
    }

     /**
     * 设置 启用面板成员3
     * <P>
     * 等同 {@link #setNo3PanelItemFlag}
     * @param no3PanelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no3panelitemflag(Boolean no3PanelItemFlag){
        if(no3PanelItemFlag == null){
            this.setNo3PanelItemFlag(null);
        }
        else{
            this.setNo3PanelItemFlag(no3PanelItemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO3PANELITEMLABEL</B>&nbsp;面板成员3标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO3PANELITEMLABEL = "no3panelitemlabel";

    /**
     * 设置 面板成员3标签
     * 
     * @param no3PanelItemLabel
     * 
     */
    @JsonProperty(FIELD_NO3PANELITEMLABEL)
    public void setNo3PanelItemLabel(String no3PanelItemLabel){
        this.set(FIELD_NO3PANELITEMLABEL, no3PanelItemLabel);
    }
    
    /**
     * 获取 面板成员3标签  
     * @return
     */
    @JsonIgnore
    public String getNo3PanelItemLabel(){
        Object objValue = this.get(FIELD_NO3PANELITEMLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员3标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PanelItemLabelDirty(){
        if(this.contains(FIELD_NO3PANELITEMLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员3标签
     */
    @JsonIgnore
    public void resetNo3PanelItemLabel(){
        this.reset(FIELD_NO3PANELITEMLABEL);
    }

    /**
     * 设置 面板成员3标签
     * <P>
     * 等同 {@link #setNo3PanelItemLabel}
     * @param no3PanelItemLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO no3panelitemlabel(String no3PanelItemLabel){
        this.setNo3PanelItemLabel(no3PanelItemLabel);
        return this;
    }

    /**
     * <B>NO3PANELLOGICFLAG</B>&nbsp;启用面板逻辑3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO3PANELLOGICFLAG = "no3panellogicflag";

    /**
     * 设置 启用面板逻辑3
     * 
     * @param no3PanelLogicFlag
     * 
     */
    @JsonProperty(FIELD_NO3PANELLOGICFLAG)
    public void setNo3PanelLogicFlag(Integer no3PanelLogicFlag){
        this.set(FIELD_NO3PANELLOGICFLAG, no3PanelLogicFlag);
    }
    
    /**
     * 获取 启用面板逻辑3  
     * @return
     */
    @JsonIgnore
    public Integer getNo3PanelLogicFlag(){
        Object objValue = this.get(FIELD_NO3PANELLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板逻辑3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PanelLogicFlagDirty(){
        if(this.contains(FIELD_NO3PANELLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板逻辑3
     */
    @JsonIgnore
    public void resetNo3PanelLogicFlag(){
        this.reset(FIELD_NO3PANELLOGICFLAG);
    }

    /**
     * 设置 启用面板逻辑3
     * <P>
     * 等同 {@link #setNo3PanelLogicFlag}
     * @param no3PanelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no3panellogicflag(Integer no3PanelLogicFlag){
        this.setNo3PanelLogicFlag(no3PanelLogicFlag);
        return this;
    }

     /**
     * 设置 启用面板逻辑3
     * <P>
     * 等同 {@link #setNo3PanelLogicFlag}
     * @param no3PanelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no3panellogicflag(Boolean no3PanelLogicFlag){
        if(no3PanelLogicFlag == null){
            this.setNo3PanelLogicFlag(null);
        }
        else{
            this.setNo3PanelLogicFlag(no3PanelLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO3PANELLOGICLABEL</B>&nbsp;面板逻辑3标签
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_NO3PANELLOGICLABEL = "no3panellogiclabel";

    /**
     * 设置 面板逻辑3标签
     * 
     * @param no3PanelLogicLabel
     * 
     */
    @JsonProperty(FIELD_NO3PANELLOGICLABEL)
    public void setNo3PanelLogicLabel(String no3PanelLogicLabel){
        this.set(FIELD_NO3PANELLOGICLABEL, no3PanelLogicLabel);
    }
    
    /**
     * 获取 面板逻辑3标签  
     * @return
     */
    @JsonIgnore
    public String getNo3PanelLogicLabel(){
        Object objValue = this.get(FIELD_NO3PANELLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑3标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PanelLogicLabelDirty(){
        if(this.contains(FIELD_NO3PANELLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑3标签
     */
    @JsonIgnore
    public void resetNo3PanelLogicLabel(){
        this.reset(FIELD_NO3PANELLOGICLABEL);
    }

    /**
     * 设置 面板逻辑3标签
     * <P>
     * 等同 {@link #setNo3PanelLogicLabel}
     * @param no3PanelLogicLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO no3panellogiclabel(String no3PanelLogicLabel){
        this.setNo3PanelLogicLabel(no3PanelLogicLabel);
        return this;
    }

    /**
     * <B>NO3PSPANELITEMID</B>&nbsp;面板成员3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO} 
     */
    public final static String FIELD_NO3PSPANELITEMID = "no3pspanelitemid";

    /**
     * 设置 面板成员3
     * 
     * @param no3PSPanelItemId
     * 
     */
    @JsonProperty(FIELD_NO3PSPANELITEMID)
    public void setNo3PSPanelItemId(String no3PSPanelItemId){
        this.set(FIELD_NO3PSPANELITEMID, no3PSPanelItemId);
    }
    
    /**
     * 获取 面板成员3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSPanelItemId(){
        Object objValue = this.get(FIELD_NO3PSPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSPanelItemIdDirty(){
        if(this.contains(FIELD_NO3PSPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员3
     */
    @JsonIgnore
    public void resetNo3PSPanelItemId(){
        this.reset(FIELD_NO3PSPANELITEMID);
    }

    /**
     * 设置 面板成员3
     * <P>
     * 等同 {@link #setNo3PSPanelItemId}
     * @param no3PSPanelItemId
     */
    @JsonIgnore
    public PSPanelEngineDTO no3pspanelitemid(String no3PSPanelItemId){
        this.setNo3PSPanelItemId(no3PSPanelItemId);
        return this;
    }

    /**
     * 设置 面板成员3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo3PSPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO no3pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setNo3PSPanelItemId(null);
            this.setNo3PSPanelItemName(null);
        }
        else{
            this.setNo3PSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setNo3PSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>NO3PSPANELITEMNAME</B>&nbsp;面板成员3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3PSPANELITEMID}
     */
    public final static String FIELD_NO3PSPANELITEMNAME = "no3pspanelitemname";

    /**
     * 设置 面板成员3
     * 
     * @param no3PSPanelItemName
     * 
     */
    @JsonProperty(FIELD_NO3PSPANELITEMNAME)
    public void setNo3PSPanelItemName(String no3PSPanelItemName){
        this.set(FIELD_NO3PSPANELITEMNAME, no3PSPanelItemName);
    }
    
    /**
     * 获取 面板成员3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSPanelItemName(){
        Object objValue = this.get(FIELD_NO3PSPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSPanelItemNameDirty(){
        if(this.contains(FIELD_NO3PSPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员3
     */
    @JsonIgnore
    public void resetNo3PSPanelItemName(){
        this.reset(FIELD_NO3PSPANELITEMNAME);
    }

    /**
     * 设置 面板成员3
     * <P>
     * 等同 {@link #setNo3PSPanelItemName}
     * @param no3PSPanelItemName
     */
    @JsonIgnore
    public PSPanelEngineDTO no3pspanelitemname(String no3PSPanelItemName){
        this.setNo3PSPanelItemName(no3PSPanelItemName);
        return this;
    }

    /**
     * <B>NO3PSPANELLOGICID</B>&nbsp;面板逻辑3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO} 
     */
    public final static String FIELD_NO3PSPANELLOGICID = "no3pspanellogicid";

    /**
     * 设置 面板逻辑3
     * 
     * @param no3PSPanelLogicId
     * 
     */
    @JsonProperty(FIELD_NO3PSPANELLOGICID)
    public void setNo3PSPanelLogicId(String no3PSPanelLogicId){
        this.set(FIELD_NO3PSPANELLOGICID, no3PSPanelLogicId);
    }
    
    /**
     * 获取 面板逻辑3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSPanelLogicId(){
        Object objValue = this.get(FIELD_NO3PSPANELLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSPanelLogicIdDirty(){
        if(this.contains(FIELD_NO3PSPANELLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑3
     */
    @JsonIgnore
    public void resetNo3PSPanelLogicId(){
        this.reset(FIELD_NO3PSPANELLOGICID);
    }

    /**
     * 设置 面板逻辑3
     * <P>
     * 等同 {@link #setNo3PSPanelLogicId}
     * @param no3PSPanelLogicId
     */
    @JsonIgnore
    public PSPanelEngineDTO no3pspanellogicid(String no3PSPanelLogicId){
        this.setNo3PSPanelLogicId(no3PSPanelLogicId);
        return this;
    }

    /**
     * 设置 面板逻辑3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo3PSPanelLogicId}
     * @param pSSysViewPanelLogic 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO no3pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic){
        if(pSSysViewPanelLogic == null){
            this.setNo3PSPanelLogicId(null);
            this.setNo3PSPanelLogicName(null);
        }
        else{
            this.setNo3PSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setNo3PSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    /**
     * <B>NO3PSPANELLOGICNAME</B>&nbsp;面板逻辑3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3PSPANELLOGICID}
     */
    public final static String FIELD_NO3PSPANELLOGICNAME = "no3pspanellogicname";

    /**
     * 设置 面板逻辑3
     * 
     * @param no3PSPanelLogicName
     * 
     */
    @JsonProperty(FIELD_NO3PSPANELLOGICNAME)
    public void setNo3PSPanelLogicName(String no3PSPanelLogicName){
        this.set(FIELD_NO3PSPANELLOGICNAME, no3PSPanelLogicName);
    }
    
    /**
     * 获取 面板逻辑3  
     * @return
     */
    @JsonIgnore
    public String getNo3PSPanelLogicName(){
        Object objValue = this.get(FIELD_NO3PSPANELLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3PSPanelLogicNameDirty(){
        if(this.contains(FIELD_NO3PSPANELLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑3
     */
    @JsonIgnore
    public void resetNo3PSPanelLogicName(){
        this.reset(FIELD_NO3PSPANELLOGICNAME);
    }

    /**
     * 设置 面板逻辑3
     * <P>
     * 等同 {@link #setNo3PSPanelLogicName}
     * @param no3PSPanelLogicName
     */
    @JsonIgnore
    public PSPanelEngineDTO no3pspanellogicname(String no3PSPanelLogicName){
        this.setNo3PSPanelLogicName(no3PSPanelLogicName);
        return this;
    }

    /**
     * <B>NO4PANELITEMFLAG</B>&nbsp;启用面板成员4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO4PANELITEMFLAG = "no4panelitemflag";

    /**
     * 设置 启用面板成员4
     * 
     * @param no4PanelItemFlag
     * 
     */
    @JsonProperty(FIELD_NO4PANELITEMFLAG)
    public void setNo4PanelItemFlag(Integer no4PanelItemFlag){
        this.set(FIELD_NO4PANELITEMFLAG, no4PanelItemFlag);
    }
    
    /**
     * 获取 启用面板成员4  
     * @return
     */
    @JsonIgnore
    public Integer getNo4PanelItemFlag(){
        Object objValue = this.get(FIELD_NO4PANELITEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板成员4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PanelItemFlagDirty(){
        if(this.contains(FIELD_NO4PANELITEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板成员4
     */
    @JsonIgnore
    public void resetNo4PanelItemFlag(){
        this.reset(FIELD_NO4PANELITEMFLAG);
    }

    /**
     * 设置 启用面板成员4
     * <P>
     * 等同 {@link #setNo4PanelItemFlag}
     * @param no4PanelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no4panelitemflag(Integer no4PanelItemFlag){
        this.setNo4PanelItemFlag(no4PanelItemFlag);
        return this;
    }

     /**
     * 设置 启用面板成员4
     * <P>
     * 等同 {@link #setNo4PanelItemFlag}
     * @param no4PanelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no4panelitemflag(Boolean no4PanelItemFlag){
        if(no4PanelItemFlag == null){
            this.setNo4PanelItemFlag(null);
        }
        else{
            this.setNo4PanelItemFlag(no4PanelItemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO4PANELITEMLABEL</B>&nbsp;面板成员4标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_NO4PANELITEMLABEL = "no4panelitemlabel";

    /**
     * 设置 面板成员4标签
     * 
     * @param no4PanelItemLabel
     * 
     */
    @JsonProperty(FIELD_NO4PANELITEMLABEL)
    public void setNo4PanelItemLabel(String no4PanelItemLabel){
        this.set(FIELD_NO4PANELITEMLABEL, no4PanelItemLabel);
    }
    
    /**
     * 获取 面板成员4标签  
     * @return
     */
    @JsonIgnore
    public String getNo4PanelItemLabel(){
        Object objValue = this.get(FIELD_NO4PANELITEMLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员4标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PanelItemLabelDirty(){
        if(this.contains(FIELD_NO4PANELITEMLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员4标签
     */
    @JsonIgnore
    public void resetNo4PanelItemLabel(){
        this.reset(FIELD_NO4PANELITEMLABEL);
    }

    /**
     * 设置 面板成员4标签
     * <P>
     * 等同 {@link #setNo4PanelItemLabel}
     * @param no4PanelItemLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO no4panelitemlabel(String no4PanelItemLabel){
        this.setNo4PanelItemLabel(no4PanelItemLabel);
        return this;
    }

    /**
     * <B>NO4PANELLOGICFLAG</B>&nbsp;启用面板逻辑4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NO4PANELLOGICFLAG = "no4panellogicflag";

    /**
     * 设置 启用面板逻辑4
     * 
     * @param no4PanelLogicFlag
     * 
     */
    @JsonProperty(FIELD_NO4PANELLOGICFLAG)
    public void setNo4PanelLogicFlag(Integer no4PanelLogicFlag){
        this.set(FIELD_NO4PANELLOGICFLAG, no4PanelLogicFlag);
    }
    
    /**
     * 获取 启用面板逻辑4  
     * @return
     */
    @JsonIgnore
    public Integer getNo4PanelLogicFlag(){
        Object objValue = this.get(FIELD_NO4PANELLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板逻辑4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PanelLogicFlagDirty(){
        if(this.contains(FIELD_NO4PANELLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板逻辑4
     */
    @JsonIgnore
    public void resetNo4PanelLogicFlag(){
        this.reset(FIELD_NO4PANELLOGICFLAG);
    }

    /**
     * 设置 启用面板逻辑4
     * <P>
     * 等同 {@link #setNo4PanelLogicFlag}
     * @param no4PanelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no4panellogicflag(Integer no4PanelLogicFlag){
        this.setNo4PanelLogicFlag(no4PanelLogicFlag);
        return this;
    }

     /**
     * 设置 启用面板逻辑4
     * <P>
     * 等同 {@link #setNo4PanelLogicFlag}
     * @param no4PanelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO no4panellogicflag(Boolean no4PanelLogicFlag){
        if(no4PanelLogicFlag == null){
            this.setNo4PanelLogicFlag(null);
        }
        else{
            this.setNo4PanelLogicFlag(no4PanelLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO4PANELLOGICLABEL</B>&nbsp;面板逻辑4标签
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_NO4PANELLOGICLABEL = "no4panellogiclabel";

    /**
     * 设置 面板逻辑4标签
     * 
     * @param no4PanelLogicLabel
     * 
     */
    @JsonProperty(FIELD_NO4PANELLOGICLABEL)
    public void setNo4PanelLogicLabel(String no4PanelLogicLabel){
        this.set(FIELD_NO4PANELLOGICLABEL, no4PanelLogicLabel);
    }
    
    /**
     * 获取 面板逻辑4标签  
     * @return
     */
    @JsonIgnore
    public String getNo4PanelLogicLabel(){
        Object objValue = this.get(FIELD_NO4PANELLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑4标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PanelLogicLabelDirty(){
        if(this.contains(FIELD_NO4PANELLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑4标签
     */
    @JsonIgnore
    public void resetNo4PanelLogicLabel(){
        this.reset(FIELD_NO4PANELLOGICLABEL);
    }

    /**
     * 设置 面板逻辑4标签
     * <P>
     * 等同 {@link #setNo4PanelLogicLabel}
     * @param no4PanelLogicLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO no4panellogiclabel(String no4PanelLogicLabel){
        this.setNo4PanelLogicLabel(no4PanelLogicLabel);
        return this;
    }

    /**
     * <B>NO4PSPANELITEMID</B>&nbsp;面板成员4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO} 
     */
    public final static String FIELD_NO4PSPANELITEMID = "no4pspanelitemid";

    /**
     * 设置 面板成员4
     * 
     * @param no4PSPanelItemId
     * 
     */
    @JsonProperty(FIELD_NO4PSPANELITEMID)
    public void setNo4PSPanelItemId(String no4PSPanelItemId){
        this.set(FIELD_NO4PSPANELITEMID, no4PSPanelItemId);
    }
    
    /**
     * 获取 面板成员4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSPanelItemId(){
        Object objValue = this.get(FIELD_NO4PSPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSPanelItemIdDirty(){
        if(this.contains(FIELD_NO4PSPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员4
     */
    @JsonIgnore
    public void resetNo4PSPanelItemId(){
        this.reset(FIELD_NO4PSPANELITEMID);
    }

    /**
     * 设置 面板成员4
     * <P>
     * 等同 {@link #setNo4PSPanelItemId}
     * @param no4PSPanelItemId
     */
    @JsonIgnore
    public PSPanelEngineDTO no4pspanelitemid(String no4PSPanelItemId){
        this.setNo4PSPanelItemId(no4PSPanelItemId);
        return this;
    }

    /**
     * 设置 面板成员4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo4PSPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO no4pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setNo4PSPanelItemId(null);
            this.setNo4PSPanelItemName(null);
        }
        else{
            this.setNo4PSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setNo4PSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>NO4PSPANELITEMNAME</B>&nbsp;面板成员4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO4PSPANELITEMID}
     */
    public final static String FIELD_NO4PSPANELITEMNAME = "no4pspanelitemname";

    /**
     * 设置 面板成员4
     * 
     * @param no4PSPanelItemName
     * 
     */
    @JsonProperty(FIELD_NO4PSPANELITEMNAME)
    public void setNo4PSPanelItemName(String no4PSPanelItemName){
        this.set(FIELD_NO4PSPANELITEMNAME, no4PSPanelItemName);
    }
    
    /**
     * 获取 面板成员4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSPanelItemName(){
        Object objValue = this.get(FIELD_NO4PSPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSPanelItemNameDirty(){
        if(this.contains(FIELD_NO4PSPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员4
     */
    @JsonIgnore
    public void resetNo4PSPanelItemName(){
        this.reset(FIELD_NO4PSPANELITEMNAME);
    }

    /**
     * 设置 面板成员4
     * <P>
     * 等同 {@link #setNo4PSPanelItemName}
     * @param no4PSPanelItemName
     */
    @JsonIgnore
    public PSPanelEngineDTO no4pspanelitemname(String no4PSPanelItemName){
        this.setNo4PSPanelItemName(no4PSPanelItemName);
        return this;
    }

    /**
     * <B>NO4PSPANELLOGICID</B>&nbsp;面板逻辑4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO} 
     */
    public final static String FIELD_NO4PSPANELLOGICID = "no4pspanellogicid";

    /**
     * 设置 面板逻辑4
     * 
     * @param no4PSPanelLogicId
     * 
     */
    @JsonProperty(FIELD_NO4PSPANELLOGICID)
    public void setNo4PSPanelLogicId(String no4PSPanelLogicId){
        this.set(FIELD_NO4PSPANELLOGICID, no4PSPanelLogicId);
    }
    
    /**
     * 获取 面板逻辑4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSPanelLogicId(){
        Object objValue = this.get(FIELD_NO4PSPANELLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSPanelLogicIdDirty(){
        if(this.contains(FIELD_NO4PSPANELLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑4
     */
    @JsonIgnore
    public void resetNo4PSPanelLogicId(){
        this.reset(FIELD_NO4PSPANELLOGICID);
    }

    /**
     * 设置 面板逻辑4
     * <P>
     * 等同 {@link #setNo4PSPanelLogicId}
     * @param no4PSPanelLogicId
     */
    @JsonIgnore
    public PSPanelEngineDTO no4pspanellogicid(String no4PSPanelLogicId){
        this.setNo4PSPanelLogicId(no4PSPanelLogicId);
        return this;
    }

    /**
     * 设置 面板逻辑4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo4PSPanelLogicId}
     * @param pSSysViewPanelLogic 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO no4pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic){
        if(pSSysViewPanelLogic == null){
            this.setNo4PSPanelLogicId(null);
            this.setNo4PSPanelLogicName(null);
        }
        else{
            this.setNo4PSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setNo4PSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    /**
     * <B>NO4PSPANELLOGICNAME</B>&nbsp;面板逻辑4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO4PSPANELLOGICID}
     */
    public final static String FIELD_NO4PSPANELLOGICNAME = "no4pspanellogicname";

    /**
     * 设置 面板逻辑4
     * 
     * @param no4PSPanelLogicName
     * 
     */
    @JsonProperty(FIELD_NO4PSPANELLOGICNAME)
    public void setNo4PSPanelLogicName(String no4PSPanelLogicName){
        this.set(FIELD_NO4PSPANELLOGICNAME, no4PSPanelLogicName);
    }
    
    /**
     * 获取 面板逻辑4  
     * @return
     */
    @JsonIgnore
    public String getNo4PSPanelLogicName(){
        Object objValue = this.get(FIELD_NO4PSPANELLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo4PSPanelLogicNameDirty(){
        if(this.contains(FIELD_NO4PSPANELLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑4
     */
    @JsonIgnore
    public void resetNo4PSPanelLogicName(){
        this.reset(FIELD_NO4PSPANELLOGICNAME);
    }

    /**
     * 设置 面板逻辑4
     * <P>
     * 等同 {@link #setNo4PSPanelLogicName}
     * @param no4PSPanelLogicName
     */
    @JsonIgnore
    public PSPanelEngineDTO no4pspanellogicname(String no4PSPanelLogicName){
        this.setNo4PSPanelLogicName(no4PSPanelLogicName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定面板引擎挂接的次序
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
    public PSPanelEngineDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PANELITEMFLAG</B>&nbsp;启用面板成员
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PANELITEMFLAG = "panelitemflag";

    /**
     * 设置 启用面板成员
     * 
     * @param panelItemFlag
     * 
     */
    @JsonProperty(FIELD_PANELITEMFLAG)
    public void setPanelItemFlag(Integer panelItemFlag){
        this.set(FIELD_PANELITEMFLAG, panelItemFlag);
    }
    
    /**
     * 获取 启用面板成员  
     * @return
     */
    @JsonIgnore
    public Integer getPanelItemFlag(){
        Object objValue = this.get(FIELD_PANELITEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelItemFlagDirty(){
        if(this.contains(FIELD_PANELITEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板成员
     */
    @JsonIgnore
    public void resetPanelItemFlag(){
        this.reset(FIELD_PANELITEMFLAG);
    }

    /**
     * 设置 启用面板成员
     * <P>
     * 等同 {@link #setPanelItemFlag}
     * @param panelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO panelitemflag(Integer panelItemFlag){
        this.setPanelItemFlag(panelItemFlag);
        return this;
    }

     /**
     * 设置 启用面板成员
     * <P>
     * 等同 {@link #setPanelItemFlag}
     * @param panelItemFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO panelitemflag(Boolean panelItemFlag){
        if(panelItemFlag == null){
            this.setPanelItemFlag(null);
        }
        else{
            this.setPanelItemFlag(panelItemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PANELITEMLABEL</B>&nbsp;面板成员标签
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PANELITEMLABEL = "panelitemlabel";

    /**
     * 设置 面板成员标签
     * 
     * @param panelItemLabel
     * 
     */
    @JsonProperty(FIELD_PANELITEMLABEL)
    public void setPanelItemLabel(String panelItemLabel){
        this.set(FIELD_PANELITEMLABEL, panelItemLabel);
    }
    
    /**
     * 获取 面板成员标签  
     * @return
     */
    @JsonIgnore
    public String getPanelItemLabel(){
        Object objValue = this.get(FIELD_PANELITEMLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelItemLabelDirty(){
        if(this.contains(FIELD_PANELITEMLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员标签
     */
    @JsonIgnore
    public void resetPanelItemLabel(){
        this.reset(FIELD_PANELITEMLABEL);
    }

    /**
     * 设置 面板成员标签
     * <P>
     * 等同 {@link #setPanelItemLabel}
     * @param panelItemLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO panelitemlabel(String panelItemLabel){
        this.setPanelItemLabel(panelItemLabel);
        return this;
    }

    /**
     * <B>PANELLOGICFLAG</B>&nbsp;启用面板逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PANELLOGICFLAG = "panellogicflag";

    /**
     * 设置 启用面板逻辑
     * 
     * @param panelLogicFlag
     * 
     */
    @JsonProperty(FIELD_PANELLOGICFLAG)
    public void setPanelLogicFlag(Integer panelLogicFlag){
        this.set(FIELD_PANELLOGICFLAG, panelLogicFlag);
    }
    
    /**
     * 获取 启用面板逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getPanelLogicFlag(){
        Object objValue = this.get(FIELD_PANELLOGICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用面板逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelLogicFlagDirty(){
        if(this.contains(FIELD_PANELLOGICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用面板逻辑
     */
    @JsonIgnore
    public void resetPanelLogicFlag(){
        this.reset(FIELD_PANELLOGICFLAG);
    }

    /**
     * 设置 启用面板逻辑
     * <P>
     * 等同 {@link #setPanelLogicFlag}
     * @param panelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO panellogicflag(Integer panelLogicFlag){
        this.setPanelLogicFlag(panelLogicFlag);
        return this;
    }

     /**
     * 设置 启用面板逻辑
     * <P>
     * 等同 {@link #setPanelLogicFlag}
     * @param panelLogicFlag
     */
    @JsonIgnore
    public PSPanelEngineDTO panellogicflag(Boolean panelLogicFlag){
        if(panelLogicFlag == null){
            this.setPanelLogicFlag(null);
        }
        else{
            this.setPanelLogicFlag(panelLogicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PANELLOGICLABEL</B>&nbsp;面板逻辑标签
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PANELLOGICLABEL = "panellogiclabel";

    /**
     * 设置 面板逻辑标签
     * 
     * @param panelLogicLabel
     * 
     */
    @JsonProperty(FIELD_PANELLOGICLABEL)
    public void setPanelLogicLabel(String panelLogicLabel){
        this.set(FIELD_PANELLOGICLABEL, panelLogicLabel);
    }
    
    /**
     * 获取 面板逻辑标签  
     * @return
     */
    @JsonIgnore
    public String getPanelLogicLabel(){
        Object objValue = this.get(FIELD_PANELLOGICLABEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑标签 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelLogicLabelDirty(){
        if(this.contains(FIELD_PANELLOGICLABEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑标签
     */
    @JsonIgnore
    public void resetPanelLogicLabel(){
        this.reset(FIELD_PANELLOGICLABEL);
    }

    /**
     * 设置 面板逻辑标签
     * <P>
     * 等同 {@link #setPanelLogicLabel}
     * @param panelLogicLabel
     */
    @JsonIgnore
    public PSPanelEngineDTO panellogiclabel(String panelLogicLabel){
        this.setPanelLogicLabel(panelLogicLabel);
        return this;
    }

    /**
     * <B>PSPANELENGINEID</B>&nbsp;系统面板界面引擎标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPANELENGINEID = "pspanelengineid";

    /**
     * 设置 系统面板界面引擎标识
     * 
     * @param pSPanelEngineId
     * 
     */
    @JsonProperty(FIELD_PSPANELENGINEID)
    public void setPSPanelEngineId(String pSPanelEngineId){
        this.set(FIELD_PSPANELENGINEID, pSPanelEngineId);
    }
    
    /**
     * 获取 系统面板界面引擎标识  
     * @return
     */
    @JsonIgnore
    public String getPSPanelEngineId(){
        Object objValue = this.get(FIELD_PSPANELENGINEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统面板界面引擎标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelEngineIdDirty(){
        if(this.contains(FIELD_PSPANELENGINEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统面板界面引擎标识
     */
    @JsonIgnore
    public void resetPSPanelEngineId(){
        this.reset(FIELD_PSPANELENGINEID);
    }

    /**
     * 设置 系统面板界面引擎标识
     * <P>
     * 等同 {@link #setPSPanelEngineId}
     * @param pSPanelEngineId
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanelengineid(String pSPanelEngineId){
        this.setPSPanelEngineId(pSPanelEngineId);
        return this;
    }

    /**
     * <B>PSPANELENGINENAME</B>&nbsp;引擎标识，指定面板引擎的标识，需在所在面板对象中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSPANELENGINENAME = "pspanelenginename";

    /**
     * 设置 引擎标识，详细说明：{@link #FIELD_PSPANELENGINENAME}
     * 
     * @param pSPanelEngineName
     * 
     */
    @JsonProperty(FIELD_PSPANELENGINENAME)
    public void setPSPanelEngineName(String pSPanelEngineName){
        this.set(FIELD_PSPANELENGINENAME, pSPanelEngineName);
    }
    
    /**
     * 获取 引擎标识  
     * @return
     */
    @JsonIgnore
    public String getPSPanelEngineName(){
        Object objValue = this.get(FIELD_PSPANELENGINENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelEngineNameDirty(){
        if(this.contains(FIELD_PSPANELENGINENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎标识
     */
    @JsonIgnore
    public void resetPSPanelEngineName(){
        this.reset(FIELD_PSPANELENGINENAME);
    }

    /**
     * 设置 引擎标识，详细说明：{@link #FIELD_PSPANELENGINENAME}
     * <P>
     * 等同 {@link #setPSPanelEngineName}
     * @param pSPanelEngineName
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanelenginename(String pSPanelEngineName){
        this.setPSPanelEngineName(pSPanelEngineName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSPanelEngineName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSPanelEngineName(strName);
    }

    @JsonIgnore
    public PSPanelEngineDTO name(String strName){
        this.setPSPanelEngineName(strName);
        return this;
    }

    /**
     * <B>PSPANELITEMID</B>&nbsp;面板成员
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO} 
     */
    public final static String FIELD_PSPANELITEMID = "pspanelitemid";

    /**
     * 设置 面板成员
     * 
     * @param pSPanelItemId
     * 
     */
    @JsonProperty(FIELD_PSPANELITEMID)
    public void setPSPanelItemId(String pSPanelItemId){
        this.set(FIELD_PSPANELITEMID, pSPanelItemId);
    }
    
    /**
     * 获取 面板成员  
     * @return
     */
    @JsonIgnore
    public String getPSPanelItemId(){
        Object objValue = this.get(FIELD_PSPANELITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelItemIdDirty(){
        if(this.contains(FIELD_PSPANELITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员
     */
    @JsonIgnore
    public void resetPSPanelItemId(){
        this.reset(FIELD_PSPANELITEMID);
    }

    /**
     * 设置 面板成员
     * <P>
     * 等同 {@link #setPSPanelItemId}
     * @param pSPanelItemId
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanelitemid(String pSPanelItemId){
        this.setPSPanelItemId(pSPanelItemId);
        return this;
    }

    /**
     * 设置 面板成员，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSPanelItemId}
     * @param pSSysViewPanelItem 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem){
        if(pSSysViewPanelItem == null){
            this.setPSPanelItemId(null);
            this.setPSPanelItemName(null);
        }
        else{
            this.setPSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    /**
     * <B>PSPANELITEMNAME</B>&nbsp;面板成员
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPANELITEMID}
     */
    public final static String FIELD_PSPANELITEMNAME = "pspanelitemname";

    /**
     * 设置 面板成员
     * 
     * @param pSPanelItemName
     * 
     */
    @JsonProperty(FIELD_PSPANELITEMNAME)
    public void setPSPanelItemName(String pSPanelItemName){
        this.set(FIELD_PSPANELITEMNAME, pSPanelItemName);
    }
    
    /**
     * 获取 面板成员  
     * @return
     */
    @JsonIgnore
    public String getPSPanelItemName(){
        Object objValue = this.get(FIELD_PSPANELITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelItemNameDirty(){
        if(this.contains(FIELD_PSPANELITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板成员
     */
    @JsonIgnore
    public void resetPSPanelItemName(){
        this.reset(FIELD_PSPANELITEMNAME);
    }

    /**
     * 设置 面板成员
     * <P>
     * 等同 {@link #setPSPanelItemName}
     * @param pSPanelItemName
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanelitemname(String pSPanelItemName){
        this.setPSPanelItemName(pSPanelItemName);
        return this;
    }

    /**
     * <B>PSPANELLOGICID</B>&nbsp;面板逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO} 
     */
    public final static String FIELD_PSPANELLOGICID = "pspanellogicid";

    /**
     * 设置 面板逻辑
     * 
     * @param pSPanelLogicId
     * 
     */
    @JsonProperty(FIELD_PSPANELLOGICID)
    public void setPSPanelLogicId(String pSPanelLogicId){
        this.set(FIELD_PSPANELLOGICID, pSPanelLogicId);
    }
    
    /**
     * 获取 面板逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSPanelLogicId(){
        Object objValue = this.get(FIELD_PSPANELLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelLogicIdDirty(){
        if(this.contains(FIELD_PSPANELLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑
     */
    @JsonIgnore
    public void resetPSPanelLogicId(){
        this.reset(FIELD_PSPANELLOGICID);
    }

    /**
     * 设置 面板逻辑
     * <P>
     * 等同 {@link #setPSPanelLogicId}
     * @param pSPanelLogicId
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanellogicid(String pSPanelLogicId){
        this.setPSPanelLogicId(pSPanelLogicId);
        return this;
    }

    /**
     * 设置 面板逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSPanelLogicId}
     * @param pSSysViewPanelLogic 引用对象
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic){
        if(pSSysViewPanelLogic == null){
            this.setPSPanelLogicId(null);
            this.setPSPanelLogicName(null);
        }
        else{
            this.setPSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setPSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    /**
     * <B>PSPANELLOGICNAME</B>&nbsp;面板逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPANELLOGICID}
     */
    public final static String FIELD_PSPANELLOGICNAME = "pspanellogicname";

    /**
     * 设置 面板逻辑
     * 
     * @param pSPanelLogicName
     * 
     */
    @JsonProperty(FIELD_PSPANELLOGICNAME)
    public void setPSPanelLogicName(String pSPanelLogicName){
        this.set(FIELD_PSPANELLOGICNAME, pSPanelLogicName);
    }
    
    /**
     * 获取 面板逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSPanelLogicName(){
        Object objValue = this.get(FIELD_PSPANELLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPanelLogicNameDirty(){
        if(this.contains(FIELD_PSPANELLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板逻辑
     */
    @JsonIgnore
    public void resetPSPanelLogicName(){
        this.reset(FIELD_PSPANELLOGICNAME);
    }

    /**
     * 设置 面板逻辑
     * <P>
     * 等同 {@link #setPSPanelLogicName}
     * @param pSPanelLogicName
     */
    @JsonIgnore
    public PSPanelEngineDTO pspanellogicname(String pSPanelLogicName){
        this.setPSPanelLogicName(pSPanelLogicName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统面板界面引擎使用的前端模板扩展插件，使用插件类型【界面引擎】
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
    public PSPanelEngineDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSPanelEngineDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统面板界面引擎使用的前端模板扩展插件，使用插件类型【界面引擎】
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
    public PSPanelEngineDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;系统面板，指定面板引擎所在的面板部件对象
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
    public PSPanelEngineDTO pssysviewpanelid(String pSSysViewPanelId){
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
    public PSPanelEngineDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;系统面板，指定面板引擎所在的面板部件对象
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
    public PSPanelEngineDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>PSUIENGINETYPEID</B>&nbsp;界面引擎类型，指定面板引擎的界面引擎类型
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
    public PSPanelEngineDTO psuienginetypeid(String pSUIEngineTypeId){
        this.setPSUIEngineTypeId(pSUIEngineTypeId);
        return this;
    }

    /**
     * <B>PSUIENGINETYPENAME</B>&nbsp;界面引擎类型，指定面板引擎的界面引擎类型
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
    public PSPanelEngineDTO psuienginetypename(String pSUIEngineTypeName){
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
    public PSPanelEngineDTO updatedate(Timestamp updateDate){
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
    public PSPanelEngineDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSPanelEngineDTO usercat(String userCat){
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
    public PSPanelEngineDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSPanelEngineDTO usertag(String userTag){
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
    public PSPanelEngineDTO usertag2(String userTag2){
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
    public PSPanelEngineDTO usertag3(String userTag3){
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
    public PSPanelEngineDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO validflag(Integer validFlag){
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
    public PSPanelEngineDTO validflag(Boolean validFlag){
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
    public PSPanelEngineDTO viewparam(String viewParam){
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
    public PSPanelEngineDTO viewparam10(Integer viewParam10){
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
    public PSPanelEngineDTO viewparam2(String viewParam2){
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
    public PSPanelEngineDTO viewparam3(Integer viewParam3){
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
    public PSPanelEngineDTO viewparam4(Integer viewParam4){
        this.setViewParam4(viewParam4);
        return this;
    }

    /**
     * <B>VIEWPARAM5</B>&nbsp;视图参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO viewparam5(Integer viewParam5){
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
    public PSPanelEngineDTO viewparam5(Boolean viewParam5){
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
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO viewparam6(Integer viewParam6){
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
    public PSPanelEngineDTO viewparam6(Boolean viewParam6){
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
    public PSPanelEngineDTO viewparam7(String viewParam7){
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
    public PSPanelEngineDTO viewparam8(String viewParam8){
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
    public PSPanelEngineDTO viewparam9(Integer viewParam9){
        this.setViewParam9(viewParam9);
        return this;
    }

    /**
     * <B>WFVIEWPARAM</B>&nbsp;流程视图参数
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO wfviewparam(Integer wFViewParam){
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
    public PSPanelEngineDTO wfviewparam(Boolean wFViewParam){
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
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSPanelEngineDTO wfviewparam2(Integer wFViewParam2){
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
    public PSPanelEngineDTO wfviewparam2(Boolean wFViewParam2){
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
    public PSPanelEngineDTO wfviewparam3(String wFViewParam3){
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
    public PSPanelEngineDTO wfviewparam4(String wFViewParam4){
        this.setWFViewParam4(wFViewParam4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSPanelEngineId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSPanelEngineId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSPanelEngineId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSPanelEngineId(strValue);
    }

    @JsonIgnore
    public PSPanelEngineDTO id(String strValue){
        this.setPSPanelEngineId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSPanelEngineDTO){
            PSPanelEngineDTO dto = (PSPanelEngineDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
