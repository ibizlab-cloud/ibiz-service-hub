package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELOGICLINK 过滤器对象
 */
public class PSDELogicLinkFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDELogicLinkFilter(){
    
    }      

    /**
     * 设置属性[目标节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter dstpsdelogicnodeid__eq(String value){
        this.setFieldCond("dstpsdelogicnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter dstpsdelogicnodename__eq(String value){
        this.setFieldCond("dstpsdelogicnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter dstpsdelogicnodename__like(String value){
        this.setFieldCond("dstpsdelogicnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter dstpsdlparamid__eq(String value){
        this.setFieldCond("dstpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter dstpsdlparamname__eq(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter dstpsdlparamname__like(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter psdelogiclinkname__like(String value){
        this.setFieldCond("psdelogiclinkname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter srcpsdelogicnodeid__eq(String value){
        this.setFieldCond("srcpsdelogicnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter srcpsdelogicnodename__eq(String value){
        this.setFieldCond("srcpsdelogicnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter srcpsdelogicnodename__like(String value){
        this.setFieldCond("srcpsdelogicnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicLinkFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
