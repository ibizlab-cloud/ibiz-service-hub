package net.ibizsys.centralstudio.service.impl;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;
import net.ibizsys.centralstudio.util.CentralServiceImplBase;



public class PSDCClusterServiceImpl extends CentralServiceImplBase implements net.ibizsys.centralstudio.service.IPSDCClusterService{

    @Override
    public PSDCClusterDTO create(PSDCClusterDTO arg) throws Throwable{
        return this.executePost("/psdcclusters", arg, PSDCClusterDTO.class);
    }

    @Override
    public PSDCClusterDTO get(String arg) throws Throwable{
        return this.executeGet("/psdcclusters/{key}", arg, PSDCClusterDTO.class);
    }

    @Override
    public void remove(List<String> arg) throws Throwable{
        this.executeDelete("/psdcclusters/{key}", arg, String.class);
        return;
    }

    @Override
    public PSDCClusterDTO update(PSDCClusterDTO arg) throws Throwable{
        return this.executePut("/psdcclusters/{key}", arg, PSDCClusterDTO.class);
    }

    @Override
    public Integer checkKey(PSDCClusterDTO arg) throws Throwable{
        return this.executePost("/psdcclusters/checkkey", arg, Integer.class);
    }

    @Override
    public PSDCClusterDTO getDraft(PSDCClusterDTO arg) throws Throwable{
        return this.executeGet("/psdcclusters/getdraft", arg, PSDCClusterDTO.class);
    }

    @Override
    public Page<PSDCClusterDTO> fetchCurDC(PSDCClusterFilter filter) throws Throwable{

        return this.executeFetch("/psdcclusters/fetchcurdc", filter, PSDCClusterDTO.class);
    }
    
    @Override
    public Page<PSDCClusterDTO> fetchDefault(PSDCClusterFilter filter) throws Throwable{

        return this.executeFetch("/psdcclusters/fetchdefault", filter, PSDCClusterDTO.class);
    }
    
}