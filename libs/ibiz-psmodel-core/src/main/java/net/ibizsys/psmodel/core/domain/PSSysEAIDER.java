package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSEAIDER</B>集成实体关系映射 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIDER extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysEAIDER(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysEAIDER codename(String codeName){
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
    public PSSysEAIDER createdate(String createDate){
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
    public PSSysEAIDER createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EAIDERTAG</B>&nbsp;关系映射标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIDERTAG = "eaidertag";

    /**
     * 设置 关系映射标记
     * 
     * @param eAIDERTag
     * 
     */
    @JsonProperty(FIELD_EAIDERTAG)
    public void setEAIDERTag(String eAIDERTag){
        this.set(FIELD_EAIDERTAG, eAIDERTag);
    }
    
    /**
     * 获取 关系映射标记  
     * @return
     */
    @JsonIgnore
    public String getEAIDERTag(){
        Object objValue = this.get(FIELD_EAIDERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系映射标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDERTagDirty(){
        if(this.contains(FIELD_EAIDERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系映射标记
     */
    @JsonIgnore
    public void resetEAIDERTag(){
        this.reset(FIELD_EAIDERTAG);
    }

    /**
     * 设置 关系映射标记
     * <P>
     * 等同 {@link #setEAIDERTag}
     * @param eAIDERTag
     */
    @JsonIgnore
    public PSSysEAIDER eaidertag(String eAIDERTag){
        this.setEAIDERTag(eAIDERTag);
        return this;
    }

    /**
     * <B>EAIDERTAG2</B>&nbsp;关系映射标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIDERTAG2 = "eaidertag2";

    /**
     * 设置 关系映射标记2
     * 
     * @param eAIDERTag2
     * 
     */
    @JsonProperty(FIELD_EAIDERTAG2)
    public void setEAIDERTag2(String eAIDERTag2){
        this.set(FIELD_EAIDERTAG2, eAIDERTag2);
    }
    
    /**
     * 获取 关系映射标记2  
     * @return
     */
    @JsonIgnore
    public String getEAIDERTag2(){
        Object objValue = this.get(FIELD_EAIDERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系映射标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDERTag2Dirty(){
        if(this.contains(FIELD_EAIDERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系映射标记2
     */
    @JsonIgnore
    public void resetEAIDERTag2(){
        this.reset(FIELD_EAIDERTAG2);
    }

    /**
     * 设置 关系映射标记2
     * <P>
     * 等同 {@link #setEAIDERTag2}
     * @param eAIDERTag2
     */
    @JsonIgnore
    public PSSysEAIDER eaidertag2(String eAIDERTag2){
        this.setEAIDERTag2(eAIDERTag2);
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
    public PSSysEAIDER memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDEID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysEAIDER psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSSysEAIDER psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSSysEAIDER psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSSysEAIDER psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSSYSEAIDEID</B>&nbsp;应用集成实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIDE} 
     */
    public final static String FIELD_PSSYSEAIDEID = "pssyseaideid";

    /**
     * 设置 应用集成实体
     * 
     * @param pSSysEAIDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDEID)
    public void setPSSysEAIDEId(String pSSysEAIDEId){
        this.set(FIELD_PSSYSEAIDEID, pSSysEAIDEId);
    }
    
    /**
     * 获取 应用集成实体  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEId(){
        Object objValue = this.get(FIELD_PSSYSEAIDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDEIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成实体
     */
    @JsonIgnore
    public void resetPSSysEAIDEId(){
        this.reset(FIELD_PSSYSEAIDEID);
    }

    /**
     * 设置 应用集成实体
     * <P>
     * 等同 {@link #setPSSysEAIDEId}
     * @param pSSysEAIDEId
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaideid(String pSSysEAIDEId){
        this.setPSSysEAIDEId(pSSysEAIDEId);
        return this;
    }

    /**
     * 设置 应用集成实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIDEId}
     * @param pSSysEAIDE 引用对象
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaideid(PSSysEAIDE pSSysEAIDE){
        if(pSSysEAIDE == null){
            this.setPSDEId(null);
            this.setPSSysEAIDEId(null);
            this.setPSSysEAIDEName(null);
            this.setPSSysEAIElementId(null);
        }
        else{
            this.setPSDEId(pSSysEAIDE.getPSDEId());
            this.setPSSysEAIDEId(pSSysEAIDE.getPSSysEAIDEId());
            this.setPSSysEAIDEName(pSSysEAIDE.getPSSysEAIDEName());
            this.setPSSysEAIElementId(pSSysEAIDE.getPSSysEAIElementId());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIDENAME</B>&nbsp;应用集成实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDEID}
     */
    public final static String FIELD_PSSYSEAIDENAME = "pssyseaidename";

    /**
     * 设置 应用集成实体
     * 
     * @param pSSysEAIDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDENAME)
    public void setPSSysEAIDEName(String pSSysEAIDEName){
        this.set(FIELD_PSSYSEAIDENAME, pSSysEAIDEName);
    }
    
    /**
     * 获取 应用集成实体  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEName(){
        Object objValue = this.get(FIELD_PSSYSEAIDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDENameDirty(){
        if(this.contains(FIELD_PSSYSEAIDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成实体
     */
    @JsonIgnore
    public void resetPSSysEAIDEName(){
        this.reset(FIELD_PSSYSEAIDENAME);
    }

    /**
     * 设置 应用集成实体
     * <P>
     * 等同 {@link #setPSSysEAIDEName}
     * @param pSSysEAIDEName
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaidename(String pSSysEAIDEName){
        this.setPSSysEAIDEName(pSSysEAIDEName);
        return this;
    }

    /**
     * <B>PSSYSEAIDERID</B>&nbsp;应用集成实体关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIDERID = "pssyseaiderid";

    /**
     * 设置 应用集成实体关系标识
     * 
     * @param pSSysEAIDERId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDERID)
    public void setPSSysEAIDERId(String pSSysEAIDERId){
        this.set(FIELD_PSSYSEAIDERID, pSSysEAIDERId);
    }
    
    /**
     * 获取 应用集成实体关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDERId(){
        Object objValue = this.get(FIELD_PSSYSEAIDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成实体关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDERIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成实体关系标识
     */
    @JsonIgnore
    public void resetPSSysEAIDERId(){
        this.reset(FIELD_PSSYSEAIDERID);
    }

    /**
     * 设置 应用集成实体关系标识
     * <P>
     * 等同 {@link #setPSSysEAIDERId}
     * @param pSSysEAIDERId
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaiderid(String pSSysEAIDERId){
        this.setPSSysEAIDERId(pSSysEAIDERId);
        return this;
    }

    /**
     * <B>PSSYSEAIDERNAME</B>&nbsp;关系映射名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIDERNAME = "pssyseaidername";

    /**
     * 设置 关系映射名称
     * 
     * @param pSSysEAIDERName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDERNAME)
    public void setPSSysEAIDERName(String pSSysEAIDERName){
        this.set(FIELD_PSSYSEAIDERNAME, pSSysEAIDERName);
    }
    
    /**
     * 获取 关系映射名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDERName(){
        Object objValue = this.get(FIELD_PSSYSEAIDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系映射名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDERNameDirty(){
        if(this.contains(FIELD_PSSYSEAIDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系映射名称
     */
    @JsonIgnore
    public void resetPSSysEAIDERName(){
        this.reset(FIELD_PSSYSEAIDERNAME);
    }

    /**
     * 设置 关系映射名称
     * <P>
     * 等同 {@link #setPSSysEAIDERName}
     * @param pSSysEAIDERName
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaidername(String pSSysEAIDERName){
        this.setPSSysEAIDERName(pSSysEAIDERName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIDERName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIDERName(strName);
    }

    @JsonIgnore
    public PSSysEAIDER name(String strName){
        this.setPSSysEAIDERName(strName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;PSSYSEAIELEMENTID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDEID}
     */
    public final static String FIELD_PSSYSEAIELEMENTID = "pssyseaielementid";

    /**
     * 设置 PSSYSEAIELEMENTID
     * 
     * @param pSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTID)
    public void setPSSysEAIElementId(String pSSysEAIElementId){
        this.set(FIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }
    
    /**
     * 获取 PSSYSEAIELEMENTID  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSEAIELEMENTID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSEAIELEMENTID
     */
    @JsonIgnore
    public void resetPSSysEAIElementId(){
        this.reset(FIELD_PSSYSEAIELEMENTID);
    }

    /**
     * 设置 PSSYSEAIELEMENTID
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaielementid(String pSSysEAIElementId){
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTREID</B>&nbsp;应用集成元素引用元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIElementRE} 
     */
    public final static String FIELD_PSSYSEAIELEMENTREID = "pssyseaielementreid";

    /**
     * 设置 应用集成元素引用元素
     * 
     * @param pSSysEAIElementREId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTREID)
    public void setPSSysEAIElementREId(String pSSysEAIElementREId){
        this.set(FIELD_PSSYSEAIELEMENTREID, pSSysEAIElementREId);
    }
    
    /**
     * 获取 应用集成元素引用元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementREId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTREID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成元素引用元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementREIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTREID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成元素引用元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementREId(){
        this.reset(FIELD_PSSYSEAIELEMENTREID);
    }

    /**
     * 设置 应用集成元素引用元素
     * <P>
     * 等同 {@link #setPSSysEAIElementREId}
     * @param pSSysEAIElementREId
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaielementreid(String pSSysEAIElementREId){
        this.setPSSysEAIElementREId(pSSysEAIElementREId);
        return this;
    }

    /**
     * 设置 应用集成元素引用元素，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIElementREId}
     * @param pSSysEAIElementRE 引用对象
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaielementreid(PSSysEAIElementRE pSSysEAIElementRE){
        if(pSSysEAIElementRE == null){
            this.setPSSysEAIElementREId(null);
            this.setPSSysEAIElementREName(null);
        }
        else{
            this.setPSSysEAIElementREId(pSSysEAIElementRE.getPSSysEAIElementREId());
            this.setPSSysEAIElementREName(pSSysEAIElementRE.getPSSysEAIElementREName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTRENAME</B>&nbsp;集成元素元素
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTREID}
     */
    public final static String FIELD_PSSYSEAIELEMENTRENAME = "pssyseaielementrename";

    /**
     * 设置 集成元素元素
     * 
     * @param pSSysEAIElementREName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTRENAME)
    public void setPSSysEAIElementREName(String pSSysEAIElementREName){
        this.set(FIELD_PSSYSEAIELEMENTRENAME, pSSysEAIElementREName);
    }
    
    /**
     * 获取 集成元素元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementREName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTRENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementRENameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTRENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementREName(){
        this.reset(FIELD_PSSYSEAIELEMENTRENAME);
    }

    /**
     * 设置 集成元素元素
     * <P>
     * 等同 {@link #setPSSysEAIElementREName}
     * @param pSSysEAIElementREName
     */
    @JsonIgnore
    public PSSysEAIDER pssyseaielementrename(String pSSysEAIElementREName){
        this.setPSSysEAIElementREName(pSSysEAIElementREName);
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
    public PSSysEAIDER updatedate(String updateDate){
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
    public PSSysEAIDER updateman(String updateMan){
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
    public PSSysEAIDER usercat(String userCat){
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
    public PSSysEAIDER usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIDER usertag(String userTag){
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
    public PSSysEAIDER usertag2(String userTag2){
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
    public PSSysEAIDER usertag3(String userTag3){
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
    public PSSysEAIDER usertag4(String userTag4){
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
    public PSSysEAIDER validflag(Integer validFlag){
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
    public PSSysEAIDER validflag(Boolean validFlag){
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
        return this.getPSSysEAIDERId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIDERId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDER id(String strValue){
        this.setPSSysEAIDERId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysEAIDER){
            PSSysEAIDER model = (PSSysEAIDER)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
