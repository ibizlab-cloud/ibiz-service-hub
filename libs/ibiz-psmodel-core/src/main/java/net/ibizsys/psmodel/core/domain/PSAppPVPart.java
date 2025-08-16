package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPPVPART</B>应用门户视图部件 模型传输对象
 * <P>
 * 应用数据看板视图部件成员模型，定义数据看板成员的界面表现及处理逻辑。支持多种类型，支持多层结构
 */
public class PSAppPVPart extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppPVPart(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AMPSSYSPFPLUGINID</B>&nbsp;快速菜单栏前端插件，指定快速菜单栏前端插件使用的前端模板扩展插件，使用插件类型【列表绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_AMPSSYSPFPLUGINID = "ampssyspfpluginid";

    /**
     * 设置 快速菜单栏前端插件，详细说明：{@link #FIELD_AMPSSYSPFPLUGINID}
     * 
     * @param aMPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_AMPSSYSPFPLUGINID)
    public void setAMPSSysPFPluginId(String aMPSSysPFPluginId){
        this.set(FIELD_AMPSSYSPFPLUGINID, aMPSSysPFPluginId);
    }
    
    /**
     * 获取 快速菜单栏前端插件  
     * @return
     */
    @JsonIgnore
    public String getAMPSSysPFPluginId(){
        Object objValue = this.get(FIELD_AMPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速菜单栏前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAMPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_AMPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速菜单栏前端插件
     */
    @JsonIgnore
    public void resetAMPSSysPFPluginId(){
        this.reset(FIELD_AMPSSYSPFPLUGINID);
    }

    /**
     * 设置 快速菜单栏前端插件，详细说明：{@link #FIELD_AMPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setAMPSSysPFPluginId}
     * @param aMPSSysPFPluginId
     */
    @JsonIgnore
    public PSAppPVPart ampssyspfpluginid(String aMPSSysPFPluginId){
        this.setAMPSSysPFPluginId(aMPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 快速菜单栏前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAMPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSAppPVPart ampssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setAMPSSysPFPluginId(null);
            this.setAMPSSysPFPluginName(null);
        }
        else{
            this.setAMPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setAMPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>AMPSSYSPFPLUGINNAME</B>&nbsp;快速菜单栏前端插件，指定快速菜单栏前端插件使用的前端模板扩展插件，使用插件类型【列表绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_AMPSSYSPFPLUGINID}
     */
    public final static String FIELD_AMPSSYSPFPLUGINNAME = "ampssyspfpluginname";

    /**
     * 设置 快速菜单栏前端插件，详细说明：{@link #FIELD_AMPSSYSPFPLUGINNAME}
     * 
     * @param aMPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_AMPSSYSPFPLUGINNAME)
    public void setAMPSSysPFPluginName(String aMPSSysPFPluginName){
        this.set(FIELD_AMPSSYSPFPLUGINNAME, aMPSSysPFPluginName);
    }
    
    /**
     * 获取 快速菜单栏前端插件  
     * @return
     */
    @JsonIgnore
    public String getAMPSSysPFPluginName(){
        Object objValue = this.get(FIELD_AMPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速菜单栏前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAMPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_AMPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速菜单栏前端插件
     */
    @JsonIgnore
    public void resetAMPSSysPFPluginName(){
        this.reset(FIELD_AMPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 快速菜单栏前端插件，详细说明：{@link #FIELD_AMPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setAMPSSysPFPluginName}
     * @param aMPSSysPFPluginName
     */
    @JsonIgnore
    public PSAppPVPart ampssyspfpluginname(String aMPSSysPFPluginName){
        this.setAMPSSysPFPluginName(aMPSSysPFPluginName);
        return this;
    }

    /**
     * <B>BL_POS</B>&nbsp;位置布局位置，看板成员父容器布局模式为【边缘布局】时指定成员的位置
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
    public PSAppPVPart bl_pos(String bL_Pos){
        this.setBL_Pos(bL_Pos);
        return this;
    }

    /**
     * <B>COLID</B>&nbsp;列标识，数据面板成员父容器布局模式为【表格布局】时指定占位列标识，-1为自动，未定义时为【-1】
     */
    public final static String FIELD_COLID = "colid";

    /**
     * 设置 列标识，详细说明：{@link #FIELD_COLID}
     * 
     * @param colId
     * 
     */
    @JsonProperty(FIELD_COLID)
    public void setColId(Integer colId){
        this.set(FIELD_COLID, colId);
    }
    
    /**
     * 获取 列标识  
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
     * 判断 列标识 是否指定值，包括空值
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
     * 重置 列标识
     */
    @JsonIgnore
    public void resetColId(){
        this.reset(FIELD_COLID);
    }

    /**
     * 设置 列标识，详细说明：{@link #FIELD_COLID}
     * <P>
     * 等同 {@link #setColId}
     * @param colId
     */
    @JsonIgnore
    public PSAppPVPart colid(Integer colId){
        this.setColId(colId);
        return this;
    }

    /**
     * <B>COLSPAN</B>&nbsp;列数，数据看板成员父容器布局模式为【表格布局】时指定成员的占位列数，未定义时为【1】
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
    public PSAppPVPart colspan(Integer colSpan){
        this.setColSpan(colSpan);
        return this;
    }

    /**
     * <B>COL_LG</B>&nbsp;大型列宽，数据看板成员父容器布局模式为【栅格布局】时指定成员在大型界面的列占位数量，未定义时为【-1】
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
    public PSAppPVPart col_lg(Integer col_LG){
        this.setCol_LG(col_LG);
        return this;
    }

    /**
     * <B>COL_LG_OS</B>&nbsp;大型偏移，数据看板成员父容器布局模式为【栅格布局】时指定成员在大型界面的列偏移数量，未定义时为【-1】
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
    public PSAppPVPart col_lg_os(Integer col_LG_OS){
        this.setCol_LG_OS(col_LG_OS);
        return this;
    }

    /**
     * <B>COL_MD</B>&nbsp;中型列宽，数据看板成员父容器布局模式为【栅格布局】时指定成员在中型界面的列占位数量，未定义时为【-1】
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
    public PSAppPVPart col_md(Integer col_MD){
        this.setCol_MD(col_MD);
        return this;
    }

    /**
     * <B>COL_MD_OS</B>&nbsp;中型偏移，数据看板成员父容器布局模式为【栅格布局】时指定成员在中型界面的列偏移数量，未定义时为【-1】
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
    public PSAppPVPart col_md_os(Integer col_MD_OS){
        this.setCol_MD_OS(col_MD_OS);
        return this;
    }

    /**
     * <B>COL_SM</B>&nbsp;小型列宽，数据看板成员父容器布局模式为【栅格布局】时指定成员在小型界面的列占位数量，未定义时为【-1】
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
    public PSAppPVPart col_sm(Integer col_SM){
        this.setCol_SM(col_SM);
        return this;
    }

    /**
     * <B>COL_SM_OS</B>&nbsp;小型偏移，数据看板成员父容器布局模式为【栅格布局】时指定成员在小型界面的列偏移数量，未定义时为【-1】
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
    public PSAppPVPart col_sm_os(Integer col_SM_OS){
        this.setCol_SM_OS(col_SM_OS);
        return this;
    }

    /**
     * <B>COL_XS</B>&nbsp;超小列宽，数据看板成员父容器布局模式为【栅格布局】时指定成员在超小界面的列占位数量，未定义时为【-1】
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
    public PSAppPVPart col_xs(Integer col_XS){
        this.setCol_XS(col_XS);
        return this;
    }

    /**
     * <B>COL_XS_OS</B>&nbsp;超小偏移，数据看板成员父容器布局模式为【栅格布局】时指定成员在超小界面的列偏移数量，未定义时为【-1】
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
    public PSAppPVPart col_xs_os(Integer col_XS_OS){
        this.setCol_XS_OS(col_XS_OS);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定应用看板视图直接内容项的内容类型
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
    public PSAppPVPart contenttype(String contentType){
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
    public PSAppPVPart contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.RawItemContentType contentType){
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
    public PSAppPVPart createdate(String createDate){
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
    public PSAppPVPart createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSAppPVPart dynaclass(String dynaClass){
        this.setDynaClass(dynaClass);
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
    public PSAppPVPart enableanchor(Integer enableAnchor){
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
    public PSAppPVPart enableanchor(Boolean enableAnchor){
        if(enableAnchor == null){
            this.setEnableAnchor(null);
        }
        else{
            this.setEnableAnchor(enableAnchor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECUSTOMMENU</B>&nbsp;支持自定义菜单，指定应用菜单看板成员是否支持自定义，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMMENU = "enablecustommenu";

    /**
     * 设置 支持自定义菜单，详细说明：{@link #FIELD_ENABLECUSTOMMENU}
     * 
     * @param enableCustomMenu
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMMENU)
    public void setEnableCustomMenu(Integer enableCustomMenu){
        this.set(FIELD_ENABLECUSTOMMENU, enableCustomMenu);
    }
    
    /**
     * 获取 支持自定义菜单  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomMenu(){
        Object objValue = this.get(FIELD_ENABLECUSTOMMENU);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持自定义菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomMenuDirty(){
        if(this.contains(FIELD_ENABLECUSTOMMENU)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持自定义菜单
     */
    @JsonIgnore
    public void resetEnableCustomMenu(){
        this.reset(FIELD_ENABLECUSTOMMENU);
    }

    /**
     * 设置 支持自定义菜单，详细说明：{@link #FIELD_ENABLECUSTOMMENU}
     * <P>
     * 等同 {@link #setEnableCustomMenu}
     * @param enableCustomMenu
     */
    @JsonIgnore
    public PSAppPVPart enablecustommenu(Integer enableCustomMenu){
        this.setEnableCustomMenu(enableCustomMenu);
        return this;
    }

     /**
     * 设置 支持自定义菜单，详细说明：{@link #FIELD_ENABLECUSTOMMENU}
     * <P>
     * 等同 {@link #setEnableCustomMenu}
     * @param enableCustomMenu
     */
    @JsonIgnore
    public PSAppPVPart enablecustommenu(Boolean enableCustomMenu){
        if(enableCustomMenu == null){
            this.setEnableCustomMenu(null);
        }
        else{
            this.setEnableCustomMenu(enableCustomMenu?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，数据看板成员容器布局模式为【Flex布局】时指定横轴对齐方式
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
    public PSAppPVPart flexalign(String flexAlign){
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
    public PSAppPVPart flexalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign flexAlign){
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
    public PSAppPVPart flexbasis(Integer flexBasis){
        this.setFlexBasis(flexBasis);
        return this;
    }

    /**
     * <B>FLEXDIR</B>&nbsp;Flex布局方向，数据看板成员容器布局模式为【Flex布局】时指定布局方向
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
    public PSAppPVPart flexdir(String flexDir){
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
    public PSAppPVPart flexdir(net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir flexDir){
        if(flexDir == null){
            this.setFlexDir(null);
        }
        else{
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    /**
     * <B>FLEXGROW</B>&nbsp;Flex延展值，数据看板成员父容器布局模式为【Flex布局】时指定成员的延展值，未定义时为【-1】
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
    public PSAppPVPart flexgrow(Integer flexGrow){
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
    public PSAppPVPart flexshrink(Integer flexShrink){
        this.setFlexShrink(flexShrink);
        return this;
    }

    /**
     * <B>FLEXVALIGN</B>&nbsp;Flex纵轴对齐，数据看板成员容器布局模式为【Flex布局】时指定纵轴对齐方式
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
    public PSAppPVPart flexvalign(String flexVAlign){
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
    public PSAppPVPart flexvalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign flexVAlign){
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
    public PSAppPVPart halignself(String hAlignSelf){
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
    public PSAppPVPart halignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextAlign hAlignSelf){
        if(hAlignSelf == null){
            this.setHAlignSelf(null);
        }
        else{
            this.setHAlignSelf(hAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定数据看板成员的高度，0为自动，未定义时门户部件项使用引用门户部件配置，其它为【0】
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
    public PSAppPVPart height(Integer height){
        this.setHeight(height);
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
    public PSAppPVPart htmlcontent(String htmlContent){
        this.setHtmlContent(htmlContent);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定数据看板成员的布局容器模式
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
    public PSAppPVPart layoutmode(String layoutMode){
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
    public PSAppPVPart layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
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
    public PSAppPVPart memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MENUPSAPPUTILVIEWID</B>&nbsp;自定义菜单功能视图，指定应用菜单看板成员提供自定义的功能视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppUtilView} 
     */
    public final static String FIELD_MENUPSAPPUTILVIEWID = "menupsapputilviewid";

    /**
     * 设置 自定义菜单功能视图，详细说明：{@link #FIELD_MENUPSAPPUTILVIEWID}
     * 
     * @param menuPSAppUtilViewId
     * 
     */
    @JsonProperty(FIELD_MENUPSAPPUTILVIEWID)
    public void setMenuPSAppUtilViewId(String menuPSAppUtilViewId){
        this.set(FIELD_MENUPSAPPUTILVIEWID, menuPSAppUtilViewId);
    }
    
    /**
     * 获取 自定义菜单功能视图  
     * @return
     */
    @JsonIgnore
    public String getMenuPSAppUtilViewId(){
        Object objValue = this.get(FIELD_MENUPSAPPUTILVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义菜单功能视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMenuPSAppUtilViewIdDirty(){
        if(this.contains(FIELD_MENUPSAPPUTILVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义菜单功能视图
     */
    @JsonIgnore
    public void resetMenuPSAppUtilViewId(){
        this.reset(FIELD_MENUPSAPPUTILVIEWID);
    }

    /**
     * 设置 自定义菜单功能视图，详细说明：{@link #FIELD_MENUPSAPPUTILVIEWID}
     * <P>
     * 等同 {@link #setMenuPSAppUtilViewId}
     * @param menuPSAppUtilViewId
     */
    @JsonIgnore
    public PSAppPVPart menupsapputilviewid(String menuPSAppUtilViewId){
        this.setMenuPSAppUtilViewId(menuPSAppUtilViewId);
        return this;
    }

    /**
     * 设置 自定义菜单功能视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMenuPSAppUtilViewId}
     * @param pSAppUtilView 引用对象
     */
    @JsonIgnore
    public PSAppPVPart menupsapputilviewid(PSAppUtilView pSAppUtilView){
        if(pSAppUtilView == null){
            this.setMenuPSAppUtilViewId(null);
            this.setMenuPSAppUtilViewName(null);
        }
        else{
            this.setMenuPSAppUtilViewId(pSAppUtilView.getPSAppUtilViewId());
            this.setMenuPSAppUtilViewName(pSAppUtilView.getPSAppUtilViewName());
        }
        return this;
    }

    /**
     * <B>MENUPSAPPUTILVIEWNAME</B>&nbsp;自定义菜单功能视图，指定应用菜单看板成员提供自定义的功能视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MENUPSAPPUTILVIEWID}
     */
    public final static String FIELD_MENUPSAPPUTILVIEWNAME = "menupsapputilviewname";

    /**
     * 设置 自定义菜单功能视图，详细说明：{@link #FIELD_MENUPSAPPUTILVIEWNAME}
     * 
     * @param menuPSAppUtilViewName
     * 
     */
    @JsonProperty(FIELD_MENUPSAPPUTILVIEWNAME)
    public void setMenuPSAppUtilViewName(String menuPSAppUtilViewName){
        this.set(FIELD_MENUPSAPPUTILVIEWNAME, menuPSAppUtilViewName);
    }
    
    /**
     * 获取 自定义菜单功能视图  
     * @return
     */
    @JsonIgnore
    public String getMenuPSAppUtilViewName(){
        Object objValue = this.get(FIELD_MENUPSAPPUTILVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义菜单功能视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMenuPSAppUtilViewNameDirty(){
        if(this.contains(FIELD_MENUPSAPPUTILVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义菜单功能视图
     */
    @JsonIgnore
    public void resetMenuPSAppUtilViewName(){
        this.reset(FIELD_MENUPSAPPUTILVIEWNAME);
    }

    /**
     * 设置 自定义菜单功能视图，详细说明：{@link #FIELD_MENUPSAPPUTILVIEWNAME}
     * <P>
     * 等同 {@link #setMenuPSAppUtilViewName}
     * @param menuPSAppUtilViewName
     */
    @JsonIgnore
    public PSAppPVPart menupsapputilviewname(String menuPSAppUtilViewName){
        this.setMenuPSAppUtilViewName(menuPSAppUtilViewName);
        return this;
    }

    /**
     * <B>MOBAMSTYLE</B>&nbsp;菜单栏样式，指定应用菜单看板成员的绘制样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobMDCtrlType} 
     */
    public final static String FIELD_MOBAMSTYLE = "mobamstyle";

    /**
     * 设置 菜单栏样式，详细说明：{@link #FIELD_MOBAMSTYLE}
     * 
     * @param mOBAMStyle
     * 
     */
    @JsonProperty(FIELD_MOBAMSTYLE)
    public void setMOBAMStyle(String mOBAMStyle){
        this.set(FIELD_MOBAMSTYLE, mOBAMStyle);
        //属性名称与代码标识不一致，设置属性名称
        this.set("mobamtyle", mOBAMStyle);
    }
    
    /**
     * 获取 菜单栏样式  
     * @return
     */
    @JsonIgnore
    public String getMOBAMStyle(){
        Object objValue = this.get(FIELD_MOBAMSTYLE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("mobamtyle");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 菜单栏样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMOBAMStyleDirty(){
        if(this.contains(FIELD_MOBAMSTYLE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("mobamtyle")){
            return true;
        }
        return false;
    }

    /**
     * 重置 菜单栏样式
     */
    @JsonIgnore
    public void resetMOBAMStyle(){
        this.reset(FIELD_MOBAMSTYLE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("mobamtyle");
    }

    /**
     * 设置 菜单栏样式，详细说明：{@link #FIELD_MOBAMSTYLE}
     * <P>
     * 等同 {@link #setMOBAMStyle}
     * @param mOBAMStyle
     */
    @JsonIgnore
    public PSAppPVPart mobamstyle(String mOBAMStyle){
        this.setMOBAMStyle(mOBAMStyle);
        return this;
    }

     /**
     * 设置 菜单栏样式，详细说明：{@link #FIELD_MOBAMSTYLE}
     * <P>
     * 等同 {@link #setMOBAMStyle}
     * @param mOBAMStyle
     */
    @JsonIgnore
    public PSAppPVPart mobamstyle(net.ibizsys.psmodel.core.util.PSModelEnums.MobMDCtrlType mOBAMStyle){
        if(mOBAMStyle == null){
            this.setMOBAMStyle(null);
        }
        else{
            this.setMOBAMStyle(mOBAMStyle.value);
        }
        return this;
    }

    /**
     * <B>NEWROWMODE</B>&nbsp;新起一行，数据看板成员容器布局模式为【表格布局】时指定是否强制新起一行，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NEWROWMODE = "newrowmode";

    /**
     * 设置 新起一行，详细说明：{@link #FIELD_NEWROWMODE}
     * 
     * @param newRowMode
     * 
     */
    @JsonProperty(FIELD_NEWROWMODE)
    public void setNewRowMode(Integer newRowMode){
        this.set(FIELD_NEWROWMODE, newRowMode);
    }
    
    /**
     * 获取 新起一行  
     * @return
     */
    @JsonIgnore
    public Integer getNewRowMode(){
        Object objValue = this.get(FIELD_NEWROWMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 新起一行 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNewRowModeDirty(){
        if(this.contains(FIELD_NEWROWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新起一行
     */
    @JsonIgnore
    public void resetNewRowMode(){
        this.reset(FIELD_NEWROWMODE);
    }

    /**
     * 设置 新起一行，详细说明：{@link #FIELD_NEWROWMODE}
     * <P>
     * 等同 {@link #setNewRowMode}
     * @param newRowMode
     */
    @JsonIgnore
    public PSAppPVPart newrowmode(Integer newRowMode){
        this.setNewRowMode(newRowMode);
        return this;
    }

     /**
     * 设置 新起一行，详细说明：{@link #FIELD_NEWROWMODE}
     * <P>
     * 等同 {@link #setNewRowMode}
     * @param newRowMode
     */
    @JsonIgnore
    public PSAppPVPart newrowmode(Boolean newRowMode){
        if(newRowMode == null){
            this.setNewRowMode(null);
        }
        else{
            this.setNewRowMode(newRowMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSAppPVPart ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARTPARAMS</B>&nbsp;成员参数
     */
    public final static String FIELD_PARTPARAMS = "partparams";

    /**
     * 设置 成员参数
     * 
     * @param partParams
     * 
     */
    @JsonProperty(FIELD_PARTPARAMS)
    public void setPartParams(String partParams){
        this.set(FIELD_PARTPARAMS, partParams);
    }
    
    /**
     * 获取 成员参数  
     * @return
     */
    @JsonIgnore
    public String getPartParams(){
        Object objValue = this.get(FIELD_PARTPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPartParamsDirty(){
        if(this.contains(FIELD_PARTPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数
     */
    @JsonIgnore
    public void resetPartParams(){
        this.reset(FIELD_PARTPARAMS);
    }

    /**
     * 设置 成员参数
     * <P>
     * 等同 {@link #setPartParams}
     * @param partParams
     */
    @JsonIgnore
    public PSAppPVPart partparams(String partParams){
        this.setPartParams(partParams);
        return this;
    }

    /**
     * <B>PARTSTYLE</B>&nbsp;内置样式，指定数据看板成员的内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_PARTSTYLE = "partstyle";

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_PARTSTYLE}
     * 
     * @param partStyle
     * 
     */
    @JsonProperty(FIELD_PARTSTYLE)
    public void setPartStyle(String partStyle){
        this.set(FIELD_PARTSTYLE, partStyle);
    }
    
    /**
     * 获取 内置样式  
     * @return
     */
    @JsonIgnore
    public String getPartStyle(){
        Object objValue = this.get(FIELD_PARTSTYLE);
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
    public boolean isPartStyleDirty(){
        if(this.contains(FIELD_PARTSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内置样式
     */
    @JsonIgnore
    public void resetPartStyle(){
        this.reset(FIELD_PARTSTYLE);
    }

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_PARTSTYLE}
     * <P>
     * 等同 {@link #setPartStyle}
     * @param partStyle
     */
    @JsonIgnore
    public PSAppPVPart partstyle(String partStyle){
        this.setPartStyle(partStyle);
        return this;
    }

     /**
     * 设置 内置样式，详细说明：{@link #FIELD_PARTSTYLE}
     * <P>
     * 等同 {@link #setPartStyle}
     * @param partStyle
     */
    @JsonIgnore
    public PSAppPVPart partstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle partStyle){
        if(partStyle == null){
            this.setPartStyle(null);
        }
        else{
            this.setPartStyle(partStyle.value);
        }
        return this;
    }

    /**
     * <B>PORTLETTYPE</B>&nbsp;部件样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PortletType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPORTLETID}
     */
    public final static String FIELD_PORTLETTYPE = "portlettype";

    /**
     * 设置 部件样式
     * 
     * @param portletType
     * 
     */
    @JsonProperty(FIELD_PORTLETTYPE)
    public void setPortletType(String portletType){
        this.set(FIELD_PORTLETTYPE, portletType);
    }
    
    /**
     * 获取 部件样式  
     * @return
     */
    @JsonIgnore
    public String getPortletType(){
        Object objValue = this.get(FIELD_PORTLETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortletTypeDirty(){
        if(this.contains(FIELD_PORTLETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件样式
     */
    @JsonIgnore
    public void resetPortletType(){
        this.reset(FIELD_PORTLETTYPE);
    }

    /**
     * 设置 部件样式
     * <P>
     * 等同 {@link #setPortletType}
     * @param portletType
     */
    @JsonIgnore
    public PSAppPVPart portlettype(String portletType){
        this.setPortletType(portletType);
        return this;
    }

    /**
     * <B>PPSAPPPVPARTID</B>&nbsp;父数据看板成员，指定数据看板成员的父成员
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppPVPart} 
     */
    public final static String FIELD_PPSAPPPVPARTID = "ppsapppvpartid";

    /**
     * 设置 父数据看板成员，详细说明：{@link #FIELD_PPSAPPPVPARTID}
     * 
     * @param pPSAppPVPartId
     * 
     */
    @JsonProperty(FIELD_PPSAPPPVPARTID)
    public void setPPSAppPVPartId(String pPSAppPVPartId){
        this.set(FIELD_PPSAPPPVPARTID, pPSAppPVPartId);
    }
    
    /**
     * 获取 父数据看板成员  
     * @return
     */
    @JsonIgnore
    public String getPPSAppPVPartId(){
        Object objValue = this.get(FIELD_PPSAPPPVPARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父数据看板成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppPVPartIdDirty(){
        if(this.contains(FIELD_PPSAPPPVPARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父数据看板成员
     */
    @JsonIgnore
    public void resetPPSAppPVPartId(){
        this.reset(FIELD_PPSAPPPVPARTID);
    }

    /**
     * 设置 父数据看板成员，详细说明：{@link #FIELD_PPSAPPPVPARTID}
     * <P>
     * 等同 {@link #setPPSAppPVPartId}
     * @param pPSAppPVPartId
     */
    @JsonIgnore
    public PSAppPVPart ppsapppvpartid(String pPSAppPVPartId){
        this.setPPSAppPVPartId(pPSAppPVPartId);
        return this;
    }

    /**
     * 设置 父数据看板成员，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSAppPVPartId}
     * @param pSAppPVPart 引用对象
     */
    @JsonIgnore
    public PSAppPVPart ppsapppvpartid(PSAppPVPart pSAppPVPart){
        if(pSAppPVPart == null){
            this.setPPSAppPVPartId(null);
            this.setPPSAppPVPartName(null);
        }
        else{
            this.setPPSAppPVPartId(pSAppPVPart.getPSAppPVPartId());
            this.setPPSAppPVPartName(pSAppPVPart.getPSAppPVPartName());
        }
        return this;
    }

    /**
     * <B>PPSAPPPVPARTNAME</B>&nbsp;父数据看板成员，指定数据看板成员的父成员
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSAPPPVPARTID}
     */
    public final static String FIELD_PPSAPPPVPARTNAME = "ppsapppvpartname";

    /**
     * 设置 父数据看板成员，详细说明：{@link #FIELD_PPSAPPPVPARTNAME}
     * 
     * @param pPSAppPVPartName
     * 
     */
    @JsonProperty(FIELD_PPSAPPPVPARTNAME)
    public void setPPSAppPVPartName(String pPSAppPVPartName){
        this.set(FIELD_PPSAPPPVPARTNAME, pPSAppPVPartName);
    }
    
    /**
     * 获取 父数据看板成员  
     * @return
     */
    @JsonIgnore
    public String getPPSAppPVPartName(){
        Object objValue = this.get(FIELD_PPSAPPPVPARTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父数据看板成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppPVPartNameDirty(){
        if(this.contains(FIELD_PPSAPPPVPARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父数据看板成员
     */
    @JsonIgnore
    public void resetPPSAppPVPartName(){
        this.reset(FIELD_PPSAPPPVPARTNAME);
    }

    /**
     * 设置 父数据看板成员，详细说明：{@link #FIELD_PPSAPPPVPARTNAME}
     * <P>
     * 等同 {@link #setPPSAppPVPartName}
     * @param pPSAppPVPartName
     */
    @JsonIgnore
    public PSAppPVPart ppsapppvpartname(String pPSAppPVPartName){
        this.setPPSAppPVPartName(pPSAppPVPartName);
        return this;
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;应用菜单，指定应用菜单看板成员引用的应用菜单
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
    public PSAppPVPart psappmenuid(String pSAppMenuId){
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
    public PSAppPVPart psappmenuid(PSAppMenu pSAppMenu){
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
     * <B>PSAPPMENUNAME</B>&nbsp;应用菜单，指定应用菜单看板成员引用的应用菜单
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
    public PSAppPVPart psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSAPPPORTALVIEWID</B>&nbsp;应用门户视图，指定数据看板成员所属的应用数据看板视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppPortalView} 
     */
    public final static String FIELD_PSAPPPORTALVIEWID = "psappportalviewid";

    /**
     * 设置 应用门户视图，详细说明：{@link #FIELD_PSAPPPORTALVIEWID}
     * 
     * @param pSAppPortalViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPPORTALVIEWID)
    public void setPSAppPortalViewId(String pSAppPortalViewId){
        this.set(FIELD_PSAPPPORTALVIEWID, pSAppPortalViewId);
    }
    
    /**
     * 获取 应用门户视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppPortalViewId(){
        Object objValue = this.get(FIELD_PSAPPPORTALVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用门户视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPortalViewIdDirty(){
        if(this.contains(FIELD_PSAPPPORTALVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用门户视图
     */
    @JsonIgnore
    public void resetPSAppPortalViewId(){
        this.reset(FIELD_PSAPPPORTALVIEWID);
    }

    /**
     * 设置 应用门户视图，详细说明：{@link #FIELD_PSAPPPORTALVIEWID}
     * <P>
     * 等同 {@link #setPSAppPortalViewId}
     * @param pSAppPortalViewId
     */
    @JsonIgnore
    public PSAppPVPart psappportalviewid(String pSAppPortalViewId){
        this.setPSAppPortalViewId(pSAppPortalViewId);
        return this;
    }

    /**
     * 设置 应用门户视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppPortalViewId}
     * @param pSAppPortalView 引用对象
     */
    @JsonIgnore
    public PSAppPVPart psappportalviewid(PSAppPortalView pSAppPortalView){
        if(pSAppPortalView == null){
            this.setPSAppPortalViewId(null);
            this.setPSAppPortalViewName(null);
        }
        else{
            this.setPSAppPortalViewId(pSAppPortalView.getPSAppPortalViewId());
            this.setPSAppPortalViewName(pSAppPortalView.getPSAppPortalViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPPORTALVIEWNAME</B>&nbsp;应用门户视图，指定数据看板成员所属的应用数据看板视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPPORTALVIEWID}
     */
    public final static String FIELD_PSAPPPORTALVIEWNAME = "psappportalviewname";

    /**
     * 设置 应用门户视图，详细说明：{@link #FIELD_PSAPPPORTALVIEWNAME}
     * 
     * @param pSAppPortalViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPPORTALVIEWNAME)
    public void setPSAppPortalViewName(String pSAppPortalViewName){
        this.set(FIELD_PSAPPPORTALVIEWNAME, pSAppPortalViewName);
    }
    
    /**
     * 获取 应用门户视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppPortalViewName(){
        Object objValue = this.get(FIELD_PSAPPPORTALVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用门户视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPortalViewNameDirty(){
        if(this.contains(FIELD_PSAPPPORTALVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用门户视图
     */
    @JsonIgnore
    public void resetPSAppPortalViewName(){
        this.reset(FIELD_PSAPPPORTALVIEWNAME);
    }

    /**
     * 设置 应用门户视图，详细说明：{@link #FIELD_PSAPPPORTALVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppPortalViewName}
     * @param pSAppPortalViewName
     */
    @JsonIgnore
    public PSAppPVPart psappportalviewname(String pSAppPortalViewName){
        this.setPSAppPortalViewName(pSAppPortalViewName);
        return this;
    }

    /**
     * <B>PSAPPPVPARTID</B>&nbsp;应用门户视图部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPPVPARTID = "psapppvpartid";

    /**
     * 设置 应用门户视图部件标识
     * 
     * @param pSAppPVPartId
     * 
     */
    @JsonProperty(FIELD_PSAPPPVPARTID)
    public void setPSAppPVPartId(String pSAppPVPartId){
        this.set(FIELD_PSAPPPVPARTID, pSAppPVPartId);
    }
    
    /**
     * 获取 应用门户视图部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPVPartId(){
        Object objValue = this.get(FIELD_PSAPPPVPARTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用门户视图部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPVPartIdDirty(){
        if(this.contains(FIELD_PSAPPPVPARTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用门户视图部件标识
     */
    @JsonIgnore
    public void resetPSAppPVPartId(){
        this.reset(FIELD_PSAPPPVPARTID);
    }

    /**
     * 设置 应用门户视图部件标识
     * <P>
     * 等同 {@link #setPSAppPVPartId}
     * @param pSAppPVPartId
     */
    @JsonIgnore
    public PSAppPVPart psapppvpartid(String pSAppPVPartId){
        this.setPSAppPVPartId(pSAppPVPartId);
        return this;
    }

    /**
     * <B>PSAPPPVPARTNAME</B>&nbsp;部件标识，指定数据看板成员的标识，需在所属的应用数据看板视图中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSAPPPVPARTNAME = "psapppvpartname";

    /**
     * 设置 部件标识，详细说明：{@link #FIELD_PSAPPPVPARTNAME}
     * 
     * @param pSAppPVPartName
     * 
     */
    @JsonProperty(FIELD_PSAPPPVPARTNAME)
    public void setPSAppPVPartName(String pSAppPVPartName){
        this.set(FIELD_PSAPPPVPARTNAME, pSAppPVPartName);
    }
    
    /**
     * 获取 部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPVPartName(){
        Object objValue = this.get(FIELD_PSAPPPVPARTNAME);
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
    public boolean isPSAppPVPartNameDirty(){
        if(this.contains(FIELD_PSAPPPVPARTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件标识
     */
    @JsonIgnore
    public void resetPSAppPVPartName(){
        this.reset(FIELD_PSAPPPVPARTNAME);
    }

    /**
     * 设置 部件标识，详细说明：{@link #FIELD_PSAPPPVPARTNAME}
     * <P>
     * 等同 {@link #setPSAppPVPartName}
     * @param pSAppPVPartName
     */
    @JsonIgnore
    public PSAppPVPart psapppvpartname(String pSAppPVPartName){
        this.setPSAppPVPartName(pSAppPVPartName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppPVPartName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppPVPartName(strName);
    }

    @JsonIgnore
    public PSAppPVPart name(String strName){
        this.setPSAppPVPartName(strName);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图，指定应用视图看板成员引用的应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSAppPVPart psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppPVPart psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图，指定应用视图看板成员引用的应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSAppPVPart psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式，指定数据看板成员的容器界面样式表，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统界面样式  
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
     * 判断 系统界面样式 是否指定值，包括空值
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
     * 重置 系统界面样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSAppPVPart pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSAppPVPart pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定数据看板成员的容器界面样式表，未定义时门户部件项使用引用门户部件配置
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
    public PSAppPVPart pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片，指定数据看板成员的图片对象，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 系统图片  
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
     * 判断 系统图片 是否指定值，包括空值
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
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSAppPVPart pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 系统图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSAppPVPart pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;系统图片，指定数据看板成员的图片对象，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 系统图片  
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
     * 判断 系统图片 是否指定值，包括空值
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
     * 重置 系统图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 系统图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSAppPVPart pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定数据看板成员的前端模板扩展插件，未定义时门户部件项使用引用门户部件配置
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
    public PSAppPVPart pssyspfpluginid(String pSSysPFPluginId){
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
    public PSAppPVPart pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定数据看板成员的前端模板扩展插件，未定义时门户部件项使用引用门户部件配置
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
    public PSAppPVPart pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSPORTLETID</B>&nbsp;系统门户部件，系统门户部件项指定引用的系统门户部件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPortlet} 
     */
    public final static String FIELD_PSSYSPORTLETID = "pssysportletid";

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETID}
     * 
     * @param pSSysPortletId
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETID)
    public void setPSSysPortletId(String pSSysPortletId){
        this.set(FIELD_PSSYSPORTLETID, pSSysPortletId);
    }
    
    /**
     * 获取 系统门户部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletId(){
        Object objValue = this.get(FIELD_PSSYSPORTLETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统门户部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletIdDirty(){
        if(this.contains(FIELD_PSSYSPORTLETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统门户部件
     */
    @JsonIgnore
    public void resetPSSysPortletId(){
        this.reset(FIELD_PSSYSPORTLETID);
    }

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETID}
     * <P>
     * 等同 {@link #setPSSysPortletId}
     * @param pSSysPortletId
     */
    @JsonIgnore
    public PSAppPVPart pssysportletid(String pSSysPortletId){
        this.setPSSysPortletId(pSSysPortletId);
        return this;
    }

    /**
     * 设置 系统门户部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPortletId}
     * @param pSSysPortlet 引用对象
     */
    @JsonIgnore
    public PSAppPVPart pssysportletid(PSSysPortlet pSSysPortlet){
        if(pSSysPortlet == null){
            this.setPortletType(null);
            this.setPSSysPortletId(null);
            this.setPSSysPortletName(null);
        }
        else{
            this.setPortletType(pSSysPortlet.getPortletType());
            this.setPSSysPortletId(pSSysPortlet.getPSSysPortletId());
            this.setPSSysPortletName(pSSysPortlet.getPSSysPortletName());
        }
        return this;
    }

    /**
     * <B>PSSYSPORTLETNAME</B>&nbsp;系统门户部件，系统门户部件项指定引用的系统门户部件对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPORTLETID}
     */
    public final static String FIELD_PSSYSPORTLETNAME = "pssysportletname";

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETNAME}
     * 
     * @param pSSysPortletName
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETNAME)
    public void setPSSysPortletName(String pSSysPortletName){
        this.set(FIELD_PSSYSPORTLETNAME, pSSysPortletName);
    }
    
    /**
     * 获取 系统门户部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletName(){
        Object objValue = this.get(FIELD_PSSYSPORTLETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统门户部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletNameDirty(){
        if(this.contains(FIELD_PSSYSPORTLETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统门户部件
     */
    @JsonIgnore
    public void resetPSSysPortletName(){
        this.reset(FIELD_PSSYSPORTLETNAME);
    }

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETNAME}
     * <P>
     * 等同 {@link #setPSSysPortletName}
     * @param pSSysPortletName
     */
    @JsonIgnore
    public PSAppPVPart pssysportletname(String pSSysPortletName){
        this.setPSSysPortletName(pSSysPortletName);
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
    public PSAppPVPart pssysresourceid(String pSSysResourceId){
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
    public PSAppPVPart pssysresourceid(PSSysResource pSSysResource){
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
    public PSAppPVPart pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，指定数据看板成员的访问控制的统一资源对象，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
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
     * 判断 系统统一资源 是否指定值，包括空值
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
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSAppPVPart pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSAppPVPart pssysuniresid(PSSysUniRes pSSysUniRes){
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
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，指定数据看板成员的访问控制的统一资源对象，未定义时门户部件项使用引用门户部件配置
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
    public PSAppPVPart pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PVPARTTYPE</B>&nbsp;部件类型，指定数据看板成员类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppDashboardPartType} 
     */
    public final static String FIELD_PVPARTTYPE = "pvparttype";

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_PVPARTTYPE}
     * 
     * @param pVPartType
     * 
     */
    @JsonProperty(FIELD_PVPARTTYPE)
    public void setPVPartType(String pVPartType){
        this.set(FIELD_PVPARTTYPE, pVPartType);
    }
    
    /**
     * 获取 部件类型  
     * @return
     */
    @JsonIgnore
    public String getPVPartType(){
        Object objValue = this.get(FIELD_PVPARTTYPE);
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
    public boolean isPVPartTypeDirty(){
        if(this.contains(FIELD_PVPARTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件类型
     */
    @JsonIgnore
    public void resetPVPartType(){
        this.reset(FIELD_PVPARTTYPE);
    }

    /**
     * 设置 部件类型，详细说明：{@link #FIELD_PVPARTTYPE}
     * <P>
     * 等同 {@link #setPVPartType}
     * @param pVPartType
     */
    @JsonIgnore
    public PSAppPVPart pvparttype(String pVPartType){
        this.setPVPartType(pVPartType);
        return this;
    }

     /**
     * 设置 部件类型，详细说明：{@link #FIELD_PVPARTTYPE}
     * <P>
     * 等同 {@link #setPVPartType}
     * @param pVPartType
     */
    @JsonIgnore
    public PSAppPVPart pvparttype(net.ibizsys.psmodel.core.util.PSModelEnums.AppDashboardPartType pVPartType){
        if(pVPartType == null){
            this.setPVPartType(null);
        }
        else{
            this.setPVPartType(pVPartType.value);
        }
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
    public PSAppPVPart rawcontent(String rawContent){
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
    public PSAppPVPart rawcssstyle(String rawCssStyle){
        this.setRawCssStyle(rawCssStyle);
        return this;
    }

    /**
     * <B>SHOWTITLEBAR</B>&nbsp;显示标题栏，指定数据看板成员是否输出标题栏，未定义时门户部件项使用引用门户部件配置，其它为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWTITLEBAR = "showtitlebar";

    /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWTITLEBAR}
     * 
     * @param showTitleBar
     * 
     */
    @JsonProperty(FIELD_SHOWTITLEBAR)
    public void setShowTitleBar(Integer showTitleBar){
        this.set(FIELD_SHOWTITLEBAR, showTitleBar);
    }
    
    /**
     * 获取 显示标题栏  
     * @return
     */
    @JsonIgnore
    public Integer getShowTitleBar(){
        Object objValue = this.get(FIELD_SHOWTITLEBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowTitleBarDirty(){
        if(this.contains(FIELD_SHOWTITLEBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题栏
     */
    @JsonIgnore
    public void resetShowTitleBar(){
        this.reset(FIELD_SHOWTITLEBAR);
    }

    /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWTITLEBAR}
     * <P>
     * 等同 {@link #setShowTitleBar}
     * @param showTitleBar
     */
    @JsonIgnore
    public PSAppPVPart showtitlebar(Integer showTitleBar){
        this.setShowTitleBar(showTitleBar);
        return this;
    }

     /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWTITLEBAR}
     * <P>
     * 等同 {@link #setShowTitleBar}
     * @param showTitleBar
     */
    @JsonIgnore
    public PSAppPVPart showtitlebar(Boolean showTitleBar){
        if(showTitleBar == null){
            this.setShowTitleBar(null);
        }
        else{
            this.setShowTitleBar(showTitleBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSAppPVPart swapmode(String swapMode){
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
    public PSAppPVPart templatemode(Integer templateMode){
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
    public PSAppPVPart templatemode(Boolean templateMode){
        if(templateMode == null){
            this.setTemplateMode(null);
        }
        else{
            this.setTemplateMode(templateMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;标题，指定数据看板成员的标题，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 标题，详细说明：{@link #FIELD_TITLE}
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getTitle(){
        Object objValue = this.get(FIELD_TITLE);
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
    public boolean isTitleDirty(){
        if(this.contains(FIELD_TITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_TITLE}
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSAppPVPart title(String title){
        this.setTitle(title);
        return this;
    }

    /**
     * <B>TITLEBARCLOSEMODE</B>&nbsp;标题栏关闭模式，指定数据看板容器分组标题栏关闭模式，未定义时为【无关闭】
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
    public PSAppPVPart titlebarclosemode(Integer titleBarCloseMode){
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
    public PSAppPVPart titlebarclosemode(net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode titleBarCloseMode){
        if(titleBarCloseMode == null){
            this.setTitleBarCloseMode(null);
        }
        else{
            this.setTitleBarCloseMode(titleBarCloseMode.value);
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESID</B>&nbsp;标题语言资源，指定数据看板成员的标题的多语言资源对象，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TITLEPSLANRESID = "titlepslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * 
     * @param titlePSLanResId
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESID)
    public void setTitlePSLanResId(String titlePSLanResId){
        this.set(FIELD_TITLEPSLANRESID, titlePSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResId(){
        Object objValue = this.get(FIELD_TITLEPSLANRESID);
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
    public boolean isTitlePSLanResIdDirty(){
        if(this.contains(FIELD_TITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResId(){
        this.reset(FIELD_TITLEPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param titlePSLanResId
     */
    @JsonIgnore
    public PSAppPVPart titlepslanresid(String titlePSLanResId){
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppPVPart titlepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        }
        else{
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESNAME</B>&nbsp;标题语言资源，指定数据看板成员的标题的多语言资源对象，未定义时门户部件项使用引用门户部件配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSLANRESID}
     */
    public final static String FIELD_TITLEPSLANRESNAME = "titlepslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * 
     * @param titlePSLanResName
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESNAME)
    public void setTitlePSLanResName(String titlePSLanResName){
        this.set(FIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResName(){
        Object objValue = this.get(FIELD_TITLEPSLANRESNAME);
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
    public boolean isTitlePSLanResNameDirty(){
        if(this.contains(FIELD_TITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResName(){
        this.reset(FIELD_TITLEPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setTitlePSLanResName}
     * @param titlePSLanResName
     */
    @JsonIgnore
    public PSAppPVPart titlepslanresname(String titlePSLanResName){
        this.setTitlePSLanResName(titlePSLanResName);
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
    public PSAppPVPart tooltipinfo(String tooltipInfo){
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
    public PSAppPVPart updatedate(String updateDate){
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
    public PSAppPVPart updateman(String updateMan){
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
    public PSAppPVPart usertag(String userTag){
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
    public PSAppPVPart usertag2(String userTag2){
        this.setUserTag2(userTag2);
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
    public PSAppPVPart validflag(Integer validFlag){
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
    public PSAppPVPart validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSAppPVPart valignself(String vAlignSelf){
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
    public PSAppPVPart valignself(net.ibizsys.psmodel.core.util.PSModelEnums.TextVAlign vAlignSelf){
        if(vAlignSelf == null){
            this.setVAlignSelf(null);
        }
        else{
            this.setVAlignSelf(vAlignSelf.value);
        }
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定数据看板成员的宽度，0为自动，未定义时为【0】
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
    public PSAppPVPart width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppPVPartId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppPVPartId(strValue);
    }

    @JsonIgnore
    public PSAppPVPart id(String strValue){
        this.setPSAppPVPartId(strValue);
        return this;
    }


    /**
     *  应用门户视图部件 成员集合
     */
    public final static String FIELD_PSAPPPVPARTS = "psapppvparts";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> psapppvparts;

    /**
     * 获取 应用门户视图部件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSAPPPVPARTS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> getPSAppPVParts(){
        return this.psapppvparts;
    }

    /**
     * 设置 应用门户视图部件 成员集合  
     * @param psapppvparts
     */
    @JsonProperty(FIELD_PSAPPPVPARTS)
    public void setPSAppPVParts(java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> psapppvparts){
        this.psapppvparts = psapppvparts;
    }

    /**
     * 获取 应用门户视图部件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> getPSAppPVPartsIf(){
        if(this.psapppvparts == null){
            this.psapppvparts = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSAppPVPart>();          
        }
        return this.psapppvparts;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppPVPart){
            PSAppPVPart model = (PSAppPVPart)iPSModel;
            model.setPSAppPVParts(this.getPSAppPVParts());
        }
        super.copyTo(iPSModel);
    }
}
