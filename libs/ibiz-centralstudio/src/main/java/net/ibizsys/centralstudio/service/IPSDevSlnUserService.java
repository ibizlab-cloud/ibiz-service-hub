package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnUserService{

    PSDevSlnUserDTO create(PSDevSlnUserDTO arg) throws Throwable;

    PSDevSlnUserDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnUserDTO update(PSDevSlnUserDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnUserDTO arg) throws Throwable;

    PSDevSlnUserDTO getDraft(PSDevSlnUserDTO arg) throws Throwable;

    Page<PSDevSlnUserDTO> fetchByDevUser(PSDevSlnUserFilter filter) throws Throwable;
    
    Page<PSDevSlnUserDTO> fetchCurSln(PSDevSlnUserFilter filter) throws Throwable;
    
    Page<PSDevSlnUserDTO> fetchDefault(PSDevSlnUserFilter filter) throws Throwable;
    
}