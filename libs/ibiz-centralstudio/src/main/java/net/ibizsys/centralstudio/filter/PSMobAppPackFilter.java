package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSMOBAPPPACK 过滤器对象
 */
public class PSMobAppPackFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSMobAppPackFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter ostype__eq(String value){
        this.setFieldCond("ostype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[支持系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter ostypes__eq(String value){
        this.setFieldCond("ostypes", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打包类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter packtype__eq(String value){
        this.setFieldCond("packtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打包证书]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter psdcmobpackcertid__eq(String value){
        this.setFieldCond("psdcmobpackcertid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打包证书]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter psdcmobpackcertname__eq(String value){
        this.setFieldCond("psdcmobpackcertname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打包证书]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter psdcmobpackcertname__like(String value){
        this.setFieldCond("psdcmobpackcertname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打包名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter psmobapppackname__eq(String value){
        this.setFieldCond("psmobapppackname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打包名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter psmobapppackname__like(String value){
        this.setFieldCond("psmobapppackname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSMobAppPackFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
