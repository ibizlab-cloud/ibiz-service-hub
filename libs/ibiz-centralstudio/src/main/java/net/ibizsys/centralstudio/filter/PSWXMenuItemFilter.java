package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXMENUITEM 过滤器对象
 */
public class PSWXMenuItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWXMenuItemFilter(){
    
    }      

    /**
     * 设置属性[父菜单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter ppswxmenuitemid__eq(String value){
        this.setFieldCond("ppswxmenuitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父菜单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter ppswxmenuitemname__eq(String value){
        this.setFieldCond("ppswxmenuitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父菜单项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter ppswxmenuitemname__like(String value){
        this.setFieldCond("ppswxmenuitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenufuncid__eq(String value){
        this.setFieldCond("pswxmenufuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenufuncname__eq(String value){
        this.setFieldCond("pswxmenufuncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenufuncname__like(String value){
        this.setFieldCond("pswxmenufuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenuid__eq(String value){
        this.setFieldCond("pswxmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[菜单项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenuitemname__like(String value){
        this.setFieldCond("pswxmenuitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenuname__eq(String value){
        this.setFieldCond("pswxmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter pswxmenuname__like(String value){
        this.setFieldCond("pswxmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
