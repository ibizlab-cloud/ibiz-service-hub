package net.ibizsys.centralstudio.service;

import java.util.List;
import org.springframework.data.domain.Page;

import net.ibizsys.centralstudio.dto.*;
import net.ibizsys.centralstudio.filter.*;



public interface IPSDCRegistryItemService{

    PSDCRegistryItemDTO create(PSDCRegistryItemDTO arg) throws Throwable;

    PSDCRegistryItemDTO get(String arg) throws Throwable;

    void remove(List<String> arg) throws Throwable;

    PSDCRegistryItemDTO update(PSDCRegistryItemDTO arg) throws Throwable;

    Integer checkKey(PSDCRegistryItemDTO arg) throws Throwable;

    PSDCRegistryItemDTO getDraft(PSDCRegistryItemDTO arg) throws Throwable;

    void runImage(PSDCRegistryItemDTO arg) throws Throwable;

    Page<PSDCRegistryItemDTO> fetchCurDC(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchCurDC2(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchCurDCAndSln(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchCurDCRunner(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchCurDCRunner2(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchCurSln(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchDefault(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchRunner(PSDCRegistryItemFilter filter) throws Throwable;
    
    Page<PSDCRegistryItemDTO> fetchTool(PSDCRegistryItemFilter filter) throws Throwable;
    
}