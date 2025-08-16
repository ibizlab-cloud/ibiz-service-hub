package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnSysBakServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnSysBakService{

    @Override
    public PSDevSlnSysBakDTO create(PSDevSlnSysBakDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks", arg, PSDevSlnSysBakDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks", arg, PSDevSlnSysBakDTO.class);
        }
        return this.executePost("/psdevslnsysbaks", arg, PSDevSlnSysBakDTO.class);
    }

    @Override
    public PSDevSlnSysBakDTO get(String arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}", arg, PSDevSlnSysBakDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}", arg, PSDevSlnSysBakDTO.class);
        }
        return this.executeGet("/psdevslnsysbaks/{key}", arg, PSDevSlnSysBakDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executeDelete("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executeDelete("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}", arg, String.class);
            return;
        }
        this.executeDelete("/psdevslnsysbaks/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnSysBakDTO update(PSDevSlnSysBakDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePut("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}", arg, PSDevSlnSysBakDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePut("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}", arg, PSDevSlnSysBakDTO.class);
        }
        return this.executePut("/psdevslnsysbaks/{key}", arg, PSDevSlnSysBakDTO.class);
    }

    @Override
    public void addRestoreSysModelTask2(PSDevSlnSysBakDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}/addrestoresysmodeltask2", arg, String.class);
            return;
        }

        if(containsContext("psdevslnsys")){
            this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/{key}/addrestoresysmodeltask2", arg, String.class);
            return;
        }
        this.executePost("/psdevslnsysbaks/{key}/addrestoresysmodeltask2", arg, String.class);
        return;
    }

    @Override
    public Integer checkKey(PSDevSlnSysBakDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executePost("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/checkkey", arg, Integer.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executePost("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/checkkey", arg, Integer.class);
        }
        return this.executePost("/psdevslnsysbaks/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnSysBakDTO getDraft(PSDevSlnSysBakDTO arg) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeGet("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/getdraft", arg, PSDevSlnSysBakDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeGet("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/getdraft", arg, PSDevSlnSysBakDTO.class);
        }
        return this.executeGet("/psdevslnsysbaks/getdraft", arg, PSDevSlnSysBakDTO.class);
    }

    @Override
    public Page<PSDevSlnSysBakDTO> fetchDefault(PSDevSlnSysBakFilter filter) throws Throwable{

        if(containsContext("psdevsln")&&containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslns/{psdevsln}/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/fetchdefault", filter, PSDevSlnSysBakDTO.class);
        }

        if(containsContext("psdevslnsys")){
            return this.executeFetch("/psdevslnsys/{psdevslnsys}/psdevslnsysbaks/fetchdefault", filter, PSDevSlnSysBakDTO.class);
        }

        return this.executeFetch("/psdevslnsysbaks/fetchdefault", filter, PSDevSlnSysBakDTO.class);
    }
    
}