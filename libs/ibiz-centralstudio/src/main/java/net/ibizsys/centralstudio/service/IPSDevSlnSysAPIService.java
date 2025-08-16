package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnSysAPIService{

    PSDevSlnSysAPIDTO create(PSDevSlnSysAPIDTO arg) throws Throwable;

    PSDevSlnSysAPIDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnSysAPIDTO update(PSDevSlnSysAPIDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnSysAPIDTO arg) throws Throwable;

    PSDevSlnSysAPIDTO getDraft(PSDevSlnSysAPIDTO arg) throws Throwable;

    void initTestProjects(PSDevSlnSysAPIDTO arg) throws Throwable;

    void runModelTestProject(PSDevSlnSysAPIDTO arg) throws Throwable;

    void runUnitTestProject(PSDevSlnSysAPIDTO arg) throws Throwable;

    Page<PSDevSlnSysAPIDTO> fetchCurUser(PSDevSlnSysAPIFilter filter) throws Throwable;
    
    Page<PSDevSlnSysAPIDTO> fetchDefault(PSDevSlnSysAPIFilter filter) throws Throwable;
    
}