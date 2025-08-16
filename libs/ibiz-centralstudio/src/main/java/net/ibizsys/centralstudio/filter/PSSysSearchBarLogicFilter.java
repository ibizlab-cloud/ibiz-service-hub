package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHBARLOGIC 过滤器对象
 */
public class PSSysSearchBarLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSearchBarLogicFilter(){
    
    }      

    /**
     * 设置属性[目标逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter dstlogictype__eq(String value){
        this.setFieldCond("dstlogictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyssearchbarid__eq(String value){
        this.setFieldCond("pssyssearchbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyssearchbarlogicname__eq(String value){
        this.setFieldCond("pssyssearchbarlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyssearchbarlogicname__like(String value){
        this.setFieldCond("pssyssearchbarlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyssearchbarname__eq(String value){
        this.setFieldCond("pssyssearchbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssyssearchbarname__like(String value){
        this.setFieldCond("pssyssearchbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssysviewlogicid__eq(String value){
        this.setFieldCond("pssysviewlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssysviewlogicname__eq(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssysviewlogicname__like(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[触发类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter triggertype__eq(String value){
        this.setFieldCond("triggertype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchBarLogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
