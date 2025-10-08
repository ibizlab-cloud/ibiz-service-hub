package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.HrDepartmentDTO;

/**
 * 实体[HR_DEPARTMENT]服务对象接口
 * 
 */
@Qualifier(OdooModels.HR_DEPARTMENT)
public interface IHrDepartmentService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<HrDepartmentDTO, net.ibizsys.central.util.ISearchContextDTO>{

    /**
     * 行为: Create
     */
    String ACTION_CREATE = "CREATE";
    /**
     * 行为: Update
     */
    String ACTION_UPDATE = "UPDATE";
    /**
     * 行为: Remove
     */
    String ACTION_REMOVE = "REMOVE";
    /**
     * 行为: Get
     */
    String ACTION_GET = "GET";
    /**
     * 行为: GetDraft
     */
    String ACTION_GETDRAFT = "GETDRAFT";
    /**
     * 行为: CheckKey
     */
    String ACTION_CHECKKEY = "CHECKKEY";
    /**
     * 行为: Save
     */
    String ACTION_SAVE = "SAVE";
    /**
     * 行为: 部门计数器
     */
    String ACTION_DEPARTMENT_COUNTER = "DEPARTMENT_COUNTER";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 部门架构
     */
    String DATAQUERY_DEPARTMENT_CHART = "DEPARTMENT_CHART";
    /**
     * 查询: 部门层级
     */
    String DATAQUERY_DEPARTMENT_HIERARCHY = "DEPARTMENT_HIERARCHY";
    /**
     * 查询: 根部门
     */
    String DATAQUERY_ROOT = "ROOT";
    /**
     * 查询: 简单查询
     */
    String DATAQUERY_SIMPLE = "SIMPLE";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 部门架构
     */
    String DATASET_DEPARTMENT_CHART = "DEPARTMENT_CHART";
    /**
     * 集合: 部门层级
     */
    String DATASET_DEPARTMENT_HIERARCHY = "DEPARTMENT_HIERARCHY";
    /**
     * 集合: 根部门
     */
    String DATASET_ROOT = "ROOT";
    /**
     * 集合: 简单查询
     */
    String DATASET_SIMPLE = "SIMPLE";

    /**
     * 集合: DEFAULT
     */
    Page<HrDepartmentDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 部门架构
     */
    Page<HrDepartmentDTO> fetchDepartmentChart(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 部门层级
     */
    Page<HrDepartmentDTO> fetchDepartmentHierarchy(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 根部门
     */
    Page<HrDepartmentDTO> fetchRoot(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 简单查询
     */
    Page<HrDepartmentDTO> fetchSimple(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}