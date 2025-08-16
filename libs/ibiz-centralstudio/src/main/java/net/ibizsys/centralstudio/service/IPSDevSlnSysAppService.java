package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnSysAppService{

    PSDevSlnSysAppDTO create(PSDevSlnSysAppDTO arg) throws Throwable;

    PSDevSlnSysAppDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnSysAppDTO update(PSDevSlnSysAppDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnSysAppDTO arg) throws Throwable;

    PSDevSlnSysAppDTO getDraft(PSDevSlnSysAppDTO arg) throws Throwable;

    Page<PSDevSlnSysAppDTO> fetchCurUser(PSDevSlnSysAppFilter filter) throws Throwable;
    
    Page<PSDevSlnSysAppDTO> fetchDefault(PSDevSlnSysAppFilter filter) throws Throwable;
    
}