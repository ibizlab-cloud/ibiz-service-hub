package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnSysSrvServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnSysSrvService{

    @Override
    public PSDevSlnSysSrvDTO create(PSDevSlnSysSrvDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs", arg, PSDevSlnSysSrvDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs", arg, PSDevSlnSysSrvDTO.class);
        }
        return this.executePost("/psdevslnsyssrvs", arg, PSDevSlnSysSrvDTO.class);
    }

    @Override
    public PSDevSlnSysSrvDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/{key}", arg, PSDevSlnSysSrvDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/{key}", arg, PSDevSlnSysSrvDTO.class);
        }
        return this.executeGet("/psdevslnsyssrvs/{key}", arg, PSDevSlnSysSrvDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executeDelete("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnsyssrvs/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnSysSrvDTO update(PSDevSlnSysSrvDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/{key}", arg, PSDevSlnSysSrvDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePut("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/{key}", arg, PSDevSlnSysSrvDTO.class);
        }
        return this.executePut("/psdevslnsyssrvs/{key}", arg, PSDevSlnSysSrvDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnSysSrvDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnsyssrvs/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnSysSrvDTO getDraft(PSDevSlnSysSrvDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/getdraft", arg, PSDevSlnSysSrvDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/getdraft", arg, PSDevSlnSysSrvDTO.class);
        }
        return this.executeGet("/psdevslnsyssrvs/getdraft", arg, PSDevSlnSysSrvDTO.class);
    }

    @Override
    public Page<PSDevSlnSysSrvDTO> fetchDefault(PSDevSlnSysSrvFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/fetchdefault", filter, PSDevSlnSysSrvDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsyssrvs/fetchdefault", filter, PSDevSlnSysSrvDTO.class);
        }

        return this.executeFetch("/psdevslnsyssrvs/fetchdefault", filter, PSDevSlnSysSrvDTO.class);
    }
    
}