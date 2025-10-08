package cn.ibizlab.central.plugin.odoo.dataentity.service;

import org.springframework.beans.factory.annotation.Qualifier;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.domain.Page;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.MailActivityTypeDTO;

/**
 * 实体[MAIL_ACTIVITY_TYPE]服务对象接口
 * 
 */
@Qualifier(OdooModels.MAIL_ACTIVITY_TYPE)
public interface IMailActivityTypeService extends cn.ibizlab.central.plugin.odoo.dataentity.service.IOdooDEService<MailActivityTypeDTO, net.ibizsys.central.util.ISearchContextDTO>{

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
     * 行为: 移动位置
     */
    String ACTION_MOVEORDER = "MOVEORDER";
    /**
     * 行为: Save
     */
    String ACTION_SAVE = "SAVE";
    /**
     * 行为: 获取到期日期
     */
    String ACTION_GET_DATE_DEADLINE = "GET_DATE_DEADLINE";
    /**
     * 查询: DEFAULT
     */
    String DATAQUERY_DEFAULT = "DEFAULT";
    /**
     * 查询: 默认（全部数据）
     */
    String DATAQUERY_VIEW = "VIEW";
    /**
     * 查询: 资源类型及系统
     */
    String DATAQUERY_RES_AND_SYS = "RES_AND_SYS";
    /**
     * 集合: DEFAULT
     */
    String DATASET_DEFAULT = "DEFAULT";
    /**
     * 集合: 资源类型及系统
     */
    String DATASET_RES_AND_SYS = "RES_AND_SYS";

    /**
     * 行为: 获取到期日期
     */
    void getDateDeadline(MailActivityTypeDTO dto) throws Throwable;

    /**
     * 集合: DEFAULT
     */
    Page<MailActivityTypeDTO> fetchDefault(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
    /**
     * 集合: 资源类型及系统
     */
    Page<MailActivityTypeDTO> fetchResAndSys(net.ibizsys.central.util.ISearchContextDTO dto) throws Throwable;
}