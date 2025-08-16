package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPSBITEMRS</B>应用故事板项目关系 模型传输对象
 * <P>
 * 应用故事板项目关系模型，定义应用故事板项成员的迁移关系
 */
public class PSAppSBItemRS extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppSBItemRS(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用故事板项目关系的代码标识，需在所属应用故事板中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSAppSBItemRS codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CPSAPPSBITEMID</B>&nbsp;从项目，指定应用故事板项目关系的从项目
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppSBItem} 
     */
    public final static String FIELD_CPSAPPSBITEMID = "cpsappsbitemid";

    /**
     * 设置 从项目，详细说明：{@link #FIELD_CPSAPPSBITEMID}
     * 
     * @param cPSAppSBItemId
     * 
     */
    @JsonProperty(FIELD_CPSAPPSBITEMID)
    public void setCPSAppSBItemId(String cPSAppSBItemId){
        this.set(FIELD_CPSAPPSBITEMID, cPSAppSBItemId);
    }
    
    /**
     * 获取 从项目  
     * @return
     */
    @JsonIgnore
    public String getCPSAppSBItemId(){
        Object objValue = this.get(FIELD_CPSAPPSBITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSAppSBItemIdDirty(){
        if(this.contains(FIELD_CPSAPPSBITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从项目
     */
    @JsonIgnore
    public void resetCPSAppSBItemId(){
        this.reset(FIELD_CPSAPPSBITEMID);
    }

    /**
     * 设置 从项目，详细说明：{@link #FIELD_CPSAPPSBITEMID}
     * <P>
     * 等同 {@link #setCPSAppSBItemId}
     * @param cPSAppSBItemId
     */
    @JsonIgnore
    public PSAppSBItemRS cpsappsbitemid(String cPSAppSBItemId){
        this.setCPSAppSBItemId(cPSAppSBItemId);
        return this;
    }

    /**
     * 设置 从项目，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCPSAppSBItemId}
     * @param pSAppSBItem 引用对象
     */
    @JsonIgnore
    public PSAppSBItemRS cpsappsbitemid(PSAppSBItem pSAppSBItem){
        if(pSAppSBItem == null){
            this.setCPSAppSBItemId(null);
            this.setCPSAppSBItemName(null);
        }
        else{
            this.setCPSAppSBItemId(pSAppSBItem.getPSAppSBItemId());
            this.setCPSAppSBItemName(pSAppSBItem.getPSAppSBItemName());
        }
        return this;
    }

    /**
     * <B>CPSAPPSBITEMNAME</B>&nbsp;从项目，指定应用故事板项目关系的从项目
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CPSAPPSBITEMID}
     */
    public final static String FIELD_CPSAPPSBITEMNAME = "cpsappsbitemname";

    /**
     * 设置 从项目，详细说明：{@link #FIELD_CPSAPPSBITEMNAME}
     * 
     * @param cPSAppSBItemName
     * 
     */
    @JsonProperty(FIELD_CPSAPPSBITEMNAME)
    public void setCPSAppSBItemName(String cPSAppSBItemName){
        this.set(FIELD_CPSAPPSBITEMNAME, cPSAppSBItemName);
    }
    
    /**
     * 获取 从项目  
     * @return
     */
    @JsonIgnore
    public String getCPSAppSBItemName(){
        Object objValue = this.get(FIELD_CPSAPPSBITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSAppSBItemNameDirty(){
        if(this.contains(FIELD_CPSAPPSBITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从项目
     */
    @JsonIgnore
    public void resetCPSAppSBItemName(){
        this.reset(FIELD_CPSAPPSBITEMNAME);
    }

    /**
     * 设置 从项目，详细说明：{@link #FIELD_CPSAPPSBITEMNAME}
     * <P>
     * 等同 {@link #setCPSAppSBItemName}
     * @param cPSAppSBItemName
     */
    @JsonIgnore
    public PSAppSBItemRS cpsappsbitemname(String cPSAppSBItemName){
        this.setCPSAppSBItemName(cPSAppSBItemName);
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
    public PSAppSBItemRS createdate(String createDate){
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
    public PSAppSBItemRS createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DSTENDPOINT</B>&nbsp;目标端点
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTENDPOINT = "dstendpoint";

    /**
     * 设置 目标端点
     * 
     * @param dstEndPoint
     * 
     */
    @JsonProperty(FIELD_DSTENDPOINT)
    public void setDstEndPoint(String dstEndPoint){
        this.set(FIELD_DSTENDPOINT, dstEndPoint);
    }
    
    /**
     * 获取 目标端点  
     * @return
     */
    @JsonIgnore
    public String getDstEndPoint(){
        Object objValue = this.get(FIELD_DSTENDPOINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标端点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstEndPointDirty(){
        if(this.contains(FIELD_DSTENDPOINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标端点
     */
    @JsonIgnore
    public void resetDstEndPoint(){
        this.reset(FIELD_DSTENDPOINT);
    }

    /**
     * 设置 目标端点
     * <P>
     * 等同 {@link #setDstEndPoint}
     * @param dstEndPoint
     */
    @JsonIgnore
    public PSAppSBItemRS dstendpoint(String dstEndPoint){
        this.setDstEndPoint(dstEndPoint);
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
    public PSAppSBItemRS memo(String memo){
        this.setMemo(memo);
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
    public PSAppSBItemRS ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSAPPSBITEMID</B>&nbsp;主项目，指定应用故事板项目关系的主项目
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppSBItem} 
     */
    public final static String FIELD_PPSAPPSBITEMID = "ppsappsbitemid";

    /**
     * 设置 主项目，详细说明：{@link #FIELD_PPSAPPSBITEMID}
     * 
     * @param pPSAppSBItemId
     * 
     */
    @JsonProperty(FIELD_PPSAPPSBITEMID)
    public void setPPSAppSBItemId(String pPSAppSBItemId){
        this.set(FIELD_PPSAPPSBITEMID, pPSAppSBItemId);
    }
    
    /**
     * 获取 主项目  
     * @return
     */
    @JsonIgnore
    public String getPPSAppSBItemId(){
        Object objValue = this.get(FIELD_PPSAPPSBITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppSBItemIdDirty(){
        if(this.contains(FIELD_PPSAPPSBITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主项目
     */
    @JsonIgnore
    public void resetPPSAppSBItemId(){
        this.reset(FIELD_PPSAPPSBITEMID);
    }

    /**
     * 设置 主项目，详细说明：{@link #FIELD_PPSAPPSBITEMID}
     * <P>
     * 等同 {@link #setPPSAppSBItemId}
     * @param pPSAppSBItemId
     */
    @JsonIgnore
    public PSAppSBItemRS ppsappsbitemid(String pPSAppSBItemId){
        this.setPPSAppSBItemId(pPSAppSBItemId);
        return this;
    }

    /**
     * 设置 主项目，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSAppSBItemId}
     * @param pSAppSBItem 引用对象
     */
    @JsonIgnore
    public PSAppSBItemRS ppsappsbitemid(PSAppSBItem pSAppSBItem){
        if(pSAppSBItem == null){
            this.setPPSAppSBItemId(null);
            this.setPPSAppSBItemName(null);
        }
        else{
            this.setPPSAppSBItemId(pSAppSBItem.getPSAppSBItemId());
            this.setPPSAppSBItemName(pSAppSBItem.getPSAppSBItemName());
        }
        return this;
    }

    /**
     * <B>PPSAPPSBITEMNAME</B>&nbsp;主项目，指定应用故事板项目关系的主项目
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSAPPSBITEMID}
     */
    public final static String FIELD_PPSAPPSBITEMNAME = "ppsappsbitemname";

    /**
     * 设置 主项目，详细说明：{@link #FIELD_PPSAPPSBITEMNAME}
     * 
     * @param pPSAppSBItemName
     * 
     */
    @JsonProperty(FIELD_PPSAPPSBITEMNAME)
    public void setPPSAppSBItemName(String pPSAppSBItemName){
        this.set(FIELD_PPSAPPSBITEMNAME, pPSAppSBItemName);
    }
    
    /**
     * 获取 主项目  
     * @return
     */
    @JsonIgnore
    public String getPPSAppSBItemName(){
        Object objValue = this.get(FIELD_PPSAPPSBITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppSBItemNameDirty(){
        if(this.contains(FIELD_PPSAPPSBITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主项目
     */
    @JsonIgnore
    public void resetPPSAppSBItemName(){
        this.reset(FIELD_PPSAPPSBITEMNAME);
    }

    /**
     * 设置 主项目，详细说明：{@link #FIELD_PPSAPPSBITEMNAME}
     * <P>
     * 等同 {@link #setPPSAppSBItemName}
     * @param pPSAppSBItemName
     */
    @JsonIgnore
    public PSAppSBItemRS ppsappsbitemname(String pPSAppSBItemName){
        this.setPPSAppSBItemName(pPSAppSBItemName);
        return this;
    }

    /**
     * <B>PSAPPSBITEMRSID</B>&nbsp;应用故事板项目关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPSBITEMRSID = "psappsbitemrsid";

    /**
     * 设置 应用故事板项目关系标识
     * 
     * @param pSAppSBItemRSId
     * 
     */
    @JsonProperty(FIELD_PSAPPSBITEMRSID)
    public void setPSAppSBItemRSId(String pSAppSBItemRSId){
        this.set(FIELD_PSAPPSBITEMRSID, pSAppSBItemRSId);
    }
    
    /**
     * 获取 应用故事板项目关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppSBItemRSId(){
        Object objValue = this.get(FIELD_PSAPPSBITEMRSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用故事板项目关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppSBItemRSIdDirty(){
        if(this.contains(FIELD_PSAPPSBITEMRSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用故事板项目关系标识
     */
    @JsonIgnore
    public void resetPSAppSBItemRSId(){
        this.reset(FIELD_PSAPPSBITEMRSID);
    }

    /**
     * 设置 应用故事板项目关系标识
     * <P>
     * 等同 {@link #setPSAppSBItemRSId}
     * @param pSAppSBItemRSId
     */
    @JsonIgnore
    public PSAppSBItemRS psappsbitemrsid(String pSAppSBItemRSId){
        this.setPSAppSBItemRSId(pSAppSBItemRSId);
        return this;
    }

    /**
     * <B>PSAPPSBITEMRSNAME</B>&nbsp;关系名称，指定应用故事板项目关系的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPSBITEMRSNAME = "psappsbitemrsname";

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSAPPSBITEMRSNAME}
     * 
     * @param pSAppSBItemRSName
     * 
     */
    @JsonProperty(FIELD_PSAPPSBITEMRSNAME)
    public void setPSAppSBItemRSName(String pSAppSBItemRSName){
        this.set(FIELD_PSAPPSBITEMRSNAME, pSAppSBItemRSName);
    }
    
    /**
     * 获取 关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppSBItemRSName(){
        Object objValue = this.get(FIELD_PSAPPSBITEMRSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppSBItemRSNameDirty(){
        if(this.contains(FIELD_PSAPPSBITEMRSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系名称
     */
    @JsonIgnore
    public void resetPSAppSBItemRSName(){
        this.reset(FIELD_PSAPPSBITEMRSNAME);
    }

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSAPPSBITEMRSNAME}
     * <P>
     * 等同 {@link #setPSAppSBItemRSName}
     * @param pSAppSBItemRSName
     */
    @JsonIgnore
    public PSAppSBItemRS psappsbitemrsname(String pSAppSBItemRSName){
        this.setPSAppSBItemRSName(pSAppSBItemRSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppSBItemRSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppSBItemRSName(strName);
    }

    @JsonIgnore
    public PSAppSBItemRS name(String strName){
        this.setPSAppSBItemRSName(strName);
        return this;
    }

    /**
     * <B>PSAPPSTORYBOARDID</B>&nbsp;应用故事板，指定应用故事板项目关系所属应用故事板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppStoryBoard} 
     */
    public final static String FIELD_PSAPPSTORYBOARDID = "psappstoryboardid";

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDID}
     * 
     * @param pSAppStoryBoardId
     * 
     */
    @JsonProperty(FIELD_PSAPPSTORYBOARDID)
    public void setPSAppStoryBoardId(String pSAppStoryBoardId){
        this.set(FIELD_PSAPPSTORYBOARDID, pSAppStoryBoardId);
    }
    
    /**
     * 获取 应用故事板  
     * @return
     */
    @JsonIgnore
    public String getPSAppStoryBoardId(){
        Object objValue = this.get(FIELD_PSAPPSTORYBOARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用故事板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppStoryBoardIdDirty(){
        if(this.contains(FIELD_PSAPPSTORYBOARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用故事板
     */
    @JsonIgnore
    public void resetPSAppStoryBoardId(){
        this.reset(FIELD_PSAPPSTORYBOARDID);
    }

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDID}
     * <P>
     * 等同 {@link #setPSAppStoryBoardId}
     * @param pSAppStoryBoardId
     */
    @JsonIgnore
    public PSAppSBItemRS psappstoryboardid(String pSAppStoryBoardId){
        this.setPSAppStoryBoardId(pSAppStoryBoardId);
        return this;
    }

    /**
     * 设置 应用故事板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppStoryBoardId}
     * @param pSAppStoryBoard 引用对象
     */
    @JsonIgnore
    public PSAppSBItemRS psappstoryboardid(PSAppStoryBoard pSAppStoryBoard){
        if(pSAppStoryBoard == null){
            this.setPSAppStoryBoardId(null);
            this.setPSAppStoryBoardName(null);
            this.setPSSysAppId(null);
        }
        else{
            this.setPSAppStoryBoardId(pSAppStoryBoard.getPSAppStoryBoardId());
            this.setPSAppStoryBoardName(pSAppStoryBoard.getPSAppStoryBoardName());
            this.setPSSysAppId(pSAppStoryBoard.getPSSysAppId());
        }
        return this;
    }

    /**
     * <B>PSAPPSTORYBOARDNAME</B>&nbsp;应用故事板，指定应用故事板项目关系所属应用故事板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPSTORYBOARDID}
     */
    public final static String FIELD_PSAPPSTORYBOARDNAME = "psappstoryboardname";

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDNAME}
     * 
     * @param pSAppStoryBoardName
     * 
     */
    @JsonProperty(FIELD_PSAPPSTORYBOARDNAME)
    public void setPSAppStoryBoardName(String pSAppStoryBoardName){
        this.set(FIELD_PSAPPSTORYBOARDNAME, pSAppStoryBoardName);
    }
    
    /**
     * 获取 应用故事板  
     * @return
     */
    @JsonIgnore
    public String getPSAppStoryBoardName(){
        Object objValue = this.get(FIELD_PSAPPSTORYBOARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用故事板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppStoryBoardNameDirty(){
        if(this.contains(FIELD_PSAPPSTORYBOARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用故事板
     */
    @JsonIgnore
    public void resetPSAppStoryBoardName(){
        this.reset(FIELD_PSAPPSTORYBOARDNAME);
    }

    /**
     * 设置 应用故事板，详细说明：{@link #FIELD_PSAPPSTORYBOARDNAME}
     * <P>
     * 等同 {@link #setPSAppStoryBoardName}
     * @param pSAppStoryBoardName
     */
    @JsonIgnore
    public PSAppSBItemRS psappstoryboardname(String pSAppStoryBoardName){
        this.setPSAppStoryBoardName(pSAppStoryBoardName);
        return this;
    }

    /**
     * <B>PSDYNAINSTID</B>&nbsp;动态实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNAINSTID = "psdynainstid";

    /**
     * 设置 动态实例标识
     * 
     * @param pSDynaInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTID)
    public void setPSDynaInstId(String pSDynaInstId){
        this.set(FIELD_PSDYNAINSTID, pSDynaInstId);
    }
    
    /**
     * 获取 动态实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstId(){
        Object objValue = this.get(FIELD_PSDYNAINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstIdDirty(){
        if(this.contains(FIELD_PSDYNAINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标识
     */
    @JsonIgnore
    public void resetPSDynaInstId(){
        this.reset(FIELD_PSDYNAINSTID);
    }

    /**
     * 设置 动态实例标识
     * <P>
     * 等同 {@link #setPSDynaInstId}
     * @param pSDynaInstId
     */
    @JsonIgnore
    public PSAppSBItemRS psdynainstid(String pSDynaInstId){
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;应用标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPSTORYBOARDID}
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 应用标识
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 应用标识  
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
     * 判断 应用标识 是否指定值，包括空值
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
     * 重置 应用标识
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 应用标识
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppSBItemRS pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统需求项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统需求项  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSAppSBItemRS pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统需求项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSAppSBItemRS pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统需求项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统需求项  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSAppSBItemRS pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUSECASEID</B>&nbsp;系统用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUseCase} 
     */
    public final static String FIELD_PSSYSUSECASEID = "pssysusecaseid";

    /**
     * 设置 系统用例
     * 
     * @param pSSysUseCaseId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASEID)
    public void setPSSysUseCaseId(String pSSysUseCaseId){
        this.set(FIELD_PSSYSUSECASEID, pSSysUseCaseId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercaseid", pSSysUseCaseId);
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseId(){
        Object objValue = this.get(FIELD_PSSYSUSECASEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercaseid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty(){
        if(this.contains(FIELD_PSSYSUSECASEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercaseid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercaseid");
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSAppSBItemRS pssysusecaseid(String pSSysUseCaseId){
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    /**
     * 设置 系统用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCase 引用对象
     */
    @JsonIgnore
    public PSAppSBItemRS pssysusecaseid(PSSysUseCase pSSysUseCase){
        if(pSSysUseCase == null){
            this.setPSSysUseCaseId(null);
            this.setPSSysUseCaseName(null);
        }
        else{
            this.setPSSysUseCaseId(pSSysUseCase.getPSSysUseCaseId());
            this.setPSSysUseCaseName(pSSysUseCase.getPSSysUseCaseName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseId(){
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseId(String pSSysUserCaseId){
        this.setPSSysUseCaseId(pSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseIdDirty(){
        return this.isPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseId(){
        this.resetPSSysUseCaseId();
    }

    /**
     * <B>PSSYSUSECASENAME</B>&nbsp;系统用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSECASEID}
     */
    public final static String FIELD_PSSYSUSECASENAME = "pssysusecasename";

    /**
     * 设置 系统用例
     * 
     * @param pSSysUseCaseName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASENAME)
    public void setPSSysUseCaseName(String pSSysUseCaseName){
        this.set(FIELD_PSSYSUSECASENAME, pSSysUseCaseName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercasename", pSSysUseCaseName);
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseName(){
        Object objValue = this.get(FIELD_PSSYSUSECASENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercasename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty(){
        if(this.contains(FIELD_PSSYSUSECASENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercasename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasename");
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSAppSBItemRS pssysusecasename(String pSSysUseCaseName){
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseName(){
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseName(String pSSysUserCaseName){
        this.setPSSysUseCaseName(pSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseNameDirty(){
        return this.isPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseName(){
        this.resetPSSysUseCaseName();
    }

    /**
     * <B>RSTAG</B>&nbsp;关系标记，指定应用故事板项目关系的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RSTAG = "rstag";

    /**
     * 设置 关系标记，详细说明：{@link #FIELD_RSTAG}
     * 
     * @param rSTag
     * 
     */
    @JsonProperty(FIELD_RSTAG)
    public void setRSTag(String rSTag){
        this.set(FIELD_RSTAG, rSTag);
    }
    
    /**
     * 获取 关系标记  
     * @return
     */
    @JsonIgnore
    public String getRSTag(){
        Object objValue = this.get(FIELD_RSTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTagDirty(){
        if(this.contains(FIELD_RSTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记
     */
    @JsonIgnore
    public void resetRSTag(){
        this.reset(FIELD_RSTAG);
    }

    /**
     * 设置 关系标记，详细说明：{@link #FIELD_RSTAG}
     * <P>
     * 等同 {@link #setRSTag}
     * @param rSTag
     */
    @JsonIgnore
    public PSAppSBItemRS rstag(String rSTag){
        this.setRSTag(rSTag);
        return this;
    }

    /**
     * <B>RSTAG2</B>&nbsp;关系标记2，指定应用故事板项目关系的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RSTAG2 = "rstag2";

    /**
     * 设置 关系标记2，详细说明：{@link #FIELD_RSTAG2}
     * 
     * @param rSTag2
     * 
     */
    @JsonProperty(FIELD_RSTAG2)
    public void setRSTag2(String rSTag2){
        this.set(FIELD_RSTAG2, rSTag2);
    }
    
    /**
     * 获取 关系标记2  
     * @return
     */
    @JsonIgnore
    public String getRSTag2(){
        Object objValue = this.get(FIELD_RSTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag2Dirty(){
        if(this.contains(FIELD_RSTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记2
     */
    @JsonIgnore
    public void resetRSTag2(){
        this.reset(FIELD_RSTAG2);
    }

    /**
     * 设置 关系标记2，详细说明：{@link #FIELD_RSTAG2}
     * <P>
     * 等同 {@link #setRSTag2}
     * @param rSTag2
     */
    @JsonIgnore
    public PSAppSBItemRS rstag2(String rSTag2){
        this.setRSTag2(rSTag2);
        return this;
    }

    /**
     * <B>RSTAG3</B>&nbsp;关系标记3，指定应用故事板项目关系的标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RSTAG3 = "rstag3";

    /**
     * 设置 关系标记3，详细说明：{@link #FIELD_RSTAG3}
     * 
     * @param rSTag3
     * 
     */
    @JsonProperty(FIELD_RSTAG3)
    public void setRSTag3(String rSTag3){
        this.set(FIELD_RSTAG3, rSTag3);
    }
    
    /**
     * 获取 关系标记3  
     * @return
     */
    @JsonIgnore
    public String getRSTag3(){
        Object objValue = this.get(FIELD_RSTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag3Dirty(){
        if(this.contains(FIELD_RSTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记3
     */
    @JsonIgnore
    public void resetRSTag3(){
        this.reset(FIELD_RSTAG3);
    }

    /**
     * 设置 关系标记3，详细说明：{@link #FIELD_RSTAG3}
     * <P>
     * 等同 {@link #setRSTag3}
     * @param rSTag3
     */
    @JsonIgnore
    public PSAppSBItemRS rstag3(String rSTag3){
        this.setRSTag3(rSTag3);
        return this;
    }

    /**
     * <B>RSTAG4</B>&nbsp;关系标记4，指定应用故事板项目关系的标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RSTAG4 = "rstag4";

    /**
     * 设置 关系标记4，详细说明：{@link #FIELD_RSTAG4}
     * 
     * @param rSTag4
     * 
     */
    @JsonProperty(FIELD_RSTAG4)
    public void setRSTag4(String rSTag4){
        this.set(FIELD_RSTAG4, rSTag4);
    }
    
    /**
     * 获取 关系标记4  
     * @return
     */
    @JsonIgnore
    public String getRSTag4(){
        Object objValue = this.get(FIELD_RSTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag4Dirty(){
        if(this.contains(FIELD_RSTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记4
     */
    @JsonIgnore
    public void resetRSTag4(){
        this.reset(FIELD_RSTAG4);
    }

    /**
     * 设置 关系标记4，详细说明：{@link #FIELD_RSTAG4}
     * <P>
     * 等同 {@link #setRSTag4}
     * @param rSTag4
     */
    @JsonIgnore
    public PSAppSBItemRS rstag4(String rSTag4){
        this.setRSTag4(rSTag4);
        return this;
    }

    /**
     * <B>RSTYPE</B>&nbsp;关系类型，指定应用故事板项目关系的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppStoryBoardItemRSType} 
     */
    public final static String FIELD_RSTYPE = "rstype";

    /**
     * 设置 关系类型，详细说明：{@link #FIELD_RSTYPE}
     * 
     * @param rSType
     * 
     */
    @JsonProperty(FIELD_RSTYPE)
    public void setRSType(String rSType){
        this.set(FIELD_RSTYPE, rSType);
    }
    
    /**
     * 获取 关系类型  
     * @return
     */
    @JsonIgnore
    public String getRSType(){
        Object objValue = this.get(FIELD_RSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTypeDirty(){
        if(this.contains(FIELD_RSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系类型
     */
    @JsonIgnore
    public void resetRSType(){
        this.reset(FIELD_RSTYPE);
    }

    /**
     * 设置 关系类型，详细说明：{@link #FIELD_RSTYPE}
     * <P>
     * 等同 {@link #setRSType}
     * @param rSType
     */
    @JsonIgnore
    public PSAppSBItemRS rstype(String rSType){
        this.setRSType(rSType);
        return this;
    }

     /**
     * 设置 关系类型，详细说明：{@link #FIELD_RSTYPE}
     * <P>
     * 等同 {@link #setRSType}
     * @param rSType
     */
    @JsonIgnore
    public PSAppSBItemRS rstype(net.ibizsys.psmodel.core.util.PSModelEnums.AppStoryBoardItemRSType rSType){
        if(rSType == null){
            this.setRSType(null);
        }
        else{
            this.setRSType(rSType.value);
        }
        return this;
    }

    /**
     * <B>SRCENDPOINT</B>&nbsp;源端点
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SRCENDPOINT = "srcendpoint";

    /**
     * 设置 源端点
     * 
     * @param srcEndPoint
     * 
     */
    @JsonProperty(FIELD_SRCENDPOINT)
    public void setSrcEndPoint(String srcEndPoint){
        this.set(FIELD_SRCENDPOINT, srcEndPoint);
    }
    
    /**
     * 获取 源端点  
     * @return
     */
    @JsonIgnore
    public String getSrcEndPoint(){
        Object objValue = this.get(FIELD_SRCENDPOINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源端点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcEndPointDirty(){
        if(this.contains(FIELD_SRCENDPOINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源端点
     */
    @JsonIgnore
    public void resetSrcEndPoint(){
        this.reset(FIELD_SRCENDPOINT);
    }

    /**
     * 设置 源端点
     * <P>
     * 等同 {@link #setSrcEndPoint}
     * @param srcEndPoint
     */
    @JsonIgnore
    public PSAppSBItemRS srcendpoint(String srcEndPoint){
        this.setSrcEndPoint(srcEndPoint);
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
    public PSAppSBItemRS updatedate(String updateDate){
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
    public PSAppSBItemRS updateman(String updateMan){
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
    public PSAppSBItemRS usercat(String userCat){
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
    public PSAppSBItemRS usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERFLAG</B>&nbsp;用户自定义
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERFLAG = "userflag";

    /**
     * 设置 用户自定义
     * 
     * @param userFlag
     * 
     */
    @JsonProperty(FIELD_USERFLAG)
    public void setUserFlag(Integer userFlag){
        this.set(FIELD_USERFLAG, userFlag);
    }
    
    /**
     * 获取 用户自定义  
     * @return
     */
    @JsonIgnore
    public Integer getUserFlag(){
        Object objValue = this.get(FIELD_USERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户自定义 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserFlagDirty(){
        if(this.contains(FIELD_USERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义
     */
    @JsonIgnore
    public void resetUserFlag(){
        this.reset(FIELD_USERFLAG);
    }

    /**
     * 设置 用户自定义
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSAppSBItemRS userflag(Integer userFlag){
        this.setUserFlag(userFlag);
        return this;
    }

     /**
     * 设置 用户自定义
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSAppSBItemRS userflag(Boolean userFlag){
        if(userFlag == null){
            this.setUserFlag(null);
        }
        else{
            this.setUserFlag(userFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSAppSBItemRS usertag(String userTag){
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
    public PSAppSBItemRS usertag2(String userTag2){
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
    public PSAppSBItemRS usertag3(String userTag3){
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
    public PSAppSBItemRS usertag4(String userTag4){
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
    public PSAppSBItemRS validflag(Integer validFlag){
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
    public PSAppSBItemRS validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppSBItemRSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppSBItemRSId(strValue);
    }

    @JsonIgnore
    public PSAppSBItemRS id(String strValue){
        this.setPSAppSBItemRSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppSBItemRS){
            PSAppSBItemRS model = (PSAppSBItemRS)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
