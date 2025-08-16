package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnSysBakService{

    PSDevSlnSysBakDTO create(PSDevSlnSysBakDTO arg) throws Throwable;

    PSDevSlnSysBakDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnSysBakDTO update(PSDevSlnSysBakDTO arg) throws Throwable;

    void addRestoreSysModelTask2(PSDevSlnSysBakDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnSysBakDTO arg) throws Throwable;

    PSDevSlnSysBakDTO getDraft(PSDevSlnSysBakDTO arg) throws Throwable;

    Page<PSDevSlnSysBakDTO> fetchDefault(PSDevSlnSysBakFilter filter) throws Throwable;
    
}