package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnSysAPIServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnSysAPIService{

    @Override
    public PSDevSlnSysAPIDTO create(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsysapis", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapis", arg, PSDevSlnSysAPIDTO.class);
        }
        return this.executePost("/psdevslnsysapis", arg, PSDevSlnSysAPIDTO.class);
    }

    @Override
    public PSDevSlnSysAPIDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
        }
        return this.executeGet("/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsysapis/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executeDelete("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnsysapis/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnSysAPIDTO update(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePut("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
        }
        return this.executePut("/psdevslnsysapis/{key}", arg, PSDevSlnSysAPIDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevsln")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsysapis/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnsysapis/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnSysAPIDTO getDraft(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/getdraft", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsysapis/getdraft", arg, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/getdraft", arg, PSDevSlnSysAPIDTO.class);
        }
        return this.executeGet("/psdevslnsysapis/getdraft", arg, PSDevSlnSysAPIDTO.class);
    }

    @Override
    public void initTestProjects(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}/inittestprojects", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsysapis/{key}/inittestprojects", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}/inittestprojects", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsysapis/{key}/inittestprojects", arg, String.class);
        return;
    }

    @Override
    public void runModelTestProject(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}/runmodeltestproject", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsysapis/{key}/runmodeltestproject", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}/runmodeltestproject", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsysapis/{key}/runmodeltestproject", arg, String.class);
        return;
    }

    @Override
    public void runUnitTestProject(PSDevSlnSysAPIDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}/rununittestproject", arg, String.class);
            return;
        }

        if(containsContext("psdevsln")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsysapis/{key}/rununittestproject", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/{key}/rununittestproject", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsysapis/{key}/rununittestproject", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnSysAPIDTO> fetchCurUser(PSDevSlnSysAPIFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/fetchcuruser", filter, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsysapis/fetchcuruser", filter, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/fetchcuruser", filter, PSDevSlnSysAPIDTO.class);
        }

        return this.executeFetch("/psdevslnsysapis/fetchcuruser", filter, PSDevSlnSysAPIDTO.class);
    }
    
    @Override
    public Page<PSDevSlnSysAPIDTO> fetchDefault(PSDevSlnSysAPIFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysapis/fetchdefault", filter, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevsln")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsysapis/fetchdefault", filter, PSDevSlnSysAPIDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsysapis/fetchdefault", filter, PSDevSlnSysAPIDTO.class);
        }

        return this.executeFetch("/psdevslnsysapis/fetchdefault", filter, PSDevSlnSysAPIDTO.class);
    }
    
}