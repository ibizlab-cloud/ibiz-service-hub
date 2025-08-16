package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCModelTemplServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCModelTemplService{

    @Override
    public PSDCModelTemplDTO create(PSDCModelTemplDTO arg) throws Throwable{
        return this.executePost("/psdcmodeltempls", arg, PSDCModelTemplDTO.class);
    }

    @Override
    public PSDCModelTemplDTO get(String arg) throws Throwable{
        return this.executeGet("/psdcmodeltempls/{key}", arg, PSDCModelTemplDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdcmodeltempls/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCModelTemplDTO update(PSDCModelTemplDTO arg) throws Throwable{
        return this.executePut("/psdcmodeltempls/{key}", arg, PSDCModelTemplDTO.class);
    }

    @Override
    public Integer checkKey(PSDCModelTemplDTO arg) throws Throwable{
        return this.executePost("/psdcmodeltempls/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCModelTemplDTO getDraft(PSDCModelTemplDTO arg) throws Throwable{
        return this.executeGet("/psdcmodeltempls/getdraft", arg, PSDCModelTemplDTO.class);
    }

    @Override
    public Page<PSDCModelTemplDTO> fetchCurDCAll(PSDCModelTemplFilter filter) throws Throwable{

        return this.executeFetch("/psdcmodeltempls/fetchcurdcall", filter, PSDCModelTemplDTO.class);
    }
    
    @Override
    public Page<PSDCModelTemplDTO> fetchDefault(PSDCModelTemplFilter filter) throws Throwable{

        return this.executeFetch("/psdcmodeltempls/fetchdefault", filter, PSDCModelTemplDTO.class);
    }
    
}