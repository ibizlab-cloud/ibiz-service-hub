package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevCenterDBInstService{

    PSDevCenterDBInstDTO create(PSDevCenterDBInstDTO arg) throws Throwable;

    PSDevCenterDBInstDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevCenterDBInstDTO update(PSDevCenterDBInstDTO arg) throws Throwable;

    Integer checkKey(PSDevCenterDBInstDTO arg) throws Throwable;

    PSDevCenterDBInstDTO getDraft(PSDevCenterDBInstDTO arg) throws Throwable;

    void syncDBScheme(PSDevCenterDBInstDTO arg) throws Throwable;

    Page<PSDevCenterDBInstDTO> fetchCurDC(PSDevCenterDBInstFilter filter) throws Throwable;
    
    Page<PSDevCenterDBInstDTO> fetchCurSln(PSDevCenterDBInstFilter filter) throws Throwable;
    
    Page<PSDevCenterDBInstDTO> fetchDefault(PSDevCenterDBInstFilter filter) throws Throwable;
    
}