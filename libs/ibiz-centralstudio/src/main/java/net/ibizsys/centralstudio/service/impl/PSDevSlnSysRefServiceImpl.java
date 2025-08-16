package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnSysRefServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnSysRefService{

    @Override
    public PSDevSlnSysRefDTO create(PSDevSlnSysRefDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs", arg, PSDevSlnSysRefDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs", arg, PSDevSlnSysRefDTO.class);
        }
        return this.executePost("/psdevslnsysrefs", arg, PSDevSlnSysRefDTO.class);
    }

    @Override
    public PSDevSlnSysRefDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/{key}", arg, PSDevSlnSysRefDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/{key}", arg, PSDevSlnSysRefDTO.class);
        }
        return this.executeGet("/psdevslnsysrefs/{key}", arg, PSDevSlnSysRefDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executeDelete("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnsysrefs/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnSysRefDTO update(PSDevSlnSysRefDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/{key}", arg, PSDevSlnSysRefDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePut("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/{key}", arg, PSDevSlnSysRefDTO.class);
        }
        return this.executePut("/psdevslnsysrefs/{key}", arg, PSDevSlnSysRefDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnSysRefDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnsysrefs/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnSysRefDTO getDraft(PSDevSlnSysRefDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/getdraft", arg, PSDevSlnSysRefDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/getdraft", arg, PSDevSlnSysRefDTO.class);
        }
        return this.executeGet("/psdevslnsysrefs/getdraft", arg, PSDevSlnSysRefDTO.class);
    }

    @Override
    public Page<PSDevSlnSysRefDTO> fetchDefault(PSDevSlnSysRefFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/fetchdefault", filter, PSDevSlnSysRefDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsysrefs/fetchdefault", filter, PSDevSlnSysRefDTO.class);
        }

        return this.executeFetch("/psdevslnsysrefs/fetchdefault", filter, PSDevSlnSysRefDTO.class);
    }
    
}