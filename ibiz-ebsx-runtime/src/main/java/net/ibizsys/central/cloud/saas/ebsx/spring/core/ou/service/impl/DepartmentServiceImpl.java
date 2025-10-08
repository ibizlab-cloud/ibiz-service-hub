package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.impl;

import net.ibizsys.central.ISystemGateway;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.IEBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.DepartmentDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.SysDepartmentDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDepartmentService;
import net.ibizsys.central.cloud.uaa.core.addin.RTAuthAgent;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthInfo;
import net.ibizsys.central.dataentity.service.DEServiceBase;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl extends DEServiceBase<DepartmentDTO, SearchContextDTO> implements net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IDepartmentService {


    @Autowired(required = false)
    ISystemGateway systemGateway;

    IEBSXSystemRuntime iSystemRuntime;

    private IWebClient iWebClient = null;
    protected IWebClient getWebClient() throws Exception {
        if (this.iWebClient == null  ) {
            iWebClient = this.getSystemRuntime().createWebClient(RTAuthAgent.RT_SERVICE);
            iWebClient.init(this.getSystemRuntime(), RTAuthAgent.RT_SERVICE, null);
        }
        return this.iWebClient;
    }

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
                if(iDEService == null || iDEService.getClass() == DepartmentServiceImpl.class)
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
                    DepartmentDTO dto = (DepartmentDTO) args[0];
                    onBeforeCreate(dto);
                    iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    onAfterCreate(dto);
                    return null;
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_UPDATE, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    DepartmentDTO dto = (DepartmentDTO) args[0];
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
                    DepartmentDTO result = (DepartmentDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGet(result, dto);
                }
            });
            this.getDataEntityRuntime().registerDEActionPluginRuntime(ACTION_GETDRAFT, new IDEActionPluginRuntime() {
                @Override
                public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
                    DepartmentDTO dto = (DepartmentDTO) args[0];
                    onBeforeGetDraft(dto);
                    DepartmentDTO result = (DepartmentDTO) iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
                    return onAfterGetDraft(result, dto);
                }
            });

            //结果集
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_CURUSERDEPT, new IDEDataSetPluginRuntime() {
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
            this.getDataEntityRuntime().registerDEDataSetPluginRuntime(DATASET_EXCLUDE, new IDEDataSetPluginRuntime() {
                @Override
                public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
                    return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData);
                }
            });
        } catch (Throwable e) {
            throw new RuntimeException(String.format("准备实体服务发生异常，%s", e.getMessage()), e);
        }
    }

    protected void onBeforeCreate(DepartmentDTO dto) throws Throwable {
        
     }

    protected void onAfterCreate(DepartmentDTO dto) throws Throwable {
      
    }

    protected void onBeforeUpdate(DepartmentDTO dto) throws Throwable {
        
     }

    protected void onAfterUpdate(DepartmentDTO dto) throws Throwable {
      
    }

    protected void onBeforeRemove(String key) throws Throwable {
        
     }

    protected void onAfterRemove(String key) throws Throwable {
      
    }

    protected void onBeforeGet(String key) throws Throwable {
        
     }

    protected DepartmentDTO onAfterGet(DepartmentDTO result, String key) throws Throwable {
      return result;
    }

    protected void onBeforeGetDraft(DepartmentDTO dto) throws Throwable {
        
     }

    protected DepartmentDTO onAfterGetDraft(DepartmentDTO result, DepartmentDTO dto) throws Throwable {
      return result;
    }

    private Map getHerder() {
        Map header = new HashMap();
        header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());
        return header;
    }

    @Override
    public void update(DepartmentDTO dto) throws Throwable {
        IWebClientRep<SysDepartmentDTO> rep = getWebClient().put(String.format("/sys_departments/%1$s",dto.getDeptId()), null, getHerder(), null, SysDepartmentDTO.from(dto), null, SysDepartmentDTO.class, null);
        if (rep != null && rep.getBody() != null) {
            SysDepartmentDTO ret = rep.getBody();
            if (StringUtils.hasLength(ret.getId())) {
                dto.setDeptId(ret.getId());
                get(dto,true);
            }
        }
    }

    @Override
    public void create(DepartmentDTO dto) throws Throwable {

        IWebClientRep<SysDepartmentDTO> rep = getWebClient().post("/sys_departments", null, getHerder(), null, SysDepartmentDTO.from(dto), null, SysDepartmentDTO.class, null);
        if (rep != null && rep.getBody() != null) {
            SysDepartmentDTO ret = rep.getBody();
            if (StringUtils.hasLength(ret.getId())) {
                dto.setDeptId(ret.getId());
                get(dto,true);
            }
        }

    }

    @Override
    public void remove(List<String> keys) throws Throwable {
        keys.forEach(key -> {
            try {
                getWebClient().delete(String.format("/sys_departments/%1$s",key), null, getHerder());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }


}

