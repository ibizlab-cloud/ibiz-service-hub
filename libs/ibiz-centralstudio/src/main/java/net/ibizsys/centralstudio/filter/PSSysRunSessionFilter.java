package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSRUNSESSION 过滤器对象
 */
public class PSSysRunSessionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysRunSessionFilter(){
    
    }      

    /**
     * 设置属性[打包模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter packmode__eq(String value){
        this.setFieldCond("packmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务接口部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepapiid__eq(String value){
        this.setFieldCond("psdevslnmsdepapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务接口部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepapiname__eq(String value){
        this.setFieldCond("psdevslnmsdepapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务接口部署]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepapiname__like(String value){
        this.setFieldCond("psdevslnmsdepapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微服务应用部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepappid__eq(String value){
        this.setFieldCond("psdevslnmsdepappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务应用部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepappname__eq(String value){
        this.setFieldCond("psdevslnmsdepappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务应用部署]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepappname__like(String value){
        this.setFieldCond("psdevslnmsdepappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微服务功能部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepfuncid__eq(String value){
        this.setFieldCond("psdevslnmsdepfuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务功能部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepfuncname__eq(String value){
        this.setFieldCond("psdevslnmsdepfuncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务功能部署]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdevslnmsdepfuncname__like(String value){
        this.setFieldCond("psdevslnmsdepfuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实例标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psdynainstid__eq(String value){
        this.setFieldCond("psdynainstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用打包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psmobapppackid__eq(String value){
        this.setFieldCond("psmobapppackid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用打包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psmobapppackname__eq(String value){
        this.setFieldCond("psmobapppackname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动应用打包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter psmobapppackname__like(String value){
        this.setFieldCond("psmobapppackname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统应用2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysappid2__eq(String value){
        this.setFieldCond("pssysappid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysappname2__eq(String value){
        this.setFieldCond("pssysappname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysappname2__like(String value){
        this.setFieldCond("pssysappname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysbdinstcfgid__eq(String value){
        this.setFieldCond("pssysbdinstcfgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysbdinstcfgname__eq(String value){
        this.setFieldCond("pssysbdinstcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysbdinstcfgname__like(String value){
        this.setFieldCond("pssysbdinstcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统运行会话]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysrunsessionname__like(String value){
        this.setFieldCond("pssysrunsessionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemasid__eq(String value){
        this.setFieldCond("pssystemasid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemasname__eq(String value){
        this.setFieldCond("pssystemasname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用服务器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemasname__like(String value){
        this.setFieldCond("pssystemasname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemdbcfgid__eq(String value){
        this.setFieldCond("pssystemdbcfgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemdbcfgname__eq(String value){
        this.setFieldCond("pssystemdbcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemdbcfgname__like(String value){
        this.setFieldCond("pssystemdbcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[重新构建]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter rebuildmode__eq(Integer value){
        this.setFieldCond("rebuildmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runmode__eq(String value){
        this.setFieldCond("runmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runparam__eq(String value){
        this.setFieldCond("runparam", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行参数2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runparam2__eq(String value){
        this.setFieldCond("runparam2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行参数3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runparam3__eq(String value){
        this.setFieldCond("runparam3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行参数4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runparam4__eq(String value){
        this.setFieldCond("runparam4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runpssysdynamodelid__eq(String value){
        this.setFieldCond("runpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态运行模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runpssysdynamodelname__eq(String value){
        this.setFieldCond("runpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态运行模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runpssysdynamodelname__like(String value){
        this.setFieldCond("runpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter runstate__eq(Integer value){
        this.setFieldCond("runstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据模型版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter srcpssysdmverid__eq(String value){
        this.setFieldCond("srcpssysdmverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据模型版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter srcpssysdmvername__eq(String value){
        this.setFieldCond("srcpssysdmvername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据模型版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter srcpssysdmvername__like(String value){
        this.setFieldCond("srcpssysdmvername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRunSessionFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

}
