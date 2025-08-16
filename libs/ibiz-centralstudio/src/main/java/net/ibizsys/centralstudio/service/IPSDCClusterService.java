package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCClusterService{

    PSDCClusterDTO create(PSDCClusterDTO arg) throws Throwable;

    PSDCClusterDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCClusterDTO update(PSDCClusterDTO arg) throws Throwable;

    Integer checkKey(PSDCClusterDTO arg) throws Throwable;

    PSDCClusterDTO getDraft(PSDCClusterDTO arg) throws Throwable;

    Page<PSDCClusterDTO> fetchCurDC(PSDCClusterFilter filter) throws Throwable;
    
    Page<PSDCClusterDTO> fetchDefault(PSDCClusterFilter filter) throws Throwable;
    
}