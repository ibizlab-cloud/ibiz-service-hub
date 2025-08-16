package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl;

import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.IEBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserSimpleDTO;
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

public class UserServiceImpl extends DEServiceBase<UserDTO, SearchContextDTO> implements net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IUserService {


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
                if(iDEService == null || iDEService.getClass() == UserServiceImpl.class)
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
                    UserDTO dto = (UserDTO) args[0];
                    onBeforeCreate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterCreate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_UPDATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    UserDTO dto = (UserDTO) args[0];
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
                    UserDTO result = (UserDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGet(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETDRAFT, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    UserDTO dto = (UserDTO) args[0];
                    onBeforeGetDraft(dto);
                    UserDTO result = (UserDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGetDraft(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_CHANGEPWD, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            onChangePwd((UserDTO) args[0]);
                            return null;
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_DELETESYSUSER, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    UserDTO dto = (UserDTO) args[0];
                    onBeforeDeleteSysUser(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterDeleteSysUser(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETIGNORECENTER, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onGetIgnoreCenter((String) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_INITPWD, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            onInitPwd((UserDTO) args[0]);
                            return null;
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_SAVESYSUSER, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    UserDTO dto = (UserDTO) args[0];
                    onBeforeSaveSysUser(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterSaveSysUser(dto);
                    return null;
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

    protected void onBeforeCreate(UserDTO dto) throws Throwable {
        
     }

    protected void onAfterCreate(UserDTO dto) throws Throwable {
      
    }

    protected void onBeforeUpdate(UserDTO dto) throws Throwable {
        
     }

    protected void onAfterUpdate(UserDTO dto) throws Throwable {
      
    }

    protected void onBeforeRemove(String key) throws Throwable {
        
     }

    protected void onAfterRemove(String key) throws Throwable {
      
    }

    protected void onBeforeGet(String key) throws Throwable {
        
     }

    protected UserDTO onAfterGet(UserDTO result, String key) throws Throwable {
      return result;
    }

    protected void onBeforeGetDraft(UserDTO dto) throws Throwable {
        
     }

    protected UserDTO onAfterGetDraft(UserDTO result, UserDTO dto) throws Throwable {
      return result;
    }

    protected void onChangePwd(UserDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "初始化密码"), Errors.NOTIMPL);
    }

    protected void onBeforeDeleteSysUser(UserDTO dto) throws Throwable {
        
     }

    protected void onAfterDeleteSysUser(UserDTO dto) throws Throwable {
      
    }

    protected UserDTO onGetIgnoreCenter(String key) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "getIgnoreCenter"), Errors.NOTIMPL);
    }

    protected void onInitPwd(UserDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "初始化密码"), Errors.NOTIMPL);
    }

    protected void onBeforeSaveSysUser(UserDTO dto) throws Throwable {
        
     }

    protected void onAfterSaveSysUser(UserDTO dto) throws Throwable {
      
    }

}

