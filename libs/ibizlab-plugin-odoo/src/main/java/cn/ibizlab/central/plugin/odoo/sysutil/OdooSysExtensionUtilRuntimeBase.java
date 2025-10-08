package cn.ibizlab.central.plugin.odoo.sysutil;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModuleModuleDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrUniresDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.service.IIrModuleModuleService;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppIndexView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ITransactionalUtil;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrModelDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.service.IIrModelFieldsService;
import cn.ibizlab.central.plugin.odoo.dataentity.service.IIrModelService;
import cn.ibizlab.central.plugin.odoo.psmodel.util.OdooPSModelRTServiceFactory;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.plugin.extension.sysutil.SysExtensionUtilRuntimeBase;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceFactory;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;

public abstract class OdooSysExtensionUtilRuntimeBase extends SysExtensionUtilRuntimeBase
        implements IOdooSysExtensionUtilRuntime {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(OdooSysExtensionUtilRuntimeBase.class);

    private final static OdooPSModelRTServiceFactory DefaultPSModelRTServiceFactory = new OdooPSModelRTServiceFactory();


    @Autowired
    private IIrModelService irModelService;

    @Autowired
    private IIrModelFieldsService irModelFieldsService;

    @Autowired
    private IIrModuleModuleService irModuleModuleService;

    @Override
    protected void onInstall() throws Exception {
        super.onInstall();

        this.prepareIrModels(this.getSystemRuntime());
    }

    protected void prepareIrModels(ISystemRuntime iSystemRuntime) throws Exception {
        try {
            this.getSystemRuntime().executeUserContextAction(new IAction() {
                @Override
                public Object execute(Object[] args) throws Throwable {
                    onPrepareIrModels(iSystemRuntime);
                    return null;
                }
            }, null);

        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            throw new Exception(String.format("准备IrModel发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    protected void onPrepareIrModels(ISystemRuntime iSystemRuntime) throws Throwable {
        IPSSystem iPSSystem = iSystemRuntime.getPSSystem();
        // 要考虑多节点同时准备得情况
        List<IPSDataEntity> psDataEntityList = iPSSystem.getAllPSDataEntities();
        if (!ObjectUtils.isEmpty(psDataEntityList)) {
            SearchContextDTO searchContextDTO = new SearchContextDTO().all().count(false);
            Map<String, IrModelDTO> irModelDTOMap = new HashMap<String, IrModelDTO>();
            List<IrModelDTO> irModelDTOlist = irModelService.rawSelect(searchContextDTO);
            if (!ObjectUtils.isEmpty(irModelDTOlist)) {
                for (IrModelDTO irModelDTO : irModelDTOlist) {
                    irModelDTOMap.put(irModelDTO.getId(), irModelDTO);
                }
            }

            for (IPSDataEntity iPSDataEntity : psDataEntityList) {
                String strIrModelId = PSModelUtils.calcFullUniqueTag2(iPSDataEntity);
                if (irModelDTOMap.containsKey(strIrModelId)) {
                    continue;
                }

                IrModelDTO irModelDTO = new IrModelDTO();
                irModelDTO.setId(strIrModelId);
                irModelDTO.setModel(iPSDataEntity.getName());
                irModelDTO.setName(iPSDataEntity.getLogicName());
                if(StringUtils.hasLength(iPSDataEntity.getMemo())) {
                    irModelDTO.setInfo(iPSDataEntity.getMemo());
                }

                try {
                    this.irModelService.create(irModelDTO);
                    irModelDTOMap.put(strIrModelId, irModelDTO);
                } catch (Throwable ex) {
                    ex = ExceptionUtils.unwrapThrowable(ex);
                    log.error(String.format("建立ir_model[%1$s]发生异常，%2$s", strIrModelId, ex.getMessage()));
                }
            }
        }
    }

    @Override
    protected ISystemRuntime registerSystemMergenceSystemRuntime(ISystemRuntime iSystemRuntime, V2SystemMerge v2SystemMerge, IPSSystemService iPSSystemService, DeploySystem deploySystem) throws Throwable {
        Throwable error = null;
        ISystemRuntime ret = null;
        try {
            ret = super.registerSystemMergenceSystemRuntime(iSystemRuntime, v2SystemMerge, iPSSystemService, deploySystem);
            return ret;
        }catch (Throwable ex) {
            error = ExceptionUtils.unwrapThrowable(ex);
            log.error(error);
            //throw error;
            return null;
        }
        finally {
            if(ret != null) {
                try {
                    prepareIrModels(ret);
                }
                catch (Throwable ex) {
                    log.error(ex);
                }
            }
        }
    }

    @Override
    protected PSModelRTServiceFactory getPSModelRTServiceFactory(ISystemRuntime iSystemRuntime) throws Throwable {
        return DefaultPSModelRTServiceFactory;
    }

    @Override
    protected void onReloadSystemMergences(ISystemRuntime iSystemRuntime, String strSystemId) throws Throwable {
        super.onReloadSystemMergences(iSystemRuntime, strSystemId);
        prepareIrModuleModule(iSystemRuntime);
    }

    protected void prepareIrModuleModule(ISystemRuntime iSystemRuntime) throws Exception {
        try {
            this.getSystemRuntime().executeUserContextAction(new IAction() {
                @Override
                public Object execute(Object[] args) throws Throwable {
                    onPrepareIrModuleModule(iSystemRuntime);
                    return null;
                }
            }, null);

        } catch (Throwable ex) {
            ex = ExceptionUtils.unwrapThrowable(ex);
            throw new Exception(String.format("准备IrModuleModule发生异常，%1$s", ex.getMessage()), ex);
        }
    }

    protected void onPrepareIrModuleModule(ISystemRuntime iSystemRuntime) throws Throwable {
        Map<String,IrModuleModuleDTO> lastModuleMap = new HashMap<>();
        SearchContextDTO searchContextDTO = new SearchContextDTO().all().count(false);
        List<IrModuleModuleDTO> irModuleModuleDTOs = irModuleModuleService.rawSelect(searchContextDTO);
        if(irModuleModuleDTOs != null && irModuleModuleDTOs.size() > 0) {
            for(IrModuleModuleDTO irModuleModuleDTO : irModuleModuleDTOs) {
                String unionTag = String.format("%1$s_%2$s", irModuleModuleDTO.getAppId(), irModuleModuleDTO.getUrl());
                lastModuleMap.put(unionTag,irModuleModuleDTO);
            }
        }
        IServiceSystemRuntime iServiceSystemRuntime2 = null;
        if(iSystemRuntime instanceof IServiceSystemRuntime) {
            iServiceSystemRuntime2 = (IServiceSystemRuntime)iSystemRuntime;
        }
        ArrayList<IrModuleModuleDTO>  loadModuleDTOs  = new ArrayList<>();
        String hubAppCodeName = "hubapp";
        for(IPSApplication app : this.getSystemRuntime().getPSSystem().getAllPSApps()) {
            if(!PSModelEnums.AppMode.CLOUDHUBAPP.value.equals(app.getAppMode())){
                continue;
            }
            hubAppCodeName = app.getCodeName();
            for( IPSAppView view : app.getAllPSAppViews()){
                if (view instanceof IPSAppIndexView) {
					if(((IPSAppIndexView) view).isBlankMode()){
						continue;
					}
                    IPSAppIndexView indexView = (IPSAppIndexView) view;
                    IrModuleModuleDTO originModuleDTO = new IrModuleModuleDTO();
                    originModuleDTO.setUrl(indexView.getCodeName());
                    originModuleDTO.setName(indexView.getName());
                    originModuleDTO.setDisplayName(indexView.getCaption());
                    originModuleDTO.setApplication(1);
                    originModuleDTO.setState("installed");
                    if(indexView.getUserTag4() != null){
                        originModuleDTO.setOrder(Integer.valueOf(indexView.getUserTag4()));
                    }else {
                        originModuleDTO.setOrder(100);
                    }
                    originModuleDTO.setAppId(String.format("%1$s__%2$s", iSystemRuntime.getDeploySystemId(), hubAppCodeName));
                    loadModuleDTOs.add(originModuleDTO);
                }
            }
        }
        //查询已存在应用权限资源
        List<IrUniresDTO>  curUniresDTOs  = new ArrayList<>();
        IDataEntityRuntime uniResRuntime = this.getSystemRuntime().getDataEntityRuntime("IR_UNIRES");
        ISearchContextDTO uniResSearchContextDTO = uniResRuntime.createSearchContext().all().count(false);
        List<IEntityDTO> lastUniresDTOs  = uniResRuntime.select(uniResSearchContextDTO);
        Map<String,IrUniresDTO> lastUniresMap = new HashMap<>();
        if(lastUniresDTOs != null && lastUniresDTOs.size() > 0) {
            for(IEntityDTO item : lastUniresDTOs) {
                IrUniresDTO lastUniresDTO = new IrUniresDTO();
                lastUniresDTO.reload(item,true);
                String unionTag = String.format("%1$s", lastUniresDTO.getResCode());
                lastUniresMap.put(unionTag,lastUniresDTO);
            }
        }

        Collection<IExtensionSysRefRuntime> iExtensionSysRefRuntimes = iServiceSystemRuntime2.getExtensionSysRefRuntimes(true);
        for(IExtensionSysRefRuntime iExtensionSysRefRuntime:iExtensionSysRefRuntimes){
            for(IPSApplication app : iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps()) {
                if(!(PSModelEnums.AppMode.CLOUDHUBSUBAPP.value.equals(app.getAppMode())||PSModelEnums.AppMode.CLOUDHUBSUBAPP_EMBEDED.value.equals(app.getAppMode()))){
                    continue;
                }
                //构造应用资源
                if(app.getSubAppAccessKey()!=null){
                    IrUniresDTO uniresDTO = new IrUniresDTO();
                    uniresDTO.setResCode(app.getSubAppAccessKey());
                    uniresDTO.setName(String.format("%1$s_%2$s", app.getCodeName(), app.getName()));
                    uniresDTO.setDisplayName(String.format("%1$s_%2$s", app.getCodeName(), app.getName()));
                    curUniresDTOs.add(uniresDTO);
                }
                for( IPSAppView view : app.getAllPSAppViews()){
                    if (view instanceof IPSAppIndexView) {
						if(((IPSAppIndexView) view).isBlankMode()){
							continue;
						}
                        IPSAppIndexView indexView = (IPSAppIndexView) view;
                        IrModuleModuleDTO ExtensionModuleDTO = new IrModuleModuleDTO();
                        ExtensionModuleDTO.setUrl(indexView.getCodeName());
                        ExtensionModuleDTO.setName(indexView.getName());
                        ExtensionModuleDTO.setDisplayName(indexView.getCaption());
                        ExtensionModuleDTO.setApplication(1);
                        ExtensionModuleDTO.setState("installed");
						if(app.getSubAppAccessKey()!=null) {
							ExtensionModuleDTO.set("res_code", app.getSubAppAccessKey());
						}
                        if(indexView.getUserTag4() != null){
                            ExtensionModuleDTO.setOrder(Integer.valueOf(indexView.getUserTag4()));
                        }else {
                            ExtensionModuleDTO.setOrder(100);
                        }
                        ExtensionModuleDTO.setAppId(String.format("%1$s__%2$s", hubAppCodeName, app.getCodeName()));
                        loadModuleDTOs.add(ExtensionModuleDTO);
                    }
                }
            }
        }
        //用unionTag作为唯一标识判断lastModuleMap与当前loadModuleDTOs的差异分别生成createModuleDTOs和updateModuleDTOs
        ArrayList<IrModuleModuleDTO> createModuleDTOs = new ArrayList<>();
        ArrayList<IrModuleModuleDTO> updateModuleDTOs = new ArrayList<>();
        for (IrModuleModuleDTO loadModuleDTO : loadModuleDTOs) {
            String unionTag = String.format("%1$s_%2$s", loadModuleDTO.getAppId(), loadModuleDTO.getUrl());
            IrModuleModuleDTO lastModuleDTO = lastModuleMap.get(unionTag);
            if(lastModuleDTO == null){
                irModuleModuleService.fillEntityKeyValue(loadModuleDTO);
                createModuleDTOs.add(loadModuleDTO);
            }else{
                if(!lastModuleDTO.getState().equals(loadModuleDTO.getState())){
                    lastModuleDTO.setState("installed");
                    updateModuleDTOs.add(lastModuleDTO);
                }
                lastModuleMap.remove(unionTag);
            }
        }
        if(!ObjectUtils.isEmpty(lastModuleMap)){
            for (IrModuleModuleDTO lastModuleDTO : lastModuleMap.values()) {
                lastModuleDTO.setState("uninstalled");
                updateModuleDTOs.add(lastModuleDTO);
            }
        }
        if(ObjectUtils.isEmpty(createModuleDTOs)&& ObjectUtils.isEmpty(updateModuleDTOs)){
            return;
        }
        UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
        irModuleModuleService.rawExecute(new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                if ( !ObjectUtils.isEmpty ( createModuleDTOs ) ) {
                    irModuleModuleService.rawCreate(createModuleDTOs, true);
                }
                if ( !ObjectUtils.isEmpty ( updateModuleDTOs ) ) {
                    irModuleModuleService.rawUpdate(updateModuleDTOs, true);
                }
                return null;
            }
        }, null, ITransactionalUtil.PROPAGATION_REQUIRED);

        //建立默认应用权限资源
        ArrayList<IrUniresDTO> createUniResDTOs = new ArrayList<>();
        for (IrUniresDTO uniresDTO : curUniresDTOs) {
            String unionTag = String.format("%1$s", uniresDTO.getResCode());
            IrUniresDTO lastUniresDTO = lastUniresMap.get(unionTag);
            if(lastUniresDTO == null){
                uniResRuntime.fillEntityKeyValue(uniresDTO);
                createUniResDTOs.add(uniresDTO);
            }
        }
        uniResRuntime.execute(new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                if ( !ObjectUtils.isEmpty ( createUniResDTOs ) ) {
                    uniResRuntime.rawCreate(createUniResDTOs, true);
                }
                return null;
            }
        }, null, ITransactionalUtil.PROPAGATION_REQUIRED);
    }
}
