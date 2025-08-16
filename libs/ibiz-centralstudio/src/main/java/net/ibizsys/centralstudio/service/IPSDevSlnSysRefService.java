package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnSysRefService{

    PSDevSlnSysRefDTO create(PSDevSlnSysRefDTO arg) throws Throwable;

    PSDevSlnSysRefDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnSysRefDTO update(PSDevSlnSysRefDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnSysRefDTO arg) throws Throwable;

    PSDevSlnSysRefDTO getDraft(PSDevSlnSysRefDTO arg) throws Throwable;

    Page<PSDevSlnSysRefDTO> fetchDefault(PSDevSlnSysRefFilter filter) throws Throwable;
    
}