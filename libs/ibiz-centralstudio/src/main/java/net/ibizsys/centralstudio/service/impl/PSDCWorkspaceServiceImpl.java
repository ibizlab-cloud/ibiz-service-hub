package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCWorkspaceServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCWorkspaceService{

    @Override
    public PSDCWorkspaceDTO create(PSDCWorkspaceDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdcworkspaces", arg, PSDCWorkspaceDTO.class);
        }
        return this.executePost("/psdcworkspaces", arg, PSDCWorkspaceDTO.class);
    }

    @Override
    public PSDCWorkspaceDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdcworkspaces/{key}", arg, PSDCWorkspaceDTO.class);
        }
        return this.executeGet("/psdcworkspaces/{key}", arg, PSDCWorkspaceDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdcworkspaces/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdcworkspaces/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCWorkspaceDTO update(PSDCWorkspaceDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdcworkspaces/{key}", arg, PSDCWorkspaceDTO.class);
        }
        return this.executePut("/psdcworkspaces/{key}", arg, PSDCWorkspaceDTO.class);
    }

    @Override
    public Integer checkKey(PSDCWorkspaceDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdcworkspaces/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdcworkspaces/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCWorkspaceDTO getDraft(PSDCWorkspaceDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdcworkspaces/getdraft", arg, PSDCWorkspaceDTO.class);
        }
        return this.executeGet("/psdcworkspaces/getdraft", arg, PSDCWorkspaceDTO.class);
    }

    @Override
    public void installSys(PSDCWorkspaceDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdcworkspaces/{key}/installsys", arg, String.class);
            return;
        }
        this.executePost("/psdcworkspaces/{key}/installsys", arg, String.class);
        return;
    }

    @Override
    public PSDCWorkspaceDTO uninstallSys(PSDCWorkspaceDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdcworkspaces/{key}/uninstallsys", arg, PSDCWorkspaceDTO.class);
        }
        return this.executePost("/psdcworkspaces/{key}/uninstallsys", arg, PSDCWorkspaceDTO.class);
    }

    @Override
    public Page<PSDCWorkspaceDTO> fetchCurDC(PSDCWorkspaceFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdcworkspaces/fetchcurdc", filter, PSDCWorkspaceDTO.class);
        }

        return this.executeFetch("/psdcworkspaces/fetchcurdc", filter, PSDCWorkspaceDTO.class);
    }
    
    @Override
    public Page<PSDCWorkspaceDTO> fetchCurSln(PSDCWorkspaceFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdcworkspaces/fetchcursln", filter, PSDCWorkspaceDTO.class);
        }

        return this.executeFetch("/psdcworkspaces/fetchcursln", filter, PSDCWorkspaceDTO.class);
    }
    
    @Override
    public Page<PSDCWorkspaceDTO> fetchDefault(PSDCWorkspaceFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdcworkspaces/fetchdefault", filter, PSDCWorkspaceDTO.class);
        }

        return this.executeFetch("/psdcworkspaces/fetchdefault", filter, PSDCWorkspaceDTO.class);
    }
    
}