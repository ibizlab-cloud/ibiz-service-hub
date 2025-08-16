package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSCOREPRDCAT</B>云平台核心产品分类 模型传输对象
 * <P>
 * 
 */
public class PSCorePrdCat extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSCorePrdCat(){
    }      

    /**
     * <B>AVATARURL</B>&nbsp;图标路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_AVATARURL = "avatarurl";

    /**
     * 设置 图标路径
     * 
     * @param avatarUrl
     * 
     */
    @JsonProperty(FIELD_AVATARURL)
    public void setAvatarUrl(String avatarUrl){
        this.set(FIELD_AVATARURL, avatarUrl);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getAvatarUrl(){
        Object objValue = this.get(FIELD_AVATARURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAvatarUrlDirty(){
        if(this.contains(FIELD_AVATARURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetAvatarUrl(){
        this.reset(FIELD_AVATARURL);
    }

    /**
     * 设置 图标路径
     * <P>
     * 等同 {@link #setAvatarUrl}
     * @param avatarUrl
     */
    @JsonIgnore
    public PSCorePrdCat avatarurl(String avatarUrl){
        this.setAvatarUrl(avatarUrl);
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
    public PSCorePrdCat createdate(String createDate){
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
    public PSCorePrdCat createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FULLNAME</B>&nbsp;完全名称
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_FULLNAME = "fullname";

    /**
     * 设置 完全名称
     * 
     * @param fullName
     * 
     */
    @JsonProperty(FIELD_FULLNAME)
    public void setFullName(String fullName){
        this.set(FIELD_FULLNAME, fullName);
    }
    
    /**
     * 获取 完全名称  
     * @return
     */
    @JsonIgnore
    public String getFullName(){
        Object objValue = this.get(FIELD_FULLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完全名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullNameDirty(){
        if(this.contains(FIELD_FULLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完全名称
     */
    @JsonIgnore
    public void resetFullName(){
        this.reset(FIELD_FULLNAME);
    }

    /**
     * 设置 完全名称
     * <P>
     * 等同 {@link #setFullName}
     * @param fullName
     */
    @JsonIgnore
    public PSCorePrdCat fullname(String fullName){
        this.setFullName(fullName);
        return this;
    }

    /**
     * <B>FULLPATH</B>&nbsp;完全路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_FULLPATH = "fullpath";

    /**
     * 设置 完全路径
     * 
     * @param fullPath
     * 
     */
    @JsonProperty(FIELD_FULLPATH)
    public void setFullPath(String fullPath){
        this.set(FIELD_FULLPATH, fullPath);
    }
    
    /**
     * 获取 完全路径  
     * @return
     */
    @JsonIgnore
    public String getFullPath(){
        Object objValue = this.get(FIELD_FULLPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完全路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullPathDirty(){
        if(this.contains(FIELD_FULLPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完全路径
     */
    @JsonIgnore
    public void resetFullPath(){
        this.reset(FIELD_FULLPATH);
    }

    /**
     * 设置 完全路径
     * <P>
     * 等同 {@link #setFullPath}
     * @param fullPath
     */
    @JsonIgnore
    public PSCorePrdCat fullpath(String fullPath){
        this.setFullPath(fullPath);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSCorePrdCat memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PATH</B>&nbsp;路径
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PATH = "path";

    /**
     * 设置 路径
     * 
     * @param path
     * 
     */
    @JsonProperty(FIELD_PATH)
    public void setPath(String path){
        this.set(FIELD_PATH, path);
    }
    
    /**
     * 获取 路径  
     * @return
     */
    @JsonIgnore
    public String getPath(){
        Object objValue = this.get(FIELD_PATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPathDirty(){
        if(this.contains(FIELD_PATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 路径
     */
    @JsonIgnore
    public void resetPath(){
        this.reset(FIELD_PATH);
    }

    /**
     * 设置 路径
     * <P>
     * 等同 {@link #setPath}
     * @param path
     */
    @JsonIgnore
    public PSCorePrdCat path(String path){
        this.setPath(path);
        return this;
    }

    /**
     * <B>PPSCOREPRDCATID</B>&nbsp;上级分类
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PPSCOREPRDCATID = "ppscoreprdcatid";

    /**
     * 设置 上级分类
     * 
     * @param pPSCorePrdCatId
     * 
     */
    @JsonProperty(FIELD_PPSCOREPRDCATID)
    public void setPPSCorePrdCatId(String pPSCorePrdCatId){
        this.set(FIELD_PPSCOREPRDCATID, pPSCorePrdCatId);
    }
    
    /**
     * 获取 上级分类  
     * @return
     */
    @JsonIgnore
    public String getPPSCorePrdCatId(){
        Object objValue = this.get(FIELD_PPSCOREPRDCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上级分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSCorePrdCatIdDirty(){
        if(this.contains(FIELD_PPSCOREPRDCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上级分类
     */
    @JsonIgnore
    public void resetPPSCorePrdCatId(){
        this.reset(FIELD_PPSCOREPRDCATID);
    }

    /**
     * 设置 上级分类
     * <P>
     * 等同 {@link #setPPSCorePrdCatId}
     * @param pPSCorePrdCatId
     */
    @JsonIgnore
    public PSCorePrdCat ppscoreprdcatid(String pPSCorePrdCatId){
        this.setPPSCorePrdCatId(pPSCorePrdCatId);
        return this;
    }

    /**
     * <B>PPSCOREPRDCATNAME</B>&nbsp;上级分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSCOREPRDCATID}
     */
    public final static String FIELD_PPSCOREPRDCATNAME = "ppscoreprdcatname";

    /**
     * 设置 上级分类
     * 
     * @param pPSCorePrdCatName
     * 
     */
    @JsonProperty(FIELD_PPSCOREPRDCATNAME)
    public void setPPSCorePrdCatName(String pPSCorePrdCatName){
        this.set(FIELD_PPSCOREPRDCATNAME, pPSCorePrdCatName);
    }
    
    /**
     * 获取 上级分类  
     * @return
     */
    @JsonIgnore
    public String getPPSCorePrdCatName(){
        Object objValue = this.get(FIELD_PPSCOREPRDCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上级分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSCorePrdCatNameDirty(){
        if(this.contains(FIELD_PPSCOREPRDCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上级分类
     */
    @JsonIgnore
    public void resetPPSCorePrdCatName(){
        this.reset(FIELD_PPSCOREPRDCATNAME);
    }

    /**
     * 设置 上级分类
     * <P>
     * 等同 {@link #setPPSCorePrdCatName}
     * @param pPSCorePrdCatName
     */
    @JsonIgnore
    public PSCorePrdCat ppscoreprdcatname(String pPSCorePrdCatName){
        this.setPPSCorePrdCatName(pPSCorePrdCatName);
        return this;
    }

    /**
     * <B>PSCOREPRDCATID</B>&nbsp;分类标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDCATID = "pscoreprdcatid";

    /**
     * 设置 分类标识
     * 
     * @param pSCorePrdCatId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDCATID)
    public void setPSCorePrdCatId(String pSCorePrdCatId){
        this.set(FIELD_PSCOREPRDCATID, pSCorePrdCatId);
    }
    
    /**
     * 获取 分类标识  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdCatId(){
        Object objValue = this.get(FIELD_PSCOREPRDCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分类标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdCatIdDirty(){
        if(this.contains(FIELD_PSCOREPRDCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分类标识
     */
    @JsonIgnore
    public void resetPSCorePrdCatId(){
        this.reset(FIELD_PSCOREPRDCATID);
    }

    /**
     * 设置 分类标识
     * <P>
     * 等同 {@link #setPSCorePrdCatId}
     * @param pSCorePrdCatId
     */
    @JsonIgnore
    public PSCorePrdCat pscoreprdcatid(String pSCorePrdCatId){
        this.setPSCorePrdCatId(pSCorePrdCatId);
        return this;
    }

    /**
     * <B>PSCOREPRDCATNAME</B>&nbsp;云平台核心产品分类名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCOREPRDCATNAME = "pscoreprdcatname";

    /**
     * 设置 云平台核心产品分类名称
     * 
     * @param pSCorePrdCatName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDCATNAME)
    public void setPSCorePrdCatName(String pSCorePrdCatName){
        this.set(FIELD_PSCOREPRDCATNAME, pSCorePrdCatName);
    }
    
    /**
     * 获取 云平台核心产品分类名称  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdCatName(){
        Object objValue = this.get(FIELD_PSCOREPRDCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台核心产品分类名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdCatNameDirty(){
        if(this.contains(FIELD_PSCOREPRDCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台核心产品分类名称
     */
    @JsonIgnore
    public void resetPSCorePrdCatName(){
        this.reset(FIELD_PSCOREPRDCATNAME);
    }

    /**
     * 设置 云平台核心产品分类名称
     * <P>
     * 等同 {@link #setPSCorePrdCatName}
     * @param pSCorePrdCatName
     */
    @JsonIgnore
    public PSCorePrdCat pscoreprdcatname(String pSCorePrdCatName){
        this.setPSCorePrdCatName(pSCorePrdCatName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCorePrdCatName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCorePrdCatName(strName);
    }

    @JsonIgnore
    public PSCorePrdCat name(String strName){
        this.setPSCorePrdCatName(strName);
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
    public PSCorePrdCat updatedate(String updateDate){
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
    public PSCorePrdCat updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCorePrdCatId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCorePrdCatId(strValue);
    }

    @JsonIgnore
    public PSCorePrdCat id(String strValue){
        this.setPSCorePrdCatId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSCorePrdCat){
            PSCorePrdCat model = (PSCorePrdCat)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
