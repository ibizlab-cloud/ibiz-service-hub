package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATAVIEW</B>实体卡片视图部件 模型传输对象
 * <P>
 * 实体卡片视图部件模型，定义容器、卡片及分组项的界面逻辑及数据项等处理逻辑，一般需要指定卡片的布局面板。卡片视图支持启用看板（KanBan）模式，配置卡片在分组间移动的逻辑
 */
public class PSDEDataView extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDataView(){
    }      

    /**
     * <B>APPENDDEITEMS</B>&nbsp;附加实体默认数据项，指定卡片视图部件是否自动附加实体默认数据项，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPENDDEITEMS = "appenddeitems";

    /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * 
     * @param appendDEItems
     * 
     */
    @JsonProperty(FIELD_APPENDDEITEMS)
    public void setAppendDEItems(Integer appendDEItems){
        this.set(FIELD_APPENDDEITEMS, appendDEItems);
    }
    
    /**
     * 获取 附加实体默认数据项  
     * @return
     */
    @JsonIgnore
    public Integer getAppendDEItems(){
        Object objValue = this.get(FIELD_APPENDDEITEMS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加实体默认数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppendDEItemsDirty(){
        if(this.contains(FIELD_APPENDDEITEMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加实体默认数据项
     */
    @JsonIgnore
    public void resetAppendDEItems(){
        this.reset(FIELD_APPENDDEITEMS);
    }

    /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * <P>
     * 等同 {@link #setAppendDEItems}
     * @param appendDEItems
     */
    @JsonIgnore
    public PSDEDataView appenddeitems(Integer appendDEItems){
        this.setAppendDEItems(appendDEItems);
        return this;
    }

     /**
     * 设置 附加实体默认数据项，详细说明：{@link #FIELD_APPENDDEITEMS}
     * <P>
     * 等同 {@link #setAppendDEItems}
     * @param appendDEItems
     */
    @JsonIgnore
    public PSDEDataView appenddeitems(Boolean appendDEItems){
        if(appendDEItems == null){
            this.setAppendDEItems(null);
        }
        else{
            this.setAppendDEItems(appendDEItems?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ASYNCPSDEDSID</B>&nbsp;异步实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_ASYNCPSDEDSID = "asyncpsdedsid";

    /**
     * 设置 异步实体数据集
     * 
     * @param asyncPSDEDSId
     * 
     */
    @JsonProperty(FIELD_ASYNCPSDEDSID)
    public void setAsyncPSDEDSId(String asyncPSDEDSId){
        this.set(FIELD_ASYNCPSDEDSID, asyncPSDEDSId);
    }
    
    /**
     * 获取 异步实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAsyncPSDEDSId(){
        Object objValue = this.get(FIELD_ASYNCPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异步实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncPSDEDSIdDirty(){
        if(this.contains(FIELD_ASYNCPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步实体数据集
     */
    @JsonIgnore
    public void resetAsyncPSDEDSId(){
        this.reset(FIELD_ASYNCPSDEDSID);
    }

    /**
     * 设置 异步实体数据集
     * <P>
     * 等同 {@link #setAsyncPSDEDSId}
     * @param asyncPSDEDSId
     */
    @JsonIgnore
    public PSDEDataView asyncpsdedsid(String asyncPSDEDSId){
        this.setAsyncPSDEDSId(asyncPSDEDSId);
        return this;
    }

    /**
     * 设置 异步实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAsyncPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDataView asyncpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setAsyncPSDEDSId(null);
            this.setAsyncPSDEDSName(null);
        }
        else{
            this.setAsyncPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setAsyncPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>ASYNCPSDEDSNAME</B>&nbsp;异步实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ASYNCPSDEDSID}
     */
    public final static String FIELD_ASYNCPSDEDSNAME = "asyncpsdedsname";

    /**
     * 设置 异步实体数据集
     * 
     * @param asyncPSDEDSName
     * 
     */
    @JsonProperty(FIELD_ASYNCPSDEDSNAME)
    public void setAsyncPSDEDSName(String asyncPSDEDSName){
        this.set(FIELD_ASYNCPSDEDSNAME, asyncPSDEDSName);
    }
    
    /**
     * 获取 异步实体数据集  
     * @return
     */
    @JsonIgnore
    public String getAsyncPSDEDSName(){
        Object objValue = this.get(FIELD_ASYNCPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异步实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAsyncPSDEDSNameDirty(){
        if(this.contains(FIELD_ASYNCPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异步实体数据集
     */
    @JsonIgnore
    public void resetAsyncPSDEDSName(){
        this.reset(FIELD_ASYNCPSDEDSNAME);
    }

    /**
     * 设置 异步实体数据集
     * <P>
     * 等同 {@link #setAsyncPSDEDSName}
     * @param asyncPSDEDSName
     */
    @JsonIgnore
    public PSDEDataView asyncpsdedsname(String asyncPSDEDSName){
        this.setAsyncPSDEDSName(asyncPSDEDSName);
        return this;
    }

    /**
     * <B>BATPSDETOOLBARID</B>&nbsp;批操作工具栏，指定卡片视图部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_BATPSDETOOLBARID = "batpsdetoolbarid";

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARID}
     * 
     * @param batPSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_BATPSDETOOLBARID)
    public void setBatPSDEToolbarId(String batPSDEToolbarId){
        this.set(FIELD_BATPSDETOOLBARID, batPSDEToolbarId);
    }
    
    /**
     * 获取 批操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getBatPSDEToolbarId(){
        Object objValue = this.get(FIELD_BATPSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 批操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatPSDEToolbarIdDirty(){
        if(this.contains(FIELD_BATPSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作工具栏
     */
    @JsonIgnore
    public void resetBatPSDEToolbarId(){
        this.reset(FIELD_BATPSDETOOLBARID);
    }

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARID}
     * <P>
     * 等同 {@link #setBatPSDEToolbarId}
     * @param batPSDEToolbarId
     */
    @JsonIgnore
    public PSDEDataView batpsdetoolbarid(String batPSDEToolbarId){
        this.setBatPSDEToolbarId(batPSDEToolbarId);
        return this;
    }

    /**
     * 设置 批操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBatPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDEDataView batpsdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setBatPSDEToolbarId(null);
            this.setBatPSDEToolbarName(null);
        }
        else{
            this.setBatPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setBatPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>BATPSDETOOLBARNAME</B>&nbsp;批操作工具栏，指定卡片视图部件内建的批操作工具栏对象，批操作工具栏为选择数据提供操作能力
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BATPSDETOOLBARID}
     */
    public final static String FIELD_BATPSDETOOLBARNAME = "batpsdetoolbarname";

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARNAME}
     * 
     * @param batPSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_BATPSDETOOLBARNAME)
    public void setBatPSDEToolbarName(String batPSDEToolbarName){
        this.set(FIELD_BATPSDETOOLBARNAME, batPSDEToolbarName);
    }
    
    /**
     * 获取 批操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getBatPSDEToolbarName(){
        Object objValue = this.get(FIELD_BATPSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 批操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBatPSDEToolbarNameDirty(){
        if(this.contains(FIELD_BATPSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 批操作工具栏
     */
    @JsonIgnore
    public void resetBatPSDEToolbarName(){
        this.reset(FIELD_BATPSDETOOLBARNAME);
    }

    /**
     * 设置 批操作工具栏，详细说明：{@link #FIELD_BATPSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setBatPSDEToolbarName}
     * @param batPSDEToolbarName
     */
    @JsonIgnore
    public PSDEDataView batpsdetoolbarname(String batPSDEToolbarName){
        this.setBatPSDEToolbarName(batPSDEToolbarName);
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
    public PSDEDataView busyindicator(Integer busyIndicator){
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
    public PSDEDataView busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CARDHEIGHT</B>&nbsp;卡片高度，获取卡片项的高度，0为自动。未定义时为【0】
     */
    public final static String FIELD_CARDHEIGHT = "cardheight";

    /**
     * 设置 卡片高度，详细说明：{@link #FIELD_CARDHEIGHT}
     * 
     * @param cardHeight
     * 
     */
    @JsonProperty(FIELD_CARDHEIGHT)
    public void setCardHeight(Integer cardHeight){
        this.set(FIELD_CARDHEIGHT, cardHeight);
    }
    
    /**
     * 获取 卡片高度  
     * @return
     */
    @JsonIgnore
    public Integer getCardHeight(){
        Object objValue = this.get(FIELD_CARDHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 卡片高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCardHeightDirty(){
        if(this.contains(FIELD_CARDHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片高度
     */
    @JsonIgnore
    public void resetCardHeight(){
        this.reset(FIELD_CARDHEIGHT);
    }

    /**
     * 设置 卡片高度，详细说明：{@link #FIELD_CARDHEIGHT}
     * <P>
     * 等同 {@link #setCardHeight}
     * @param cardHeight
     */
    @JsonIgnore
    public PSDEDataView cardheight(Integer cardHeight){
        this.setCardHeight(cardHeight);
        return this;
    }

    /**
     * <B>CARDWIDTH</B>&nbsp;卡片宽度，获取卡片项的宽度，0为自动。未定义时为【0】
     */
    public final static String FIELD_CARDWIDTH = "cardwidth";

    /**
     * 设置 卡片宽度，详细说明：{@link #FIELD_CARDWIDTH}
     * 
     * @param cardWidth
     * 
     */
    @JsonProperty(FIELD_CARDWIDTH)
    public void setCardWidth(Integer cardWidth){
        this.set(FIELD_CARDWIDTH, cardWidth);
    }
    
    /**
     * 获取 卡片宽度  
     * @return
     */
    @JsonIgnore
    public Integer getCardWidth(){
        Object objValue = this.get(FIELD_CARDWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 卡片宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCardWidthDirty(){
        if(this.contains(FIELD_CARDWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片宽度
     */
    @JsonIgnore
    public void resetCardWidth(){
        this.reset(FIELD_CARDWIDTH);
    }

    /**
     * 设置 卡片宽度，详细说明：{@link #FIELD_CARDWIDTH}
     * <P>
     * 等同 {@link #setCardWidth}
     * @param cardWidth
     */
    @JsonIgnore
    public PSDEDataView cardwidth(Integer cardWidth){
        this.setCardWidth(cardWidth);
        return this;
    }

    /**
     * <B>CARD_COL_LG</B>&nbsp;卡片大型列宽，获取卡片项在【栅格布局】模式下的大型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CARD_COL_LG = "card_col_lg";

    /**
     * 设置 卡片大型列宽，详细说明：{@link #FIELD_CARD_COL_LG}
     * 
     * @param card_Col_LG
     * 
     */
    @JsonProperty(FIELD_CARD_COL_LG)
    public void setCard_Col_LG(Integer card_Col_LG){
        this.set(FIELD_CARD_COL_LG, card_Col_LG);
    }
    
    /**
     * 获取 卡片大型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCard_Col_LG(){
        Object objValue = this.get(FIELD_CARD_COL_LG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 卡片大型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCard_Col_LGDirty(){
        if(this.contains(FIELD_CARD_COL_LG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片大型列宽
     */
    @JsonIgnore
    public void resetCard_Col_LG(){
        this.reset(FIELD_CARD_COL_LG);
    }

    /**
     * 设置 卡片大型列宽，详细说明：{@link #FIELD_CARD_COL_LG}
     * <P>
     * 等同 {@link #setCard_Col_LG}
     * @param card_Col_LG
     */
    @JsonIgnore
    public PSDEDataView card_col_lg(Integer card_Col_LG){
        this.setCard_Col_LG(card_Col_LG);
        return this;
    }

    /**
     * <B>CARD_COL_MD</B>&nbsp;卡片中型列宽，获取卡片项在【栅格布局】模式下在中型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CARD_COL_MD = "card_col_md";

    /**
     * 设置 卡片中型列宽，详细说明：{@link #FIELD_CARD_COL_MD}
     * 
     * @param card_Col_MD
     * 
     */
    @JsonProperty(FIELD_CARD_COL_MD)
    public void setCard_Col_MD(Integer card_Col_MD){
        this.set(FIELD_CARD_COL_MD, card_Col_MD);
    }
    
    /**
     * 获取 卡片中型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCard_Col_MD(){
        Object objValue = this.get(FIELD_CARD_COL_MD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 卡片中型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCard_Col_MDDirty(){
        if(this.contains(FIELD_CARD_COL_MD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片中型列宽
     */
    @JsonIgnore
    public void resetCard_Col_MD(){
        this.reset(FIELD_CARD_COL_MD);
    }

    /**
     * 设置 卡片中型列宽，详细说明：{@link #FIELD_CARD_COL_MD}
     * <P>
     * 等同 {@link #setCard_Col_MD}
     * @param card_Col_MD
     */
    @JsonIgnore
    public PSDEDataView card_col_md(Integer card_Col_MD){
        this.setCard_Col_MD(card_Col_MD);
        return this;
    }

    /**
     * <B>CARD_COL_SM</B>&nbsp;卡片小型列宽，获取卡片项在【栅格布局】模式下卡片在小型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CARD_COL_SM = "card_col_sm";

    /**
     * 设置 卡片小型列宽，详细说明：{@link #FIELD_CARD_COL_SM}
     * 
     * @param card_Col_SM
     * 
     */
    @JsonProperty(FIELD_CARD_COL_SM)
    public void setCard_Col_SM(Integer card_Col_SM){
        this.set(FIELD_CARD_COL_SM, card_Col_SM);
    }
    
    /**
     * 获取 卡片小型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCard_Col_SM(){
        Object objValue = this.get(FIELD_CARD_COL_SM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 卡片小型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCard_Col_SMDirty(){
        if(this.contains(FIELD_CARD_COL_SM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片小型列宽
     */
    @JsonIgnore
    public void resetCard_Col_SM(){
        this.reset(FIELD_CARD_COL_SM);
    }

    /**
     * 设置 卡片小型列宽，详细说明：{@link #FIELD_CARD_COL_SM}
     * <P>
     * 等同 {@link #setCard_Col_SM}
     * @param card_Col_SM
     */
    @JsonIgnore
    public PSDEDataView card_col_sm(Integer card_Col_SM){
        this.setCard_Col_SM(card_Col_SM);
        return this;
    }

    /**
     * <B>CARD_COL_XS</B>&nbsp;卡片超小列宽，获取卡片项在【栅格布局】模式下卡片在超小型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_CARD_COL_XS = "card_col_xs";

    /**
     * 设置 卡片超小列宽，详细说明：{@link #FIELD_CARD_COL_XS}
     * 
     * @param card_Col_XS
     * 
     */
    @JsonProperty(FIELD_CARD_COL_XS)
    public void setCard_Col_XS(Integer card_Col_XS){
        this.set(FIELD_CARD_COL_XS, card_Col_XS);
    }
    
    /**
     * 获取 卡片超小列宽  
     * @return
     */
    @JsonIgnore
    public Integer getCard_Col_XS(){
        Object objValue = this.get(FIELD_CARD_COL_XS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 卡片超小列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCard_Col_XSDirty(){
        if(this.contains(FIELD_CARD_COL_XS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片超小列宽
     */
    @JsonIgnore
    public void resetCard_Col_XS(){
        this.reset(FIELD_CARD_COL_XS);
    }

    /**
     * 设置 卡片超小列宽，详细说明：{@link #FIELD_CARD_COL_XS}
     * <P>
     * 等同 {@link #setCard_Col_XS}
     * @param card_Col_XS
     */
    @JsonIgnore
    public PSDEDataView card_col_xs(Integer card_Col_XS){
        this.setCard_Col_XS(card_Col_XS);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定卡片视图的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEDataView codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COPYPSDEACTIONID</B>&nbsp;复制数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_COPYPSDEACTIONID = "copypsdeactionid";

    /**
     * 设置 复制数据实体行为
     * 
     * @param copyPSDEActionId
     * 
     */
    @JsonProperty(FIELD_COPYPSDEACTIONID)
    public void setCopyPSDEActionId(String copyPSDEActionId){
        this.set(FIELD_COPYPSDEACTIONID, copyPSDEActionId);
    }
    
    /**
     * 获取 复制数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCopyPSDEActionId(){
        Object objValue = this.get(FIELD_COPYPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 复制数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCopyPSDEActionIdDirty(){
        if(this.contains(FIELD_COPYPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 复制数据实体行为
     */
    @JsonIgnore
    public void resetCopyPSDEActionId(){
        this.reset(FIELD_COPYPSDEACTIONID);
    }

    /**
     * 设置 复制数据实体行为
     * <P>
     * 等同 {@link #setCopyPSDEActionId}
     * @param copyPSDEActionId
     */
    @JsonIgnore
    public PSDEDataView copypsdeactionid(String copyPSDEActionId){
        this.setCopyPSDEActionId(copyPSDEActionId);
        return this;
    }

    /**
     * 设置 复制数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCopyPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView copypsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setCopyPSDEActionId(null);
            this.setCopyPSDEActionName(null);
        }
        else{
            this.setCopyPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCopyPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>COPYPSDEACTIONNAME</B>&nbsp;复制数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_COPYPSDEACTIONID}
     */
    public final static String FIELD_COPYPSDEACTIONNAME = "copypsdeactionname";

    /**
     * 设置 复制数据实体行为
     * 
     * @param copyPSDEActionName
     * 
     */
    @JsonProperty(FIELD_COPYPSDEACTIONNAME)
    public void setCopyPSDEActionName(String copyPSDEActionName){
        this.set(FIELD_COPYPSDEACTIONNAME, copyPSDEActionName);
    }
    
    /**
     * 获取 复制数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCopyPSDEActionName(){
        Object objValue = this.get(FIELD_COPYPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 复制数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCopyPSDEActionNameDirty(){
        if(this.contains(FIELD_COPYPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 复制数据实体行为
     */
    @JsonIgnore
    public void resetCopyPSDEActionName(){
        this.reset(FIELD_COPYPSDEACTIONNAME);
    }

    /**
     * 设置 复制数据实体行为
     * <P>
     * 等同 {@link #setCopyPSDEActionName}
     * @param copyPSDEActionName
     */
    @JsonIgnore
    public PSDEDataView copypsdeactionname(String copyPSDEActionName){
        this.setCopyPSDEActionName(copyPSDEActionName);
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
    public PSDEDataView createdate(String createDate){
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
    public PSDEDataView createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONID</B>&nbsp;建立数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_CREATEPSDEACTIONID = "createpsdeactionid";

    /**
     * 设置 建立数据实体行为
     * 
     * @param createPSDEActionId
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONID)
    public void setCreatePSDEActionId(String createPSDEActionId){
        this.set(FIELD_CREATEPSDEACTIONID, createPSDEActionId);
    }
    
    /**
     * 获取 建立数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionId(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionIdDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立数据实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionId(){
        this.reset(FIELD_CREATEPSDEACTIONID);
    }

    /**
     * 设置 建立数据实体行为
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param createPSDEActionId
     */
    @JsonIgnore
    public PSDEDataView createpsdeactionid(String createPSDEActionId){
        this.setCreatePSDEActionId(createPSDEActionId);
        return this;
    }

    /**
     * 设置 建立数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCreatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView createpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setCreatePSDEActionId(null);
            this.setCreatePSDEActionName(null);
        }
        else{
            this.setCreatePSDEActionId(pSDEAction.getPSDEActionId());
            this.setCreatePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>CREATEPSDEACTIONNAME</B>&nbsp;建立数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CREATEPSDEACTIONID}
     */
    public final static String FIELD_CREATEPSDEACTIONNAME = "createpsdeactionname";

    /**
     * 设置 建立数据实体行为
     * 
     * @param createPSDEActionName
     * 
     */
    @JsonProperty(FIELD_CREATEPSDEACTIONNAME)
    public void setCreatePSDEActionName(String createPSDEActionName){
        this.set(FIELD_CREATEPSDEACTIONNAME, createPSDEActionName);
    }
    
    /**
     * 获取 建立数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getCreatePSDEActionName(){
        Object objValue = this.get(FIELD_CREATEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatePSDEActionNameDirty(){
        if(this.contains(FIELD_CREATEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立数据实体行为
     */
    @JsonIgnore
    public void resetCreatePSDEActionName(){
        this.reset(FIELD_CREATEPSDEACTIONNAME);
    }

    /**
     * 设置 建立数据实体行为
     * <P>
     * 等同 {@link #setCreatePSDEActionName}
     * @param createPSDEActionName
     */
    @JsonIgnore
    public PSDEDataView createpsdeactionname(String createPSDEActionName){
        this.setCreatePSDEActionName(createPSDEActionName);
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
    public PSDEDataView customcond(String customCond){
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
    public PSDEDataView customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>DATAVIEWSN</B>&nbsp;卡片视图编号，指定卡片视图的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DATAVIEWSN = "dataviewsn";

    /**
     * 设置 卡片视图编号，详细说明：{@link #FIELD_DATAVIEWSN}
     * 
     * @param dataViewSN
     * 
     */
    @JsonProperty(FIELD_DATAVIEWSN)
    public void setDataViewSN(String dataViewSN){
        this.set(FIELD_DATAVIEWSN, dataViewSN);
    }
    
    /**
     * 获取 卡片视图编号  
     * @return
     */
    @JsonIgnore
    public String getDataViewSN(){
        Object objValue = this.get(FIELD_DATAVIEWSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片视图编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataViewSNDirty(){
        if(this.contains(FIELD_DATAVIEWSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片视图编号
     */
    @JsonIgnore
    public void resetDataViewSN(){
        this.reset(FIELD_DATAVIEWSN);
    }

    /**
     * 设置 卡片视图编号，详细说明：{@link #FIELD_DATAVIEWSN}
     * <P>
     * 等同 {@link #setDataViewSN}
     * @param dataViewSN
     */
    @JsonIgnore
    public PSDEDataView dataviewsn(String dataViewSN){
        this.setDataViewSN(dataViewSN);
        return this;
    }

    /**
     * <B>DATAVIEWSTYLE</B>&nbsp;卡片视图样式，指定卡片视图的样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataViewStyle} 
     */
    public final static String FIELD_DATAVIEWSTYLE = "dataviewstyle";

    /**
     * 设置 卡片视图样式，详细说明：{@link #FIELD_DATAVIEWSTYLE}
     * 
     * @param dataViewStyle
     * 
     */
    @JsonProperty(FIELD_DATAVIEWSTYLE)
    public void setDataViewStyle(String dataViewStyle){
        this.set(FIELD_DATAVIEWSTYLE, dataViewStyle);
    }
    
    /**
     * 获取 卡片视图样式  
     * @return
     */
    @JsonIgnore
    public String getDataViewStyle(){
        Object objValue = this.get(FIELD_DATAVIEWSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataViewStyleDirty(){
        if(this.contains(FIELD_DATAVIEWSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片视图样式
     */
    @JsonIgnore
    public void resetDataViewStyle(){
        this.reset(FIELD_DATAVIEWSTYLE);
    }

    /**
     * 设置 卡片视图样式，详细说明：{@link #FIELD_DATAVIEWSTYLE}
     * <P>
     * 等同 {@link #setDataViewStyle}
     * @param dataViewStyle
     */
    @JsonIgnore
    public PSDEDataView dataviewstyle(String dataViewStyle){
        this.setDataViewStyle(dataViewStyle);
        return this;
    }

     /**
     * 设置 卡片视图样式，详细说明：{@link #FIELD_DATAVIEWSTYLE}
     * <P>
     * 等同 {@link #setDataViewStyle}
     * @param dataViewStyle
     */
    @JsonIgnore
    public PSDEDataView dataviewstyle(net.ibizsys.psmodel.core.util.PSModelEnums.DataViewStyle dataViewStyle){
        if(dataViewStyle == null){
            this.setDataViewStyle(null);
        }
        else{
            this.setDataViewStyle(dataViewStyle.value);
        }
        return this;
    }

    /**
     * <B>DVTAG</B>&nbsp;卡片视图标记，指定卡片视图的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DVTAG = "dvtag";

    /**
     * 设置 卡片视图标记，详细说明：{@link #FIELD_DVTAG}
     * 
     * @param dVTag
     * 
     */
    @JsonProperty(FIELD_DVTAG)
    public void setDVTag(String dVTag){
        this.set(FIELD_DVTAG, dVTag);
    }
    
    /**
     * 获取 卡片视图标记  
     * @return
     */
    @JsonIgnore
    public String getDVTag(){
        Object objValue = this.get(FIELD_DVTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片视图标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDVTagDirty(){
        if(this.contains(FIELD_DVTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片视图标记
     */
    @JsonIgnore
    public void resetDVTag(){
        this.reset(FIELD_DVTAG);
    }

    /**
     * 设置 卡片视图标记，详细说明：{@link #FIELD_DVTAG}
     * <P>
     * 等同 {@link #setDVTag}
     * @param dVTag
     */
    @JsonIgnore
    public PSDEDataView dvtag(String dVTag){
        this.setDVTag(dVTag);
        return this;
    }

    /**
     * <B>DVTAG2</B>&nbsp;卡片视图标记2，指定卡片视图的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DVTAG2 = "dvtag2";

    /**
     * 设置 卡片视图标记2，详细说明：{@link #FIELD_DVTAG2}
     * 
     * @param dVTag2
     * 
     */
    @JsonProperty(FIELD_DVTAG2)
    public void setDVTag2(String dVTag2){
        this.set(FIELD_DVTAG2, dVTag2);
    }
    
    /**
     * 获取 卡片视图标记2  
     * @return
     */
    @JsonIgnore
    public String getDVTag2(){
        Object objValue = this.get(FIELD_DVTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片视图标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDVTag2Dirty(){
        if(this.contains(FIELD_DVTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片视图标记2
     */
    @JsonIgnore
    public void resetDVTag2(){
        this.reset(FIELD_DVTAG2);
    }

    /**
     * 设置 卡片视图标记2，详细说明：{@link #FIELD_DVTAG2}
     * <P>
     * 等同 {@link #setDVTag2}
     * @param dVTag2
     */
    @JsonIgnore
    public PSDEDataView dvtag2(String dVTag2){
        this.setDVTag2(dVTag2);
        return this;
    }

    /**
     * <B>DVTAG3</B>&nbsp;卡片视图标记3，指定卡片视图的标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DVTAG3 = "dvtag3";

    /**
     * 设置 卡片视图标记3，详细说明：{@link #FIELD_DVTAG3}
     * 
     * @param dVTag3
     * 
     */
    @JsonProperty(FIELD_DVTAG3)
    public void setDVTag3(String dVTag3){
        this.set(FIELD_DVTAG3, dVTag3);
    }
    
    /**
     * 获取 卡片视图标记3  
     * @return
     */
    @JsonIgnore
    public String getDVTag3(){
        Object objValue = this.get(FIELD_DVTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片视图标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDVTag3Dirty(){
        if(this.contains(FIELD_DVTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片视图标记3
     */
    @JsonIgnore
    public void resetDVTag3(){
        this.reset(FIELD_DVTAG3);
    }

    /**
     * 设置 卡片视图标记3，详细说明：{@link #FIELD_DVTAG3}
     * <P>
     * 等同 {@link #setDVTag3}
     * @param dVTag3
     */
    @JsonIgnore
    public PSDEDataView dvtag3(String dVTag3){
        this.setDVTag3(dVTag3);
        return this;
    }

    /**
     * <B>DVTAG4</B>&nbsp;卡片视图标记4，指定卡片视图的标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DVTAG4 = "dvtag4";

    /**
     * 设置 卡片视图标记4，详细说明：{@link #FIELD_DVTAG4}
     * 
     * @param dVTag4
     * 
     */
    @JsonProperty(FIELD_DVTAG4)
    public void setDVTag4(String dVTag4){
        this.set(FIELD_DVTAG4, dVTag4);
    }
    
    /**
     * 获取 卡片视图标记4  
     * @return
     */
    @JsonIgnore
    public String getDVTag4(){
        Object objValue = this.get(FIELD_DVTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片视图标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDVTag4Dirty(){
        if(this.contains(FIELD_DVTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片视图标记4
     */
    @JsonIgnore
    public void resetDVTag4(){
        this.reset(FIELD_DVTAG4);
    }

    /**
     * 设置 卡片视图标记4，详细说明：{@link #FIELD_DVTAG4}
     * <P>
     * 等同 {@link #setDVTag4}
     * @param dVTag4
     */
    @JsonIgnore
    public PSDEDataView dvtag4(String dVTag4){
        this.setDVTag4(dVTag4);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定卡片视图部件的无值显示内容，未定义时使用前端应用配置
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
    public PSDEDataView emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定卡片视图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSDEDataView emptytextpslanresid(String emptyTextPSLanResId){
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
    public PSDEDataView emptytextpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定卡片视图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
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
    public PSDEDataView emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLEEDIT</B>&nbsp;即时编辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlEditMode} 
     */
    public final static String FIELD_ENABLEEDIT = "enableedit";

    /**
     * 设置 即时编辑模式
     * 
     * @param enableEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEEDIT)
    public void setEnableEdit(Integer enableEdit){
        this.set(FIELD_ENABLEEDIT, enableEdit);
    }
    
    /**
     * 获取 即时编辑模式  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEdit(){
        Object objValue = this.get(FIELD_ENABLEEDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 即时编辑模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEditDirty(){
        if(this.contains(FIELD_ENABLEEDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 即时编辑模式
     */
    @JsonIgnore
    public void resetEnableEdit(){
        this.reset(FIELD_ENABLEEDIT);
    }

    /**
     * 设置 即时编辑模式
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEDataView enableedit(Integer enableEdit){
        this.setEnableEdit(enableEdit);
        return this;
    }

     /**
     * 设置 即时编辑模式
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDEDataView enableedit(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlEditMode[] enableEdit){
        if(enableEdit == null || enableEdit.length == 0){
            this.setEnableEdit(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlEditMode _item : enableEdit){
                _value |= _item.value;
            }
            this.setEnableEdit(_value);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用项权限控制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用项权限控制
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用项权限控制  
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
     * 判断 启用项权限控制 是否指定值，包括空值
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
     * 重置 启用项权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEDataView enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEDataView enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPAGINGBAR</B>&nbsp;启用分页，指定卡片视图是否支持分页工具栏，未定义时为【否】
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
    public PSDEDataView enablepagingbar(Integer enablePagingBar){
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
    public PSDEDataView enablepagingbar(net.ibizsys.psmodel.core.util.PSModelEnums.PagingMode enablePagingBar){
        if(enablePagingBar == null){
            this.setEnablePagingBar(null);
        }
        else{
            this.setEnablePagingBar(enablePagingBar.value);
        }
        return this;
    }

    /**
     * <B>GETDRAFTPSDEACTIONID</B>&nbsp;获取草稿数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GETDRAFTPSDEACTIONID = "getdraftpsdeactionid";

    /**
     * 设置 获取草稿数据实体行为
     * 
     * @param getDraftPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONID)
    public void setGetDraftPSDEActionId(String getDraftPSDEActionId){
        this.set(FIELD_GETDRAFTPSDEACTIONID, getDraftPSDEActionId);
    }
    
    /**
     * 获取 获取草稿数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDraftPSDEActionId(){
        Object objValue = this.get(FIELD_GETDRAFTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取草稿数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDraftPSDEActionIdDirty(){
        if(this.contains(FIELD_GETDRAFTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取草稿数据实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionId(){
        this.reset(FIELD_GETDRAFTPSDEACTIONID);
    }

    /**
     * 设置 获取草稿数据实体行为
     * <P>
     * 等同 {@link #setGetDraftPSDEActionId}
     * @param getDraftPSDEActionId
     */
    @JsonIgnore
    public PSDEDataView getdraftpsdeactionid(String getDraftPSDEActionId){
        this.setGetDraftPSDEActionId(getDraftPSDEActionId);
        return this;
    }

    /**
     * 设置 获取草稿数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetDraftPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView getdraftpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGetDraftPSDEActionId(null);
            this.setGetDraftPSDEActionName(null);
        }
        else{
            this.setGetDraftPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetDraftPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETDRAFTPSDEACTIONNAME</B>&nbsp;获取草稿数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETDRAFTPSDEACTIONID}
     */
    public final static String FIELD_GETDRAFTPSDEACTIONNAME = "getdraftpsdeactionname";

    /**
     * 设置 获取草稿数据实体行为
     * 
     * @param getDraftPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETDRAFTPSDEACTIONNAME)
    public void setGetDraftPSDEActionName(String getDraftPSDEActionName){
        this.set(FIELD_GETDRAFTPSDEACTIONNAME, getDraftPSDEActionName);
    }
    
    /**
     * 获取 获取草稿数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDraftPSDEActionName(){
        Object objValue = this.get(FIELD_GETDRAFTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取草稿数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDraftPSDEActionNameDirty(){
        if(this.contains(FIELD_GETDRAFTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取草稿数据实体行为
     */
    @JsonIgnore
    public void resetGetDraftPSDEActionName(){
        this.reset(FIELD_GETDRAFTPSDEACTIONNAME);
    }

    /**
     * 设置 获取草稿数据实体行为
     * <P>
     * 等同 {@link #setGetDraftPSDEActionName}
     * @param getDraftPSDEActionName
     */
    @JsonIgnore
    public PSDEDataView getdraftpsdeactionname(String getDraftPSDEActionName){
        this.setGetDraftPSDEActionName(getDraftPSDEActionName);
        return this;
    }

    /**
     * <B>GETPSDEACTIONID</B>&nbsp;获取数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GETPSDEACTIONID = "getpsdeactionid";

    /**
     * 设置 获取数据实体行为
     * 
     * @param getPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONID)
    public void setGetPSDEActionId(String getPSDEActionId){
        this.set(FIELD_GETPSDEACTIONID, getPSDEActionId);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionId(){
        Object objValue = this.get(FIELD_GETPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionIdDirty(){
        if(this.contains(FIELD_GETPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetPSDEActionId(){
        this.reset(FIELD_GETPSDEACTIONID);
    }

    /**
     * 设置 获取数据实体行为
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param getPSDEActionId
     */
    @JsonIgnore
    public PSDEDataView getpsdeactionid(String getPSDEActionId){
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    /**
     * 设置 获取数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView getpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        }
        else{
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETPSDEACTIONNAME</B>&nbsp;获取数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETPSDEACTIONID}
     */
    public final static String FIELD_GETPSDEACTIONNAME = "getpsdeactionname";

    /**
     * 设置 获取数据实体行为
     * 
     * @param getPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONNAME)
    public void setGetPSDEActionName(String getPSDEActionName){
        this.set(FIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionName(){
        Object objValue = this.get(FIELD_GETPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionNameDirty(){
        if(this.contains(FIELD_GETPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetPSDEActionName(){
        this.reset(FIELD_GETPSDEACTIONNAME);
    }

    /**
     * 设置 获取数据实体行为
     * <P>
     * 等同 {@link #setGetPSDEActionName}
     * @param getPSDEActionName
     */
    @JsonIgnore
    public PSDEDataView getpsdeactionname(String getPSDEActionName){
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    /**
     * <B>GROUPBARCLOSEMODE</B>&nbsp;分组栏关闭模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode} 
     */
    public final static String FIELD_GROUPBARCLOSEMODE = "groupbarclosemode";

    /**
     * 设置 分组栏关闭模式
     * 
     * @param groupBarCloseMode
     * 
     */
    @JsonProperty(FIELD_GROUPBARCLOSEMODE)
    public void setGroupBarCloseMode(Integer groupBarCloseMode){
        this.set(FIELD_GROUPBARCLOSEMODE, groupBarCloseMode);
    }
    
    /**
     * 获取 分组栏关闭模式  
     * @return
     */
    @JsonIgnore
    public Integer getGroupBarCloseMode(){
        Object objValue = this.get(FIELD_GROUPBARCLOSEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组栏关闭模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupBarCloseModeDirty(){
        if(this.contains(FIELD_GROUPBARCLOSEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组栏关闭模式
     */
    @JsonIgnore
    public void resetGroupBarCloseMode(){
        this.reset(FIELD_GROUPBARCLOSEMODE);
    }

    /**
     * 设置 分组栏关闭模式
     * <P>
     * 等同 {@link #setGroupBarCloseMode}
     * @param groupBarCloseMode
     */
    @JsonIgnore
    public PSDEDataView groupbarclosemode(Integer groupBarCloseMode){
        this.setGroupBarCloseMode(groupBarCloseMode);
        return this;
    }

     /**
     * 设置 分组栏关闭模式
     * <P>
     * 等同 {@link #setGroupBarCloseMode}
     * @param groupBarCloseMode
     */
    @JsonIgnore
    public PSDEDataView groupbarclosemode(net.ibizsys.psmodel.core.util.PSModelEnums.GroupTitleBarCloseMode groupBarCloseMode){
        if(groupBarCloseMode == null){
            this.setGroupBarCloseMode(null);
        }
        else{
            this.setGroupBarCloseMode(groupBarCloseMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPHEIGHT</B>&nbsp;分组高度，指定卡片视图部件分组项的高度，0为自动。未定义时【0】
     */
    public final static String FIELD_GROUPHEIGHT = "groupheight";

    /**
     * 设置 分组高度，详细说明：{@link #FIELD_GROUPHEIGHT}
     * 
     * @param groupHeight
     * 
     */
    @JsonProperty(FIELD_GROUPHEIGHT)
    public void setGroupHeight(Integer groupHeight){
        this.set(FIELD_GROUPHEIGHT, groupHeight);
    }
    
    /**
     * 获取 分组高度  
     * @return
     */
    @JsonIgnore
    public Integer getGroupHeight(){
        Object objValue = this.get(FIELD_GROUPHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupHeightDirty(){
        if(this.contains(FIELD_GROUPHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组高度
     */
    @JsonIgnore
    public void resetGroupHeight(){
        this.reset(FIELD_GROUPHEIGHT);
    }

    /**
     * 设置 分组高度，详细说明：{@link #FIELD_GROUPHEIGHT}
     * <P>
     * 等同 {@link #setGroupHeight}
     * @param groupHeight
     */
    @JsonIgnore
    public PSDEDataView groupheight(Integer groupHeight){
        this.setGroupHeight(groupHeight);
        return this;
    }

    /**
     * <B>GROUPLAYOUT</B>&nbsp;分组布局，指定卡片视图部件分组项的布局方向，未定义时为【从左往右】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupLayout} 
     */
    public final static String FIELD_GROUPLAYOUT = "grouplayout";

    /**
     * 设置 分组布局，详细说明：{@link #FIELD_GROUPLAYOUT}
     * 
     * @param groupLayout
     * 
     */
    @JsonProperty(FIELD_GROUPLAYOUT)
    public void setGroupLayout(String groupLayout){
        this.set(FIELD_GROUPLAYOUT, groupLayout);
    }
    
    /**
     * 获取 分组布局  
     * @return
     */
    @JsonIgnore
    public String getGroupLayout(){
        Object objValue = this.get(FIELD_GROUPLAYOUT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组布局 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupLayoutDirty(){
        if(this.contains(FIELD_GROUPLAYOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组布局
     */
    @JsonIgnore
    public void resetGroupLayout(){
        this.reset(FIELD_GROUPLAYOUT);
    }

    /**
     * 设置 分组布局，详细说明：{@link #FIELD_GROUPLAYOUT}
     * <P>
     * 等同 {@link #setGroupLayout}
     * @param groupLayout
     */
    @JsonIgnore
    public PSDEDataView grouplayout(String groupLayout){
        this.setGroupLayout(groupLayout);
        return this;
    }

     /**
     * 设置 分组布局，详细说明：{@link #FIELD_GROUPLAYOUT}
     * <P>
     * 等同 {@link #setGroupLayout}
     * @param groupLayout
     */
    @JsonIgnore
    public PSDEDataView grouplayout(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupLayout groupLayout){
        if(groupLayout == null){
            this.setGroupLayout(null);
        }
        else{
            this.setGroupLayout(groupLayout.value);
        }
        return this;
    }

    /**
     * <B>GROUPMODE</B>&nbsp;分组模式，指定卡片视图的分组模式，未定义时为【无分组】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupMode} 
     */
    public final static String FIELD_GROUPMODE = "groupmode";

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * 
     * @param groupMode
     * 
     */
    @JsonProperty(FIELD_GROUPMODE)
    public void setGroupMode(String groupMode){
        this.set(FIELD_GROUPMODE, groupMode);
    }
    
    /**
     * 获取 分组模式  
     * @return
     */
    @JsonIgnore
    public String getGroupMode(){
        Object objValue = this.get(FIELD_GROUPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupModeDirty(){
        if(this.contains(FIELD_GROUPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组模式
     */
    @JsonIgnore
    public void resetGroupMode(){
        this.reset(FIELD_GROUPMODE);
    }

    /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSDEDataView groupmode(String groupMode){
        this.setGroupMode(groupMode);
        return this;
    }

     /**
     * 设置 分组模式，详细说明：{@link #FIELD_GROUPMODE}
     * <P>
     * 等同 {@link #setGroupMode}
     * @param groupMode
     */
    @JsonIgnore
    public PSDEDataView groupmode(net.ibizsys.psmodel.core.util.PSModelEnums.MDCtrlGroupMode groupMode){
        if(groupMode == null){
            this.setGroupMode(null);
        }
        else{
            this.setGroupMode(groupMode.value);
        }
        return this;
    }

    /**
     * <B>GROUPMOVEPSDEACTIONID</B>&nbsp;分组移动数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_GROUPMOVEPSDEACTIONID = "groupmovepsdeactionid";

    /**
     * 设置 分组移动数据实体行为
     * 
     * @param groupMovePSDEActionId
     * 
     */
    @JsonProperty(FIELD_GROUPMOVEPSDEACTIONID)
    public void setGroupMovePSDEActionId(String groupMovePSDEActionId){
        this.set(FIELD_GROUPMOVEPSDEACTIONID, groupMovePSDEActionId);
    }
    
    /**
     * 获取 分组移动数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGroupMovePSDEActionId(){
        Object objValue = this.get(FIELD_GROUPMOVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组移动数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMovePSDEActionIdDirty(){
        if(this.contains(FIELD_GROUPMOVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组移动数据实体行为
     */
    @JsonIgnore
    public void resetGroupMovePSDEActionId(){
        this.reset(FIELD_GROUPMOVEPSDEACTIONID);
    }

    /**
     * 设置 分组移动数据实体行为
     * <P>
     * 等同 {@link #setGroupMovePSDEActionId}
     * @param groupMovePSDEActionId
     */
    @JsonIgnore
    public PSDEDataView groupmovepsdeactionid(String groupMovePSDEActionId){
        this.setGroupMovePSDEActionId(groupMovePSDEActionId);
        return this;
    }

    /**
     * 设置 分组移动数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupMovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView groupmovepsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setGroupMovePSDEActionId(null);
            this.setGroupMovePSDEActionName(null);
        }
        else{
            this.setGroupMovePSDEActionId(pSDEAction.getPSDEActionId());
            this.setGroupMovePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GROUPMOVEPSDEACTIONNAME</B>&nbsp;分组移动实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPMOVEPSDEACTIONID}
     */
    public final static String FIELD_GROUPMOVEPSDEACTIONNAME = "groupmovepsdeactionname";

    /**
     * 设置 分组移动实体行为
     * 
     * @param groupMovePSDEActionName
     * 
     */
    @JsonProperty(FIELD_GROUPMOVEPSDEACTIONNAME)
    public void setGroupMovePSDEActionName(String groupMovePSDEActionName){
        this.set(FIELD_GROUPMOVEPSDEACTIONNAME, groupMovePSDEActionName);
    }
    
    /**
     * 获取 分组移动实体行为  
     * @return
     */
    @JsonIgnore
    public String getGroupMovePSDEActionName(){
        Object objValue = this.get(FIELD_GROUPMOVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组移动实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupMovePSDEActionNameDirty(){
        if(this.contains(FIELD_GROUPMOVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组移动实体行为
     */
    @JsonIgnore
    public void resetGroupMovePSDEActionName(){
        this.reset(FIELD_GROUPMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 分组移动实体行为
     * <P>
     * 等同 {@link #setGroupMovePSDEActionName}
     * @param groupMovePSDEActionName
     */
    @JsonIgnore
    public PSDEDataView groupmovepsdeactionname(String groupMovePSDEActionName){
        this.setGroupMovePSDEActionName(groupMovePSDEActionName);
        return this;
    }

    /**
     * <B>GROUPPSCODELISTID</B>&nbsp;分组代码表，指定卡片视图部件的分组代码表，未定义时使用分组属性默认的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_GROUPPSCODELISTID = "grouppscodelistid";

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * 
     * @param groupPSCodeListId
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTID)
    public void setGroupPSCodeListId(String groupPSCodeListId){
        this.set(FIELD_GROUPPSCODELISTID, groupPSCodeListId);
    }
    
    /**
     * 获取 分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListId(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListIdDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListId(){
        this.reset(FIELD_GROUPPSCODELISTID);
    }

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param groupPSCodeListId
     */
    @JsonIgnore
    public PSDEDataView grouppscodelistid(String groupPSCodeListId){
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    /**
     * 设置 分组代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouppscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setGroupPSCodeListId(null);
            this.setGroupPSCodeListName(null);
        }
        else{
            this.setGroupPSCodeListId(pSCodeList.getPSCodeListId());
            this.setGroupPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTNAME</B>&nbsp;分组代码表，指定卡片视图部件的分组代码表，未定义时使用分组属性默认的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSCODELISTID}
     */
    public final static String FIELD_GROUPPSCODELISTNAME = "grouppscodelistname";

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * 
     * @param groupPSCodeListName
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTNAME)
    public void setGroupPSCodeListName(String groupPSCodeListName){
        this.set(FIELD_GROUPPSCODELISTNAME, groupPSCodeListName);
    }
    
    /**
     * 获取 分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListName(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListNameDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListName(){
        this.reset(FIELD_GROUPPSCODELISTNAME);
    }

    /**
     * 设置 分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * <P>
     * 等同 {@link #setGroupPSCodeListName}
     * @param groupPSCodeListName
     */
    @JsonIgnore
    public PSDEDataView grouppscodelistname(String groupPSCodeListName){
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    /**
     * <B>GROUPPSDEFID</B>&nbsp;分组属性，卡片视图部件启用数据分组功能时指定分组的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_GROUPPSDEFID = "grouppsdefid";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * 
     * @param groupPSDEFId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFID)
    public void setGroupPSDEFId(String groupPSDEFId){
        this.set(FIELD_GROUPPSDEFID, groupPSDEFId);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFId(){
        Object objValue = this.get(FIELD_GROUPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFIdDirty(){
        if(this.contains(FIELD_GROUPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFId(){
        this.reset(FIELD_GROUPPSDEFID);
    }

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFID}
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param groupPSDEFId
     */
    @JsonIgnore
    public PSDEDataView grouppsdefid(String groupPSDEFId){
        this.setGroupPSDEFId(groupPSDEFId);
        return this;
    }

    /**
     * 设置 分组属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouppsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setGroupPSDEFId(null);
            this.setGroupPSDEFName(null);
        }
        else{
            this.setGroupPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEFNAME</B>&nbsp;分组属性，卡片视图部件启用数据分组功能时指定分组的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEFID}
     */
    public final static String FIELD_GROUPPSDEFNAME = "grouppsdefname";

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * 
     * @param groupPSDEFName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEFNAME)
    public void setGroupPSDEFName(String groupPSDEFName){
        this.set(FIELD_GROUPPSDEFNAME, groupPSDEFName);
    }
    
    /**
     * 获取 分组属性  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEFName(){
        Object objValue = this.get(FIELD_GROUPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEFNameDirty(){
        if(this.contains(FIELD_GROUPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组属性
     */
    @JsonIgnore
    public void resetGroupPSDEFName(){
        this.reset(FIELD_GROUPPSDEFNAME);
    }

    /**
     * 设置 分组属性，详细说明：{@link #FIELD_GROUPPSDEFNAME}
     * <P>
     * 等同 {@link #setGroupPSDEFName}
     * @param groupPSDEFName
     */
    @JsonIgnore
    public PSDEDataView grouppsdefname(String groupPSDEFName){
        this.setGroupPSDEFName(groupPSDEFName);
        return this;
    }

    /**
     * <B>GROUPPSDEID</B>&nbsp;分组实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_GROUPPSDEID = "grouppsdeid";

    /**
     * 设置 分组实体
     * 
     * @param groupPSDEId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEID)
    public void setGroupPSDEId(String groupPSDEId){
        this.set(FIELD_GROUPPSDEID, groupPSDEId);
    }
    
    /**
     * 获取 分组实体  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEId(){
        Object objValue = this.get(FIELD_GROUPPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEIdDirty(){
        if(this.contains(FIELD_GROUPPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组实体
     */
    @JsonIgnore
    public void resetGroupPSDEId(){
        this.reset(FIELD_GROUPPSDEID);
    }

    /**
     * 设置 分组实体
     * <P>
     * 等同 {@link #setGroupPSDEId}
     * @param groupPSDEId
     */
    @JsonIgnore
    public PSDEDataView grouppsdeid(String groupPSDEId){
        this.setGroupPSDEId(groupPSDEId);
        return this;
    }

    /**
     * 设置 分组实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouppsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setGroupPSDEId(null);
            this.setGroupPSDEName(null);
        }
        else{
            this.setGroupPSDEId(pSDataEntity.getPSDataEntityId());
            this.setGroupPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDENAME</B>&nbsp;分组实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEID}
     */
    public final static String FIELD_GROUPPSDENAME = "grouppsdename";

    /**
     * 设置 分组实体
     * 
     * @param groupPSDEName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDENAME)
    public void setGroupPSDEName(String groupPSDEName){
        this.set(FIELD_GROUPPSDENAME, groupPSDEName);
    }
    
    /**
     * 获取 分组实体  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEName(){
        Object objValue = this.get(FIELD_GROUPPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDENameDirty(){
        if(this.contains(FIELD_GROUPPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组实体
     */
    @JsonIgnore
    public void resetGroupPSDEName(){
        this.reset(FIELD_GROUPPSDENAME);
    }

    /**
     * 设置 分组实体
     * <P>
     * 等同 {@link #setGroupPSDEName}
     * @param groupPSDEName
     */
    @JsonIgnore
    public PSDEDataView grouppsdename(String groupPSDEName){
        this.setGroupPSDEName(groupPSDEName);
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPID</B>&nbsp;分组界面行为组，指定分组项的界面行为组对象，为分组数据提供功能操作入口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_GROUPPSDEUAGROUPID = "grouppsdeuagroupid";

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPID}
     * 
     * @param groupPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPID)
    public void setGroupPSDEUAGroupId(String groupPSDEUAGroupId){
        this.set(FIELD_GROUPPSDEUAGROUPID, groupPSDEUAGroupId);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupId(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupId(){
        this.reset(FIELD_GROUPPSDEUAGROUPID);
    }

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPID}
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param groupPSDEUAGroupId
     */
    @JsonIgnore
    public PSDEDataView grouppsdeuagroupid(String groupPSDEUAGroupId){
        this.setGroupPSDEUAGroupId(groupPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 分组界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouppsdeuagroupid(PSDEUAGroup pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setGroupPSDEUAGroupId(null);
            this.setGroupPSDEUAGroupName(null);
        }
        else{
            this.setGroupPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setGroupPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>GROUPPSDEUAGROUPNAME</B>&nbsp;分组界面行为组，指定分组项的界面行为组对象，为分组数据提供功能操作入口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSDEUAGROUPID}
     */
    public final static String FIELD_GROUPPSDEUAGROUPNAME = "grouppsdeuagroupname";

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPNAME}
     * 
     * @param groupPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_GROUPPSDEUAGROUPNAME)
    public void setGroupPSDEUAGroupName(String groupPSDEUAGroupName){
        this.set(FIELD_GROUPPSDEUAGROUPNAME, groupPSDEUAGroupName);
    }
    
    /**
     * 获取 分组界面行为组  
     * @return
     */
    @JsonIgnore
    public String getGroupPSDEUAGroupName(){
        Object objValue = this.get(FIELD_GROUPPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_GROUPPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组界面行为组
     */
    @JsonIgnore
    public void resetGroupPSDEUAGroupName(){
        this.reset(FIELD_GROUPPSDEUAGROUPNAME);
    }

    /**
     * 设置 分组界面行为组，详细说明：{@link #FIELD_GROUPPSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setGroupPSDEUAGroupName}
     * @param groupPSDEUAGroupName
     */
    @JsonIgnore
    public PSDEDataView grouppsdeuagroupname(String groupPSDEUAGroupName){
        this.setGroupPSDEUAGroupName(groupPSDEUAGroupName);
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSID</B>&nbsp;分组样式表，指定分组项的界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_GROUPPSSYSCSSID = "grouppssyscssid";

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSID}
     * 
     * @param groupPSSysCssId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSID)
    public void setGroupPSSysCssId(String groupPSSysCssId){
        this.set(FIELD_GROUPPSSYSCSSID, groupPSSysCssId);
    }
    
    /**
     * 获取 分组样式表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysCssId(){
        Object objValue = this.get(FIELD_GROUPPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysCssIdDirty(){
        if(this.contains(FIELD_GROUPPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式表
     */
    @JsonIgnore
    public void resetGroupPSSysCssId(){
        this.reset(FIELD_GROUPPSSYSCSSID);
    }

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSID}
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param groupPSSysCssId
     */
    @JsonIgnore
    public PSDEDataView grouppssyscssid(String groupPSSysCssId){
        this.setGroupPSSysCssId(groupPSSysCssId);
        return this;
    }

    /**
     * 设置 分组样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouppssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setGroupPSSysCssId(null);
            this.setGroupPSSysCssName(null);
        }
        else{
            this.setGroupPSSysCssId(pSSysCss.getPSSysCssId());
            this.setGroupPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>GROUPPSSYSCSSNAME</B>&nbsp;分组样式表，指定分组项的界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSCSSID}
     */
    public final static String FIELD_GROUPPSSYSCSSNAME = "grouppssyscssname";

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSNAME}
     * 
     * @param groupPSSysCssName
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSCSSNAME)
    public void setGroupPSSysCssName(String groupPSSysCssName){
        this.set(FIELD_GROUPPSSYSCSSNAME, groupPSSysCssName);
    }
    
    /**
     * 获取 分组样式表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysCssName(){
        Object objValue = this.get(FIELD_GROUPPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysCssNameDirty(){
        if(this.contains(FIELD_GROUPPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式表
     */
    @JsonIgnore
    public void resetGroupPSSysCssName(){
        this.reset(FIELD_GROUPPSSYSCSSNAME);
    }

    /**
     * 设置 分组样式表，详细说明：{@link #FIELD_GROUPPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setGroupPSSysCssName}
     * @param groupPSSysCssName
     */
    @JsonIgnore
    public PSDEDataView grouppssyscssname(String groupPSSysCssName){
        this.setGroupPSSysCssName(groupPSSysCssName);
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINID</B>&nbsp;分组前端插件，指定分组项的前端模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINID = "grouppssyspfpluginid";

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINID}
     * 
     * @param groupPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSPFPLUGINID)
    public void setGroupPSSysPFPluginId(String groupPSSysPFPluginId){
        this.set(FIELD_GROUPPSSYSPFPLUGINID, groupPSSysPFPluginId);
    }
    
    /**
     * 获取 分组前端插件  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GROUPPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GROUPPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组前端插件
     */
    @JsonIgnore
    public void resetGroupPSSysPFPluginId(){
        this.reset(FIELD_GROUPPSSYSPFPLUGINID);
    }

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param groupPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEDataView grouppssyspfpluginid(String groupPSSysPFPluginId){
        this.setGroupPSSysPFPluginId(groupPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 分组前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouppssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGroupPSSysPFPluginId(null);
            this.setGroupPSSysPFPluginName(null);
        }
        else{
            this.setGroupPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGroupPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GROUPPSSYSPFPLUGINNAME</B>&nbsp;分组前端插件，指定分组项的前端模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSSYSPFPLUGINID}
     */
    public final static String FIELD_GROUPPSSYSPFPLUGINNAME = "grouppssyspfpluginname";

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINNAME}
     * 
     * @param groupPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GROUPPSSYSPFPLUGINNAME)
    public void setGroupPSSysPFPluginName(String groupPSSysPFPluginName){
        this.set(FIELD_GROUPPSSYSPFPLUGINNAME, groupPSSysPFPluginName);
    }
    
    /**
     * 获取 分组前端插件  
     * @return
     */
    @JsonIgnore
    public String getGroupPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GROUPPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组前端插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GROUPPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组前端插件
     */
    @JsonIgnore
    public void resetGroupPSSysPFPluginName(){
        this.reset(FIELD_GROUPPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 分组前端插件，详细说明：{@link #FIELD_GROUPPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setGroupPSSysPFPluginName}
     * @param groupPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEDataView grouppssyspfpluginname(String groupPSSysPFPluginName){
        this.setGroupPSSysPFPluginName(groupPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GROUPQUICKPSDETBID</B>&nbsp;分组快速操作工具栏，指定分组项内建的快速操作工具栏对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_GROUPQUICKPSDETBID = "groupquickpsdetbid";

    /**
     * 设置 分组快速操作工具栏，详细说明：{@link #FIELD_GROUPQUICKPSDETBID}
     * 
     * @param groupQuickPSDETBId
     * 
     */
    @JsonProperty(FIELD_GROUPQUICKPSDETBID)
    public void setGroupQuickPSDETBId(String groupQuickPSDETBId){
        this.set(FIELD_GROUPQUICKPSDETBID, groupQuickPSDETBId);
    }
    
    /**
     * 获取 分组快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getGroupQuickPSDETBId(){
        Object objValue = this.get(FIELD_GROUPQUICKPSDETBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupQuickPSDETBIdDirty(){
        if(this.contains(FIELD_GROUPQUICKPSDETBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组快速操作工具栏
     */
    @JsonIgnore
    public void resetGroupQuickPSDETBId(){
        this.reset(FIELD_GROUPQUICKPSDETBID);
    }

    /**
     * 设置 分组快速操作工具栏，详细说明：{@link #FIELD_GROUPQUICKPSDETBID}
     * <P>
     * 等同 {@link #setGroupQuickPSDETBId}
     * @param groupQuickPSDETBId
     */
    @JsonIgnore
    public PSDEDataView groupquickpsdetbid(String groupQuickPSDETBId){
        this.setGroupQuickPSDETBId(groupQuickPSDETBId);
        return this;
    }

    /**
     * 设置 分组快速操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupQuickPSDETBId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDEDataView groupquickpsdetbid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setGroupQuickPSDETBId(null);
            this.setGroupQuickPSDETBName(null);
        }
        else{
            this.setGroupQuickPSDETBId(pSDEToolbar.getPSDEToolbarId());
            this.setGroupQuickPSDETBName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>GROUPQUICKPSDETBNAME</B>&nbsp;分组快速操作工具栏，指定分组项内建的快速操作工具栏对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPQUICKPSDETBID}
     */
    public final static String FIELD_GROUPQUICKPSDETBNAME = "groupquickpsdetbname";

    /**
     * 设置 分组快速操作工具栏，详细说明：{@link #FIELD_GROUPQUICKPSDETBNAME}
     * 
     * @param groupQuickPSDETBName
     * 
     */
    @JsonProperty(FIELD_GROUPQUICKPSDETBNAME)
    public void setGroupQuickPSDETBName(String groupQuickPSDETBName){
        this.set(FIELD_GROUPQUICKPSDETBNAME, groupQuickPSDETBName);
    }
    
    /**
     * 获取 分组快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getGroupQuickPSDETBName(){
        Object objValue = this.get(FIELD_GROUPQUICKPSDETBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupQuickPSDETBNameDirty(){
        if(this.contains(FIELD_GROUPQUICKPSDETBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组快速操作工具栏
     */
    @JsonIgnore
    public void resetGroupQuickPSDETBName(){
        this.reset(FIELD_GROUPQUICKPSDETBNAME);
    }

    /**
     * 设置 分组快速操作工具栏，详细说明：{@link #FIELD_GROUPQUICKPSDETBNAME}
     * <P>
     * 等同 {@link #setGroupQuickPSDETBName}
     * @param groupQuickPSDETBName
     */
    @JsonIgnore
    public PSDEDataView groupquickpsdetbname(String groupQuickPSDETBName){
        this.setGroupQuickPSDETBName(groupQuickPSDETBName);
        return this;
    }

    /**
     * <B>GROUPSTYLE</B>&nbsp;分组样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_GROUPSTYLE = "groupstyle";

    /**
     * 设置 分组样式
     * 
     * @param groupStyle
     * 
     */
    @JsonProperty(FIELD_GROUPSTYLE)
    public void setGroupStyle(String groupStyle){
        this.set(FIELD_GROUPSTYLE, groupStyle);
    }
    
    /**
     * 获取 分组样式  
     * @return
     */
    @JsonIgnore
    public String getGroupStyle(){
        Object objValue = this.get(FIELD_GROUPSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupStyleDirty(){
        if(this.contains(FIELD_GROUPSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组样式
     */
    @JsonIgnore
    public void resetGroupStyle(){
        this.reset(FIELD_GROUPSTYLE);
    }

    /**
     * 设置 分组样式
     * <P>
     * 等同 {@link #setGroupStyle}
     * @param groupStyle
     */
    @JsonIgnore
    public PSDEDataView groupstyle(String groupStyle){
        this.setGroupStyle(groupStyle);
        return this;
    }

    /**
     * <B>GROUPTEXTPSDEFID</B>&nbsp;分组文本属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_GROUPTEXTPSDEFID = "grouptextpsdefid";

    /**
     * 设置 分组文本属性
     * 
     * @param groupTextPSDEFId
     * 
     */
    @JsonProperty(FIELD_GROUPTEXTPSDEFID)
    public void setGroupTextPSDEFId(String groupTextPSDEFId){
        this.set(FIELD_GROUPTEXTPSDEFID, groupTextPSDEFId);
    }
    
    /**
     * 获取 分组文本属性  
     * @return
     */
    @JsonIgnore
    public String getGroupTextPSDEFId(){
        Object objValue = this.get(FIELD_GROUPTEXTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupTextPSDEFIdDirty(){
        if(this.contains(FIELD_GROUPTEXTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组文本属性
     */
    @JsonIgnore
    public void resetGroupTextPSDEFId(){
        this.reset(FIELD_GROUPTEXTPSDEFID);
    }

    /**
     * 设置 分组文本属性
     * <P>
     * 等同 {@link #setGroupTextPSDEFId}
     * @param groupTextPSDEFId
     */
    @JsonIgnore
    public PSDEDataView grouptextpsdefid(String groupTextPSDEFId){
        this.setGroupTextPSDEFId(groupTextPSDEFId);
        return this;
    }

    /**
     * 设置 分组文本属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupTextPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDataView grouptextpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setGroupTextPSDEFId(null);
            this.setGroupTextPSDEFName(null);
        }
        else{
            this.setGroupTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setGroupTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>GROUPTEXTPSDEFNAME</B>&nbsp;分组文本属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPTEXTPSDEFID}
     */
    public final static String FIELD_GROUPTEXTPSDEFNAME = "grouptextpsdefname";

    /**
     * 设置 分组文本属性
     * 
     * @param groupTextPSDEFName
     * 
     */
    @JsonProperty(FIELD_GROUPTEXTPSDEFNAME)
    public void setGroupTextPSDEFName(String groupTextPSDEFName){
        this.set(FIELD_GROUPTEXTPSDEFNAME, groupTextPSDEFName);
    }
    
    /**
     * 获取 分组文本属性  
     * @return
     */
    @JsonIgnore
    public String getGroupTextPSDEFName(){
        Object objValue = this.get(FIELD_GROUPTEXTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupTextPSDEFNameDirty(){
        if(this.contains(FIELD_GROUPTEXTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组文本属性
     */
    @JsonIgnore
    public void resetGroupTextPSDEFName(){
        this.reset(FIELD_GROUPTEXTPSDEFNAME);
    }

    /**
     * 设置 分组文本属性
     * <P>
     * 等同 {@link #setGroupTextPSDEFName}
     * @param groupTextPSDEFName
     */
    @JsonIgnore
    public PSDEDataView grouptextpsdefname(String groupTextPSDEFName){
        this.setGroupTextPSDEFName(groupTextPSDEFName);
        return this;
    }

    /**
     * <B>GROUPWIDTH</B>&nbsp;分组宽度，指定分组项的宽度，0为自动。未定义时【0】
     */
    public final static String FIELD_GROUPWIDTH = "groupwidth";

    /**
     * 设置 分组宽度，详细说明：{@link #FIELD_GROUPWIDTH}
     * 
     * @param groupWidth
     * 
     */
    @JsonProperty(FIELD_GROUPWIDTH)
    public void setGroupWidth(Integer groupWidth){
        this.set(FIELD_GROUPWIDTH, groupWidth);
    }
    
    /**
     * 获取 分组宽度  
     * @return
     */
    @JsonIgnore
    public Integer getGroupWidth(){
        Object objValue = this.get(FIELD_GROUPWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupWidthDirty(){
        if(this.contains(FIELD_GROUPWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组宽度
     */
    @JsonIgnore
    public void resetGroupWidth(){
        this.reset(FIELD_GROUPWIDTH);
    }

    /**
     * 设置 分组宽度，详细说明：{@link #FIELD_GROUPWIDTH}
     * <P>
     * 等同 {@link #setGroupWidth}
     * @param groupWidth
     */
    @JsonIgnore
    public PSDEDataView groupwidth(Integer groupWidth){
        this.setGroupWidth(groupWidth);
        return this;
    }

    /**
     * <B>GROUP_COL_LG</B>&nbsp;分组大型列宽，获取分组项在【栅格布局】模式下的大型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_GROUP_COL_LG = "group_col_lg";

    /**
     * 设置 分组大型列宽，详细说明：{@link #FIELD_GROUP_COL_LG}
     * 
     * @param group_Col_LG
     * 
     */
    @JsonProperty(FIELD_GROUP_COL_LG)
    public void setGroup_Col_LG(Integer group_Col_LG){
        this.set(FIELD_GROUP_COL_LG, group_Col_LG);
    }
    
    /**
     * 获取 分组大型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getGroup_Col_LG(){
        Object objValue = this.get(FIELD_GROUP_COL_LG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组大型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroup_Col_LGDirty(){
        if(this.contains(FIELD_GROUP_COL_LG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组大型列宽
     */
    @JsonIgnore
    public void resetGroup_Col_LG(){
        this.reset(FIELD_GROUP_COL_LG);
    }

    /**
     * 设置 分组大型列宽，详细说明：{@link #FIELD_GROUP_COL_LG}
     * <P>
     * 等同 {@link #setGroup_Col_LG}
     * @param group_Col_LG
     */
    @JsonIgnore
    public PSDEDataView group_col_lg(Integer group_Col_LG){
        this.setGroup_Col_LG(group_Col_LG);
        return this;
    }

    /**
     * <B>GROUP_COL_MD</B>&nbsp;分组中型列宽，获取分组项在【栅格布局】模式下的中型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_GROUP_COL_MD = "group_col_md";

    /**
     * 设置 分组中型列宽，详细说明：{@link #FIELD_GROUP_COL_MD}
     * 
     * @param group_Col_MD
     * 
     */
    @JsonProperty(FIELD_GROUP_COL_MD)
    public void setGroup_Col_MD(Integer group_Col_MD){
        this.set(FIELD_GROUP_COL_MD, group_Col_MD);
    }
    
    /**
     * 获取 分组中型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getGroup_Col_MD(){
        Object objValue = this.get(FIELD_GROUP_COL_MD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组中型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroup_Col_MDDirty(){
        if(this.contains(FIELD_GROUP_COL_MD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组中型列宽
     */
    @JsonIgnore
    public void resetGroup_Col_MD(){
        this.reset(FIELD_GROUP_COL_MD);
    }

    /**
     * 设置 分组中型列宽，详细说明：{@link #FIELD_GROUP_COL_MD}
     * <P>
     * 等同 {@link #setGroup_Col_MD}
     * @param group_Col_MD
     */
    @JsonIgnore
    public PSDEDataView group_col_md(Integer group_Col_MD){
        this.setGroup_Col_MD(group_Col_MD);
        return this;
    }

    /**
     * <B>GROUP_COL_SM</B>&nbsp;分组小型列宽，获取分组项在【栅格布局】模式下的小型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_GROUP_COL_SM = "group_col_sm";

    /**
     * 设置 分组小型列宽，详细说明：{@link #FIELD_GROUP_COL_SM}
     * 
     * @param group_Col_SM
     * 
     */
    @JsonProperty(FIELD_GROUP_COL_SM)
    public void setGroup_Col_SM(Integer group_Col_SM){
        this.set(FIELD_GROUP_COL_SM, group_Col_SM);
    }
    
    /**
     * 获取 分组小型列宽  
     * @return
     */
    @JsonIgnore
    public Integer getGroup_Col_SM(){
        Object objValue = this.get(FIELD_GROUP_COL_SM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组小型列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroup_Col_SMDirty(){
        if(this.contains(FIELD_GROUP_COL_SM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组小型列宽
     */
    @JsonIgnore
    public void resetGroup_Col_SM(){
        this.reset(FIELD_GROUP_COL_SM);
    }

    /**
     * 设置 分组小型列宽，详细说明：{@link #FIELD_GROUP_COL_SM}
     * <P>
     * 等同 {@link #setGroup_Col_SM}
     * @param group_Col_SM
     */
    @JsonIgnore
    public PSDEDataView group_col_sm(Integer group_Col_SM){
        this.setGroup_Col_SM(group_Col_SM);
        return this;
    }

    /**
     * <B>GROUP_COL_XS</B>&nbsp;分组超小列宽，获取分组项在【栅格布局】模式下的超小型界面列占位数量，未定义时为【-1】
     */
    public final static String FIELD_GROUP_COL_XS = "group_col_xs";

    /**
     * 设置 分组超小列宽，详细说明：{@link #FIELD_GROUP_COL_XS}
     * 
     * @param group_Col_XS
     * 
     */
    @JsonProperty(FIELD_GROUP_COL_XS)
    public void setGroup_Col_XS(Integer group_Col_XS){
        this.set(FIELD_GROUP_COL_XS, group_Col_XS);
    }
    
    /**
     * 获取 分组超小列宽  
     * @return
     */
    @JsonIgnore
    public Integer getGroup_Col_XS(){
        Object objValue = this.get(FIELD_GROUP_COL_XS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 分组超小列宽 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroup_Col_XSDirty(){
        if(this.contains(FIELD_GROUP_COL_XS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组超小列宽
     */
    @JsonIgnore
    public void resetGroup_Col_XS(){
        this.reset(FIELD_GROUP_COL_XS);
    }

    /**
     * 设置 分组超小列宽，详细说明：{@link #FIELD_GROUP_COL_XS}
     * <P>
     * 等同 {@link #setGroup_Col_XS}
     * @param group_Col_XS
     */
    @JsonIgnore
    public PSDEDataView group_col_xs(Integer group_Col_XS){
        this.setGroup_Col_XS(group_Col_XS);
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSID</B>&nbsp;默认项样式表，指定卡片项默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_ITEMPSSYSCSSID = "itempssyscssid";

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * 
     * @param itemPSSysCssId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSID)
    public void setItemPSSysCssId(String itemPSSysCssId){
        this.set(FIELD_ITEMPSSYSCSSID, itemPSSysCssId);
    }
    
    /**
     * 获取 默认项样式表  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysCssId(){
        Object objValue = this.get(FIELD_ITEMPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认项样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysCssIdDirty(){
        if(this.contains(FIELD_ITEMPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认项样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssId(){
        this.reset(FIELD_ITEMPSSYSCSSID);
    }

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSID}
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param itemPSSysCssId
     */
    @JsonIgnore
    public PSDEDataView itempssyscssid(String itemPSSysCssId){
        this.setItemPSSysCssId(itemPSSysCssId);
        return this;
    }

    /**
     * 设置 默认项样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEDataView itempssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setItemPSSysCssId(null);
            this.setItemPSSysCssName(null);
        }
        else{
            this.setItemPSSysCssId(pSSysCss.getPSSysCssId());
            this.setItemPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSCSSNAME</B>&nbsp;默认项样式表，指定卡片项默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSCSSID}
     */
    public final static String FIELD_ITEMPSSYSCSSNAME = "itempssyscssname";

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * 
     * @param itemPSSysCssName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSCSSNAME)
    public void setItemPSSysCssName(String itemPSSysCssName){
        this.set(FIELD_ITEMPSSYSCSSNAME, itemPSSysCssName);
    }
    
    /**
     * 获取 默认项样式表  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysCssName(){
        Object objValue = this.get(FIELD_ITEMPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认项样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemPSSysCssNameDirty(){
        if(this.contains(FIELD_ITEMPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认项样式表
     */
    @JsonIgnore
    public void resetItemPSSysCssName(){
        this.reset(FIELD_ITEMPSSYSCSSNAME);
    }

    /**
     * 设置 默认项样式表，详细说明：{@link #FIELD_ITEMPSSYSCSSNAME}
     * <P>
     * 等同 {@link #setItemPSSysCssName}
     * @param itemPSSysCssName
     */
    @JsonIgnore
    public PSDEDataView itempssyscssname(String itemPSSysCssName){
        this.setItemPSSysCssName(itemPSSysCssName);
        return this;
    }

    /**
     * <B>ITEMPSSYSPFPLUGINID</B>&nbsp;项前端插件，指定卡片项前端插件使用的前端模板扩展插件，使用插件类型【数据视图项绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_ITEMPSSYSPFPLUGINID = "itempssyspfpluginid";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINID}
     * 
     * @param itemPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSPFPLUGINID)
    public void setItemPSSysPFPluginId(String itemPSSysPFPluginId){
        this.set(FIELD_ITEMPSSYSPFPLUGINID, itemPSSysPFPluginId);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysPFPluginId(){
        Object objValue = this.get(FIELD_ITEMPSSYSPFPLUGINID);
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
    public boolean isItemPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_ITEMPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetItemPSSysPFPluginId(){
        this.reset(FIELD_ITEMPSSYSPFPLUGINID);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setItemPSSysPFPluginId}
     * @param itemPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEDataView itempssyspfpluginid(String itemPSSysPFPluginId){
        this.setItemPSSysPFPluginId(itemPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 项前端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setItemPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEDataView itempssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setItemPSSysPFPluginId(null);
            this.setItemPSSysPFPluginName(null);
        }
        else{
            this.setItemPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setItemPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>ITEMPSSYSPFPLUGINNAME</B>&nbsp;项前端插件，指定卡片项前端插件使用的前端模板扩展插件，使用插件类型【数据视图项绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ITEMPSSYSPFPLUGINID}
     */
    public final static String FIELD_ITEMPSSYSPFPLUGINNAME = "itempssyspfpluginname";

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINNAME}
     * 
     * @param itemPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_ITEMPSSYSPFPLUGINNAME)
    public void setItemPSSysPFPluginName(String itemPSSysPFPluginName){
        this.set(FIELD_ITEMPSSYSPFPLUGINNAME, itemPSSysPFPluginName);
    }
    
    /**
     * 获取 项前端插件  
     * @return
     */
    @JsonIgnore
    public String getItemPSSysPFPluginName(){
        Object objValue = this.get(FIELD_ITEMPSSYSPFPLUGINNAME);
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
    public boolean isItemPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_ITEMPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项前端插件
     */
    @JsonIgnore
    public void resetItemPSSysPFPluginName(){
        this.reset(FIELD_ITEMPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 项前端插件，详细说明：{@link #FIELD_ITEMPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setItemPSSysPFPluginName}
     * @param itemPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEDataView itempssyspfpluginname(String itemPSSysPFPluginName){
        this.setItemPSSysPFPluginName(itemPSSysPFPluginName);
        return this;
    }

    /**
     * <B>KANBANFLAG</B>&nbsp;看板模式，指定卡片视图部件是否启用看板模式，看板模式提供卡片分组能力，并支持卡片在分组间进行移动。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_KANBANFLAG = "kanbanflag";

    /**
     * 设置 看板模式，详细说明：{@link #FIELD_KANBANFLAG}
     * 
     * @param kanbanFlag
     * 
     */
    @JsonProperty(FIELD_KANBANFLAG)
    public void setKanbanFlag(Integer kanbanFlag){
        this.set(FIELD_KANBANFLAG, kanbanFlag);
    }
    
    /**
     * 获取 看板模式  
     * @return
     */
    @JsonIgnore
    public Integer getKanbanFlag(){
        Object objValue = this.get(FIELD_KANBANFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 看板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKanbanFlagDirty(){
        if(this.contains(FIELD_KANBANFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 看板模式
     */
    @JsonIgnore
    public void resetKanbanFlag(){
        this.reset(FIELD_KANBANFLAG);
    }

    /**
     * 设置 看板模式，详细说明：{@link #FIELD_KANBANFLAG}
     * <P>
     * 等同 {@link #setKanbanFlag}
     * @param kanbanFlag
     */
    @JsonIgnore
    public PSDEDataView kanbanflag(Integer kanbanFlag){
        this.setKanbanFlag(kanbanFlag);
        return this;
    }

     /**
     * 设置 看板模式，详细说明：{@link #FIELD_KANBANFLAG}
     * <P>
     * 等同 {@link #setKanbanFlag}
     * @param kanbanFlag
     */
    @JsonIgnore
    public PSDEDataView kanbanflag(Boolean kanbanFlag){
        if(kanbanFlag == null){
            this.setKanbanFlag(null);
        }
        else{
            this.setKanbanFlag(kanbanFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LAYOUTITEMTYPE</B>&nbsp;布局项类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DataViewLayoutItemType} 
     */
    public final static String FIELD_LAYOUTITEMTYPE = "layoutitemtype";

    /**
     * 设置 布局项类型
     * 
     * @param layoutItemType
     * 
     */
    @JsonProperty(FIELD_LAYOUTITEMTYPE)
    public void setLayoutItemType(String layoutItemType){
        this.set(FIELD_LAYOUTITEMTYPE, layoutItemType);
    }
    
    /**
     * 获取 布局项类型  
     * @return
     */
    @JsonIgnore
    public String getLayoutItemType(){
        Object objValue = this.get(FIELD_LAYOUTITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutItemTypeDirty(){
        if(this.contains(FIELD_LAYOUTITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局项类型
     */
    @JsonIgnore
    public void resetLayoutItemType(){
        this.reset(FIELD_LAYOUTITEMTYPE);
    }

    /**
     * 设置 布局项类型
     * <P>
     * 等同 {@link #setLayoutItemType}
     * @param layoutItemType
     */
    @JsonIgnore
    public PSDEDataView layoutitemtype(String layoutItemType){
        this.setLayoutItemType(layoutItemType);
        return this;
    }

     /**
     * 设置 布局项类型
     * <P>
     * 等同 {@link #setLayoutItemType}
     * @param layoutItemType
     */
    @JsonIgnore
    public PSDEDataView layoutitemtype(net.ibizsys.psmodel.core.util.PSModelEnums.DataViewLayoutItemType layoutItemType){
        if(layoutItemType == null){
            this.setLayoutItemType(null);
        }
        else{
            this.setLayoutItemType(layoutItemType.value);
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
    public PSDEDataView memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定卡片视图部件对数据集合的默认排序方向，需指定默认排序属性
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
    public PSDEDataView minorsortdir(String minorSortDir){
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
    public PSDEDataView minorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定卡片视图部件对数据集合的默认排序属性
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
    public PSDEDataView minorsortpsdefid(String minorSortPSDEFId){
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
    public PSDEDataView minorsortpsdefid(PSDEField pSDEField){
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
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定卡片视图部件对数据集合的默认排序属性
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
    public PSDEDataView minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
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
    public PSDEDataView movepsdeactionid(String movePSDEActionId){
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
    public PSDEDataView movepsdeactionid(PSDEAction pSDEAction){
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
    public PSDEDataView movepsdeactionname(String movePSDEActionName){
        this.setMovePSDEActionName(movePSDEActionName);
        return this;
    }

    /**
     * <B>MULTISELECT</B>&nbsp;支持多选
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MULTISELECT = "multiselect";

    /**
     * 设置 支持多选
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
     * 设置 支持多选
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEDataView multiselect(Integer multiSelect){
        this.setMultiSelect(multiSelect);
        return this;
    }

     /**
     * 设置 支持多选
     * <P>
     * 等同 {@link #setMultiSelect}
     * @param multiSelect
     */
    @JsonIgnore
    public PSDEDataView multiselect(Boolean multiSelect){
        if(multiSelect == null){
            this.setMultiSelect(null);
        }
        else{
            this.setMultiSelect(multiSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NAVPSDERID</B>&nbsp;导航视图关系，指定卡片视图部件默认的导航关系，此配置在卡片导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_NAVPSDERID = "navpsderid";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERID}
     * 
     * @param navPSDERId
     * 
     */
    @JsonProperty(FIELD_NAVPSDERID)
    public void setNavPSDERId(String navPSDERId){
        this.set(FIELD_NAVPSDERID, navPSDERId);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getNavPSDERId(){
        Object objValue = this.get(FIELD_NAVPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDERIdDirty(){
        if(this.contains(FIELD_NAVPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetNavPSDERId(){
        this.reset(FIELD_NAVPSDERID);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERID}
     * <P>
     * 等同 {@link #setNavPSDERId}
     * @param navPSDERId
     */
    @JsonIgnore
    public PSDEDataView navpsderid(String navPSDERId){
        this.setNavPSDERId(navPSDERId);
        return this;
    }

    /**
     * 设置 导航视图关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEDataView navpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setNavPSDERId(null);
            this.setNavPSDERName(null);
        }
        else{
            this.setNavPSDERId(pSDER.getPSDERId());
            this.setNavPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>NAVPSDERNAME</B>&nbsp;导航视图关系，指定卡片视图部件默认的导航关系，此配置在卡片导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVPSDERID}
     */
    public final static String FIELD_NAVPSDERNAME = "navpsdername";

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERNAME}
     * 
     * @param navPSDERName
     * 
     */
    @JsonProperty(FIELD_NAVPSDERNAME)
    public void setNavPSDERName(String navPSDERName){
        this.set(FIELD_NAVPSDERNAME, navPSDERName);
    }
    
    /**
     * 获取 导航视图关系  
     * @return
     */
    @JsonIgnore
    public String getNavPSDERName(){
        Object objValue = this.get(FIELD_NAVPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavPSDERNameDirty(){
        if(this.contains(FIELD_NAVPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图关系
     */
    @JsonIgnore
    public void resetNavPSDERName(){
        this.reset(FIELD_NAVPSDERNAME);
    }

    /**
     * 设置 导航视图关系，详细说明：{@link #FIELD_NAVPSDERNAME}
     * <P>
     * 等同 {@link #setNavPSDERName}
     * @param navPSDERName
     */
    @JsonIgnore
    public PSDEDataView navpsdername(String navPSDERName){
        this.setNavPSDERName(navPSDERName);
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASEID</B>&nbsp;导航视图，指定卡片视图部件默认的导航关系视图，此配置在卡片导航视图启用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_NAVPSDEVIEWBASEID = "navpsdeviewbaseid";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASEID}
     * 
     * @param navPSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_NAVPSDEVIEWBASEID)
    public void setNavPSDEViewBaseId(String navPSDEViewBaseId){
        this.set(FIELD_NAVPSDEVIEWBASEID, navPSDEViewBaseId);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getNavPSDEViewBaseId(){
        Object objValue = this.get(FIELD_NAVPSDEVIEWBASEID);
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
    public boolean isNavPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_NAVPSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetNavPSDEViewBaseId(){
        this.reset(FIELD_NAVPSDEVIEWBASEID);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setNavPSDEViewBaseId}
     * @param navPSDEViewBaseId
     */
    @JsonIgnore
    public PSDEDataView navpsdeviewbaseid(String navPSDEViewBaseId){
        this.setNavPSDEViewBaseId(navPSDEViewBaseId);
        return this;
    }

    /**
     * 设置 导航视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEDataView navpsdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setNavPSDEViewBaseId(null);
            this.setNavPSDEViewBaseName(null);
        }
        else{
            this.setNavPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setNavPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>NAVPSDEVIEWBASENAME</B>&nbsp;导航视图，指定卡片视图部件默认的导航关系视图，此配置在卡片导航视图启用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVPSDEVIEWBASEID}
     */
    public final static String FIELD_NAVPSDEVIEWBASENAME = "navpsdeviewbasename";

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASENAME}
     * 
     * @param navPSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_NAVPSDEVIEWBASENAME)
    public void setNavPSDEViewBaseName(String navPSDEViewBaseName){
        this.set(FIELD_NAVPSDEVIEWBASENAME, navPSDEViewBaseName);
    }
    
    /**
     * 获取 导航视图  
     * @return
     */
    @JsonIgnore
    public String getNavPSDEViewBaseName(){
        Object objValue = this.get(FIELD_NAVPSDEVIEWBASENAME);
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
    public boolean isNavPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_NAVPSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图
     */
    @JsonIgnore
    public void resetNavPSDEViewBaseName(){
        this.reset(FIELD_NAVPSDEVIEWBASENAME);
    }

    /**
     * 设置 导航视图，详细说明：{@link #FIELD_NAVPSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setNavPSDEViewBaseName}
     * @param navPSDEViewBaseName
     */
    @JsonIgnore
    public PSDEDataView navpsdeviewbasename(String navPSDEViewBaseName){
        this.setNavPSDEViewBaseName(navPSDEViewBaseName);
        return this;
    }

    /**
     * <B>NAVVIEWFILTER</B>&nbsp;导航视图过滤项，指定卡片视图部件关联导航视图的过滤项名称，导航视图一般使用应用上下文自动进行数据过滤，指定过滤项将为导航视图显示传入过滤条件
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
    public PSDEDataView navviewfilter(String navViewFilter){
        this.setNavViewFilter(navViewFilter);
        return this;
    }

    /**
     * <B>NAVVIEWHEIGHT</B>&nbsp;导航视图高度
     */
    public final static String FIELD_NAVVIEWHEIGHT = "navviewheight";

    /**
     * 设置 导航视图高度
     * 
     * @param navViewHeight
     * 
     */
    @JsonProperty(FIELD_NAVVIEWHEIGHT)
    public void setNavViewHeight(Double navViewHeight){
        this.set(FIELD_NAVVIEWHEIGHT, navViewHeight);
    }
    
    /**
     * 获取 导航视图高度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewHeight(){
        Object objValue = this.get(FIELD_NAVVIEWHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewHeightDirty(){
        if(this.contains(FIELD_NAVVIEWHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图高度
     */
    @JsonIgnore
    public void resetNavViewHeight(){
        this.reset(FIELD_NAVVIEWHEIGHT);
    }

    /**
     * 设置 导航视图高度
     * <P>
     * 等同 {@link #setNavViewHeight}
     * @param navViewHeight
     */
    @JsonIgnore
    public PSDEDataView navviewheight(Double navViewHeight){
        this.setNavViewHeight(navViewHeight);
        return this;
    }

    /**
     * <B>NAVVIEWMAXHEIGHT</B>&nbsp;导航视图最大高度
     */
    public final static String FIELD_NAVVIEWMAXHEIGHT = "navviewmaxheight";

    /**
     * 设置 导航视图最大高度
     * 
     * @param navViewMaxHeight
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMAXHEIGHT)
    public void setNavViewMaxHeight(Double navViewMaxHeight){
        this.set(FIELD_NAVVIEWMAXHEIGHT, navViewMaxHeight);
    }
    
    /**
     * 获取 导航视图最大高度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMaxHeight(){
        Object objValue = this.get(FIELD_NAVVIEWMAXHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最大高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMaxHeightDirty(){
        if(this.contains(FIELD_NAVVIEWMAXHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最大高度
     */
    @JsonIgnore
    public void resetNavViewMaxHeight(){
        this.reset(FIELD_NAVVIEWMAXHEIGHT);
    }

    /**
     * 设置 导航视图最大高度
     * <P>
     * 等同 {@link #setNavViewMaxHeight}
     * @param navViewMaxHeight
     */
    @JsonIgnore
    public PSDEDataView navviewmaxheight(Double navViewMaxHeight){
        this.setNavViewMaxHeight(navViewMaxHeight);
        return this;
    }

    /**
     * <B>NAVVIEWMAXWIDTH</B>&nbsp;导航视图最大宽度
     */
    public final static String FIELD_NAVVIEWMAXWIDTH = "navviewmaxwidth";

    /**
     * 设置 导航视图最大宽度
     * 
     * @param navViewMaxWidth
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMAXWIDTH)
    public void setNavViewMaxWidth(Double navViewMaxWidth){
        this.set(FIELD_NAVVIEWMAXWIDTH, navViewMaxWidth);
    }
    
    /**
     * 获取 导航视图最大宽度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMaxWidth(){
        Object objValue = this.get(FIELD_NAVVIEWMAXWIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最大宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMaxWidthDirty(){
        if(this.contains(FIELD_NAVVIEWMAXWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最大宽度
     */
    @JsonIgnore
    public void resetNavViewMaxWidth(){
        this.reset(FIELD_NAVVIEWMAXWIDTH);
    }

    /**
     * 设置 导航视图最大宽度
     * <P>
     * 等同 {@link #setNavViewMaxWidth}
     * @param navViewMaxWidth
     */
    @JsonIgnore
    public PSDEDataView navviewmaxwidth(Double navViewMaxWidth){
        this.setNavViewMaxWidth(navViewMaxWidth);
        return this;
    }

    /**
     * <B>NAVVIEWMINHEIGHT</B>&nbsp;导航视图最小高度
     */
    public final static String FIELD_NAVVIEWMINHEIGHT = "navviewminheight";

    /**
     * 设置 导航视图最小高度
     * 
     * @param navViewMinHeight
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMINHEIGHT)
    public void setNavViewMinHeight(Double navViewMinHeight){
        this.set(FIELD_NAVVIEWMINHEIGHT, navViewMinHeight);
    }
    
    /**
     * 获取 导航视图最小高度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMinHeight(){
        Object objValue = this.get(FIELD_NAVVIEWMINHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最小高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMinHeightDirty(){
        if(this.contains(FIELD_NAVVIEWMINHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最小高度
     */
    @JsonIgnore
    public void resetNavViewMinHeight(){
        this.reset(FIELD_NAVVIEWMINHEIGHT);
    }

    /**
     * 设置 导航视图最小高度
     * <P>
     * 等同 {@link #setNavViewMinHeight}
     * @param navViewMinHeight
     */
    @JsonIgnore
    public PSDEDataView navviewminheight(Double navViewMinHeight){
        this.setNavViewMinHeight(navViewMinHeight);
        return this;
    }

    /**
     * <B>NAVVIEWMINWIDTH</B>&nbsp;导航视图最小宽度
     */
    public final static String FIELD_NAVVIEWMINWIDTH = "navviewminwidth";

    /**
     * 设置 导航视图最小宽度
     * 
     * @param navViewMinWidth
     * 
     */
    @JsonProperty(FIELD_NAVVIEWMINWIDTH)
    public void setNavViewMinWidth(Double navViewMinWidth){
        this.set(FIELD_NAVVIEWMINWIDTH, navViewMinWidth);
    }
    
    /**
     * 获取 导航视图最小宽度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewMinWidth(){
        Object objValue = this.get(FIELD_NAVVIEWMINWIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图最小宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewMinWidthDirty(){
        if(this.contains(FIELD_NAVVIEWMINWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图最小宽度
     */
    @JsonIgnore
    public void resetNavViewMinWidth(){
        this.reset(FIELD_NAVVIEWMINWIDTH);
    }

    /**
     * 设置 导航视图最小宽度
     * <P>
     * 等同 {@link #setNavViewMinWidth}
     * @param navViewMinWidth
     */
    @JsonIgnore
    public PSDEDataView navviewminwidth(Double navViewMinWidth){
        this.setNavViewMinWidth(navViewMinWidth);
        return this;
    }

    /**
     * <B>NAVVIEWPARAM</B>&nbsp;导航视图参数，指定卡片视图部件关联导航视图的额外参数
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
    public PSDEDataView navviewparam(String navViewParam){
        this.setNavViewParam(navViewParam);
        return this;
    }

    /**
     * <B>NAVVIEWPOS</B>&nbsp;导航视图位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NavViewPos} 
     */
    public final static String FIELD_NAVVIEWPOS = "navviewpos";

    /**
     * 设置 导航视图位置
     * 
     * @param navViewPos
     * 
     */
    @JsonProperty(FIELD_NAVVIEWPOS)
    public void setNavViewPos(String navViewPos){
        this.set(FIELD_NAVVIEWPOS, navViewPos);
    }
    
    /**
     * 获取 导航视图位置  
     * @return
     */
    @JsonIgnore
    public String getNavViewPos(){
        Object objValue = this.get(FIELD_NAVVIEWPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航视图位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewPosDirty(){
        if(this.contains(FIELD_NAVVIEWPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图位置
     */
    @JsonIgnore
    public void resetNavViewPos(){
        this.reset(FIELD_NAVVIEWPOS);
    }

    /**
     * 设置 导航视图位置
     * <P>
     * 等同 {@link #setNavViewPos}
     * @param navViewPos
     */
    @JsonIgnore
    public PSDEDataView navviewpos(String navViewPos){
        this.setNavViewPos(navViewPos);
        return this;
    }

     /**
     * 设置 导航视图位置
     * <P>
     * 等同 {@link #setNavViewPos}
     * @param navViewPos
     */
    @JsonIgnore
    public PSDEDataView navviewpos(net.ibizsys.psmodel.core.util.PSModelEnums.NavViewPos navViewPos){
        if(navViewPos == null){
            this.setNavViewPos(null);
        }
        else{
            this.setNavViewPos(navViewPos.value);
        }
        return this;
    }

    /**
     * <B>NAVVIEWSHOWMODE</B>&nbsp;导航视图显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NavViewShowMode} 
     */
    public final static String FIELD_NAVVIEWSHOWMODE = "navviewshowmode";

    /**
     * 设置 导航视图显示模式
     * 
     * @param navViewShowMode
     * 
     */
    @JsonProperty(FIELD_NAVVIEWSHOWMODE)
    public void setNavViewShowMode(Integer navViewShowMode){
        this.set(FIELD_NAVVIEWSHOWMODE, navViewShowMode);
    }
    
    /**
     * 获取 导航视图显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNavViewShowMode(){
        Object objValue = this.get(FIELD_NAVVIEWSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导航视图显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewShowModeDirty(){
        if(this.contains(FIELD_NAVVIEWSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图显示模式
     */
    @JsonIgnore
    public void resetNavViewShowMode(){
        this.reset(FIELD_NAVVIEWSHOWMODE);
    }

    /**
     * 设置 导航视图显示模式
     * <P>
     * 等同 {@link #setNavViewShowMode}
     * @param navViewShowMode
     */
    @JsonIgnore
    public PSDEDataView navviewshowmode(Integer navViewShowMode){
        this.setNavViewShowMode(navViewShowMode);
        return this;
    }

     /**
     * 设置 导航视图显示模式
     * <P>
     * 等同 {@link #setNavViewShowMode}
     * @param navViewShowMode
     */
    @JsonIgnore
    public PSDEDataView navviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.NavViewShowMode navViewShowMode){
        if(navViewShowMode == null){
            this.setNavViewShowMode(null);
        }
        else{
            this.setNavViewShowMode(navViewShowMode.value);
        }
        return this;
    }

    /**
     * <B>NAVVIEWWIDTH</B>&nbsp;导航视图宽度
     */
    public final static String FIELD_NAVVIEWWIDTH = "navviewwidth";

    /**
     * 设置 导航视图宽度
     * 
     * @param navViewWidth
     * 
     */
    @JsonProperty(FIELD_NAVVIEWWIDTH)
    public void setNavViewWidth(Double navViewWidth){
        this.set(FIELD_NAVVIEWWIDTH, navViewWidth);
    }
    
    /**
     * 获取 导航视图宽度  
     * @return
     */
    @JsonIgnore
    public Double getNavViewWidth(){
        Object objValue = this.get(FIELD_NAVVIEWWIDTH);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 导航视图宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavViewWidthDirty(){
        if(this.contains(FIELD_NAVVIEWWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航视图宽度
     */
    @JsonIgnore
    public void resetNavViewWidth(){
        this.reset(FIELD_NAVVIEWWIDTH);
    }

    /**
     * 设置 导航视图宽度
     * <P>
     * 等同 {@link #setNavViewWidth}
     * @param navViewWidth
     */
    @JsonIgnore
    public PSDEDataView navviewwidth(Double navViewWidth){
        this.setNavViewWidth(navViewWidth);
        return this;
    }

    /**
     * <B>NO2PSDEUAGROUPID</B>&nbsp;右滑行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_NO2PSDEUAGROUPID = "no2psdeuagroupid";

    /**
     * 设置 右滑行为组
     * 
     * @param no2PSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPID)
    public void setNo2PSDEUAGroupId(String no2PSDEUAGroupId){
        this.set(FIELD_NO2PSDEUAGROUPID, no2PSDEUAGroupId);
    }
    
    /**
     * 获取 右滑行为组  
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
     * 判断 右滑行为组 是否指定值，包括空值
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
     * 重置 右滑行为组
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupId(){
        this.reset(FIELD_NO2PSDEUAGROUPID);
    }

    /**
     * 设置 右滑行为组
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param no2PSDEUAGroupId
     */
    @JsonIgnore
    public PSDEDataView no2psdeuagroupid(String no2PSDEUAGroupId){
        this.setNo2PSDEUAGroupId(no2PSDEUAGroupId);
        return this;
    }

    /**
     * 设置 右滑行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEDataView no2psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>NO2PSDEUAGROUPNAME</B>&nbsp;右滑行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEUAGROUPID}
     */
    public final static String FIELD_NO2PSDEUAGROUPNAME = "no2psdeuagroupname";

    /**
     * 设置 右滑行为组
     * 
     * @param no2PSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEUAGROUPNAME)
    public void setNo2PSDEUAGroupName(String no2PSDEUAGroupName){
        this.set(FIELD_NO2PSDEUAGROUPNAME, no2PSDEUAGroupName);
    }
    
    /**
     * 获取 右滑行为组  
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
     * 判断 右滑行为组 是否指定值，包括空值
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
     * 重置 右滑行为组
     */
    @JsonIgnore
    public void resetNo2PSDEUAGroupName(){
        this.reset(FIELD_NO2PSDEUAGROUPNAME);
    }

    /**
     * 设置 右滑行为组
     * <P>
     * 等同 {@link #setNo2PSDEUAGroupName}
     * @param no2PSDEUAGroupName
     */
    @JsonIgnore
    public PSDEDataView no2psdeuagroupname(String no2PSDEUAGroupName){
        this.setNo2PSDEUAGroupName(no2PSDEUAGroupName);
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;默认禁用排序，指定是否默认禁用卡片视图项的排序能力，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSORT = "nosort";

    /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * 
     * @param noSort
     * 
     */
    @JsonProperty(FIELD_NOSORT)
    public void setNoSort(Integer noSort){
        this.set(FIELD_NOSORT, noSort);
    }
    
    /**
     * 获取 默认禁用排序  
     * @return
     */
    @JsonIgnore
    public Integer getNoSort(){
        Object objValue = this.get(FIELD_NOSORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认禁用排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSortDirty(){
        if(this.contains(FIELD_NOSORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认禁用排序
     */
    @JsonIgnore
    public void resetNoSort(){
        this.reset(FIELD_NOSORT);
    }

    /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEDataView nosort(Integer noSort){
        this.setNoSort(noSort);
        return this;
    }

     /**
     * 设置 默认禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEDataView nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFID</B>&nbsp;排序值属性，指定卡片视图部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用卡片排序功能需要指定排序值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ORDERVALUEPSDEFID = "ordervaluepsdefid";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * 
     * @param orderValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFID)
    public void setOrderValuePSDEFId(String orderValuePSDEFId){
        this.set(FIELD_ORDERVALUEPSDEFID, orderValuePSDEFId);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFId(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFIdDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFId(){
        this.reset(FIELD_ORDERVALUEPSDEFID);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFID}
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param orderValuePSDEFId
     */
    @JsonIgnore
    public PSDEDataView ordervaluepsdefid(String orderValuePSDEFId){
        this.setOrderValuePSDEFId(orderValuePSDEFId);
        return this;
    }

    /**
     * 设置 排序值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOrderValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDataView ordervaluepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setOrderValuePSDEFId(null);
            this.setOrderValuePSDEFName(null);
        }
        else{
            this.setOrderValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setOrderValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ORDERVALUEPSDEFNAME</B>&nbsp;排序值属性，指定卡片视图部件的排序值属性，未指定时使用所在实体的默认排序值属性，启用卡片排序功能需要指定排序值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ORDERVALUEPSDEFID}
     */
    public final static String FIELD_ORDERVALUEPSDEFNAME = "ordervaluepsdefname";

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * 
     * @param orderValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ORDERVALUEPSDEFNAME)
    public void setOrderValuePSDEFName(String orderValuePSDEFName){
        this.set(FIELD_ORDERVALUEPSDEFNAME, orderValuePSDEFName);
    }
    
    /**
     * 获取 排序值属性  
     * @return
     */
    @JsonIgnore
    public String getOrderValuePSDEFName(){
        Object objValue = this.get(FIELD_ORDERVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValuePSDEFNameDirty(){
        if(this.contains(FIELD_ORDERVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值属性
     */
    @JsonIgnore
    public void resetOrderValuePSDEFName(){
        this.reset(FIELD_ORDERVALUEPSDEFNAME);
    }

    /**
     * 设置 排序值属性，详细说明：{@link #FIELD_ORDERVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setOrderValuePSDEFName}
     * @param orderValuePSDEFName
     */
    @JsonIgnore
    public PSDEDataView ordervaluepsdefname(String orderValuePSDEFName){
        this.setOrderValuePSDEFName(orderValuePSDEFName);
        return this;
    }

    /**
     * <B>PAGINGSIZE</B>&nbsp;分页数量，启用卡片视图部件分页工具栏时，指定分页的大小，未指定时为【20】
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
    public PSDEDataView pagingsize(Integer pagingSize){
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
    public PSDEDataView pagingsize(net.ibizsys.psmodel.core.util.PSModelEnums.PagingSize pagingSize){
        if(pagingSize == null){
            this.setPagingSize(null);
        }
        else{
            this.setPagingSize(pagingSize.value);
        }
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定卡片视图部件的默认界面处理对象
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
    public PSDEDataView psachandlerid(String pSACHandlerId){
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
    public PSDEDataView psachandlerid(PSACHandler pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定卡片视图部件的默认界面处理对象
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
    public PSDEDataView psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定卡片视图部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
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
    public PSDEDataView psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEDataView psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定卡片视图部件默认附加的部件逻辑组对象
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
    public PSDEDataView psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定卡片视图部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlMsg} 
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
    public PSDEDataView psctrlmsgid(String pSCtrlMsgId){
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
    public PSDEDataView psctrlmsgid(PSCtrlMsg pSCtrlMsg){
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
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定卡片视图部件默认的部件消息对象
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
    public PSDEDataView psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;默认数据集合，指定卡片视图部件的默认数据集合，来自卡片部件所在的实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 默认数据集合  
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
     * 判断 默认数据集合 是否指定值，包括空值
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
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEDataView psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 默认数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDataView psdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;默认数据集合，指定卡片视图部件的默认数据集合，来自卡片部件所在的实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 默认数据集合  
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
     * 判断 默认数据集合 是否指定值，包括空值
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
     * 重置 默认数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 默认数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEDataView psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEDATAVIEWID</B>&nbsp;实体卡片视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATAVIEWID = "psdedataviewid";

    /**
     * 设置 实体卡片视图标识
     * 
     * @param pSDEDataViewId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWID)
    public void setPSDEDataViewId(String pSDEDataViewId){
        this.set(FIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }
    
    /**
     * 获取 实体卡片视图标识  
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
     * 判断 实体卡片视图标识 是否指定值，包括空值
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
     * 重置 实体卡片视图标识
     */
    @JsonIgnore
    public void resetPSDEDataViewId(){
        this.reset(FIELD_PSDEDATAVIEWID);
    }

    /**
     * 设置 实体卡片视图标识
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataViewId
     */
    @JsonIgnore
    public PSDEDataView psdedataviewid(String pSDEDataViewId){
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    /**
     * <B>PSDEDATAVIEWNAME</B>&nbsp;卡片视图名称，指定卡片视图部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDATAVIEWNAME = "psdedataviewname";

    /**
     * 设置 卡片视图名称，详细说明：{@link #FIELD_PSDEDATAVIEWNAME}
     * 
     * @param pSDEDataViewName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWNAME)
    public void setPSDEDataViewName(String pSDEDataViewName){
        this.set(FIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }
    
    /**
     * 获取 卡片视图名称  
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
     * 判断 卡片视图名称 是否指定值，包括空值
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
     * 重置 卡片视图名称
     */
    @JsonIgnore
    public void resetPSDEDataViewName(){
        this.reset(FIELD_PSDEDATAVIEWNAME);
    }

    /**
     * 设置 卡片视图名称，详细说明：{@link #FIELD_PSDEDATAVIEWNAME}
     * <P>
     * 等同 {@link #setPSDEDataViewName}
     * @param pSDEDataViewName
     */
    @JsonIgnore
    public PSDEDataView psdedataviewname(String pSDEDataViewName){
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataViewName(strName);
    }

    @JsonIgnore
    public PSDEDataView name(String strName){
        this.setPSDEDataViewName(strName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;数据视图项布局表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 数据视图项布局表单
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 数据视图项布局表单  
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
     * 判断 数据视图项布局表单 是否指定值，包括空值
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
     * 重置 数据视图项布局表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 数据视图项布局表单
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEDataView psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 数据视图项布局表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEDataView psdeformid(PSDEForm pSDEForm){
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
     * <B>PSDEFORMNAME</B>&nbsp;数据视图项布局表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 数据视图项布局表单
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 数据视图项布局表单  
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
     * 判断 数据视图项布局表单 是否指定值，包括空值
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
     * 重置 数据视图项布局表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 数据视图项布局表单
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEDataView psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定卡片视图部件所在的实体对象
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
    public PSDEDataView psdeid(String pSDEId){
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
    public PSDEDataView psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定卡片视图部件所在的实体对象
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
    public PSDEDataView psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;左滑行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 左滑行为组
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 左滑行为组  
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
     * 判断 左滑行为组 是否指定值，包括空值
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
     * 重置 左滑行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 左滑行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEDataView psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 左滑行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEDataView psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;左滑行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 左滑行为组
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 左滑行为组  
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
     * 判断 左滑行为组 是否指定值，包括空值
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
     * 重置 左滑行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 左滑行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEDataView psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;部件样式，指定卡片视图部件默认的容器界面样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 部件样式  
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
     * 判断 部件样式 是否指定值，包括空值
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
     * 重置 部件样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEDataView pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEDataView pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定卡片视图部件默认的容器界面样式表对象
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
    public PSDEDataView pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体数据视图使用的前端模板扩展插件，使用插件类型【数据视图绘制插件】
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
    public PSDEDataView pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEDataView pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体数据视图使用的前端模板扩展插件，使用插件类型【数据视图绘制插件】
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
    public PSDEDataView pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;卡片布局面板，指定卡片项的布局面板对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 卡片布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 卡片布局面板  
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
     * 判断 卡片布局面板 是否指定值，包括空值
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
     * 重置 卡片布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 卡片布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEDataView pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 卡片布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEDataView pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
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
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;卡片布局面板，指定卡片项的布局面板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 卡片布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 卡片布局面板  
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
     * 判断 卡片布局面板 是否指定值，包括空值
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
     * 重置 卡片布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 卡片布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEDataView pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSDEDataView psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 视图消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSDEDataView psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSDEDataView psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARID</B>&nbsp;快速操作工具栏，指定卡片视图部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEToolbar} 
     */
    public final static String FIELD_QUICKPSDETOOLBARID = "quickpsdetoolbarid";

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARID}
     * 
     * @param quickPSDEToolbarId
     * 
     */
    @JsonProperty(FIELD_QUICKPSDETOOLBARID)
    public void setQuickPSDEToolbarId(String quickPSDEToolbarId){
        this.set(FIELD_QUICKPSDETOOLBARID, quickPSDEToolbarId);
    }
    
    /**
     * 获取 快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEToolbarId(){
        Object objValue = this.get(FIELD_QUICKPSDETOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEToolbarIdDirty(){
        if(this.contains(FIELD_QUICKPSDETOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速操作工具栏
     */
    @JsonIgnore
    public void resetQuickPSDEToolbarId(){
        this.reset(FIELD_QUICKPSDETOOLBARID);
    }

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARID}
     * <P>
     * 等同 {@link #setQuickPSDEToolbarId}
     * @param quickPSDEToolbarId
     */
    @JsonIgnore
    public PSDEDataView quickpsdetoolbarid(String quickPSDEToolbarId){
        this.setQuickPSDEToolbarId(quickPSDEToolbarId);
        return this;
    }

    /**
     * 设置 快速操作工具栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setQuickPSDEToolbarId}
     * @param pSDEToolbar 引用对象
     */
    @JsonIgnore
    public PSDEDataView quickpsdetoolbarid(PSDEToolbar pSDEToolbar){
        if(pSDEToolbar == null){
            this.setQuickPSDEToolbarId(null);
            this.setQuickPSDEToolbarName(null);
        }
        else{
            this.setQuickPSDEToolbarId(pSDEToolbar.getPSDEToolbarId());
            this.setQuickPSDEToolbarName(pSDEToolbar.getPSDEToolbarName());
        }
        return this;
    }

    /**
     * <B>QUICKPSDETOOLBARNAME</B>&nbsp;快速操作工具栏，指定卡片视图部件内建的快速操作工具栏对象，快速操作工具栏一般用于新建等无选择数据的操作
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_QUICKPSDETOOLBARID}
     */
    public final static String FIELD_QUICKPSDETOOLBARNAME = "quickpsdetoolbarname";

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARNAME}
     * 
     * @param quickPSDEToolbarName
     * 
     */
    @JsonProperty(FIELD_QUICKPSDETOOLBARNAME)
    public void setQuickPSDEToolbarName(String quickPSDEToolbarName){
        this.set(FIELD_QUICKPSDETOOLBARNAME, quickPSDEToolbarName);
    }
    
    /**
     * 获取 快速操作工具栏  
     * @return
     */
    @JsonIgnore
    public String getQuickPSDEToolbarName(){
        Object objValue = this.get(FIELD_QUICKPSDETOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速操作工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQuickPSDEToolbarNameDirty(){
        if(this.contains(FIELD_QUICKPSDETOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速操作工具栏
     */
    @JsonIgnore
    public void resetQuickPSDEToolbarName(){
        this.reset(FIELD_QUICKPSDETOOLBARNAME);
    }

    /**
     * 设置 快速操作工具栏，详细说明：{@link #FIELD_QUICKPSDETOOLBARNAME}
     * <P>
     * 等同 {@link #setQuickPSDEToolbarName}
     * @param quickPSDEToolbarName
     */
    @JsonIgnore
    public PSDEDataView quickpsdetoolbarname(String quickPSDEToolbarName){
        this.setQuickPSDEToolbarName(quickPSDEToolbarName);
        return this;
    }

    /**
     * <B>REMOVEPSDEACTIONID</B>&nbsp;删除数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_REMOVEPSDEACTIONID = "removepsdeactionid";

    /**
     * 设置 删除数据实体行为
     * 
     * @param removePSDEActionId
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONID)
    public void setRemovePSDEActionId(String removePSDEActionId){
        this.set(FIELD_REMOVEPSDEACTIONID, removePSDEActionId);
    }
    
    /**
     * 获取 删除数据实体行为  
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
     * 判断 删除数据实体行为 是否指定值，包括空值
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
     * 重置 删除数据实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionId(){
        this.reset(FIELD_REMOVEPSDEACTIONID);
    }

    /**
     * 设置 删除数据实体行为
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param removePSDEActionId
     */
    @JsonIgnore
    public PSDEDataView removepsdeactionid(String removePSDEActionId){
        this.setRemovePSDEActionId(removePSDEActionId);
        return this;
    }

    /**
     * 设置 删除数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemovePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView removepsdeactionid(PSDEAction pSDEAction){
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
     * <B>REMOVEPSDEACTIONNAME</B>&nbsp;删除数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEPSDEACTIONID}
     */
    public final static String FIELD_REMOVEPSDEACTIONNAME = "removepsdeactionname";

    /**
     * 设置 删除数据实体行为
     * 
     * @param removePSDEActionName
     * 
     */
    @JsonProperty(FIELD_REMOVEPSDEACTIONNAME)
    public void setRemovePSDEActionName(String removePSDEActionName){
        this.set(FIELD_REMOVEPSDEACTIONNAME, removePSDEActionName);
    }
    
    /**
     * 获取 删除数据实体行为  
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
     * 判断 删除数据实体行为 是否指定值，包括空值
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
     * 重置 删除数据实体行为
     */
    @JsonIgnore
    public void resetRemovePSDEActionName(){
        this.reset(FIELD_REMOVEPSDEACTIONNAME);
    }

    /**
     * 设置 删除数据实体行为
     * <P>
     * 等同 {@link #setRemovePSDEActionName}
     * @param removePSDEActionName
     */
    @JsonIgnore
    public PSDEDataView removepsdeactionname(String removePSDEActionName){
        this.setRemovePSDEActionName(removePSDEActionName);
        return this;
    }

    /**
     * <B>SWIMLANEPSCODELISTID</B>&nbsp;泳道代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_SWIMLANEPSCODELISTID = "swimlanepscodelistid";

    /**
     * 设置 泳道代码表
     * 
     * @param swimlanePSCodeListId
     * 
     */
    @JsonProperty(FIELD_SWIMLANEPSCODELISTID)
    public void setSwimlanePSCodeListId(String swimlanePSCodeListId){
        this.set(FIELD_SWIMLANEPSCODELISTID, swimlanePSCodeListId);
    }
    
    /**
     * 获取 泳道代码表  
     * @return
     */
    @JsonIgnore
    public String getSwimlanePSCodeListId(){
        Object objValue = this.get(FIELD_SWIMLANEPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 泳道代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwimlanePSCodeListIdDirty(){
        if(this.contains(FIELD_SWIMLANEPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 泳道代码表
     */
    @JsonIgnore
    public void resetSwimlanePSCodeListId(){
        this.reset(FIELD_SWIMLANEPSCODELISTID);
    }

    /**
     * 设置 泳道代码表
     * <P>
     * 等同 {@link #setSwimlanePSCodeListId}
     * @param swimlanePSCodeListId
     */
    @JsonIgnore
    public PSDEDataView swimlanepscodelistid(String swimlanePSCodeListId){
        this.setSwimlanePSCodeListId(swimlanePSCodeListId);
        return this;
    }

    /**
     * 设置 泳道代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSwimlanePSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEDataView swimlanepscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setSwimlanePSCodeListId(null);
            this.setSwimlanePSCodeListName(null);
        }
        else{
            this.setSwimlanePSCodeListId(pSCodeList.getPSCodeListId());
            this.setSwimlanePSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>SWIMLANEPSCODELISTNAME</B>&nbsp;泳道代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SWIMLANEPSCODELISTID}
     */
    public final static String FIELD_SWIMLANEPSCODELISTNAME = "swimlanepscodelistname";

    /**
     * 设置 泳道代码表
     * 
     * @param swimlanePSCodeListName
     * 
     */
    @JsonProperty(FIELD_SWIMLANEPSCODELISTNAME)
    public void setSwimlanePSCodeListName(String swimlanePSCodeListName){
        this.set(FIELD_SWIMLANEPSCODELISTNAME, swimlanePSCodeListName);
    }
    
    /**
     * 获取 泳道代码表  
     * @return
     */
    @JsonIgnore
    public String getSwimlanePSCodeListName(){
        Object objValue = this.get(FIELD_SWIMLANEPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 泳道代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwimlanePSCodeListNameDirty(){
        if(this.contains(FIELD_SWIMLANEPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 泳道代码表
     */
    @JsonIgnore
    public void resetSwimlanePSCodeListName(){
        this.reset(FIELD_SWIMLANEPSCODELISTNAME);
    }

    /**
     * 设置 泳道代码表
     * <P>
     * 等同 {@link #setSwimlanePSCodeListName}
     * @param swimlanePSCodeListName
     */
    @JsonIgnore
    public PSDEDataView swimlanepscodelistname(String swimlanePSCodeListName){
        this.setSwimlanePSCodeListName(swimlanePSCodeListName);
        return this;
    }

    /**
     * <B>SWIMLANEPSDEFID</B>&nbsp;泳道属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SWIMLANEPSDEFID = "swimlanepsdefid";

    /**
     * 设置 泳道属性
     * 
     * @param swimlanePSDEFId
     * 
     */
    @JsonProperty(FIELD_SWIMLANEPSDEFID)
    public void setSwimlanePSDEFId(String swimlanePSDEFId){
        this.set(FIELD_SWIMLANEPSDEFID, swimlanePSDEFId);
    }
    
    /**
     * 获取 泳道属性  
     * @return
     */
    @JsonIgnore
    public String getSwimlanePSDEFId(){
        Object objValue = this.get(FIELD_SWIMLANEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 泳道属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwimlanePSDEFIdDirty(){
        if(this.contains(FIELD_SWIMLANEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 泳道属性
     */
    @JsonIgnore
    public void resetSwimlanePSDEFId(){
        this.reset(FIELD_SWIMLANEPSDEFID);
    }

    /**
     * 设置 泳道属性
     * <P>
     * 等同 {@link #setSwimlanePSDEFId}
     * @param swimlanePSDEFId
     */
    @JsonIgnore
    public PSDEDataView swimlanepsdefid(String swimlanePSDEFId){
        this.setSwimlanePSDEFId(swimlanePSDEFId);
        return this;
    }

    /**
     * 设置 泳道属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSwimlanePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDataView swimlanepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setSwimlanePSDEFId(null);
            this.setSwimlanePSDEFName(null);
        }
        else{
            this.setSwimlanePSDEFId(pSDEField.getPSDEFieldId());
            this.setSwimlanePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SWIMLANEPSDEFNAME</B>&nbsp;泳道属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SWIMLANEPSDEFID}
     */
    public final static String FIELD_SWIMLANEPSDEFNAME = "swimlanepsdefname";

    /**
     * 设置 泳道属性
     * 
     * @param swimlanePSDEFName
     * 
     */
    @JsonProperty(FIELD_SWIMLANEPSDEFNAME)
    public void setSwimlanePSDEFName(String swimlanePSDEFName){
        this.set(FIELD_SWIMLANEPSDEFNAME, swimlanePSDEFName);
    }
    
    /**
     * 获取 泳道属性  
     * @return
     */
    @JsonIgnore
    public String getSwimlanePSDEFName(){
        Object objValue = this.get(FIELD_SWIMLANEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 泳道属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSwimlanePSDEFNameDirty(){
        if(this.contains(FIELD_SWIMLANEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 泳道属性
     */
    @JsonIgnore
    public void resetSwimlanePSDEFName(){
        this.reset(FIELD_SWIMLANEPSDEFNAME);
    }

    /**
     * 设置 泳道属性
     * <P>
     * 等同 {@link #setSwimlanePSDEFName}
     * @param swimlanePSDEFName
     */
    @JsonIgnore
    public PSDEDataView swimlanepsdefname(String swimlanePSDEFName){
        this.setSwimlanePSDEFName(swimlanePSDEFName);
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
    public PSDEDataView updatedate(String updateDate){
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
    public PSDEDataView updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPSDEACTIONID</B>&nbsp;更新数据实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_UPDATEPSDEACTIONID = "updatepsdeactionid";

    /**
     * 设置 更新数据实体行为
     * 
     * @param updatePSDEActionId
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONID)
    public void setUpdatePSDEActionId(String updatePSDEActionId){
        this.set(FIELD_UPDATEPSDEACTIONID, updatePSDEActionId);
    }
    
    /**
     * 获取 更新数据实体行为  
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
     * 判断 更新数据实体行为 是否指定值，包括空值
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
     * 重置 更新数据实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionId(){
        this.reset(FIELD_UPDATEPSDEACTIONID);
    }

    /**
     * 设置 更新数据实体行为
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param updatePSDEActionId
     */
    @JsonIgnore
    public PSDEDataView updatepsdeactionid(String updatePSDEActionId){
        this.setUpdatePSDEActionId(updatePSDEActionId);
        return this;
    }

    /**
     * 设置 更新数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUpdatePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView updatepsdeactionid(PSDEAction pSDEAction){
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
     * <B>UPDATEPSDEACTIONNAME</B>&nbsp;更新数据实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UPDATEPSDEACTIONID}
     */
    public final static String FIELD_UPDATEPSDEACTIONNAME = "updatepsdeactionname";

    /**
     * 设置 更新数据实体行为
     * 
     * @param updatePSDEActionName
     * 
     */
    @JsonProperty(FIELD_UPDATEPSDEACTIONNAME)
    public void setUpdatePSDEActionName(String updatePSDEActionName){
        this.set(FIELD_UPDATEPSDEACTIONNAME, updatePSDEActionName);
    }
    
    /**
     * 获取 更新数据实体行为  
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
     * 判断 更新数据实体行为 是否指定值，包括空值
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
     * 重置 更新数据实体行为
     */
    @JsonIgnore
    public void resetUpdatePSDEActionName(){
        this.reset(FIELD_UPDATEPSDEACTIONNAME);
    }

    /**
     * 设置 更新数据实体行为
     * <P>
     * 等同 {@link #setUpdatePSDEActionName}
     * @param updatePSDEActionName
     */
    @JsonIgnore
    public PSDEDataView updatepsdeactionname(String updatePSDEActionName){
        this.setUpdatePSDEActionName(updatePSDEActionName);
        return this;
    }

    /**
     * <B>USER2PSDEACTIONID</B>&nbsp;自定义实体行为2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_USER2PSDEACTIONID = "user2psdeactionid";

    /**
     * 设置 自定义实体行为2
     * 
     * @param user2PSDEActionId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEACTIONID)
    public void setUser2PSDEActionId(String user2PSDEActionId){
        this.set(FIELD_USER2PSDEACTIONID, user2PSDEActionId);
    }
    
    /**
     * 获取 自定义实体行为2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEActionId(){
        Object objValue = this.get(FIELD_USER2PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEActionIdDirty(){
        if(this.contains(FIELD_USER2PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为2
     */
    @JsonIgnore
    public void resetUser2PSDEActionId(){
        this.reset(FIELD_USER2PSDEACTIONID);
    }

    /**
     * 设置 自定义实体行为2
     * <P>
     * 等同 {@link #setUser2PSDEActionId}
     * @param user2PSDEActionId
     */
    @JsonIgnore
    public PSDEDataView user2psdeactionid(String user2PSDEActionId){
        this.setUser2PSDEActionId(user2PSDEActionId);
        return this;
    }

    /**
     * 设置 自定义实体行为2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView user2psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUser2PSDEActionId(null);
            this.setUser2PSDEActionName(null);
        }
        else{
            this.setUser2PSDEActionId(pSDEAction.getPSDEActionId());
            this.setUser2PSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEACTIONNAME</B>&nbsp;自定义实体行为2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEACTIONID}
     */
    public final static String FIELD_USER2PSDEACTIONNAME = "user2psdeactionname";

    /**
     * 设置 自定义实体行为2
     * 
     * @param user2PSDEActionName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEACTIONNAME)
    public void setUser2PSDEActionName(String user2PSDEActionName){
        this.set(FIELD_USER2PSDEACTIONNAME, user2PSDEActionName);
    }
    
    /**
     * 获取 自定义实体行为2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEActionName(){
        Object objValue = this.get(FIELD_USER2PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义实体行为2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEActionNameDirty(){
        if(this.contains(FIELD_USER2PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义实体行为2
     */
    @JsonIgnore
    public void resetUser2PSDEActionName(){
        this.reset(FIELD_USER2PSDEACTIONNAME);
    }

    /**
     * 设置 自定义实体行为2
     * <P>
     * 等同 {@link #setUser2PSDEActionName}
     * @param user2PSDEActionName
     */
    @JsonIgnore
    public PSDEDataView user2psdeactionname(String user2PSDEActionName){
        this.setUser2PSDEActionName(user2PSDEActionName);
        return this;
    }

    /**
     * <B>USERPSDEACTIONID</B>&nbsp;用户自定义实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_USERPSDEACTIONID = "userpsdeactionid";

    /**
     * 设置 用户自定义实体行为
     * 
     * @param userPSDEActionId
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONID)
    public void setUserPSDEActionId(String userPSDEActionId){
        this.set(FIELD_USERPSDEACTIONID, userPSDEActionId);
    }
    
    /**
     * 获取 用户自定义实体行为  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEActionId(){
        Object objValue = this.get(FIELD_USERPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEActionIdDirty(){
        if(this.contains(FIELD_USERPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionId(){
        this.reset(FIELD_USERPSDEACTIONID);
    }

    /**
     * 设置 用户自定义实体行为
     * <P>
     * 等同 {@link #setUserPSDEActionId}
     * @param userPSDEActionId
     */
    @JsonIgnore
    public PSDEDataView userpsdeactionid(String userPSDEActionId){
        this.setUserPSDEActionId(userPSDEActionId);
        return this;
    }

    /**
     * 设置 用户自定义实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDataView userpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setUserPSDEActionId(null);
            this.setUserPSDEActionName(null);
        }
        else{
            this.setUserPSDEActionId(pSDEAction.getPSDEActionId());
            this.setUserPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>USERPSDEACTIONNAME</B>&nbsp;用户自定义实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEACTIONID}
     */
    public final static String FIELD_USERPSDEACTIONNAME = "userpsdeactionname";

    /**
     * 设置 用户自定义实体行为
     * 
     * @param userPSDEActionName
     * 
     */
    @JsonProperty(FIELD_USERPSDEACTIONNAME)
    public void setUserPSDEActionName(String userPSDEActionName){
        this.set(FIELD_USERPSDEACTIONNAME, userPSDEActionName);
    }
    
    /**
     * 获取 用户自定义实体行为  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEActionName(){
        Object objValue = this.get(FIELD_USERPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEActionNameDirty(){
        if(this.contains(FIELD_USERPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义实体行为
     */
    @JsonIgnore
    public void resetUserPSDEActionName(){
        this.reset(FIELD_USERPSDEACTIONNAME);
    }

    /**
     * 设置 用户自定义实体行为
     * <P>
     * 等同 {@link #setUserPSDEActionName}
     * @param userPSDEActionName
     */
    @JsonIgnore
    public PSDEDataView userpsdeactionname(String userPSDEActionName){
        this.setUserPSDEActionName(userPSDEActionName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDataViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataViewId(strValue);
    }

    @JsonIgnore
    public PSDEDataView id(String strValue){
        this.setPSDEDataViewId(strValue);
        return this;
    }


    /**
     *  实体多数据部件项 成员集合
     */
    public final static String FIELD_PSDELISTITEM = "psdelistitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> psdelistitems;

    /**
     * 获取 实体多数据部件项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELISTITEM)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> getPSDEListItem(){
        return this.psdelistitems;
    }

    /**
     * 设置 实体多数据部件项 成员集合  
     * @param psdelistitems
     */
    @JsonProperty(FIELD_PSDELISTITEM)
    public void setPSDEListItem(java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> psdelistitems){
        this.psdelistitems = psdelistitems;
    }

    /**
     * 获取 实体多数据部件项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEListItem> getPSDEListItemIf(){
        if(this.psdelistitems == null){
            this.psdelistitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEListItem>();          
        }
        return this.psdelistitems;
    }


    /**
     *  卡片视图部件逻辑 成员集合
     */
    public final static String FIELD_PSDEDATAVIEWLOGICS = "psdedataviewlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataViewLogic> psdedataviewlogics;

    /**
     * 获取 卡片视图部件逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDATAVIEWLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataViewLogic> getPSDEDataViewLogics(){
        return this.psdedataviewlogics;
    }

    /**
     * 设置 卡片视图部件逻辑 成员集合  
     * @param psdedataviewlogics
     */
    @JsonProperty(FIELD_PSDEDATAVIEWLOGICS)
    public void setPSDEDataViewLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataViewLogic> psdedataviewlogics){
        this.psdedataviewlogics = psdedataviewlogics;
    }

    /**
     * 获取 卡片视图部件逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDataViewLogic> getPSDEDataViewLogicsIf(){
        if(this.psdedataviewlogics == null){
            this.psdedataviewlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDataViewLogic>();          
        }
        return this.psdedataviewlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDataView){
            PSDEDataView model = (PSDEDataView)iPSModel;
            model.setPSDEListItem(this.getPSDEListItem());
            model.setPSDEDataViewLogics(this.getPSDEDataViewLogics());
        }
        super.copyTo(iPSModel);
    }
}
