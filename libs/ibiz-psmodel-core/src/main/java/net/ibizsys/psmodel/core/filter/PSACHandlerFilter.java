package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSACHANDLER 过滤器对象
 */
public class PSACHandlerFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSACHandlerFilter(){
    
    }      

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter cachescope__eq(Integer value){
        this.setFieldCond("cachescope", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeopprivid__eq(String value){
        this.setFieldCond("createpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeoppriviname__eq(String value){
        this.setFieldCond("createpsdeoppriviname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter createpsdeoppriviname__like(String value){
        this.setFieldCond("createpsdeoppriviname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter ctrltype__eq(String value){
        this.setFieldCond("ctrltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter exportpsdeopprivid__eq(String value){
        this.setFieldCond("exportpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter exportpsdeopprivname__eq(String value){
        this.setFieldCond("exportpsdeopprivname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("exportpsdeoppriviname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter exportpsdeopprivname__like(String value){
        this.setFieldCond("exportpsdeopprivname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("exportpsdeoppriviname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组移动实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter groupmovepsdeactionid__eq(String value){
        this.setFieldCond("groupmovepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter groupmovepsdeactionname__eq(String value){
        this.setFieldCond("groupmovepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter groupmovepsdeactionname__like(String value){
        this.setFieldCond("groupmovepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter grouppsdeid__eq(String value){
        this.setFieldCond("grouppsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter grouppsdename__eq(String value){
        this.setFieldCond("grouppsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter grouppsdename__like(String value){
        this.setFieldCond("grouppsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter handlerobj__like(String value){
        this.setFieldCond("handlerobj", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter movepsdeactionid__eq(String value){
        this.setFieldCond("movepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter movepsdeactionname__eq(String value){
        this.setFieldCond("movepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter movepsdeactionname__like(String value){
        this.setFieldCond("movepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理对象名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务部件处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssfachandlerid__eq(String value){
        this.setFieldCond("pssfachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssfachandlername__eq(String value){
        this.setFieldCond("pssfachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssfachandlername__like(String value){
        this.setFieldCond("pssfachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[缓存统一状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysunistateid__eq(String value){
        this.setFieldCond("pssysunistateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存统一状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysunistatename__eq(String value){
        this.setFieldCond("pssysunistatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存统一状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysunistatename__like(String value){
        this.setFieldCond("pssysunistatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrid__eq(String value){
        this.setFieldCond("pssysuserdrid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrid2__eq(String value){
        this.setFieldCond("pssysuserdrid2", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname__eq(String value){
        this.setFieldCond("pssysuserdrname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname__like(String value){
        this.setFieldCond("pssysuserdrname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname2__eq(String value){
        this.setFieldCond("pssysuserdrname2", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter pssysuserdrname2__like(String value){
        this.setFieldCond("pssysuserdrname2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter readpsdeopprivid__eq(String value){
        this.setFieldCond("readpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter readpsdeopprivname__eq(String value){
        this.setFieldCond("readpsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter readpsdeopprivname__like(String value){
        this.setFieldCond("readpsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeopprivid__eq(String value){
        this.setFieldCond("removepsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeopprivname__eq(String value){
        this.setFieldCond("removepsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter removepsdeopprivname__like(String value){
        this.setFieldCond("removepsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[临时数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter tempmode__eq(Integer value){
        this.setFieldCond("tempmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeopprivid__eq(String value){
        this.setFieldCond("updatepsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeopprivname__eq(String value){
        this.setFieldCond("updatepsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter updatepsdeopprivname__like(String value){
        this.setFieldCond("updatepsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义权限2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeopprivid__eq(String value){
        this.setFieldCond("user2psdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeopprivname__eq(String value){
        this.setFieldCond("user2psdeopprivname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("user2psdeoppriviname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter user2psdeopprivname__like(String value){
        this.setFieldCond("user2psdeopprivname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("user2psdeoppriviname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeopprivid__eq(String value){
        this.setFieldCond("userpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeopprivname__eq(String value){
        this.setFieldCond("userpsdeopprivname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("userpsdeoppriviname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter userpsdeopprivname__like(String value){
        this.setFieldCond("userpsdeopprivname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("userpsdeoppriviname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSACHandlerFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
