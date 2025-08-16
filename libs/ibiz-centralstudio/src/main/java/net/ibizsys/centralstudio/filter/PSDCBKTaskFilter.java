package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCBKTASK 过滤器对象
 */
public class PSDCBKTaskFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCBKTaskFilter(){
    
    }      

    /**
     * 设置属性[应用中心后台任务标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdcbktaskid__eq(String value){
        this.setFieldCond("psdcbktaskid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdcbktaskname__like(String value){
        this.setFieldCond("psdcbktaskname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter taskstate__eq(Integer value){
        this.setFieldCond("taskstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter tasktype__eq(String value){
        this.setFieldCond("tasktype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCBKTaskFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

}