package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCWorkspaceService{

    PSDCWorkspaceDTO create(PSDCWorkspaceDTO arg) throws Throwable;

    PSDCWorkspaceDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCWorkspaceDTO update(PSDCWorkspaceDTO arg) throws Throwable;

    Integer checkKey(PSDCWorkspaceDTO arg) throws Throwable;

    PSDCWorkspaceDTO getDraft(PSDCWorkspaceDTO arg) throws Throwable;

    void installSys(PSDCWorkspaceDTO arg) throws Throwable;

    PSDCWorkspaceDTO uninstallSys(PSDCWorkspaceDTO arg) throws Throwable;

    Page<PSDCWorkspaceDTO> fetchCurDC(PSDCWorkspaceFilter filter) throws Throwable;
    
    Page<PSDCWorkspaceDTO> fetchCurSln(PSDCWorkspaceFilter filter) throws Throwable;
    
    Page<PSDCWorkspaceDTO> fetchDefault(PSDCWorkspaceFilter filter) throws Throwable;
    
}