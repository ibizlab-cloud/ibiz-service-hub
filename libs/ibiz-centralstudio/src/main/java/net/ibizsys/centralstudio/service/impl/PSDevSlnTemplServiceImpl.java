package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnTemplServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnTemplService{

    @Override
    public PSDevSlnTemplDTO create(PSDevSlnTemplDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslntempls", arg, PSDevSlnTemplDTO.class);
        }
        return this.executePost("/psdevslntempls", arg, PSDevSlnTemplDTO.class);
    }

    @Override
    public PSDevSlnTemplDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslntempls/{key}", arg, PSDevSlnTemplDTO.class);
        }
        return this.executeGet("/psdevslntempls/{key}", arg, PSDevSlnTemplDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslntempls/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslntempls/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnTemplDTO update(PSDevSlnTemplDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslntempls/{key}", arg, PSDevSlnTemplDTO.class);
        }
        return this.executePut("/psdevslntempls/{key}", arg, PSDevSlnTemplDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnTemplDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslntempls/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslntempls/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnTemplDTO getDraft(PSDevSlnTemplDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslntempls/getdraft", arg, PSDevSlnTemplDTO.class);
        }
        return this.executeGet("/psdevslntempls/getdraft", arg, PSDevSlnTemplDTO.class);
    }

    @Override
    public void pubTempl(PSDevSlnTemplDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslntempls/{key}/pubtempl", arg, String.class);
            return;
        }
        this.executePost("/psdevslntempls/{key}/pubtempl", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnTemplDTO> fetchCurSln(PSDevSlnTemplFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslntempls/fetchcursln", filter, PSDevSlnTemplDTO.class);
        }

        return this.executeFetch("/psdevslntempls/fetchcursln", filter, PSDevSlnTemplDTO.class);
    }
    
    @Override
    public Page<PSDevSlnTemplDTO> fetchCurUser(PSDevSlnTemplFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslntempls/fetchcuruser", filter, PSDevSlnTemplDTO.class);
        }

        return this.executeFetch("/psdevslntempls/fetchcuruser", filter, PSDevSlnTemplDTO.class);
    }
    
    @Override
    public Page<PSDevSlnTemplDTO> fetchCurUser3(PSDevSlnTemplFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslntempls/fetchcuruser3", filter, PSDevSlnTemplDTO.class);
        }

        return this.executeFetch("/psdevslntempls/fetchcuruser3", filter, PSDevSlnTemplDTO.class);
    }
    
    @Override
    public Page<PSDevSlnTemplDTO> fetchCurUser4(PSDevSlnTemplFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslntempls/fetchcuruser4", filter, PSDevSlnTemplDTO.class);
        }

        return this.executeFetch("/psdevslntempls/fetchcuruser4", filter, PSDevSlnTemplDTO.class);
    }
    
    @Override
    public Page<PSDevSlnTemplDTO> fetchCurUserAll(PSDevSlnTemplFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslntempls/fetchcuruserall", filter, PSDevSlnTemplDTO.class);
        }

        return this.executeFetch("/psdevslntempls/fetchcuruserall", filter, PSDevSlnTemplDTO.class);
    }
    
}