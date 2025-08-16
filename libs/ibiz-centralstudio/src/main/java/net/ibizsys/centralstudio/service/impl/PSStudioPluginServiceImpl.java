package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSStudioPluginServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSStudioPluginService{

    @Override
    public PSStudioPluginDTO create(PSStudioPluginDTO arg) throws Throwable{
        return this.executePost("/psstudioplugins", arg, PSStudioPluginDTO.class);
    }

    @Override
    public PSStudioPluginDTO get(String arg) throws Throwable{
        return this.executeGet("/psstudioplugins/{key}", arg, PSStudioPluginDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psstudioplugins/{key}", arg, String.class);
        return;
    }

    @Override
    public PSStudioPluginDTO update(PSStudioPluginDTO arg) throws Throwable{
        return this.executePut("/psstudioplugins/{key}", arg, PSStudioPluginDTO.class);
    }

    @Override
    public Integer checkKey(PSStudioPluginDTO arg) throws Throwable{
        return this.executePost("/psstudioplugins/checkkey", arg, Integer.class);
    }

    @Override
    public PSStudioPluginDTO getDraft(PSStudioPluginDTO arg) throws Throwable{
        return this.executeGet("/psstudioplugins/getdraft", arg, PSStudioPluginDTO.class);
    }

    @Override
    public Page<PSStudioPluginDTO> fetchCurDCAllValid(PSStudioPluginFilter filter) throws Throwable{

        return this.executeFetch("/psstudioplugins/fetchcurdcallvalid", filter, PSStudioPluginDTO.class);
    }
    
    @Override
    public Page<PSStudioPluginDTO> fetchCurDCValid(PSStudioPluginFilter filter) throws Throwable{

        return this.executeFetch("/psstudioplugins/fetchcurdcvalid", filter, PSStudioPluginDTO.class);
    }
    
    @Override
    public Page<PSStudioPluginDTO> fetchDefault(PSStudioPluginFilter filter) throws Throwable{

        return this.executeFetch("/psstudioplugins/fetchdefault", filter, PSStudioPluginDTO.class);
    }
    
    @Override
    public Page<PSStudioPluginDTO> fetchValid(PSStudioPluginFilter filter) throws Throwable{

        return this.executeFetch("/psstudioplugins/fetchvalid", filter, PSStudioPluginDTO.class);
    }
    
}