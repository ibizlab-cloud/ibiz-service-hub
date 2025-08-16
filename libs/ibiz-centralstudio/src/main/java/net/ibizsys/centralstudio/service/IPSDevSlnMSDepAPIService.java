package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnMSDepAPIService{

    PSDevSlnMSDepAPIDTO create(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    PSDevSlnMSDepAPIDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnMSDepAPIDTO update(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    void batchAdd(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    PSDevSlnMSDepAPIDTO getDraft(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    void restart(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    void stop(PSDevSlnMSDepAPIDTO arg) throws Throwable;

    Page<PSDevSlnMSDepAPIDTO> fetchCurSlnUnused(PSDevSlnMSDepAPIFilter filter) throws Throwable;
    
    Page<PSDevSlnMSDepAPIDTO> fetchDefault(PSDevSlnMSDepAPIFilter filter) throws Throwable;
    
}