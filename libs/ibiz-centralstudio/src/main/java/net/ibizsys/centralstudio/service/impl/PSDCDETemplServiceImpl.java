package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCDETemplServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCDETemplService{

    @Override
    public PSDCDETemplDTO create(PSDCDETemplDTO arg) throws Throwable{
        return this.executePost("/psdcdetempls", arg, PSDCDETemplDTO.class);
    }

    @Override
    public PSDCDETemplDTO get(String arg) throws Throwable{
        return this.executeGet("/psdcdetempls/{key}", arg, PSDCDETemplDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdcdetempls/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCDETemplDTO update(PSDCDETemplDTO arg) throws Throwable{
        return this.executePut("/psdcdetempls/{key}", arg, PSDCDETemplDTO.class);
    }

    @Override
    public Integer checkKey(PSDCDETemplDTO arg) throws Throwable{
        return this.executePost("/psdcdetempls/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCDETemplDTO getDraft(PSDCDETemplDTO arg) throws Throwable{
        return this.executeGet("/psdcdetempls/getdraft", arg, PSDCDETemplDTO.class);
    }

    @Override
    public Page<PSDCDETemplDTO> fetchDefault(PSDCDETemplFilter filter) throws Throwable{

        return this.executeFetch("/psdcdetempls/fetchdefault", filter, PSDCDETemplDTO.class);
    }
    
}