package net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.impl;

import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.IEBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.task.dto.JobsLockDTO;
import net.ibizsys.central.dataentity.service.DEServiceBase;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.ISystemGateway;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Service
public class JobsLockServiceImpl extends DEServiceBase<JobsLockDTO, SearchContextDTO> implements net.ibizsys.central.cloud.saas.ebsx.spring.core.task.service.IJobsLockService {


    @Autowired(required = false)
    ISystemGateway systemGateway;

    IEBSXSystemRuntime iSystemRuntime;

    @Override
    public IEBSXSystemRuntime getSystemRuntime() {
        if (this.iSystemRuntime == null) {
            if (this.systemGateway == null) {
                //从基类获取
                this.iSystemRuntime = (IEBSXSystemRuntime) super.getSystemRuntime();
            } else {
                this.iSystemRuntime = systemGateway.getSystemRuntime(IEBSXSystemRuntime.class, false);
            }
        }
        return this.iSystemRuntime;
    }

    @PostConstruct
    private void postConstruct() throws Exception {
        if (systemGateway != null && !systemGateway.isMultiInstanceMode(EBSXSystemRuntime.class)) {
            try {
                IDEService iDEService = systemGateway.getDEService(EBSXSystemRuntime.class, this.getDataEntityId(), true);
                if(iDEService == null || iDEService.getClass() == JobsLockServiceImpl.class)
                    systemGateway.registerDEService(EBSXSystemRuntime.class, this.getDataEntityId(), this);
            }catch (Exception e){
                throw e;
            }
        }
    }

    @Override
    protected void onPrepare() {
        super.onPrepare();
        try {
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_CREATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    JobsLockDTO dto = (JobsLockDTO) args[0];
                    onBeforeCreate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterCreate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_UPDATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    JobsLockDTO dto = (JobsLockDTO) args[0];
                    onBeforeUpdate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterUpdate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_REMOVE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    Long dto = (Long) args[0];
                    onBeforeRemove(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterRemove(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GET, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    Long dto = (Long) args[0];
                    onBeforeGet(dto);
                    JobsLockDTO result = (JobsLockDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGet(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETDRAFT, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    JobsLockDTO dto = (JobsLockDTO) args[0];
                    onBeforeGetDraft(dto);
                    JobsLockDTO result = (JobsLockDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGetDraft(result, dto);
                }
            });

            //结果集
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_DEFAULT, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
        } catch (Throwable e) {
            throw new RuntimeException(String.format("准备实体服务发生异常，%s", e.getMessage()), e);
        }
    }

    protected void onBeforeCreate(JobsLockDTO dto) throws Throwable {
        
     }

    protected void onAfterCreate(JobsLockDTO dto) throws Throwable {
      
    }

    protected void onBeforeUpdate(JobsLockDTO dto) throws Throwable {
        
     }

    protected void onAfterUpdate(JobsLockDTO dto) throws Throwable {
      
    }

    protected void onBeforeRemove(Long key) throws Throwable {
        
     }

    protected void onAfterRemove(Long key) throws Throwable {
      
    }

    protected void onBeforeGet(Long key) throws Throwable {
        
     }

    protected JobsLockDTO onAfterGet(JobsLockDTO result, Long key) throws Throwable {
      return result;
    }

    protected void onBeforeGetDraft(JobsLockDTO dto) throws Throwable {
        
     }

    protected JobsLockDTO onAfterGetDraft(JobsLockDTO result, JobsLockDTO dto) throws Throwable {
      return result;
    }

}

