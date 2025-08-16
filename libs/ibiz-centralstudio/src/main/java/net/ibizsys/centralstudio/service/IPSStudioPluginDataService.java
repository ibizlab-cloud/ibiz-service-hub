package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSStudioPluginDataService{

    PSStudioPluginDataDTO create(PSStudioPluginDataDTO arg) throws Throwable;

    PSStudioPluginDataDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSStudioPluginDataDTO update(PSStudioPluginDataDTO arg) throws Throwable;

    Integer checkKey(PSStudioPluginDataDTO arg) throws Throwable;

    void executeAgain(PSStudioPluginDataDTO arg) throws Throwable;

    void executePlugin(PSStudioPluginDataDTO arg) throws Throwable;

    PSStudioPluginDataDTO getDraft(PSStudioPluginDataDTO arg) throws Throwable;

    Page<PSStudioPluginDataDTO> fetchDefault(PSStudioPluginDataFilter filter) throws Throwable;
    
}