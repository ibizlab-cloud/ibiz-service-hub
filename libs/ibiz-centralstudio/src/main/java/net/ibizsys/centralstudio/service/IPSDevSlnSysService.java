package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDevSlnSysService{

    PSDevSlnSysDTO create(PSDevSlnSysDTO arg) throws Throwable;

    PSDevSlnSysDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDevSlnSysDTO update(PSDevSlnSysDTO arg) throws Throwable;

    void addBackupSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    void addExportSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    void addImportSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    void addOfflineSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    void addOnlineSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    void addRestoreSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    void addUpgrateSysModelTask(PSDevSlnSysDTO arg) throws Throwable;

    Integer checkKey(PSDevSlnSysDTO arg) throws Throwable;

    PSDevSlnSysDTO createByModelRepo(PSDevSlnSysDTO arg) throws Throwable;

    PSDevSlnSysDTO getDraft(PSDevSlnSysDTO arg) throws Throwable;

    PSDevSlnSysDTO getWithAllRepoInfo(String arg) throws Throwable;

    void initSysModel(PSDevSlnSysDTO arg) throws Throwable;

    Page<PSDevSlnSysDTO> fetchCurSln(PSDevSlnSysFilter filter) throws Throwable;
    
    Page<PSDevSlnSysDTO> fetchCurSlnTrunk(PSDevSlnSysFilter filter) throws Throwable;
    
    Page<PSDevSlnSysDTO> fetchCurSysBranch(PSDevSlnSysFilter filter) throws Throwable;
    
    Page<PSDevSlnSysDTO> fetchCurUser(PSDevSlnSysFilter filter) throws Throwable;
    
    Page<PSDevSlnSysDTO> fetchCurUserTrunk(PSDevSlnSysFilter filter) throws Throwable;
    
}