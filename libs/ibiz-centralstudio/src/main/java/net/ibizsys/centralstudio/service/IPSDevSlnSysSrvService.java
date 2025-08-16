package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnSysSrvService{

    PSDevSlnSysSrvDTO create(PSDevSlnSysSrvDTO arg) throws Throwable;

    PSDevSlnSysSrvDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnSysSrvDTO update(PSDevSlnSysSrvDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnSysSrvDTO arg) throws Throwable;

    PSDevSlnSysSrvDTO getDraft(PSDevSlnSysSrvDTO arg) throws Throwable;

    Page<PSDevSlnSysSrvDTO> fetchDefault(PSDevSlnSysSrvFilter filter) throws Throwable;
    
}