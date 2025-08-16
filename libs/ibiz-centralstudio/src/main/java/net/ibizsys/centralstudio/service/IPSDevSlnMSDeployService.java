package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnMSDeployService{

    PSDevSlnMSDeployDTO create(PSDevSlnMSDeployDTO arg) throws Throwable;

    PSDevSlnMSDeployDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnMSDeployDTO update(PSDevSlnMSDeployDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnMSDeployDTO arg) throws Throwable;

    PSDevSlnMSDeployDTO getDraft(PSDevSlnMSDeployDTO arg) throws Throwable;

    void pubConfig(PSDevSlnMSDeployDTO arg) throws Throwable;

    Page<PSDevSlnMSDeployDTO> fetchCurDC(PSDevSlnMSDeployFilter filter) throws Throwable;
    
    Page<PSDevSlnMSDeployDTO> fetchCurSln(PSDevSlnMSDeployFilter filter) throws Throwable;
    
    Page<PSDevSlnMSDeployDTO> fetchDefault(PSDevSlnMSDeployFilter filter) throws Throwable;
    
}