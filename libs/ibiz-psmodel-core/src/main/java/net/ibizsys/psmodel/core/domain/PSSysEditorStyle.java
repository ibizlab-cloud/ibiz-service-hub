package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSEDITORSTYLE</B>系统编辑器样式 模型传输对象
 * <P>
 * 定义系统全局的编辑器样式，包括了使用的模板插件及其它配置信息。系统编辑器样式可被使用编辑器的场合显示指定使用，或是直接替换编辑器类型默认样式，实现全局界面统一
 */
public class PSSysEditorStyle extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysEditorStyle(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AJAXHANDLER</B>&nbsp;界面处理模式，指定编辑器样式需要提供的界面处理模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorHandlerType} 
     */
    public final static String FIELD_AJAXHANDLER = "ajaxhandler";

    /**
     * 设置 界面处理模式，详细说明：{@link #FIELD_AJAXHANDLER}
     * 
     * @param ajaxHandler
     * 
     */
    @JsonProperty(FIELD_AJAXHANDLER)
    public void setAjaxHandler(String ajaxHandler){
        this.set(FIELD_AJAXHANDLER, ajaxHandler);
    }
    
    /**
     * 获取 界面处理模式  
     * @return
     */
    @JsonIgnore
    public String getAjaxHandler(){
        Object objValue = this.get(FIELD_AJAXHANDLER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面处理模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAjaxHandlerDirty(){
        if(this.contains(FIELD_AJAXHANDLER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面处理模式
     */
    @JsonIgnore
    public void resetAjaxHandler(){
        this.reset(FIELD_AJAXHANDLER);
    }

    /**
     * 设置 界面处理模式，详细说明：{@link #FIELD_AJAXHANDLER}
     * <P>
     * 等同 {@link #setAjaxHandler}
     * @param ajaxHandler
     */
    @JsonIgnore
    public PSSysEditorStyle ajaxhandler(String ajaxHandler){
        this.setAjaxHandler(ajaxHandler);
        return this;
    }

     /**
     * 设置 界面处理模式，详细说明：{@link #FIELD_AJAXHANDLER}
     * <P>
     * 等同 {@link #setAjaxHandler}
     * @param ajaxHandler
     */
    @JsonIgnore
    public PSSysEditorStyle ajaxhandler(net.ibizsys.psmodel.core.util.PSModelEnums.EditorHandlerType ajaxHandler){
        if(ajaxHandler == null){
            this.setAjaxHandler(null);
        }
        else{
            this.setAjaxHandler(ajaxHandler.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;样式代码，指定编辑器样式的样式代码，需要在所在编辑器类型具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 样式代码，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 样式代码  
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
     * 判断 样式代码 是否指定值，包括空值
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
     * 重置 样式代码
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 样式代码，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysEditorStyle codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTAINERTYPE</B>&nbsp;应用场合，指定编辑器样式的应用容器类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorContainer} 
     */
    public final static String FIELD_CONTAINERTYPE = "containertype";

    /**
     * 设置 应用场合，详细说明：{@link #FIELD_CONTAINERTYPE}
     * 
     * @param containerType
     * 
     */
    @JsonProperty(FIELD_CONTAINERTYPE)
    public void setContainerType(String containerType){
        this.set(FIELD_CONTAINERTYPE, containerType);
    }
    
    /**
     * 获取 应用场合  
     * @return
     */
    @JsonIgnore
    public String getContainerType(){
        Object objValue = this.get(FIELD_CONTAINERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用场合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContainerTypeDirty(){
        if(this.contains(FIELD_CONTAINERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用场合
     */
    @JsonIgnore
    public void resetContainerType(){
        this.reset(FIELD_CONTAINERTYPE);
    }

    /**
     * 设置 应用场合，详细说明：{@link #FIELD_CONTAINERTYPE}
     * <P>
     * 等同 {@link #setContainerType}
     * @param containerType
     */
    @JsonIgnore
    public PSSysEditorStyle containertype(String containerType){
        this.setContainerType(containerType);
        return this;
    }

     /**
     * 设置 应用场合，详细说明：{@link #FIELD_CONTAINERTYPE}
     * <P>
     * 等同 {@link #setContainerType}
     * @param containerType
     */
    @JsonIgnore
    public PSSysEditorStyle containertype(net.ibizsys.psmodel.core.util.PSModelEnums.EditorContainer containerType){
        if(containerType == null){
            this.setContainerType(null);
        }
        else{
            this.setContainerType(containerType.value);
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
    public PSSysEditorStyle createdate(String createDate){
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
    public PSSysEditorStyle createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLPARAM</B>&nbsp;部件参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM = "ctrlparam";

    /**
     * 设置 部件参数
     * 
     * @param ctrlParam
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM)
    public void setCtrlParam(String ctrlParam){
        this.set(FIELD_CTRLPARAM, ctrlParam);
    }
    
    /**
     * 获取 部件参数  
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
     * 判断 部件参数 是否指定值，包括空值
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
     * 重置 部件参数
     */
    @JsonIgnore
    public void resetCtrlParam(){
        this.reset(FIELD_CTRLPARAM);
    }

    /**
     * 设置 部件参数
     * <P>
     * 等同 {@link #setCtrlParam}
     * @param ctrlParam
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam(String ctrlParam){
        this.setCtrlParam(ctrlParam);
        return this;
    }

    /**
     * <B>CTRLPARAM10</B>&nbsp;部件参数10
     */
    public final static String FIELD_CTRLPARAM10 = "ctrlparam10";

    /**
     * 设置 部件参数10
     * 
     * @param ctrlParam10
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM10)
    public void setCtrlParam10(Double ctrlParam10){
        this.set(FIELD_CTRLPARAM10, ctrlParam10);
    }
    
    /**
     * 获取 部件参数10  
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
     * 判断 部件参数10 是否指定值，包括空值
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
     * 重置 部件参数10
     */
    @JsonIgnore
    public void resetCtrlParam10(){
        this.reset(FIELD_CTRLPARAM10);
    }

    /**
     * 设置 部件参数10
     * <P>
     * 等同 {@link #setCtrlParam10}
     * @param ctrlParam10
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam10(Double ctrlParam10){
        this.setCtrlParam10(ctrlParam10);
        return this;
    }

    /**
     * <B>CTRLPARAM11</B>&nbsp;部件参数11
     */
    public final static String FIELD_CTRLPARAM11 = "ctrlparam11";

    /**
     * 设置 部件参数11
     * 
     * @param ctrlParam11
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM11)
    public void setCtrlParam11(Integer ctrlParam11){
        this.set(FIELD_CTRLPARAM11, ctrlParam11);
    }
    
    /**
     * 获取 部件参数11  
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
     * 判断 部件参数11 是否指定值，包括空值
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
     * 重置 部件参数11
     */
    @JsonIgnore
    public void resetCtrlParam11(){
        this.reset(FIELD_CTRLPARAM11);
    }

    /**
     * 设置 部件参数11
     * <P>
     * 等同 {@link #setCtrlParam11}
     * @param ctrlParam11
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam11(Integer ctrlParam11){
        this.setCtrlParam11(ctrlParam11);
        return this;
    }

    /**
     * <B>CTRLPARAM12</B>&nbsp;部件参数12
     */
    public final static String FIELD_CTRLPARAM12 = "ctrlparam12";

    /**
     * 设置 部件参数12
     * 
     * @param ctrlParam12
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM12)
    public void setCtrlParam12(Integer ctrlParam12){
        this.set(FIELD_CTRLPARAM12, ctrlParam12);
    }
    
    /**
     * 获取 部件参数12  
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
     * 判断 部件参数12 是否指定值，包括空值
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
     * 重置 部件参数12
     */
    @JsonIgnore
    public void resetCtrlParam12(){
        this.reset(FIELD_CTRLPARAM12);
    }

    /**
     * 设置 部件参数12
     * <P>
     * 等同 {@link #setCtrlParam12}
     * @param ctrlParam12
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam12(Integer ctrlParam12){
        this.setCtrlParam12(ctrlParam12);
        return this;
    }

    /**
     * <B>CTRLPARAM2</B>&nbsp;部件参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM2 = "ctrlparam2";

    /**
     * 设置 部件参数2
     * 
     * @param ctrlParam2
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM2)
    public void setCtrlParam2(String ctrlParam2){
        this.set(FIELD_CTRLPARAM2, ctrlParam2);
    }
    
    /**
     * 获取 部件参数2  
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
     * 判断 部件参数2 是否指定值，包括空值
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
     * 重置 部件参数2
     */
    @JsonIgnore
    public void resetCtrlParam2(){
        this.reset(FIELD_CTRLPARAM2);
    }

    /**
     * 设置 部件参数2
     * <P>
     * 等同 {@link #setCtrlParam2}
     * @param ctrlParam2
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam2(String ctrlParam2){
        this.setCtrlParam2(ctrlParam2);
        return this;
    }

    /**
     * <B>CTRLPARAM3</B>&nbsp;部件参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM3 = "ctrlparam3";

    /**
     * 设置 部件参数3
     * 
     * @param ctrlParam3
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM3)
    public void setCtrlParam3(String ctrlParam3){
        this.set(FIELD_CTRLPARAM3, ctrlParam3);
    }
    
    /**
     * 获取 部件参数3  
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
     * 判断 部件参数3 是否指定值，包括空值
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
     * 重置 部件参数3
     */
    @JsonIgnore
    public void resetCtrlParam3(){
        this.reset(FIELD_CTRLPARAM3);
    }

    /**
     * 设置 部件参数3
     * <P>
     * 等同 {@link #setCtrlParam3}
     * @param ctrlParam3
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam3(String ctrlParam3){
        this.setCtrlParam3(ctrlParam3);
        return this;
    }

    /**
     * <B>CTRLPARAM4</B>&nbsp;部件参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM4 = "ctrlparam4";

    /**
     * 设置 部件参数4
     * 
     * @param ctrlParam4
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM4)
    public void setCtrlParam4(String ctrlParam4){
        this.set(FIELD_CTRLPARAM4, ctrlParam4);
    }
    
    /**
     * 获取 部件参数4  
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
     * 判断 部件参数4 是否指定值，包括空值
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
     * 重置 部件参数4
     */
    @JsonIgnore
    public void resetCtrlParam4(){
        this.reset(FIELD_CTRLPARAM4);
    }

    /**
     * 设置 部件参数4
     * <P>
     * 等同 {@link #setCtrlParam4}
     * @param ctrlParam4
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam4(String ctrlParam4){
        this.setCtrlParam4(ctrlParam4);
        return this;
    }

    /**
     * <B>CTRLPARAM5</B>&nbsp;部件参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLPARAM5 = "ctrlparam5";

    /**
     * 设置 部件参数5
     * 
     * @param ctrlParam5
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM5)
    public void setCtrlParam5(Integer ctrlParam5){
        this.set(FIELD_CTRLPARAM5, ctrlParam5);
    }
    
    /**
     * 获取 部件参数5  
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
     * 判断 部件参数5 是否指定值，包括空值
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
     * 重置 部件参数5
     */
    @JsonIgnore
    public void resetCtrlParam5(){
        this.reset(FIELD_CTRLPARAM5);
    }

    /**
     * 设置 部件参数5
     * <P>
     * 等同 {@link #setCtrlParam5}
     * @param ctrlParam5
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam5(Integer ctrlParam5){
        this.setCtrlParam5(ctrlParam5);
        return this;
    }

     /**
     * 设置 部件参数5
     * <P>
     * 等同 {@link #setCtrlParam5}
     * @param ctrlParam5
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam5(Boolean ctrlParam5){
        if(ctrlParam5 == null){
            this.setCtrlParam5(null);
        }
        else{
            this.setCtrlParam5(ctrlParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CTRLPARAM6</B>&nbsp;部件参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLPARAM6 = "ctrlparam6";

    /**
     * 设置 部件参数6
     * 
     * @param ctrlParam6
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM6)
    public void setCtrlParam6(Integer ctrlParam6){
        this.set(FIELD_CTRLPARAM6, ctrlParam6);
    }
    
    /**
     * 获取 部件参数6  
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
     * 判断 部件参数6 是否指定值，包括空值
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
     * 重置 部件参数6
     */
    @JsonIgnore
    public void resetCtrlParam6(){
        this.reset(FIELD_CTRLPARAM6);
    }

    /**
     * 设置 部件参数6
     * <P>
     * 等同 {@link #setCtrlParam6}
     * @param ctrlParam6
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam6(Integer ctrlParam6){
        this.setCtrlParam6(ctrlParam6);
        return this;
    }

     /**
     * 设置 部件参数6
     * <P>
     * 等同 {@link #setCtrlParam6}
     * @param ctrlParam6
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam6(Boolean ctrlParam6){
        if(ctrlParam6 == null){
            this.setCtrlParam6(null);
        }
        else{
            this.setCtrlParam6(ctrlParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CTRLPARAM7</B>&nbsp;部件参数7
     */
    public final static String FIELD_CTRLPARAM7 = "ctrlparam7";

    /**
     * 设置 部件参数7
     * 
     * @param ctrlParam7
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM7)
    public void setCtrlParam7(Integer ctrlParam7){
        this.set(FIELD_CTRLPARAM7, ctrlParam7);
    }
    
    /**
     * 获取 部件参数7  
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
     * 判断 部件参数7 是否指定值，包括空值
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
     * 重置 部件参数7
     */
    @JsonIgnore
    public void resetCtrlParam7(){
        this.reset(FIELD_CTRLPARAM7);
    }

    /**
     * 设置 部件参数7
     * <P>
     * 等同 {@link #setCtrlParam7}
     * @param ctrlParam7
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam7(Integer ctrlParam7){
        this.setCtrlParam7(ctrlParam7);
        return this;
    }

    /**
     * <B>CTRLPARAM8</B>&nbsp;部件参数8
     */
    public final static String FIELD_CTRLPARAM8 = "ctrlparam8";

    /**
     * 设置 部件参数8
     * 
     * @param ctrlParam8
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM8)
    public void setCtrlParam8(Integer ctrlParam8){
        this.set(FIELD_CTRLPARAM8, ctrlParam8);
    }
    
    /**
     * 获取 部件参数8  
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
     * 判断 部件参数8 是否指定值，包括空值
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
     * 重置 部件参数8
     */
    @JsonIgnore
    public void resetCtrlParam8(){
        this.reset(FIELD_CTRLPARAM8);
    }

    /**
     * 设置 部件参数8
     * <P>
     * 等同 {@link #setCtrlParam8}
     * @param ctrlParam8
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam8(Integer ctrlParam8){
        this.setCtrlParam8(ctrlParam8);
        return this;
    }

    /**
     * <B>CTRLPARAM9</B>&nbsp;部件参数9
     */
    public final static String FIELD_CTRLPARAM9 = "ctrlparam9";

    /**
     * 设置 部件参数9
     * 
     * @param ctrlParam9
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM9)
    public void setCtrlParam9(Double ctrlParam9){
        this.set(FIELD_CTRLPARAM9, ctrlParam9);
    }
    
    /**
     * 获取 部件参数9  
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
     * 判断 部件参数9 是否指定值，包括空值
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
     * 重置 部件参数9
     */
    @JsonIgnore
    public void resetCtrlParam9(){
        this.reset(FIELD_CTRLPARAM9);
    }

    /**
     * 设置 部件参数9
     * <P>
     * 等同 {@link #setCtrlParam9}
     * @param ctrlParam9
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparam9(Double ctrlParam9){
        this.setCtrlParam9(ctrlParam9);
        return this;
    }

    /**
     * <B>CTRLPARAMS</B>&nbsp;编辑器参数
     */
    public final static String FIELD_CTRLPARAMS = "ctrlparams";

    /**
     * 设置 编辑器参数
     * 
     * @param ctrlParams
     * 
     */
    @JsonProperty(FIELD_CTRLPARAMS)
    public void setCtrlParams(String ctrlParams){
        this.set(FIELD_CTRLPARAMS, ctrlParams);
    }
    
    /**
     * 获取 编辑器参数  
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
     * 判断 编辑器参数 是否指定值，包括空值
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
     * 重置 编辑器参数
     */
    @JsonIgnore
    public void resetCtrlParams(){
        this.reset(FIELD_CTRLPARAMS);
    }

    /**
     * 设置 编辑器参数
     * <P>
     * 等同 {@link #setCtrlParams}
     * @param ctrlParams
     */
    @JsonIgnore
    public PSSysEditorStyle ctrlparams(String ctrlParams){
        this.setCtrlParams(ctrlParams);
        return this;
    }

    /**
     * <B>EXTENDSTYLEONLY</B>&nbsp;仅扩展样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXTENDSTYLEONLY = "extendstyleonly";

    /**
     * 设置 仅扩展样式
     * 
     * @param extendStyleOnly
     * 
     */
    @JsonProperty(FIELD_EXTENDSTYLEONLY)
    public void setExtendStyleOnly(Integer extendStyleOnly){
        this.set(FIELD_EXTENDSTYLEONLY, extendStyleOnly);
    }
    
    /**
     * 获取 仅扩展样式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendStyleOnly(){
        Object objValue = this.get(FIELD_EXTENDSTYLEONLY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 仅扩展样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendStyleOnlyDirty(){
        if(this.contains(FIELD_EXTENDSTYLEONLY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 仅扩展样式
     */
    @JsonIgnore
    public void resetExtendStyleOnly(){
        this.reset(FIELD_EXTENDSTYLEONLY);
    }

    /**
     * 设置 仅扩展样式
     * <P>
     * 等同 {@link #setExtendStyleOnly}
     * @param extendStyleOnly
     */
    @JsonIgnore
    public PSSysEditorStyle extendstyleonly(Integer extendStyleOnly){
        this.setExtendStyleOnly(extendStyleOnly);
        return this;
    }

     /**
     * 设置 仅扩展样式
     * <P>
     * 等同 {@link #setExtendStyleOnly}
     * @param extendStyleOnly
     */
    @JsonIgnore
    public PSSysEditorStyle extendstyleonly(Boolean extendStyleOnly){
        if(extendStyleOnly == null){
            this.setExtendStyleOnly(null);
        }
        else{
            this.setExtendStyleOnly(extendStyleOnly?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定编辑器样式的默认高度，未定义时为【-1】
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
    public PSSysEditorStyle height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>LINKVIEWSHOWMODE</B>&nbsp;链接视图显示模式，指定编辑器样式链接视图显示模式，链接视图一般指引用数据的展示视图，未定义使用所在编辑器类型的链接视图显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode} 
     */
    public final static String FIELD_LINKVIEWSHOWMODE = "linkviewshowmode";

    /**
     * 设置 链接视图显示模式，详细说明：{@link #FIELD_LINKVIEWSHOWMODE}
     * 
     * @param linkViewShowMode
     * 
     */
    @JsonProperty(FIELD_LINKVIEWSHOWMODE)
    public void setLinkViewShowMode(String linkViewShowMode){
        this.set(FIELD_LINKVIEWSHOWMODE, linkViewShowMode);
    }
    
    /**
     * 获取 链接视图显示模式  
     * @return
     */
    @JsonIgnore
    public String getLinkViewShowMode(){
        Object objValue = this.get(FIELD_LINKVIEWSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接视图显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkViewShowModeDirty(){
        if(this.contains(FIELD_LINKVIEWSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接视图显示模式
     */
    @JsonIgnore
    public void resetLinkViewShowMode(){
        this.reset(FIELD_LINKVIEWSHOWMODE);
    }

    /**
     * 设置 链接视图显示模式，详细说明：{@link #FIELD_LINKVIEWSHOWMODE}
     * <P>
     * 等同 {@link #setLinkViewShowMode}
     * @param linkViewShowMode
     */
    @JsonIgnore
    public PSSysEditorStyle linkviewshowmode(String linkViewShowMode){
        this.setLinkViewShowMode(linkViewShowMode);
        return this;
    }

     /**
     * 设置 链接视图显示模式，详细说明：{@link #FIELD_LINKVIEWSHOWMODE}
     * <P>
     * 等同 {@link #setLinkViewShowMode}
     * @param linkViewShowMode
     */
    @JsonIgnore
    public PSSysEditorStyle linkviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode linkViewShowMode){
        if(linkViewShowMode == null){
            this.setLinkViewShowMode(null);
        }
        else{
            this.setLinkViewShowMode(linkViewShowMode.value);
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
    public PSSysEditorStyle memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PREVIEWHTML</B>&nbsp;预览内容
     */
    public final static String FIELD_PREVIEWHTML = "previewhtml";

    /**
     * 设置 预览内容
     * 
     * @param previewHtml
     * 
     */
    @JsonProperty(FIELD_PREVIEWHTML)
    public void setPreviewHtml(String previewHtml){
        this.set(FIELD_PREVIEWHTML, previewHtml);
    }
    
    /**
     * 获取 预览内容  
     * @return
     */
    @JsonIgnore
    public String getPreviewHtml(){
        Object objValue = this.get(FIELD_PREVIEWHTML);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预览内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPreviewHtmlDirty(){
        if(this.contains(FIELD_PREVIEWHTML)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预览内容
     */
    @JsonIgnore
    public void resetPreviewHtml(){
        this.reset(FIELD_PREVIEWHTML);
    }

    /**
     * 设置 预览内容
     * <P>
     * 等同 {@link #setPreviewHtml}
     * @param previewHtml
     */
    @JsonIgnore
    public PSSysEditorStyle previewhtml(String previewHtml){
        this.setPreviewHtml(previewHtml);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定编辑器样式的界面处理对象，在界面处理对象中可以配置具体的行为等
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
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
    public PSSysEditorStyle psachandlerid(String pSACHandlerId){
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
    public PSSysEditorStyle psachandlerid(PSACHandler pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定编辑器样式的界面处理对象，在界面处理对象中可以配置具体的行为等
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
    public PSSysEditorStyle psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSEDITORSTYLEID</B>&nbsp;平台预置样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSEDITORSTYLEID = "pseditorstyleid";

    /**
     * 设置 平台预置样式
     * 
     * @param pSEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSEDITORSTYLEID)
    public void setPSEditorStyleId(String pSEditorStyleId){
        this.set(FIELD_PSEDITORSTYLEID, pSEditorStyleId);
    }
    
    /**
     * 获取 平台预置样式  
     * @return
     */
    @JsonIgnore
    public String getPSEditorStyleId(){
        Object objValue = this.get(FIELD_PSEDITORSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSEditorStyleIdDirty(){
        if(this.contains(FIELD_PSEDITORSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置样式
     */
    @JsonIgnore
    public void resetPSEditorStyleId(){
        this.reset(FIELD_PSEDITORSTYLEID);
    }

    /**
     * 设置 平台预置样式
     * <P>
     * 等同 {@link #setPSEditorStyleId}
     * @param pSEditorStyleId
     */
    @JsonIgnore
    public PSSysEditorStyle pseditorstyleid(String pSEditorStyleId){
        this.setPSEditorStyleId(pSEditorStyleId);
        return this;
    }

    /**
     * <B>PSEDITORSTYLENAME</B>&nbsp;平台预置样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSEDITORSTYLEID}
     */
    public final static String FIELD_PSEDITORSTYLENAME = "pseditorstylename";

    /**
     * 设置 平台预置样式
     * 
     * @param pSEditorStyleName
     * 
     */
    @JsonProperty(FIELD_PSEDITORSTYLENAME)
    public void setPSEditorStyleName(String pSEditorStyleName){
        this.set(FIELD_PSEDITORSTYLENAME, pSEditorStyleName);
    }
    
    /**
     * 获取 平台预置样式  
     * @return
     */
    @JsonIgnore
    public String getPSEditorStyleName(){
        Object objValue = this.get(FIELD_PSEDITORSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSEditorStyleNameDirty(){
        if(this.contains(FIELD_PSEDITORSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置样式
     */
    @JsonIgnore
    public void resetPSEditorStyleName(){
        this.reset(FIELD_PSEDITORSTYLENAME);
    }

    /**
     * 设置 平台预置样式
     * <P>
     * 等同 {@link #setPSEditorStyleName}
     * @param pSEditorStyleName
     */
    @JsonIgnore
    public PSSysEditorStyle pseditorstylename(String pSEditorStyleName){
        this.setPSEditorStyleName(pSEditorStyleName);
        return this;
    }

    /**
     * <B>PSEDITORTYPEID</B>&nbsp;编辑器类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorType} 
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSEditorType} 
     */
    public final static String FIELD_PSEDITORTYPEID = "pseditortypeid";

    /**
     * 设置 编辑器类型
     * 
     * @param pSEditorTypeId
     * 
     */
    @JsonProperty(FIELD_PSEDITORTYPEID)
    public void setPSEditorTypeId(String pSEditorTypeId){
        this.set(FIELD_PSEDITORTYPEID, pSEditorTypeId);
    }
    
    /**
     * 获取 编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getPSEditorTypeId(){
        Object objValue = this.get(FIELD_PSEDITORTYPEID);
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
    public boolean isPSEditorTypeIdDirty(){
        if(this.contains(FIELD_PSEDITORTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器类型
     */
    @JsonIgnore
    public void resetPSEditorTypeId(){
        this.reset(FIELD_PSEDITORTYPEID);
    }

    /**
     * 设置 编辑器类型
     * <P>
     * 等同 {@link #setPSEditorTypeId}
     * @param pSEditorTypeId
     */
    @JsonIgnore
    public PSSysEditorStyle pseditortypeid(String pSEditorTypeId){
        this.setPSEditorTypeId(pSEditorTypeId);
        return this;
    }

    /**
     * 设置 编辑器类型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSEditorTypeId}
     * @param pSEditorType 引用对象
     */
    @JsonIgnore
    public PSSysEditorStyle pseditortypeid(PSEditorType pSEditorType){
        if(pSEditorType == null){
            this.setPSEditorTypeId(null);
            this.setPSEditorTypeName(null);
        }
        else{
            this.setPSEditorTypeId(pSEditorType.getPSEditorTypeId());
            this.setPSEditorTypeName(pSEditorType.getPSEditorTypeName());
        }
        return this;
    }

    /**
     * <B>PSEDITORTYPENAME</B>&nbsp;编辑器类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSEDITORTYPEID}
     */
    public final static String FIELD_PSEDITORTYPENAME = "pseditortypename";

    /**
     * 设置 编辑器类型
     * 
     * @param pSEditorTypeName
     * 
     */
    @JsonProperty(FIELD_PSEDITORTYPENAME)
    public void setPSEditorTypeName(String pSEditorTypeName){
        this.set(FIELD_PSEDITORTYPENAME, pSEditorTypeName);
    }
    
    /**
     * 获取 编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getPSEditorTypeName(){
        Object objValue = this.get(FIELD_PSEDITORTYPENAME);
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
    public boolean isPSEditorTypeNameDirty(){
        if(this.contains(FIELD_PSEDITORTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器类型
     */
    @JsonIgnore
    public void resetPSEditorTypeName(){
        this.reset(FIELD_PSEDITORTYPENAME);
    }

    /**
     * 设置 编辑器类型
     * <P>
     * 等同 {@link #setPSEditorTypeName}
     * @param pSEditorTypeName
     */
    @JsonIgnore
    public PSSysEditorStyle pseditortypename(String pSEditorTypeName){
        this.setPSEditorTypeName(pSEditorTypeName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统编辑器样式所在的系统模块
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
    public PSSysEditorStyle psmoduleid(String pSModuleId){
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
    public PSSysEditorStyle psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统编辑器样式所在的系统模块
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
    public PSSysEditorStyle psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统样式表  
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
     * 判断 系统样式表 是否指定值，包括空值
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
     * 重置 系统样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysEditorStyle pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysEditorStyle pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;系统样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 系统样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 系统样式表  
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
     * 判断 系统样式表 是否指定值，包括空值
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
     * 重置 系统样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 系统样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysEditorStyle pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;系统编辑器样式标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 系统编辑器样式标识
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 系统编辑器样式标识  
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
     * 判断 系统编辑器样式标识 是否指定值，包括空值
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
     * 重置 系统编辑器样式标识
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 系统编辑器样式标识
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSSysEditorStyle pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;样式名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";

    /**
     * 设置 样式名称
     * 
     * @param pSSysEditorStyleName
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLENAME)
    public void setPSSysEditorStyleName(String pSSysEditorStyleName){
        this.set(FIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }
    
    /**
     * 获取 样式名称  
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
     * 判断 样式名称 是否指定值，包括空值
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
     * 重置 样式名称
     */
    @JsonIgnore
    public void resetPSSysEditorStyleName(){
        this.reset(FIELD_PSSYSEDITORSTYLENAME);
    }

    /**
     * 设置 样式名称
     * <P>
     * 等同 {@link #setPSSysEditorStyleName}
     * @param pSSysEditorStyleName
     */
    @JsonIgnore
    public PSSysEditorStyle pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEditorStyleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEditorStyleName(strName);
    }

    @JsonIgnore
    public PSSysEditorStyle name(String strName){
        this.setPSSysEditorStyleName(strName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定编辑器样式使用的前端模板扩展插件，使用插件类型【编辑器自定义绘制插件】
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
    public PSSysEditorStyle pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysEditorStyle pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定编辑器样式使用的前端模板扩展插件，使用插件类型【编辑器自定义绘制插件】
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
    public PSSysEditorStyle pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>REFVIEWSHOWMODE</B>&nbsp;引用视图显示模式，指定编辑器样式引用视图显示模式，引用视图一般指引用数据的选择视图，未定义使用所在编辑器类型的引用视图显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode} 
     */
    public final static String FIELD_REFVIEWSHOWMODE = "refviewshowmode";

    /**
     * 设置 引用视图显示模式，详细说明：{@link #FIELD_REFVIEWSHOWMODE}
     * 
     * @param refViewShowMode
     * 
     */
    @JsonProperty(FIELD_REFVIEWSHOWMODE)
    public void setRefViewShowMode(String refViewShowMode){
        this.set(FIELD_REFVIEWSHOWMODE, refViewShowMode);
    }
    
    /**
     * 获取 引用视图显示模式  
     * @return
     */
    @JsonIgnore
    public String getRefViewShowMode(){
        Object objValue = this.get(FIELD_REFVIEWSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用视图显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefViewShowModeDirty(){
        if(this.contains(FIELD_REFVIEWSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用视图显示模式
     */
    @JsonIgnore
    public void resetRefViewShowMode(){
        this.reset(FIELD_REFVIEWSHOWMODE);
    }

    /**
     * 设置 引用视图显示模式，详细说明：{@link #FIELD_REFVIEWSHOWMODE}
     * <P>
     * 等同 {@link #setRefViewShowMode}
     * @param refViewShowMode
     */
    @JsonIgnore
    public PSSysEditorStyle refviewshowmode(String refViewShowMode){
        this.setRefViewShowMode(refViewShowMode);
        return this;
    }

     /**
     * 设置 引用视图显示模式，详细说明：{@link #FIELD_REFVIEWSHOWMODE}
     * <P>
     * 等同 {@link #setRefViewShowMode}
     * @param refViewShowMode
     */
    @JsonIgnore
    public PSSysEditorStyle refviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode refViewShowMode){
        if(refViewShowMode == null){
            this.setRefViewShowMode(null);
        }
        else{
            this.setRefViewShowMode(refViewShowMode.value);
        }
        return this;
    }

    /**
     * <B>REPDEFAULT</B>&nbsp;替换默认样式，指定将此编辑器样式作为当前系统该编辑器类型的默认样式，统一界面呈现，默认为【否】。
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REPDEFAULT = "repdefault";

    /**
     * 设置 替换默认样式，详细说明：{@link #FIELD_REPDEFAULT}
     * 
     * @param repDefault
     * 
     */
    @JsonProperty(FIELD_REPDEFAULT)
    public void setRepDefault(Integer repDefault){
        this.set(FIELD_REPDEFAULT, repDefault);
    }
    
    /**
     * 获取 替换默认样式  
     * @return
     */
    @JsonIgnore
    public Integer getRepDefault(){
        Object objValue = this.get(FIELD_REPDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 替换默认样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRepDefaultDirty(){
        if(this.contains(FIELD_REPDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 替换默认样式
     */
    @JsonIgnore
    public void resetRepDefault(){
        this.reset(FIELD_REPDEFAULT);
    }

    /**
     * 设置 替换默认样式，详细说明：{@link #FIELD_REPDEFAULT}
     * <P>
     * 等同 {@link #setRepDefault}
     * @param repDefault
     */
    @JsonIgnore
    public PSSysEditorStyle repdefault(Integer repDefault){
        this.setRepDefault(repDefault);
        return this;
    }

     /**
     * 设置 替换默认样式，详细说明：{@link #FIELD_REPDEFAULT}
     * <P>
     * 等同 {@link #setRepDefault}
     * @param repDefault
     */
    @JsonIgnore
    public PSSysEditorStyle repdefault(Boolean repDefault){
        if(repDefault == null){
            this.setRepDefault(null);
        }
        else{
            this.setRepDefault(repDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>STUDIOICON</B>&nbsp;工具图标
     */
    public final static String FIELD_STUDIOICON = "studioicon";

    /**
     * 设置 工具图标
     * 
     * @param studioIcon
     * 
     */
    @JsonProperty(FIELD_STUDIOICON)
    public void setStudioIcon(String studioIcon){
        this.set(FIELD_STUDIOICON, studioIcon);
    }
    
    /**
     * 获取 工具图标  
     * @return
     */
    @JsonIgnore
    public String getStudioIcon(){
        Object objValue = this.get(FIELD_STUDIOICON);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStudioIconDirty(){
        if(this.contains(FIELD_STUDIOICON)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具图标
     */
    @JsonIgnore
    public void resetStudioIcon(){
        this.reset(FIELD_STUDIOICON);
    }

    /**
     * 设置 工具图标
     * <P>
     * 等同 {@link #setStudioIcon}
     * @param studioIcon
     */
    @JsonIgnore
    public PSSysEditorStyle studioicon(String studioIcon){
        this.setStudioIcon(studioIcon);
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
    public PSSysEditorStyle updatedate(String updateDate){
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
    public PSSysEditorStyle updateman(String updateMan){
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
    public PSSysEditorStyle usercat(String userCat){
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
    public PSSysEditorStyle usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEditorStyle usertag(String userTag){
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
    public PSSysEditorStyle usertag2(String userTag2){
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
    public PSSysEditorStyle usertag3(String userTag3){
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
    public PSSysEditorStyle usertag4(String userTag4){
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
    public PSSysEditorStyle validflag(Integer validFlag){
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
    public PSSysEditorStyle validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定编辑器样式的默认宽度，未定义时为【-1】
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
    public PSSysEditorStyle width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysEditorStyleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEditorStyleId(strValue);
    }

    @JsonIgnore
    public PSSysEditorStyle id(String strValue){
        this.setPSSysEditorStyleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysEditorStyle){
            PSSysEditorStyle model = (PSSysEditorStyle)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
