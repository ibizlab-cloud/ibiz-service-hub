package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnUserServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnUserService{

    @Override
    public PSDevSlnUserDTO create(PSDevSlnUserDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnusers", arg, PSDevSlnUserDTO.class);
        }
        return this.executePost("/psdevslnusers", arg, PSDevSlnUserDTO.class);
    }

    @Override
    public PSDevSlnUserDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnusers/{key}", arg, PSDevSlnUserDTO.class);
        }
        return this.executeGet("/psdevslnusers/{key}", arg, PSDevSlnUserDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnusers/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnusers/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnUserDTO update(PSDevSlnUserDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnusers/{key}", arg, PSDevSlnUserDTO.class);
        }
        return this.executePut("/psdevslnusers/{key}", arg, PSDevSlnUserDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnUserDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnusers/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnusers/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnUserDTO getDraft(PSDevSlnUserDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnusers/getdraft", arg, PSDevSlnUserDTO.class);
        }
        return this.executeGet("/psdevslnusers/getdraft", arg, PSDevSlnUserDTO.class);
    }

    @Override
    public Page<PSDevSlnUserDTO> fetchByDevUser(PSDevSlnUserFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnusers/fetchbydevuser", filter, PSDevSlnUserDTO.class);
        }

        return this.executeFetch("/psdevslnusers/fetchbydevuser", filter, PSDevSlnUserDTO.class);
    }
    
    @Override
    public Page<PSDevSlnUserDTO> fetchCurSln(PSDevSlnUserFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnusers/fetchcursln", filter, PSDevSlnUserDTO.class);
        }

        return this.executeFetch("/psdevslnusers/fetchcursln", filter, PSDevSlnUserDTO.class);
    }
    
    @Override
    public Page<PSDevSlnUserDTO> fetchDefault(PSDevSlnUserFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnusers/fetchdefault", filter, PSDevSlnUserDTO.class);
        }

        return this.executeFetch("/psdevslnusers/fetchdefault", filter, PSDevSlnUserDTO.class);
    }
    
}