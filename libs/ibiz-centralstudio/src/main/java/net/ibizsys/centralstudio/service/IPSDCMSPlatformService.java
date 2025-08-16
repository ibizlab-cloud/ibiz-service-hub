package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCMSPlatformService{

    PSDCMSPlatformDTO create(PSDCMSPlatformDTO arg) throws Throwable;

    PSDCMSPlatformDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCMSPlatformDTO update(PSDCMSPlatformDTO arg) throws Throwable;

    Integer checkKey(PSDCMSPlatformDTO arg) throws Throwable;

    PSDCMSPlatformDTO getDraft(PSDCMSPlatformDTO arg) throws Throwable;

    void pubConfig(PSDCMSPlatformDTO arg) throws Throwable;

    Page<PSDCMSPlatformDTO> fetchCurDC(PSDCMSPlatformFilter filter) throws Throwable;
    
    Page<PSDCMSPlatformDTO> fetchCurSln(PSDCMSPlatformFilter filter) throws Throwable;
    
    Page<PSDCMSPlatformDTO> fetchDefault(PSDCMSPlatformFilter filter) throws Throwable;
    
}