package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl;

import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.IEBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoSimpleDTO;
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

public class TodoServiceImpl extends DEServiceBase<TodoDTO, SearchContextDTO> implements net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoService {


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
                if(iDEService == null || iDEService.getClass() == TodoServiceImpl.class)
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
                    TodoDTO dto = (TodoDTO) args[0];
                    onBeforeCreate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterCreate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_UPDATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    TodoDTO dto = (TodoDTO) args[0];
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
                    TodoDTO result = (TodoDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGet(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETDRAFT, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    TodoDTO dto = (TodoDTO) args[0];
                    onBeforeGetDraft(dto);
                    TodoDTO result = (TodoDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGetDraft(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_ACTIVATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onActivate((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_CANCEL, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onCancel((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_COMPLETE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onComplete((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_DELEGATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onDelegate((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETLINKURL, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onGetLinkUrl((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETLINKURLMOB, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onGetLinkUrlMob((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_MARKREAD, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onMarkRead((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_PAUSE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onPause((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_REASSIGN, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onReassign((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_RESOLVE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onResolve((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_ROLLBACK, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onRollback((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_SENDMSG, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    return ActionSessionManager.getCurrentSession().execute(new IAction() {
                        @Override
                        public Object execute(Object[] args) throws Throwable {
                            return onSendMsg((TodoDTO) args[0]);
                        }
                    }, args, ITransactionalUtil.PROPAGATION_REQUIRED);
                }
            });

            //结果集
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_CARBONCOPY, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_CURUSER, new IDEDataSetPluginRuntime() {
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
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_DONE, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_FINISH, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_LASTDONE, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_STARTED, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_TODO, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_TOREAD, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_UNDO, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
        } catch (Throwable e) {
            throw new RuntimeException(String.format("准备实体服务发生异常，%s", e.getMessage()), e);
        }
    }

    protected void onBeforeCreate(TodoDTO dto) throws Throwable {
        
     }

    protected void onAfterCreate(TodoDTO dto) throws Throwable {
      
    }

    protected void onBeforeUpdate(TodoDTO dto) throws Throwable {
        
     }

    protected void onAfterUpdate(TodoDTO dto) throws Throwable {
      
    }

    protected void onBeforeRemove(String key) throws Throwable {
        
     }

    protected void onAfterRemove(String key) throws Throwable {
      
    }

    protected void onBeforeGet(String key) throws Throwable {
        
     }

    protected TodoDTO onAfterGet(TodoDTO result, String key) throws Throwable {
      return result;
    }

    protected void onBeforeGetDraft(TodoDTO dto) throws Throwable {
        
     }

    protected TodoDTO onAfterGetDraft(TodoDTO result, TodoDTO dto) throws Throwable {
      return result;
    }

    protected TodoDTO onActivate(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "激活"), Errors.NOTIMPL);
    }

    protected TodoDTO onCancel(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "取消"), Errors.NOTIMPL);
    }

    protected TodoDTO onComplete(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "完成"), Errors.NOTIMPL);
    }

    protected TodoDTO onDelegate(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "委派"), Errors.NOTIMPL);
    }

    protected TodoDTO onGetLinkUrl(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "获取链接地址"), Errors.NOTIMPL);
    }

    protected TodoDTO onGetLinkUrlMob(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "移动端获取链接地址"), Errors.NOTIMPL);
    }

    protected TodoDTO onMarkRead(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "设置已读"), Errors.NOTIMPL);
    }

    protected TodoDTO onPause(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "挂起"), Errors.NOTIMPL);
    }

    protected TodoDTO onReassign(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "转办"), Errors.NOTIMPL);
    }

    protected TodoDTO onResolve(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "完成委派"), Errors.NOTIMPL);
    }

    protected TodoDTO onRollback(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "回滚"), Errors.NOTIMPL);
    }

    protected TodoDTO onSendMsg(TodoDTO dto) throws Throwable {
        throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("行为[%s]未实现", "待办消息发送"), Errors.NOTIMPL);
    }

}

