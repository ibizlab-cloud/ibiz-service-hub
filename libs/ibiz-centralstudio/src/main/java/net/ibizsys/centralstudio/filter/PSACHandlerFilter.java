package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSACHANDLER 过滤器对象
 */
public class PSACHandlerFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSACHandlerFilter(){
    
    }      

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter cachescope__eq(Integer value){
        this.setFieldCond("cachescope", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeopprivid__eq(String value){
        this.setFieldCond("createpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeoppriviname__eq(String value){
        this.setFieldCond("createpsdeoppriviname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeoppriviname__like(String value){
        this.setFieldCond("createpsdeoppriviname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter ctrltype__eq(String value){
        this.setFieldCond("ctrltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导出要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter exportpsdeopprivid__eq(String value){
        this.setFieldCond("exportpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导出要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter exportpsdeopprivname__eq(String value){
        this.setFieldCond("exportpsdeopprivname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("exportpsdeoppriviname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导出要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter exportpsdeopprivname__like(String value){
        this.setFieldCond("exportpsdeopprivname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("exportpsdeoppriviname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter handlerobj__like(String value){
        this.setFieldCond("handlerobj", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务部件处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssfachandlerid__eq(String value){
        this.setFieldCond("pssfachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssfachandlername__eq(String value){
        this.setFieldCond("pssfachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssfachandlername__like(String value){
        this.setFieldCond("pssfachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[缓存统一状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysunistateid__eq(String value){
        this.setFieldCond("pssysunistateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存统一状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysunistatename__eq(String value){
        this.setFieldCond("pssysunistatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存统一状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysunistatename__like(String value){
        this.setFieldCond("pssysunistatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrid__eq(String value){
        this.setFieldCond("pssysuserdrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrid2__eq(String value){
        this.setFieldCond("pssysuserdrid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname__eq(String value){
        this.setFieldCond("pssysuserdrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname__like(String value){
        this.setFieldCond("pssysuserdrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname2__eq(String value){
        this.setFieldCond("pssysuserdrname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname2__like(String value){
        this.setFieldCond("pssysuserdrname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter readpsdeopprivid__eq(String value){
        this.setFieldCond("readpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter readpsdeopprivname__eq(String value){
        this.setFieldCond("readpsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter readpsdeopprivname__like(String value){
        this.setFieldCond("readpsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeopprivid__eq(String value){
        this.setFieldCond("removepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeopprivname__eq(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeopprivname__like(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[临时数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter tempmode__eq(Integer value){
        this.setFieldCond("tempmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeopprivid__eq(String value){
        this.setFieldCond("updatepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeopprivname__eq(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeopprivname__like(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义权限2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeopprivid__eq(String value){
        this.setFieldCond("user2psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeopprivname__eq(String value){
        this.setFieldCond("user2psdeopprivname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("user2psdeoppriviname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeopprivname__like(String value){
        this.setFieldCond("user2psdeopprivname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("user2psdeoppriviname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeopprivid__eq(String value){
        this.setFieldCond("userpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeopprivname__eq(String value){
        this.setFieldCond("userpsdeopprivname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("userpsdeoppriviname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeopprivname__like(String value){
        this.setFieldCond("userpsdeopprivname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("userpsdeoppriviname", Conditions.LIKE, value);
        return this;
    }

}
