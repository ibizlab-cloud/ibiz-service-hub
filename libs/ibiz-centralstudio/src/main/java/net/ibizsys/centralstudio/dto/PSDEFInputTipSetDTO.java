package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFINPUTTIPSET</B>实体属性输入提示集合 模型传输对象
 * <P>
 * 实体属性输入提示集模型，定义动态的属性输入信息存储对象，包括了信息存储的结果集对象，相关内容存储的属性等
 */
public class PSDEFInputTipSetDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEFInputTipSetDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体属性输入提示信息集合的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
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
    public PSDEFInputTipSetDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTPSDEFID</B>&nbsp;内容值属性，指定实体属性输入提示集合的内容存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSDEFInputTipSetDTO contentpsdefid(String contentPSDEFId){
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
    public PSDEFInputTipSetDTO contentpsdefid(PSDEFieldDTO pSDEField){
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
     * <B>CONTENTPSDEFNAME</B>&nbsp;内容值属性，指定实体属性输入提示集合的内容存储属性对象
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
    public PSDEFInputTipSetDTO contentpsdefname(String contentPSDEFName){
        this.setContentPSDEFName(contentPSDEFName);
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
    public PSDEFInputTipSetDTO createdate(Timestamp createDate){
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
    public PSDEFInputTipSetDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ECPSDEFID</B>&nbsp;关闭标志值属性，指定实体属性输入提示集合的关闭标志值存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ECPSDEFID = "ecpsdefid";

    /**
     * 设置 关闭标志值属性，详细说明：{@link #FIELD_ECPSDEFID}
     * 
     * @param eCPSDEFId
     * 
     */
    @JsonProperty(FIELD_ECPSDEFID)
    public void setECPSDEFId(String eCPSDEFId){
        this.set(FIELD_ECPSDEFID, eCPSDEFId);
    }
    
    /**
     * 获取 关闭标志值属性  
     * @return
     */
    @JsonIgnore
    public String getECPSDEFId(){
        Object objValue = this.get(FIELD_ECPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关闭标志值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isECPSDEFIdDirty(){
        if(this.contains(FIELD_ECPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关闭标志值属性
     */
    @JsonIgnore
    public void resetECPSDEFId(){
        this.reset(FIELD_ECPSDEFID);
    }

    /**
     * 设置 关闭标志值属性，详细说明：{@link #FIELD_ECPSDEFID}
     * <P>
     * 等同 {@link #setECPSDEFId}
     * @param eCPSDEFId
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO ecpsdefid(String eCPSDEFId){
        this.setECPSDEFId(eCPSDEFId);
        return this;
    }

    /**
     * 设置 关闭标志值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setECPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO ecpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setECPSDEFId(null);
            this.setECPSDEFName(null);
        }
        else{
            this.setECPSDEFId(pSDEField.getPSDEFieldId());
            this.setECPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ECPSDEFNAME</B>&nbsp;关闭标志值属性，指定实体属性输入提示集合的关闭标志值存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ECPSDEFID}
     */
    public final static String FIELD_ECPSDEFNAME = "ecpsdefname";

    /**
     * 设置 关闭标志值属性，详细说明：{@link #FIELD_ECPSDEFNAME}
     * 
     * @param eCPSDEFName
     * 
     */
    @JsonProperty(FIELD_ECPSDEFNAME)
    public void setECPSDEFName(String eCPSDEFName){
        this.set(FIELD_ECPSDEFNAME, eCPSDEFName);
    }
    
    /**
     * 获取 关闭标志值属性  
     * @return
     */
    @JsonIgnore
    public String getECPSDEFName(){
        Object objValue = this.get(FIELD_ECPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关闭标志值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isECPSDEFNameDirty(){
        if(this.contains(FIELD_ECPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关闭标志值属性
     */
    @JsonIgnore
    public void resetECPSDEFName(){
        this.reset(FIELD_ECPSDEFNAME);
    }

    /**
     * 设置 关闭标志值属性，详细说明：{@link #FIELD_ECPSDEFNAME}
     * <P>
     * 等同 {@link #setECPSDEFName}
     * @param eCPSDEFName
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO ecpsdefname(String eCPSDEFName){
        this.setECPSDEFName(eCPSDEFName);
        return this;
    }

    /**
     * <B>LINKPSDEFID</B>&nbsp;链接值属性，指定实体属性输入提示集合的链接值存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_LINKPSDEFID = "linkpsdefid";

    /**
     * 设置 链接值属性，详细说明：{@link #FIELD_LINKPSDEFID}
     * 
     * @param linkPSDEFId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEFID)
    public void setLinkPSDEFId(String linkPSDEFId){
        this.set(FIELD_LINKPSDEFID, linkPSDEFId);
    }
    
    /**
     * 获取 链接值属性  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEFId(){
        Object objValue = this.get(FIELD_LINKPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEFIdDirty(){
        if(this.contains(FIELD_LINKPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接值属性
     */
    @JsonIgnore
    public void resetLinkPSDEFId(){
        this.reset(FIELD_LINKPSDEFID);
    }

    /**
     * 设置 链接值属性，详细说明：{@link #FIELD_LINKPSDEFID}
     * <P>
     * 等同 {@link #setLinkPSDEFId}
     * @param linkPSDEFId
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO linkpsdefid(String linkPSDEFId){
        this.setLinkPSDEFId(linkPSDEFId);
        return this;
    }

    /**
     * 设置 链接值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO linkpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setLinkPSDEFId(null);
            this.setLinkPSDEFName(null);
        }
        else{
            this.setLinkPSDEFId(pSDEField.getPSDEFieldId());
            this.setLinkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEFNAME</B>&nbsp;链接值属性，指定实体属性输入提示集合的链接值存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEFID}
     */
    public final static String FIELD_LINKPSDEFNAME = "linkpsdefname";

    /**
     * 设置 链接值属性，详细说明：{@link #FIELD_LINKPSDEFNAME}
     * 
     * @param linkPSDEFName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEFNAME)
    public void setLinkPSDEFName(String linkPSDEFName){
        this.set(FIELD_LINKPSDEFNAME, linkPSDEFName);
    }
    
    /**
     * 获取 链接值属性  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEFName(){
        Object objValue = this.get(FIELD_LINKPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEFNameDirty(){
        if(this.contains(FIELD_LINKPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接值属性
     */
    @JsonIgnore
    public void resetLinkPSDEFName(){
        this.reset(FIELD_LINKPSDEFNAME);
    }

    /**
     * 设置 链接值属性，详细说明：{@link #FIELD_LINKPSDEFNAME}
     * <P>
     * 等同 {@link #setLinkPSDEFName}
     * @param linkPSDEFName
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO linkpsdefname(String linkPSDEFName){
        this.setLinkPSDEFName(linkPSDEFName);
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
    public PSDEFInputTipSetDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;数据集合，指定实体属性输入提示信息集合的实体数据集合对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;数据集合，指定实体属性输入提示信息集合的实体数据集合对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据集合  
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
     * 判断 数据集合 是否指定值，包括空值
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
     * 重置 数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETID</B>&nbsp;系统属性输入提示集合标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";

    /**
     * 设置 系统属性输入提示集合标识
     * 
     * @param pSDEFInputTipSetId
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETID)
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId){
        this.set(FIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }
    
    /**
     * 获取 系统属性输入提示集合标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipSetId(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPSETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统属性输入提示集合标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipSetIdDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPSETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统属性输入提示集合标识
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetId(){
        this.reset(FIELD_PSDEFINPUTTIPSETID);
    }

    /**
     * 设置 系统属性输入提示集合标识
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSetId
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO psdefinputtipsetid(String pSDEFInputTipSetId){
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETNAME</B>&nbsp;集合名称，指定实体属性输入提示信息集合的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";

    /**
     * 设置 集合名称，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * 
     * @param pSDEFInputTipSetName
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETNAME)
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName){
        this.set(FIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }
    
    /**
     * 获取 集合名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipSetName(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPSETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集合名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipSetNameDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPSETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集合名称
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetName(){
        this.reset(FIELD_PSDEFINPUTTIPSETNAME);
    }

    /**
     * 设置 集合名称，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetName}
     * @param pSDEFInputTipSetName
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO psdefinputtipsetname(String pSDEFInputTipSetName){
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFInputTipSetName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFInputTipSetName(strName);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO name(String strName){
        this.setPSDEFInputTipSetName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体属性输入提示信息集合的数据集的所在实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSDEFInputTipSetDTO psdeid(String pSDEId){
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
    public PSDEFInputTipSetDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定实体属性输入提示信息集合的数据集的所在实体对象
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
    public PSDEFInputTipSetDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定实体属性输入提示集合所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSDEFInputTipSetDTO psmoduleid(String pSModuleId){
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
    public PSDEFInputTipSetDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定实体属性输入提示集合所在的系统模块
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
    public PSDEFInputTipSetDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>UNIQUETAGPSDEFID</B>&nbsp;业务标识值属性，指定实体属性输入提示集合的业务标识值存储属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_UNIQUETAGPSDEFID = "uniquetagpsdefid";

    /**
     * 设置 业务标识值属性，详细说明：{@link #FIELD_UNIQUETAGPSDEFID}
     * 
     * @param uniqueTagPSDEFId
     * 
     */
    @JsonProperty(FIELD_UNIQUETAGPSDEFID)
    public void setUniqueTagPSDEFId(String uniqueTagPSDEFId){
        this.set(FIELD_UNIQUETAGPSDEFID, uniqueTagPSDEFId);
    }
    
    /**
     * 获取 业务标识值属性  
     * @return
     */
    @JsonIgnore
    public String getUniqueTagPSDEFId(){
        Object objValue = this.get(FIELD_UNIQUETAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务标识值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueTagPSDEFIdDirty(){
        if(this.contains(FIELD_UNIQUETAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务标识值属性
     */
    @JsonIgnore
    public void resetUniqueTagPSDEFId(){
        this.reset(FIELD_UNIQUETAGPSDEFID);
    }

    /**
     * 设置 业务标识值属性，详细说明：{@link #FIELD_UNIQUETAGPSDEFID}
     * <P>
     * 等同 {@link #setUniqueTagPSDEFId}
     * @param uniqueTagPSDEFId
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO uniquetagpsdefid(String uniqueTagPSDEFId){
        this.setUniqueTagPSDEFId(uniqueTagPSDEFId);
        return this;
    }

    /**
     * 设置 业务标识值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUniqueTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO uniquetagpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setUniqueTagPSDEFId(null);
            this.setUniqueTagPSDEFName(null);
        }
        else{
            this.setUniqueTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setUniqueTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>UNIQUETAGPSDEFNAME</B>&nbsp;业务标识值属性，指定实体属性输入提示集合的业务标识值存储属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UNIQUETAGPSDEFID}
     */
    public final static String FIELD_UNIQUETAGPSDEFNAME = "uniquetagpsdefname";

    /**
     * 设置 业务标识值属性，详细说明：{@link #FIELD_UNIQUETAGPSDEFNAME}
     * 
     * @param uniqueTagPSDEFName
     * 
     */
    @JsonProperty(FIELD_UNIQUETAGPSDEFNAME)
    public void setUniqueTagPSDEFName(String uniqueTagPSDEFName){
        this.set(FIELD_UNIQUETAGPSDEFNAME, uniqueTagPSDEFName);
    }
    
    /**
     * 获取 业务标识值属性  
     * @return
     */
    @JsonIgnore
    public String getUniqueTagPSDEFName(){
        Object objValue = this.get(FIELD_UNIQUETAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务标识值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueTagPSDEFNameDirty(){
        if(this.contains(FIELD_UNIQUETAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务标识值属性
     */
    @JsonIgnore
    public void resetUniqueTagPSDEFName(){
        this.reset(FIELD_UNIQUETAGPSDEFNAME);
    }

    /**
     * 设置 业务标识值属性，详细说明：{@link #FIELD_UNIQUETAGPSDEFNAME}
     * <P>
     * 等同 {@link #setUniqueTagPSDEFName}
     * @param uniqueTagPSDEFName
     */
    @JsonIgnore
    public PSDEFInputTipSetDTO uniquetagpsdefname(String uniqueTagPSDEFName){
        this.setUniqueTagPSDEFName(uniqueTagPSDEFName);
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
    public PSDEFInputTipSetDTO updatedate(Timestamp updateDate){
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
    public PSDEFInputTipSetDTO updateman(String updateMan){
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
    public PSDEFInputTipSetDTO usercat(String userCat){
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
    public PSDEFInputTipSetDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEFInputTipSetDTO usertag(String userTag){
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
    public PSDEFInputTipSetDTO usertag2(String userTag2){
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
    public PSDEFInputTipSetDTO usertag3(String userTag3){
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
    public PSDEFInputTipSetDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEFInputTipSetId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEFInputTipSetId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFInputTipSetId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFInputTipSetId(strValue);
    }

    @JsonIgnore
    public PSDEFInputTipSetDTO id(String strValue){
        this.setPSDEFInputTipSetId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEFInputTipSetDTO){
            PSDEFInputTipSetDTO dto = (PSDEFInputTipSetDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
