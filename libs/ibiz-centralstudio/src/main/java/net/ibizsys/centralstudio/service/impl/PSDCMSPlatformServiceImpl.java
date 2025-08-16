package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCMSPlatformServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCMSPlatformService{

    @Override
    public PSDCMSPlatformDTO create(PSDCMSPlatformDTO arg) throws Throwable{
        return this.executePost("/psdcmsplatforms", arg, PSDCMSPlatformDTO.class);
    }

    @Override
    public PSDCMSPlatformDTO get(String arg) throws Throwable{
        return this.executeGet("/psdcmsplatforms/{key}", arg, PSDCMSPlatformDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdcmsplatforms/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCMSPlatformDTO update(PSDCMSPlatformDTO arg) throws Throwable{
        return this.executePut("/psdcmsplatforms/{key}", arg, PSDCMSPlatformDTO.class);
    }

    @Override
    public Integer checkKey(PSDCMSPlatformDTO arg) throws Throwable{
        return this.executePost("/psdcmsplatforms/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCMSPlatformDTO getDraft(PSDCMSPlatformDTO arg) throws Throwable{
        return this.executeGet("/psdcmsplatforms/getdraft", arg, PSDCMSPlatformDTO.class);
    }

    @Override
    public void pubConfig(PSDCMSPlatformDTO arg) throws Throwable{
        this.executePost("/psdcmsplatforms/{key}/pubconfig", arg, String.class);
        return;
    }

    @Override
    public Page<PSDCMSPlatformDTO> fetchCurDC(PSDCMSPlatformFilter filter) throws Throwable{

        return this.executeFetch("/psdcmsplatforms/fetchcurdc", filter, PSDCMSPlatformDTO.class);
    }
    
    @Override
    public Page<PSDCMSPlatformDTO> fetchCurSln(PSDCMSPlatformFilter filter) throws Throwable{

        return this.executeFetch("/psdcmsplatforms/fetchcursln", filter, PSDCMSPlatformDTO.class);
    }
    
    @Override
    public Page<PSDCMSPlatformDTO> fetchDefault(PSDCMSPlatformFilter filter) throws Throwable{

        return this.executeFetch("/psdcmsplatforms/fetchdefault", filter, PSDCMSPlatformDTO.class);
    }
    
}