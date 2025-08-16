package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl;

import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.IEBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.AppFuncDEFGroupDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.AppFuncDTO;
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

public class AppFuncServiceImpl extends DEServiceBase<AppFuncDTO, SearchContextDTO> implements net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IAppFuncService {


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
                if(iDEService == null || iDEService.getClass() == AppFuncServiceImpl.class)
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
                    AppFuncDTO dto = (AppFuncDTO) args[0];
                    onBeforeCreate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterCreate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_UPDATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    AppFuncDTO dto = (AppFuncDTO) args[0];
                    onBeforeUpdate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterUpdate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_REMOVE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    String dto = (String) args[0];
                    onBeforeRemove(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterRemove(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GET, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    String dto = (String) args[0];
                    onBeforeGet(dto);
                    AppFuncDTO result = (AppFuncDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGet(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETDRAFT, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    AppFuncDTO dto = (AppFuncDTO) args[0];
                    onBeforeGetDraft(dto);
                    AppFuncDTO result = (AppFuncDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGetDraft(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETFUNCURL, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onGetFuncUrl((String) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETFUNCURLMOB, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onGetFuncUrlMob((String) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_SETFUNCSETTING, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            onSetFuncSetting((AppFuncDTO) args[0]);
                            return null;
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_SETFUNCSETTINGMOB, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            onSetFuncSettingMob((AppFuncDTO) args[0]);
                            return null;
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });

            //结果集
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_CURUSERFUNC, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_DEFAULT, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_ORGAPPFUNC, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_PERSONFUNC, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_PERSONFUNCMOB, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_PERSONFUNCSETTING, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_PERSONFUNCSETTINGMOB, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
        } catch (Throwable e) {
            throw new RuntimeException(String.format("准备实体服务发生异常，%s", e.getMessage()), e);
        }
    }

    protected void onBeforeCreate(AppFuncDTO dto) throws Throwable {
        
     }

    protected void onAfterCreate(AppFuncDTO dto) throws Throwable {
      
    }

    protected void onBeforeUpdate(AppFuncDTO dto) throws Throwable {
        
     }

    protected void onAfterUpdate(AppFuncDTO dto) throws Throwable {
      
    }

    protected void onBeforeRemove(String key) throws Throwable {
        
     }

    protected void onAfterRemove(String key) throws Throwable {
      
    }

    protected void onBeforeGet(String key) throws Throwable {
        
     }

    protected AppFuncDTO onAfterGet(AppFuncDTO result, String key) throws Throwable {
      return result;
    }

    protected void onBeforeGetDraft(AppFuncDTO dto) throws Throwable {
        
     }

    protected AppFuncDTO onAfterGetDraft(AppFuncDTO result, AppFuncDTO dto) throws Throwable {
      return result;
    }

    protected AppFuncDTO onGetFuncUrl(String key) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "获取快捷操作打开地址"), Errors.NOTIMPL);
    }

    protected AppFuncDTO onGetFuncUrlMob(String key) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "移动端获取快捷操作打开地址"), Errors.NOTIMPL);
    }

    protected void onSetFuncSetting(AppFuncDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "设置快捷操作"), Errors.NOTIMPL);
    }

    protected void onSetFuncSettingMob(AppFuncDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "移动端设置快捷操作"), Errors.NOTIMPL);
    }

}

