package net.ibizsys.central.cloud.saas.ebsx;

public interface IEBSXSystemRuntime extends net.ibizsys.central.cloud.core.IServiceSystemRuntime {

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAppFuncService getAppFuncService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IApplicationService getApplicationService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAuthLogService getAuthLogService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IBulletinService getBulletinService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyService getCarbonCopyService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyHisService getCarbonCopyHisService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.ICenterService getCenterService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCAuditService getDCAuditService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCCenterService getDCCenterService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCDCSystemService getDCDCSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCDynaInstService getDCDynaInstService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCEmployeeService getDCEmployeeService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCEventService getDCEventService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsInfoService getDCJobsInfoService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsLogService getDCJobsLogService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsRegistryService getDCJobsRegistryService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCLogService getDCLogService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCMetaDynaModelService getDCMetaDynaModelService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCOrgSystemService getDCOrgSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCOrganizationService getDCOrganizationService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCPOService getDCPOService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCSystemService getDCSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.service.IDataAuditService getDataAuditService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDepartmentService getDepartmentService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDeptAuthService getDeptAuthService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDeptMemberService getDeptMemberService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictCatalogService getDictCatalogService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictOptionService getDictOptionService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstAPIService getDstAPIService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstAppService getDstAppService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstComponentService getDstComponentService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstConfigService getDstConfigService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstDataSourceService getDstDataSourceService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstMicroserviceService getDstMicroserviceService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstRouterService getDstRouterService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstSystemService getDstSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstViewService getDstViewService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDynaInstService getDynaInstService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmpBindService getEmpBindService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService getEmployeeService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IInitSystem_WizardService getInitSystem_WizardService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsInfoService getJobsInfoService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLockService getJobsLockService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLogService getJobsLogService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsRegistryService getJobsRegistryService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDataSetService getMetaDataSetService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDynaModelService getMetaDynaModelService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaEntityService getMetaEntityService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaFieldService getMetaFieldService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaLookupService getMetaLookupService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaModelService getMetaModelService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaModuleService getMetaModuleService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaRelationshipService getMetaRelationshipService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgAccountService getMsgAccountService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgBodyService getMsgBodyService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgOpenAccessService getMsgOpenAccessService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueService getMsgSendQueueService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueHisService getMsgSendQueueHisService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgTemplateService getMsgTemplateService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgUserAccountService getMsgUserAccountService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.INotesService getNotesService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOldAppService getOldAppService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenAccessService getOpenAccessService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenDeptService getOpenDeptService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenUserService getOpenUserService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOrgApplicationService getOrgApplicationService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOrgSystemService getOrgSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IOrganizationService getOrganizationService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.IPTAsyncActionService getPTAsyncActionService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.IPTNotesService getPTNotesService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.IPayOpenAccessService getPayOpenAccessService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.IPayTradeService getPayTradeService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionService getPermissionService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionActionService getPermissionActionService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IPostService getPostService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.rep.service.IReportService getReportService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRoleService getRoleService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRolePermissionService getRolePermissionService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.service.ISDFileService getSDFileService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISchedulesService getSchedulesService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysAuditService getSysAuditService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysEventService getSysEventService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysLogService getSysLogService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISysMsgSendQueueService getSysMsgSendQueueService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysPOService getSysPOService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.ISystemService getSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.ITeamService getTeamService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.ITeamMemberService getTeamMemberService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoService getTodoService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoHisService getTodoHisService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IUAOrganizationService getUAOrganizationService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserService getUserService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserAuthService getUserAuthService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserRoleService getUserRoleService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionService getWFDefinitionService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionNodeService getWFDefinitionNodeService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFGroupService getWFGroupService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFHistoryService getWFHistoryService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFInstanceService getWFInstanceService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFMemberService getWFMemberService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFModelService getWFModelService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFSystemService getWFSystemService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTaskService getWFTaskService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTaskWayService getWFTaskWayService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTimeoutService getWFTimeoutService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFUndoTaskService getWFUndoTaskService();

    net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFUserService getWFUserService();

    
}



