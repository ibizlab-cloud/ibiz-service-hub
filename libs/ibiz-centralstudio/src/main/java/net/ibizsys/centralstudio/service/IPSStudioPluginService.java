package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSStudioPluginService{

    PSStudioPluginDTO create(PSStudioPluginDTO arg) throws Throwable;

    PSStudioPluginDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSStudioPluginDTO update(PSStudioPluginDTO arg) throws Throwable;

    Integer checkKey(PSStudioPluginDTO arg) throws Throwable;

    PSStudioPluginDTO getDraft(PSStudioPluginDTO arg) throws Throwable;

    Page<PSStudioPluginDTO> fetchCurDCAllValid(PSStudioPluginFilter filter) throws Throwable;
    
    Page<PSStudioPluginDTO> fetchCurDCValid(PSStudioPluginFilter filter) throws Throwable;
    
    Page<PSStudioPluginDTO> fetchDefault(PSStudioPluginFilter filter) throws Throwable;
    
    Page<PSStudioPluginDTO> fetchValid(PSStudioPluginFilter filter) throws Throwable;
    
}