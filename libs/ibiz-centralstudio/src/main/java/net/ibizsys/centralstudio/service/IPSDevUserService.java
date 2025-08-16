package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevUserService{

    PSDevUserDTO create(PSDevUserDTO arg) throws Throwable;

    PSDevUserDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevUserDTO update(PSDevUserDTO arg) throws Throwable;

    Integer checkKey(PSDevUserDTO arg) throws Throwable;

    PSDevUserDTO getDraft(PSDevUserDTO arg) throws Throwable;

    Page<PSDevUserDTO> fetchCurDC(PSDevUserFilter filter) throws Throwable;
    
    Page<PSDevUserDTO> fetchDefault(PSDevUserFilter filter) throws Throwable;
    
}