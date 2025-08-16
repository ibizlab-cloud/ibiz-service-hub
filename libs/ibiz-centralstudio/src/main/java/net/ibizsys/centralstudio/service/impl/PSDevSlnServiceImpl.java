package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevSlnServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevSlnService{

    @Override
    public PSDevSlnDTO create(PSDevSlnDTO arg) throws Throwable{
        return this.executePost("/psdevslns", arg, PSDevSlnDTO.class);
    }

    @Override
    public PSDevSlnDTO get(String arg) throws Throwable{
        return this.executeGet("/psdevslns/{key}", arg, PSDevSlnDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdevslns/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevSlnDTO update(PSDevSlnDTO arg) throws Throwable{
        return this.executePut("/psdevslns/{key}", arg, PSDevSlnDTO.class);
    }

    @Override
    public Integer checkKey(PSDevSlnDTO arg) throws Throwable{
        return this.executePost("/psdevslns/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevSlnDTO getDraft(PSDevSlnDTO arg) throws Throwable{
        return this.executeGet("/psdevslns/getdraft", arg, PSDevSlnDTO.class);
    }

    @Override
    public void pubMSDConfig(PSDevSlnDTO arg) throws Throwable{
        this.executePost("/psdevslns/{key}/pubmsdconfig", arg, String.class);
        return;
    }

    @Override
    public Page<PSDevSlnDTO> fetchCurDC(PSDevSlnFilter filter) throws Throwable{

        return this.executeFetch("/psdevslns/fetchcurdc", filter, PSDevSlnDTO.class);
    }
    
    @Override
    public Page<PSDevSlnDTO> fetchCurDCSLNUser(PSDevSlnFilter filter) throws Throwable{

        return this.executeFetch("/psdevslns/fetchcurdcslnuser", filter, PSDevSlnDTO.class);
    }
    
}