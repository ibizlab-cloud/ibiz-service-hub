package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnService{

    PSDevSlnDTO create(PSDevSlnDTO arg) throws Throwable;

    PSDevSlnDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnDTO update(PSDevSlnDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnDTO arg) throws Throwable;

    PSDevSlnDTO getDraft(PSDevSlnDTO arg) throws Throwable;

    void pubMSDConfig(PSDevSlnDTO arg) throws Throwable;

    Page<PSDevSlnDTO> fetchCurDC(PSDevSlnFilter filter) throws Throwable;
    
    Page<PSDevSlnDTO> fetchCurDCSLNUser(PSDevSlnFilter filter) throws Throwable;
    
}