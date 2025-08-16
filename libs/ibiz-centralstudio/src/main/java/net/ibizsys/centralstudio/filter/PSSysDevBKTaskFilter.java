package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDEVBKTASK 过滤器对象
 */
public class PSSysDevBKTaskFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDevBKTaskFilter(){
    
    }      

    /**
     * 设置属性[计划作业机器人]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter planpsdcrobotid__eq(String value){
        this.setFieldCond("planpsdcrobotid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[计划作业机器人]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter planpsdcrobotname__eq(String value){
        this.setFieldCond("planpsdcrobotname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[计划作业机器人]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter planpsdcrobotname__like(String value){
        this.setFieldCond("planpsdcrobotname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父任务]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter ppssysdevbktaskid__eq(String value){
        this.setFieldCond("ppssysdevbktaskid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父任务]过滤操作[TESTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter ppssysdevbktaskid__testnull(Integer value){
        this.setFieldCond("ppssysdevbktaskid", Conditions.TESTNULL, value);
        return this;
    }

    /**
     * 设置属性[父任务]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter ppssysdevbktaskname__eq(String value){
        this.setFieldCond("ppssysdevbktaskname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父任务]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter ppssysdevbktaskname__like(String value){
        this.setFieldCond("ppssysdevbktaskname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[作业机器人]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter psdcrobotid__eq(String value){
        this.setFieldCond("psdcrobotid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[作业机器人]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter psdcrobotname__eq(String value){
        this.setFieldCond("psdcrobotname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[作业机器人]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter psdcrobotname__like(String value){
        this.setFieldCond("psdcrobotname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实例标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter psdynainstid__eq(String value){
        this.setFieldCond("psdynainstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pssysdevbktaskname__like(String value){
        this.setFieldCond("pssysdevbktaskname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[任务服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pstaskserverid__eq(String value){
        this.setFieldCond("pstaskserverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pstaskservername__eq(String value){
        this.setFieldCond("pstaskservername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务服务器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter pstaskservername__like(String value){
        this.setFieldCond("pstaskservername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[任务参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter taskparam__eq(String value){
        this.setFieldCond("taskparam", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务参数2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter taskparam2__eq(String value){
        this.setFieldCond("taskparam2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务参数3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter taskparam3__eq(String value){
        this.setFieldCond("taskparam3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务参数4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter taskparam4__eq(String value){
        this.setFieldCond("taskparam4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter taskstate__eq(Integer value){
        this.setFieldCond("taskstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter tasktype__eq(String value){
        this.setFieldCond("tasktype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDevBKTaskFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

}
