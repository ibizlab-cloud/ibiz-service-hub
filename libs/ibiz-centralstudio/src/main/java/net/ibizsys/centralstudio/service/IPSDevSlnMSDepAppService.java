package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnMSDepAppService{

    PSDevSlnMSDepAppDTO create(PSDevSlnMSDepAppDTO arg) throws Throwable;

    PSDevSlnMSDepAppDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnMSDepAppDTO update(PSDevSlnMSDepAppDTO arg) throws Throwable;

    void batchAdd(PSDevSlnMSDepAppDTO arg) throws Throwable;

    void calcHttpAddress(PSDevSlnMSDepAppDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnMSDepAppDTO arg) throws Throwable;

    PSDevSlnMSDepAppDTO getDraft(PSDevSlnMSDepAppDTO arg) throws Throwable;

    void restart(PSDevSlnMSDepAppDTO arg) throws Throwable;

    void stop(PSDevSlnMSDepAppDTO arg) throws Throwable;

    Page<PSDevSlnMSDepAppDTO> fetchCurSlnUnused(PSDevSlnMSDepAppFilter filter) throws Throwable;
    
    Page<PSDevSlnMSDepAppDTO> fetchDefault(PSDevSlnMSDepAppFilter filter) throws Throwable;
    
}