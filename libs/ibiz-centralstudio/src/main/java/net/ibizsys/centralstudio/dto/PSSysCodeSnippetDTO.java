package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCODESNIPPET</B>系统代码块 模型传输对象
 * <P>
 * 
 */
public class PSSysCodeSnippetDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysCodeSnippetDTO(){
    }      

    /**
     * <B>CODEREFMODE</B>&nbsp;代码引用模式
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CODEREFMODE = "coderefmode";

    /**
     * 设置 代码引用模式
     * 
     * @param codeRefMode
     * 
     */
    @JsonProperty(FIELD_CODEREFMODE)
    public void setCodeRefMode(String codeRefMode){
        this.set(FIELD_CODEREFMODE, codeRefMode);
    }
    
    /**
     * 获取 代码引用模式  
     * @return
     */
    @JsonIgnore
    public String getCodeRefMode(){
        Object objValue = this.get(FIELD_CODEREFMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码引用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeRefModeDirty(){
        if(this.contains(FIELD_CODEREFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码引用模式
     */
    @JsonIgnore
    public void resetCodeRefMode(){
        this.reset(FIELD_CODEREFMODE);
    }

    /**
     * 设置 代码引用模式
     * <P>
     * 等同 {@link #setCodeRefMode}
     * @param codeRefMode
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO coderefmode(String codeRefMode){
        this.setCodeRefMode(codeRefMode);
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
    public PSSysCodeSnippetDTO createdate(Timestamp createDate){
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
    public PSSysCodeSnippetDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysCodeSnippetDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDCCODESNIPPETID</B>&nbsp;中心代码片段
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCCODESNIPPETID = "psdccodesnippetid";

    /**
     * 设置 中心代码片段
     * 
     * @param pSDCCodeSnippetId
     * 
     */
    @JsonProperty(FIELD_PSDCCODESNIPPETID)
    public void setPSDCCodeSnippetId(String pSDCCodeSnippetId){
        this.set(FIELD_PSDCCODESNIPPETID, pSDCCodeSnippetId);
    }
    
    /**
     * 获取 中心代码片段  
     * @return
     */
    @JsonIgnore
    public String getPSDCCodeSnippetId(){
        Object objValue = this.get(FIELD_PSDCCODESNIPPETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心代码片段 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCCodeSnippetIdDirty(){
        if(this.contains(FIELD_PSDCCODESNIPPETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心代码片段
     */
    @JsonIgnore
    public void resetPSDCCodeSnippetId(){
        this.reset(FIELD_PSDCCODESNIPPETID);
    }

    /**
     * 设置 中心代码片段
     * <P>
     * 等同 {@link #setPSDCCodeSnippetId}
     * @param pSDCCodeSnippetId
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO psdccodesnippetid(String pSDCCodeSnippetId){
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    /**
     * <B>PSDCCODESNIPPETNAME</B>&nbsp;中心代码片段
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCCODESNIPPETID}
     */
    public final static String FIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";

    /**
     * 设置 中心代码片段
     * 
     * @param pSDCCodeSnippetName
     * 
     */
    @JsonProperty(FIELD_PSDCCODESNIPPETNAME)
    public void setPSDCCodeSnippetName(String pSDCCodeSnippetName){
        this.set(FIELD_PSDCCODESNIPPETNAME, pSDCCodeSnippetName);
    }
    
    /**
     * 获取 中心代码片段  
     * @return
     */
    @JsonIgnore
    public String getPSDCCodeSnippetName(){
        Object objValue = this.get(FIELD_PSDCCODESNIPPETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心代码片段 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCCodeSnippetNameDirty(){
        if(this.contains(FIELD_PSDCCODESNIPPETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心代码片段
     */
    @JsonIgnore
    public void resetPSDCCodeSnippetName(){
        this.reset(FIELD_PSDCCODESNIPPETNAME);
    }

    /**
     * 设置 中心代码片段
     * <P>
     * 等同 {@link #setPSDCCodeSnippetName}
     * @param pSDCCodeSnippetName
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO psdccodesnippetname(String pSDCCodeSnippetName){
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端模板
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
     * 设置 前端模板
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 前端模板
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
     * 设置 前端模板
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSPFSTYLEID</B>&nbsp;应用框架样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFSTYLEID = "pspfstyleid";

    /**
     * 设置 应用框架样式
     * 
     * @param pSPFStyleId
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLEID)
    public void setPSPFStyleId(String pSPFStyleId){
        this.set(FIELD_PSPFSTYLEID, pSPFStyleId);
    }
    
    /**
     * 获取 应用框架样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleId(){
        Object objValue = this.get(FIELD_PSPFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用框架样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleIdDirty(){
        if(this.contains(FIELD_PSPFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用框架样式
     */
    @JsonIgnore
    public void resetPSPFStyleId(){
        this.reset(FIELD_PSPFSTYLEID);
    }

    /**
     * 设置 应用框架样式
     * <P>
     * 等同 {@link #setPSPFStyleId}
     * @param pSPFStyleId
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pspfstyleid(String pSPFStyleId){
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    /**
     * <B>PSPFSTYLENAME</B>&nbsp;应用框架样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFSTYLEID}
     */
    public final static String FIELD_PSPFSTYLENAME = "pspfstylename";

    /**
     * 设置 应用框架样式
     * 
     * @param pSPFStyleName
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLENAME)
    public void setPSPFStyleName(String pSPFStyleName){
        this.set(FIELD_PSPFSTYLENAME, pSPFStyleName);
    }
    
    /**
     * 获取 应用框架样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleName(){
        Object objValue = this.get(FIELD_PSPFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用框架样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleNameDirty(){
        if(this.contains(FIELD_PSPFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用框架样式
     */
    @JsonIgnore
    public void resetPSPFStyleName(){
        this.reset(FIELD_PSPFSTYLENAME);
    }

    /**
     * 设置 应用框架样式
     * <P>
     * 等同 {@link #setPSPFStyleName}
     * @param pSPFStyleName
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pspfstylename(String pSPFStyleName){
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    /**
     * <B>PSSFID</B>&nbsp;系统服务体系
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFID = "pssfid";

    /**
     * 设置 系统服务体系
     * 
     * @param pSSFId
     * 
     */
    @JsonProperty(FIELD_PSSFID)
    public void setPSSFId(String pSSFId){
        this.set(FIELD_PSSFID, pSSFId);
    }
    
    /**
     * 获取 系统服务体系  
     * @return
     */
    @JsonIgnore
    public String getPSSFId(){
        Object objValue = this.get(FIELD_PSSFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFIdDirty(){
        if(this.contains(FIELD_PSSFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务体系
     */
    @JsonIgnore
    public void resetPSSFId(){
        this.reset(FIELD_PSSFID);
    }

    /**
     * 设置 系统服务体系
     * <P>
     * 等同 {@link #setPSSFId}
     * @param pSSFId
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pssfid(String pSSFId){
        this.setPSSFId(pSSFId);
        return this;
    }

    /**
     * <B>PSSFNAME</B>&nbsp;系统服务体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFID}
     */
    public final static String FIELD_PSSFNAME = "pssfname";

    /**
     * 设置 系统服务体系
     * 
     * @param pSSFName
     * 
     */
    @JsonProperty(FIELD_PSSFNAME)
    public void setPSSFName(String pSSFName){
        this.set(FIELD_PSSFNAME, pSSFName);
    }
    
    /**
     * 获取 系统服务体系  
     * @return
     */
    @JsonIgnore
    public String getPSSFName(){
        Object objValue = this.get(FIELD_PSSFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFNameDirty(){
        if(this.contains(FIELD_PSSFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务体系
     */
    @JsonIgnore
    public void resetPSSFName(){
        this.reset(FIELD_PSSFNAME);
    }

    /**
     * 设置 系统服务体系
     * <P>
     * 等同 {@link #setPSSFName}
     * @param pSSFName
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pssfname(String pSSFName){
        this.setPSSFName(pSSFName);
        return this;
    }

    /**
     * <B>PSSFSTYLEID</B>&nbsp;后台服务框架
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFSTYLEID = "pssfstyleid";

    /**
     * 设置 后台服务框架
     * 
     * @param pSSFStyleId
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEID)
    public void setPSSFStyleId(String pSSFStyleId){
        this.set(FIELD_PSSFSTYLEID, pSSFStyleId);
    }
    
    /**
     * 获取 后台服务框架  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleId(){
        Object objValue = this.get(FIELD_PSSFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台服务框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleIdDirty(){
        if(this.contains(FIELD_PSSFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台服务框架
     */
    @JsonIgnore
    public void resetPSSFStyleId(){
        this.reset(FIELD_PSSFSTYLEID);
    }

    /**
     * 设置 后台服务框架
     * <P>
     * 等同 {@link #setPSSFStyleId}
     * @param pSSFStyleId
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pssfstyleid(String pSSFStyleId){
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    /**
     * <B>PSSFSTYLENAME</B>&nbsp;后台服务框架
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFSTYLEID}
     */
    public final static String FIELD_PSSFSTYLENAME = "pssfstylename";

    /**
     * 设置 后台服务框架
     * 
     * @param pSSFStyleName
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLENAME)
    public void setPSSFStyleName(String pSSFStyleName){
        this.set(FIELD_PSSFSTYLENAME, pSSFStyleName);
    }
    
    /**
     * 获取 后台服务框架  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleName(){
        Object objValue = this.get(FIELD_PSSFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台服务框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleNameDirty(){
        if(this.contains(FIELD_PSSFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台服务框架
     */
    @JsonIgnore
    public void resetPSSFStyleName(){
        this.reset(FIELD_PSSFSTYLENAME);
    }

    /**
     * 设置 后台服务框架
     * <P>
     * 等同 {@link #setPSSFStyleName}
     * @param pSSFStyleName
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pssfstylename(String pSSFStyleName){
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    /**
     * <B>PSSYSCODESNIPPETID</B>&nbsp;系统代码块标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCODESNIPPETID = "pssyscodesnippetid";

    /**
     * 设置 系统代码块标识
     * 
     * @param pSSysCodeSnippetId
     * 
     */
    @JsonProperty(FIELD_PSSYSCODESNIPPETID)
    public void setPSSysCodeSnippetId(String pSSysCodeSnippetId){
        this.set(FIELD_PSSYSCODESNIPPETID, pSSysCodeSnippetId);
    }
    
    /**
     * 获取 系统代码块标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCodeSnippetId(){
        Object objValue = this.get(FIELD_PSSYSCODESNIPPETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码块标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCodeSnippetIdDirty(){
        if(this.contains(FIELD_PSSYSCODESNIPPETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码块标识
     */
    @JsonIgnore
    public void resetPSSysCodeSnippetId(){
        this.reset(FIELD_PSSYSCODESNIPPETID);
    }

    /**
     * 设置 系统代码块标识
     * <P>
     * 等同 {@link #setPSSysCodeSnippetId}
     * @param pSSysCodeSnippetId
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pssyscodesnippetid(String pSSysCodeSnippetId){
        this.setPSSysCodeSnippetId(pSSysCodeSnippetId);
        return this;
    }

    /**
     * <B>PSSYSCODESNIPPETNAME</B>&nbsp;系统代码块名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCODESNIPPETNAME = "pssyscodesnippetname";

    /**
     * 设置 系统代码块名称
     * 
     * @param pSSysCodeSnippetName
     * 
     */
    @JsonProperty(FIELD_PSSYSCODESNIPPETNAME)
    public void setPSSysCodeSnippetName(String pSSysCodeSnippetName){
        this.set(FIELD_PSSYSCODESNIPPETNAME, pSSysCodeSnippetName);
    }
    
    /**
     * 获取 系统代码块名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysCodeSnippetName(){
        Object objValue = this.get(FIELD_PSSYSCODESNIPPETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码块名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCodeSnippetNameDirty(){
        if(this.contains(FIELD_PSSYSCODESNIPPETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码块名称
     */
    @JsonIgnore
    public void resetPSSysCodeSnippetName(){
        this.reset(FIELD_PSSYSCODESNIPPETNAME);
    }

    /**
     * 设置 系统代码块名称
     * <P>
     * 等同 {@link #setPSSysCodeSnippetName}
     * @param pSSysCodeSnippetName
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO pssyscodesnippetname(String pSSysCodeSnippetName){
        this.setPSSysCodeSnippetName(pSSysCodeSnippetName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCodeSnippetName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCodeSnippetName(strName);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO name(String strName){
        this.setPSSysCodeSnippetName(strName);
        return this;
    }

    /**
     * <B>TEMPLTYPE</B>&nbsp;模板类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SnippetTemplType} 
     */
    public final static String FIELD_TEMPLTYPE = "templtype";

    /**
     * 设置 模板类型
     * 
     * @param templType
     * 
     */
    @JsonProperty(FIELD_TEMPLTYPE)
    public void setTemplType(String templType){
        this.set(FIELD_TEMPLTYPE, templType);
    }
    
    /**
     * 获取 模板类型  
     * @return
     */
    @JsonIgnore
    public String getTemplType(){
        Object objValue = this.get(FIELD_TEMPLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplTypeDirty(){
        if(this.contains(FIELD_TEMPLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板类型
     */
    @JsonIgnore
    public void resetTemplType(){
        this.reset(FIELD_TEMPLTYPE);
    }

    /**
     * 设置 模板类型
     * <P>
     * 等同 {@link #setTemplType}
     * @param templType
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO templtype(String templType){
        this.setTemplType(templType);
        return this;
    }

     /**
     * 设置 模板类型
     * <P>
     * 等同 {@link #setTemplType}
     * @param templType
     */
    @JsonIgnore
    public PSSysCodeSnippetDTO templtype(net.ibizsys.model.PSModelEnums.SnippetTemplType templType){
        if(templType == null){
            this.setTemplType(null);
        }
        else{
            this.setTemplType(templType.value);
        }
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
    public PSSysCodeSnippetDTO updatedate(Timestamp updateDate){
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
    public PSSysCodeSnippetDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSSysCodeSnippetDTO validflag(Integer validFlag){
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
    public PSSysCodeSnippetDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysCodeSnippetId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysCodeSnippetId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCodeSnippetId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCodeSnippetId(strValue);
    }

    @JsonIgnore
    public PSSysCodeSnippetDTO id(String strValue){
        this.setPSSysCodeSnippetId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysCodeSnippetDTO){
            PSSysCodeSnippetDTO dto = (PSSysCodeSnippetDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
