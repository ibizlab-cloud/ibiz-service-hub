package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnTemplService{

    PSDevSlnTemplDTO create(PSDevSlnTemplDTO arg) throws Throwable;

    PSDevSlnTemplDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnTemplDTO update(PSDevSlnTemplDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnTemplDTO arg) throws Throwable;

    PSDevSlnTemplDTO getDraft(PSDevSlnTemplDTO arg) throws Throwable;

    void pubTempl(PSDevSlnTemplDTO arg) throws Throwable;

    Page<PSDevSlnTemplDTO> fetchCurSln(PSDevSlnTemplFilter filter) throws Throwable;
    
    Page<PSDevSlnTemplDTO> fetchCurUser(PSDevSlnTemplFilter filter) throws Throwable;
    
    Page<PSDevSlnTemplDTO> fetchCurUser3(PSDevSlnTemplFilter filter) throws Throwable;
    
    Page<PSDevSlnTemplDTO> fetchCurUser4(PSDevSlnTemplFilter filter) throws Throwable;
    
    Page<PSDevSlnTemplDTO> fetchCurUserAll(PSDevSlnTemplFilter filter) throws Throwable;
    
}