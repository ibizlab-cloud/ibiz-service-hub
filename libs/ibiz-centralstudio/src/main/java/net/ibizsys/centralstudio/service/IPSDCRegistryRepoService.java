package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCRegistryRepoService{

    PSDCRegistryRepoDTO create(PSDCRegistryRepoDTO arg) throws Throwable;

    PSDCRegistryRepoDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCRegistryRepoDTO update(PSDCRegistryRepoDTO arg) throws Throwable;

    Integer checkKey(PSDCRegistryRepoDTO arg) throws Throwable;

    PSDCRegistryRepoDTO getDraft(PSDCRegistryRepoDTO arg) throws Throwable;

    Page<PSDCRegistryRepoDTO> fetchCurDC(PSDCRegistryRepoFilter filter) throws Throwable;
    
    Page<PSDCRegistryRepoDTO> fetchDefault(PSDCRegistryRepoFilter filter) throws Throwable;
    
}