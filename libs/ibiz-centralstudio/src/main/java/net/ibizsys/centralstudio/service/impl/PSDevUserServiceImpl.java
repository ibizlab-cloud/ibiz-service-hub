package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDevUserServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDevUserService{

    @Override
    public PSDevUserDTO create(PSDevUserDTO arg) throws Throwable{
        return this.executePost("/psdevusers", arg, PSDevUserDTO.class);
    }

    @Override
    public PSDevUserDTO get(String arg) throws Throwable{
        return this.executeGet("/psdevusers/{key}", arg, PSDevUserDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdevusers/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDevUserDTO update(PSDevUserDTO arg) throws Throwable{
        return this.executePut("/psdevusers/{key}", arg, PSDevUserDTO.class);
    }

    @Override
    public Integer checkKey(PSDevUserDTO arg) throws Throwable{
        return this.executePost("/psdevusers/checkkey", arg, Integer.class);
    }

    @Override
    public PSDevUserDTO getDraft(PSDevUserDTO arg) throws Throwable{
        return this.executeGet("/psdevusers/getdraft", arg, PSDevUserDTO.class);
    }

    @Override
    public Page<PSDevUserDTO> fetchCurDC(PSDevUserFilter filter) throws Throwable{

        return this.executeFetch("/psdevusers/fetchcurdc", filter, PSDevUserDTO.class);
    }
    
    @Override
    public Page<PSDevUserDTO> fetchDefault(PSDevUserFilter filter) throws Throwable{

        return this.executeFetch("/psdevusers/fetchdefault", filter, PSDevUserDTO.class);
    }
    
}