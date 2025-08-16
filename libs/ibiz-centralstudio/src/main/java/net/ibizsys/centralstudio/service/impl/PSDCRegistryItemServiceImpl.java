package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCRegistryItemServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCRegistryItemService{

    @Override
    public PSDCRegistryItemDTO create(PSDCRegistryItemDTO arg) throws Throwable{
        return this.executePost("/psdcregistryitems", arg, PSDCRegistryItemDTO.class);
    }

    @Override
    public PSDCRegistryItemDTO get(String arg) throws Throwable{
        return this.executeGet("/psdcregistryitems/{key}", arg, PSDCRegistryItemDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdcregistryitems/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCRegistryItemDTO update(PSDCRegistryItemDTO arg) throws Throwable{
        return this.executePut("/psdcregistryitems/{key}", arg, PSDCRegistryItemDTO.class);
    }

    @Override
    public Integer checkKey(PSDCRegistryItemDTO arg) throws Throwable{
        return this.executePost("/psdcregistryitems/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCRegistryItemDTO getDraft(PSDCRegistryItemDTO arg) throws Throwable{
        return this.executeGet("/psdcregistryitems/getdraft", arg, PSDCRegistryItemDTO.class);
    }

    @Override
    public void runImage(PSDCRegistryItemDTO arg) throws Throwable{
        this.executePost("/psdcregistryitems/{key}/runimage", arg, String.class);
        return;
    }

    @Override
    public Page<PSDCRegistryItemDTO> fetchCurDC(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchcurdc", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchCurDC2(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchcurdc2", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchCurDCAndSln(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchcurdcandsln", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchCurDCRunner(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchcurdcrunner", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchCurDCRunner2(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchcurdcrunner2", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchCurSln(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchcursln", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchDefault(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchdefault", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchRunner(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchrunner", filter, PSDCRegistryItemDTO.class);
    }
    
    @Override
    public Page<PSDCRegistryItemDTO> fetchTool(PSDCRegistryItemFilter filter) throws Throwable{

        return this.executeFetch("/psdcregistryitems/fetchtool", filter, PSDCRegistryItemDTO.class);
    }
    
}