package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMSGQUEUE</B>系统消息队列 模型传输对象
 * <P>
 * 系统消息队列模型，定义系统对外发送消息的队列，包括系统本地实体存储队列或运行环境（Cloud）的队列
 */
public class PSSysMsgQueue extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysMsgQueue(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称，指定消息队列的代码标识，需要在当前的模型域（系统或模块）具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称，详细说明：{@link #FIELD_CODENAME}
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
     * 设置 代码名称，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysMsgQueue codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTPSDEFID</B>&nbsp;内容值属性，消息队列类型为【实体】时指定存储内容的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CONTENTPSDEFID = "contentpsdefid";

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFID}
     * 
     * @param contentPSDEFId
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFID)
    public void setContentPSDEFId(String contentPSDEFId){
        this.set(FIELD_CONTENTPSDEFID, contentPSDEFId);
    }
    
    /**
     * 获取 内容值属性  
     * @return
     */
    @JsonIgnore
    public String getContentPSDEFId(){
        Object objValue = this.get(FIELD_CONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSDEFIdDirty(){
        if(this.contains(FIELD_CONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容值属性
     */
    @JsonIgnore
    public void resetContentPSDEFId(){
        this.reset(FIELD_CONTENTPSDEFID);
    }

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFID}
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param contentPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue contentpsdefid(String contentPSDEFId){
        this.setContentPSDEFId(contentPSDEFId);
        return this;
    }

    /**
     * 设置 内容值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue contentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setContentPSDEFId(null);
            this.setContentPSDEFName(null);
        }
        else{
            this.setContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CONTENTPSDEFNAME</B>&nbsp;内容值属性，消息队列类型为【实体】时指定存储内容的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSDEFID}
     */
    public final static String FIELD_CONTENTPSDEFNAME = "contentpsdefname";

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFNAME}
     * 
     * @param contentPSDEFName
     * 
     */
    @JsonProperty(FIELD_CONTENTPSDEFNAME)
    public void setContentPSDEFName(String contentPSDEFName){
        this.set(FIELD_CONTENTPSDEFNAME, contentPSDEFName);
    }
    
    /**
     * 获取 内容值属性  
     * @return
     */
    @JsonIgnore
    public String getContentPSDEFName(){
        Object objValue = this.get(FIELD_CONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSDEFNameDirty(){
        if(this.contains(FIELD_CONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容值属性
     */
    @JsonIgnore
    public void resetContentPSDEFName(){
        this.reset(FIELD_CONTENTPSDEFNAME);
    }

    /**
     * 设置 内容值属性，详细说明：{@link #FIELD_CONTENTPSDEFNAME}
     * <P>
     * 等同 {@link #setContentPSDEFName}
     * @param contentPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue contentpsdefname(String contentPSDEFName){
        this.setContentPSDEFName(contentPSDEFName);
        return this;
    }

    /**
     * <B>CONTENTTYPEPSDEFID</B>&nbsp;内容类型属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CONTENTTYPEPSDEFID = "contenttypepsdefid";

    /**
     * 设置 内容类型属性
     * 
     * @param contentTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPEPSDEFID)
    public void setContentTypePSDEFId(String contentTypePSDEFId){
        this.set(FIELD_CONTENTTYPEPSDEFID, contentTypePSDEFId);
    }
    
    /**
     * 获取 内容类型属性  
     * @return
     */
    @JsonIgnore
    public String getContentTypePSDEFId(){
        Object objValue = this.get(FIELD_CONTENTTYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypePSDEFIdDirty(){
        if(this.contains(FIELD_CONTENTTYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型属性
     */
    @JsonIgnore
    public void resetContentTypePSDEFId(){
        this.reset(FIELD_CONTENTTYPEPSDEFID);
    }

    /**
     * 设置 内容类型属性
     * <P>
     * 等同 {@link #setContentTypePSDEFId}
     * @param contentTypePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue contenttypepsdefid(String contentTypePSDEFId){
        this.setContentTypePSDEFId(contentTypePSDEFId);
        return this;
    }

    /**
     * 设置 内容类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue contenttypepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setContentTypePSDEFId(null);
            this.setContentTypePSDEFName(null);
        }
        else{
            this.setContentTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setContentTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CONTENTTYPEPSDEFNAME</B>&nbsp;内容类型属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTTYPEPSDEFID}
     */
    public final static String FIELD_CONTENTTYPEPSDEFNAME = "contenttypepsdefname";

    /**
     * 设置 内容类型属性
     * 
     * @param contentTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPEPSDEFNAME)
    public void setContentTypePSDEFName(String contentTypePSDEFName){
        this.set(FIELD_CONTENTTYPEPSDEFNAME, contentTypePSDEFName);
    }
    
    /**
     * 获取 内容类型属性  
     * @return
     */
    @JsonIgnore
    public String getContentTypePSDEFName(){
        Object objValue = this.get(FIELD_CONTENTTYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypePSDEFNameDirty(){
        if(this.contains(FIELD_CONTENTTYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型属性
     */
    @JsonIgnore
    public void resetContentTypePSDEFName(){
        this.reset(FIELD_CONTENTTYPEPSDEFNAME);
    }

    /**
     * 设置 内容类型属性
     * <P>
     * 等同 {@link #setContentTypePSDEFName}
     * @param contentTypePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue contenttypepsdefname(String contentTypePSDEFName){
        this.setContentTypePSDEFName(contentTypePSDEFName);
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
    public PSSysMsgQueue createdate(String createDate){
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
    public PSSysMsgQueue createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysMsgQueue customcode(String customCode){
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
    public PSSysMsgQueue custommode(Integer customMode){
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
    public PSSysMsgQueue custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DDCONTENTPSDEFID</B>&nbsp;钉钉消息值属性，消息队列类型为【实体】时指定存储钉钉内容的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DDCONTENTPSDEFID = "ddcontentpsdefid";

    /**
     * 设置 钉钉消息值属性，详细说明：{@link #FIELD_DDCONTENTPSDEFID}
     * 
     * @param dDContentPSDEFId
     * 
     */
    @JsonProperty(FIELD_DDCONTENTPSDEFID)
    public void setDDContentPSDEFId(String dDContentPSDEFId){
        this.set(FIELD_DDCONTENTPSDEFID, dDContentPSDEFId);
    }
    
    /**
     * 获取 钉钉消息值属性  
     * @return
     */
    @JsonIgnore
    public String getDDContentPSDEFId(){
        Object objValue = this.get(FIELD_DDCONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钉钉消息值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDDContentPSDEFIdDirty(){
        if(this.contains(FIELD_DDCONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钉钉消息值属性
     */
    @JsonIgnore
    public void resetDDContentPSDEFId(){
        this.reset(FIELD_DDCONTENTPSDEFID);
    }

    /**
     * 设置 钉钉消息值属性，详细说明：{@link #FIELD_DDCONTENTPSDEFID}
     * <P>
     * 等同 {@link #setDDContentPSDEFId}
     * @param dDContentPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue ddcontentpsdefid(String dDContentPSDEFId){
        this.setDDContentPSDEFId(dDContentPSDEFId);
        return this;
    }

    /**
     * 设置 钉钉消息值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDDContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue ddcontentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDDContentPSDEFId(null);
            this.setDDContentPSDEFName(null);
        }
        else{
            this.setDDContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setDDContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DDCONTENTPSDEFNAME</B>&nbsp;钉钉消息值属性，消息队列类型为【实体】时指定存储钉钉内容的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DDCONTENTPSDEFID}
     */
    public final static String FIELD_DDCONTENTPSDEFNAME = "ddcontentpsdefname";

    /**
     * 设置 钉钉消息值属性，详细说明：{@link #FIELD_DDCONTENTPSDEFNAME}
     * 
     * @param dDContentPSDEFName
     * 
     */
    @JsonProperty(FIELD_DDCONTENTPSDEFNAME)
    public void setDDContentPSDEFName(String dDContentPSDEFName){
        this.set(FIELD_DDCONTENTPSDEFNAME, dDContentPSDEFName);
    }
    
    /**
     * 获取 钉钉消息值属性  
     * @return
     */
    @JsonIgnore
    public String getDDContentPSDEFName(){
        Object objValue = this.get(FIELD_DDCONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 钉钉消息值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDDContentPSDEFNameDirty(){
        if(this.contains(FIELD_DDCONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 钉钉消息值属性
     */
    @JsonIgnore
    public void resetDDContentPSDEFName(){
        this.reset(FIELD_DDCONTENTPSDEFNAME);
    }

    /**
     * 设置 钉钉消息值属性，详细说明：{@link #FIELD_DDCONTENTPSDEFNAME}
     * <P>
     * 等同 {@link #setDDContentPSDEFName}
     * @param dDContentPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue ddcontentpsdefname(String dDContentPSDEFName){
        this.setDDContentPSDEFName(dDContentPSDEFName);
        return this;
    }

    /**
     * <B>FILEPSDEFID</B>&nbsp;文件属性，消息队列类型为【实体】时指定文件附件信息的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_FILEPSDEFID = "filepsdefid";

    /**
     * 设置 文件属性，详细说明：{@link #FIELD_FILEPSDEFID}
     * 
     * @param filePSDEFId
     * 
     */
    @JsonProperty(FIELD_FILEPSDEFID)
    public void setFilePSDEFId(String filePSDEFId){
        this.set(FIELD_FILEPSDEFID, filePSDEFId);
    }
    
    /**
     * 获取 文件属性  
     * @return
     */
    @JsonIgnore
    public String getFilePSDEFId(){
        Object objValue = this.get(FIELD_FILEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文件属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilePSDEFIdDirty(){
        if(this.contains(FIELD_FILEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文件属性
     */
    @JsonIgnore
    public void resetFilePSDEFId(){
        this.reset(FIELD_FILEPSDEFID);
    }

    /**
     * 设置 文件属性，详细说明：{@link #FIELD_FILEPSDEFID}
     * <P>
     * 等同 {@link #setFilePSDEFId}
     * @param filePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue filepsdefid(String filePSDEFId){
        this.setFilePSDEFId(filePSDEFId);
        return this;
    }

    /**
     * 设置 文件属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFilePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue filepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setFilePSDEFId(null);
            this.setFilePSDEFName(null);
        }
        else{
            this.setFilePSDEFId(pSDEField.getPSDEFieldId());
            this.setFilePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>FILEPSDEFNAME</B>&nbsp;文件属性，消息队列类型为【实体】时指定文件附件信息的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FILEPSDEFID}
     */
    public final static String FIELD_FILEPSDEFNAME = "filepsdefname";

    /**
     * 设置 文件属性，详细说明：{@link #FIELD_FILEPSDEFNAME}
     * 
     * @param filePSDEFName
     * 
     */
    @JsonProperty(FIELD_FILEPSDEFNAME)
    public void setFilePSDEFName(String filePSDEFName){
        this.set(FIELD_FILEPSDEFNAME, filePSDEFName);
    }
    
    /**
     * 获取 文件属性  
     * @return
     */
    @JsonIgnore
    public String getFilePSDEFName(){
        Object objValue = this.get(FIELD_FILEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文件属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFilePSDEFNameDirty(){
        if(this.contains(FIELD_FILEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文件属性
     */
    @JsonIgnore
    public void resetFilePSDEFName(){
        this.reset(FIELD_FILEPSDEFNAME);
    }

    /**
     * 设置 文件属性，详细说明：{@link #FIELD_FILEPSDEFNAME}
     * <P>
     * 等同 {@link #setFilePSDEFName}
     * @param filePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue filepsdefname(String filePSDEFName){
        this.setFilePSDEFName(filePSDEFName);
        return this;
    }

    /**
     * <B>IMCONTENTPSDEFID</B>&nbsp;即时消息值属性，消息队列类型为【实体】时指定存储即时消息的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_IMCONTENTPSDEFID = "imcontentpsdefid";

    /**
     * 设置 即时消息值属性，详细说明：{@link #FIELD_IMCONTENTPSDEFID}
     * 
     * @param iMContentPSDEFId
     * 
     */
    @JsonProperty(FIELD_IMCONTENTPSDEFID)
    public void setIMContentPSDEFId(String iMContentPSDEFId){
        this.set(FIELD_IMCONTENTPSDEFID, iMContentPSDEFId);
    }
    
    /**
     * 获取 即时消息值属性  
     * @return
     */
    @JsonIgnore
    public String getIMContentPSDEFId(){
        Object objValue = this.get(FIELD_IMCONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 即时消息值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIMContentPSDEFIdDirty(){
        if(this.contains(FIELD_IMCONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 即时消息值属性
     */
    @JsonIgnore
    public void resetIMContentPSDEFId(){
        this.reset(FIELD_IMCONTENTPSDEFID);
    }

    /**
     * 设置 即时消息值属性，详细说明：{@link #FIELD_IMCONTENTPSDEFID}
     * <P>
     * 等同 {@link #setIMContentPSDEFId}
     * @param iMContentPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue imcontentpsdefid(String iMContentPSDEFId){
        this.setIMContentPSDEFId(iMContentPSDEFId);
        return this;
    }

    /**
     * 设置 即时消息值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIMContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue imcontentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIMContentPSDEFId(null);
            this.setIMContentPSDEFName(null);
        }
        else{
            this.setIMContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setIMContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>IMCONTENTPSDEFNAME</B>&nbsp;即时消息值属性，消息队列类型为【实体】时指定存储即时消息的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_IMCONTENTPSDEFID}
     */
    public final static String FIELD_IMCONTENTPSDEFNAME = "imcontentpsdefname";

    /**
     * 设置 即时消息值属性，详细说明：{@link #FIELD_IMCONTENTPSDEFNAME}
     * 
     * @param iMContentPSDEFName
     * 
     */
    @JsonProperty(FIELD_IMCONTENTPSDEFNAME)
    public void setIMContentPSDEFName(String iMContentPSDEFName){
        this.set(FIELD_IMCONTENTPSDEFNAME, iMContentPSDEFName);
    }
    
    /**
     * 获取 即时消息值属性  
     * @return
     */
    @JsonIgnore
    public String getIMContentPSDEFName(){
        Object objValue = this.get(FIELD_IMCONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 即时消息值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIMContentPSDEFNameDirty(){
        if(this.contains(FIELD_IMCONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 即时消息值属性
     */
    @JsonIgnore
    public void resetIMContentPSDEFName(){
        this.reset(FIELD_IMCONTENTPSDEFNAME);
    }

    /**
     * 设置 即时消息值属性，详细说明：{@link #FIELD_IMCONTENTPSDEFNAME}
     * <P>
     * 等同 {@link #setIMContentPSDEFName}
     * @param iMContentPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue imcontentpsdefname(String iMContentPSDEFName){
        this.setIMContentPSDEFName(iMContentPSDEFName);
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
    public PSSysMsgQueue memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBTASKURLPSDEFID</B>&nbsp;移动端任务路径值属性，消息队列类型为【实体】时指定消息队列中移动端任务路径的值存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MOBTASKURLPSDEFID = "mobtaskurlpsdefid";

    /**
     * 设置 移动端任务路径值属性，详细说明：{@link #FIELD_MOBTASKURLPSDEFID}
     * 
     * @param mobTaskUrlPSDEFId
     * 
     */
    @JsonProperty(FIELD_MOBTASKURLPSDEFID)
    public void setMobTaskUrlPSDEFId(String mobTaskUrlPSDEFId){
        this.set(FIELD_MOBTASKURLPSDEFID, mobTaskUrlPSDEFId);
    }
    
    /**
     * 获取 移动端任务路径值属性  
     * @return
     */
    @JsonIgnore
    public String getMobTaskUrlPSDEFId(){
        Object objValue = this.get(FIELD_MOBTASKURLPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端任务路径值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobTaskUrlPSDEFIdDirty(){
        if(this.contains(FIELD_MOBTASKURLPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端任务路径值属性
     */
    @JsonIgnore
    public void resetMobTaskUrlPSDEFId(){
        this.reset(FIELD_MOBTASKURLPSDEFID);
    }

    /**
     * 设置 移动端任务路径值属性，详细说明：{@link #FIELD_MOBTASKURLPSDEFID}
     * <P>
     * 等同 {@link #setMobTaskUrlPSDEFId}
     * @param mobTaskUrlPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue mobtaskurlpsdefid(String mobTaskUrlPSDEFId){
        this.setMobTaskUrlPSDEFId(mobTaskUrlPSDEFId);
        return this;
    }

    /**
     * 设置 移动端任务路径值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobTaskUrlPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue mobtaskurlpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMobTaskUrlPSDEFId(null);
            this.setMobTaskUrlPSDEFName(null);
        }
        else{
            this.setMobTaskUrlPSDEFId(pSDEField.getPSDEFieldId());
            this.setMobTaskUrlPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MOBTASKURLPSDEFNAME</B>&nbsp;移动端任务路径值属性，消息队列类型为【实体】时指定消息队列中移动端任务路径的值存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBTASKURLPSDEFID}
     */
    public final static String FIELD_MOBTASKURLPSDEFNAME = "mobtaskurlpsdefname";

    /**
     * 设置 移动端任务路径值属性，详细说明：{@link #FIELD_MOBTASKURLPSDEFNAME}
     * 
     * @param mobTaskUrlPSDEFName
     * 
     */
    @JsonProperty(FIELD_MOBTASKURLPSDEFNAME)
    public void setMobTaskUrlPSDEFName(String mobTaskUrlPSDEFName){
        this.set(FIELD_MOBTASKURLPSDEFNAME, mobTaskUrlPSDEFName);
    }
    
    /**
     * 获取 移动端任务路径值属性  
     * @return
     */
    @JsonIgnore
    public String getMobTaskUrlPSDEFName(){
        Object objValue = this.get(FIELD_MOBTASKURLPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端任务路径值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobTaskUrlPSDEFNameDirty(){
        if(this.contains(FIELD_MOBTASKURLPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端任务路径值属性
     */
    @JsonIgnore
    public void resetMobTaskUrlPSDEFName(){
        this.reset(FIELD_MOBTASKURLPSDEFNAME);
    }

    /**
     * 设置 移动端任务路径值属性，详细说明：{@link #FIELD_MOBTASKURLPSDEFNAME}
     * <P>
     * 等同 {@link #setMobTaskUrlPSDEFName}
     * @param mobTaskUrlPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue mobtaskurlpsdefname(String mobTaskUrlPSDEFName){
        this.setMobTaskUrlPSDEFName(mobTaskUrlPSDEFName);
        return this;
    }

    /**
     * <B>MSGQUEUEPARAMS</B>&nbsp;消息队列参数
     */
    public final static String FIELD_MSGQUEUEPARAMS = "msgqueueparams";

    /**
     * 设置 消息队列参数
     * 
     * @param msgQueueParams
     * 
     */
    @JsonProperty(FIELD_MSGQUEUEPARAMS)
    public void setMsgQueueParams(String msgQueueParams){
        this.set(FIELD_MSGQUEUEPARAMS, msgQueueParams);
    }
    
    /**
     * 获取 消息队列参数  
     * @return
     */
    @JsonIgnore
    public String getMsgQueueParams(){
        Object objValue = this.get(FIELD_MSGQUEUEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息队列参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgQueueParamsDirty(){
        if(this.contains(FIELD_MSGQUEUEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息队列参数
     */
    @JsonIgnore
    public void resetMsgQueueParams(){
        this.reset(FIELD_MSGQUEUEPARAMS);
    }

    /**
     * 设置 消息队列参数
     * <P>
     * 等同 {@link #setMsgQueueParams}
     * @param msgQueueParams
     */
    @JsonIgnore
    public PSSysMsgQueue msgqueueparams(String msgQueueParams){
        this.setMsgQueueParams(msgQueueParams);
        return this;
    }

    /**
     * <B>MSGQUEUETAG</B>&nbsp;消息队列标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MSGQUEUETAG = "msgqueuetag";

    /**
     * 设置 消息队列标记
     * 
     * @param msgQueueTag
     * 
     */
    @JsonProperty(FIELD_MSGQUEUETAG)
    public void setMsgQueueTag(String msgQueueTag){
        this.set(FIELD_MSGQUEUETAG, msgQueueTag);
    }
    
    /**
     * 获取 消息队列标记  
     * @return
     */
    @JsonIgnore
    public String getMsgQueueTag(){
        Object objValue = this.get(FIELD_MSGQUEUETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息队列标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgQueueTagDirty(){
        if(this.contains(FIELD_MSGQUEUETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息队列标记
     */
    @JsonIgnore
    public void resetMsgQueueTag(){
        this.reset(FIELD_MSGQUEUETAG);
    }

    /**
     * 设置 消息队列标记
     * <P>
     * 等同 {@link #setMsgQueueTag}
     * @param msgQueueTag
     */
    @JsonIgnore
    public PSSysMsgQueue msgqueuetag(String msgQueueTag){
        this.setMsgQueueTag(msgQueueTag);
        return this;
    }

    /**
     * <B>MSGQUEUETAG2</B>&nbsp;消息队列标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MSGQUEUETAG2 = "msgqueuetag2";

    /**
     * 设置 消息队列标记2
     * 
     * @param msgQueueTag2
     * 
     */
    @JsonProperty(FIELD_MSGQUEUETAG2)
    public void setMsgQueueTag2(String msgQueueTag2){
        this.set(FIELD_MSGQUEUETAG2, msgQueueTag2);
    }
    
    /**
     * 获取 消息队列标记2  
     * @return
     */
    @JsonIgnore
    public String getMsgQueueTag2(){
        Object objValue = this.get(FIELD_MSGQUEUETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息队列标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgQueueTag2Dirty(){
        if(this.contains(FIELD_MSGQUEUETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息队列标记2
     */
    @JsonIgnore
    public void resetMsgQueueTag2(){
        this.reset(FIELD_MSGQUEUETAG2);
    }

    /**
     * 设置 消息队列标记2
     * <P>
     * 等同 {@link #setMsgQueueTag2}
     * @param msgQueueTag2
     */
    @JsonIgnore
    public PSSysMsgQueue msgqueuetag2(String msgQueueTag2){
        this.setMsgQueueTag2(msgQueueTag2);
        return this;
    }

    /**
     * <B>MSGQUEUETYPE</B>&nbsp;消息队列类型，指定消息队列的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MsgQueueType} 
     */
    public final static String FIELD_MSGQUEUETYPE = "msgqueuetype";

    /**
     * 设置 消息队列类型，详细说明：{@link #FIELD_MSGQUEUETYPE}
     * 
     * @param msgQueueType
     * 
     */
    @JsonProperty(FIELD_MSGQUEUETYPE)
    public void setMsgQueueType(String msgQueueType){
        this.set(FIELD_MSGQUEUETYPE, msgQueueType);
    }
    
    /**
     * 获取 消息队列类型  
     * @return
     */
    @JsonIgnore
    public String getMsgQueueType(){
        Object objValue = this.get(FIELD_MSGQUEUETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息队列类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgQueueTypeDirty(){
        if(this.contains(FIELD_MSGQUEUETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息队列类型
     */
    @JsonIgnore
    public void resetMsgQueueType(){
        this.reset(FIELD_MSGQUEUETYPE);
    }

    /**
     * 设置 消息队列类型，详细说明：{@link #FIELD_MSGQUEUETYPE}
     * <P>
     * 等同 {@link #setMsgQueueType}
     * @param msgQueueType
     */
    @JsonIgnore
    public PSSysMsgQueue msgqueuetype(String msgQueueType){
        this.setMsgQueueType(msgQueueType);
        return this;
    }

     /**
     * 设置 消息队列类型，详细说明：{@link #FIELD_MSGQUEUETYPE}
     * <P>
     * 等同 {@link #setMsgQueueType}
     * @param msgQueueType
     */
    @JsonIgnore
    public PSSysMsgQueue msgqueuetype(net.ibizsys.psmodel.core.util.PSModelEnums.MsgQueueType msgQueueType){
        if(msgQueueType == null){
            this.setMsgQueueType(null);
        }
        else{
            this.setMsgQueueType(msgQueueType.value);
        }
        return this;
    }

    /**
     * <B>MSGTYPEPSDEFID</B>&nbsp;消息类型值属性，消息队列类型为【实体】时指定存储消息类型的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MSGTYPEPSDEFID = "msgtypepsdefid";

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFID}
     * 
     * @param msgTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_MSGTYPEPSDEFID)
    public void setMsgTypePSDEFId(String msgTypePSDEFId){
        this.set(FIELD_MSGTYPEPSDEFID, msgTypePSDEFId);
    }
    
    /**
     * 获取 消息类型值属性  
     * @return
     */
    @JsonIgnore
    public String getMsgTypePSDEFId(){
        Object objValue = this.get(FIELD_MSGTYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息类型值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTypePSDEFIdDirty(){
        if(this.contains(FIELD_MSGTYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息类型值属性
     */
    @JsonIgnore
    public void resetMsgTypePSDEFId(){
        this.reset(FIELD_MSGTYPEPSDEFID);
    }

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFID}
     * <P>
     * 等同 {@link #setMsgTypePSDEFId}
     * @param msgTypePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue msgtypepsdefid(String msgTypePSDEFId){
        this.setMsgTypePSDEFId(msgTypePSDEFId);
        return this;
    }

    /**
     * 设置 消息类型值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMsgTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue msgtypepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMsgTypePSDEFId(null);
            this.setMsgTypePSDEFName(null);
        }
        else{
            this.setMsgTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setMsgTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MSGTYPEPSDEFNAME</B>&nbsp;消息类型值属性，消息队列类型为【实体】时指定存储消息类型的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MSGTYPEPSDEFID}
     */
    public final static String FIELD_MSGTYPEPSDEFNAME = "msgtypepsdefname";

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFNAME}
     * 
     * @param msgTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_MSGTYPEPSDEFNAME)
    public void setMsgTypePSDEFName(String msgTypePSDEFName){
        this.set(FIELD_MSGTYPEPSDEFNAME, msgTypePSDEFName);
    }
    
    /**
     * 获取 消息类型值属性  
     * @return
     */
    @JsonIgnore
    public String getMsgTypePSDEFName(){
        Object objValue = this.get(FIELD_MSGTYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息类型值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgTypePSDEFNameDirty(){
        if(this.contains(FIELD_MSGTYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息类型值属性
     */
    @JsonIgnore
    public void resetMsgTypePSDEFName(){
        this.reset(FIELD_MSGTYPEPSDEFNAME);
    }

    /**
     * 设置 消息类型值属性，详细说明：{@link #FIELD_MSGTYPEPSDEFNAME}
     * <P>
     * 等同 {@link #setMsgTypePSDEFName}
     * @param msgTypePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue msgtypepsdefname(String msgTypePSDEFName){
        this.setMsgTypePSDEFName(msgTypePSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，消息队列类型为【实体】时指定存储的实体对象
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
    public PSSysMsgQueue psdeid(String pSDEId){
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
    public PSSysMsgQueue psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，消息队列类型为【实体】时指定存储的实体对象
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
    public PSSysMsgQueue psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysMsgQueue psmoduleid(String pSModuleId){
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
    public PSSysMsgQueue psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysMsgQueue psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysMsgQueue pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysMsgQueue pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSMSGQUEUEID</B>&nbsp;系统消息队列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMSGQUEUEID = "pssysmsgqueueid";

    /**
     * 设置 系统消息队列标识
     * 
     * @param pSSysMsgQueueId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGQUEUEID)
    public void setPSSysMsgQueueId(String pSSysMsgQueueId){
        this.set(FIELD_PSSYSMSGQUEUEID, pSSysMsgQueueId);
    }
    
    /**
     * 获取 系统消息队列标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgQueueId(){
        Object objValue = this.get(FIELD_PSSYSMSGQUEUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统消息队列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgQueueIdDirty(){
        if(this.contains(FIELD_PSSYSMSGQUEUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统消息队列标识
     */
    @JsonIgnore
    public void resetPSSysMsgQueueId(){
        this.reset(FIELD_PSSYSMSGQUEUEID);
    }

    /**
     * 设置 系统消息队列标识
     * <P>
     * 等同 {@link #setPSSysMsgQueueId}
     * @param pSSysMsgQueueId
     */
    @JsonIgnore
    public PSSysMsgQueue pssysmsgqueueid(String pSSysMsgQueueId){
        this.setPSSysMsgQueueId(pSSysMsgQueueId);
        return this;
    }

    /**
     * <B>PSSYSMSGQUEUENAME</B>&nbsp;消息队列名称，指定消息队列的名称，需要在当前的模型域（系统或模块）具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSMSGQUEUENAME = "pssysmsgqueuename";

    /**
     * 设置 消息队列名称，详细说明：{@link #FIELD_PSSYSMSGQUEUENAME}
     * 
     * @param pSSysMsgQueueName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGQUEUENAME)
    public void setPSSysMsgQueueName(String pSSysMsgQueueName){
        this.set(FIELD_PSSYSMSGQUEUENAME, pSSysMsgQueueName);
    }
    
    /**
     * 获取 消息队列名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgQueueName(){
        Object objValue = this.get(FIELD_PSSYSMSGQUEUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息队列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgQueueNameDirty(){
        if(this.contains(FIELD_PSSYSMSGQUEUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息队列名称
     */
    @JsonIgnore
    public void resetPSSysMsgQueueName(){
        this.reset(FIELD_PSSYSMSGQUEUENAME);
    }

    /**
     * 设置 消息队列名称，详细说明：{@link #FIELD_PSSYSMSGQUEUENAME}
     * <P>
     * 等同 {@link #setPSSysMsgQueueName}
     * @param pSSysMsgQueueName
     */
    @JsonIgnore
    public PSSysMsgQueue pssysmsgqueuename(String pSSysMsgQueueName){
        this.setPSSysMsgQueueName(pSSysMsgQueueName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysMsgQueueName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysMsgQueueName(strName);
    }

    @JsonIgnore
    public PSSysMsgQueue name(String strName){
        this.setPSSysMsgQueueName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysMsgQueue pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysMsgQueue pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUTILDEID</B>&nbsp;系统功能组件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUtil} 
     */
    public final static String FIELD_PSSYSUTILDEID = "pssysutildeid";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDEID)
    public void setPSSysUtilDEId(String pSSysUtilDEId){
        this.set(FIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEId(){
        Object objValue = this.get(FIELD_PSSYSUTILDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty(){
        if(this.contains(FIELD_PSSYSUTILDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEId(){
        this.reset(FIELD_PSSYSUTILDEID);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtilDEId
     */
    @JsonIgnore
    public PSSysMsgQueue pssysutildeid(String pSSysUtilDEId){
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    /**
     * 设置 系统功能组件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtil 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue pssysutildeid(PSSysUtil pSSysUtil){
        if(pSSysUtil == null){
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        }
        else{
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    /**
     * <B>PSSYSUTILDENAME</B>&nbsp;系统功能组件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUTILDEID}
     */
    public final static String FIELD_PSSYSUTILDENAME = "pssysutildename";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDENAME)
    public void setPSSysUtilDEName(String pSSysUtilDEName){
        this.set(FIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEName(){
        Object objValue = this.get(FIELD_PSSYSUTILDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDENameDirty(){
        if(this.contains(FIELD_PSSYSUTILDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEName(){
        this.reset(FIELD_PSSYSUTILDENAME);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEName}
     * @param pSSysUtilDEName
     */
    @JsonIgnore
    public PSSysMsgQueue pssysutildename(String pSSysUtilDEName){
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    /**
     * <B>QUEUEPARAMS</B>&nbsp;队列参数，指定消息队列的参数
     */
    public final static String FIELD_QUEUEPARAMS = "queueparams";

    /**
     * 设置 队列参数，详细说明：{@link #FIELD_QUEUEPARAMS}
     * 
     * @param queueParams
     * 
     */
    @JsonProperty(FIELD_QUEUEPARAMS)
    public void setQueueParams(String queueParams){
        this.set(FIELD_QUEUEPARAMS, queueParams);
    }
    
    /**
     * 获取 队列参数  
     * @return
     */
    @JsonIgnore
    public String getQueueParams(){
        Object objValue = this.get(FIELD_QUEUEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 队列参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueueParamsDirty(){
        if(this.contains(FIELD_QUEUEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 队列参数
     */
    @JsonIgnore
    public void resetQueueParams(){
        this.reset(FIELD_QUEUEPARAMS);
    }

    /**
     * 设置 队列参数，详细说明：{@link #FIELD_QUEUEPARAMS}
     * <P>
     * 等同 {@link #setQueueParams}
     * @param queueParams
     */
    @JsonIgnore
    public PSSysMsgQueue queueparams(String queueParams){
        this.setQueueParams(queueParams);
        return this;
    }

    /**
     * <B>SENDTIMEPSDEFID</B>&nbsp;发送时间属性，消息队列类型为【实体】时指定存储计划发送时间的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SENDTIMEPSDEFID = "sendtimepsdefid";

    /**
     * 设置 发送时间属性，详细说明：{@link #FIELD_SENDTIMEPSDEFID}
     * 
     * @param sendTimePSDEFId
     * 
     */
    @JsonProperty(FIELD_SENDTIMEPSDEFID)
    public void setSendTimePSDEFId(String sendTimePSDEFId){
        this.set(FIELD_SENDTIMEPSDEFID, sendTimePSDEFId);
    }
    
    /**
     * 获取 发送时间属性  
     * @return
     */
    @JsonIgnore
    public String getSendTimePSDEFId(){
        Object objValue = this.get(FIELD_SENDTIMEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发送时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSendTimePSDEFIdDirty(){
        if(this.contains(FIELD_SENDTIMEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发送时间属性
     */
    @JsonIgnore
    public void resetSendTimePSDEFId(){
        this.reset(FIELD_SENDTIMEPSDEFID);
    }

    /**
     * 设置 发送时间属性，详细说明：{@link #FIELD_SENDTIMEPSDEFID}
     * <P>
     * 等同 {@link #setSendTimePSDEFId}
     * @param sendTimePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue sendtimepsdefid(String sendTimePSDEFId){
        this.setSendTimePSDEFId(sendTimePSDEFId);
        return this;
    }

    /**
     * 设置 发送时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSendTimePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue sendtimepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setSendTimePSDEFId(null);
            this.setSendTimePSDEFName(null);
        }
        else{
            this.setSendTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setSendTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SENDTIMEPSDEFNAME</B>&nbsp;发送时间值属性，消息队列类型为【实体】时指定存储计划发送时间的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SENDTIMEPSDEFID}
     */
    public final static String FIELD_SENDTIMEPSDEFNAME = "sendtimepsdefname";

    /**
     * 设置 发送时间值属性，详细说明：{@link #FIELD_SENDTIMEPSDEFNAME}
     * 
     * @param sendTimePSDEFName
     * 
     */
    @JsonProperty(FIELD_SENDTIMEPSDEFNAME)
    public void setSendTimePSDEFName(String sendTimePSDEFName){
        this.set(FIELD_SENDTIMEPSDEFNAME, sendTimePSDEFName);
    }
    
    /**
     * 获取 发送时间值属性  
     * @return
     */
    @JsonIgnore
    public String getSendTimePSDEFName(){
        Object objValue = this.get(FIELD_SENDTIMEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发送时间值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSendTimePSDEFNameDirty(){
        if(this.contains(FIELD_SENDTIMEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发送时间值属性
     */
    @JsonIgnore
    public void resetSendTimePSDEFName(){
        this.reset(FIELD_SENDTIMEPSDEFNAME);
    }

    /**
     * 设置 发送时间值属性，详细说明：{@link #FIELD_SENDTIMEPSDEFNAME}
     * <P>
     * 等同 {@link #setSendTimePSDEFName}
     * @param sendTimePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue sendtimepsdefname(String sendTimePSDEFName){
        this.setSendTimePSDEFName(sendTimePSDEFName);
        return this;
    }

    /**
     * <B>SMSCONTENTPSDEFID</B>&nbsp;短内容值属性，消息队列类型为【实体】时指定存储短消息内容的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SMSCONTENTPSDEFID = "smscontentpsdefid";

    /**
     * 设置 短内容值属性，详细说明：{@link #FIELD_SMSCONTENTPSDEFID}
     * 
     * @param sMSContentPSDEFId
     * 
     */
    @JsonProperty(FIELD_SMSCONTENTPSDEFID)
    public void setSMSContentPSDEFId(String sMSContentPSDEFId){
        this.set(FIELD_SMSCONTENTPSDEFID, sMSContentPSDEFId);
    }
    
    /**
     * 获取 短内容值属性  
     * @return
     */
    @JsonIgnore
    public String getSMSContentPSDEFId(){
        Object objValue = this.get(FIELD_SMSCONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 短内容值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMSContentPSDEFIdDirty(){
        if(this.contains(FIELD_SMSCONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 短内容值属性
     */
    @JsonIgnore
    public void resetSMSContentPSDEFId(){
        this.reset(FIELD_SMSCONTENTPSDEFID);
    }

    /**
     * 设置 短内容值属性，详细说明：{@link #FIELD_SMSCONTENTPSDEFID}
     * <P>
     * 等同 {@link #setSMSContentPSDEFId}
     * @param sMSContentPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue smscontentpsdefid(String sMSContentPSDEFId){
        this.setSMSContentPSDEFId(sMSContentPSDEFId);
        return this;
    }

    /**
     * 设置 短内容值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSMSContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue smscontentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setSMSContentPSDEFId(null);
            this.setSMSContentPSDEFName(null);
        }
        else{
            this.setSMSContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setSMSContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SMSCONTENTPSDEFNAME</B>&nbsp;短内容值属性，消息队列类型为【实体】时指定存储短消息内容的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SMSCONTENTPSDEFID}
     */
    public final static String FIELD_SMSCONTENTPSDEFNAME = "smscontentpsdefname";

    /**
     * 设置 短内容值属性，详细说明：{@link #FIELD_SMSCONTENTPSDEFNAME}
     * 
     * @param sMSContentPSDEFName
     * 
     */
    @JsonProperty(FIELD_SMSCONTENTPSDEFNAME)
    public void setSMSContentPSDEFName(String sMSContentPSDEFName){
        this.set(FIELD_SMSCONTENTPSDEFNAME, sMSContentPSDEFName);
    }
    
    /**
     * 获取 短内容值属性  
     * @return
     */
    @JsonIgnore
    public String getSMSContentPSDEFName(){
        Object objValue = this.get(FIELD_SMSCONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 短内容值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMSContentPSDEFNameDirty(){
        if(this.contains(FIELD_SMSCONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 短内容值属性
     */
    @JsonIgnore
    public void resetSMSContentPSDEFName(){
        this.reset(FIELD_SMSCONTENTPSDEFNAME);
    }

    /**
     * 设置 短内容值属性，详细说明：{@link #FIELD_SMSCONTENTPSDEFNAME}
     * <P>
     * 等同 {@link #setSMSContentPSDEFName}
     * @param sMSContentPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue smscontentpsdefname(String sMSContentPSDEFName){
        this.setSMSContentPSDEFName(sMSContentPSDEFName);
        return this;
    }

    /**
     * <B>STATEPSDEFID</B>&nbsp;状态属性，消息队列类型为【实体】时指定存储消息状态的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_STATEPSDEFID = "statepsdefid";

    /**
     * 设置 状态属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * 
     * @param statePSDEFId
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFID)
    public void setStatePSDEFId(String statePSDEFId){
        this.set(FIELD_STATEPSDEFID, statePSDEFId);
    }
    
    /**
     * 获取 状态属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFId(){
        Object objValue = this.get(FIELD_STATEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFIdDirty(){
        if(this.contains(FIELD_STATEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态属性
     */
    @JsonIgnore
    public void resetStatePSDEFId(){
        this.reset(FIELD_STATEPSDEFID);
    }

    /**
     * 设置 状态属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param statePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue statepsdefid(String statePSDEFId){
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    /**
     * 设置 状态属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue statepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        }
        else{
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATEPSDEFNAME</B>&nbsp;状态值属性，消息队列类型为【实体】时指定存储消息状态的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATEPSDEFID}
     */
    public final static String FIELD_STATEPSDEFNAME = "statepsdefname";

    /**
     * 设置 状态值属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * 
     * @param statePSDEFName
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFNAME)
    public void setStatePSDEFName(String statePSDEFName){
        this.set(FIELD_STATEPSDEFNAME, statePSDEFName);
    }
    
    /**
     * 获取 状态值属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFName(){
        Object objValue = this.get(FIELD_STATEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 状态值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFNameDirty(){
        if(this.contains(FIELD_STATEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态值属性
     */
    @JsonIgnore
    public void resetStatePSDEFName(){
        this.reset(FIELD_STATEPSDEFNAME);
    }

    /**
     * 设置 状态值属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * <P>
     * 等同 {@link #setStatePSDEFName}
     * @param statePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue statepsdefname(String statePSDEFName){
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    /**
     * <B>TAG2PSDEFID</B>&nbsp;标记2属性，消息队列类型为【实体】时指定存储消息标记2的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TAG2PSDEFID = "tag2psdefid";

    /**
     * 设置 标记2属性，详细说明：{@link #FIELD_TAG2PSDEFID}
     * 
     * @param tag2PSDEFId
     * 
     */
    @JsonProperty(FIELD_TAG2PSDEFID)
    public void setTag2PSDEFId(String tag2PSDEFId){
        this.set(FIELD_TAG2PSDEFID, tag2PSDEFId);
    }
    
    /**
     * 获取 标记2属性  
     * @return
     */
    @JsonIgnore
    public String getTag2PSDEFId(){
        Object objValue = this.get(FIELD_TAG2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记2属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTag2PSDEFIdDirty(){
        if(this.contains(FIELD_TAG2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记2属性
     */
    @JsonIgnore
    public void resetTag2PSDEFId(){
        this.reset(FIELD_TAG2PSDEFID);
    }

    /**
     * 设置 标记2属性，详细说明：{@link #FIELD_TAG2PSDEFID}
     * <P>
     * 等同 {@link #setTag2PSDEFId}
     * @param tag2PSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue tag2psdefid(String tag2PSDEFId){
        this.setTag2PSDEFId(tag2PSDEFId);
        return this;
    }

    /**
     * 设置 标记2属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTag2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue tag2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTag2PSDEFId(null);
            this.setTag2PSDEFName(null);
        }
        else{
            this.setTag2PSDEFId(pSDEField.getPSDEFieldId());
            this.setTag2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TAG2PSDEFNAME</B>&nbsp;标记2值属性，消息队列类型为【实体】时指定存储消息标记2的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TAG2PSDEFID}
     */
    public final static String FIELD_TAG2PSDEFNAME = "tag2psdefname";

    /**
     * 设置 标记2值属性，详细说明：{@link #FIELD_TAG2PSDEFNAME}
     * 
     * @param tag2PSDEFName
     * 
     */
    @JsonProperty(FIELD_TAG2PSDEFNAME)
    public void setTag2PSDEFName(String tag2PSDEFName){
        this.set(FIELD_TAG2PSDEFNAME, tag2PSDEFName);
    }
    
    /**
     * 获取 标记2值属性  
     * @return
     */
    @JsonIgnore
    public String getTag2PSDEFName(){
        Object objValue = this.get(FIELD_TAG2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记2值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTag2PSDEFNameDirty(){
        if(this.contains(FIELD_TAG2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记2值属性
     */
    @JsonIgnore
    public void resetTag2PSDEFName(){
        this.reset(FIELD_TAG2PSDEFNAME);
    }

    /**
     * 设置 标记2值属性，详细说明：{@link #FIELD_TAG2PSDEFNAME}
     * <P>
     * 等同 {@link #setTag2PSDEFName}
     * @param tag2PSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue tag2psdefname(String tag2PSDEFName){
        this.setTag2PSDEFName(tag2PSDEFName);
        return this;
    }

    /**
     * <B>TAGPSDEFID</B>&nbsp;标记属性，消息队列类型为【实体】时指定存储消息标记的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TAGPSDEFID = "tagpsdefid";

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGPSDEFID}
     * 
     * @param tagPSDEFId
     * 
     */
    @JsonProperty(FIELD_TAGPSDEFID)
    public void setTagPSDEFId(String tagPSDEFId){
        this.set(FIELD_TAGPSDEFID, tagPSDEFId);
    }
    
    /**
     * 获取 标记属性  
     * @return
     */
    @JsonIgnore
    public String getTagPSDEFId(){
        Object objValue = this.get(FIELD_TAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTagPSDEFIdDirty(){
        if(this.contains(FIELD_TAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记属性
     */
    @JsonIgnore
    public void resetTagPSDEFId(){
        this.reset(FIELD_TAGPSDEFID);
    }

    /**
     * 设置 标记属性，详细说明：{@link #FIELD_TAGPSDEFID}
     * <P>
     * 等同 {@link #setTagPSDEFId}
     * @param tagPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue tagpsdefid(String tagPSDEFId){
        this.setTagPSDEFId(tagPSDEFId);
        return this;
    }

    /**
     * 设置 标记属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue tagpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTagPSDEFId(null);
            this.setTagPSDEFName(null);
        }
        else{
            this.setTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TAGPSDEFNAME</B>&nbsp;标记值属性，消息队列类型为【实体】时指定存储消息标记的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TAGPSDEFID}
     */
    public final static String FIELD_TAGPSDEFNAME = "tagpsdefname";

    /**
     * 设置 标记值属性，详细说明：{@link #FIELD_TAGPSDEFNAME}
     * 
     * @param tagPSDEFName
     * 
     */
    @JsonProperty(FIELD_TAGPSDEFNAME)
    public void setTagPSDEFName(String tagPSDEFName){
        this.set(FIELD_TAGPSDEFNAME, tagPSDEFName);
    }
    
    /**
     * 获取 标记值属性  
     * @return
     */
    @JsonIgnore
    public String getTagPSDEFName(){
        Object objValue = this.get(FIELD_TAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTagPSDEFNameDirty(){
        if(this.contains(FIELD_TAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记值属性
     */
    @JsonIgnore
    public void resetTagPSDEFName(){
        this.reset(FIELD_TAGPSDEFNAME);
    }

    /**
     * 设置 标记值属性，详细说明：{@link #FIELD_TAGPSDEFNAME}
     * <P>
     * 等同 {@link #setTagPSDEFName}
     * @param tagPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue tagpsdefname(String tagPSDEFName){
        this.setTagPSDEFName(tagPSDEFName);
        return this;
    }

    /**
     * <B>TARGETPSDEFID</B>&nbsp;目标标识属性，消息队列类型为【实体】时指定存储目标值的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TARGETPSDEFID = "targetpsdefid";

    /**
     * 设置 目标标识属性，详细说明：{@link #FIELD_TARGETPSDEFID}
     * 
     * @param targetPSDEFId
     * 
     */
    @JsonProperty(FIELD_TARGETPSDEFID)
    public void setTargetPSDEFId(String targetPSDEFId){
        this.set(FIELD_TARGETPSDEFID, targetPSDEFId);
    }
    
    /**
     * 获取 目标标识属性  
     * @return
     */
    @JsonIgnore
    public String getTargetPSDEFId(){
        Object objValue = this.get(FIELD_TARGETPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetPSDEFIdDirty(){
        if(this.contains(FIELD_TARGETPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识属性
     */
    @JsonIgnore
    public void resetTargetPSDEFId(){
        this.reset(FIELD_TARGETPSDEFID);
    }

    /**
     * 设置 目标标识属性，详细说明：{@link #FIELD_TARGETPSDEFID}
     * <P>
     * 等同 {@link #setTargetPSDEFId}
     * @param targetPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue targetpsdefid(String targetPSDEFId){
        this.setTargetPSDEFId(targetPSDEFId);
        return this;
    }

    /**
     * 设置 目标标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTargetPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue targetpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTargetPSDEFId(null);
            this.setTargetPSDEFName(null);
        }
        else{
            this.setTargetPSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TARGETPSDEFNAME</B>&nbsp;目标标识值属性，消息队列类型为【实体】时指定存储目标值的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TARGETPSDEFID}
     */
    public final static String FIELD_TARGETPSDEFNAME = "targetpsdefname";

    /**
     * 设置 目标标识值属性，详细说明：{@link #FIELD_TARGETPSDEFNAME}
     * 
     * @param targetPSDEFName
     * 
     */
    @JsonProperty(FIELD_TARGETPSDEFNAME)
    public void setTargetPSDEFName(String targetPSDEFName){
        this.set(FIELD_TARGETPSDEFNAME, targetPSDEFName);
    }
    
    /**
     * 获取 目标标识值属性  
     * @return
     */
    @JsonIgnore
    public String getTargetPSDEFName(){
        Object objValue = this.get(FIELD_TARGETPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标标识值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetPSDEFNameDirty(){
        if(this.contains(FIELD_TARGETPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标标识值属性
     */
    @JsonIgnore
    public void resetTargetPSDEFName(){
        this.reset(FIELD_TARGETPSDEFNAME);
    }

    /**
     * 设置 目标标识值属性，详细说明：{@link #FIELD_TARGETPSDEFNAME}
     * <P>
     * 等同 {@link #setTargetPSDEFName}
     * @param targetPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue targetpsdefname(String targetPSDEFName){
        this.setTargetPSDEFName(targetPSDEFName);
        return this;
    }

    /**
     * <B>TARGETTYPEPSDEFID</B>&nbsp;目标类型属性，消息队列类型为【实体】时指定存储目标类型的属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TARGETTYPEPSDEFID = "targettypepsdefid";

    /**
     * 设置 目标类型属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFID}
     * 
     * @param targetTypePSDEFId
     * 
     */
    @JsonProperty(FIELD_TARGETTYPEPSDEFID)
    public void setTargetTypePSDEFId(String targetTypePSDEFId){
        this.set(FIELD_TARGETTYPEPSDEFID, targetTypePSDEFId);
    }
    
    /**
     * 获取 目标类型属性  
     * @return
     */
    @JsonIgnore
    public String getTargetTypePSDEFId(){
        Object objValue = this.get(FIELD_TARGETTYPEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypePSDEFIdDirty(){
        if(this.contains(FIELD_TARGETTYPEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型属性
     */
    @JsonIgnore
    public void resetTargetTypePSDEFId(){
        this.reset(FIELD_TARGETTYPEPSDEFID);
    }

    /**
     * 设置 目标类型属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFID}
     * <P>
     * 等同 {@link #setTargetTypePSDEFId}
     * @param targetTypePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue targettypepsdefid(String targetTypePSDEFId){
        this.setTargetTypePSDEFId(targetTypePSDEFId);
        return this;
    }

    /**
     * 设置 目标类型属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTargetTypePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue targettypepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTargetTypePSDEFId(null);
            this.setTargetTypePSDEFName(null);
        }
        else{
            this.setTargetTypePSDEFId(pSDEField.getPSDEFieldId());
            this.setTargetTypePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TARGETTYPEPSDEFNAME</B>&nbsp;目标类型值属性，消息队列类型为【实体】时指定存储目标类型的属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TARGETTYPEPSDEFID}
     */
    public final static String FIELD_TARGETTYPEPSDEFNAME = "targettypepsdefname";

    /**
     * 设置 目标类型值属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFNAME}
     * 
     * @param targetTypePSDEFName
     * 
     */
    @JsonProperty(FIELD_TARGETTYPEPSDEFNAME)
    public void setTargetTypePSDEFName(String targetTypePSDEFName){
        this.set(FIELD_TARGETTYPEPSDEFNAME, targetTypePSDEFName);
    }
    
    /**
     * 获取 目标类型值属性  
     * @return
     */
    @JsonIgnore
    public String getTargetTypePSDEFName(){
        Object objValue = this.get(FIELD_TARGETTYPEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标类型值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypePSDEFNameDirty(){
        if(this.contains(FIELD_TARGETTYPEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标类型值属性
     */
    @JsonIgnore
    public void resetTargetTypePSDEFName(){
        this.reset(FIELD_TARGETTYPEPSDEFNAME);
    }

    /**
     * 设置 目标类型值属性，详细说明：{@link #FIELD_TARGETTYPEPSDEFNAME}
     * <P>
     * 等同 {@link #setTargetTypePSDEFName}
     * @param targetTypePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue targettypepsdefname(String targetTypePSDEFName){
        this.setTargetTypePSDEFName(targetTypePSDEFName);
        return this;
    }

    /**
     * <B>TASKURLPSDEFID</B>&nbsp;任务路径值属性，消息队列类型为【实体】时指定消息队列中任务路径的值存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TASKURLPSDEFID = "taskurlpsdefid";

    /**
     * 设置 任务路径值属性，详细说明：{@link #FIELD_TASKURLPSDEFID}
     * 
     * @param taskUrlPSDEFId
     * 
     */
    @JsonProperty(FIELD_TASKURLPSDEFID)
    public void setTaskUrlPSDEFId(String taskUrlPSDEFId){
        this.set(FIELD_TASKURLPSDEFID, taskUrlPSDEFId);
    }
    
    /**
     * 获取 任务路径值属性  
     * @return
     */
    @JsonIgnore
    public String getTaskUrlPSDEFId(){
        Object objValue = this.get(FIELD_TASKURLPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务路径值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskUrlPSDEFIdDirty(){
        if(this.contains(FIELD_TASKURLPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务路径值属性
     */
    @JsonIgnore
    public void resetTaskUrlPSDEFId(){
        this.reset(FIELD_TASKURLPSDEFID);
    }

    /**
     * 设置 任务路径值属性，详细说明：{@link #FIELD_TASKURLPSDEFID}
     * <P>
     * 等同 {@link #setTaskUrlPSDEFId}
     * @param taskUrlPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue taskurlpsdefid(String taskUrlPSDEFId){
        this.setTaskUrlPSDEFId(taskUrlPSDEFId);
        return this;
    }

    /**
     * 设置 任务路径值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTaskUrlPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue taskurlpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTaskUrlPSDEFId(null);
            this.setTaskUrlPSDEFName(null);
        }
        else{
            this.setTaskUrlPSDEFId(pSDEField.getPSDEFieldId());
            this.setTaskUrlPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TASKURLPSDEFNAME</B>&nbsp;任务路径值属性，消息队列类型为【实体】时指定消息队列中任务路径的值存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TASKURLPSDEFID}
     */
    public final static String FIELD_TASKURLPSDEFNAME = "taskurlpsdefname";

    /**
     * 设置 任务路径值属性，详细说明：{@link #FIELD_TASKURLPSDEFNAME}
     * 
     * @param taskUrlPSDEFName
     * 
     */
    @JsonProperty(FIELD_TASKURLPSDEFNAME)
    public void setTaskUrlPSDEFName(String taskUrlPSDEFName){
        this.set(FIELD_TASKURLPSDEFNAME, taskUrlPSDEFName);
    }
    
    /**
     * 获取 任务路径值属性  
     * @return
     */
    @JsonIgnore
    public String getTaskUrlPSDEFName(){
        Object objValue = this.get(FIELD_TASKURLPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务路径值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskUrlPSDEFNameDirty(){
        if(this.contains(FIELD_TASKURLPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务路径值属性
     */
    @JsonIgnore
    public void resetTaskUrlPSDEFName(){
        this.reset(FIELD_TASKURLPSDEFNAME);
    }

    /**
     * 设置 任务路径值属性，详细说明：{@link #FIELD_TASKURLPSDEFNAME}
     * <P>
     * 等同 {@link #setTaskUrlPSDEFName}
     * @param taskUrlPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue taskurlpsdefname(String taskUrlPSDEFName){
        this.setTaskUrlPSDEFName(taskUrlPSDEFName);
        return this;
    }

    /**
     * <B>TITLEPSDEFID</B>&nbsp;消息标题值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TITLEPSDEFID = "titlepsdefid";

    /**
     * 设置 消息标题值属性
     * 
     * @param titlePSDEFId
     * 
     */
    @JsonProperty(FIELD_TITLEPSDEFID)
    public void setTitlePSDEFId(String titlePSDEFId){
        this.set(FIELD_TITLEPSDEFID, titlePSDEFId);
    }
    
    /**
     * 获取 消息标题值属性  
     * @return
     */
    @JsonIgnore
    public String getTitlePSDEFId(){
        Object objValue = this.get(FIELD_TITLEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息标题值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSDEFIdDirty(){
        if(this.contains(FIELD_TITLEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息标题值属性
     */
    @JsonIgnore
    public void resetTitlePSDEFId(){
        this.reset(FIELD_TITLEPSDEFID);
    }

    /**
     * 设置 消息标题值属性
     * <P>
     * 等同 {@link #setTitlePSDEFId}
     * @param titlePSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue titlepsdefid(String titlePSDEFId){
        this.setTitlePSDEFId(titlePSDEFId);
        return this;
    }

    /**
     * 设置 消息标题值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue titlepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTitlePSDEFId(null);
            this.setTitlePSDEFName(null);
        }
        else{
            this.setTitlePSDEFId(pSDEField.getPSDEFieldId());
            this.setTitlePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TITLEPSDEFNAME</B>&nbsp;消息标题值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSDEFID}
     */
    public final static String FIELD_TITLEPSDEFNAME = "titlepsdefname";

    /**
     * 设置 消息标题值属性
     * 
     * @param titlePSDEFName
     * 
     */
    @JsonProperty(FIELD_TITLEPSDEFNAME)
    public void setTitlePSDEFName(String titlePSDEFName){
        this.set(FIELD_TITLEPSDEFNAME, titlePSDEFName);
    }
    
    /**
     * 获取 消息标题值属性  
     * @return
     */
    @JsonIgnore
    public String getTitlePSDEFName(){
        Object objValue = this.get(FIELD_TITLEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息标题值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSDEFNameDirty(){
        if(this.contains(FIELD_TITLEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息标题值属性
     */
    @JsonIgnore
    public void resetTitlePSDEFName(){
        this.reset(FIELD_TITLEPSDEFNAME);
    }

    /**
     * 设置 消息标题值属性
     * <P>
     * 等同 {@link #setTitlePSDEFName}
     * @param titlePSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue titlepsdefname(String titlePSDEFName){
        this.setTitlePSDEFName(titlePSDEFName);
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
    public PSSysMsgQueue updatedate(String updateDate){
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
    public PSSysMsgQueue updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USER2PSDEFID</B>&nbsp;用户自定义属性2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USER2PSDEFID = "user2psdefid";

    /**
     * 设置 用户自定义属性2
     * 
     * @param user2PSDEFId
     * 
     */
    @JsonProperty(FIELD_USER2PSDEFID)
    public void setUser2PSDEFId(String user2PSDEFId){
        this.set(FIELD_USER2PSDEFID, user2PSDEFId);
    }
    
    /**
     * 获取 用户自定义属性2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEFId(){
        Object objValue = this.get(FIELD_USER2PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEFIdDirty(){
        if(this.contains(FIELD_USER2PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性2
     */
    @JsonIgnore
    public void resetUser2PSDEFId(){
        this.reset(FIELD_USER2PSDEFID);
    }

    /**
     * 设置 用户自定义属性2
     * <P>
     * 等同 {@link #setUser2PSDEFId}
     * @param user2PSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue user2psdefid(String user2PSDEFId){
        this.setUser2PSDEFId(user2PSDEFId);
        return this;
    }

    /**
     * 设置 用户自定义属性2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUser2PSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue user2psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUser2PSDEFId(null);
            this.setUser2PSDEFName(null);
        }
        else{
            this.setUser2PSDEFId(pSDEField.getPSDEFieldId());
            this.setUser2PSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USER2PSDEFNAME</B>&nbsp;用户自定义属性2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USER2PSDEFID}
     */
    public final static String FIELD_USER2PSDEFNAME = "user2psdefname";

    /**
     * 设置 用户自定义属性2
     * 
     * @param user2PSDEFName
     * 
     */
    @JsonProperty(FIELD_USER2PSDEFNAME)
    public void setUser2PSDEFName(String user2PSDEFName){
        this.set(FIELD_USER2PSDEFNAME, user2PSDEFName);
    }
    
    /**
     * 获取 用户自定义属性2  
     * @return
     */
    @JsonIgnore
    public String getUser2PSDEFName(){
        Object objValue = this.get(FIELD_USER2PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUser2PSDEFNameDirty(){
        if(this.contains(FIELD_USER2PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性2
     */
    @JsonIgnore
    public void resetUser2PSDEFName(){
        this.reset(FIELD_USER2PSDEFNAME);
    }

    /**
     * 设置 用户自定义属性2
     * <P>
     * 等同 {@link #setUser2PSDEFName}
     * @param user2PSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue user2psdefname(String user2PSDEFName){
        this.setUser2PSDEFName(user2PSDEFName);
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
    public PSSysMsgQueue usercat(String userCat){
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
    public PSSysMsgQueue usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPSDEFID</B>&nbsp;用户自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USERPSDEFID = "userpsdefid";

    /**
     * 设置 用户自定义属性
     * 
     * @param userPSDEFId
     * 
     */
    @JsonProperty(FIELD_USERPSDEFID)
    public void setUserPSDEFId(String userPSDEFId){
        this.set(FIELD_USERPSDEFID, userPSDEFId);
    }
    
    /**
     * 获取 用户自定义属性  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEFId(){
        Object objValue = this.get(FIELD_USERPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEFIdDirty(){
        if(this.contains(FIELD_USERPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性
     */
    @JsonIgnore
    public void resetUserPSDEFId(){
        this.reset(FIELD_USERPSDEFID);
    }

    /**
     * 设置 用户自定义属性
     * <P>
     * 等同 {@link #setUserPSDEFId}
     * @param userPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue userpsdefid(String userPSDEFId){
        this.setUserPSDEFId(userPSDEFId);
        return this;
    }

    /**
     * 设置 用户自定义属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue userpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUserPSDEFId(null);
            this.setUserPSDEFName(null);
        }
        else{
            this.setUserPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USERPSDEFNAME</B>&nbsp;用户自定义属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERPSDEFID}
     */
    public final static String FIELD_USERPSDEFNAME = "userpsdefname";

    /**
     * 设置 用户自定义属性
     * 
     * @param userPSDEFName
     * 
     */
    @JsonProperty(FIELD_USERPSDEFNAME)
    public void setUserPSDEFName(String userPSDEFName){
        this.set(FIELD_USERPSDEFNAME, userPSDEFName);
    }
    
    /**
     * 获取 用户自定义属性  
     * @return
     */
    @JsonIgnore
    public String getUserPSDEFName(){
        Object objValue = this.get(FIELD_USERPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户自定义属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserPSDEFNameDirty(){
        if(this.contains(FIELD_USERPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义属性
     */
    @JsonIgnore
    public void resetUserPSDEFName(){
        this.reset(FIELD_USERPSDEFNAME);
    }

    /**
     * 设置 用户自定义属性
     * <P>
     * 等同 {@link #setUserPSDEFName}
     * @param userPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue userpsdefname(String userPSDEFName){
        this.setUserPSDEFName(userPSDEFName);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysMsgQueue usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysMsgQueue usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysMsgQueue usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysMsgQueue usertag4(String userTag4){
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
    public PSSysMsgQueue validflag(Integer validFlag){
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
    public PSSysMsgQueue validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WXCONTENTPSDEFID</B>&nbsp;微信消息值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_WXCONTENTPSDEFID = "wxcontentpsdefid";

    /**
     * 设置 微信消息值属性
     * 
     * @param wXContentPSDEFId
     * 
     */
    @JsonProperty(FIELD_WXCONTENTPSDEFID)
    public void setWXContentPSDEFId(String wXContentPSDEFId){
        this.set(FIELD_WXCONTENTPSDEFID, wXContentPSDEFId);
    }
    
    /**
     * 获取 微信消息值属性  
     * @return
     */
    @JsonIgnore
    public String getWXContentPSDEFId(){
        Object objValue = this.get(FIELD_WXCONTENTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信消息值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWXContentPSDEFIdDirty(){
        if(this.contains(FIELD_WXCONTENTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信消息值属性
     */
    @JsonIgnore
    public void resetWXContentPSDEFId(){
        this.reset(FIELD_WXCONTENTPSDEFID);
    }

    /**
     * 设置 微信消息值属性
     * <P>
     * 等同 {@link #setWXContentPSDEFId}
     * @param wXContentPSDEFId
     */
    @JsonIgnore
    public PSSysMsgQueue wxcontentpsdefid(String wXContentPSDEFId){
        this.setWXContentPSDEFId(wXContentPSDEFId);
        return this;
    }

    /**
     * 设置 微信消息值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWXContentPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysMsgQueue wxcontentpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setWXContentPSDEFId(null);
            this.setWXContentPSDEFName(null);
        }
        else{
            this.setWXContentPSDEFId(pSDEField.getPSDEFieldId());
            this.setWXContentPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WXCONTENTPSDEFNAME</B>&nbsp;微信消息值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WXCONTENTPSDEFID}
     */
    public final static String FIELD_WXCONTENTPSDEFNAME = "wxcontentpsdefname";

    /**
     * 设置 微信消息值属性
     * 
     * @param wXContentPSDEFName
     * 
     */
    @JsonProperty(FIELD_WXCONTENTPSDEFNAME)
    public void setWXContentPSDEFName(String wXContentPSDEFName){
        this.set(FIELD_WXCONTENTPSDEFNAME, wXContentPSDEFName);
    }
    
    /**
     * 获取 微信消息值属性  
     * @return
     */
    @JsonIgnore
    public String getWXContentPSDEFName(){
        Object objValue = this.get(FIELD_WXCONTENTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信消息值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWXContentPSDEFNameDirty(){
        if(this.contains(FIELD_WXCONTENTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信消息值属性
     */
    @JsonIgnore
    public void resetWXContentPSDEFName(){
        this.reset(FIELD_WXCONTENTPSDEFNAME);
    }

    /**
     * 设置 微信消息值属性
     * <P>
     * 等同 {@link #setWXContentPSDEFName}
     * @param wXContentPSDEFName
     */
    @JsonIgnore
    public PSSysMsgQueue wxcontentpsdefname(String wXContentPSDEFName){
        this.setWXContentPSDEFName(wXContentPSDEFName);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysMsgQueueId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysMsgQueueId(strValue);
    }

    @JsonIgnore
    public PSSysMsgQueue id(String strValue){
        this.setPSSysMsgQueueId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysMsgQueue){
            PSSysMsgQueue model = (PSSysMsgQueue)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
