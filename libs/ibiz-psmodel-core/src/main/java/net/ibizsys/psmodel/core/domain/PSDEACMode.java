package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEACMODE</B>实体自填模式 模型传输对象
 * <P>
 * 实体自动填充模式模型，定义自填填充的数据项、界面表现等逻辑。数据项除了显示文本及值这两个基础项，还可通过自填模式数据项模型定义其它的数据项
 */
public class PSDEACMode extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEACMode(){
    }      

    /**
     * <B>ACIPSSYSPFPLUGINID</B>&nbsp;列表项插件，指定自填项使用的前端模板扩展插件，使用插件类型【自填列表项绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_ACIPSSYSPFPLUGINID = "acipssyspfpluginid";

    /**
     * 设置 列表项插件，详细说明：{@link #FIELD_ACIPSSYSPFPLUGINID}
     * 
     * @param aCIPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_ACIPSSYSPFPLUGINID)
    public void setACIPSSysPFPluginId(String aCIPSSysPFPluginId){
        this.set(FIELD_ACIPSSYSPFPLUGINID, aCIPSSysPFPluginId);
    }
    
    /**
     * 获取 列表项插件  
     * @return
     */
    @JsonIgnore
    public String getACIPSSysPFPluginId(){
        Object objValue = this.get(FIELD_ACIPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表项插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACIPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_ACIPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表项插件
     */
    @JsonIgnore
    public void resetACIPSSysPFPluginId(){
        this.reset(FIELD_ACIPSSYSPFPLUGINID);
    }

    /**
     * 设置 列表项插件，详细说明：{@link #FIELD_ACIPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setACIPSSysPFPluginId}
     * @param aCIPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEACMode acipssyspfpluginid(String aCIPSSysPFPluginId){
        this.setACIPSSysPFPluginId(aCIPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 列表项插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setACIPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEACMode acipssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setACIPSSysPFPluginId(null);
            this.setACIPSSysPFPluginName(null);
        }
        else{
            this.setACIPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setACIPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>ACIPSSYSPFPLUGINNAME</B>&nbsp;项前端插件，指定自填项使用的前端模板扩展插件，使用插件类型【自填列表项绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ACIPSSYSPFPLUGINID}
     */
    public final static String FIELD_ACIPSSYSPFPLUGINNAME = "acipssyspfpluginname";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ACIPSSYSPFPLUGINNAME}
     * 
     * @param aCIPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_ACIPSSYSPFPLUGINNAME)
    public void setACIPSSysPFPluginName(String aCIPSSysPFPluginName){
        this.set(FIELD_ACIPSSYSPFPLUGINNAME, aCIPSSysPFPluginName);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getACIPSSysPFPluginName(){
        Object objValue = this.get(FIELD_ACIPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACIPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_ACIPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetACIPSSysPFPluginName(){
        this.reset(FIELD_ACIPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ACIPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setACIPSSysPFPluginName}
     * @param aCIPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEACMode acipssyspfpluginname(String aCIPSSysPFPluginName){
        this.setACIPSSysPFPluginName(aCIPSSysPFPluginName);
        return this;
    }

    /**
     * <B>ACPARAMS</B>&nbsp;自填参数集合
     */
    public final static String FIELD_ACPARAMS = "acparams";

    /**
     * 设置 自填参数集合
     * 
     * @param aCParams
     * 
     */
    @JsonProperty(FIELD_ACPARAMS)
    public void setACParams(String aCParams){
        this.set(FIELD_ACPARAMS, aCParams);
    }
    
    /**
     * 获取 自填参数集合  
     * @return
     */
    @JsonIgnore
    public String getACParams(){
        Object objValue = this.get(FIELD_ACPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填参数集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACParamsDirty(){
        if(this.contains(FIELD_ACPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填参数集合
     */
    @JsonIgnore
    public void resetACParams(){
        this.reset(FIELD_ACPARAMS);
    }

    /**
     * 设置 自填参数集合
     * <P>
     * 等同 {@link #setACParams}
     * @param aCParams
     */
    @JsonIgnore
    public PSDEACMode acparams(String aCParams){
        this.setACParams(aCParams);
        return this;
    }

    /**
     * <B>ACTAG</B>&nbsp;自填标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTAG = "actag";

    /**
     * 设置 自填标记
     * 
     * @param aCTag
     * 
     */
    @JsonProperty(FIELD_ACTAG)
    public void setACTag(String aCTag){
        this.set(FIELD_ACTAG, aCTag);
    }
    
    /**
     * 获取 自填标记  
     * @return
     */
    @JsonIgnore
    public String getACTag(){
        Object objValue = this.get(FIELD_ACTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACTagDirty(){
        if(this.contains(FIELD_ACTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填标记
     */
    @JsonIgnore
    public void resetACTag(){
        this.reset(FIELD_ACTAG);
    }

    /**
     * 设置 自填标记
     * <P>
     * 等同 {@link #setACTag}
     * @param aCTag
     */
    @JsonIgnore
    public PSDEACMode actag(String aCTag){
        this.setACTag(aCTag);
        return this;
    }

    /**
     * <B>ACTAG2</B>&nbsp;自填标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTAG2 = "actag2";

    /**
     * 设置 自填标记2
     * 
     * @param aCTag2
     * 
     */
    @JsonProperty(FIELD_ACTAG2)
    public void setACTag2(String aCTag2){
        this.set(FIELD_ACTAG2, aCTag2);
    }
    
    /**
     * 获取 自填标记2  
     * @return
     */
    @JsonIgnore
    public String getACTag2(){
        Object objValue = this.get(FIELD_ACTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACTag2Dirty(){
        if(this.contains(FIELD_ACTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填标记2
     */
    @JsonIgnore
    public void resetACTag2(){
        this.reset(FIELD_ACTAG2);
    }

    /**
     * 设置 自填标记2
     * <P>
     * 等同 {@link #setACTag2}
     * @param aCTag2
     */
    @JsonIgnore
    public PSDEACMode actag2(String aCTag2){
        this.setACTag2(aCTag2);
        return this;
    }

    /**
     * <B>ACTAG3</B>&nbsp;自填标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTAG3 = "actag3";

    /**
     * 设置 自填标记3
     * 
     * @param aCTag3
     * 
     */
    @JsonProperty(FIELD_ACTAG3)
    public void setACTag3(String aCTag3){
        this.set(FIELD_ACTAG3, aCTag3);
    }
    
    /**
     * 获取 自填标记3  
     * @return
     */
    @JsonIgnore
    public String getACTag3(){
        Object objValue = this.get(FIELD_ACTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACTag3Dirty(){
        if(this.contains(FIELD_ACTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填标记3
     */
    @JsonIgnore
    public void resetACTag3(){
        this.reset(FIELD_ACTAG3);
    }

    /**
     * 设置 自填标记3
     * <P>
     * 等同 {@link #setACTag3}
     * @param aCTag3
     */
    @JsonIgnore
    public PSDEACMode actag3(String aCTag3){
        this.setACTag3(aCTag3);
        return this;
    }

    /**
     * <B>ACTAG4</B>&nbsp;自填标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ACTAG4 = "actag4";

    /**
     * 设置 自填标记4
     * 
     * @param aCTag4
     * 
     */
    @JsonProperty(FIELD_ACTAG4)
    public void setACTag4(String aCTag4){
        this.set(FIELD_ACTAG4, aCTag4);
    }
    
    /**
     * 获取 自填标记4  
     * @return
     */
    @JsonIgnore
    public String getACTag4(){
        Object objValue = this.get(FIELD_ACTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACTag4Dirty(){
        if(this.contains(FIELD_ACTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填标记4
     */
    @JsonIgnore
    public void resetACTag4(){
        this.reset(FIELD_ACTAG4);
    }

    /**
     * 设置 自填标记4
     * <P>
     * 等同 {@link #setACTag4}
     * @param aCTag4
     */
    @JsonIgnore
    public PSDEACMode actag4(String aCTag4){
        this.setACTag4(aCTag4);
        return this;
    }

    /**
     * <B>ACTIONHOLDER</B>&nbsp;行为所有者
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder} 
     */
    public final static String FIELD_ACTIONHOLDER = "actionholder";

    /**
     * 设置 行为所有者
     * 
     * @param actionHolder
     * 
     */
    @JsonProperty(FIELD_ACTIONHOLDER)
    public void setActionHolder(Integer actionHolder){
        this.set(FIELD_ACTIONHOLDER, actionHolder);
    }
    
    /**
     * 获取 行为所有者  
     * @return
     */
    @JsonIgnore
    public Integer getActionHolder(){
        Object objValue = this.get(FIELD_ACTIONHOLDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为所有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionHolderDirty(){
        if(this.contains(FIELD_ACTIONHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为所有者
     */
    @JsonIgnore
    public void resetActionHolder(){
        this.reset(FIELD_ACTIONHOLDER);
    }

    /**
     * 设置 行为所有者
     * <P>
     * 等同 {@link #setActionHolder}
     * @param actionHolder
     */
    @JsonIgnore
    public PSDEACMode actionholder(Integer actionHolder){
        this.setActionHolder(actionHolder);
        return this;
    }

     /**
     * 设置 行为所有者
     * <P>
     * 等同 {@link #setActionHolder}
     * @param actionHolder
     */
    @JsonIgnore
    public PSDEACMode actionholder(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder actionHolder){
        if(actionHolder == null){
            this.setActionHolder(null);
        }
        else{
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    /**
     * <B>ACTYPE</B>&nbsp;自填模式类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEACType} 
     */
    public final static String FIELD_ACTYPE = "actype";

    /**
     * 设置 自填模式类型
     * 
     * @param aCType
     * 
     */
    @JsonProperty(FIELD_ACTYPE)
    public void setACType(String aCType){
        this.set(FIELD_ACTYPE, aCType);
    }
    
    /**
     * 获取 自填模式类型  
     * @return
     */
    @JsonIgnore
    public String getACType(){
        Object objValue = this.get(FIELD_ACTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填模式类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isACTypeDirty(){
        if(this.contains(FIELD_ACTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填模式类型
     */
    @JsonIgnore
    public void resetACType(){
        this.reset(FIELD_ACTYPE);
    }

    /**
     * 设置 自填模式类型
     * <P>
     * 等同 {@link #setACType}
     * @param aCType
     */
    @JsonIgnore
    public PSDEACMode actype(String aCType){
        this.setACType(aCType);
        return this;
    }

     /**
     * 设置 自填模式类型
     * <P>
     * 等同 {@link #setACType}
     * @param aCType
     */
    @JsonIgnore
    public PSDEACMode actype(net.ibizsys.psmodel.core.util.PSModelEnums.DEACType aCType){
        if(aCType == null){
            this.setACType(null);
        }
        else{
            this.setACType(aCType.value);
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定实体自填模式使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
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
    public PSDEACMode adpsdelogicid(String aDPSDELogicId){
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
    public PSDEACMode adpsdelogicid(PSDELogic pSDELogic){
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
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定实体自填模式使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
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
    public PSDEACMode adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>AIFACTORYPSSYSUTILDEID</B>&nbsp;AI工厂系统功能组件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUtil} 
     */
    public final static String FIELD_AIFACTORYPSSYSUTILDEID = "aifactorypssysutildeid";

    /**
     * 设置 AI工厂系统功能组件
     * 
     * @param aIFactoryPSSysUtilDEId
     * 
     */
    @JsonProperty(FIELD_AIFACTORYPSSYSUTILDEID)
    public void setAIFactoryPSSysUtilDEId(String aIFactoryPSSysUtilDEId){
        this.set(FIELD_AIFACTORYPSSYSUTILDEID, aIFactoryPSSysUtilDEId);
    }
    
    /**
     * 获取 AI工厂系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getAIFactoryPSSysUtilDEId(){
        Object objValue = this.get(FIELD_AIFACTORYPSSYSUTILDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI工厂系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIFactoryPSSysUtilDEIdDirty(){
        if(this.contains(FIELD_AIFACTORYPSSYSUTILDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI工厂系统功能组件
     */
    @JsonIgnore
    public void resetAIFactoryPSSysUtilDEId(){
        this.reset(FIELD_AIFACTORYPSSYSUTILDEID);
    }

    /**
     * 设置 AI工厂系统功能组件
     * <P>
     * 等同 {@link #setAIFactoryPSSysUtilDEId}
     * @param aIFactoryPSSysUtilDEId
     */
    @JsonIgnore
    public PSDEACMode aifactorypssysutildeid(String aIFactoryPSSysUtilDEId){
        this.setAIFactoryPSSysUtilDEId(aIFactoryPSSysUtilDEId);
        return this;
    }

    /**
     * 设置 AI工厂系统功能组件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAIFactoryPSSysUtilDEId}
     * @param pSSysUtil 引用对象
     */
    @JsonIgnore
    public PSDEACMode aifactorypssysutildeid(PSSysUtil pSSysUtil){
        if(pSSysUtil == null){
            this.setAIFactoryPSSysUtilDEId(null);
            this.setAIFactoryPSSysUtilDEName(null);
        }
        else{
            this.setAIFactoryPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setAIFactoryPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    /**
     * <B>AIFACTORYPSSYSUTILDENAME</B>&nbsp;AI工厂系统功能组件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AIFACTORYPSSYSUTILDEID}
     */
    public final static String FIELD_AIFACTORYPSSYSUTILDENAME = "aifactorypssysutildename";

    /**
     * 设置 AI工厂系统功能组件
     * 
     * @param aIFactoryPSSysUtilDEName
     * 
     */
    @JsonProperty(FIELD_AIFACTORYPSSYSUTILDENAME)
    public void setAIFactoryPSSysUtilDEName(String aIFactoryPSSysUtilDEName){
        this.set(FIELD_AIFACTORYPSSYSUTILDENAME, aIFactoryPSSysUtilDEName);
    }
    
    /**
     * 获取 AI工厂系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getAIFactoryPSSysUtilDEName(){
        Object objValue = this.get(FIELD_AIFACTORYPSSYSUTILDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI工厂系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIFactoryPSSysUtilDENameDirty(){
        if(this.contains(FIELD_AIFACTORYPSSYSUTILDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI工厂系统功能组件
     */
    @JsonIgnore
    public void resetAIFactoryPSSysUtilDEName(){
        this.reset(FIELD_AIFACTORYPSSYSUTILDENAME);
    }

    /**
     * 设置 AI工厂系统功能组件
     * <P>
     * 等同 {@link #setAIFactoryPSSysUtilDEName}
     * @param aIFactoryPSSysUtilDEName
     */
    @JsonIgnore
    public PSDEACMode aifactorypssysutildename(String aIFactoryPSSysUtilDEName){
        this.setAIFactoryPSSysUtilDEName(aIFactoryPSSysUtilDEName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体自动填充模式的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEACMode codename(String codeName){
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
    public PSDEACMode createdate(String createDate){
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
    public PSDEACMode createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVID</B>&nbsp;建立要求权限
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_CREATEPSDEOPPRIVID = "createpsdeopprivid";

    /**
     * 设置 建立要求权限
     * 
     * @param createPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEOPPRIVID)
    public void setCreatePSDEOPPrivId(String createPSDEOPPrivId){
        this.set(FIELD_CREATEPSDEOPPRIVID, createPSDEOPPrivId);
    }
    
    /**
     * 获取 建立要求权限  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEOPPrivId(){
        Object objValue = this.get(FIELD_CREATEPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEOPPrivIdDirty(){
        if(this.contains(FIELD_CREATEPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立要求权限
     */
    @JsonIgnore
    public void resetCreatePSDEOPPrivId(){
        this.reset(FIELD_CREATEPSDEOPPRIVID);
    }

    /**
     * 设置 建立要求权限
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivId}
     * @param createPSDEOPPrivId
     */
    @JsonIgnore
    public PSDEACMode createpsdeopprivid(String createPSDEOPPrivId){
        this.setCreatePSDEOPPrivId(createPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 建立要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEACMode createpsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setCreatePSDEOPPrivId(null);
            this.setCreatePSDEOPPrivName(null);
        }
        else{
            this.setCreatePSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setCreatePSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEOPPRIVNAME</B>&nbsp;建立实体操作标示
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEOPPRIVID}
     */
    public final static String FIELD_CREATEPSDEOPPRIVNAME = "createpsdeopprivname";

    /**
     * 设置 建立实体操作标示
     * 
     * @param createPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEOPPRIVNAME)
    public void setCreatePSDEOPPrivName(String createPSDEOPPrivName){
        this.set(FIELD_CREATEPSDEOPPRIVNAME, createPSDEOPPrivName);
    }
    
    /**
     * 获取 建立实体操作标示  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEOPPrivName(){
        Object objValue = this.get(FIELD_CREATEPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立实体操作标示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEOPPrivNameDirty(){
        if(this.contains(FIELD_CREATEPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立实体操作标示
     */
    @JsonIgnore
    public void resetCreatePSDEOPPrivName(){
        this.reset(FIELD_CREATEPSDEOPPRIVNAME);
    }

    /**
     * 设置 建立实体操作标示
     * <P>
     * 等同 {@link #setCreatePSDEOPPrivName}
     * @param createPSDEOPPrivName
     */
    @JsonIgnore
    public PSDEACMode createpsdeopprivname(String createPSDEOPPrivName){
        this.setCreatePSDEOPPrivName(createPSDEOPPrivName);
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
    public PSDEACMode customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
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
     * 判断 脚本代码模式 是否指定值，包括空值
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
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEACMode custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEACMode custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认模式，指定当前自动填充模式是否作为实体的默认自填模式，未指定为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认模式，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认模式  
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
     * 判断 默认模式 是否指定值，包括空值
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
     * 重置 默认模式
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认模式，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEACMode defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认模式，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEACMode defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定实体自动填充模式的无值显示内容，未定义时使用前端应用配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EMPTYTEXT = "emptytext";

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * 
     * @param emptyText
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXT)
    public void setEmptyText(String emptyText){
        this.set(FIELD_EMPTYTEXT, emptyText);
    }
    
    /**
     * 获取 无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getEmptyText(){
        Object objValue = this.get(FIELD_EMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextDirty(){
        if(this.contains(FIELD_EMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值显示内容
     */
    @JsonIgnore
    public void resetEmptyText(){
        this.reset(FIELD_EMPTYTEXT);
    }

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * <P>
     * 等同 {@link #setEmptyText}
     * @param emptyText
     */
    @JsonIgnore
    public PSDEACMode emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定实体自动填充的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * 
     * @param emptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESID)
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId){
        this.set(FIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResId(){
        this.reset(FIELD_EMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param emptyTextPSLanResId
     */
    @JsonIgnore
    public PSDEACMode emptytextpslanresid(String emptyTextPSLanResId){
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 无值内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEACMode emptytextpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        }
        else{
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定实体自动填充的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * 
     * @param emptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESNAME)
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName){
        this.set(FIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }
    
    /**
     * 获取 无值内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResName(){
        this.reset(FIELD_EMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResName}
     * @param emptyTextPSLanResName
     */
    @JsonIgnore
    public PSDEACMode emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLEPAGINGBAR</B>&nbsp;启用分页，指定自填模式下拉数据列表是否支持数据的分页工具栏，未指定时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode} 
     */
    public final static String FIELD_ENABLEPAGINGBAR = "enablepagingbar";

    /**
     * 设置 启用分页，详细说明：{@link #FIELD_ENABLEPAGINGBAR}
     * 
     * @param enablePagingBar
     * 
     */
    @JsonProperty(FIELD_ENABLEPAGINGBAR)
    public void setEnablePagingBar(Integer enablePagingBar){
        this.set(FIELD_ENABLEPAGINGBAR, enablePagingBar);
    }
    
    /**
     * 获取 启用分页  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePagingBar(){
        Object objValue = this.get(FIELD_ENABLEPAGINGBAR);
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
    public boolean isEnablePagingBarDirty(){
        if(this.contains(FIELD_ENABLEPAGINGBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用分页
     */
    @JsonIgnore
    public void resetEnablePagingBar(){
        this.reset(FIELD_ENABLEPAGINGBAR);
    }

    /**
     * 设置 启用分页，详细说明：{@link #FIELD_ENABLEPAGINGBAR}
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEACMode enablepagingbar(Integer enablePagingBar){
        this.setEnablePagingBar(enablePagingBar);
        return this;
    }

     /**
     * 设置 启用分页，详细说明：{@link #FIELD_ENABLEPAGINGBAR}
     * <P>
     * 等同 {@link #setEnablePagingBar}
     * @param enablePagingBar
     */
    @JsonIgnore
    public PSDEACMode enablepagingbar(net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode enablePagingBar){
        if(enablePagingBar == null){
            this.setEnablePagingBar(null);
        }
        else{
            this.setEnablePagingBar(enablePagingBar.value);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体自动填充的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_EXTENDMODE = "extendmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * 
     * @param extendMode
     * 
     */
    @JsonProperty(FIELD_EXTENDMODE)
    public void setExtendMode(Integer extendMode){
        this.set(FIELD_EXTENDMODE, extendMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendMode(){
        Object objValue = this.get(FIELD_EXTENDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendModeDirty(){
        if(this.contains(FIELD_EXTENDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetExtendMode(){
        this.reset(FIELD_EXTENDMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEACMode extendmode(Integer extendMode){
        this.setExtendMode(extendMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEACMode extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>FILLEROBJ</B>&nbsp;填充器对象，指定自填模式的填充对象，一般指定程序组件
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
    public PSDEACMode fillerobj(String fillerObj){
        this.setFillerObj(fillerObj);
        return this;
    }

    /**
     * <B>HISTORYPSSYSMSGTEMPLID</B>&nbsp;历史消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMsgTempl} 
     */
    public final static String FIELD_HISTORYPSSYSMSGTEMPLID = "historypssysmsgtemplid";

    /**
     * 设置 历史消息模板
     * 
     * @param historyPSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_HISTORYPSSYSMSGTEMPLID)
    public void setHistoryPSSysMsgTemplId(String historyPSSysMsgTemplId){
        this.set(FIELD_HISTORYPSSYSMSGTEMPLID, historyPSSysMsgTemplId);
    }
    
    /**
     * 获取 历史消息模板  
     * @return
     */
    @JsonIgnore
    public String getHistoryPSSysMsgTemplId(){
        Object objValue = this.get(FIELD_HISTORYPSSYSMSGTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 历史消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHistoryPSSysMsgTemplIdDirty(){
        if(this.contains(FIELD_HISTORYPSSYSMSGTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 历史消息模板
     */
    @JsonIgnore
    public void resetHistoryPSSysMsgTemplId(){
        this.reset(FIELD_HISTORYPSSYSMSGTEMPLID);
    }

    /**
     * 设置 历史消息模板
     * <P>
     * 等同 {@link #setHistoryPSSysMsgTemplId}
     * @param historyPSSysMsgTemplId
     */
    @JsonIgnore
    public PSDEACMode historypssysmsgtemplid(String historyPSSysMsgTemplId){
        this.setHistoryPSSysMsgTemplId(historyPSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 历史消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setHistoryPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSDEACMode historypssysmsgtemplid(PSSysMsgTempl pSSysMsgTempl){
        if(pSSysMsgTempl == null){
            this.setHistoryPSSysMsgTemplId(null);
            this.setHistoryPSSysMsgTemplName(null);
        }
        else{
            this.setHistoryPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setHistoryPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    /**
     * <B>HISTORYPSSYSMSGTEMPLNAME</B>&nbsp;历史消息模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_HISTORYPSSYSMSGTEMPLID}
     */
    public final static String FIELD_HISTORYPSSYSMSGTEMPLNAME = "historypssysmsgtemplname";

    /**
     * 设置 历史消息模板
     * 
     * @param historyPSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_HISTORYPSSYSMSGTEMPLNAME)
    public void setHistoryPSSysMsgTemplName(String historyPSSysMsgTemplName){
        this.set(FIELD_HISTORYPSSYSMSGTEMPLNAME, historyPSSysMsgTemplName);
    }
    
    /**
     * 获取 历史消息模板  
     * @return
     */
    @JsonIgnore
    public String getHistoryPSSysMsgTemplName(){
        Object objValue = this.get(FIELD_HISTORYPSSYSMSGTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 历史消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHistoryPSSysMsgTemplNameDirty(){
        if(this.contains(FIELD_HISTORYPSSYSMSGTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 历史消息模板
     */
    @JsonIgnore
    public void resetHistoryPSSysMsgTemplName(){
        this.reset(FIELD_HISTORYPSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 历史消息模板
     * <P>
     * 等同 {@link #setHistoryPSSysMsgTemplName}
     * @param historyPSSysMsgTemplName
     */
    @JsonIgnore
    public PSDEACMode historypssysmsgtemplname(String historyPSSysMsgTemplName){
        this.setHistoryPSSysMsgTemplName(historyPSSysMsgTemplName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定自填模式的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
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
     * 判断 中文名称 是否指定值，包括空值
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
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEACMode logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEACMode memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定自填模式对数据集合的排序方向，需指定排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MINORSORTDIR = "minorsortdir";

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * 
     * @param minorSortDir
     * 
     */
    @JsonProperty(FIELD_MINORSORTDIR)
    public void setMinorSortDir(String minorSortDir){
        this.set(FIELD_MINORSORTDIR, minorSortDir);
    }
    
    /**
     * 获取 默认排序方向  
     * @return
     */
    @JsonIgnore
    public String getMinorSortDir(){
        Object objValue = this.get(FIELD_MINORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortDirDirty(){
        if(this.contains(FIELD_MINORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序方向
     */
    @JsonIgnore
    public void resetMinorSortDir(){
        this.reset(FIELD_MINORSORTDIR);
    }

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEACMode minorsortdir(String minorSortDir){
        this.setMinorSortDir(minorSortDir);
        return this;
    }

     /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSDEACMode minorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定自填模式对数据集合的排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MINORSORTPSDEFID = "minorsortpsdefid";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * 
     * @param minorSortPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFID)
    public void setMinorSortPSDEFId(String minorSortPSDEFId){
        this.set(FIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFId(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFId(){
        this.reset(FIELD_MINORSORTPSDEFID);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param minorSortPSDEFId
     */
    @JsonIgnore
    public PSDEACMode minorsortpsdefid(String minorSortPSDEFId){
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    /**
     * 设置 默认排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEACMode minorsortpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        }
        else{
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定自填模式对数据集合的排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORSORTPSDEFID}
     */
    public final static String FIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * 
     * @param minorSortPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFNAME)
    public void setMinorSortPSDEFName(String minorSortPSDEFName){
        this.set(FIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFName(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFName(){
        this.reset(FIELD_MINORSORTPSDEFNAME);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorSortPSDEFName}
     * @param minorSortPSDEFName
     */
    @JsonIgnore
    public PSDEACMode minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    /**
     * <B>PAGINGSIZE</B>&nbsp;分页数量，启用自填数据分页工具栏时，指定分页的大小，未指定时为【50】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PagingSize} 
     */
    public final static String FIELD_PAGINGSIZE = "pagingsize";

    /**
     * 设置 分页数量，详细说明：{@link #FIELD_PAGINGSIZE}
     * 
     * @param pagingSize
     * 
     */
    @JsonProperty(FIELD_PAGINGSIZE)
    public void setPagingSize(Integer pagingSize){
        this.set(FIELD_PAGINGSIZE, pagingSize);
    }
    
    /**
     * 获取 分页数量  
     * @return
     */
    @JsonIgnore
    public Integer getPagingSize(){
        Object objValue = this.get(FIELD_PAGINGSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分页数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPagingSizeDirty(){
        if(this.contains(FIELD_PAGINGSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分页数量
     */
    @JsonIgnore
    public void resetPagingSize(){
        this.reset(FIELD_PAGINGSIZE);
    }

    /**
     * 设置 分页数量，详细说明：{@link #FIELD_PAGINGSIZE}
     * <P>
     * 等同 {@link #setPagingSize}
     * @param pagingSize
     */
    @JsonIgnore
    public PSDEACMode pagingsize(Integer pagingSize){
        this.setPagingSize(pagingSize);
        return this;
    }

     /**
     * 设置 分页数量，详细说明：{@link #FIELD_PAGINGSIZE}
     * <P>
     * 等同 {@link #setPagingSize}
     * @param pagingSize
     */
    @JsonIgnore
    public PSDEACMode pagingsize(net.ibizsys.psmodel.core.util.PSModelEnums.PagingSize pagingSize){
        if(pagingSize == null){
            this.setPagingSize(null);
        }
        else{
            this.setPagingSize(pagingSize.value);
        }
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWID</B>&nbsp;嵌入选择视图，指定自填模式的嵌入数据选择视图，数据选择视图将取代数据列表提供数据选择能力
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";

    /**
     * 设置 嵌入选择视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWID}
     * 
     * @param pickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWID)
    public void setPickupPSDEViewId(String pickupPSDEViewId){
        this.set(FIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }
    
    /**
     * 获取 嵌入选择视图  
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
     * 判断 嵌入选择视图 是否指定值，包括空值
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
     * 重置 嵌入选择视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewId(){
        this.reset(FIELD_PICKUPPSDEVIEWID);
    }

    /**
     * 设置 嵌入选择视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pickupPSDEViewId
     */
    @JsonIgnore
    public PSDEACMode pickuppsdeviewid(String pickupPSDEViewId){
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    /**
     * 设置 嵌入选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEACMode pickuppsdeviewid(PSDEViewBase pSDEViewBase){
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
     * <B>PICKUPPSDEVIEWNAME</B>&nbsp;嵌入选择视图，指定自填模式的嵌入数据选择视图，数据选择视图将取代数据列表提供数据选择能力
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PICKUPPSDEVIEWID}
     */
    public final static String FIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";

    /**
     * 设置 嵌入选择视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWNAME}
     * 
     * @param pickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWNAME)
    public void setPickupPSDEViewName(String pickupPSDEViewName){
        this.set(FIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }
    
    /**
     * 获取 嵌入选择视图  
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
     * 判断 嵌入选择视图 是否指定值，包括空值
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
     * 重置 嵌入选择视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewName(){
        this.reset(FIELD_PICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 嵌入选择视图，详细说明：{@link #FIELD_PICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setPickupPSDEViewName}
     * @param pickupPSDEViewName
     */
    @JsonIgnore
    public PSDEACMode pickuppsdeviewname(String pickupPSDEViewName){
        this.setPickupPSDEViewName(pickupPSDEViewName);
        return this;
    }

    /**
     * <B>PSDEACMODEID</B>&nbsp;实体自填模式标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEACMODEID = "psdeacmodeid";

    /**
     * 设置 实体自填模式标识
     * 
     * @param pSDEACModeId
     * 
     */
    @JsonProperty(FIELD_PSDEACMODEID)
    public void setPSDEACModeId(String pSDEACModeId){
        this.set(FIELD_PSDEACMODEID, pSDEACModeId);
    }
    
    /**
     * 获取 实体自填模式标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeId(){
        Object objValue = this.get(FIELD_PSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体自填模式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeIdDirty(){
        if(this.contains(FIELD_PSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体自填模式标识
     */
    @JsonIgnore
    public void resetPSDEACModeId(){
        this.reset(FIELD_PSDEACMODEID);
    }

    /**
     * 设置 实体自填模式标识
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACModeId
     */
    @JsonIgnore
    public PSDEACMode psdeacmodeid(String pSDEACModeId){
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    /**
     * <B>PSDEACMODENAME</B>&nbsp;自填模式标识，指定实体自动填充模式的标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEACMODENAME = "psdeacmodename";

    /**
     * 设置 自填模式标识，详细说明：{@link #FIELD_PSDEACMODENAME}
     * 
     * @param pSDEACModeName
     * 
     */
    @JsonProperty(FIELD_PSDEACMODENAME)
    public void setPSDEACModeName(String pSDEACModeName){
        this.set(FIELD_PSDEACMODENAME, pSDEACModeName);
    }
    
    /**
     * 获取 自填模式标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeName(){
        Object objValue = this.get(FIELD_PSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自填模式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeNameDirty(){
        if(this.contains(FIELD_PSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自填模式标识
     */
    @JsonIgnore
    public void resetPSDEACModeName(){
        this.reset(FIELD_PSDEACMODENAME);
    }

    /**
     * 设置 自填模式标识，详细说明：{@link #FIELD_PSDEACMODENAME}
     * <P>
     * 等同 {@link #setPSDEACModeName}
     * @param pSDEACModeName
     */
    @JsonIgnore
    public PSDEACMode psdeacmodename(String pSDEACModeName){
        this.setPSDEACModeName(pSDEACModeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEACModeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEACModeName(strName);
    }

    @JsonIgnore
    public PSDEACMode name(String strName){
        this.setPSDEACModeName(strName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 数据集
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 数据集  
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
     * 判断 数据集 是否指定值，包括空值
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
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEACMode psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEACMode psdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据集
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据集  
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
     * 判断 数据集 是否指定值，包括空值
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
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEACMode psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定自填模式所在的实体对象
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
    public PSDEACMode psdeid(String pSDEId){
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
    public PSDEACMode psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定自填模式所在的实体对象
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
    public PSDEACMode psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;界面行为组，指定自填模式提供的附加操作集合，提供诸如无法选择合适的数据时需要的界面上提供快速建立数据的功能
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 界面行为组  
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
     * 判断 界面行为组 是否指定值，包括空值
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
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEACMode psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEACMode psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组，指定自填模式提供的附加操作集合，提供诸如无法选择合适的数据时需要的界面上提供快速建立数据的功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 界面行为组  
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
     * 判断 界面行为组 是否指定值，包括空值
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
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEACMode psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEACMode pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEACMode pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEACMode pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;项布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 项布局面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 项布局面板  
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
     * 判断 项布局面板 是否指定值，包括空值
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
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 项布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEACMode pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 项布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEACMode pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;项布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 项布局面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 项布局面板  
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
     * 判断 项布局面板 是否指定值，包括空值
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
     * 重置 项布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 项布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEACMode pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>READPSDEOPPRIVID</B>&nbsp;读取要求权限
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_READPSDEOPPRIVID = "readpsdeopprivid";

    /**
     * 设置 读取要求权限
     * 
     * @param readPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_READPSDEOPPRIVID)
    public void setReadPSDEOPPrivId(String readPSDEOPPrivId){
        this.set(FIELD_READPSDEOPPRIVID, readPSDEOPPrivId);
    }
    
    /**
     * 获取 读取要求权限  
     * @return
     */
    @JsonIgnore
    public String getReadPSDEOPPrivId(){
        Object objValue = this.get(FIELD_READPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_READPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取要求权限
     */
    @JsonIgnore
    public void resetReadPSDEOPPrivId(){
        this.reset(FIELD_READPSDEOPPRIVID);
    }

    /**
     * 设置 读取要求权限
     * <P>
     * 等同 {@link #setReadPSDEOPPrivId}
     * @param readPSDEOPPrivId
     */
    @JsonIgnore
    public PSDEACMode readpsdeopprivid(String readPSDEOPPrivId){
        this.setReadPSDEOPPrivId(readPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 读取要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setReadPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEACMode readpsdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setReadPSDEOPPrivId(null);
            this.setReadPSDEOPPrivName(null);
        }
        else{
            this.setReadPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setReadPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>READPSDEOPPRIVNAME</B>&nbsp;读取实体操作标示
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_READPSDEOPPRIVID}
     */
    public final static String FIELD_READPSDEOPPRIVNAME = "readpsdeopprivname";

    /**
     * 设置 读取实体操作标示
     * 
     * @param readPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_READPSDEOPPRIVNAME)
    public void setReadPSDEOPPrivName(String readPSDEOPPrivName){
        this.set(FIELD_READPSDEOPPRIVNAME, readPSDEOPPrivName);
    }
    
    /**
     * 获取 读取实体操作标示  
     * @return
     */
    @JsonIgnore
    public String getReadPSDEOPPrivName(){
        Object objValue = this.get(FIELD_READPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取实体操作标示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_READPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取实体操作标示
     */
    @JsonIgnore
    public void resetReadPSDEOPPrivName(){
        this.reset(FIELD_READPSDEOPPRIVNAME);
    }

    /**
     * 设置 读取实体操作标示
     * <P>
     * 等同 {@link #setReadPSDEOPPrivName}
     * @param readPSDEOPPrivName
     */
    @JsonIgnore
    public PSDEACMode readpsdeopprivname(String readPSDEOPPrivName){
        this.setReadPSDEOPPrivName(readPSDEOPPrivName);
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性，指定自填模式数据集合存放文本内容的属性，未指定时使用当前实体的主信息属性
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
    public PSDEACMode textpsdefid(String textPSDEFId){
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
    public PSDEACMode textpsdefid(PSDEField pSDEField){
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
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性，指定自填模式数据集合存放文本内容的属性，未指定时使用当前实体的主信息属性
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
    public PSDEACMode textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
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
    public PSDEACMode updatedate(String updateDate){
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
    public PSDEACMode updateman(String updateMan){
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
    public PSDEACMode usercat(String userCat){
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
    public PSDEACMode usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEACMode usertag(String userTag){
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
    public PSDEACMode usertag2(String userTag2){
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
    public PSDEACMode usertag3(String userTag3){
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
    public PSDEACMode usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALUEPSDEFID</B>&nbsp;值属性，指定自填模式数据集合存放值内容的属性，未指定时使用当前实体的主键属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_VALUEPSDEFID = "valuepsdefid";

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFID}
     * 
     * @param valuePSDEFId
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFID)
    public void setValuePSDEFId(String valuePSDEFId){
        this.set(FIELD_VALUEPSDEFID, valuePSDEFId);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFId(){
        Object objValue = this.get(FIELD_VALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFIdDirty(){
        if(this.contains(FIELD_VALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFId(){
        this.reset(FIELD_VALUEPSDEFID);
    }

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFID}
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param valuePSDEFId
     */
    @JsonIgnore
    public PSDEACMode valuepsdefid(String valuePSDEFId){
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    /**
     * 设置 值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEACMode valuepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        }
        else{
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFNAME</B>&nbsp;值属性，指定自填模式数据集合存放值内容的属性，未指定时使用当前实体的主键属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_VALUEPSDEFID}
     */
    public final static String FIELD_VALUEPSDEFNAME = "valuepsdefname";

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFNAME}
     * 
     * @param valuePSDEFName
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFNAME)
    public void setValuePSDEFName(String valuePSDEFName){
        this.set(FIELD_VALUEPSDEFNAME, valuePSDEFName);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFName(){
        Object objValue = this.get(FIELD_VALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFNameDirty(){
        if(this.contains(FIELD_VALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFName(){
        this.reset(FIELD_VALUEPSDEFNAME);
    }

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setValuePSDEFName}
     * @param valuePSDEFName
     */
    @JsonIgnore
    public PSDEACMode valuepsdefname(String valuePSDEFName){
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEACModeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEACModeId(strValue);
    }

    @JsonIgnore
    public PSDEACMode id(String strValue){
        this.setPSDEACModeId(strValue);
        return this;
    }


    /**
     *  实体自填数据项 成员集合
     */
    public final static String FIELD_PSDEACMODEITEMS = "psdeacmodeitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEACModeItem> psdeacmodeitems;

    /**
     * 获取 实体自填数据项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEACMODEITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEACModeItem> getPSDEACModeItems(){
        return this.psdeacmodeitems;
    }

    /**
     * 设置 实体自填数据项 成员集合  
     * @param psdeacmodeitems
     */
    @JsonProperty(FIELD_PSDEACMODEITEMS)
    public void setPSDEACModeItems(java.util.List<net.ibizsys.psmodel.core.domain.PSDEACModeItem> psdeacmodeitems){
        this.psdeacmodeitems = psdeacmodeitems;
    }

    /**
     * 获取 实体自填数据项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEACModeItem> getPSDEACModeItemsIf(){
        if(this.psdeacmodeitems == null){
            this.psdeacmodeitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEACModeItem>();          
        }
        return this.psdeacmodeitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEACMode){
            PSDEACMode model = (PSDEACMode)iPSModel;
            model.setPSDEACModeItems(this.getPSDEACModeItems());
        }
        super.copyTo(iPSModel);
    }
}
