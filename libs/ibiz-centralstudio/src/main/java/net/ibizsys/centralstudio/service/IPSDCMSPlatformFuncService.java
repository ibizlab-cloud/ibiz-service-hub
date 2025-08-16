package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCMSPlatformFuncService{

    PSDCMSPlatformFuncDTO create(PSDCMSPlatformFuncDTO arg) throws Throwable;

    PSDCMSPlatformFuncDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCMSPlatformFuncDTO update(PSDCMSPlatformFuncDTO arg) throws Throwable;

    Integer checkKey(PSDCMSPlatformFuncDTO arg) throws Throwable;

    PSDCMSPlatformFuncDTO getDraft(PSDCMSPlatformFuncDTO arg) throws Throwable;

    Page<PSDCMSPlatformFuncDTO> fetchDefault(PSDCMSPlatformFuncFilter filter) throws Throwable;
    
}