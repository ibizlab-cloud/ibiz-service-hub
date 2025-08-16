package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnSysAppServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnSysAppService{

    @Override
    public PSDevSlnSysAppDTO create(PSDevSlnSysAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsysapps", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapps", arg, PSDevSlnSysAppDTO.class);
        }
        return this.executePost("/psdevslnsysapps", arg, PSDevSlnSysAppDTO.class);
    }

    @Override
    public PSDevSlnSysAppDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
        }
        return this.executeGet("/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsysapps/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executeDelete("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnsysapps/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnSysAppDTO update(PSDevSlnSysAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePut("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
        }
        return this.executePut("/psdevslnsysapps/{key}", arg, PSDevSlnSysAppDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnSysAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsysapps/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnsysapps/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnSysAppDTO getDraft(PSDevSlnSysAppDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/getdraft", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsysapps/getdraft", arg, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/getdraft", arg, PSDevSlnSysAppDTO.class);
        }
        return this.executeGet("/psdevslnsysapps/getdraft", arg, PSDevSlnSysAppDTO.class);
    }

    @Override
    public Page<PSDevSlnSysAppDTO> fetchCurUser(PSDevSlnSysAppFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/fetchcuruser", filter, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsysapps/fetchcuruser", filter, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/fetchcuruser", filter, PSDevSlnSysAppDTO.class);
        }

        return this.executeFetch("/psdevslnsysapps/fetchcuruser", filter, PSDevSlnSysAppDTO.class);
    }
    
    @Override
    public Page<PSDevSlnSysAppDTO> fetchDefault(PSDevSlnSysAppFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapps/fetchdefault", filter, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsysapps/fetchdefault", filter, PSDevSlnSysAppDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsysapps/fetchdefault", filter, PSDevSlnSysAppDTO.class);
        }

        return this.executeFetch("/psdevslnsysapps/fetchdefault", filter, PSDevSlnSysAppDTO.class);
    }
    
}