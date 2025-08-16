package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNSYSBAK 过滤器对象
 */
public class PSDevSlnSysBakFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnSysBakFilter(){
    
    }      

    /**
     * 设置属性[开发系统备份名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevslnsysbakname__like(String value){
        this.setFieldCond("psdevslnsysbakname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统备份标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevslnsysbakid__eq(String value){
        this.setFieldCond("psdevslnsysbakid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[备份模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter backupmode__eq(String value){
        this.setFieldCond("backupmode", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("bkmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[备份状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter backupstate__eq(Integer value){
        this.setFieldCond("backupstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysBakFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

}