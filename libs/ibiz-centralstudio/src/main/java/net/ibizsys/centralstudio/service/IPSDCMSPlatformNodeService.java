package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCMSPlatformNodeService{

    PSDCMSPlatformNodeDTO create(PSDCMSPlatformNodeDTO arg) throws Throwable;

    PSDCMSPlatformNodeDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCMSPlatformNodeDTO update(PSDCMSPlatformNodeDTO arg) throws Throwable;

    void assignSlnDep(PSDCMSPlatformNodeDTO arg) throws Throwable;

    Integer checkKey(PSDCMSPlatformNodeDTO arg) throws Throwable;

    PSDCMSPlatformNodeDTO createWithState(PSDCMSPlatformNodeDTO arg) throws Throwable;

    PSDCMSPlatformNodeDTO getDraft(PSDCMSPlatformNodeDTO arg) throws Throwable;

    PSDCMSPlatformNodeDTO getWithState(String arg) throws Throwable;

    void restart(PSDCMSPlatformNodeDTO arg) throws Throwable;

    void stop(PSDCMSPlatformNodeDTO arg) throws Throwable;

    PSDCMSPlatformNodeDTO updateWithState(PSDCMSPlatformNodeDTO arg) throws Throwable;

    Page<PSDCMSPlatformNodeDTO> fetchAPINode(PSDCMSPlatformNodeFilter filter) throws Throwable;
    
    Page<PSDCMSPlatformNodeDTO> fetchAppNode(PSDCMSPlatformNodeFilter filter) throws Throwable;
    
    Page<PSDCMSPlatformNodeDTO> fetchCurMSPWithState(PSDCMSPlatformNodeFilter filter) throws Throwable;
    
    Page<PSDCMSPlatformNodeDTO> fetchDefault(PSDCMSPlatformNodeFilter filter) throws Throwable;
    
}