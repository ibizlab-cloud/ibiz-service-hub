package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVCENTERSVN 过滤器对象
 */
public class PSDevCenterSVNFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevCenterSVNFilter(){
    
    }      

    /**
     * 设置属性[应用中心代码库标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevcentersvnid__eq(String value){
        this.setFieldCond("psdevcentersvnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心代码库名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevcentersvnname__like(String value){
        this.setFieldCond("psdevcentersvnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[锁定模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter lockmode__eq(Integer value){
        this.setFieldCond("lockmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter respos__eq(Integer value){
        this.setFieldCond("respos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[GIT仓库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter gitrepo__eq(String value){
        this.setFieldCond("gitrepo", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[仓库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter svntype__eq(String value){
        this.setFieldCond("svntype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterSVNFilter resstate__eq(Integer value){
        this.setFieldCond("resstate", Conditions.EQ, value);
        return this;
    }

}