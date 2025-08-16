package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevCenterSVNService{

    PSDevCenterSVNDTO create(PSDevCenterSVNDTO arg) throws Throwable;

    PSDevCenterSVNDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevCenterSVNDTO update(PSDevCenterSVNDTO arg) throws Throwable;

    Integer checkKey(PSDevCenterSVNDTO arg) throws Throwable;

    PSDevCenterSVNDTO getDraft(PSDevCenterSVNDTO arg) throws Throwable;

    Page<PSDevCenterSVNDTO> fetchCurDC(PSDevCenterSVNFilter filter) throws Throwable;
    
    Page<PSDevCenterSVNDTO> fetchCurDC2(PSDevCenterSVNFilter filter) throws Throwable;
    
    Page<PSDevCenterSVNDTO> fetchCurSln(PSDevCenterSVNFilter filter) throws Throwable;
    
    Page<PSDevCenterSVNDTO> fetchCurSln2(PSDevCenterSVNFilter filter) throws Throwable;
    
    Page<PSDevCenterSVNDTO> fetchDefault(PSDevCenterSVNFilter filter) throws Throwable;
    
}