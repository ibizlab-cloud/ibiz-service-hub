package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUCMAPNODE 过滤器对象
 */
public class PSSysUCMapNodeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUCMapNodeFilter(){
    
    }      

    /**
     * 设置属性[节点类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter nodetype__eq(String value){
        this.setFieldCond("nodetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysactorid__eq(String value){
        this.setFieldCond("pssysactorid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysactorname__eq(String value){
        this.setFieldCond("pssysactorname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作者]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysactorname__like(String value){
        this.setFieldCond("pssysactorname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysucmapid__eq(String value){
        this.setFieldCond("pssysucmapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysucmapname__eq(String value){
        this.setFieldCond("pssysucmapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysucmapname__like(String value){
        this.setFieldCond("pssysucmapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[节点名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysucmapnodename__like(String value){
        this.setFieldCond("pssysucmapnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUCMapNodeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
