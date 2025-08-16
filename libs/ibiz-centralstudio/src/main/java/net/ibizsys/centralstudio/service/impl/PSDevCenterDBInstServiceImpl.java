package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevCenterDBInstServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevCenterDBInstService{

    @Override
    public PSDevCenterDBInstDTO create(PSDevCenterDBInstDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevcenterdbinsts", arg, PSDevCenterDBInstDTO.class);
        }
        return this.executePost("/psdevcenterdbinsts", arg, PSDevCenterDBInstDTO.class);
    }

    @Override
    public PSDevCenterDBInstDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevcenterdbinsts/{key}", arg, PSDevCenterDBInstDTO.class);
        }
        return this.executeGet("/psdevcenterdbinsts/{key}", arg, PSDevCenterDBInstDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevcenterdbinsts/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevcenterdbinsts/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevCenterDBInstDTO update(PSDevCenterDBInstDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevcenterdbinsts/{key}", arg, PSDevCenterDBInstDTO.class);
        }
        return this.executePut("/psdevcenterdbinsts/{key}", arg, PSDevCenterDBInstDTO.class);
    }

    @Override
    public Integer checkKey(PSDevCenterDBInstDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevcenterdbinsts/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevcenterdbinsts/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevCenterDBInstDTO getDraft(PSDevCenterDBInstDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevcenterdbinsts/getdraft", arg, PSDevCenterDBInstDTO.class);
        }
        return this.executeGet("/psdevcenterdbinsts/getdraft", arg, PSDevCenterDBInstDTO.class);
    }

    @Override
    public void syncDBScheme(PSDevCenterDBInstDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevcenterdbinsts/{key}/syncdbscheme", arg, String.class);
            return;
        }
        this.executePost("/psdevcenterdbinsts/{key}/syncdbscheme", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevCenterDBInstDTO> fetchCurDC(PSDevCenterDBInstFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcenterdbinsts/fetchcurdc", filter, PSDevCenterDBInstDTO.class);
        }

        return this.executeFetch("/psdevcenterdbinsts/fetchcurdc", filter, PSDevCenterDBInstDTO.class);
    }
    
    @Override
    public Page<PSDevCenterDBInstDTO> fetchCurSln(PSDevCenterDBInstFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcenterdbinsts/fetchcursln", filter, PSDevCenterDBInstDTO.class);
        }

        return this.executeFetch("/psdevcenterdbinsts/fetchcursln", filter, PSDevCenterDBInstDTO.class);
    }
    
    @Override
    public Page<PSDevCenterDBInstDTO> fetchDefault(PSDevCenterDBInstFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcenterdbinsts/fetchdefault", filter, PSDevCenterDBInstDTO.class);
        }

        return this.executeFetch("/psdevcenterdbinsts/fetchdefault", filter, PSDevCenterDBInstDTO.class);
    }
    
}