package net.ibizsys.central.cloud.saas.ebsx;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.model.IPSDynaInstService;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.runtime.res.ISysUtilRuntime;

public class EBSXSystemRuntimeBase extends net.ibizsys.central.cloud.core.ServiceSystemRuntime implements IEBSXSystemRuntime {

    @Override
    public String getName() {
        return "iBizCloudCore";
    }

    @Override
    protected ISysUtilRuntime createDefaultSysUtilRuntime(IPSSysUtil iPSSysUtil) {
        return super.createDefaultSysUtilRuntime(iPSSysUtil);
    }

    @Override
    protected void onInit() throws Exception {
        this.registerDEServiceObjs();
        super.onInit();
    }

    @Override
    public IDEService getDEService(IDataEntityRuntime iDataEntityRuntime) {
        if (!this.getSystemGatewayContext().isMultiSystemMode()) {
            return this.getSystemGatewayContext().getDEService("net.ibizsys.central.cloud.saas.ebsx.IEBSXSystemRuntime", iDataEntityRuntime.getId());
        }
        return super.getDEService(iDataEntityRuntime);
    }

    protected void registerDEServiceObjs() {
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/AppFunc.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.AppFuncServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/Application.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.ApplicationServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/AuthLog.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.AuthLogServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/Bulletin.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.BulletinServiceImplEx");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/CarbonCopy.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.CarbonCopyServiceImplEx");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/CarbonCopyHis.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.CarbonCopyHisServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/Center.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.CenterServiceImplEx");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCAudit.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCAuditServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCCenter.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DCCenterServiceImplEx");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCDCSystem.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DCDCSystemServiceImplEx");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCDynaInst.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCDynaInstServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/DCEmployee.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.DCEmployeeServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCEvent.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCEventServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCJobsInfo.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DCJobsInfoServiceImplEx");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCJobsLog.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCJobsLogServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCJobsRegistry.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCJobsRegistryServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCLog.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCLogServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCMetaDynaModel.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DCMetaDynaModelServiceImplEx");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCOrgSystem.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCOrgSystemServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/DCOrganization.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.DCOrganizationServiceImpl");
        this.registerDEServiceObj("PSMODULES/center/PSDATAENTITIES/DCPO.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.impl.DCPOServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/DCSystem.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DCSystemServiceImplEx");
        this.registerDEServiceObj("PSMODULES/OperationMgr/PSDATAENTITIES/DataAudit.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.service.impl.DataAuditServiceImpl");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/Department.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.DepartmentServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/DeptAuth.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DeptAuthServiceImplEx");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/DeptMember.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.DeptMemberServiceImpl");
        this.registerDEServiceObj("PSMODULES/dict/PSDATAENTITIES/DictCatalog.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.impl.DictCatalogServiceImpl");
        this.registerDEServiceObj("PSMODULES/dict/PSDATAENTITIES/DictOption.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.impl.DictOptionServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstAPI.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.DstAPIServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstApp.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.DstAppServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstComponent.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DstComponentServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstConfig.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DstConfigServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstDataSource.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DstDataSourceServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstMicroservice.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.DstMicroserviceServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstRouter.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.DstRouterServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstSystem.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DstSystemServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/DstView.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.DstViewServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/DynaInst.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.DynaInstServiceImplEx");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/EmpBind.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.EmpBindServiceImpl");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/Employee.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.EmployeeServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/InitSystem_Wizard.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.InitSystem_WizardServiceImplEx");
        this.registerDEServiceObj("PSMODULES/task/PSDATAENTITIES/JobsInfo.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.JobsInfoServiceImplEx");
        this.registerDEServiceObj("PSMODULES/task/PSDATAENTITIES/JobsLock.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.impl.JobsLockServiceImpl");
        this.registerDEServiceObj("PSMODULES/task/PSDATAENTITIES/JobsLog.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.impl.JobsLogServiceImpl");
        this.registerDEServiceObj("PSMODULES/task/PSDATAENTITIES/JobsRegistry.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.impl.JobsRegistryServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaDataSet.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.MetaDataSetServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaDynaModel.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.MetaDynaModelServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaEntity.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.MetaEntityServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaField.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.MetaFieldServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaLookup.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.MetaLookupServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaModel.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.MetaModelServiceImplEx");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaModule.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.impl.MetaModuleServiceImpl");
        this.registerDEServiceObj("PSMODULES/lite/PSDATAENTITIES/MetaRelationship.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.MetaRelationshipServiceImplEx");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgAccount.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgAccountServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgBody.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgBodyServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgOpenAccess.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgOpenAccessServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgSendQueue.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.MsgSendQueueServiceImplEx");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgSendQueueHis.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.MsgSendQueueHisServiceImplEx");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgTemplate.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgTemplateServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/MsgUserAccount.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.MsgUserAccountServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/Notes.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.NotesServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/OldApp.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.OldAppServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/OpenAccess.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.OpenAccessServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/OpenDept.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.OpenDeptServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/OpenUser.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.OpenUserServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/OrgApplication.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.OrgApplicationServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/OrgSystem.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.OrgSystemServiceImpl");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/Organization.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.OrganizationServiceImpl");
        this.registerDEServiceObj("PSMODULES/portal/PSDATAENTITIES/PTAsyncAction.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.impl.PTAsyncActionServiceImpl");
        this.registerDEServiceObj("PSMODULES/portal/PSDATAENTITIES/PTNotes.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.impl.PTNotesServiceImpl");
        this.registerDEServiceObj("PSMODULES/pay/PSDATAENTITIES/PayOpenAccess.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.impl.PayOpenAccessServiceImpl");
        this.registerDEServiceObj("PSMODULES/pay/PSDATAENTITIES/PayTrade.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.impl.PayTradeServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/Permission.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.PermissionServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/PermissionAction.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.PermissionActionServiceImpl");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/Post.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.PostServiceImpl");
        this.registerDEServiceObj("PSMODULES/rep/PSDATAENTITIES/Report.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.ReportServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/Role.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.RoleServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/RolePermission.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.RolePermissionServiceImpl");
        this.registerDEServiceObj("PSMODULES/disk/PSDATAENTITIES/SDFile.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.service.impl.SDFileServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/Schedules.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.SchedulesServiceImpl");
        this.registerDEServiceObj("PSMODULES/log/PSDATAENTITIES/SysAudit.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.impl.SysAuditServiceImpl");
        this.registerDEServiceObj("PSMODULES/log/PSDATAENTITIES/SysEvent.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.impl.SysEventServiceImpl");
        this.registerDEServiceObj("PSMODULES/log/PSDATAENTITIES/SysLog.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.impl.SysLogServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/SysMsgSendQueue.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.SysMsgSendQueueServiceImpl");
        this.registerDEServiceObj("PSMODULES/log/PSDATAENTITIES/SysPO.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.impl.SysPOServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/System.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.SystemServiceImplEx");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/Team.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.TeamServiceImpl");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/TeamMember.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.TeamMemberServiceImpl");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/Todo.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.TodoServiceImplEx");
        this.registerDEServiceObj("PSMODULES/notify/PSDATAENTITIES/TodoHis.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.TodoHisServiceImpl");
        this.registerDEServiceObj("PSMODULES/ou/PSDATAENTITIES/UAOrganization.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl.UAOrganizationServiceImpl");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/User.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.UserServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/UserAuth.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.UserAuthServiceImplEx");
        this.registerDEServiceObj("PSMODULES/uaa/PSDATAENTITIES/UserRole.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.UserRoleServiceImplEx");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFDefinition.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFDefinitionServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFDefinitionNode.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.WFDefinitionNodeServiceImplEx");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFGroup.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.WFGroupServiceImplEx");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFHistory.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFHistoryServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFInstance.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.WFInstanceServiceImplEx");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFMember.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.WFMemberServiceImplEx");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFModel.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFModelServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFSystem.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFSystemServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFTask.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service.WFTaskServiceImplEx");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFTaskWay.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFTaskWayServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFTimeout.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFTimeoutServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFUndoTask.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFUndoTaskServiceImpl");
        this.registerDEServiceObj("PSMODULES/workflow/PSDATAENTITIES/WFUser.json","net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFUserServiceImpl");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAppFuncService getAppFuncService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAppFuncService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/AppFunc.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IApplicationService getApplicationService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IApplicationService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/Application.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAuthLogService getAuthLogService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAuthLogService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/AuthLog.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IBulletinService getBulletinService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IBulletinService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/Bulletin.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyService getCarbonCopyService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/CarbonCopy.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyHisService getCarbonCopyHisService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ICarbonCopyHisService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/CarbonCopyHis.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.ICenterService getCenterService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.ICenterService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/Center.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCAuditService getDCAuditService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCAuditService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCAudit.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCCenterService getDCCenterService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCCenterService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCCenter.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCDCSystemService getDCDCSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCDCSystemService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCDCSystem.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCDynaInstService getDCDynaInstService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCDynaInstService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCDynaInst.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCEmployeeService getDCEmployeeService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCEmployeeService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/DCEmployee.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCEventService getDCEventService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCEventService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCEvent.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsInfoService getDCJobsInfoService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsInfoService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCJobsInfo.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsLogService getDCJobsLogService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsLogService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCJobsLog.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsRegistryService getDCJobsRegistryService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCJobsRegistryService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCJobsRegistry.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCLogService getDCLogService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCLogService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCLog.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCMetaDynaModelService getDCMetaDynaModelService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCMetaDynaModelService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCMetaDynaModel.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCOrgSystemService getDCOrgSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCOrgSystemService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCOrgSystem.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCOrganizationService getDCOrganizationService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCOrganizationService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/DCOrganization.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCPOService getDCPOService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.center.service.IDCPOService) this.getDEService("PSMODULES/center/PSDATAENTITIES/DCPO.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCSystemService getDCSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDCSystemService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/DCSystem.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.service.IDataAuditService getDataAuditService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.service.IDataAuditService) this.getDEService("PSMODULES/OperationMgr/PSDATAENTITIES/DataAudit.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDepartmentService getDepartmentService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDepartmentService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/Department.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDeptAuthService getDeptAuthService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDeptAuthService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/DeptAuth.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDeptMemberService getDeptMemberService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDeptMemberService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/DeptMember.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictCatalogService getDictCatalogService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictCatalogService) this.getDEService("PSMODULES/dict/PSDATAENTITIES/DictCatalog.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictOptionService getDictOptionService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.dict.service.IDictOptionService) this.getDEService("PSMODULES/dict/PSDATAENTITIES/DictOption.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstAPIService getDstAPIService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstAPIService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstAPI.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstAppService getDstAppService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstAppService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstApp.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstComponentService getDstComponentService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstComponentService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstComponent.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstConfigService getDstConfigService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstConfigService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstConfig.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstDataSourceService getDstDataSourceService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstDataSourceService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstDataSource.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstMicroserviceService getDstMicroserviceService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstMicroserviceService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstMicroservice.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstRouterService getDstRouterService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstRouterService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstRouter.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstSystemService getDstSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstSystemService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstSystem.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstViewService getDstViewService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IDstViewService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/DstView.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDynaInstService getDynaInstService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDynaInstService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/DynaInst.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmpBindService getEmpBindService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmpBindService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/EmpBind.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService getEmployeeService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/Employee.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IInitSystem_WizardService getInitSystem_WizardService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IInitSystem_WizardService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/InitSystem_Wizard.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsInfoService getJobsInfoService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsInfoService) this.getDEService("PSMODULES/task/PSDATAENTITIES/JobsInfo.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLockService getJobsLockService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLockService) this.getDEService("PSMODULES/task/PSDATAENTITIES/JobsLock.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLogService getJobsLogService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLogService) this.getDEService("PSMODULES/task/PSDATAENTITIES/JobsLog.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsRegistryService getJobsRegistryService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsRegistryService) this.getDEService("PSMODULES/task/PSDATAENTITIES/JobsRegistry.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDataSetService getMetaDataSetService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDataSetService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaDataSet.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDynaModelService getMetaDynaModelService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDynaModelService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaDynaModel.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaEntityService getMetaEntityService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaEntityService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaEntity.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaFieldService getMetaFieldService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaFieldService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaField.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaLookupService getMetaLookupService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaLookupService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaLookup.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaModelService getMetaModelService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaModelService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaModel.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaModuleService getMetaModuleService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaModuleService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaModule.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaRelationshipService getMetaRelationshipService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaRelationshipService) this.getDEService("PSMODULES/lite/PSDATAENTITIES/MetaRelationship.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgAccountService getMsgAccountService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgAccountService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgAccount.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgBodyService getMsgBodyService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgBodyService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgBody.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgOpenAccessService getMsgOpenAccessService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgOpenAccessService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgOpenAccess.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueService getMsgSendQueueService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgSendQueue.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueHisService getMsgSendQueueHisService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgSendQueueHisService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgSendQueueHis.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgTemplateService getMsgTemplateService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgTemplateService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgTemplate.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgUserAccountService getMsgUserAccountService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.IMsgUserAccountService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/MsgUserAccount.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.INotesService getNotesService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.INotesService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/Notes.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOldAppService getOldAppService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOldAppService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/OldApp.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenAccessService getOpenAccessService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenAccessService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/OpenAccess.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenDeptService getOpenDeptService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenDeptService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/OpenDept.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenUserService getOpenUserService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenUserService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/OpenUser.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOrgApplicationService getOrgApplicationService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOrgApplicationService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/OrgApplication.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOrgSystemService getOrgSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOrgSystemService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/OrgSystem.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IOrganizationService getOrganizationService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IOrganizationService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/Organization.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.IPTAsyncActionService getPTAsyncActionService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.IPTAsyncActionService) this.getDEService("PSMODULES/portal/PSDATAENTITIES/PTAsyncAction.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.IPTNotesService getPTNotesService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.service.IPTNotesService) this.getDEService("PSMODULES/portal/PSDATAENTITIES/PTNotes.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.IPayOpenAccessService getPayOpenAccessService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.IPayOpenAccessService) this.getDEService("PSMODULES/pay/PSDATAENTITIES/PayOpenAccess.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.IPayTradeService getPayTradeService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.service.IPayTradeService) this.getDEService("PSMODULES/pay/PSDATAENTITIES/PayTrade.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionService getPermissionService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/Permission.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionActionService getPermissionActionService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IPermissionActionService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/PermissionAction.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IPostService getPostService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IPostService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/Post.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.rep.service.IReportService getReportService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.rep.service.IReportService) this.getDEService("PSMODULES/rep/PSDATAENTITIES/Report.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRoleService getRoleService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRoleService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/Role.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRolePermissionService getRolePermissionService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IRolePermissionService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/RolePermission.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.service.ISDFileService getSDFileService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.disk.service.ISDFileService) this.getDEService("PSMODULES/disk/PSDATAENTITIES/SDFile.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISchedulesService getSchedulesService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISchedulesService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/Schedules.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysAuditService getSysAuditService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysAuditService) this.getDEService("PSMODULES/log/PSDATAENTITIES/SysAudit.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysEventService getSysEventService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysEventService) this.getDEService("PSMODULES/log/PSDATAENTITIES/SysEvent.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysLogService getSysLogService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysLogService) this.getDEService("PSMODULES/log/PSDATAENTITIES/SysLog.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISysMsgSendQueueService getSysMsgSendQueueService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ISysMsgSendQueueService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/SysMsgSendQueue.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysPOService getSysPOService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.log.service.ISysPOService) this.getDEService("PSMODULES/log/PSDATAENTITIES/SysPO.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.ISystemService getSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.ISystemService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/System.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.ITeamService getTeamService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.ITeamService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/Team.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.ITeamMemberService getTeamMemberService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.ITeamMemberService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/TeamMember.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoService getTodoService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/Todo.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoHisService getTodoHisService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoHisService) this.getDEService("PSMODULES/notify/PSDATAENTITIES/TodoHis.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IUAOrganizationService getUAOrganizationService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IUAOrganizationService) this.getDEService("PSMODULES/ou/PSDATAENTITIES/UAOrganization.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserService getUserService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/User.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserAuthService getUserAuthService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserAuthService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/UserAuth.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserRoleService getUserRoleService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserRoleService) this.getDEService("PSMODULES/uaa/PSDATAENTITIES/UserRole.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionService getWFDefinitionService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFDefinition.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionNodeService getWFDefinitionNodeService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFDefinitionNodeService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFDefinitionNode.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFGroupService getWFGroupService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFGroupService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFGroup.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFHistoryService getWFHistoryService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFHistoryService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFHistory.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFInstanceService getWFInstanceService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFInstanceService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFInstance.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFMemberService getWFMemberService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFMemberService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFMember.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFModelService getWFModelService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFModelService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFModel.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFSystemService getWFSystemService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFSystemService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFSystem.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTaskService getWFTaskService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTaskService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFTask.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTaskWayService getWFTaskWayService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTaskWayService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFTaskWay.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTimeoutService getWFTimeoutService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFTimeoutService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFTimeout.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFUndoTaskService getWFUndoTaskService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFUndoTaskService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFUndoTask.json");
    }

    public net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFUserService getWFUserService(){
        return (net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFUserService) this.getDEService("PSMODULES/workflow/PSDATAENTITIES/WFUser.json");
    }

}
