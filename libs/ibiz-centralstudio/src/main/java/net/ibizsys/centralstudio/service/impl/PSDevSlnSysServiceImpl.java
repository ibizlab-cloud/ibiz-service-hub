package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnSysServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnSysService{

    @Override
    public PSDevSlnSysDTO create(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys", arg, PSDevSlnSysDTO.class);
        }
        return this.executePost("/psdevslnsys", arg, PSDevSlnSysDTO.class);
    }

    @Override
    public PSDevSlnSysDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{key}", arg, PSDevSlnSysDTO.class);
        }
        return this.executeGet("/psdevslnsys/{key}", arg, PSDevSlnSysDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnsys/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnSysDTO update(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{key}", arg, PSDevSlnSysDTO.class);
        }
        return this.executePut("/psdevslnsys/{key}", arg, PSDevSlnSysDTO.class);
    }

    @Override
    public void addBackupSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addbackupsysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addbackupsysmodeltask", arg, String.class);
        return;
    }

    @Override
    public void addExportSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addexportsysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addexportsysmodeltask", arg, String.class);
        return;
    }

    @Override
    public void addImportSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addimportsysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addimportsysmodeltask", arg, String.class);
        return;
    }

    @Override
    public void addOfflineSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addofflinesysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addofflinesysmodeltask", arg, String.class);
        return;
    }

    @Override
    public void addOnlineSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addonlinesysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addonlinesysmodeltask", arg, String.class);
        return;
    }

    @Override
    public void addRestoreSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addrestoresysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addrestoresysmodeltask", arg, String.class);
        return;
    }

    @Override
    public void addUpgrateSysModelTask(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/addupgratesysmodeltask", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/addupgratesysmodeltask", arg, String.class);
        return;
    }

    @Override
    public Integer checkKey(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnsys/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnSysDTO createByModelRepo(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/createbymodelrepo", arg, PSDevSlnSysDTO.class);
        }
        return this.executePost("/psdevslnsys/createbymodelrepo", arg, PSDevSlnSysDTO.class);
    }

    @Override
    public PSDevSlnSysDTO getDraft(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/getdraft", arg, PSDevSlnSysDTO.class);
        }
        return this.executeGet("/psdevslnsys/getdraft", arg, PSDevSlnSysDTO.class);
    }

    @Override
    public PSDevSlnSysDTO getWithAllRepoInfo(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{key}/getwithallrepoinfo", arg, PSDevSlnSysDTO.class);
        }
        return this.executeGet("/psdevslnsys/{key}/getwithallrepoinfo", arg, PSDevSlnSysDTO.class);
    }

    @Override
    public void initSysModel(PSDevSlnSysDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{key}/initsysmodel", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsys/{key}/initsysmodel", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnSysDTO> fetchCurSln(PSDevSlnSysFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/fetchcursln", filter, PSDevSlnSysDTO.class);
        }

        return this.executeFetch("/psdevslnsys/fetchcursln", filter, PSDevSlnSysDTO.class);
    }
    
    @Override
    public Page<PSDevSlnSysDTO> fetchCurSlnTrunk(PSDevSlnSysFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/fetchcurslntrunk", filter, PSDevSlnSysDTO.class);
        }

        return this.executeFetch("/psdevslnsys/fetchcurslntrunk", filter, PSDevSlnSysDTO.class);
    }
    
    @Override
    public Page<PSDevSlnSysDTO> fetchCurSysBranch(PSDevSlnSysFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/fetchcursysbranch", filter, PSDevSlnSysDTO.class);
        }

        return this.executeFetch("/psdevslnsys/fetchcursysbranch", filter, PSDevSlnSysDTO.class);
    }
    
    @Override
    public Page<PSDevSlnSysDTO> fetchCurUser(PSDevSlnSysFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/fetchcuruser", filter, PSDevSlnSysDTO.class);
        }

        return this.executeFetch("/psdevslnsys/fetchcuruser", filter, PSDevSlnSysDTO.class);
    }
    
    @Override
    public Page<PSDevSlnSysDTO> fetchCurUserTrunk(PSDevSlnSysFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/fetchcurusertrunk", filter, PSDevSlnSysDTO.class);
        }

        return this.executeFetch("/psdevslnsys/fetchcurusertrunk", filter, PSDevSlnSysDTO.class);
    }
    
}