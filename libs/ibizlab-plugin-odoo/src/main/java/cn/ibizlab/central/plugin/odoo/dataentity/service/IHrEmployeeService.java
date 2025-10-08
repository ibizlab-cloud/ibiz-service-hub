package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.HrEmployeeDTO;

/**
 * 实体[HR_EMPLOYEE]服务对象接口
 * 
 */
@Qualifier(OdooModels.HR_EMPLOYEE)
public interface IHrEmployeeService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<HrEmployeeDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 公司员工计数器
     */
    String ACTION_COMPANY_STAFF_COUNTER = "COMPANY_STAFF_COUNTER";
    /**
     * 行为: 员工计数器
     */
    String ACTION_EMP_COUNTER = "EMP_COUNTER";
    /**
     * 行为: 生成徽标 ID
     */
    String ACTION_GENERATE_RANDOM_BARCODE = "GENERATE_RANDOM_BARCODE";
    /**
     * 行为: 用户变更
     */
    String ACTION_ONCHANGE_USER = "ONCHANGE_USER";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 员工组织图表
     */
    String DATAQUERY_EMP_ORG_CHART = "EMP_ORG_CHART";
    /**
     * 查询: 员工组织图表2
     */
    String DATAQUERY_EMP_ORG_CHART2 = "EMP_ORG_CHART2";
    /**
     * 查询: 组织图表
     */
    String DATAQUERY_ORG_CHART = "ORG_CHART";
    /**
     * 查询: 简单查询
     */
    String DATAQUERY_SIMPLE = "SIMPLE";
    /**
     * 查询: 带活动查询
     */
    String DATAQUERY_WITH_ACTIVITIES = "WITH_ACTIVITIES";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 员工组织图表
     */
    String DATASET_EMP_ORG_CHART = "EMP_ORG_CHART";
    /**
     * 集合: 员工组织图表2
     */
    String DATASET_EMP_ORG_CHART2 = "EMP_ORG_CHART2";
    /**
     * 集合: 组织图表
     */
    String DATASET_ORG_CHART = "ORG_CHART";
    /**
     * 集合: 简单查询
     */
    String DATASET_SIMPLE = "SIMPLE";
    /**
     * 集合: 带活动查询
     */
    String DATASET_WITH_ACTIVITIES = "WITH_ACTIVITIES";

    /**
     * 行为: 公司员工计数器
     */
    void companyStaffCounter(HrEmployeeDTO dto) throws Throwable;

    /**
     * 行为: 生成徽标 ID
     */
    void generateRandomBarcode(HrEmployeeDTO dto) throws Throwable;
    /**
     * 行为: 用户变更
     */
    void onchangeUser(HrEmployeeDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<HrEmployeeDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 员工组织图表
     */
    Page<HrEmployeeDTO> fetchEmpOrgChart(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 员工组织图表2
     */
    Page<HrEmployeeDTO> fetchEmpOrgChart2(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 组织图表
     */
    Page<HrEmployeeDTO> fetchOrgChart(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 简单查询
     */
    Page<HrEmployeeDTO> fetchSimple(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 带活动查询
     */
    Page<HrEmployeeDTO> fetchWithActivities(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}