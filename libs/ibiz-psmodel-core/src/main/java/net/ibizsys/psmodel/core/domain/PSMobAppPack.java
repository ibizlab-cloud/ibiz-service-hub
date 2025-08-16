package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSMOBAPPPACK</B>移动应用打包 模型传输对象
 * <P>
 * 移动端应用打包模型，定义打包的应用支持的操作系统、安全设置等相关信息
 */
public class PSMobAppPack extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSMobAppPack(){
    }      

    /**
     * <B>ANDROIDPERMISSIONS</B>&nbsp;Android权限设置，指定Android应用的权限设置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AndroidPermission} 
     */
    public final static String FIELD_ANDROIDPERMISSIONS = "androidpermissions";

    /**
     * 设置 Android权限设置，详细说明：{@link #FIELD_ANDROIDPERMISSIONS}
     * 
     * @param androidPermissions
     * 
     */
    @JsonProperty(FIELD_ANDROIDPERMISSIONS)
    public void setAndroidPermissions(String androidPermissions){
        this.set(FIELD_ANDROIDPERMISSIONS, androidPermissions);
    }
    
    /**
     * 获取 Android权限设置  
     * @return
     */
    @JsonIgnore
    public String getAndroidPermissions(){
        Object objValue = this.get(FIELD_ANDROIDPERMISSIONS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Android权限设置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAndroidPermissionsDirty(){
        if(this.contains(FIELD_ANDROIDPERMISSIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Android权限设置
     */
    @JsonIgnore
    public void resetAndroidPermissions(){
        this.reset(FIELD_ANDROIDPERMISSIONS);
    }

    /**
     * 设置 Android权限设置，详细说明：{@link #FIELD_ANDROIDPERMISSIONS}
     * <P>
     * 等同 {@link #setAndroidPermissions}
     * @param androidPermissions
     */
    @JsonIgnore
    public PSMobAppPack androidpermissions(String androidPermissions){
        this.setAndroidPermissions(androidPermissions);
        return this;
    }

     /**
     * 设置 Android权限设置，详细说明：{@link #FIELD_ANDROIDPERMISSIONS}
     * <P>
     * 等同 {@link #setAndroidPermissions}
     * @param androidPermissions
     */
    @JsonIgnore
    public PSMobAppPack androidpermissions(net.ibizsys.psmodel.core.util.PSModelEnums.AndroidPermission[] androidPermissions){
        if(androidPermissions == null || androidPermissions.length == 0){
            this.setAndroidPermissions(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.AndroidPermission _item : androidPermissions){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setAndroidPermissions(_value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定移动端应用打包的代码标识，需在所属的移动应用中具备唯一性
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
    public PSMobAppPack codename(String codeName){
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
    public PSMobAppPack createdate(String createDate){
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
    public PSMobAppPack createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENABLEANDROID</B>&nbsp;支持Android，指定移动端应用打包是否支持Android，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEANDROID = "enableandroid";

    /**
     * 设置 支持Android，详细说明：{@link #FIELD_ENABLEANDROID}
     * 
     * @param enableAndroid
     * 
     */
    @JsonProperty(FIELD_ENABLEANDROID)
    public void setEnableAndroid(Integer enableAndroid){
        this.set(FIELD_ENABLEANDROID, enableAndroid);
    }
    
    /**
     * 获取 支持Android  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAndroid(){
        Object objValue = this.get(FIELD_ENABLEANDROID);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持Android 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAndroidDirty(){
        if(this.contains(FIELD_ENABLEANDROID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持Android
     */
    @JsonIgnore
    public void resetEnableAndroid(){
        this.reset(FIELD_ENABLEANDROID);
    }

    /**
     * 设置 支持Android，详细说明：{@link #FIELD_ENABLEANDROID}
     * <P>
     * 等同 {@link #setEnableAndroid}
     * @param enableAndroid
     */
    @JsonIgnore
    public PSMobAppPack enableandroid(Integer enableAndroid){
        this.setEnableAndroid(enableAndroid);
        return this;
    }

     /**
     * 设置 支持Android，详细说明：{@link #FIELD_ENABLEANDROID}
     * <P>
     * 等同 {@link #setEnableAndroid}
     * @param enableAndroid
     */
    @JsonIgnore
    public PSMobAppPack enableandroid(Boolean enableAndroid){
        if(enableAndroid == null){
            this.setEnableAndroid(null);
        }
        else{
            this.setEnableAndroid(enableAndroid?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEENCRYPTION</B>&nbsp;支持加密，指定移动端应用打包是否支持加密，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEENCRYPTION = "enableencryption";

    /**
     * 设置 支持加密，详细说明：{@link #FIELD_ENABLEENCRYPTION}
     * 
     * @param enableEncryption
     * 
     */
    @JsonProperty(FIELD_ENABLEENCRYPTION)
    public void setEnableEncryption(Integer enableEncryption){
        this.set(FIELD_ENABLEENCRYPTION, enableEncryption);
    }
    
    /**
     * 获取 支持加密  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEncryption(){
        Object objValue = this.get(FIELD_ENABLEENCRYPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持加密 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEncryptionDirty(){
        if(this.contains(FIELD_ENABLEENCRYPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持加密
     */
    @JsonIgnore
    public void resetEnableEncryption(){
        this.reset(FIELD_ENABLEENCRYPTION);
    }

    /**
     * 设置 支持加密，详细说明：{@link #FIELD_ENABLEENCRYPTION}
     * <P>
     * 等同 {@link #setEnableEncryption}
     * @param enableEncryption
     */
    @JsonIgnore
    public PSMobAppPack enableencryption(Integer enableEncryption){
        this.setEnableEncryption(enableEncryption);
        return this;
    }

     /**
     * 设置 支持加密，详细说明：{@link #FIELD_ENABLEENCRYPTION}
     * <P>
     * 等同 {@link #setEnableEncryption}
     * @param enableEncryption
     */
    @JsonIgnore
    public PSMobAppPack enableencryption(Boolean enableEncryption){
        if(enableEncryption == null){
            this.setEnableEncryption(null);
        }
        else{
            this.setEnableEncryption(enableEncryption?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEIOS</B>&nbsp;支持iOS，指定移动端应用打包是否支持IOS，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEIOS = "enableios";

    /**
     * 设置 支持iOS，详细说明：{@link #FIELD_ENABLEIOS}
     * 
     * @param enableIOS
     * 
     */
    @JsonProperty(FIELD_ENABLEIOS)
    public void setEnableIOS(Integer enableIOS){
        this.set(FIELD_ENABLEIOS, enableIOS);
    }
    
    /**
     * 获取 支持iOS  
     * @return
     */
    @JsonIgnore
    public Integer getEnableIOS(){
        Object objValue = this.get(FIELD_ENABLEIOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持iOS 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableIOSDirty(){
        if(this.contains(FIELD_ENABLEIOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持iOS
     */
    @JsonIgnore
    public void resetEnableIOS(){
        this.reset(FIELD_ENABLEIOS);
    }

    /**
     * 设置 支持iOS，详细说明：{@link #FIELD_ENABLEIOS}
     * <P>
     * 等同 {@link #setEnableIOS}
     * @param enableIOS
     */
    @JsonIgnore
    public PSMobAppPack enableios(Integer enableIOS){
        this.setEnableIOS(enableIOS);
        return this;
    }

     /**
     * 设置 支持iOS，详细说明：{@link #FIELD_ENABLEIOS}
     * <P>
     * 等同 {@link #setEnableIOS}
     * @param enableIOS
     */
    @JsonIgnore
    public PSMobAppPack enableios(Boolean enableIOS){
        if(enableIOS == null){
            this.setEnableIOS(null);
        }
        else{
            this.setEnableIOS(enableIOS?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IOSDEVICES</B>&nbsp;iOS设备类型，指定移动端应用打包支持的iOS设备类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.IOSDeviceType} 
     */
    public final static String FIELD_IOSDEVICES = "iosdevices";

    /**
     * 设置 iOS设备类型，详细说明：{@link #FIELD_IOSDEVICES}
     * 
     * @param iOSDevices
     * 
     */
    @JsonProperty(FIELD_IOSDEVICES)
    public void setIOSDevices(String iOSDevices){
        this.set(FIELD_IOSDEVICES, iOSDevices);
    }
    
    /**
     * 获取 iOS设备类型  
     * @return
     */
    @JsonIgnore
    public String getIOSDevices(){
        Object objValue = this.get(FIELD_IOSDEVICES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 iOS设备类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIOSDevicesDirty(){
        if(this.contains(FIELD_IOSDEVICES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 iOS设备类型
     */
    @JsonIgnore
    public void resetIOSDevices(){
        this.reset(FIELD_IOSDEVICES);
    }

    /**
     * 设置 iOS设备类型，详细说明：{@link #FIELD_IOSDEVICES}
     * <P>
     * 等同 {@link #setIOSDevices}
     * @param iOSDevices
     */
    @JsonIgnore
    public PSMobAppPack iosdevices(String iOSDevices){
        this.setIOSDevices(iOSDevices);
        return this;
    }

     /**
     * 设置 iOS设备类型，详细说明：{@link #FIELD_IOSDEVICES}
     * <P>
     * 等同 {@link #setIOSDevices}
     * @param iOSDevices
     */
    @JsonIgnore
    public PSMobAppPack iosdevices(net.ibizsys.psmodel.core.util.PSModelEnums.IOSDeviceType[] iOSDevices){
        if(iOSDevices == null || iOSDevices.length == 0){
            this.setIOSDevices(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.IOSDeviceType _item : iOSDevices){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setIOSDevices(_value);
        }
        return this;
    }

    /**
     * <B>IOSPRIVACIES</B>&nbsp;iOS隐私设置，指定iOS应用的隐私设置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.IOSPrivicy} 
     */
    public final static String FIELD_IOSPRIVACIES = "iosprivacies";

    /**
     * 设置 iOS隐私设置，详细说明：{@link #FIELD_IOSPRIVACIES}
     * 
     * @param iOSPrivacies
     * 
     */
    @JsonProperty(FIELD_IOSPRIVACIES)
    public void setIOSPrivacies(String iOSPrivacies){
        this.set(FIELD_IOSPRIVACIES, iOSPrivacies);
    }
    
    /**
     * 获取 iOS隐私设置  
     * @return
     */
    @JsonIgnore
    public String getIOSPrivacies(){
        Object objValue = this.get(FIELD_IOSPRIVACIES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 iOS隐私设置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIOSPrivaciesDirty(){
        if(this.contains(FIELD_IOSPRIVACIES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 iOS隐私设置
     */
    @JsonIgnore
    public void resetIOSPrivacies(){
        this.reset(FIELD_IOSPRIVACIES);
    }

    /**
     * 设置 iOS隐私设置，详细说明：{@link #FIELD_IOSPRIVACIES}
     * <P>
     * 等同 {@link #setIOSPrivacies}
     * @param iOSPrivacies
     */
    @JsonIgnore
    public PSMobAppPack iosprivacies(String iOSPrivacies){
        this.setIOSPrivacies(iOSPrivacies);
        return this;
    }

     /**
     * 设置 iOS隐私设置，详细说明：{@link #FIELD_IOSPRIVACIES}
     * <P>
     * 等同 {@link #setIOSPrivacies}
     * @param iOSPrivacies
     */
    @JsonIgnore
    public PSMobAppPack iosprivacies(net.ibizsys.psmodel.core.util.PSModelEnums.IOSPrivicy[] iOSPrivacies){
        if(iOSPrivacies == null || iOSPrivacies.length == 0){
            this.setIOSPrivacies(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.IOSPrivicy _item : iOSPrivacies){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setIOSPrivacies(_value);
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
    public PSMobAppPack memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OSTYPE</B>&nbsp;操作系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobOSType} 
     */
    public final static String FIELD_OSTYPE = "ostype";

    /**
     * 设置 操作系统
     * 
     * @param oSType
     * 
     */
    @JsonProperty(FIELD_OSTYPE)
    public void setOSType(String oSType){
        this.set(FIELD_OSTYPE, oSType);
    }
    
    /**
     * 获取 操作系统  
     * @return
     */
    @JsonIgnore
    public String getOSType(){
        Object objValue = this.get(FIELD_OSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOSTypeDirty(){
        if(this.contains(FIELD_OSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作系统
     */
    @JsonIgnore
    public void resetOSType(){
        this.reset(FIELD_OSTYPE);
    }

    /**
     * 设置 操作系统
     * <P>
     * 等同 {@link #setOSType}
     * @param oSType
     */
    @JsonIgnore
    public PSMobAppPack ostype(String oSType){
        this.setOSType(oSType);
        return this;
    }

     /**
     * 设置 操作系统
     * <P>
     * 等同 {@link #setOSType}
     * @param oSType
     */
    @JsonIgnore
    public PSMobAppPack ostype(net.ibizsys.psmodel.core.util.PSModelEnums.MobOSType oSType){
        if(oSType == null){
            this.setOSType(null);
        }
        else{
            this.setOSType(oSType.value);
        }
        return this;
    }

    /**
     * <B>OSTYPES</B>&nbsp;支持系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobOSType} 
     */
    public final static String FIELD_OSTYPES = "ostypes";

    /**
     * 设置 支持系统
     * 
     * @param oSTypes
     * 
     */
    @JsonProperty(FIELD_OSTYPES)
    public void setOSTypes(String oSTypes){
        this.set(FIELD_OSTYPES, oSTypes);
    }
    
    /**
     * 获取 支持系统  
     * @return
     */
    @JsonIgnore
    public String getOSTypes(){
        Object objValue = this.get(FIELD_OSTYPES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 支持系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOSTypesDirty(){
        if(this.contains(FIELD_OSTYPES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持系统
     */
    @JsonIgnore
    public void resetOSTypes(){
        this.reset(FIELD_OSTYPES);
    }

    /**
     * 设置 支持系统
     * <P>
     * 等同 {@link #setOSTypes}
     * @param oSTypes
     */
    @JsonIgnore
    public PSMobAppPack ostypes(String oSTypes){
        this.setOSTypes(oSTypes);
        return this;
    }

     /**
     * 设置 支持系统
     * <P>
     * 等同 {@link #setOSTypes}
     * @param oSTypes
     */
    @JsonIgnore
    public PSMobAppPack ostypes(net.ibizsys.psmodel.core.util.PSModelEnums.MobOSType[] oSTypes){
        if(oSTypes == null || oSTypes.length == 0){
            this.setOSTypes(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.MobOSType _item : oSTypes){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setOSTypes(_value);
        }
        return this;
    }

    /**
     * <B>PACKTYPE</B>&nbsp;打包类型，指定移动端应用打包的打包类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobAppPackType} 
     */
    public final static String FIELD_PACKTYPE = "packtype";

    /**
     * 设置 打包类型，详细说明：{@link #FIELD_PACKTYPE}
     * 
     * @param packType
     * 
     */
    @JsonProperty(FIELD_PACKTYPE)
    public void setPackType(String packType){
        this.set(FIELD_PACKTYPE, packType);
    }
    
    /**
     * 获取 打包类型  
     * @return
     */
    @JsonIgnore
    public String getPackType(){
        Object objValue = this.get(FIELD_PACKTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打包类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPackTypeDirty(){
        if(this.contains(FIELD_PACKTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打包类型
     */
    @JsonIgnore
    public void resetPackType(){
        this.reset(FIELD_PACKTYPE);
    }

    /**
     * 设置 打包类型，详细说明：{@link #FIELD_PACKTYPE}
     * <P>
     * 等同 {@link #setPackType}
     * @param packType
     */
    @JsonIgnore
    public PSMobAppPack packtype(String packType){
        this.setPackType(packType);
        return this;
    }

     /**
     * 设置 打包类型，详细说明：{@link #FIELD_PACKTYPE}
     * <P>
     * 等同 {@link #setPackType}
     * @param packType
     */
    @JsonIgnore
    public PSMobAppPack packtype(net.ibizsys.psmodel.core.util.PSModelEnums.MobAppPackType packType){
        if(packType == null){
            this.setPackType(null);
        }
        else{
            this.setPackType(packType.value);
        }
        return this;
    }

    /**
     * <B>PKGNAME</B>&nbsp;包名称，指定移动端应用打包的代码包名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PKGNAME = "pkgname";

    /**
     * 设置 包名称，详细说明：{@link #FIELD_PKGNAME}
     * 
     * @param pkgName
     * 
     */
    @JsonProperty(FIELD_PKGNAME)
    public void setPkgName(String pkgName){
        this.set(FIELD_PKGNAME, pkgName);
    }
    
    /**
     * 获取 包名称  
     * @return
     */
    @JsonIgnore
    public String getPkgName(){
        Object objValue = this.get(FIELD_PKGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 包名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPkgNameDirty(){
        if(this.contains(FIELD_PKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包名称
     */
    @JsonIgnore
    public void resetPkgName(){
        this.reset(FIELD_PKGNAME);
    }

    /**
     * 设置 包名称，详细说明：{@link #FIELD_PKGNAME}
     * <P>
     * 等同 {@link #setPkgName}
     * @param pkgName
     */
    @JsonIgnore
    public PSMobAppPack pkgname(String pkgName){
        this.setPkgName(pkgName);
        return this;
    }

    /**
     * <B>PSDCMOBPACKCERTID</B>&nbsp;打包证书，指定移动端应用打包使用的打包证书
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMOBPACKCERTID = "psdcmobpackcertid";

    /**
     * 设置 打包证书，详细说明：{@link #FIELD_PSDCMOBPACKCERTID}
     * 
     * @param pSDCMobPackCertId
     * 
     */
    @JsonProperty(FIELD_PSDCMOBPACKCERTID)
    public void setPSDCMobPackCertId(String pSDCMobPackCertId){
        this.set(FIELD_PSDCMOBPACKCERTID, pSDCMobPackCertId);
    }
    
    /**
     * 获取 打包证书  
     * @return
     */
    @JsonIgnore
    public String getPSDCMobPackCertId(){
        Object objValue = this.get(FIELD_PSDCMOBPACKCERTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打包证书 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMobPackCertIdDirty(){
        if(this.contains(FIELD_PSDCMOBPACKCERTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打包证书
     */
    @JsonIgnore
    public void resetPSDCMobPackCertId(){
        this.reset(FIELD_PSDCMOBPACKCERTID);
    }

    /**
     * 设置 打包证书，详细说明：{@link #FIELD_PSDCMOBPACKCERTID}
     * <P>
     * 等同 {@link #setPSDCMobPackCertId}
     * @param pSDCMobPackCertId
     */
    @JsonIgnore
    public PSMobAppPack psdcmobpackcertid(String pSDCMobPackCertId){
        this.setPSDCMobPackCertId(pSDCMobPackCertId);
        return this;
    }

    /**
     * <B>PSDCMOBPACKCERTNAME</B>&nbsp;打包证书，指定移动端应用打包使用的打包证书
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCMOBPACKCERTID}
     */
    public final static String FIELD_PSDCMOBPACKCERTNAME = "psdcmobpackcertname";

    /**
     * 设置 打包证书，详细说明：{@link #FIELD_PSDCMOBPACKCERTNAME}
     * 
     * @param pSDCMobPackCertName
     * 
     */
    @JsonProperty(FIELD_PSDCMOBPACKCERTNAME)
    public void setPSDCMobPackCertName(String pSDCMobPackCertName){
        this.set(FIELD_PSDCMOBPACKCERTNAME, pSDCMobPackCertName);
    }
    
    /**
     * 获取 打包证书  
     * @return
     */
    @JsonIgnore
    public String getPSDCMobPackCertName(){
        Object objValue = this.get(FIELD_PSDCMOBPACKCERTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打包证书 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCMobPackCertNameDirty(){
        if(this.contains(FIELD_PSDCMOBPACKCERTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打包证书
     */
    @JsonIgnore
    public void resetPSDCMobPackCertName(){
        this.reset(FIELD_PSDCMOBPACKCERTNAME);
    }

    /**
     * 设置 打包证书，详细说明：{@link #FIELD_PSDCMOBPACKCERTNAME}
     * <P>
     * 等同 {@link #setPSDCMobPackCertName}
     * @param pSDCMobPackCertName
     */
    @JsonIgnore
    public PSMobAppPack psdcmobpackcertname(String pSDCMobPackCertName){
        this.setPSDCMobPackCertName(pSDCMobPackCertName);
        return this;
    }

    /**
     * <B>PSMOBAPPPACKID</B>&nbsp;云移动应用打包标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSMOBAPPPACKID = "psmobapppackid";

    /**
     * 设置 云移动应用打包标识
     * 
     * @param pSMobAppPackId
     * 
     */
    @JsonProperty(FIELD_PSMOBAPPPACKID)
    public void setPSMobAppPackId(String pSMobAppPackId){
        this.set(FIELD_PSMOBAPPPACKID, pSMobAppPackId);
    }
    
    /**
     * 获取 云移动应用打包标识  
     * @return
     */
    @JsonIgnore
    public String getPSMobAppPackId(){
        Object objValue = this.get(FIELD_PSMOBAPPPACKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云移动应用打包标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSMobAppPackIdDirty(){
        if(this.contains(FIELD_PSMOBAPPPACKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云移动应用打包标识
     */
    @JsonIgnore
    public void resetPSMobAppPackId(){
        this.reset(FIELD_PSMOBAPPPACKID);
    }

    /**
     * 设置 云移动应用打包标识
     * <P>
     * 等同 {@link #setPSMobAppPackId}
     * @param pSMobAppPackId
     */
    @JsonIgnore
    public PSMobAppPack psmobapppackid(String pSMobAppPackId){
        this.setPSMobAppPackId(pSMobAppPackId);
        return this;
    }

    /**
     * <B>PSMOBAPPPACKNAME</B>&nbsp;打包名称，指定移动端应用打包的名称，需在所属应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSMOBAPPPACKNAME = "psmobapppackname";

    /**
     * 设置 打包名称，详细说明：{@link #FIELD_PSMOBAPPPACKNAME}
     * 
     * @param pSMobAppPackName
     * 
     */
    @JsonProperty(FIELD_PSMOBAPPPACKNAME)
    public void setPSMobAppPackName(String pSMobAppPackName){
        this.set(FIELD_PSMOBAPPPACKNAME, pSMobAppPackName);
    }
    
    /**
     * 获取 打包名称  
     * @return
     */
    @JsonIgnore
    public String getPSMobAppPackName(){
        Object objValue = this.get(FIELD_PSMOBAPPPACKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打包名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSMobAppPackNameDirty(){
        if(this.contains(FIELD_PSMOBAPPPACKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打包名称
     */
    @JsonIgnore
    public void resetPSMobAppPackName(){
        this.reset(FIELD_PSMOBAPPPACKNAME);
    }

    /**
     * 设置 打包名称，详细说明：{@link #FIELD_PSMOBAPPPACKNAME}
     * <P>
     * 等同 {@link #setPSMobAppPackName}
     * @param pSMobAppPackName
     */
    @JsonIgnore
    public PSMobAppPack psmobapppackname(String pSMobAppPackName){
        this.setPSMobAppPackName(pSMobAppPackName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSMobAppPackName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSMobAppPackName(strName);
    }

    @JsonIgnore
    public PSMobAppPack name(String strName){
        this.setPSMobAppPackName(strName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定移动端应用打包所属的移动应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
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
     * 判断 系统应用 是否指定值，包括空值
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
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSMobAppPack pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSMobAppPack pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;移动应用，指定移动端应用打包所属的移动应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 移动应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 移动应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 移动应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSMobAppPack pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>SERVICEURL</B>&nbsp;服务路径，指定移动端应用打包的服务路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SERVICEURL = "serviceurl";

    /**
     * 设置 服务路径，详细说明：{@link #FIELD_SERVICEURL}
     * 
     * @param serviceUrl
     * 
     */
    @JsonProperty(FIELD_SERVICEURL)
    public void setServiceUrl(String serviceUrl){
        this.set(FIELD_SERVICEURL, serviceUrl);
    }
    
    /**
     * 获取 服务路径  
     * @return
     */
    @JsonIgnore
    public String getServiceUrl(){
        Object objValue = this.get(FIELD_SERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceUrlDirty(){
        if(this.contains(FIELD_SERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务路径
     */
    @JsonIgnore
    public void resetServiceUrl(){
        this.reset(FIELD_SERVICEURL);
    }

    /**
     * 设置 服务路径，详细说明：{@link #FIELD_SERVICEURL}
     * <P>
     * 等同 {@link #setServiceUrl}
     * @param serviceUrl
     */
    @JsonIgnore
    public PSMobAppPack serviceurl(String serviceUrl){
        this.setServiceUrl(serviceUrl);
        return this;
    }

    /**
     * <B>TDCNT</B>&nbsp;测试设备数量
     */
    public final static String FIELD_TDCNT = "tdcnt";

    /**
     * 设置 测试设备数量
     * 
     * @param tDCnt
     * 
     */
    @JsonProperty(FIELD_TDCNT)
    public void setTDCnt(Integer tDCnt){
        this.set(FIELD_TDCNT, tDCnt);
    }
    
    /**
     * 获取 测试设备数量  
     * @return
     */
    @JsonIgnore
    public Integer getTDCnt(){
        Object objValue = this.get(FIELD_TDCNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 测试设备数量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTDCntDirty(){
        if(this.contains(FIELD_TDCNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试设备数量
     */
    @JsonIgnore
    public void resetTDCnt(){
        this.reset(FIELD_TDCNT);
    }

    /**
     * 设置 测试设备数量
     * <P>
     * 等同 {@link #setTDCnt}
     * @param tDCnt
     */
    @JsonIgnore
    public PSMobAppPack tdcnt(Integer tDCnt){
        this.setTDCnt(tDCnt);
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
    public PSMobAppPack updatedate(String updateDate){
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
    public PSMobAppPack updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSMobAppPack userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSMobAppPack usertag(String userTag){
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
    public PSMobAppPack usertag2(String userTag2){
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
    public PSMobAppPack usertag3(String userTag3){
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
    public PSMobAppPack usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VERSION</B>&nbsp;版本，指定移动端应用打包的版本号
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_VERSION = "version";

    /**
     * 设置 版本，详细说明：{@link #FIELD_VERSION}
     * 
     * @param version
     * 
     */
    @JsonProperty(FIELD_VERSION)
    public void setVersion(String version){
        this.set(FIELD_VERSION, version);
    }
    
    /**
     * 获取 版本  
     * @return
     */
    @JsonIgnore
    public String getVersion(){
        Object objValue = this.get(FIELD_VERSION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVersionDirty(){
        if(this.contains(FIELD_VERSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本
     */
    @JsonIgnore
    public void resetVersion(){
        this.reset(FIELD_VERSION);
    }

    /**
     * 设置 版本，详细说明：{@link #FIELD_VERSION}
     * <P>
     * 等同 {@link #setVersion}
     * @param version
     */
    @JsonIgnore
    public PSMobAppPack version(String version){
        this.setVersion(version);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSMobAppPackId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSMobAppPackId(strValue);
    }

    @JsonIgnore
    public PSMobAppPack id(String strValue){
        this.setPSMobAppPackId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSMobAppPack){
            PSMobAppPack model = (PSMobAppPack)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
