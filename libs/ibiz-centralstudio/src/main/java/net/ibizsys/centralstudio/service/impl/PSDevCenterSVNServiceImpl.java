package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevCenterSVNServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevCenterSVNService{

    @Override
    public PSDevCenterSVNDTO create(PSDevCenterSVNDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevcentersvns", arg, PSDevCenterSVNDTO.class);
        }
        return this.executePost("/psdevcentersvns", arg, PSDevCenterSVNDTO.class);
    }

    @Override
    public PSDevCenterSVNDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevcentersvns/{key}", arg, PSDevCenterSVNDTO.class);
        }
        return this.executeGet("/psdevcentersvns/{key}", arg, PSDevCenterSVNDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevcentersvns/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevcentersvns/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevCenterSVNDTO update(PSDevCenterSVNDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevcentersvns/{key}", arg, PSDevCenterSVNDTO.class);
        }
        return this.executePut("/psdevcentersvns/{key}", arg, PSDevCenterSVNDTO.class);
    }

    @Override
    public Integer checkKey(PSDevCenterSVNDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevcentersvns/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevcentersvns/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevCenterSVNDTO getDraft(PSDevCenterSVNDTO arg) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevcentersvns/getdraft", arg, PSDevCenterSVNDTO.class);
        }
        return this.executeGet("/psdevcentersvns/getdraft", arg, PSDevCenterSVNDTO.class);
    }

    @Override
    public Page<PSDevCenterSVNDTO> fetchCurDC(PSDevCenterSVNFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcentersvns/fetchcurdc", filter, PSDevCenterSVNDTO.class);
        }

        return this.executeFetch("/psdevcentersvns/fetchcurdc", filter, PSDevCenterSVNDTO.class);
    }
    
    @Override
    public Page<PSDevCenterSVNDTO> fetchCurDC2(PSDevCenterSVNFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcentersvns/fetchcurdc2", filter, PSDevCenterSVNDTO.class);
        }

        return this.executeFetch("/psdevcentersvns/fetchcurdc2", filter, PSDevCenterSVNDTO.class);
    }
    
    @Override
    public Page<PSDevCenterSVNDTO> fetchCurSln(PSDevCenterSVNFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcentersvns/fetchcursln", filter, PSDevCenterSVNDTO.class);
        }

        return this.executeFetch("/psdevcentersvns/fetchcursln", filter, PSDevCenterSVNDTO.class);
    }
    
    @Override
    public Page<PSDevCenterSVNDTO> fetchCurSln2(PSDevCenterSVNFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcentersvns/fetchcursln2", filter, PSDevCenterSVNDTO.class);
        }

        return this.executeFetch("/psdevcentersvns/fetchcursln2", filter, PSDevCenterSVNDTO.class);
    }
    
    @Override
    public Page<PSDevCenterSVNDTO> fetchDefault(PSDevCenterSVNFilter filter) throws Throwable{

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevcentersvns/fetchdefault", filter, PSDevCenterSVNDTO.class);
        }

        return this.executeFetch("/psdevcentersvns/fetchdefault", filter, PSDevCenterSVNDTO.class);
    }
    
}