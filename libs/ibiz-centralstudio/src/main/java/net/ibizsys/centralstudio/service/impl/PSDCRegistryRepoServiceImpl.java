package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCRegistryRepoServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCRegistryRepoService{

    @Override
    public PSDCRegistryRepoDTO create(PSDCRegistryRepoDTO arg) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executePost("/psdevcenters/{psdevcenter}/psdcregistryrepos", arg, PSDCRegistryRepoDTO.class);
        }
        return this.executePost("/psdcregistryrepos", arg, PSDCRegistryRepoDTO.class);
    }

    @Override
    public PSDCRegistryRepoDTO get(String arg) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executeGet("/psdevcenters/{psdevcenter}/psdcregistryrepos/{key}", arg, PSDCRegistryRepoDTO.class);
        }
        return this.executeGet("/psdcregistryrepos/{key}", arg, PSDCRegistryRepoDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevcenter")){
            this.executeDelete("/psdevcenters/{psdevcenter}/psdcregistryrepos/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdcregistryrepos/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCRegistryRepoDTO update(PSDCRegistryRepoDTO arg) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executePut("/psdevcenters/{psdevcenter}/psdcregistryrepos/{key}", arg, PSDCRegistryRepoDTO.class);
        }
        return this.executePut("/psdcregistryrepos/{key}", arg, PSDCRegistryRepoDTO.class);
    }

    @Override
    public Integer checkKey(PSDCRegistryRepoDTO arg) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executePost("/psdevcenters/{psdevcenter}/psdcregistryrepos/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdcregistryrepos/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCRegistryRepoDTO getDraft(PSDCRegistryRepoDTO arg) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executeGet("/psdevcenters/{psdevcenter}/psdcregistryrepos/getdraft", arg, PSDCRegistryRepoDTO.class);
        }
        return this.executeGet("/psdcregistryrepos/getdraft", arg, PSDCRegistryRepoDTO.class);
    }

    @Override
    public Page<PSDCRegistryRepoDTO> fetchCurDC(PSDCRegistryRepoFilter filter) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executeFetch("/psdevcenters/{psdevcenter}/psdcregistryrepos/fetchcurdc", filter, PSDCRegistryRepoDTO.class);
        }

        return this.executeFetch("/psdcregistryrepos/fetchcurdc", filter, PSDCRegistryRepoDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryRepoDTO> fetchDefault(PSDCRegistryRepoFilter filter) throws Throwable{

        if(containsContext("psdevcenter")){
            return this.executeFetch("/psdevcenters/{psdevcenter}/psdcregistryrepos/fetchdefault", filter, PSDCRegistryRepoDTO.class);
        }

        return this.executeFetch("/psdcregistryrepos/fetchdefault", filter, PSDCRegistryRepoDTO.class);
    }
    
}