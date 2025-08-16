package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEACTIONTEMPL</B>实体行为模板 模型传输对象
 * <P>
 * 
 */
public class PSDEActionTempl extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEActionTempl(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEActionTempl codename(String codeName){
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
    public PSDEActionTempl createdate(String createDate){
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
    public PSDEActionTempl createman(String createMan){
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
    public PSDEActionTempl memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDCCODESNIPPETID</B>&nbsp;应用中心代码块
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCCODESNIPPETID = "psdccodesnippetid";

    /**
     * 设置 应用中心代码块
     * 
     * @param pSDCCodeSnippetId
     * 
     */
    @JsonProperty(FIELD_PSDCCODESNIPPETID)
    public void setPSDCCodeSnippetId(String pSDCCodeSnippetId){
        this.set(FIELD_PSDCCODESNIPPETID, pSDCCodeSnippetId);
    }
    
    /**
     * 获取 应用中心代码块  
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
     * 判断 应用中心代码块 是否指定值，包括空值
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
     * 重置 应用中心代码块
     */
    @JsonIgnore
    public void resetPSDCCodeSnippetId(){
        this.reset(FIELD_PSDCCODESNIPPETID);
    }

    /**
     * 设置 应用中心代码块
     * <P>
     * 等同 {@link #setPSDCCodeSnippetId}
     * @param pSDCCodeSnippetId
     */
    @JsonIgnore
    public PSDEActionTempl psdccodesnippetid(String pSDCCodeSnippetId){
        this.setPSDCCodeSnippetId(pSDCCodeSnippetId);
        return this;
    }

    /**
     * <B>PSDCCODESNIPPETNAME</B>&nbsp;应用中心代码块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCCODESNIPPETID}
     */
    public final static String FIELD_PSDCCODESNIPPETNAME = "psdccodesnippetname";

    /**
     * 设置 应用中心代码块
     * 
     * @param pSDCCodeSnippetName
     * 
     */
    @JsonProperty(FIELD_PSDCCODESNIPPETNAME)
    public void setPSDCCodeSnippetName(String pSDCCodeSnippetName){
        this.set(FIELD_PSDCCODESNIPPETNAME, pSDCCodeSnippetName);
    }
    
    /**
     * 获取 应用中心代码块  
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
     * 判断 应用中心代码块 是否指定值，包括空值
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
     * 重置 应用中心代码块
     */
    @JsonIgnore
    public void resetPSDCCodeSnippetName(){
        this.reset(FIELD_PSDCCODESNIPPETNAME);
    }

    /**
     * 设置 应用中心代码块
     * <P>
     * 等同 {@link #setPSDCCodeSnippetName}
     * @param pSDCCodeSnippetName
     */
    @JsonIgnore
    public PSDEActionTempl psdccodesnippetname(String pSDCCodeSnippetName){
        this.setPSDCCodeSnippetName(pSDCCodeSnippetName);
        return this;
    }

    /**
     * <B>PSDEACTIONTEMPLID</B>&nbsp;实体行为模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEACTIONTEMPLID = "psdeactiontemplid";

    /**
     * 设置 实体行为模板标识
     * 
     * @param pSDEActionTemplId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONTEMPLID)
    public void setPSDEActionTemplId(String pSDEActionTemplId){
        this.set(FIELD_PSDEACTIONTEMPLID, pSDEActionTemplId);
    }
    
    /**
     * 获取 实体行为模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionTemplId(){
        Object objValue = this.get(FIELD_PSDEACTIONTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionTemplIdDirty(){
        if(this.contains(FIELD_PSDEACTIONTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为模板标识
     */
    @JsonIgnore
    public void resetPSDEActionTemplId(){
        this.reset(FIELD_PSDEACTIONTEMPLID);
    }

    /**
     * 设置 实体行为模板标识
     * <P>
     * 等同 {@link #setPSDEActionTemplId}
     * @param pSDEActionTemplId
     */
    @JsonIgnore
    public PSDEActionTempl psdeactiontemplid(String pSDEActionTemplId){
        this.setPSDEActionTemplId(pSDEActionTemplId);
        return this;
    }

    /**
     * <B>PSDEACTIONTEMPLNAME</B>&nbsp;实体行为模板名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEACTIONTEMPLNAME = "psdeactiontemplname";

    /**
     * 设置 实体行为模板名称
     * 
     * @param pSDEActionTemplName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONTEMPLNAME)
    public void setPSDEActionTemplName(String pSDEActionTemplName){
        this.set(FIELD_PSDEACTIONTEMPLNAME, pSDEActionTemplName);
    }
    
    /**
     * 获取 实体行为模板名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionTemplName(){
        Object objValue = this.get(FIELD_PSDEACTIONTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为模板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionTemplNameDirty(){
        if(this.contains(FIELD_PSDEACTIONTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为模板名称
     */
    @JsonIgnore
    public void resetPSDEActionTemplName(){
        this.reset(FIELD_PSDEACTIONTEMPLNAME);
    }

    /**
     * 设置 实体行为模板名称
     * <P>
     * 等同 {@link #setPSDEActionTemplName}
     * @param pSDEActionTemplName
     */
    @JsonIgnore
    public PSDEActionTempl psdeactiontemplname(String pSDEActionTemplName){
        this.setPSDEActionTemplName(pSDEActionTemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEActionTemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEActionTemplName(strName);
    }

    @JsonIgnore
    public PSDEActionTempl name(String strName){
        this.setPSDEActionTemplName(strName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定实体行为模板所在的系统模块
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
    public PSDEActionTempl psmoduleid(String pSModuleId){
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
    public PSDEActionTempl psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定实体行为模板所在的系统模块
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
    public PSDEActionTempl psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>TEMPLCODE</B>&nbsp;代码模版
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_TEMPLCODE = "templcode";

    /**
     * 设置 代码模版
     * 
     * @param templCode
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE)
    public void setTemplCode(String templCode){
        this.set(FIELD_TEMPLCODE, templCode);
    }
    
    /**
     * 获取 代码模版  
     * @return
     */
    @JsonIgnore
    public String getTemplCode(){
        Object objValue = this.get(FIELD_TEMPLCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCodeDirty(){
        if(this.contains(FIELD_TEMPLCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版
     */
    @JsonIgnore
    public void resetTemplCode(){
        this.reset(FIELD_TEMPLCODE);
    }

    /**
     * 设置 代码模版
     * <P>
     * 等同 {@link #setTemplCode}
     * @param templCode
     */
    @JsonIgnore
    public PSDEActionTempl templcode(String templCode){
        this.setTemplCode(templCode);
        return this;
    }

    /**
     * <B>TEMPLCODE2</B>&nbsp;代码模版2
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_TEMPLCODE2 = "templcode2";

    /**
     * 设置 代码模版2
     * 
     * @param templCode2
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE2)
    public void setTemplCode2(String templCode2){
        this.set(FIELD_TEMPLCODE2, templCode2);
    }
    
    /**
     * 获取 代码模版2  
     * @return
     */
    @JsonIgnore
    public String getTemplCode2(){
        Object objValue = this.get(FIELD_TEMPLCODE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode2Dirty(){
        if(this.contains(FIELD_TEMPLCODE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版2
     */
    @JsonIgnore
    public void resetTemplCode2(){
        this.reset(FIELD_TEMPLCODE2);
    }

    /**
     * 设置 代码模版2
     * <P>
     * 等同 {@link #setTemplCode2}
     * @param templCode2
     */
    @JsonIgnore
    public PSDEActionTempl templcode2(String templCode2){
        this.setTemplCode2(templCode2);
        return this;
    }

    /**
     * <B>TEMPLCODE2EX</B>&nbsp;代码模版2（扩展）
     */
    public final static String FIELD_TEMPLCODE2EX = "templcode2ex";

    /**
     * 设置 代码模版2（扩展）
     * 
     * @param templCode2Ex
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE2EX)
    public void setTemplCode2Ex(String templCode2Ex){
        this.set(FIELD_TEMPLCODE2EX, templCode2Ex);
    }
    
    /**
     * 获取 代码模版2（扩展）  
     * @return
     */
    @JsonIgnore
    public String getTemplCode2Ex(){
        Object objValue = this.get(FIELD_TEMPLCODE2EX);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版2（扩展） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode2ExDirty(){
        if(this.contains(FIELD_TEMPLCODE2EX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版2（扩展）
     */
    @JsonIgnore
    public void resetTemplCode2Ex(){
        this.reset(FIELD_TEMPLCODE2EX);
    }

    /**
     * 设置 代码模版2（扩展）
     * <P>
     * 等同 {@link #setTemplCode2Ex}
     * @param templCode2Ex
     */
    @JsonIgnore
    public PSDEActionTempl templcode2ex(String templCode2Ex){
        this.setTemplCode2Ex(templCode2Ex);
        return this;
    }

    /**
     * <B>TEMPLCODEEX</B>&nbsp;代码模版（扩展）
     */
    public final static String FIELD_TEMPLCODEEX = "templcodeex";

    /**
     * 设置 代码模版（扩展）
     * 
     * @param templCodeEx
     * 
     */
    @JsonProperty(FIELD_TEMPLCODEEX)
    public void setTemplCodeEx(String templCodeEx){
        this.set(FIELD_TEMPLCODEEX, templCodeEx);
    }
    
    /**
     * 获取 代码模版（扩展）  
     * @return
     */
    @JsonIgnore
    public String getTemplCodeEx(){
        Object objValue = this.get(FIELD_TEMPLCODEEX);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版（扩展） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCodeExDirty(){
        if(this.contains(FIELD_TEMPLCODEEX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版（扩展）
     */
    @JsonIgnore
    public void resetTemplCodeEx(){
        this.reset(FIELD_TEMPLCODEEX);
    }

    /**
     * 设置 代码模版（扩展）
     * <P>
     * 等同 {@link #setTemplCodeEx}
     * @param templCodeEx
     */
    @JsonIgnore
    public PSDEActionTempl templcodeex(String templCodeEx){
        this.setTemplCodeEx(templCodeEx);
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
    public PSDEActionTempl updatedate(String updateDate){
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
    public PSDEActionTempl updateman(String updateMan){
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
    public PSDEActionTempl usercat(String userCat){
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
    public PSDEActionTempl usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEActionTempl usertag(String userTag){
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
    public PSDEActionTempl usertag2(String userTag2){
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
    public PSDEActionTempl usertag3(String userTag3){
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
    public PSDEActionTempl usertag4(String userTag4){
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
    public PSDEActionTempl validflag(Integer validFlag){
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
    public PSDEActionTempl validflag(Boolean validFlag){
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
        return this.getPSDEActionTemplId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEActionTemplId(strValue);
    }

    @JsonIgnore
    public PSDEActionTempl id(String strValue){
        this.setPSDEActionTemplId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEActionTempl){
            PSDEActionTempl model = (PSDEActionTempl)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
